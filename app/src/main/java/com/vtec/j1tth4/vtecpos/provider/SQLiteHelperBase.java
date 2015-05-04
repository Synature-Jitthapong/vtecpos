package com.vtec.j1tth4.vtecpos.provider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by j1tth4 on 5/1/15 AD.
 */
public class SQLiteHelperBase {
    private DatabaseHelper mHelper;

    public SQLiteHelperBase(Context c){
        mHelper = DatabaseHelper.getInstance(c.getApplicationContext());
    }

    protected SQLiteDatabase openReadable(){
        return mHelper.openReadable();
    }

    protected SQLiteDatabase openWritable(){
        return mHelper.openWritable();
    }
}
