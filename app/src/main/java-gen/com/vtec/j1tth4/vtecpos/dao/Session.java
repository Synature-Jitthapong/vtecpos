package com.vtec.j1tth4.vtecpos.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table SESSION.
 */
public class Session {

    private int SessionID;
    private int ComputerID;
    private int OpenStaffID;
    private Integer CloseStaffID;
    private java.util.Date OpenSessionDateTime;
    private java.util.Date CloseSessionDateTime;
    private java.util.Date SessionDate;
    private double OpenSessionAmount;
    private Double CashAmount;
    private Double CashInAmount;
    private Double CashOutAmount;
    private Double CloseSessionAmount;
    private Double CashShortOver;
    private java.util.Date SessionUpdateDate;
    private Integer ShopID;
    private Integer IsEndDaySession;

    public Session() {
    }

    public Session(int SessionID) {
        this.SessionID = SessionID;
    }

    public Session(int SessionID, int ComputerID, int OpenStaffID, Integer CloseStaffID, java.util.Date OpenSessionDateTime, java.util.Date CloseSessionDateTime, java.util.Date SessionDate, double OpenSessionAmount, Double CashAmount, Double CashInAmount, Double CashOutAmount, Double CloseSessionAmount, Double CashShortOver, java.util.Date SessionUpdateDate, Integer ShopID, Integer IsEndDaySession) {
        this.SessionID = SessionID;
        this.ComputerID = ComputerID;
        this.OpenStaffID = OpenStaffID;
        this.CloseStaffID = CloseStaffID;
        this.OpenSessionDateTime = OpenSessionDateTime;
        this.CloseSessionDateTime = CloseSessionDateTime;
        this.SessionDate = SessionDate;
        this.OpenSessionAmount = OpenSessionAmount;
        this.CashAmount = CashAmount;
        this.CashInAmount = CashInAmount;
        this.CashOutAmount = CashOutAmount;
        this.CloseSessionAmount = CloseSessionAmount;
        this.CashShortOver = CashShortOver;
        this.SessionUpdateDate = SessionUpdateDate;
        this.ShopID = ShopID;
        this.IsEndDaySession = IsEndDaySession;
    }

    public int getSessionID() {
        return SessionID;
    }

    public void setSessionID(int SessionID) {
        this.SessionID = SessionID;
    }

    public int getComputerID() {
        return ComputerID;
    }

    public void setComputerID(int ComputerID) {
        this.ComputerID = ComputerID;
    }

    public int getOpenStaffID() {
        return OpenStaffID;
    }

    public void setOpenStaffID(int OpenStaffID) {
        this.OpenStaffID = OpenStaffID;
    }

    public Integer getCloseStaffID() {
        return CloseStaffID;
    }

    public void setCloseStaffID(Integer CloseStaffID) {
        this.CloseStaffID = CloseStaffID;
    }

    public java.util.Date getOpenSessionDateTime() {
        return OpenSessionDateTime;
    }

    public void setOpenSessionDateTime(java.util.Date OpenSessionDateTime) {
        this.OpenSessionDateTime = OpenSessionDateTime;
    }

    public java.util.Date getCloseSessionDateTime() {
        return CloseSessionDateTime;
    }

    public void setCloseSessionDateTime(java.util.Date CloseSessionDateTime) {
        this.CloseSessionDateTime = CloseSessionDateTime;
    }

    public java.util.Date getSessionDate() {
        return SessionDate;
    }

    public void setSessionDate(java.util.Date SessionDate) {
        this.SessionDate = SessionDate;
    }

    public double getOpenSessionAmount() {
        return OpenSessionAmount;
    }

    public void setOpenSessionAmount(double OpenSessionAmount) {
        this.OpenSessionAmount = OpenSessionAmount;
    }

    public Double getCashAmount() {
        return CashAmount;
    }

    public void setCashAmount(Double CashAmount) {
        this.CashAmount = CashAmount;
    }

    public Double getCashInAmount() {
        return CashInAmount;
    }

    public void setCashInAmount(Double CashInAmount) {
        this.CashInAmount = CashInAmount;
    }

    public Double getCashOutAmount() {
        return CashOutAmount;
    }

    public void setCashOutAmount(Double CashOutAmount) {
        this.CashOutAmount = CashOutAmount;
    }

    public Double getCloseSessionAmount() {
        return CloseSessionAmount;
    }

    public void setCloseSessionAmount(Double CloseSessionAmount) {
        this.CloseSessionAmount = CloseSessionAmount;
    }

    public Double getCashShortOver() {
        return CashShortOver;
    }

    public void setCashShortOver(Double CashShortOver) {
        this.CashShortOver = CashShortOver;
    }

    public java.util.Date getSessionUpdateDate() {
        return SessionUpdateDate;
    }

    public void setSessionUpdateDate(java.util.Date SessionUpdateDate) {
        this.SessionUpdateDate = SessionUpdateDate;
    }

    public Integer getShopID() {
        return ShopID;
    }

    public void setShopID(Integer ShopID) {
        this.ShopID = ShopID;
    }

    public Integer getIsEndDaySession() {
        return IsEndDaySession;
    }

    public void setIsEndDaySession(Integer IsEndDaySession) {
        this.IsEndDaySession = IsEndDaySession;
    }

}
