package com.vtec.j1tth4.vtecpos;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
}
