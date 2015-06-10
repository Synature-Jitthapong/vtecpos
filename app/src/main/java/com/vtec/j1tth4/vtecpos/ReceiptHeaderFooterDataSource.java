package com.vtec.j1tth4.vtecpos;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by j1tth4 on 6/10/15.
 */
public class ReceiptHeaderFooterDataSource {

    public static final int LINE_TYPE_HEADER = 0;
    public static final int LINE_TYPE_FOOTER = 1;

    public static final String TABLE_RECEIPT_HEADER_FOOTER = "receiptheaderfooter";
    public static final String ID = "ID";
    public static final String TEXT_INLINE = "TextInLine";
    public static final String LINE_TYPE = "LineType";
    public static final String LINE_ORDER = "LineOrder";
    public static final String PRODUCTLEVEL_ID = "ProductLevelID";

    private DatabaseHelper mDbHelper;

    public ReceiptHeaderFooterDataSource(Context c){
        mDbHelper = mDbHelper.getInstance(c);
    }

    public List<ReceiptHeaderFooter> listReceiptHeaderFooter(int lineType){
        List<ReceiptHeaderFooter> lines = null;
        Cursor cursor = mDbHelper.getWritableDatabase().rawQuery(
                "select * " +
                        " from " + TABLE_RECEIPT_HEADER_FOOTER +
                        " where " + LINE_TYPE + "=?" +
                        " order by " + LINE_ORDER,
                new String[]{
                        String.valueOf(lineType)
                });
        if(cursor.moveToFirst()){
            lines = new ArrayList<>();
            while(!cursor.isAfterLast()){
                ReceiptHeaderFooter line = new ReceiptHeaderFooter();
                line.setID(cursor.getInt(cursor.getColumnIndex(ID)));
                line.setTextInLine(cursor.getString(cursor.getColumnIndex(TEXT_INLINE)));
                lines.add(line);
                cursor.moveToNext();
            }
        }
        cursor.close();
        return lines;
    }
}
