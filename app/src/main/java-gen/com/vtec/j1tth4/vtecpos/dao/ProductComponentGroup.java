package com.vtec.j1tth4.vtecpos.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table ProductComponentGroup.
 */
public class ProductComponentGroup {

    private Integer PGroupID;
    private Integer ProductID;
    private Integer SaleMode;
    private String StartDate;
    private String EndDate;
    private Integer SetGroupNo;
    private String SetGroupName;
    private Integer RequireAddAmountForProduct;
    private Integer AddingFromBranch;

    public ProductComponentGroup() {
    }

    public ProductComponentGroup(Integer PGroupID) {
        this.PGroupID = PGroupID;
    }

    public ProductComponentGroup(Integer PGroupID, Integer ProductID, Integer SaleMode, String StartDate, String EndDate, Integer SetGroupNo, String SetGroupName, Integer RequireAddAmountForProduct, Integer AddingFromBranch) {
        this.PGroupID = PGroupID;
        this.ProductID = ProductID;
        this.SaleMode = SaleMode;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
        this.SetGroupNo = SetGroupNo;
        this.SetGroupName = SetGroupName;
        this.RequireAddAmountForProduct = RequireAddAmountForProduct;
        this.AddingFromBranch = AddingFromBranch;
    }

    public Integer getPGroupID() {
        return PGroupID;
    }

    public void setPGroupID(Integer PGroupID) {
        this.PGroupID = PGroupID;
    }

    public Integer getProductID() {
        return ProductID;
    }

    public void setProductID(Integer ProductID) {
        this.ProductID = ProductID;
    }

    public Integer getSaleMode() {
        return SaleMode;
    }

    public void setSaleMode(Integer SaleMode) {
        this.SaleMode = SaleMode;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public Integer getSetGroupNo() {
        return SetGroupNo;
    }

    public void setSetGroupNo(Integer SetGroupNo) {
        this.SetGroupNo = SetGroupNo;
    }

    public String getSetGroupName() {
        return SetGroupName;
    }

    public void setSetGroupName(String SetGroupName) {
        this.SetGroupName = SetGroupName;
    }

    public Integer getRequireAddAmountForProduct() {
        return RequireAddAmountForProduct;
    }

    public void setRequireAddAmountForProduct(Integer RequireAddAmountForProduct) {
        this.RequireAddAmountForProduct = RequireAddAmountForProduct;
    }

    public Integer getAddingFromBranch() {
        return AddingFromBranch;
    }

    public void setAddingFromBranch(Integer AddingFromBranch) {
        this.AddingFromBranch = AddingFromBranch;
    }

}
