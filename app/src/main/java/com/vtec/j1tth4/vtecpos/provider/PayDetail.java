package com.vtec.j1tth4.vtecpos.provider;

/**
 * Created by j1tth4 on 5/20/15.
 */
public class PayDetail {
    private int PayDetailID;
    private int TransactionID;
    private int ComputerID;
    private int PayTypeID;
    private double PayAmount;
    private double CashChange;
    private String CreditCardNo;
    private int ExpireMonth;
    private int ExpireYear;
    private String ChequeNumber;
    private String ChequeDate;
    private String BankName;
    private int CreditCardType;
    private String PaidByName;
    private double Paid;
    private int CardID;
    private String CardNo;
    private double PrepaidDiscountPercent;
    private double RevenueRatio;
    private int IsFromEDC;
    private String CurrencyCode;
    private String CurrencyName;
    private double MainCurrencyRatio;
    private double CurrencyRatio;
    private double CurrencyAmount;

    public int getCardID() {
        return CardID;
    }

    public void setCardID(int cardID) {
        CardID = cardID;
    }

    public int getPayDetailID() {
        return PayDetailID;
    }

    public void setPayDetailID(int payDetailID) {
        PayDetailID = payDetailID;
    }

    public int getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(int transactionID) {
        TransactionID = transactionID;
    }

    public int getComputerID() {
        return ComputerID;
    }

    public void setComputerID(int computerID) {
        ComputerID = computerID;
    }

    public int getPayTypeID() {
        return PayTypeID;
    }

    public void setPayTypeID(int payTypeID) {
        PayTypeID = payTypeID;
    }

    public double getPayAmount() {
        return PayAmount;
    }

    public void setPayAmount(double payAmount) {
        PayAmount = payAmount;
    }

    public double getCashChange() {
        return CashChange;
    }

    public void setCashChange(double cashChange) {
        CashChange = cashChange;
    }

    public String getCreditCardNo() {
        return CreditCardNo;
    }

    public void setCreditCardNo(String creditCardNo) {
        CreditCardNo = creditCardNo;
    }

    public int getExpireMonth() {
        return ExpireMonth;
    }

    public void setExpireMonth(int expireMonth) {
        ExpireMonth = expireMonth;
    }

    public int getExpireYear() {
        return ExpireYear;
    }

    public void setExpireYear(int expireYear) {
        ExpireYear = expireYear;
    }

    public String getChequeNumber() {
        return ChequeNumber;
    }

    public void setChequeNumber(String chequeNumber) {
        ChequeNumber = chequeNumber;
    }

    public String getChequeDate() {
        return ChequeDate;
    }

    public void setChequeDate(String chequeDate) {
        ChequeDate = chequeDate;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public int getCreditCardType() {
        return CreditCardType;
    }

    public void setCreditCardType(int creditCardType) {
        CreditCardType = creditCardType;
    }

    public String getPaidByName() {
        return PaidByName;
    }

    public void setPaidByName(String paidByName) {
        PaidByName = paidByName;
    }

    public double getPaid() {
        return Paid;
    }

    public void setPaid(double paid) {
        Paid = paid;
    }

    public String getCardNo() {
        return CardNo;
    }

    public void setCardNo(String cardNo) {
        CardNo = cardNo;
    }

    public double getPrepaidDiscountPercent() {
        return PrepaidDiscountPercent;
    }

    public void setPrepaidDiscountPercent(double prepaidDiscountPercent) {
        PrepaidDiscountPercent = prepaidDiscountPercent;
    }

    public double getRevenueRatio() {
        return RevenueRatio;
    }

    public void setRevenueRatio(double revenueRatio) {
        RevenueRatio = revenueRatio;
    }

    public int getIsFromEDC() {
        return IsFromEDC;
    }

    public void setIsFromEDC(int isFromEDC) {
        IsFromEDC = isFromEDC;
    }

    public String getCurrencyCode() {
        return CurrencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        CurrencyCode = currencyCode;
    }

    public String getCurrencyName() {
        return CurrencyName;
    }

    public void setCurrencyName(String currencyName) {
        CurrencyName = currencyName;
    }

    public double getMainCurrencyRatio() {
        return MainCurrencyRatio;
    }

    public void setMainCurrencyRatio(double mainCurrencyRatio) {
        MainCurrencyRatio = mainCurrencyRatio;
    }

    public double getCurrencyRatio() {
        return CurrencyRatio;
    }

    public void setCurrencyRatio(double currencyRatio) {
        CurrencyRatio = currencyRatio;
    }

    public double getCurrencyAmount() {
        return CurrencyAmount;
    }

    public void setCurrencyAmount(double currencyAmount) {
        CurrencyAmount = currencyAmount;
    }
}
