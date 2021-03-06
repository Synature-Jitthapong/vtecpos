package com.vtec.j1tth4.vtecpos.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table ProductGroup.
 */
public class ProductGroup {

    private int ProductGroupID;
    private Integer ShopID;
    private String ProductGroupCode;
    private String ProductGroupName;
    private String ProductGroupNameLang1;
    private String ProductGroupNameLang2;
    private String ProductGroupNameLang3;
    private String ProductGroupNameLang4;
    private String ProductGroupNameLang5;
    private int ProductGroupActivate;
    private int ProductGroupSaleMode;
    private int ProductGroupType;
    private int ProductGroupOrdering;
    private int PrintDeptForSession;
    private int DisplayMobile;
    private int IsComment;
    private int AddingFromBranch;
    private int Deleted;

    public ProductGroup() {
    }

    public ProductGroup(int ProductGroupID) {
        this.ProductGroupID = ProductGroupID;
    }

    public ProductGroup(int ProductGroupID, Integer ShopID, String ProductGroupCode, String ProductGroupName, String ProductGroupNameLang1, String ProductGroupNameLang2, String ProductGroupNameLang3, String ProductGroupNameLang4, String ProductGroupNameLang5, int ProductGroupActivate, int ProductGroupSaleMode, int ProductGroupType, int ProductGroupOrdering, int PrintDeptForSession, int DisplayMobile, int IsComment, int AddingFromBranch, int Deleted) {
        this.ProductGroupID = ProductGroupID;
        this.ShopID = ShopID;
        this.ProductGroupCode = ProductGroupCode;
        this.ProductGroupName = ProductGroupName;
        this.ProductGroupNameLang1 = ProductGroupNameLang1;
        this.ProductGroupNameLang2 = ProductGroupNameLang2;
        this.ProductGroupNameLang3 = ProductGroupNameLang3;
        this.ProductGroupNameLang4 = ProductGroupNameLang4;
        this.ProductGroupNameLang5 = ProductGroupNameLang5;
        this.ProductGroupActivate = ProductGroupActivate;
        this.ProductGroupSaleMode = ProductGroupSaleMode;
        this.ProductGroupType = ProductGroupType;
        this.ProductGroupOrdering = ProductGroupOrdering;
        this.PrintDeptForSession = PrintDeptForSession;
        this.DisplayMobile = DisplayMobile;
        this.IsComment = IsComment;
        this.AddingFromBranch = AddingFromBranch;
        this.Deleted = Deleted;
    }

    public int getProductGroupID() {
        return ProductGroupID;
    }

    public void setProductGroupID(int ProductGroupID) {
        this.ProductGroupID = ProductGroupID;
    }

    public Integer getShopID() {
        return ShopID;
    }

    public void setShopID(Integer ShopID) {
        this.ShopID = ShopID;
    }

    public String getProductGroupCode() {
        return ProductGroupCode;
    }

    public void setProductGroupCode(String ProductGroupCode) {
        this.ProductGroupCode = ProductGroupCode;
    }

    public String getProductGroupName() {
        return ProductGroupName;
    }

    public void setProductGroupName(String ProductGroupName) {
        this.ProductGroupName = ProductGroupName;
    }

    public String getProductGroupNameLang1() {
        return ProductGroupNameLang1;
    }

    public void setProductGroupNameLang1(String ProductGroupNameLang1) {
        this.ProductGroupNameLang1 = ProductGroupNameLang1;
    }

    public String getProductGroupNameLang2() {
        return ProductGroupNameLang2;
    }

    public void setProductGroupNameLang2(String ProductGroupNameLang2) {
        this.ProductGroupNameLang2 = ProductGroupNameLang2;
    }

    public String getProductGroupNameLang3() {
        return ProductGroupNameLang3;
    }

    public void setProductGroupNameLang3(String ProductGroupNameLang3) {
        this.ProductGroupNameLang3 = ProductGroupNameLang3;
    }

    public String getProductGroupNameLang4() {
        return ProductGroupNameLang4;
    }

    public void setProductGroupNameLang4(String ProductGroupNameLang4) {
        this.ProductGroupNameLang4 = ProductGroupNameLang4;
    }

    public String getProductGroupNameLang5() {
        return ProductGroupNameLang5;
    }

    public void setProductGroupNameLang5(String ProductGroupNameLang5) {
        this.ProductGroupNameLang5 = ProductGroupNameLang5;
    }

    public int getProductGroupActivate() {
        return ProductGroupActivate;
    }

    public void setProductGroupActivate(int ProductGroupActivate) {
        this.ProductGroupActivate = ProductGroupActivate;
    }

    public int getProductGroupSaleMode() {
        return ProductGroupSaleMode;
    }

    public void setProductGroupSaleMode(int ProductGroupSaleMode) {
        this.ProductGroupSaleMode = ProductGroupSaleMode;
    }

    public int getProductGroupType() {
        return ProductGroupType;
    }

    public void setProductGroupType(int ProductGroupType) {
        this.ProductGroupType = ProductGroupType;
    }

    public int getProductGroupOrdering() {
        return ProductGroupOrdering;
    }

    public void setProductGroupOrdering(int ProductGroupOrdering) {
        this.ProductGroupOrdering = ProductGroupOrdering;
    }

    public int getPrintDeptForSession() {
        return PrintDeptForSession;
    }

    public void setPrintDeptForSession(int PrintDeptForSession) {
        this.PrintDeptForSession = PrintDeptForSession;
    }

    public int getDisplayMobile() {
        return DisplayMobile;
    }

    public void setDisplayMobile(int DisplayMobile) {
        this.DisplayMobile = DisplayMobile;
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

    public int getDeleted() {
        return Deleted;
    }

    public void setDeleted(int Deleted) {
        this.Deleted = Deleted;
    }

}
