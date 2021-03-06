package com.vtec.j1tth4.vtecpos.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table fc_transaction.
 */
public class FcTransaction {

    private Integer TransactionID;
    private Integer ComputerID;
    private String TranUUID;
    private Integer ReceiptYear;
    private Integer ReceiptMonth;
    private Integer ReceiptID;
    private Integer ShopID;
    private String SaleDate;
    private String ReceiptNo;
    private Double TotalAmount;
    private Integer TranStatus;
    private Integer DocType;
    private Integer StaffID;
    private String InsertDate;

    public FcTransaction() {
    }

    public FcTransaction(Integer TransactionID, Integer ComputerID) {
        this.TransactionID = TransactionID;
        this.ComputerID = ComputerID;
    }

    public FcTransaction(Integer TransactionID, Integer ComputerID, String TranUUID, Integer ReceiptYear, Integer ReceiptMonth, Integer ReceiptID, Integer ShopID, String SaleDate, String ReceiptNo, Double TotalAmount, Integer TranStatus, Integer DocType, Integer StaffID, String InsertDate) {
        this.TransactionID = TransactionID;
        this.ComputerID = ComputerID;
        this.TranUUID = TranUUID;
        this.ReceiptYear = ReceiptYear;
        this.ReceiptMonth = ReceiptMonth;
        this.ReceiptID = ReceiptID;
        this.ShopID = ShopID;
        this.SaleDate = SaleDate;
        this.ReceiptNo = ReceiptNo;
        this.TotalAmount = TotalAmount;
        this.TranStatus = TranStatus;
        this.DocType = DocType;
        this.StaffID = StaffID;
        this.InsertDate = InsertDate;
    }

    public Integer getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(Integer TransactionID) {
        this.TransactionID = TransactionID;
    }

    public Integer getComputerID() {
        return ComputerID;
    }

    public void setComputerID(Integer ComputerID) {
        this.ComputerID = ComputerID;
    }

    public String getTranUUID() {
        return TranUUID;
    }

    public void setTranUUID(String TranUUID) {
        this.TranUUID = TranUUID;
    }

    public Integer getReceiptYear() {
        return ReceiptYear;
    }

    public void setReceiptYear(Integer ReceiptYear) {
        this.ReceiptYear = ReceiptYear;
    }

    public Integer getReceiptMonth() {
        return ReceiptMonth;
    }

    public void setReceiptMonth(Integer ReceiptMonth) {
        this.ReceiptMonth = ReceiptMonth;
    }

    public Integer getReceiptID() {
        return ReceiptID;
    }

    public void setReceiptID(Integer ReceiptID) {
        this.ReceiptID = ReceiptID;
    }

    public Integer getShopID() {
        return ShopID;
    }

    public void setShopID(Integer ShopID) {
        this.ShopID = ShopID;
    }

    public String getSaleDate() {
        return SaleDate;
    }

    public void setSaleDate(String SaleDate) {
        this.SaleDate = SaleDate;
    }

    public String getReceiptNo() {
        return ReceiptNo;
    }

    public void setReceiptNo(String ReceiptNo) {
        this.ReceiptNo = ReceiptNo;
    }

    public Double getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(Double TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    public Integer getTranStatus() {
        return TranStatus;
    }

    public void setTranStatus(Integer TranStatus) {
        this.TranStatus = TranStatus;
    }

    public Integer getDocType() {
        return DocType;
    }

    public void setDocType(Integer DocType) {
        this.DocType = DocType;
    }

    public Integer getStaffID() {
        return StaffID;
    }

    public void setStaffID(Integer StaffID) {
        this.StaffID = StaffID;
    }

    public String getInsertDate() {
        return InsertDate;
    }

    public void setInsertDate(String InsertDate) {
        this.InsertDate = InsertDate;
    }

}
