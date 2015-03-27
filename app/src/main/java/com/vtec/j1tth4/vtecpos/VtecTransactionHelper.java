package com.vtec.j1tth4.vtecpos;

import android.content.Context;

import com.vtec.j1tth4.vtecpos.dao.OrderTransaction;
import com.vtec.j1tth4.vtecpos.dao.OrderTransactionDao;

/**
 * Created by j1tth4 on 25/3/2558.
 */
public class VtecTransactionHelper {

    public static OrderTransaction getTransaction(Context c, int id){
        return getTransactionDao(c).load(id);
    }

    public static void deleteTransaction(Context c, OrderTransaction trans){
        getTransactionDao(c).delete(trans);
    }

    public static void updateTransaction(Context c, OrderTransaction trans){
        getTransactionDao(c).update(trans);
    }

    public static void openTransaction(Context c, OrderTransaction trans){
        getTransactionDao(c).insert(trans);
    }

    private static OrderTransactionDao getTransactionDao(Context c){
        return ((VtecPosApplication) c.getApplicationContext()).getDaoSession().getOrderTransactionDao();
    }
}
