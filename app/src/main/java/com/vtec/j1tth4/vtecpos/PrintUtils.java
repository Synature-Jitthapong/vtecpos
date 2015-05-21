package com.vtec.j1tth4.vtecpos;

import cn.wintec.wtandroidjar2.ComIO;
import cn.wintec.wtandroidjar2.Printer;

/**
 * Created by j1tth4 on 5/21/15.
 */
public class PrintUtils {
    public static final String ISO_8859_11 = "ISO8859-11";

    cn.wintec.wtandroidjar2.Printer mPrinter;

    public PrintUtils(){
        mPrinter = new Printer("/dev/ttySAC1", ComIO.Baudrate.valueOf("BAUD_38400"));
    }

    public void print(String textToPrint){
        mPrinter.PRN_Print("xxxxxxxxxxxxxxxxxx", ISO_8859_11);

        mPrinter.PRN_PrintAndFeedLine(5);
        mPrinter.PRN_CutPaper();
        mPrinter.PRN_Close();
    }
}
