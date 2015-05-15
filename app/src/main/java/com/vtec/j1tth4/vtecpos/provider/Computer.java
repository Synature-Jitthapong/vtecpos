package com.vtec.j1tth4.vtecpos.provider;

/**
 * Created by j1tth4 on 5/15/15.
 */
public class Computer {
    private int ComputerID;
    private String ComputerName;
    private int ShopID;
    private int ComputerType;
    private String IPAddress;
    private String RegistrationNumber;
    private String DeviceCode;
    private int KDSID;
    private String Description;
    private int Deleted;

    public int getComputerID() {
        return ComputerID;
    }

    public void setComputerID(int computerID) {
        ComputerID = computerID;
    }

    public String getComputerName() {
        return ComputerName;
    }

    public void setComputerName(String computerName) {
        ComputerName = computerName;
    }

    public int getShopID() {
        return ShopID;
    }

    public void setShopID(int shopID) {
        ShopID = shopID;
    }

    public int getComputerType() {
        return ComputerType;
    }

    public void setComputerType(int computerType) {
        ComputerType = computerType;
    }

    public String getIPAddress() {
        return IPAddress;
    }

    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    public String getRegistrationNumber() {
        return RegistrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        RegistrationNumber = registrationNumber;
    }

    public String getDeviceCode() {
        return DeviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        DeviceCode = deviceCode;
    }

    public int getKDSID() {
        return KDSID;
    }

    public void setKDSID(int KDSID) {
        this.KDSID = KDSID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getDeleted() {
        return Deleted;
    }

    public void setDeleted(int deleted) {
        Deleted = deleted;
    }
}
