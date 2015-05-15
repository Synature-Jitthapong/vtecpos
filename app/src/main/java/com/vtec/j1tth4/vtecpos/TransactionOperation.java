package com.vtec.j1tth4.vtecpos;

import com.vtec.j1tth4.vtecpos.provider.Transaction;

/**
 * Created by j1tth4 on 5/15/15.
 */
public interface TransactionOperation {
    void onOpenTransaction();
    void onHoldTransaction(Transaction trans);
    void onSuccessTransaction(Transaction trans);
}
