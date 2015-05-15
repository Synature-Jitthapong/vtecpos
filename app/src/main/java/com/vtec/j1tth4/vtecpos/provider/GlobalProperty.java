package com.vtec.j1tth4.vtecpos.provider;

/**
 * Created by j1tth4 on 5/15/15.
 */
public class GlobalProperty {
    private int PropertyID;
    private int KeyID;
    private int PropertyValue;
    private String PropertyTextValue;
    private String PropertyDateValue;
    private double PropertyDecimalValue;
    private int UpdateStaffID;
    private String UpdateDate;

    public int getPropertyID() {
        return PropertyID;
    }

    public void setPropertyID(int propertyID) {
        PropertyID = propertyID;
    }

    public int getKeyID() {
        return KeyID;
    }

    public void setKeyID(int keyID) {
        KeyID = keyID;
    }

    public int getPropertyValue() {
        return PropertyValue;
    }

    public void setPropertyValue(int propertyValue) {
        PropertyValue = propertyValue;
    }

    public String getPropertyTextValue() {
        return PropertyTextValue;
    }

    public void setPropertyTextValue(String propertyTextValue) {
        PropertyTextValue = propertyTextValue;
    }

    public String getPropertyDateValue() {
        return PropertyDateValue;
    }

    public void setPropertyDateValue(String propertyDateValue) {
        PropertyDateValue = propertyDateValue;
    }

    public double getPropertyDecimalValue() {
        return PropertyDecimalValue;
    }

    public void setPropertyDecimalValue(double propertyDecimalValue) {
        PropertyDecimalValue = propertyDecimalValue;
    }

    public int getUpdateStaffID() {
        return UpdateStaffID;
    }

    public void setUpdateStaffID(int updateStaffID) {
        UpdateStaffID = updateStaffID;
    }

    public String getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(String updateDate) {
        UpdateDate = updateDate;
    }
}
