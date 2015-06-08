package com.vtec.j1tth4.vtecpos;

import android.content.Context;
import android.os.AsyncTask;

import com.vtec.j1tth4.vtecpos.provider.Transaction;
import com.vtec.j1tth4.vtecpos.provider.TransactionDataSource;

import java.util.List;

/**
 * Created by j1tth4 on 6/8/15.
 */
public class PrintTask extends AsyncTask<Integer, Void, Void>{

    public static final int PRINT_RECEIPT = 1;

    private int mTransactionId;
    private int mComputerId;

    private Context mContext;
    private CommonPrint mCommonPrint;

    public PrintTask(Context c, int transactionId, int computerId){
        mContext = c;
        mCommonPrint = new CommonPrint(c);
        mTransactionId = transactionId;
        mComputerId = computerId;
    }

    private void createReceiptText(){
        TransactionDataSource dataSource = new TransactionDataSource(mContext);
        List<Transaction.OrderDetail> orderDetails = dataSource.listOrderDetail(mTransactionId, mComputerId, false);
        CommonPrint.PrintReceiptModel model = new CommonPrint.PrintReceiptModel(orderDetails, null, null);
        model.setOrderDetails(orderDetails);
        mCommonPrint.createReceiptText(model);
    }

    @Override
    protected Void doInBackground(Integer... printTypes) {
        int printType = printTypes[0];
        if(printType == PRINT_RECEIPT) {
            createReceiptText();
            WintecPrinter wtPrinter = new WintecPrinter(mContext);
            wtPrinter.print(mCommonPrint.getTextToPrint().toString());
        }
        return null;
    }
}
