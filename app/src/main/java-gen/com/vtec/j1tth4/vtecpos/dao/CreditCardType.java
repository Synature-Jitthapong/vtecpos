package com.vtec.j1tth4.vtecpos.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table CREDIT_CARD_TYPE.
 */
public class CreditCardType {

    private int CCTypeID;
    private int CreditCardType;
    private int Deleted;

    public CreditCardType() {
    }

    public CreditCardType(int CCTypeID) {
        this.CCTypeID = CCTypeID;
    }

    public CreditCardType(int CCTypeID, int CreditCardType, int Deleted) {
        this.CCTypeID = CCTypeID;
        this.CreditCardType = CreditCardType;
        this.Deleted = Deleted;
    }

    public int getCCTypeID() {
        return CCTypeID;
    }

    public void setCCTypeID(int CCTypeID) {
        this.CCTypeID = CCTypeID;
    }

    public int getCreditCardType() {
        return CreditCardType;
    }

    public void setCreditCardType(int CreditCardType) {
        this.CreditCardType = CreditCardType;
    }

    public int getDeleted() {
        return Deleted;
    }

    public void setDeleted(int Deleted) {
        this.Deleted = Deleted;
    }

}
