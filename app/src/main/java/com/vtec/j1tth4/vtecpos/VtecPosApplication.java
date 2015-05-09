package com.vtec.j1tth4.vtecpos;

import android.app.Application;
import android.os.Environment;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by j1tth4 on 25/3/2558.
 */
public class VtecPosApplication extends Application {

    public static final String VTEC_ROOT_DIR = "vtecpos";

    public static final String VTEC_DATABASE_DIR = "database";

    public static final String ISO_DATE_FORMAT = "yyyy-MM-dd";
    public static final String TIME_FORMAT = "HH:mm:ss";
    public static final String ISO_DATE_TIME_FORMAT = ISO_DATE_FORMAT + " " + TIME_FORMAT;

    public static final int ROUND_DIGIT = 2;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static String getISODate(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat(ISO_DATE_FORMAT);
        return dateTimeFormat.format(calendar.getTime());
    }

    public static String getISODateTime(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat(ISO_DATE_TIME_FORMAT);
        return dateTimeFormat.format(calendar.getTime());
    }

    public static File getVtecAssetPath(){
        File sdcard = Environment.getExternalStorageDirectory();
        File assetPath = new File(sdcard + File.separator + VTEC_ROOT_DIR);
        if(!assetPath.exists())
            assetPath.mkdirs();
        return assetPath;
    }
}
