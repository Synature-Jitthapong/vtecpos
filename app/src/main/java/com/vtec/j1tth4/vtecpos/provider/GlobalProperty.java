package com.vtec.j1tth4.vtecpos.provider;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

/**
 * Created by j1tth4 on 12/5/2558.
 */
public class GlobalProperty {

    public static final String TABLE_PROGRAM_PROPERTY_VALUE = "ProgramPropertyvalue";
    public static final String PROPERTY_ID = "PropertyID";
    public static final String KEY_ID = "KeyID";
    public static final String PROPERTY_VALUE = "PropertyValue";
    public static final String PROPERTY_TEXT_VALUE = "PropertyTextValue";
    public static final String PROPERTY_DATE_VALUE = "PropertyDateValue";
    public static final String PROPERTY_DECIMAL_VALUE = "PropertyDecimalValue";
    public static final String UPDATE_STAFF_ID = "UpdateStaffID";
    public static final String UPDATE_DATE = "UpdateDate";

    public static final int CAL_VAT_WHEN_ZERO_BILL_PROPERTY = 5;
    public static final int VAT_DIGIT_PROPERTY = 25;

    private boolean calVatWhenZeroBill = false;
    private int vatDigit = 2;

    private DatabaseHelper mDbHelper;

    public GlobalProperty(Context c){
        mDbHelper = new DatabaseHelper(c);
    }

    public void loadProgramProperty(){
        Cursor cursor = mDbHelper.openReadable().rawQuery(
                "select * from " + TABLE_PROGRAM_PROPERTY_VALUE, null);
        if(cursor.moveToFirst()){
            while (!cursor.isAfterLast()){
                int value = cursor.getInt(cursor.getColumnIndex(PROPERTY_VALUE));
                switch(cursor.getInt(cursor.getColumnIndex(PROPERTY_ID))) {
                    case CAL_VAT_WHEN_ZERO_BILL_PROPERTY:
                        if(value == 1) calVatWhenZeroBill = true;
                        break;
                    case VAT_DIGIT_PROPERTY:
                        vatDigit = value;
                        break;
                }
                cursor.moveToNext();
            }
        }
        cursor.close();
    }

    public boolean isCalVatWhenZeroBill() {
        return calVatWhenZeroBill;
    }

    public int getVatDigit() {
        return vatDigit;
    }
}
