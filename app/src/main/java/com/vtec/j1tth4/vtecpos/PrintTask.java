package com.vtec.j1tth4.vtecpos;

import android.content.Context;
import android.os.AsyncTask;

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
        ReceiptHeaderFooterDataSource headerFooter = new ReceiptHeaderFooterDataSource(mContext);
        List<ReceiptHeaderFooter> headerLine =
                headerFooter.listReceiptHeaderFooter(ReceiptHeaderFooterDataSource.LINE_TYPE_HEADER);
        List<ReceiptHeaderFooter> footerLine =
                headerFooter.listReceiptHeaderFooter(ReceiptHeaderFooterDataSource.LINE_TYPE_FOOTER);

        PaymentDataSource payment = new PaymentDataSource(mContext);
        List<PayDetail> payDetails = payment.listPayDetail(mTransactionId, mComputerId, false);

        TransactionDataSource transDataSource = new TransactionDataSource(mContext);
        Transaction trans = transDataSource.getTransaction(mTransactionId, false);
        List<Transaction.OrderDetail> orderDetails =
                transDataSource.listOrderDetail(mTransactionId, mComputerId, false);
        StaffDataSource staffSource = new StaffDataSource(mContext);
        Staff staff = staffSource.getStaff(1);
        CommonPrint.PrintReceiptModel model =
                new CommonPrint.PrintReceiptModel(trans, staff.getStaffFirstName(), orderDetails, payDetails, headerLine, footerLine);
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
