package com.vtec.j1tth4.vtecpos.provider;

/**
 * Created by j1tth4 on 5/21/15.
 */
public class OrderPrintJob {
    private Integer TransactionID;
    private Integer ComputerID;
    private Integer OrderDetailID;
    private Integer PrintNo;
    private Integer PrinterID;
    private Integer IsPrintSummary;
    private String InsertDateTime;
    private String PrintDateTime;
    private String FinishDateTime;
    private String SaleDate;
    private Integer ShopID;
    private Integer PrintFromComputerID;
    private Integer PrintStatus;

    public Integer getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(Integer transactionID) {
        TransactionID = transactionID;
    }

    public Integer getComputerID() {
        return ComputerID;
    }

    public void setComputerID(Integer computerID) {
        ComputerID = computerID;
    }

    public Integer getOrderDetailID() {
        return OrderDetailID;
    }

    public void setOrderDetailID(Integer orderDetailID) {
        OrderDetailID = orderDetailID;
    }

    public Integer getPrintNo() {
        return PrintNo;
    }

    public void setPrintNo(Integer printNo) {
        PrintNo = printNo;
    }

    public Integer getPrinterID() {
        return PrinterID;
    }

    public void setPrinterID(Integer printerID) {
        PrinterID = printerID;
    }

    public Integer getIsPrintSummary() {
        return IsPrintSummary;
    }

    public void setIsPrintSummary(Integer isPrintSummary) {
        IsPrintSummary = isPrintSummary;
    }

    public String getInsertDateTime() {
        return InsertDateTime;
    }

    public void setInsertDateTime(String insertDateTime) {
        InsertDateTime = insertDateTime;
    }

    public String getPrintDateTime() {
        return PrintDateTime;
    }

    public void setPrintDateTime(String printDateTime) {
        PrintDateTime = printDateTime;
    }

    public String getFinishDateTime() {
        return FinishDateTime;
    }

    public void setFinishDateTime(String finishDateTime) {
        FinishDateTime = finishDateTime;
    }

    public String getSaleDate() {
        return SaleDate;
    }

    public void setSaleDate(String saleDate) {
        SaleDate = saleDate;
    }

    public Integer getShopID() {
        return ShopID;
    }

    public void setShopID(Integer shopID) {
        ShopID = shopID;
    }

    public Integer getPrintFromComputerID() {
        return PrintFromComputerID;
    }

    public void setPrintFromComputerID(Integer printFromComputerID) {
        PrintFromComputerID = printFromComputerID;
    }

    public Integer getPrintStatus() {
        return PrintStatus;
    }

    public void setPrintStatus(Integer printStatus) {
        PrintStatus = printStatus;
    }
}
