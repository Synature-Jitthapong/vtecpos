package com.vtec.j1tth4.vtecpos.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table ShopCategory.
 */
public class ShopCategory {

    private Integer ShopCatID;
    private Integer ShopCatGroupID;
    private String ShopCatName;
    private Integer LangID;
    private Integer Deleted;

    public ShopCategory() {
    }

    public ShopCategory(Integer ShopCatID) {
        this.ShopCatID = ShopCatID;
    }

    public ShopCategory(Integer ShopCatID, Integer ShopCatGroupID, String ShopCatName, Integer LangID, Integer Deleted) {
        this.ShopCatID = ShopCatID;
        this.ShopCatGroupID = ShopCatGroupID;
        this.ShopCatName = ShopCatName;
        this.LangID = LangID;
        this.Deleted = Deleted;
    }

    public Integer getShopCatID() {
        return ShopCatID;
    }

    public void setShopCatID(Integer ShopCatID) {
        this.ShopCatID = ShopCatID;
    }

    public Integer getShopCatGroupID() {
        return ShopCatGroupID;
    }

    public void setShopCatGroupID(Integer ShopCatGroupID) {
        this.ShopCatGroupID = ShopCatGroupID;
    }

    public String getShopCatName() {
        return ShopCatName;
    }

    public void setShopCatName(String ShopCatName) {
        this.ShopCatName = ShopCatName;
    }

    public Integer getLangID() {
        return LangID;
    }

    public void setLangID(Integer LangID) {
        this.LangID = LangID;
    }

    public Integer getDeleted() {
        return Deleted;
    }

    public void setDeleted(Integer Deleted) {
        this.Deleted = Deleted;
    }

}
