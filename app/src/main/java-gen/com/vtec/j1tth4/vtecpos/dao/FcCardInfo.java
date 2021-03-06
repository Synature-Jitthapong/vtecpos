package com.vtec.j1tth4.vtecpos.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table fc_cardinfo.
 */
public class FcCardInfo {

    private Integer CardID;
    private String CardNo;
    private Integer CardStatus;
    private Integer LogID;
    private Double CardDepositAmount;
    private Double CardCurrentAmount;
    private Double CardLimitAmount;
    private Integer CreateStaffID;
    private Integer UpdateStaffID;
    private Integer MemberID;
    private String CreateDate;
    private String UpdateDate;
    private String ExpireDate;
    private Integer Deleted;

    public FcCardInfo() {
    }

    public FcCardInfo(Integer CardID) {
        this.CardID = CardID;
    }

    public FcCardInfo(Integer CardID, String CardNo, Integer CardStatus, Integer LogID, Double CardDepositAmount, Double CardCurrentAmount, Double CardLimitAmount, Integer CreateStaffID, Integer UpdateStaffID, Integer MemberID, String CreateDate, String UpdateDate, String ExpireDate, Integer Deleted) {
        this.CardID = CardID;
        this.CardNo = CardNo;
        this.CardStatus = CardStatus;
        this.LogID = LogID;
        this.CardDepositAmount = CardDepositAmount;
        this.CardCurrentAmount = CardCurrentAmount;
        this.CardLimitAmount = CardLimitAmount;
        this.CreateStaffID = CreateStaffID;
        this.UpdateStaffID = UpdateStaffID;
        this.MemberID = MemberID;
        this.CreateDate = CreateDate;
        this.UpdateDate = UpdateDate;
        this.ExpireDate = ExpireDate;
        this.Deleted = Deleted;
    }

    public Integer getCardID() {
        return CardID;
    }

    public void setCardID(Integer CardID) {
        this.CardID = CardID;
    }

    public String getCardNo() {
        return CardNo;
    }

    public void setCardNo(String CardNo) {
        this.CardNo = CardNo;
    }

    public Integer getCardStatus() {
        return CardStatus;
    }

    public void setCardStatus(Integer CardStatus) {
        this.CardStatus = CardStatus;
    }

    public Integer getLogID() {
        return LogID;
    }

    public void setLogID(Integer LogID) {
        this.LogID = LogID;
    }

    public Double getCardDepositAmount() {
        return CardDepositAmount;
    }

    public void setCardDepositAmount(Double CardDepositAmount) {
        this.CardDepositAmount = CardDepositAmount;
    }

    public Double getCardCurrentAmount() {
        return CardCurrentAmount;
    }

    public void setCardCurrentAmount(Double CardCurrentAmount) {
        this.CardCurrentAmount = CardCurrentAmount;
    }

    public Double getCardLimitAmount() {
        return CardLimitAmount;
    }

    public void setCardLimitAmount(Double CardLimitAmount) {
        this.CardLimitAmount = CardLimitAmount;
    }

    public Integer getCreateStaffID() {
        return CreateStaffID;
    }

    public void setCreateStaffID(Integer CreateStaffID) {
        this.CreateStaffID = CreateStaffID;
    }

    public Integer getUpdateStaffID() {
        return UpdateStaffID;
    }

    public void setUpdateStaffID(Integer UpdateStaffID) {
        this.UpdateStaffID = UpdateStaffID;
    }

    public Integer getMemberID() {
        return MemberID;
    }

    public void setMemberID(Integer MemberID) {
        this.MemberID = MemberID;
    }

    public String getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
    }

    public String getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(String UpdateDate) {
        this.UpdateDate = UpdateDate;
    }

    public String getExpireDate() {
        return ExpireDate;
    }

    public void setExpireDate(String ExpireDate) {
        this.ExpireDate = ExpireDate;
    }

    public Integer getDeleted() {
        return Deleted;
    }

    public void setDeleted(Integer Deleted) {
        this.Deleted = Deleted;
    }

}
