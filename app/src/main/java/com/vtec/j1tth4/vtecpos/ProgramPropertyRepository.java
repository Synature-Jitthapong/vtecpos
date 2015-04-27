package com.vtec.j1tth4.vtecpos;

import android.content.Context;

import com.vtec.j1tth4.vtecpos.dao.ProgramProperty;
import com.vtec.j1tth4.vtecpos.dao.ProgramPropertyDao;

import java.util.List;

import de.greenrobot.dao.query.Query;

/**
 * Created by j1tth4 on 4/23/15.
 */
public class ProgramPropertyRepository {


    public static ProgramProperty getProperty(Context c, int propertyId){
        Query query = getProgramPropertyDao(c).queryRawCreate(
                "where " + ProgramPropertyDao.Properties.PropertyID.columnName + "=?",
                String.valueOf(propertyId));
        return (ProgramProperty) query.unique();
    }

    public static List<ProgramProperty> getAllProperty(Context c){
        return getProgramPropertyDao(c).loadAll();
    }

    private static ProgramPropertyDao getProgramPropertyDao(Context c){
        return ((VtecPosApplication) c.getApplicationContext()).getDaoSession().getProgramPropertyDao();
    }
}
