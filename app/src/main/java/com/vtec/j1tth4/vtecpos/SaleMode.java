package com.vtec.j1tth4.vtecpos;

/**
 * Created by j1tth4 on 19/5/2558.
 */
public class SaleMode {
    private int SaleModeID;
    private String SaleModeName;
    private int Deleted;
    private int PositionPrefix;
    private String PrefixText;
    private String PrefixTextPrinting;
    private String PrefixQueue;
    private String ReceiptHeaderText;
    private int HasServiceCharge;

    public int getSaleModeID() {
        return SaleModeID;
    }

    public void setSaleModeID(int saleModeID) {
        SaleModeID = saleModeID;
    }

    public String getSaleModeName() {
        return SaleModeName;
    }

    public void setSaleModeName(String saleModeName) {
        SaleModeName = saleModeName;
    }

    public int getDeleted() {
        return Deleted;
    }

    public void setDeleted(int deleted) {
        Deleted = deleted;
    }

    public int getPositionPrefix() {
        return PositionPrefix;
    }

    public void setPositionPrefix(int positionPrefix) {
        PositionPrefix = positionPrefix;
    }

    public String getPrefixText() {
        return PrefixText;
    }

    public void setPrefixText(String prefixText) {
        PrefixText = prefixText;
    }

    public String getPrefixTextPrinting() {
        return PrefixTextPrinting;
    }

    public void setPrefixTextPrinting(String prefixTextPrinting) {
        PrefixTextPrinting = prefixTextPrinting;
    }

    public String getPrefixQueue() {
        return PrefixQueue;
    }

    public void setPrefixQueue(String prefixQueue) {
        PrefixQueue = prefixQueue;
    }

    public String getReceiptHeaderText() {
        return ReceiptHeaderText;
    }

    public void setReceiptHeaderText(String receiptHeaderText) {
        ReceiptHeaderText = receiptHeaderText;
    }

    public int getHasServiceCharge() {
        return HasServiceCharge;
    }

    public void setHasServiceCharge(int hasServiceCharge) {
        HasServiceCharge = hasServiceCharge;
    }
}
