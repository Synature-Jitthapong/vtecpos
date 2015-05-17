package com.vtec.j1tth4.vtecpos;

import android.content.Context;

import com.vtec.j1tth4.vtecpos.provider.GlobalProperty;
import com.vtec.j1tth4.vtecpos.provider.GlobalPropertyDataSource;
import com.vtec.j1tth4.vtecpos.provider.Shop;
import com.vtec.j1tth4.vtecpos.provider.ShopDataSource;

import java.util.List;

/**
 * Created by j1tth4 on 5/17/15 AD.
 */
public class GlobalPropertyManager {
    private int roundingDigit = 2;
    private int vatDigit = 2;
    private int vatType = 1;
    private double scPercent = 7.0d;
    private boolean isCalVatWhenZeroBill = false;
    private boolean isScBeforeDisc = false;
    private String vatCode;

    private static GlobalPropertyManager sInstance = null;

    public static GlobalPropertyManager getInstance(Context context){
        if(sInstance == null){
            sInstance = new GlobalPropertyManager(context);
        }
        return sInstance;
    }

    private GlobalPropertyManager(Context context){
        ShopDataSource sd = new ShopDataSource(context);
        Shop s = sd.loadVatShopData(0);
        if(s == null)
            throw new ExceptionInInitializerError("Shop data is null");
        scPercent = s.getSCPercent();
        isScBeforeDisc = s.getIsSCBeforeDisc() == 1 ? true : false;
        vatType = s.getVATType();
        vatCode = s.getVATCode();

        GlobalPropertyDataSource globalProperty = new GlobalPropertyDataSource(context);
        List<GlobalProperty> gbl = globalProperty.listProgramProperty();
        if(gbl == null)
            throw new ExceptionInInitializerError("Global property variable is null");
        for(GlobalProperty gb : gbl) {
            switch (gb.getPropertyID()) {
                case GlobalPropertyDataSource.CAL_VAT_WHEN_ZERO_BILL_PROPERTY:
                    if (gb.getPropertyValue() == 1) isCalVatWhenZeroBill = true;
                    break;
                case GlobalPropertyDataSource.VAT_DIGIT_PROPERTY:
                    vatDigit = gb.getPropertyValue();
                    break;
            }
        }
    }

    public int getRoundingDigit() {
        return roundingDigit;
    }

    public int getVatDigit() {
        return vatDigit;
    }

    public int getVatType(){
        return vatType;
    }

    public double getScPercent() {
        return scPercent;
    }

    public boolean isCalVatWhenZeroBill() {
        return isCalVatWhenZeroBill;
    }

    public boolean isScBeforeDisc() {
        return isScBeforeDisc;
    }

    public String getVatCode(){
        return vatCode;
    }
}
