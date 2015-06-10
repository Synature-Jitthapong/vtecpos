package com.vtec.j1tth4.vtecpos;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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

    public static void createConfirmDialog(Context context, CharSequence msg,
                                           DialogInterface.OnClickListener cancelCallback,
                                           DialogInterface.OnClickListener confirmCallback){
        new AlertDialog.Builder(context)
                .setMessage(msg)
                .setNegativeButton(android.R.string.cancel, cancelCallback)
                .setPositiveButton(android.R.string.ok, confirmCallback).show();
    }

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

    public static String shortDateTimeFormat(Context c){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat(GlobalPropertyManager.getInstance(c).getShortDateTimeFormat());
        return format.format(calendar.getTime());
    }

    public static String shortDateFormat(Context c){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat(GlobalPropertyManager.getInstance(c).getShortDateFormat());
        return format.format(calendar.getTime());
    }

    public static String fullDateFormat(Context c){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat(GlobalPropertyManager.getInstance(c).getFullDateFormat());
        return format.format(calendar.getTime());
    }

    public static String fullDateTimeFormat(Context c){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat(GlobalPropertyManager.getInstance(c).getFullDateTimeFormat());
        return format.format(calendar.getTime());
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
