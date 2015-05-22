package com.vtec.j1tth4.vtecpos;

import android.content.Context;

import com.vtec.j1tth4.vtecpos.provider.Computer;
import com.vtec.j1tth4.vtecpos.provider.ComputerDataSource;
import com.vtec.j1tth4.vtecpos.provider.GlobalProperty;
import com.vtec.j1tth4.vtecpos.provider.GlobalPropertyDataSource;
import com.vtec.j1tth4.vtecpos.provider.Shop;
import com.vtec.j1tth4.vtecpos.provider.ShopDataSource;

import java.util.List;

/**
 * Created by j1tth4 on 5/17/15 AD.
 */
public class GlobalPropertyManager {
    private int shopId;
    private int computerId;
    private int staffId = 1;
    private String qtyFormat = "#,##0";
    private String currencyFormat = "#,##0.0#";

    private int hasSc;
    private int saleMode = 1;
    private int roundingDigit = 2;
    private int vatDigit = 2;
    private int vatType = 1;
    private double scPercent = 0;
    private double vatPercent = 0;
    private int calVatWhenZeroBill = 0;
    private int scBeforeDisc = 0;
    private String vatCode;

    private static GlobalPropertyManager sInstance = null;

    public static GlobalPropertyManager getInstance(Context c){
        if(sInstance == null){
            sInstance = new GlobalPropertyManager(c);
        }
        return sInstance;
    }

    private GlobalPropertyManager(Context c){
        ShopDataSource sd = new ShopDataSource(c);
        Shop s = sd.getShop();
        if(s == null)
            throw new ExceptionInInitializerError("Shop data is null");
        shopId = s.getShopID();
        hasSc = s.getHasSC();

        s = sd.loadVatShopData(shopId);
        scPercent = s.getSCPercent();
        scBeforeDisc = s.getIsSCBeforeDisc();
        vatType = s.getVATType();
        vatCode = s.getVATCode();
        vatPercent = s.getVatPercent();

        ComputerDataSource cd = new ComputerDataSource(c);
        Computer computer = cd.loadComputerData();
        if(computer == null)
            throw new ExceptionInInitializerError("Computer data is null");
        computerId = computer.getComputerID();

        GlobalPropertyDataSource globalProperty = new GlobalPropertyDataSource(c);
        List<GlobalProperty> gbl = globalProperty.listProgramProperty();
        if(gbl == null)
            throw new ExceptionInInitializerError("Global property variable is null");
        for(GlobalProperty gb : gbl) {
            switch (gb.getPropertyID()) {
                case GlobalPropertyDataSource.CAL_VAT_WHEN_ZERO_BILL_PROPERTY:
                    calVatWhenZeroBill = gb.getPropertyValue();
                    break;
                case GlobalPropertyDataSource.VAT_DIGIT_PROPERTY:
                    vatDigit = gb.getPropertyValue();
                    break;
            }
        }
    }

    public int getStaffId() {
        return staffId;
    }

    public int getShopId() {
        return shopId;
    }

    public int getComputerId() {
        return computerId;
    }

    public String getQtyFormat() {
        return qtyFormat;
    }

    public String getCurrencyFormat() {
        return currencyFormat;
    }

    public int getSaleMode() {
        return saleMode;
    }

    public int getHasSc(){
        return hasSc;
    }

    public double getVatPercent(){
        return vatPercent;
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

    public int getCalVatWhenZeroBill() {
        return calVatWhenZeroBill;
    }

    public int getScBeforeDisc() {
        return scBeforeDisc;
    }

    public String getVatCode(){
        return vatCode;
    }
}
