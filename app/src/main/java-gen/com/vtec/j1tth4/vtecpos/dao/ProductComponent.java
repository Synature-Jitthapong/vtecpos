package com.vtec.j1tth4.vtecpos.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table ProductComponent.
 */
public class ProductComponent {

    private Integer PGroupID;
    private Integer ProductID;
    private Integer SaleMode;
    private Integer MaterialID;
    private Double MaterialAmount;
    private Integer UnitSmallID;
    private Integer ShowOnOrder;
    private Integer DataType;
    private Double FlexibleProductPrice;
    private Integer FlexibleProductIncludePrice;
    private Integer Ordering;
    private Integer AddingFromBranch;

    public ProductComponent() {
    }

    public ProductComponent(Integer PGroupID, Integer ProductID, Integer SaleMode, Integer MaterialID) {
        this.PGroupID = PGroupID;
        this.ProductID = ProductID;
        this.SaleMode = SaleMode;
        this.MaterialID = MaterialID;
    }

    public ProductComponent(Integer PGroupID, Integer ProductID, Integer SaleMode, Integer MaterialID, Double MaterialAmount, Integer UnitSmallID, Integer ShowOnOrder, Integer DataType, Double FlexibleProductPrice, Integer FlexibleProductIncludePrice, Integer Ordering, Integer AddingFromBranch) {
        this.PGroupID = PGroupID;
        this.ProductID = ProductID;
        this.SaleMode = SaleMode;
        this.MaterialID = MaterialID;
        this.MaterialAmount = MaterialAmount;
        this.UnitSmallID = UnitSmallID;
        this.ShowOnOrder = ShowOnOrder;
        this.DataType = DataType;
        this.FlexibleProductPrice = FlexibleProductPrice;
        this.FlexibleProductIncludePrice = FlexibleProductIncludePrice;
        this.Ordering = Ordering;
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

    public Integer getMaterialID() {
        return MaterialID;
    }

    public void setMaterialID(Integer MaterialID) {
        this.MaterialID = MaterialID;
    }

    public Double getMaterialAmount() {
        return MaterialAmount;
    }

    public void setMaterialAmount(Double MaterialAmount) {
        this.MaterialAmount = MaterialAmount;
    }

    public Integer getUnitSmallID() {
        return UnitSmallID;
    }

    public void setUnitSmallID(Integer UnitSmallID) {
        this.UnitSmallID = UnitSmallID;
    }

    public Integer getShowOnOrder() {
        return ShowOnOrder;
    }

    public void setShowOnOrder(Integer ShowOnOrder) {
        this.ShowOnOrder = ShowOnOrder;
    }

    public Integer getDataType() {
        return DataType;
    }

    public void setDataType(Integer DataType) {
        this.DataType = DataType;
    }

    public Double getFlexibleProductPrice() {
        return FlexibleProductPrice;
    }

    public void setFlexibleProductPrice(Double FlexibleProductPrice) {
        this.FlexibleProductPrice = FlexibleProductPrice;
    }

    public Integer getFlexibleProductIncludePrice() {
        return FlexibleProductIncludePrice;
    }

    public void setFlexibleProductIncludePrice(Integer FlexibleProductIncludePrice) {
        this.FlexibleProductIncludePrice = FlexibleProductIncludePrice;
    }

    public Integer getOrdering() {
        return Ordering;
    }

    public void setOrdering(Integer Ordering) {
        this.Ordering = Ordering;
    }

    public Integer getAddingFromBranch() {
        return AddingFromBranch;
    }

    public void setAddingFromBranch(Integer AddingFromBranch) {
        this.AddingFromBranch = AddingFromBranch;
    }

}
