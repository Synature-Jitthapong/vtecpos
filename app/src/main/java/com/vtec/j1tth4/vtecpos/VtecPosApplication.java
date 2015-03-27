package com.vtec.j1tth4.vtecpos;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.vtec.j1tth4.vtecpos.dao.DaoMaster;
import com.vtec.j1tth4.vtecpos.dao.DaoSession;

/**
 * Created by j1tth4 on 25/3/2558.
 */
public class VtecPosApplication extends Application {

    public static final String DATABASE_NAME = "vtecpos.db";

    private DaoSession mDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        setupDatabase();
    }

    private void setupDatabase(){
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, DATABASE_NAME, null);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        mDaoSession = daoMaster.newSession();
    }

    public DaoSession getDaoSession(){
        return mDaoSession;
    }
}
