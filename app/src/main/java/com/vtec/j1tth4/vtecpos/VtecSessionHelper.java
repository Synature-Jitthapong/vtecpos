package com.vtec.j1tth4.vtecpos;

import android.content.Context;

import com.vtec.j1tth4.vtecpos.dao.Session;
import com.vtec.j1tth4.vtecpos.dao.SessionDao;

/**
 * Created by j1tth4 on 25/3/2558.
 */
public class VtecSessionHelper {

    public static Session getSession(Context c, int id){
        return getSessionDao(c).load(id);
    }

    public static void deleteSession(Context c, int id){
        getSessionDao(c).deleteByKey(id);
    }

    public static void updateSession(Context c, Session session){
        getSessionDao(c).update(session);
    }

    public static void openSession(Context c, Session session){
        getSessionDao(c).insert(session);
    }

    private static SessionDao getSessionDao(Context c){
        return ((VtecPosApplication) c.getApplicationContext()).getDaoSession().getSessionDao();
    }
}
