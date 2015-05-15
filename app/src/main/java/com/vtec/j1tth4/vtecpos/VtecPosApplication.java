package com.vtec.j1tth4.vtecpos;

import android.app.Application;
import android.os.Environment;

import com.vtec.j1tth4.vtecpos.provider.GlobalProperty;
import com.vtec.j1tth4.vtecpos.provider.GlobalPropertyDataSource;
import com.vtec.j1tth4.vtecpos.provider.Shop;
import com.vtec.j1tth4.vtecpos.provider.ShopDataSource;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * Created by j1tth4 on 25/3/2558.
 */
public class VtecPosApplication extends Application {

    public static final String VTEC_ROOT_DIR = "vtecpos";

    public static final String VTEC_DATABASE_DIR = "database";

    public static final String ISO_DATE_FORMAT = "yyyy-MM-dd";
    public static final String TIME_FORMAT = "HH:mm:ss";
    public static final String ISO_DATE_TIME_FORMAT = ISO_DATE_FORMAT + " " + TIME_FORMAT;

    public static int sRoundingDigit = 2;
    public static int sVatDigit = 2;
    public static double sScPercent = 7.0d;
    public static boolean sIsCalVatWhenZeroBill = false;
    public static boolean sIsScBeforeDisc = false;

    @Override
    public void onCreate() {
        super.onCreate();
        setup();
    }

    private void setup(){
        ShopDataSource shopDataSource = new ShopDataSource(getApplicationContext());
        Shop s = shopDataSource.loadVatShopData(0);
        if(s.getIsSCBeforeDisc() == 1) sIsScBeforeDisc = true;
        sScPercent = s.getSCPercent();

        GlobalPropertyDataSource globalProperty = new GlobalPropertyDataSource(getApplicationContext());
        List<GlobalProperty> gbl = globalProperty.listProgramProperty();
        for(GlobalProperty gb : gbl) {
            switch (gb.getPropertyID()) {
                case GlobalPropertyDataSource.CAL_VAT_WHEN_ZERO_BILL_PROPERTY:
                    if (gb.getPropertyValue() == 1) sIsCalVatWhenZeroBill = true;
                    break;
                case GlobalPropertyDataSource.VAT_DIGIT_PROPERTY:
                    sVatDigit = gb.getPropertyValue();
                    break;
            }
        }
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
