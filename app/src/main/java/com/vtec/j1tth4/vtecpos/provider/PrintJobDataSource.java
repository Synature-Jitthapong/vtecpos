package com.vtec.j1tth4.vtecpos.provider;

import android.content.ContentValues;
import android.content.Context;

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

    public void insertPrintJob(OrderPrintJob job){
        ContentValues cv = new ContentValues();
        cv.put(TransactionDataSource.TRANSACTION_ID, job.getTransactionID());
        cv.put(TransactionDataSource.COMPUTER_ID, job.getComputerID());
        cv.put(TransactionDataSource.ORDER_DETAIL_ID, job.getOrderDetailID());
        cv.put(PRINT_NO, job.getPrintNo());
        cv.put(PRINTER_ID, job.getPrinterID());
        cv.put(IS_PRINT_SUMMARY, job.getIsPrintSummary());
        cv.put(INSERT_DATE_TIME, Utils.getISODateTime());
        cv.putNull(PRINT_DATE_TIME);

    }
}
