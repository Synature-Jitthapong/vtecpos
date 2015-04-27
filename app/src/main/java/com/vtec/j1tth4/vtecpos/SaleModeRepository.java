package com.vtec.j1tth4.vtecpos;

import android.content.Context;

import com.vtec.j1tth4.vtecpos.dao.SaleMode;
import com.vtec.j1tth4.vtecpos.dao.SaleModeDao;

import java.util.List;

import de.greenrobot.dao.query.Query;

/**
 * Created by j1tth4 on 4/24/15.
 */
public class SaleModeRepository {

    public static SaleMode getSaleMode(Context c, int saleModeId){
        Query query = getSaleModeDao(c).queryRawCreate(
                "where " + SaleModeDao.Properties.SaleModeID.columnName + "=?",
                String.valueOf(saleModeId));
        return (SaleMode) query.unique();
    }

    public static List<SaleMode> getAllSaleMode(Context c){
        return getSaleModeDao(c).loadAll();
    }

    private static SaleModeDao getSaleModeDao(Context c){
        return ((VtecPosApplication) c.getApplicationContext()).getDaoSession().getSaleModeDao();
    }
}
