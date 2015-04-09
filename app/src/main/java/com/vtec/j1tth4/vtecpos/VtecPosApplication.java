package com.vtec.j1tth4.vtecpos;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;

import com.vtec.j1tth4.vtecpos.dao.DaoMaster;
import com.vtec.j1tth4.vtecpos.dao.DaoSession;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

/**
 * Created by j1tth4 on 25/3/2558.
 */
public class VtecPosApplication extends Application {

    public static final String DATABASE_NAME = "vtecpos.db";

    public static final String VTEC_ROOT_DIR = "vtecpos";

    public static final String VTEC_DATABASE_DIR = "database";

    private static String sDatabasePath;

    private DaoSession mDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        sDatabasePath = getVtecAssetPath() + File.separator + VTEC_DATABASE_DIR + File.separator + DATABASE_NAME;

        setupDatabase();
    }

    private void setupDatabase(){
        SQLiteDatabase db = openDatabase(getApplicationContext());
        DaoMaster daoMaster = new DaoMaster(db);
        mDaoSession = daoMaster.newSession();
    }

    public DaoSession getDaoSession(){
        return mDaoSession;
    }

    public static SQLiteDatabase openDatabase(Context c){
        SQLiteDatabase db = null;
        if(!isDataBaseExist()){
            try {
                copyDatabase(c);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        db = SQLiteDatabase.openDatabase(sDatabasePath, null, SQLiteDatabase.OPEN_READWRITE);
        return db;
    }

    private static void copyDatabase(Context c) throws IOException {
        InputStream mInput = c.getAssets().open(DATABASE_NAME);
        OutputStream mOutput = new FileOutputStream(sDatabasePath);
        byte[] mBuffer = new byte[1024];
        int mLength;
        while ((mLength = mInput.read(mBuffer))>0)
        {
            mOutput.write(mBuffer, 0, mLength);
        }
        mOutput.flush();
        mOutput.close();
        mInput.close();
    }

    private static boolean isDataBaseExist() {
        File vtecAssetPath = VtecPosApplication.getVtecAssetPath();
        File dbPath = new File(vtecAssetPath + File.separator + VtecPosApplication.VTEC_DATABASE_DIR);
        if(!dbPath.exists())
            dbPath.mkdir();
        File dbFile = new File(dbPath + File.separator + VtecPosApplication.DATABASE_NAME);
        return dbFile.exists();
    }

    public static File getVtecAssetPath(){
        File sdcard = Environment.getExternalStorageDirectory();
        File assetPath = new File(sdcard + File.separator + VTEC_ROOT_DIR);
        if(!assetPath.exists())
            assetPath.mkdirs();
        return assetPath;
    }
}
