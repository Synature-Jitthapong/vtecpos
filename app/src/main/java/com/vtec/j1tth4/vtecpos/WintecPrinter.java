package com.vtec.j1tth4.vtecpos;

import android.content.Context;
import android.os.AsyncTask;

import com.vtec.j1tth4.vtecpos.provider.Transaction;

import java.util.List;

import cn.wintec.wtandroidjar2.ComIO;
import cn.wintec.wtandroidjar2.Printer;

/**
 * Created by j1tth4 on 5/22/15.
 */
public class WintecPrinter extends CommonPrint{
    public static final String ISO_8859_11 = "ISO8859-11";
    public static final String DEV_PATH = "/dev/ttySAC1";
    public static final String BAUD_RATE = "BAUD_38400";

    private cn.wintec.wtandroidjar2.Printer mPrinter;

    public WintecPrinter(Context c){
        super(c);
        mPrinter = new Printer(DEV_PATH, ComIO.Baudrate.valueOf(BAUD_RATE));
    }

    public void printReceipt(){
        List<Transaction.OrderDetail> orderDetails =
                TransactionManager.getInstance(mContext).listOrder(false);
        PrintReceiptModel model = new PrintReceiptModel(orderDetails, null, null);
        createReceiptText(model);
        print();
    }

    private void print(){
        String[] lines = getTextToPrint().toString().split("\n");
        for(String line : lines){
            mPrinter.PRN_Print(line, ISO_8859_11);
        }
        mPrinter.PRN_PrintAndFeedLine(5);
        mPrinter.PRN_CutPaper();
        mPrinter.PRN_Close();
    }

    private class PrintTask extends AsyncTask<Void, Void, Void>{

        @Override
        protected Void doInBackground(Void... voids) {
            return null;
        }
    }
}
