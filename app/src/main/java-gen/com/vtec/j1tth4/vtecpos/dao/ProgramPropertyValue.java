package com.vtec.j1tth4.vtecpos.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table ProgramPropertyValue.
 */
public class ProgramPropertyValue {

    private Integer PropertyID;
    private Integer KeyID;
    private Integer PropertyValue;
    private String PropertyTextValue;
    private String PropertyDateValue;
    private Double PropertyDecimalValue;
    private Integer UpdateStaffID;
    private String UpdateDate;

    public ProgramPropertyValue() {
    }

    public ProgramPropertyValue(Integer PropertyID, Integer KeyID) {
        this.PropertyID = PropertyID;
        this.KeyID = KeyID;
    }

    public ProgramPropertyValue(Integer PropertyID, Integer KeyID, Integer PropertyValue, String PropertyTextValue, String PropertyDateValue, Double PropertyDecimalValue, Integer UpdateStaffID, String UpdateDate) {
        this.PropertyID = PropertyID;
        this.KeyID = KeyID;
        this.PropertyValue = PropertyValue;
        this.PropertyTextValue = PropertyTextValue;
        this.PropertyDateValue = PropertyDateValue;
        this.PropertyDecimalValue = PropertyDecimalValue;
        this.UpdateStaffID = UpdateStaffID;
        this.UpdateDate = UpdateDate;
    }

    public Integer getPropertyID() {
        return PropertyID;
    }

    public void setPropertyID(Integer PropertyID) {
        this.PropertyID = PropertyID;
    }

    public Integer getKeyID() {
        return KeyID;
    }

    public void setKeyID(Integer KeyID) {
        this.KeyID = KeyID;
    }

    public Integer getPropertyValue() {
        return PropertyValue;
    }

    public void setPropertyValue(Integer PropertyValue) {
        this.PropertyValue = PropertyValue;
    }

    public String getPropertyTextValue() {
        return PropertyTextValue;
    }

    public void setPropertyTextValue(String PropertyTextValue) {
        this.PropertyTextValue = PropertyTextValue;
    }

    public String getPropertyDateValue() {
        return PropertyDateValue;
    }

    public void setPropertyDateValue(String PropertyDateValue) {
        this.PropertyDateValue = PropertyDateValue;
    }

    public Double getPropertyDecimalValue() {
        return PropertyDecimalValue;
    }

    public void setPropertyDecimalValue(Double PropertyDecimalValue) {
        this.PropertyDecimalValue = PropertyDecimalValue;
    }

    public Integer getUpdateStaffID() {
        return UpdateStaffID;
    }

    public void setUpdateStaffID(Integer UpdateStaffID) {
        this.UpdateStaffID = UpdateStaffID;
    }

    public String getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(String UpdateDate) {
        this.UpdateDate = UpdateDate;
    }

}
