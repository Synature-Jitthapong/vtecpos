package com.vtec.j1tth4.vtecpos.provider;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by j1tth4 on 12/5/2558.
 */
public class GlobalPropertyDataSource {

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

    private DatabaseHelper mDbHelper;

    public GlobalPropertyDataSource(Context c){
        mDbHelper = DatabaseHelper.getInstance(c);
    }

    public List<GlobalProperty> listProgramProperty(){
        Cursor cursor = mDbHelper.getWritableDatabase().rawQuery(
                "select * from " + TABLE_PROGRAM_PROPERTY_VALUE, null);
        List<GlobalProperty> gbl = null;
        if(cursor.moveToFirst()){
            gbl = new ArrayList<>();
            while (!cursor.isAfterLast()){
                GlobalProperty gb = new GlobalProperty();
                gb.setPropertyID(cursor.getInt(cursor.getColumnIndex(PROPERTY_ID)));
                gb.setPropertyValue(cursor.getInt(cursor.getColumnIndex(PROPERTY_VALUE)));
                gbl.add(gb);
                cursor.moveToNext();
            }
        }
        cursor.close();
        return gbl;
    }
}
