package com.vtec.j1tth4.vtecpos.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table PRODUCT_CATEGORY.
 */
public class ProductCategory {

    private int ProductCatID;
    private int ShopID;
    private int ProductCatTypeID;
    private String ProductCatCode;
    private String ProductCatName;
    private int ProductCatDisplay;
    private int ProductCatActivate;
    private int ProductCatOrdering;
    private int Deleted;
    private int IsComment;
    private int AddingFromBranch;

    public ProductCategory() {
    }

    public ProductCategory(int ProductCatID) {
        this.ProductCatID = ProductCatID;
    }

    public ProductCategory(int ProductCatID, int ShopID, int ProductCatTypeID, String ProductCatCode, String ProductCatName, int ProductCatDisplay, int ProductCatActivate, int ProductCatOrdering, int Deleted, int IsComment, int AddingFromBranch) {
        this.ProductCatID = ProductCatID;
        this.ShopID = ShopID;
        this.ProductCatTypeID = ProductCatTypeID;
        this.ProductCatCode = ProductCatCode;
        this.ProductCatName = ProductCatName;
        this.ProductCatDisplay = ProductCatDisplay;
        this.ProductCatActivate = ProductCatActivate;
        this.ProductCatOrdering = ProductCatOrdering;
        this.Deleted = Deleted;
        this.IsComment = IsComment;
        this.AddingFromBranch = AddingFromBranch;
    }

    public int getProductCatID() {
        return ProductCatID;
    }

    public void setProductCatID(int ProductCatID) {
        this.ProductCatID = ProductCatID;
    }

    public int getShopID() {
        return ShopID;
    }

    public void setShopID(int ShopID) {
        this.ShopID = ShopID;
    }

    public int getProductCatTypeID() {
        return ProductCatTypeID;
    }

    public void setProductCatTypeID(int ProductCatTypeID) {
        this.ProductCatTypeID = ProductCatTypeID;
    }

    public String getProductCatCode() {
        return ProductCatCode;
    }

    public void setProductCatCode(String ProductCatCode) {
        this.ProductCatCode = ProductCatCode;
    }

    public String getProductCatName() {
        return ProductCatName;
    }

    public void setProductCatName(String ProductCatName) {
        this.ProductCatName = ProductCatName;
    }

    public int getProductCatDisplay() {
        return ProductCatDisplay;
    }

    public void setProductCatDisplay(int ProductCatDisplay) {
        this.ProductCatDisplay = ProductCatDisplay;
    }

    public int getProductCatActivate() {
        return ProductCatActivate;
    }

    public void setProductCatActivate(int ProductCatActivate) {
        this.ProductCatActivate = ProductCatActivate;
    }

    public int getProductCatOrdering() {
        return ProductCatOrdering;
    }

    public void setProductCatOrdering(int ProductCatOrdering) {
        this.ProductCatOrdering = ProductCatOrdering;
    }

    public int getDeleted() {
        return Deleted;
    }

    public void setDeleted(int Deleted) {
        this.Deleted = Deleted;
    }

    public int getIsComment() {
        return IsComment;
    }

    public void setIsComment(int IsComment) {
        this.IsComment = IsComment;
    }

    public int getAddingFromBranch() {
        return AddingFromBranch;
    }

    public void setAddingFromBranch(int AddingFromBranch) {
        this.AddingFromBranch = AddingFromBranch;
    }

}
