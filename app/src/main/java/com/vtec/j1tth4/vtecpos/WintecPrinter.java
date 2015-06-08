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
public class WintecPrinter{
    public static final String ISO_8859_11 = "ISO8859-11";
    public static final String DEV_PATH = "/dev/ttySAC1";
    public static final String BAUD_RATE = "BAUD_38400";

    private cn.wintec.wtandroidjar2.Printer mPrinter;

    public WintecPrinter(Context c){
        mPrinter = new Printer(DEV_PATH, ComIO.Baudrate.valueOf(BAUD_RATE));
    }

    public void print(String textToPrint){
        try {
            String[] lines = textToPrint.split("\n");
            for (String line : lines) {
                mPrinter.PRN_Print(line, ISO_8859_11);
            }
            mPrinter.PRN_PrintAndFeedLine(5);
            mPrinter.PRN_CutPaper();
        }catch(Exception e){
        }finally {
            if(mPrinter != null)
                mPrinter.PRN_Close();
        }
    }
}
