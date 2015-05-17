package com.vtec.j1tth4.vtecpos;

import android.content.Context;

import com.vtec.j1tth4.vtecpos.provider.Transaction;
import com.vtec.j1tth4.vtecpos.provider.TransactionDataSource;

/**
 * Created by j1tth4 on 5/17/15 AD.
 */
public class TransactionManager {

    private static TransactionManager sInstance = null;
    private Context mContext;

    public static TransactionManager getInstance(Context c){
        if(sInstance == null){
            sInstance = new TransactionManager(c);
        }
        return sInstance;
    }

    private TransactionManager(Context c){
        mContext = c;
    }

    public void insertTransaction(){
        TransactionDataSource dataSource =
                new TransactionDataSource(mContext);
    }

    public Transaction getTransaction(int transId, int compId){
        TransactionDataSource dataSource =
                new TransactionDataSource(mContext);

    }
}
