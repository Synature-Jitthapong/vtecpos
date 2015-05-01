package com.vtec.j1tth4.vtecpos.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table Documenttype.
 */
public class Documenttype {

    private Integer DocumentTypeID;
    private Integer ShopID;
    private Integer ComputerID;
    private Integer DocumentStoreCode;
    private String DocumentTypeHeader;
    private String DocumentTypeName;
    private String DocumentTypeNameLang1;
    private String DocumentTypeNameLang2;
    private String DocumentTypeNameLang3;
    private String DocumentTypeNameLang4;
    private String DocumentTypeNameLang5;
    private Integer ShowOnSearch;
    private Integer MovementInStock;
    private Integer IsAddReduceDoc;
    private Integer CalculateInProfitLoss;
    private Integer CalculateNetUse;
    private Integer CalculateStandardProfitLoss;
    private Integer Deleted;

    public Documenttype() {
    }

    public Documenttype(Integer DocumentTypeID) {
        this.DocumentTypeID = DocumentTypeID;
    }

    public Documenttype(Integer DocumentTypeID, Integer ShopID, Integer ComputerID, Integer DocumentStoreCode, String DocumentTypeHeader, String DocumentTypeName, String DocumentTypeNameLang1, String DocumentTypeNameLang2, String DocumentTypeNameLang3, String DocumentTypeNameLang4, String DocumentTypeNameLang5, Integer ShowOnSearch, Integer MovementInStock, Integer IsAddReduceDoc, Integer CalculateInProfitLoss, Integer CalculateNetUse, Integer CalculateStandardProfitLoss, Integer Deleted) {
        this.DocumentTypeID = DocumentTypeID;
        this.ShopID = ShopID;
        this.ComputerID = ComputerID;
        this.DocumentStoreCode = DocumentStoreCode;
        this.DocumentTypeHeader = DocumentTypeHeader;
        this.DocumentTypeName = DocumentTypeName;
        this.DocumentTypeNameLang1 = DocumentTypeNameLang1;
        this.DocumentTypeNameLang2 = DocumentTypeNameLang2;
        this.DocumentTypeNameLang3 = DocumentTypeNameLang3;
        this.DocumentTypeNameLang4 = DocumentTypeNameLang4;
        this.DocumentTypeNameLang5 = DocumentTypeNameLang5;
        this.ShowOnSearch = ShowOnSearch;
        this.MovementInStock = MovementInStock;
        this.IsAddReduceDoc = IsAddReduceDoc;
        this.CalculateInProfitLoss = CalculateInProfitLoss;
        this.CalculateNetUse = CalculateNetUse;
        this.CalculateStandardProfitLoss = CalculateStandardProfitLoss;
        this.Deleted = Deleted;
    }

    public Integer getDocumentTypeID() {
        return DocumentTypeID;
    }

    public void setDocumentTypeID(Integer DocumentTypeID) {
        this.DocumentTypeID = DocumentTypeID;
    }

    public Integer getShopID() {
        return ShopID;
    }

    public void setShopID(Integer ShopID) {
        this.ShopID = ShopID;
    }

    public Integer getComputerID() {
        return ComputerID;
    }

    public void setComputerID(Integer ComputerID) {
        this.ComputerID = ComputerID;
    }

    public Integer getDocumentStoreCode() {
        return DocumentStoreCode;
    }

    public void setDocumentStoreCode(Integer DocumentStoreCode) {
        this.DocumentStoreCode = DocumentStoreCode;
    }

    public String getDocumentTypeHeader() {
        return DocumentTypeHeader;
    }

    public void setDocumentTypeHeader(String DocumentTypeHeader) {
        this.DocumentTypeHeader = DocumentTypeHeader;
    }

    public String getDocumentTypeName() {
        return DocumentTypeName;
    }

    public void setDocumentTypeName(String DocumentTypeName) {
        this.DocumentTypeName = DocumentTypeName;
    }

    public String getDocumentTypeNameLang1() {
        return DocumentTypeNameLang1;
    }

    public void setDocumentTypeNameLang1(String DocumentTypeNameLang1) {
        this.DocumentTypeNameLang1 = DocumentTypeNameLang1;
    }

    public String getDocumentTypeNameLang2() {
        return DocumentTypeNameLang2;
    }

    public void setDocumentTypeNameLang2(String DocumentTypeNameLang2) {
        this.DocumentTypeNameLang2 = DocumentTypeNameLang2;
    }

    public String getDocumentTypeNameLang3() {
        return DocumentTypeNameLang3;
    }

    public void setDocumentTypeNameLang3(String DocumentTypeNameLang3) {
        this.DocumentTypeNameLang3 = DocumentTypeNameLang3;
    }

    public String getDocumentTypeNameLang4() {
        return DocumentTypeNameLang4;
    }

    public void setDocumentTypeNameLang4(String DocumentTypeNameLang4) {
        this.DocumentTypeNameLang4 = DocumentTypeNameLang4;
    }

    public String getDocumentTypeNameLang5() {
        return DocumentTypeNameLang5;
    }

    public void setDocumentTypeNameLang5(String DocumentTypeNameLang5) {
        this.DocumentTypeNameLang5 = DocumentTypeNameLang5;
    }

    public Integer getShowOnSearch() {
        return ShowOnSearch;
    }

    public void setShowOnSearch(Integer ShowOnSearch) {
        this.ShowOnSearch = ShowOnSearch;
    }

    public Integer getMovementInStock() {
        return MovementInStock;
    }

    public void setMovementInStock(Integer MovementInStock) {
        this.MovementInStock = MovementInStock;
    }

    public Integer getIsAddReduceDoc() {
        return IsAddReduceDoc;
    }

    public void setIsAddReduceDoc(Integer IsAddReduceDoc) {
        this.IsAddReduceDoc = IsAddReduceDoc;
    }

    public Integer getCalculateInProfitLoss() {
        return CalculateInProfitLoss;
    }

    public void setCalculateInProfitLoss(Integer CalculateInProfitLoss) {
        this.CalculateInProfitLoss = CalculateInProfitLoss;
    }

    public Integer getCalculateNetUse() {
        return CalculateNetUse;
    }

    public void setCalculateNetUse(Integer CalculateNetUse) {
        this.CalculateNetUse = CalculateNetUse;
    }

    public Integer getCalculateStandardProfitLoss() {
        return CalculateStandardProfitLoss;
    }

    public void setCalculateStandardProfitLoss(Integer CalculateStandardProfitLoss) {
        this.CalculateStandardProfitLoss = CalculateStandardProfitLoss;
    }

    public Integer getDeleted() {
        return Deleted;
    }

    public void setDeleted(Integer Deleted) {
        this.Deleted = Deleted;
    }

}