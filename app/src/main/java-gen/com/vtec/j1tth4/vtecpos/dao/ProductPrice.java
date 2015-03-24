package com.vtec.j1tth4.vtecpos.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table PRODUCT_PRICE.
 */
public class ProductPrice {

    private int ProductPriceID;
    private int ProductID;
    private Double ProductPrice;
    private double PrepaidPrice;
    private double MainPrice;
    private int SaleMode;
    private String PriceRemark;
    /** Not-null value. */
    private java.util.Date FromDate;
    /** Not-null value. */
    private java.util.Date ToDate;
    private int AddingFromBranch;

    public ProductPrice() {
    }

    public ProductPrice(int ProductPriceID) {
        this.ProductPriceID = ProductPriceID;
    }

    public ProductPrice(int ProductPriceID, int ProductID, Double ProductPrice, double PrepaidPrice, double MainPrice, int SaleMode, String PriceRemark, java.util.Date FromDate, java.util.Date ToDate, int AddingFromBranch) {
        this.ProductPriceID = ProductPriceID;
        this.ProductID = ProductID;
        this.ProductPrice = ProductPrice;
        this.PrepaidPrice = PrepaidPrice;
        this.MainPrice = MainPrice;
        this.SaleMode = SaleMode;
        this.PriceRemark = PriceRemark;
        this.FromDate = FromDate;
        this.ToDate = ToDate;
        this.AddingFromBranch = AddingFromBranch;
    }

    public int getProductPriceID() {
        return ProductPriceID;
    }

    public void setProductPriceID(int ProductPriceID) {
        this.ProductPriceID = ProductPriceID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public Double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(Double ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

    public double getPrepaidPrice() {
        return PrepaidPrice;
    }

    public void setPrepaidPrice(double PrepaidPrice) {
        this.PrepaidPrice = PrepaidPrice;
    }

    public double getMainPrice() {
        return MainPrice;
    }

    public void setMainPrice(double MainPrice) {
        this.MainPrice = MainPrice;
    }

    public int getSaleMode() {
        return SaleMode;
    }

    public void setSaleMode(int SaleMode) {
        this.SaleMode = SaleMode;
    }

    public String getPriceRemark() {
        return PriceRemark;
    }

    public void setPriceRemark(String PriceRemark) {
        this.PriceRemark = PriceRemark;
    }

    /** Not-null value. */
    public java.util.Date getFromDate() {
        return FromDate;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setFromDate(java.util.Date FromDate) {
        this.FromDate = FromDate;
    }

    /** Not-null value. */
    public java.util.Date getToDate() {
        return ToDate;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setToDate(java.util.Date ToDate) {
        this.ToDate = ToDate;
    }

    public int getAddingFromBranch() {
        return AddingFromBranch;
    }

    public void setAddingFromBranch(int AddingFromBranch) {
        this.AddingFromBranch = AddingFromBranch;
    }

}
