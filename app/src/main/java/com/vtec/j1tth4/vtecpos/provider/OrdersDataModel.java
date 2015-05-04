package com.vtec.j1tth4.vtecpos.provider;

/**
 * Created by j1tth4 on 5/1/15 AD.
 */
public class OrdersDataModel {
    private int transactionId;
    private int computerId;
    private String transactionUUID;
    private String reserveTime;
    private int reserveStaffId;
    private String openTime;
    private int openStaffId;
    private String paidTime;
    private int paidStaffId;
    private String closeTime;
    private int commStaffId;
    private double discountItem;
    private double discountBill;
    private double discountOther;
    private double totalDiscount;
    private int transactionStatusId;
    private int saleMode;
    private String transactionName;
    private String queueName;
    private int noCustomer;
    private int noCustomerWhenOpen;
    private int docType;
    private int receiptYear;
    private int receiptMonth;
    private int receiptId;
    private String receiptNumber;
    private String saleDate;
    private int shopId;
    private double transactionVAT;
    private double transactionVATable;
    private double tranBeforeVAT;
    private String vatCode;
    private double vatPercent;
    private double serviceChargePercent;
    private double serviceCharge;
    private double serviceChargeVAT;
    private double scBeforeVAT;
    private double otherIncome;
    private double otherIncomeVAT;
    private double otherIncomeBeforeVAT;
    private double receiptTotalQty;
    private double receiptRetailPrice;
    private double receiptDiscount;
    private double receiptSalePrice;
    private double receiptNetSale;
    private double receiptPayPrice;
    private double receiptRoundingBill;
    private int sessionId;
    private int closeComputerId;
    private int voidStaffId;
    private String voidReason;
    private String voidTime;
    private int isCloneBill;
    private int voidTranId;
    private int voidComId;
    private double diffCloneBill;
    private int memberId;
    private int hasOrder;
    private int noPrintBillDetail;
    private double diffPayCheckBill;
    private String billDetailReferenceNo;
    private int callForCheckBill;
    private String transactionNote;
    private int currentAccessComputer;
    private String updateDate;
    private String beginTime;
    private String endTime;
    private String printWarningTime;
    private String printBeginTime;
    private int alreadyCalculateStock;
    private int alreadyExportToHQ;
    private int tableId;
    private int isSplitTransaction;
    private int isFromOtherTransaction;
    private String referenceNo;
    private int fromDepositTransactionId;
    private int fromDepositComputerId;
    private int deleted;

    public OrdersDataModel(){
    }

    public OrdersDataModel(int transactionId, int computerId, String transactionUUID, String reserveTime, int reserveStaffId, String openTime, int openStaffId, String paidTime, int paidStaffId, String closeTime, int commStaffId, double discountItem, double discountBill, double discountOther, double totalDiscount, int transactionStatusId, int saleMode, String transactionName, String queueName, int noCustomer, int noCustomerWhenOpen, int docType, int receiptYear, int receiptMonth, int receiptId, String receiptNumber, String saleDate, int shopId, double transactionVAT, double transactionVATable, double tranBeforeVAT, String vatCode, double vatPercent, double serviceChargePercent, double serviceCharge, double serviceChargeVAT, double scBeforeVAT, double otherIncome, double otherIncomeVAT, double otherIncomeBeforeVAT, double receiptTotalQty, double receiptRetailPrice, double receiptDiscount, double receiptSalePrice, double receiptNetSale, double receiptPayPrice, double receiptRoundingBill, int sessionId, int closeComputerId, int voidStaffId, String voidReason, String voidTime, int isCloneBill, int voidTranId, int voidComId, double diffCloneBill, int memberId, int hasOrder, int noPrintBillDetail, double diffPayCheckBill, String billDetailReferenceNo, int callForCheckBill, String transactionNote, int currentAccessComputer, String updateDate, String beginTime, String endTime, String printWarningTime, String printBeginTime, int alreadyCalculateStock, int alreadyExportToHQ, int tableId, int isSplitTransaction, int isFromOtherTransaction, String referenceNo, int fromDepositTransactionId, int fromDepositComputerId, int deleted) {
        this.transactionId = transactionId;
        this.computerId = computerId;
        this.transactionUUID = transactionUUID;
        this.reserveTime = reserveTime;
        this.reserveStaffId = reserveStaffId;
        this.openTime = openTime;
        this.openStaffId = openStaffId;
        this.paidTime = paidTime;
        this.paidStaffId = paidStaffId;
        this.closeTime = closeTime;
        this.commStaffId = commStaffId;
        this.discountItem = discountItem;
        this.discountBill = discountBill;
        this.discountOther = discountOther;
        this.totalDiscount = totalDiscount;
        this.transactionStatusId = transactionStatusId;
        this.saleMode = saleMode;
        this.transactionName = transactionName;
        this.queueName = queueName;
        this.noCustomer = noCustomer;
        this.noCustomerWhenOpen = noCustomerWhenOpen;
        this.docType = docType;
        this.receiptYear = receiptYear;
        this.receiptMonth = receiptMonth;
        this.receiptId = receiptId;
        this.receiptNumber = receiptNumber;
        this.saleDate = saleDate;
        this.shopId = shopId;
        this.transactionVAT = transactionVAT;
        this.transactionVATable = transactionVATable;
        this.tranBeforeVAT = tranBeforeVAT;
        this.vatCode = vatCode;
        this.vatPercent = vatPercent;
        this.serviceChargePercent = serviceChargePercent;
        this.serviceCharge = serviceCharge;
        this.serviceChargeVAT = serviceChargeVAT;
        this.scBeforeVAT = scBeforeVAT;
        this.otherIncome = otherIncome;
        this.otherIncomeVAT = otherIncomeVAT;
        this.otherIncomeBeforeVAT = otherIncomeBeforeVAT;
        this.receiptTotalQty = receiptTotalQty;
        this.receiptRetailPrice = receiptRetailPrice;
        this.receiptDiscount = receiptDiscount;
        this.receiptSalePrice = receiptSalePrice;
        this.receiptNetSale = receiptNetSale;
        this.receiptPayPrice = receiptPayPrice;
        this.receiptRoundingBill = receiptRoundingBill;
        this.sessionId = sessionId;
        this.closeComputerId = closeComputerId;
        this.voidStaffId = voidStaffId;
        this.voidReason = voidReason;
        this.voidTime = voidTime;
        this.isCloneBill = isCloneBill;
        this.voidTranId = voidTranId;
        this.voidComId = voidComId;
        this.diffCloneBill = diffCloneBill;
        this.memberId = memberId;
        this.hasOrder = hasOrder;
        this.noPrintBillDetail = noPrintBillDetail;
        this.diffPayCheckBill = diffPayCheckBill;
        this.billDetailReferenceNo = billDetailReferenceNo;
        this.callForCheckBill = callForCheckBill;
        this.transactionNote = transactionNote;
        this.currentAccessComputer = currentAccessComputer;
        this.updateDate = updateDate;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.printWarningTime = printWarningTime;
        this.printBeginTime = printBeginTime;
        this.alreadyCalculateStock = alreadyCalculateStock;
        this.alreadyExportToHQ = alreadyExportToHQ;
        this.tableId = tableId;
        this.isSplitTransaction = isSplitTransaction;
        this.isFromOtherTransaction = isFromOtherTransaction;
        this.referenceNo = referenceNo;
        this.fromDepositTransactionId = fromDepositTransactionId;
        this.fromDepositComputerId = fromDepositComputerId;
        this.deleted = deleted;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getComputerId() {
        return computerId;
    }

    public void setComputerId(int computerId) {
        this.computerId = computerId;
    }

    public String getTransactionUUID() {
        return transactionUUID;
    }

    public void setTransactionUUID(String transactionUUID) {
        this.transactionUUID = transactionUUID;
    }

    public String getReserveTime() {
        return reserveTime;
    }

    public void setReserveTime(String reserveTime) {
        this.reserveTime = reserveTime;
    }

    public int getReserveStaffId() {
        return reserveStaffId;
    }

    public void setReserveStaffID(int reserveStaffId) {
        this.reserveStaffId = reserveStaffId;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public int getOpenStaffId() {
        return openStaffId;
    }

    public void setOpenStaffId(int openStaffId) {
        this.openStaffId = openStaffId;
    }

    public String getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(String paidTime) {
        this.paidTime = paidTime;
    }

    public int getPaidStaffId() {
        return paidStaffId;
    }

    public void setPaidStaffId(int paidStaffId) {
        this.paidStaffId = paidStaffId;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public int getCommStaffId() {
        return commStaffId;
    }

    public void setCommStaffId(int commStaffId) {
        this.commStaffId = commStaffId;
    }

    public double getDiscountItem() {
        return discountItem;
    }

    public void setDiscountItem(double discountItem) {
        this.discountItem = discountItem;
    }

    public double getDiscountBill() {
        return discountBill;
    }

    public void setDiscountBill(double discountBill) {
        this.discountBill = discountBill;
    }

    public double getDiscountOther() {
        return discountOther;
    }

    public void setDiscountOther(double discountOther) {
        this.discountOther = discountOther;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public int getTransactionStatusId() {
        return transactionStatusId;
    }

    public void setTransactionStatusId(int transactionStatusId) {
        this.transactionStatusId = transactionStatusId;
    }

    public int getSaleMode() {
        return saleMode;
    }

    public void setSaleMode(int saleMode) {
        this.saleMode = saleMode;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public int getNoCustomer() {
        return noCustomer;
    }

    public void setNoCustomer(int noCustomer) {
        this.noCustomer = noCustomer;
    }

    public int getNoCustomerWhenOpen() {
        return noCustomerWhenOpen;
    }

    public void setNoCustomerWhenOpen(int noCustomerWhenOpen) {
        this.noCustomerWhenOpen = noCustomerWhenOpen;
    }

    public int getDocType() {
        return docType;
    }

    public void setDocType(int docType) {
        this.docType = docType;
    }

    public int getReceiptYear() {
        return receiptYear;
    }

    public void setReceiptYear(int receiptYear) {
        this.receiptYear = receiptYear;
    }

    public int getReceiptMonth() {
        return receiptMonth;
    }

    public void setReceiptMonth(int receiptMonth) {
        this.receiptMonth = receiptMonth;
    }

    public int getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(int receiptId) {
        this.receiptId = receiptId;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public double getTransactionVAT() {
        return transactionVAT;
    }

    public void setTransactionVAT(double transactionVAT) {
        this.transactionVAT = transactionVAT;
    }

    public double getTransactionVATable() {
        return transactionVATable;
    }

    public void setTransactionVATable(double transactionVATable) {
        this.transactionVATable = transactionVATable;
    }

    public double getTranBeforeVAT() {
        return tranBeforeVAT;
    }

    public void setTranBeforeVAT(double tranBeforeVAT) {
        this.tranBeforeVAT = tranBeforeVAT;
    }

    public String getVatCode() {
        return vatCode;
    }

    public void setVatCode(String vatCode) {
        this.vatCode = vatCode;
    }

    public double getVatPercent() {
        return vatPercent;
    }

    public void setVatPercent(double vatPercent) {
        this.vatPercent = vatPercent;
    }

    public double getServiceChargePercent() {
        return serviceChargePercent;
    }

    public void setServiceChargePercent(double serviceChargePercent) {
        this.serviceChargePercent = serviceChargePercent;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public double getServiceChargeVAT() {
        return serviceChargeVAT;
    }

    public void setServiceChargeVAT(double serviceChargeVAT) {
        this.serviceChargeVAT = serviceChargeVAT;
    }

    public double getScBeforeVAT() {
        return scBeforeVAT;
    }

    public void setScBeforeVAT(double scBeforeVAT) {
        this.scBeforeVAT = scBeforeVAT;
    }

    public double getOtherIncome() {
        return otherIncome;
    }

    public void setOtherIncome(double otherIncome) {
        this.otherIncome = otherIncome;
    }

    public double getOtherIncomeVAT() {
        return otherIncomeVAT;
    }

    public void setOtherIncomeVAT(double otherIncomeVAT) {
        this.otherIncomeVAT = otherIncomeVAT;
    }

    public double getOtherIncomeBeforeVAT() {
        return otherIncomeBeforeVAT;
    }

    public void setOtherIncomeBeforeVAT(double otherIncomeBeforeVAT) {
        this.otherIncomeBeforeVAT = otherIncomeBeforeVAT;
    }

    public double getReceiptTotalQty() {
        return receiptTotalQty;
    }

    public void setReceiptTotalQty(double receiptTotalQty) {
        this.receiptTotalQty = receiptTotalQty;
    }

    public double getReceiptRetailPrice() {
        return receiptRetailPrice;
    }

    public void setReceiptRetailPrice(double receiptRetailPrice) {
        this.receiptRetailPrice = receiptRetailPrice;
    }

    public double getReceiptDiscount() {
        return receiptDiscount;
    }

    public void setReceiptDiscount(double receiptDiscount) {
        this.receiptDiscount = receiptDiscount;
    }

    public double getReceiptSalePrice() {
        return receiptSalePrice;
    }

    public void setReceiptSalePrice(double receiptSalePrice) {
        this.receiptSalePrice = receiptSalePrice;
    }

    public double getReceiptNetSale() {
        return receiptNetSale;
    }

    public void setReceiptNetSale(double receiptNetSale) {
        this.receiptNetSale = receiptNetSale;
    }

    public double getReceiptPayPrice() {
        return receiptPayPrice;
    }

    public void setReceiptPayPrice(double receiptPayPrice) {
        this.receiptPayPrice = receiptPayPrice;
    }

    public double getReceiptRoundingBill() {
        return receiptRoundingBill;
    }

    public void setReceiptRoundingBill(double receiptRoundingBill) {
        this.receiptRoundingBill = receiptRoundingBill;
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public int getCloseComputerId() {
        return closeComputerId;
    }

    public void setCloseComputerId(int closeComputerId) {
        this.closeComputerId = closeComputerId;
    }

    public int getVoidStaffId() {
        return voidStaffId;
    }

    public void setVoidStaffId(int voidStaffId) {
        this.voidStaffId = voidStaffId;
    }

    public String getVoidReason() {
        return voidReason;
    }

    public void setVoidReason(String voidReason) {
        this.voidReason = voidReason;
    }

    public String getVoidTime() {
        return voidTime;
    }

    public void setVoidTime(String voidTime) {
        this.voidTime = voidTime;
    }

    public int getIsCloneBill() {
        return isCloneBill;
    }

    public void setIsCloneBill(int isCloneBill) {
        this.isCloneBill = isCloneBill;
    }

    public int getVoidTranId() {
        return voidTranId;
    }

    public void setVoidTranId(int voidTranId) {
        this.voidTranId = voidTranId;
    }

    public int getVoidComId() {
        return voidComId;
    }

    public void setVoidComId(int voidComId) {
        this.voidComId = voidComId;
    }

    public double getDiffCloneBill() {
        return diffCloneBill;
    }

    public void setDiffCloneBill(double diffCloneBill) {
        this.diffCloneBill = diffCloneBill;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getHasOrder() {
        return hasOrder;
    }

    public void setHasOrder(int hasOrder) {
        this.hasOrder = hasOrder;
    }

    public int getNoPrintBillDetail() {
        return noPrintBillDetail;
    }

    public void setNoPrintBillDetail(int noPrintBillDetail) {
        this.noPrintBillDetail = noPrintBillDetail;
    }

    public double getDiffPayCheckBill() {
        return diffPayCheckBill;
    }

    public void setDiffPayCheckBill(double diffPayCheckBill) {
        this.diffPayCheckBill = diffPayCheckBill;
    }

    public String getBillDetailReferenceNo() {
        return billDetailReferenceNo;
    }

    public void setBillDetailReferenceNo(String billDetailReferenceNo) {
        this.billDetailReferenceNo = billDetailReferenceNo;
    }

    public int getCallForCheckBill() {
        return callForCheckBill;
    }

    public void setCallForCheckBill(int callForCheckBill) {
        this.callForCheckBill = callForCheckBill;
    }

    public String getTransactionNote() {
        return transactionNote;
    }

    public void setTransactionNote(String transactionNote) {
        this.transactionNote = transactionNote;
    }

    public int getCurrentAccessComputer() {
        return currentAccessComputer;
    }

    public void setCurrentAccessComputer(int currentAccessComputer) {
        this.currentAccessComputer = currentAccessComputer;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getPrintWarningTime() {
        return printWarningTime;
    }

    public void setPrintWarningTime(String printWarningTime) {
        this.printWarningTime = printWarningTime;
    }

    public String getPrintBeginTime() {
        return printBeginTime;
    }

    public void setPrintBeginTime(String printBeginTime) {
        this.printBeginTime = printBeginTime;
    }

    public int getAlreadyCalculateStock() {
        return alreadyCalculateStock;
    }

    public void setAlreadyCalculateStock(int alreadyCalculateStock) {
        this.alreadyCalculateStock = alreadyCalculateStock;
    }

    public int getAlreadyExportToHQ() {
        return alreadyExportToHQ;
    }

    public void setAlreadyExportToHQ(int alreadyExportToHQ) {
        this.alreadyExportToHQ = alreadyExportToHQ;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getIsSplitTransaction() {
        return isSplitTransaction;
    }

    public void setIsSplitTransaction(int isSplitTransaction) {
        this.isSplitTransaction = isSplitTransaction;
    }

    public int getIsFromOtherTransaction() {
        return isFromOtherTransaction;
    }

    public void setIsFromOtherTransaction(int isFromOtherTransaction) {
        this.isFromOtherTransaction = isFromOtherTransaction;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public int getFromDepositTransactionId() {
        return fromDepositTransactionId;
    }

    public void setFromDepositTransactionId(int fromDepositTransactionId) {
        this.fromDepositTransactionId = fromDepositTransactionId;
    }

    public int getFromDepositComputerId() {
        return fromDepositComputerId;
    }

    public void setFromDepositComputerId(int fromDepositComputerId) {
        this.fromDepositComputerId = fromDepositComputerId;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public static class OrderDetail{
        private int orderDetailId;
        private int transactionId;
        private int computerId;
        private int componentLevel;
        private int orderDetailLinkId;
        private int insertOrderNo;
        private int indentLevel;
        private int displayOrdering;
        private String saleDate;
        private int shopId;
        private int productId;
        private int productSetType;
        private int orderStatusId;
        private int saleMode;
        private double totalQty;
        private double pricePerUnit;
        private double totalRetailPrice;
        private double orgPricePerUnit;
        private double orgTotalRetailPrice;
        private double discPrice;
        private double discPercent;
        private double discPricePercent;
        private double discAmount;
        private double discOtherPercent;
        private double discOther;
        private double totalItemDisc;
        private double salePrice;
        private double discBill;
        private double totalDiscount;
        private double netSale;
        private double vatable;
        private String productVATCode;
        private String vatDisplay;
        private double productVATPercent;
        private double productVAT;
        private double productBeforeVAT;
        private double totalRetailVAT;
        private double discVAT;
        private int isSCBeforeDisc;
        private int hasServiceCharge;
        private double scPercent;
        private double scAmount;
        private double scVAT;
        private double scBeforeVAT;
        private double wVatable;
        private double scWAmount;
        private double scWVAT;
        private double scWBeforeVAT;
        private double weightPrice;
        private double weightPriceVAT;
        private double weightBeforeVAT;
        private String otherFoodName;
        private int otherProductGroupID;
        private int discountAllow;
        private int itemDiscAllow;
        private int lastTransactionId;
        private int lastComputerId;
        private int printerId;
        private int inventoryId;
        private int orderStaffId;
        private int orderComputerId;
        private int orderTableId;
        private int voidTypeId;
        private int voidStaffId;
        private String voidDateTime;
        private int vatType;
        private int printGroup;
        private int noPrintBill;
        private int noRePrintOrder;
        private String startTime;
        private String finishTime;
        private int printStatus;
        private int processId;
        private String submitOrderDateTime;
        private String comment;
        private int isComment;
        private int deleted;

        public OrderDetail(){
        }

        public OrderDetail(int orderDetailId, int transactionId, int computerId, int componentLevel, int orderDetailLinkId, int insertOrderNo, int indentLevel, int displayOrdering, String saleDate, int shopId, int productId, int productSetType, int orderStatusId, int saleMode, double totalQty, double pricePerUnit, double totalRetailPrice, double orgPricePerUnit, double orgTotalRetailPrice, double discPrice, double discPercent, double discPricePercent, double discAmount, double discOtherPercent, double discOther, double totalItemDisc, double salePrice, double discBill, double totalDiscount, double netSale, double vatable, String productVATCode, String vatDisplay, double productVATPercent, double productVAT, double productBeforeVAT, double totalRetailVAT, double discVAT, int isSCBeforeDisc, int hasServiceCharge, double scPercent, double scAmount, double scVAT, double scBeforeVAT, double wVatable, double scWAmount, double scWVAT, double scWBeforeVAT, double weightPrice, double weightPriceVAT, double weightBeforeVAT, String otherFoodName, int otherProductGroupID, int discountAllow, int itemDiscAllow, int lastTransactionId, int lastComputerId, int printerId, int inventoryId, int orderStaffId, int orderComputerId, int orderTableId, int voidTypeId, int voidStaffId, String voidDateTime, int vatType, int printGroup, int noPrintBill, int noRePrintOrder, String startTime, String finishTime, int printStatus, int processId, String submitOrderDateTime, String comment, int isComment, int deleted) {
            this.orderDetailId = orderDetailId;
            this.transactionId = transactionId;
            this.computerId = computerId;
            this.componentLevel = componentLevel;
            this.orderDetailLinkId = orderDetailLinkId;
            this.insertOrderNo = insertOrderNo;
            this.indentLevel = indentLevel;
            this.displayOrdering = displayOrdering;
            this.saleDate = saleDate;
            this.shopId = shopId;
            this.productId = productId;
            this.productSetType = productSetType;
            this.orderStatusId = orderStatusId;
            this.saleMode = saleMode;
            this.totalQty = totalQty;
            this.pricePerUnit = pricePerUnit;
            this.totalRetailPrice = totalRetailPrice;
            this.orgPricePerUnit = orgPricePerUnit;
            this.orgTotalRetailPrice = orgTotalRetailPrice;
            this.discPrice = discPrice;
            this.discPercent = discPercent;
            this.discPricePercent = discPricePercent;
            this.discAmount = discAmount;
            this.discOtherPercent = discOtherPercent;
            this.discOther = discOther;
            this.totalItemDisc = totalItemDisc;
            this.salePrice = salePrice;
            this.discBill = discBill;
            this.totalDiscount = totalDiscount;
            this.netSale = netSale;
            this.vatable = vatable;
            this.productVATCode = productVATCode;
            this.vatDisplay = vatDisplay;
            this.productVATPercent = productVATPercent;
            this.productVAT = productVAT;
            this.productBeforeVAT = productBeforeVAT;
            this.totalRetailVAT = totalRetailVAT;
            this.discVAT = discVAT;
            this.isSCBeforeDisc = isSCBeforeDisc;
            this.hasServiceCharge = hasServiceCharge;
            this.scPercent = scPercent;
            this.scAmount = scAmount;
            this.scVAT = scVAT;
            this.scBeforeVAT = scBeforeVAT;
            this.wVatable = wVatable;
            this.scWAmount = scWAmount;
            this.scWVAT = scWVAT;
            this.scWBeforeVAT = scWBeforeVAT;
            this.weightPrice = weightPrice;
            this.weightPriceVAT = weightPriceVAT;
            this.weightBeforeVAT = weightBeforeVAT;
            this.otherFoodName = otherFoodName;
            this.otherProductGroupID = otherProductGroupID;
            this.discountAllow = discountAllow;
            this.itemDiscAllow = itemDiscAllow;
            this.lastTransactionId = lastTransactionId;
            this.lastComputerId = lastComputerId;
            this.printerId = printerId;
            this.inventoryId = inventoryId;
            this.orderStaffId = orderStaffId;
            this.orderComputerId = orderComputerId;
            this.orderTableId = orderTableId;
            this.voidTypeId = voidTypeId;
            this.voidStaffId = voidStaffId;
            this.voidDateTime = voidDateTime;
            this.vatType = vatType;
            this.printGroup = printGroup;
            this.noPrintBill = noPrintBill;
            this.noRePrintOrder = noRePrintOrder;
            this.startTime = startTime;
            this.finishTime = finishTime;
            this.printStatus = printStatus;
            this.processId = processId;
            this.submitOrderDateTime = submitOrderDateTime;
            this.comment = comment;
            this.isComment = isComment;
            this.deleted = deleted;
        }

        public int getOrderDetailId() {
            return orderDetailId;
        }

        public void setOrderDetailId(int orderDetailId) {
            this.orderDetailId = orderDetailId;
        }

        public int getTransactionId() {
            return transactionId;
        }

        public void setTransactionId(int transactionId) {
            this.transactionId = transactionId;
        }

        public int getComputerId() {
            return computerId;
        }

        public void setComputerId(int computerId) {
            this.computerId = computerId;
        }

        public int getComponentLevel() {
            return componentLevel;
        }

        public void setComponentLevel(int componentLevel) {
            this.componentLevel = componentLevel;
        }

        public int getOrderDetailLinkId() {
            return orderDetailLinkId;
        }

        public void setOrderDetailLinkId(int orderDetailLinkId) {
            this.orderDetailLinkId = orderDetailLinkId;
        }

        public int getInsertOrderNo() {
            return insertOrderNo;
        }

        public void setInsertOrderNo(int insertOrderNo) {
            this.insertOrderNo = insertOrderNo;
        }

        public int getIndentLevel() {
            return indentLevel;
        }

        public void setIndentLevel(int indentLevel) {
            this.indentLevel = indentLevel;
        }

        public int getDisplayOrdering() {
            return displayOrdering;
        }

        public void setDisplayOrdering(int displayOrdering) {
            this.displayOrdering = displayOrdering;
        }

        public String getSaleDate() {
            return saleDate;
        }

        public void setSaleDate(String saleDate) {
            this.saleDate = saleDate;
        }

        public int getShopId() {
            return shopId;
        }

        public void setShopId(int shopId) {
            this.shopId = shopId;
        }

        public int getProductId() {
            return productId;
        }

        public void setProductId(int productId) {
            this.productId = productId;
        }

        public int getProductSetType() {
            return productSetType;
        }

        public void setProductSetType(int productSetType) {
            this.productSetType = productSetType;
        }

        public int getOrderStatusId() {
            return orderStatusId;
        }

        public void setOrderStatusId(int orderStatusId) {
            this.orderStatusId = orderStatusId;
        }

        public int getSaleMode() {
            return saleMode;
        }

        public void setSaleMode(int saleMode) {
            this.saleMode = saleMode;
        }

        public double getTotalQty() {
            return totalQty;
        }

        public void setTotalQty(double totalQty) {
            this.totalQty = totalQty;
        }

        public double getPricePerUnit() {
            return pricePerUnit;
        }

        public void setPricePerUnit(double pricePerUnit) {
            this.pricePerUnit = pricePerUnit;
        }

        public double getTotalRetailPrice() {
            return totalRetailPrice;
        }

        public void setTotalRetailPrice(double totalRetailPrice) {
            this.totalRetailPrice = totalRetailPrice;
        }

        public double getOrgPricePerUnit() {
            return orgPricePerUnit;
        }

        public void setOrgPricePerUnit(double orgPricePerUnit) {
            this.orgPricePerUnit = orgPricePerUnit;
        }

        public double getOrgTotalRetailPrice() {
            return orgTotalRetailPrice;
        }

        public void setOrgTotalRetailPrice(double orgTotalRetailPrice) {
            this.orgTotalRetailPrice = orgTotalRetailPrice;
        }

        public double getDiscPrice() {
            return discPrice;
        }

        public void setDiscPrice(double discPrice) {
            this.discPrice = discPrice;
        }

        public double getDiscPercent() {
            return discPercent;
        }

        public void setDiscPercent(double discPercent) {
            this.discPercent = discPercent;
        }

        public double getDiscPricePercent() {
            return discPricePercent;
        }

        public void setDiscPricePercent(double discPricePercent) {
            this.discPricePercent = discPricePercent;
        }

        public double getDiscAmount() {
            return discAmount;
        }

        public void setDiscAmount(double discAmount) {
            this.discAmount = discAmount;
        }

        public double getDiscOtherPercent() {
            return discOtherPercent;
        }

        public void setDiscOtherPercent(double discOtherPercent) {
            this.discOtherPercent = discOtherPercent;
        }

        public double getDiscOther() {
            return discOther;
        }

        public void setDiscOther(double discOther) {
            this.discOther = discOther;
        }

        public double getTotalItemDisc() {
            return totalItemDisc;
        }

        public void setTotalItemDisc(double totalItemDisc) {
            this.totalItemDisc = totalItemDisc;
        }

        public double getSalePrice() {
            return salePrice;
        }

        public void setSalePrice(double salePrice) {
            this.salePrice = salePrice;
        }

        public double getDiscBill() {
            return discBill;
        }

        public void setDiscBill(double discBill) {
            this.discBill = discBill;
        }

        public double getTotalDiscount() {
            return totalDiscount;
        }

        public void setTotalDiscount(double totalDiscount) {
            this.totalDiscount = totalDiscount;
        }

        public double getNetSale() {
            return netSale;
        }

        public void setNetSale(double netSale) {
            this.netSale = netSale;
        }

        public double getVatable() {
            return vatable;
        }

        public void setVatable(double vatable) {
            this.vatable = vatable;
        }

        public String getProductVATCode() {
            return productVATCode;
        }

        public void setProductVATCode(String productVATCode) {
            this.productVATCode = productVATCode;
        }

        public String getVatDisplay() {
            return vatDisplay;
        }

        public void setVatDisplay(String vatDisplay) {
            this.vatDisplay = vatDisplay;
        }

        public double getProductVATPercent() {
            return productVATPercent;
        }

        public void setProductVATPercent(double productVATPercent) {
            this.productVATPercent = productVATPercent;
        }

        public double getProductVAT() {
            return productVAT;
        }

        public void setProductVAT(double productVAT) {
            this.productVAT = productVAT;
        }

        public double getProductBeforeVAT() {
            return productBeforeVAT;
        }

        public void setProductBeforeVAT(double productBeforeVAT) {
            this.productBeforeVAT = productBeforeVAT;
        }

        public double getTotalRetailVAT() {
            return totalRetailVAT;
        }

        public void setTotalRetailVAT(double totalRetailVAT) {
            this.totalRetailVAT = totalRetailVAT;
        }

        public double getDiscVAT() {
            return discVAT;
        }

        public void setDiscVAT(double discVAT) {
            this.discVAT = discVAT;
        }

        public int getIsSCBeforeDisc() {
            return isSCBeforeDisc;
        }

        public void setIsSCBeforeDisc(int isSCBeforeDisc) {
            this.isSCBeforeDisc = isSCBeforeDisc;
        }

        public int getHasServiceCharge() {
            return hasServiceCharge;
        }

        public void setHasServiceCharge(int hasServiceCharge) {
            this.hasServiceCharge = hasServiceCharge;
        }

        public double getScPercent() {
            return scPercent;
        }

        public void setScPercent(double scPercent) {
            this.scPercent = scPercent;
        }

        public double getScAmount() {
            return scAmount;
        }

        public void setScAmount(double scAmount) {
            this.scAmount = scAmount;
        }

        public double getScVAT() {
            return scVAT;
        }

        public void setScVAT(double scVAT) {
            this.scVAT = scVAT;
        }

        public double getScBeforeVAT() {
            return scBeforeVAT;
        }

        public void setScBeforeVAT(double scBeforeVAT) {
            this.scBeforeVAT = scBeforeVAT;
        }

        public double getwVatable() {
            return wVatable;
        }

        public void setwVatable(double wVatable) {
            this.wVatable = wVatable;
        }

        public double getScWAmount() {
            return scWAmount;
        }

        public void setScWAmount(double scWAmount) {
            this.scWAmount = scWAmount;
        }

        public double getScWVAT() {
            return scWVAT;
        }

        public void setScWVAT(double scWVAT) {
            this.scWVAT = scWVAT;
        }

        public double getScWBeforeVAT() {
            return scWBeforeVAT;
        }

        public void setScWBeforeVAT(double scWBeforeVAT) {
            this.scWBeforeVAT = scWBeforeVAT;
        }

        public double getWeightPrice() {
            return weightPrice;
        }

        public void setWeightPrice(double weightPrice) {
            this.weightPrice = weightPrice;
        }

        public double getWeightPriceVAT() {
            return weightPriceVAT;
        }

        public void setWeightPriceVAT(double weightPriceVAT) {
            this.weightPriceVAT = weightPriceVAT;
        }

        public double getWeightBeforeVAT() {
            return weightBeforeVAT;
        }

        public void setWeightBeforeVAT(double weightBeforeVAT) {
            this.weightBeforeVAT = weightBeforeVAT;
        }

        public String getOtherFoodName() {
            return otherFoodName;
        }

        public void setOtherFoodName(String otherFoodName) {
            this.otherFoodName = otherFoodName;
        }

        public int getOtherProductGroupID() {
            return otherProductGroupID;
        }

        public void setOtherProductGroupID(int otherProductGroupID) {
            this.otherProductGroupID = otherProductGroupID;
        }

        public int getDiscountAllow() {
            return discountAllow;
        }

        public void setDiscountAllow(int discountAllow) {
            this.discountAllow = discountAllow;
        }

        public int getItemDiscAllow() {
            return itemDiscAllow;
        }

        public void setItemDiscAllow(int itemDiscAllow) {
            this.itemDiscAllow = itemDiscAllow;
        }

        public int getLastTransactionId() {
            return lastTransactionId;
        }

        public void setLastTransactionId(int lastTransactionId) {
            this.lastTransactionId = lastTransactionId;
        }

        public int getLastComputerId() {
            return lastComputerId;
        }

        public void setLastComputerId(int lastComputerId) {
            this.lastComputerId = lastComputerId;
        }

        public int getPrinterId() {
            return printerId;
        }

        public void setPrinterId(int printerId) {
            this.printerId = printerId;
        }

        public int getInventoryId() {
            return inventoryId;
        }

        public void setInventoryId(int inventoryId) {
            this.inventoryId = inventoryId;
        }

        public int getOrderStaffId() {
            return orderStaffId;
        }

        public void setOrderStaffId(int orderStaffId) {
            this.orderStaffId = orderStaffId;
        }

        public int getOrderComputerId() {
            return orderComputerId;
        }

        public void setOrderComputerId(int orderComputerId) {
            this.orderComputerId = orderComputerId;
        }

        public int getOrderTableId() {
            return orderTableId;
        }

        public void setOrderTableId(int orderTableId) {
            this.orderTableId = orderTableId;
        }

        public int getVoidTypeId() {
            return voidTypeId;
        }

        public void setVoidTypeId(int voidTypeId) {
            this.voidTypeId = voidTypeId;
        }

        public int getVoidStaffId() {
            return voidStaffId;
        }

        public void setVoidStaffId(int voidStaffId) {
            this.voidStaffId = voidStaffId;
        }

        public String getVoidDateTime() {
            return voidDateTime;
        }

        public void setVoidDateTime(String voidDateTime) {
            this.voidDateTime = voidDateTime;
        }

        public int getVatType() {
            return vatType;
        }

        public void setVatType(int vatType) {
            this.vatType = vatType;
        }

        public int getPrintGroup() {
            return printGroup;
        }

        public void setPrintGroup(int printGroup) {
            this.printGroup = printGroup;
        }

        public int getNoPrintBill() {
            return noPrintBill;
        }

        public void setNoPrintBill(int noPrintBill) {
            this.noPrintBill = noPrintBill;
        }

        public int getNoRePrintOrder() {
            return noRePrintOrder;
        }

        public void setNoRePrintOrder(int noRePrintOrder) {
            this.noRePrintOrder = noRePrintOrder;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getFinishTime() {
            return finishTime;
        }

        public void setFinishTime(String finishTime) {
            this.finishTime = finishTime;
        }

        public int getPrintStatus() {
            return printStatus;
        }

        public void setPrintStatus(int printStatus) {
            this.printStatus = printStatus;
        }

        public int getProcessId() {
            return processId;
        }

        public void setProcessId(int processId) {
            this.processId = processId;
        }

        public String getSubmitOrderDateTime() {
            return submitOrderDateTime;
        }

        public void setSubmitOrderDateTime(String submitOrderDateTime) {
            this.submitOrderDateTime = submitOrderDateTime;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public int getIsComment() {
            return isComment;
        }

        public void setIsComment(int isComment) {
            this.isComment = isComment;
        }

        public int getDeleted() {
            return deleted;
        }

        public void setDeleted(int deleted) {
            this.deleted = deleted;
        }
    }
}
