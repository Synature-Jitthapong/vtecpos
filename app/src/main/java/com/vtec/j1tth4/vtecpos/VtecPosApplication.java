package com.vtec.j1tth4.vtecpos;

import android.app.Application;

/**
 * Created by j1tth4 on 25/3/2558.
 */
public class VtecPosApplication extends Application {

    public static final String VTEC_ROOT_DIR = "vtecpos";

    public static final String VTEC_DATABASE_DIR = "database";

    public static final String ISO_DATE_FORMAT = "yyyy-MM-dd";
    public static final String TIME_FORMAT = "HH:mm:ss";
    public static final String ISO_DATE_TIME_FORMAT = ISO_DATE_FORMAT + " " + TIME_FORMAT;

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
