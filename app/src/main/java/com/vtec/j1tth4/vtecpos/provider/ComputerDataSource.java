package com.vtec.j1tth4.vtecpos.provider;

import android.app.ActionBar;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import de.greenrobot.dao.Property;

/**
 * Created by j1tth4 on 5/15/15.
 */
public class ComputerDataSource {

    public static final String TABLE_COMPUTER_NAME = "ComputerName";
    public static final String COMPUTER_ID = "ComputerID";
    public static final String COMPUTER_NAME = "ComputerName";
    public static final String SHOP_ID = "ShopID";
    public static final String COMPUTER_TYPE = "ComputerType";
    public static final String IP_ADDRESS = "IPAddress";
    public static final String REGISTRATION_NUMBER = "RegistrationNumber";
    public static final String DEVICE_CODE = "DeviceCode";
    public static final String KDS_ID = "KDSID";
    public static final String DESCRIPTION = "Description";
    public static final String DELETED = "Deleted";

    private DatabaseHelper mDbHelper;

    public ComputerDataSource(Context c){
        mDbHelper = DatabaseHelper.getInstance(c);
    }

    public Computer loadComputerData(){
        SQLiteDatabase db = mDbHelper.openReadable();
        Cursor cursor = db.rawQuery(
                "select * " +
                        " from " + TABLE_COMPUTER_NAME +
                        " where " + DELETED + "=?",
                new String[]{
                        "0"
                });
        Computer c = null;
        if(cursor.moveToFirst()){
            c = new Computer();
            c.setComputerID(cursor.getInt(cursor.getColumnIndex(COMPUTER_ID)));
            c.setComputerName(cursor.getString(cursor.getColumnIndex(COMPUTER_NAME)));
            c.setDeviceCode(cursor.getString(cursor.getColumnIndex(DEVICE_CODE)));
        }
        cursor.close();
        return c;
    }
}
