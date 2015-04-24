package com.vtec.j1tth4.vtecpos;

import android.content.Context;

import java.util.List;

import de.greenrobot.dao.query.Query;

/**
 * Created by j1tth4 on 4/24/15.
 */
public class ShopDataRepository {

    public static ShopData getShopData(Context c, int shopId){
        Query query = getShopDataDao(c).queryRawCreate(
                "where " + ShopDataDao.Properties.ShopID.columnName + "=?" +
                        " and " + ShopDataDao.Properties.Deleted.columnName + "=?",
                String.valueOf(shopId), "0");
        return (ShopData) query.unique();
    }

    public static List<ShopData> getAllShopData(Context c){
        return getShopDataDao(c).loadAll();
    }

    private static ShopDataDao getShopDataDao(Context c){
        return ((VtecPosApplication) c.getApplicationContext()).getDaoSession().getShopDataDao();
    }
}
