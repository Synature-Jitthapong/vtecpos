package com.vtec.j1tth4.vtecpos.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table SaleMode.
 */
public class SaleMode {

    private Integer SaleModeID;
    private String SaleModeName;
    private Integer Deleted;
    private Integer PositionPrefix;
    private String PrefixText;
    private String PrefixTextPrinting;
    private String PrefixQueue;
    private String ReceiptHeaderText;
    private Integer HasServiceCharge;

    public SaleMode() {
    }

    public SaleMode(Integer SaleModeID) {
        this.SaleModeID = SaleModeID;
    }

    public SaleMode(Integer SaleModeID, String SaleModeName, Integer Deleted, Integer PositionPrefix, String PrefixText, String PrefixTextPrinting, String PrefixQueue, String ReceiptHeaderText, Integer HasServiceCharge) {
        this.SaleModeID = SaleModeID;
        this.SaleModeName = SaleModeName;
        this.Deleted = Deleted;
        this.PositionPrefix = PositionPrefix;
        this.PrefixText = PrefixText;
        this.PrefixTextPrinting = PrefixTextPrinting;
        this.PrefixQueue = PrefixQueue;
        this.ReceiptHeaderText = ReceiptHeaderText;
        this.HasServiceCharge = HasServiceCharge;
    }

    public Integer getSaleModeID() {
        return SaleModeID;
    }

    public void setSaleModeID(Integer SaleModeID) {
        this.SaleModeID = SaleModeID;
    }

    public String getSaleModeName() {
        return SaleModeName;
    }

    public void setSaleModeName(String SaleModeName) {
        this.SaleModeName = SaleModeName;
    }

    public Integer getDeleted() {
        return Deleted;
    }

    public void setDeleted(Integer Deleted) {
        this.Deleted = Deleted;
    }

    public Integer getPositionPrefix() {
        return PositionPrefix;
    }

    public void setPositionPrefix(Integer PositionPrefix) {
        this.PositionPrefix = PositionPrefix;
    }

    public String getPrefixText() {
        return PrefixText;
    }

    public void setPrefixText(String PrefixText) {
        this.PrefixText = PrefixText;
    }

    public String getPrefixTextPrinting() {
        return PrefixTextPrinting;
    }

    public void setPrefixTextPrinting(String PrefixTextPrinting) {
        this.PrefixTextPrinting = PrefixTextPrinting;
    }

    public String getPrefixQueue() {
        return PrefixQueue;
    }

    public void setPrefixQueue(String PrefixQueue) {
        this.PrefixQueue = PrefixQueue;
    }

    public String getReceiptHeaderText() {
        return ReceiptHeaderText;
    }

    public void setReceiptHeaderText(String ReceiptHeaderText) {
        this.ReceiptHeaderText = ReceiptHeaderText;
    }

    public Integer getHasServiceCharge() {
        return HasServiceCharge;
    }

    public void setHasServiceCharge(Integer HasServiceCharge) {
        this.HasServiceCharge = HasServiceCharge;
    }

}