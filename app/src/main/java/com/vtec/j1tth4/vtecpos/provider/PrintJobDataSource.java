package com.vtec.j1tth4.vtecpos.provider;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.vtec.j1tth4.vtecpos.Utils;

/**
 * Created by j1tth4 on 5/21/15.
 */
public class PrintJobDataSource {
    public static final String TABLE_ORDER_PRINT_JOB = "orderprintjob";
    public static final String PRINT_NO = "PrintNo";
    public static final String PRINTER_ID = "PrinterID";
    public static final String IS_PRINT_SUMMARY = "IsPrintSummary";
    public static final String INSERT_DATE_TIME = "InsertDateTime";
    public static final String PRINT_DATE_TIME = "PrintDateTime";
    public static final String FINISH_DATE_TIME = "FinishDateTime";
    public static final String PRINT_FROM_COMPUTER_ID = "PrintFromComputerID";
    public static final String PRINT_STATUS = "PrintStatus";

    private DatabaseHelper mDbHelper;

    public PrintJobDataSource(Context c){
        mDbHelper = DatabaseHelper.getInstance(c);
    }

    /**
     *
     * @param job
     */
    public void updateFinishPrintJob(OrderPrintJob job){
        ContentValues cv = new ContentValues();
        cv.put(FINISH_DATE_TIME, Utils.getISODateTime());
        cv.put(PRINT_STATUS, job.getPrintStatus());
        updatePrintJob(cv, job);
    }

    /**
     *
     * @param job
     */
    public void updateStartPrintJob(OrderPrintJob job){
        ContentValues cv = new ContentValues();
        cv.put(PRINT_DATE_TIME, Utils.getISODateTime());
        updatePrintJob(cv, job);
    }

    /**
     *
     * @param cv
     * @param job
     */
    private void updatePrintJob(ContentValues cv, OrderPrintJob job){
        mDbHelper.getWritableDatabase().update(
                TABLE_ORDER_PRINT_JOB, cv,
                TransactionDataSource.TRANSACTION_ID + "=?" +
                        " and " + TransactionDataSource.COMPUTER_ID + "=?",
                new String[]{
                        String.valueOf(job.getTransactionID()),
                        String.valueOf(job.getComputerID())
                });
    }

    /**
     *
     * @param job
     */
    public void insertPrintJob(OrderPrintJob job){
        ContentValues cv = new ContentValues();
        cv.put(TransactionDataSource.TRANSACTION_ID, job.getTransactionID());
        cv.put(TransactionDataSource.COMPUTER_ID, job.getComputerID());
        cv.put(TransactionDataSource.ORDER_DETAIL_ID, job.getOrderDetailID());
        cv.put(PRINT_NO, getPrintNo(job.getTransactionID(), job.getComputerID(), job.getOrderDetailID()));
        cv.put(PRINTER_ID, job.getPrinterID());
        cv.put(IS_PRINT_SUMMARY, job.getIsPrintSummary());
        cv.put(INSERT_DATE_TIME, Utils.getISODateTime());
        cv.putNull(PRINT_DATE_TIME);
        cv.putNull(FINISH_DATE_TIME);
        cv.put(PRINT_FROM_COMPUTER_ID, job.getComputerID());
        mDbHelper.getWritableDatabase().insertOrThrow(TABLE_ORDER_PRINT_JOB, null, cv);
    }

    private int getPrintNo(int transId, int compId, int detailId){
        int printNo = 0;
        Cursor cursor = mDbHelper.getWritableDatabase().rawQuery(
                "select max(" + PRINT_NO + ")" +
                        " from " + TABLE_ORDER_PRINT_JOB +
                        " where " + TransactionDataSource.TRANSACTION_ID + "=?" +
                        " and " + TransactionDataSource.COMPUTER_ID + "=?" +
                        " and " + TransactionDataSource.ORDER_DETAIL_ID + "=?",
                new String[]{
                        String.valueOf(transId),
                        String.valueOf(compId),
                        String.valueOf(detailId)
                });
        if(cursor.moveToFirst()){
            printNo = cursor.getInt(0);
        }
        cursor.close();
        return printNo + 1;
    }
}
