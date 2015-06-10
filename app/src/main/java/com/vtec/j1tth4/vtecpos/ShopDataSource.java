package com.vtec.j1tth4.vtecpos;

import android.content.Context;
import android.database.Cursor;
import android.database.CursorWrapper;

/**
 * Created by j1tth4 on 11/5/2558.
 */
public class ShopDataSource {

    public static final String TABLE_SHOP_DATA = "Shop_Data";
    public static final String SHOP_ID = "ShopID";
    public static final String SHOP_CODE = "ShopCode";
    public static final String SHOP_NAME = "ShopName";
    public static final String IS_SHOP = "IsShop";
    public static final String IS_INV = "IsInv";
    public static final String HAS_SC = "HasSC";
    public static final String IS_SC_BEFORE_DISC = "IsSCBeforeDisc";
    public static final String SC_PERCENT = "SCPercent";
    public static final String VAT_CODE = "VATCode";
    public static final String VAT_TYPE = "VATType";
    public static final String MASTER_SHOP = "MasterShop";
    public static final String MASTER_SHOP_LINK = "MasterShopLink";
    public static final String SHOW_IN_REPORT = "ShowInReport";
    public static final String SHOP_TYPE_ID = "ShopTypeID";
    public static final String SHOP_CAT1 = "ShopCatID1";
    public static final String SHOP_CAT2 = "ShopCatID2";
    public static final String SHOP_CAT3 = "ShopCatID3";
    public static final String SHOP_CAT4 = "ShopCatID4";
    public static final String SHOP_CAT5 = "ShopCatID5";
    public static final String SHOP_CAT6 = "ShopCatID6";
    public static final String SHOP_CAT7 = "ShopCatID7";
    public static final String SHOP_CAT8 = "ShopCatID8";
    public static final String SHOP_CAT9 = "ShopCatID9";
    public static final String SHOP_CAT10 = "ShopCatID10";
    public static final String OPEN_HOUR = "OpenHour";
    public static final String CLOSE_HOUR = "CloseHour";
    public static final String COMPANY_NAME = "CompanyName";
    public static final String COMPANY_ADDRESS = "CompanyAddress1";
    public static final String COMPANY_ADDRESS2 = "CompanyAddress2";
    public static final String COMPANY_CITY = "CompanyCity";
    public static final String COMPANY_PROVINCE = "CompanyProvince";
    public static final String DISPLAY_COMPANY_PROVINCE_LANG_ID = "DisplayCompanyProvinceLangID";
    public static final String COMPANY_ZIP_CODE = "CompanyZipCode";
    public static final String COMPANY_TELEPHONE = "CompanyTelephone";
    public static final String COMPANY_FAX = "CompanyFax";
    public static final String COMPANY_COUNTRY = "CompanyCountry";
    public static final String COMPANY_TAX_ID = "CompanyTaxID";
    public static final String COMPANY_REGISTER_ID = "CompanyRegisterID";
    public static final String ACCOUNTING_CODE = "AccountingCode";
    public static final String DELIVERY_NAME = "DeliveryName";
    public static final String DELIVERY_ADDRESS1 = "DeliveryAddress1";
    public static final String DELIVERY_ADDRESS2 = "DeliveryAddress2";
    public static final String DELIVERY_CITY = "DeliveryCity";
    public static final String DELIVERY_PROVINCE = "DeliveryProvince";
    public static final String DELIVERY_ZIP_CODE = "DeliveryZipCode";
    public static final String DELIVERY_TELEPHONE = "DeliveryTelephone";
    public static final String DELIVERY_FAX = "DeliveryFax";
    public static final String IP_ADDRESS = "IPAddress";
    public static final String ADDITIONAL = "Addtional";
    public static final String PRODUCTLEVEL_ORDER = "ProductLevelOrder";
    public static final String DELETED = "Deleted";

    private DatabaseHelper mDbHelper;

    public ShopDataSource(Context c) {
        mDbHelper = DatabaseHelper.getInstance(c);
    }

    public Shop loadVatShopData(int shopId){
        String[] whereArgs = null;
        if(shopId > 0)
            whereArgs = new String[]{
                    String.valueOf(shopId)
            };
        Cursor cursor = mDbHelper.getWritableDatabase().rawQuery(
                "select * " +
                        " from " + TABLE_SHOP_DATA + " a " +
                        " left outer join " + ProductDataSource.TABLE_PRODUCT_VAT + " b " +
                        " on a." + VAT_CODE + "=b." + ProductDataSource.PRODUCT_VAT_CODE +
                        (shopId != 0 ? " where a." + SHOP_ID + "=?" : ""),
                whereArgs);
        Shop s = null;
        if(cursor.moveToFirst()){
            s = new Shop();
            if(!cursor.isNull(cursor.getColumnIndex(VAT_CODE)))
                s.setVATCode(cursor.getString(cursor.getColumnIndex(VAT_CODE)));
            if(!cursor.isNull(cursor.getColumnIndex(SC_PERCENT)))
                s.setSCPercent(cursor.getDouble(cursor.getColumnIndex(SC_PERCENT)));
            if(!cursor.isNull(cursor.getColumnIndex(ProductDataSource.PRODUCT_VAT_PERCENT)))
                s.setVatPercent(cursor.getDouble(cursor.getColumnIndex(ProductDataSource.PRODUCT_VAT_PERCENT)));
            if(!cursor.isNull(cursor.getColumnIndex(HAS_SC)))
                s.setHasSC(cursor.getInt(cursor.getColumnIndex(HAS_SC)));
            if(!cursor.isNull(cursor.getColumnIndex(IS_SC_BEFORE_DISC)))
                s.setIsSCBeforeDisc(cursor.getInt(cursor.getColumnIndex(IS_SC_BEFORE_DISC)));
            if(!cursor.isNull(cursor.getColumnIndex(VAT_TYPE)))
                s.setVATType(cursor.getInt(cursor.getColumnIndex(VAT_TYPE)));
        }
        cursor.close();
        return s;
    }

    public Shop getShop(int shopId){
        Cursor cursor = mDbHelper.getWritableDatabase().rawQuery(
                "select * from " +
                        TABLE_SHOP_DATA +
                        " where " + SHOP_ID + "=?" +
                        " and " + DELETED + "=?",
                new String[]{
                        String.valueOf(shopId),
                        "0"
                });
        Shop s = null;
        ShopCursor shopCursor = new ShopCursor(cursor);
        if(shopCursor.moveToFirst()){
            s = shopCursor.getShop();
        }
        shopCursor.close();
        return s;
    }

    public Shop getShop(){
        Cursor cursor = mDbHelper.getWritableDatabase().rawQuery(
                "select * from " +
                        TABLE_SHOP_DATA +
                " where " + IS_SHOP + "=?" +
                        " and " + DELETED + "=?",
                new String[]{
                        "1",
                        "0"
                });
        Shop s = null;
        ShopCursor shopCursor = new ShopCursor(cursor);
        if(shopCursor.moveToFirst()){
            s = shopCursor.getShop();
        }
        shopCursor.close();
        mDbHelper.close();
        return s;
    }

    public static class ShopCursor extends CursorWrapper{

        public ShopCursor(Cursor cursor) {
            super(cursor);
        }

        public Shop getShop(){
            if(isBeforeFirst() || isAfterLast())
                return null;
            Shop s = new Shop();
            s.setShopID(getInt(getColumnIndex(SHOP_ID)));
            s.setHasSC(getInt(getColumnIndex(HAS_SC)));
            s.setSCPercent(getDouble(getColumnIndex(SC_PERCENT)));
            s.setIsSCBeforeDisc(getInt(getColumnIndex(IS_SC_BEFORE_DISC)));
            return s;
        }
    }
}
