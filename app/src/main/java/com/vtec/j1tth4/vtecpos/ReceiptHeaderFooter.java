package com.vtec.j1tth4.vtecpos;

/**
 * Created by j1tth4 on 6/10/15.
 */
public class ReceiptHeaderFooter {
    private int ID;
    private String TextInLine;
    private int LineType;
    private int LineOrder;
    private int ProductLevelID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTextInLine() {
        return TextInLine;
    }

    public void setTextInLine(String textInLine) {
        TextInLine = textInLine;
    }

    public int getLineType() {
        return LineType;
    }

    public void setLineType(int lineType) {
        LineType = lineType;
    }

    public int getLineOrder() {
        return LineOrder;
    }

    public void setLineOrder(int lineOrder) {
        LineOrder = lineOrder;
    }

    public int getProductLevelID() {
        return ProductLevelID;
    }

    public void setProductLevelID(int productLevelID) {
        ProductLevelID = productLevelID;
    }
}
