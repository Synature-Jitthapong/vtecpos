package com.vtec.j1tth4.vtecpos;

import android.content.Context;
import android.os.Environment;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by j1tth4 on 5/7/15.
 */
public class Utils {

    public static double round(double value, int scale){
        if(scale < 0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(scale, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public static double parseDouble(CharSequence text){
        double value = 0.0d;
        try {
            NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
            Number num = format.parse(text.toString());
            value = num.doubleValue();
        } catch (ParseException e) {}
        return value;
    }

    public static String currencyFormat(Context c, double value){
        DecimalFormat format
                = new DecimalFormat(GlobalPropertyManager.getInstance(c).getCurrencyFormat());
        return format.format(value);
    }

    public static String qtyFormat(Context c, double value){
        DecimalFormat format
                = new DecimalFormat(GlobalPropertyManager.getInstance(c).getQtyFormat());
        return format.format(value);
    }

    public static String getISODate(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat(VtecPosApplication.ISO_DATE_FORMAT);
        return dateTimeFormat.format(calendar.getTime());
    }

    public static String getISODateTime(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat(VtecPosApplication.ISO_DATE_TIME_FORMAT);
        return dateTimeFormat.format(calendar.getTime());
    }

    public static File getVtecAssetPath(){
        File sdcard = Environment.getExternalStorageDirectory();
        File assetPath = new File(sdcard + File.separator + VtecPosApplication.VTEC_ROOT_DIR);
        if(!assetPath.exists())
            assetPath.mkdirs();
        return assetPath;
    }
}
