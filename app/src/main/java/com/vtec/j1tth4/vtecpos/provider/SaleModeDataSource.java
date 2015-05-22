package com.vtec.j1tth4.vtecpos.provider;

import android.content.Context;
import android.database.Cursor;

/**
 * Created by j1tth4 on 19/5/2558.
 */
public class SaleModeDataSource {
    public static final String TABLE_SALE_MODE = "SaleMode";
    public static final String SALE_MODE_ID = "SaleModeID";
    public static final String SALE_MODE_NAME = "SaleModeName";
    public static final String DELETED = "Deleted";
    public static final String POSITION_PREFIX = "PositionPrefix";
    public static final String PREFIX_TEXT = "PrefixText";
    public static final String PREFIX_TEXT_PRINTING = "PrefixTextPrinting";
    public static final String PREFIX_QUEUE = "PrefixQueue";
    public static final String RECEIPT_HEADER_TEXT = "ReceiptHeaderText";
    public static final String HAS_SERVICE_CHARGE = "HasServiceCharge";

    private DatabaseHelper mDbHelper;

    public SaleModeDataSource(Context c){
        mDbHelper = DatabaseHelper.getInstance(c);
    }

    public SaleMode getSaleMode(int saleModeId){
        Cursor cursor = mDbHelper.getWritableDatabase().rawQuery(
                "select * from " + TABLE_SALE_MODE +
                        " where " + SALE_MODE_ID + "=?" +
                        " and " + DELETED + "=?",
                new String[]{
                        String.valueOf(saleModeId),
                        "0"
                });
        SaleMode saleMode = null;
        if(cursor.moveToFirst()){
            saleMode = new SaleMode();
            saleMode.setSaleModeID(cursor.getInt(cursor.getColumnIndex(SALE_MODE_ID)));
            saleMode.setSaleModeName(cursor.getString(cursor.getColumnIndex(SALE_MODE_NAME)));
            saleMode.setPositionPrefix(cursor.getInt(cursor.getColumnIndex(POSITION_PREFIX)));
            saleMode.setPrefixText(cursor.getString(cursor.getColumnIndex(PREFIX_TEXT)));
            saleMode.setPrefixTextPrinting(cursor.getString(cursor.getColumnIndex(PREFIX_TEXT_PRINTING)));
            saleMode.setPrefixQueue(cursor.getString(cursor.getColumnIndex(PREFIX_QUEUE)));
            saleMode.setReceiptHeaderText(cursor.getString(cursor.getColumnIndex(RECEIPT_HEADER_TEXT)));
            saleMode.setHasServiceCharge(cursor.getInt(cursor.getColumnIndex(HAS_SERVICE_CHARGE)));
        }
        cursor.close();
        return saleMode;
    }
}
