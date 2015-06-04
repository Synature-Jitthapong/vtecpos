package com.vtec.j1tth4.vtecpos.provider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by j1tth4 on 5/1/15 AD.
 */
public class Transaction {
    private int TransactionID;
    private int ComputerID;
    private String TransactionUUID;
    private String ReserveTime;
    private int ReserveStaffID;
    private String OpenTime;
    private int OpenStaffID;
    private String PaidTime;
    private int PaidStaffID;
    private String CloseTime;
    private int CommStaffID;
    private double DiscountItem;
    private double DiscountBill;
    private double DiscountOther;
    private double TotalDiscount;
    private int TransactionStatusID;
    private int SaleMode;
    private String TransactionName;
    private String QueueName;
    private int NoCustomer;
    private int NoCustomerWhenOpen;
    private int DocType;
    private int ReceiptYear;
    private int ReceiptMonth;
    private int ReceiptID;
    private String ReceiptNumber;
    private String SaleDate;
    private int ShopID;
    private double TransactionVAT;
    private double TransactionVATable;
    private double TranBeforeVAT;
    private String VATCode;
    private double VATPercent;
    private double ServiceChargePercent;
    private double ServiceCharge;
    private double ServiceChargeVAT;
    private double SCBeforeVAT;
    private double OtherIncome;
    private double OtherIncomeVAT;
    private double OhterIncomeBeforeVAT;
    private double ReceiptTotalQty;
    private double ReceiptRetailPrice;
    private double ReceiptDiscount;
    private double ReceiptSalePrice;
    private double ReceiptNetSale;
    private double ReceiptPayPrice;
    private double ReceiptRoundingBill;
    private int SessionID;
    private int CloseComputerID;
    private int VoidStaffID;
    private String VoidReason;
    private String VoidTime;
    private int IsCloneBill;
    private int VoidTranID;
    private int VoidComID;
    private double DiffCloneBill;
    private int MemberID;
    private int HasOrder;
    private int NoPrintBillDetail;
    private double DiffPayCheckBill;
    private String BillDetailReferenceNo;
    private int CallForCheckBill;
    private String TransactionNote;
    private int CurrentAccessComputer;
    private String UpdateDate;
    private String BeginTime;
    private String EndTime;
    private String PrintWarningTime;
    private String PrintBeginTime;
    private int AlreadyCalculateStock;
    private int AlreadyExportToHQ;
    private int TableID;
    private int IsSplitTransaction;
    private int IsFromOtherTransaction;
    private String ReferenceNo;
    private int FromDepositTransactionID;
    private int FromDepositComputerID;
    private int Deleted;

    private List<OrderDetail> mOrderDetailLst;

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

    public String getTransactionUUID() {
        return TransactionUUID;
    }

    public void setTransactionUUID(String transactionUUID) {
        TransactionUUID = transactionUUID;
    }

    public String getReserveTime() {
        return ReserveTime;
    }

    public void setReserveTime(String reserveTime) {
        ReserveTime = reserveTime;
    }

    public int getReserveStaffID() {
        return ReserveStaffID;
    }

    public void setReserveStaffID(int reserveStaffID) {
        ReserveStaffID = reserveStaffID;
    }

    public String getOpenTime() {
        return OpenTime;
    }

    public void setOpenTime(String openTime) {
        OpenTime = openTime;
    }

    public int getOpenStaffID() {
        return OpenStaffID;
    }

    public void setOpenStaffID(int openStaffID) {
        OpenStaffID = openStaffID;
    }

    public String getPaidTime() {
        return PaidTime;
    }

    public void setPaidTime(String paidTime) {
        PaidTime = paidTime;
    }

    public int getPaidStaffID() {
        return PaidStaffID;
    }

    public void setPaidStaffID(int paidStaffID) {
        PaidStaffID = paidStaffID;
    }

    public String getCloseTime() {
        return CloseTime;
    }

    public void setCloseTime(String closeTime) {
        CloseTime = closeTime;
    }

    public int getCommStaffID() {
        return CommStaffID;
    }

    public void setCommStaffID(int commStaffID) {
        CommStaffID = commStaffID;
    }

    public double getDiscountItem() {
        return DiscountItem;
    }

    public void setDiscountItem(double discountItem) {
        DiscountItem = discountItem;
    }

    public double getDiscountBill() {
        return DiscountBill;
    }

    public void setDiscountBill(double discountBill) {
        DiscountBill = discountBill;
    }

    public double getDiscountOther() {
        return DiscountOther;
    }

    public void setDiscountOther(double discountOther) {
        DiscountOther = discountOther;
    }

    public double getTotalDiscount() {
        return TotalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        TotalDiscount = totalDiscount;
    }

    public int getTransactionStatusID() {
        return TransactionStatusID;
    }

    public void setTransactionStatusID(int transactionStatusID) {
        TransactionStatusID = transactionStatusID;
    }

    public int getSaleMode() {
        return SaleMode;
    }

    public void setSaleMode(int saleMode) {
        SaleMode = saleMode;
    }

    public String getTransactionName() {
        return TransactionName;
    }

    public void setTransactionName(String transactionName) {
        TransactionName = transactionName;
    }

    public String getQueueName() {
        return QueueName;
    }

    public void setQueueName(String queueName) {
        QueueName = queueName;
    }

    public int getNoCustomer() {
        return NoCustomer;
    }

    public void setNoCustomer(int noCustomer) {
        NoCustomer = noCustomer;
    }

    public int getNoCustomerWhenOpen() {
        return NoCustomerWhenOpen;
    }

    public void setNoCustomerWhenOpen(int noCustomerWhenOpen) {
        NoCustomerWhenOpen = noCustomerWhenOpen;
    }

    public int getDocType() {
        return DocType;
    }

    public void setDocType(int docType) {
        DocType = docType;
    }

    public int getReceiptYear() {
        return ReceiptYear;
    }

    public void setReceiptYear(int receiptYear) {
        ReceiptYear = receiptYear;
    }

    public int getReceiptMonth() {
        return ReceiptMonth;
    }

    public void setReceiptMonth(int receiptMonth) {
        ReceiptMonth = receiptMonth;
    }

    public int getReceiptID() {
        return ReceiptID;
    }

    public void setReceiptID(int receiptID) {
        ReceiptID = receiptID;
    }

    public String getReceiptNumber() {
        return ReceiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        ReceiptNumber = receiptNumber;
    }

    public String getSaleDate() {
        return SaleDate;
    }

    public void setSaleDate(String saleDate) {
        SaleDate = saleDate;
    }

    public int getShopID() {
        return ShopID;
    }

    public void setShopID(int shopID) {
        ShopID = shopID;
    }

    public double getTransactionVAT() {
        return TransactionVAT;
    }

    public void setTransactionVAT(double transactionVAT) {
        TransactionVAT = transactionVAT;
    }

    public double getTransactionVATable() {
        return TransactionVATable;
    }

    public void setTransactionVATable(double transactionVATable) {
        TransactionVATable = transactionVATable;
    }

    public double getTranBeforeVAT() {
        return TranBeforeVAT;
    }

    public void setTranBeforeVAT(double tranBeforeVAT) {
        TranBeforeVAT = tranBeforeVAT;
    }

    public String getVATCode() {
        return VATCode;
    }

    public void setVATCode(String VATCode) {
        this.VATCode = VATCode;
    }

    public double getVATPercent() {
        return VATPercent;
    }

    public void setVATPercent(double VATPercent) {
        this.VATPercent = VATPercent;
    }

    public double getServiceChargePercent() {
        return ServiceChargePercent;
    }

    public void setServiceChargePercent(double serviceChargePercent) {
        ServiceChargePercent = serviceChargePercent;
    }

    public double getServiceCharge() {
        return ServiceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        ServiceCharge = serviceCharge;
    }

    public double getServiceChargeVAT() {
        return ServiceChargeVAT;
    }

    public void setServiceChargeVAT(double serviceChargeVAT) {
        ServiceChargeVAT = serviceChargeVAT;
    }

    public double getSCBeforeVAT() {
        return SCBeforeVAT;
    }

    public void setSCBeforeVAT(double SCBeforeVAT) {
        this.SCBeforeVAT = SCBeforeVAT;
    }

    public double getOtherIncome() {
        return OtherIncome;
    }

    public void setOtherIncome(double otherIncome) {
        OtherIncome = otherIncome;
    }

    public double getOtherIncomeVAT() {
        return OtherIncomeVAT;
    }

    public void setOtherIncomeVAT(double otherIncomeVAT) {
        OtherIncomeVAT = otherIncomeVAT;
    }

    public double getOhterIncomeBeforeVAT() {
        return OhterIncomeBeforeVAT;
    }

    public void setOhterIncomeBeforeVAT(double ohterIncomeBeforeVAT) {
        OhterIncomeBeforeVAT = ohterIncomeBeforeVAT;
    }

    public double getReceiptTotalQty() {
        return ReceiptTotalQty;
    }

    public void setReceiptTotalQty(double receiptTotalQty) {
        ReceiptTotalQty = receiptTotalQty;
    }

    public double getReceiptRetailPrice() {
        return ReceiptRetailPrice;
    }

    public void setReceiptRetailPrice(double receiptRetailPrice) {
        ReceiptRetailPrice = receiptRetailPrice;
    }

    public double getReceiptDiscount() {
        return ReceiptDiscount;
    }

    public void setReceiptDiscount(double receiptDiscount) {
        ReceiptDiscount = receiptDiscount;
    }

    public double getReceiptSalePrice() {
        return ReceiptSalePrice;
    }

    public void setReceiptSalePrice(double receiptSalePrice) {
        ReceiptSalePrice = receiptSalePrice;
    }

    public double getReceiptNetSale() {
        return ReceiptNetSale;
    }

    public void setReceiptNetSale(double receiptNetSale) {
        ReceiptNetSale = receiptNetSale;
    }

    public double getReceiptPayPrice() {
        return ReceiptPayPrice;
    }

    public void setReceiptPayPrice(double receiptPayPrice) {
        ReceiptPayPrice = receiptPayPrice;
    }

    public double getReceiptRoundingBill() {
        return ReceiptRoundingBill;
    }

    public void setReceiptRoundingBill(double receiptRoundingBill) {
        ReceiptRoundingBill = receiptRoundingBill;
    }

    public int getSessionID() {
        return SessionID;
    }

    public void setSessionID(int sessionID) {
        SessionID = sessionID;
    }

    public int getCloseComputerID() {
        return CloseComputerID;
    }

    public void setCloseComputerID(int closeComputerID) {
        CloseComputerID = closeComputerID;
    }

    public int getVoidStaffID() {
        return VoidStaffID;
    }

    public void setVoidStaffID(int voidStaffID) {
        VoidStaffID = voidStaffID;
    }

    public String getVoidReason() {
        return VoidReason;
    }

    public void setVoidReason(String voidReason) {
        VoidReason = voidReason;
    }

    public String getVoidTime() {
        return VoidTime;
    }

    public void setVoidTime(String voidTime) {
        VoidTime = voidTime;
    }

    public int getIsCloneBill() {
        return IsCloneBill;
    }

    public void setIsCloneBill(int isCloneBill) {
        IsCloneBill = isCloneBill;
    }

    public int getVoidTranID() {
        return VoidTranID;
    }

    public void setVoidTranID(int voidTranID) {
        VoidTranID = voidTranID;
    }

    public int getVoidComID() {
        return VoidComID;
    }

    public void setVoidComID(int voidComID) {
        VoidComID = voidComID;
    }

    public double getDiffCloneBill() {
        return DiffCloneBill;
    }

    public void setDiffCloneBill(double diffCloneBill) {
        DiffCloneBill = diffCloneBill;
    }

    public int getMemberID() {
        return MemberID;
    }

    public void setMemberID(int memberID) {
        MemberID = memberID;
    }

    public int getHasOrder() {
        return HasOrder;
    }

    public void setHasOrder(int hasOrder) {
        HasOrder = hasOrder;
    }

    public int getNoPrintBillDetail() {
        return NoPrintBillDetail;
    }

    public void setNoPrintBillDetail(int noPrintBillDetail) {
        NoPrintBillDetail = noPrintBillDetail;
    }

    public double getDiffPayCheckBill() {
        return DiffPayCheckBill;
    }

    public void setDiffPayCheckBill(double diffPayCheckBill) {
        DiffPayCheckBill = diffPayCheckBill;
    }

    public String getBillDetailReferenceNo() {
        return BillDetailReferenceNo;
    }

    public void setBillDetailReferenceNo(String billDetailReferenceNo) {
        BillDetailReferenceNo = billDetailReferenceNo;
    }

    public int getCallForCheckBill() {
        return CallForCheckBill;
    }

    public void setCallForCheckBill(int callForCheckBill) {
        CallForCheckBill = callForCheckBill;
    }

    public String getTransactionNote() {
        return TransactionNote;
    }

    public void setTransactionNote(String transactionNote) {
        TransactionNote = transactionNote;
    }

    public int getCurrentAccessComputer() {
        return CurrentAccessComputer;
    }

    public void setCurrentAccessComputer(int currentAccessComputer) {
        CurrentAccessComputer = currentAccessComputer;
    }

    public String getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(String updateDate) {
        UpdateDate = updateDate;
    }

    public String getBeginTime() {
        return BeginTime;
    }

    public void setBeginTime(String beginTime) {
        BeginTime = beginTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getPrintWarningTime() {
        return PrintWarningTime;
    }

    public void setPrintWarningTime(String printWarningTime) {
        PrintWarningTime = printWarningTime;
    }

    public String getPrintBeginTime() {
        return PrintBeginTime;
    }

    public void setPrintBeginTime(String printBeginTime) {
        PrintBeginTime = printBeginTime;
    }

    public int getAlreadyCalculateStock() {
        return AlreadyCalculateStock;
    }

    public void setAlreadyCalculateStock(int alreadyCalculateStock) {
        AlreadyCalculateStock = alreadyCalculateStock;
    }

    public int getAlreadyExportToHQ() {
        return AlreadyExportToHQ;
    }

    public void setAlreadyExportToHQ(int alreadyExportToHQ) {
        AlreadyExportToHQ = alreadyExportToHQ;
    }

    public int getTableID() {
        return TableID;
    }

    public void setTableID(int tableID) {
        TableID = tableID;
    }

    public int getIsSplitTransaction() {
        return IsSplitTransaction;
    }

    public void setIsSplitTransaction(int isSplitTransaction) {
        IsSplitTransaction = isSplitTransaction;
    }

    public int getIsFromOtherTransaction() {
        return IsFromOtherTransaction;
    }

    public void setIsFromOtherTransaction(int isFromOtherTransaction) {
        IsFromOtherTransaction = isFromOtherTransaction;
    }

    public String getReferenceNo() {
        return ReferenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        ReferenceNo = referenceNo;
    }

    public int getFromDepositTransactionID() {
        return FromDepositTransactionID;
    }

    public void setFromDepositTransactionID(int fromDepositTransactionID) {
        FromDepositTransactionID = fromDepositTransactionID;
    }

    public int getFromDepositComputerID() {
        return FromDepositComputerID;
    }

    public void setFromDepositComputerID(int fromDepositComputerID) {
        FromDepositComputerID = fromDepositComputerID;
    }

    public int getDeleted() {
        return Deleted;
    }

    public void setDeleted(int deleted) {
        Deleted = deleted;
    }

    public List<OrderDetail> getmOrderDetailLst() {
        return mOrderDetailLst;
    }

    public void setmOrderDetailLst(List<OrderDetail> mOrderDetailLst) {
        this.mOrderDetailLst = mOrderDetailLst;
    }

    public Transaction(){
        mOrderDetailLst = new ArrayList<OrderDetail>();
        NoCustomer = 1;
        SaleMode = 1;
        DocType = 8;
    }

    public static class OrderDetail {
        private int OrderDetailID;
        private int TransactionID;
        private int ComputerID;
        private int ComponentLevel;
        private int OrderDetailLinkID;
        private int InsertOrderNo;
        private int IndentLevel;
        private int DisplayOrdering;
        private String SaleDate;
        private int ShopID;
        private int ProductID;
        private int ProductSetType;
        private int OrderStatusID;
        private int SaleMode;
        private double TotalQty;
        private double PricePerUnit;
        private double TotalRetailPrice;
        private double OrgPricePerUnit;
        private double OrgTotalRetailPrice;
        private double DiscPrice;
        private double DiscPercent;
        private double DiscPricePercent;
        private double DiscAmount;
        private double DiscOtherPercent;
        private double DiscOther;
        private double TotalItemDisc;
        private double SalePrice;
        private double DiscBill;
        private double TotalDiscount;
        private double NetSale;
        private double Vatable;
        private String ProductVATCode;
        private String VATDisplay;
        private double ProductVATPercent;
        private double ProductVAT;
        private double ProductBeforeVAT;
        private double TotalRetailVAT;
        private double DiscVAT;
        private int IsSCBeforeDisc;
        private int HasServiceCharge;
        private double SCPercent;
        private double SCAmount;
        private double SCVAT;
        private double SCBeforeVAT;
        private double WVatable;
        private double SCWAmount;
        private double SCWVAT;
        private double SCWBeforeVAT;
        private double WeightPrice;
        private double WeightPriceVAT;
        private double WeightBeforeVAT;
        private String OtherFoodName;
        private int OtherProductGroupID;
        private int DiscountAllow;
        private int ItemDiscAllow;
        private int LastTransactionID;
        private int LastComputerID;
        private int PrinterID;
        private int InventoryID;
        private int OrderStaffID;
        private int OrderComputerID;
        private int OrderTableID;
        private int VoidTypeID;
        private int VoidStaffID;
        private String VoidDateTime;
        private int VATType;
        private int PrintGroup;
        private int NoPrintBill;
        private int NoRePrintOrder;
        private String StartTime;
        private String FinishTime;
        private int PrintStatus;
        private int ProcessID;
        private String SubmitOrderDateTime;
        private String Comment;
        private int IsComment;
        private int Deleted;
        private String ProductName;
        private boolean isChecked = false;

        public int getOrderDetailID() {
            return OrderDetailID;
        }

        public void setOrderDetailID(int orderDetailID) {
            OrderDetailID = orderDetailID;
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

        public int getComponentLevel() {
            return ComponentLevel;
        }

        public void setComponentLevel(int componentLevel) {
            ComponentLevel = componentLevel;
        }

        public int getOrderDetailLinkID() {
            return OrderDetailLinkID;
        }

        public void setOrderDetailLinkID(int orderDetailLinkID) {
            OrderDetailLinkID = orderDetailLinkID;
        }

        public int getInsertOrderNo() {
            return InsertOrderNo;
        }

        public void setInsertOrderNo(int insertOrderNo) {
            InsertOrderNo = insertOrderNo;
        }

        public int getIndentLevel() {
            return IndentLevel;
        }

        public void setIndentLevel(int indentLevel) {
            IndentLevel = indentLevel;
        }

        public int getDisplayOrdering() {
            return DisplayOrdering;
        }

        public void setDisplayOrdering(int displayOrdering) {
            DisplayOrdering = displayOrdering;
        }

        public String getSaleDate() {
            return SaleDate;
        }

        public void setSaleDate(String saleDate) {
            SaleDate = saleDate;
        }

        public int getShopID() {
            return ShopID;
        }

        public void setShopID(int shopID) {
            ShopID = shopID;
        }

        public int getProductID() {
            return ProductID;
        }

        public void setProductID(int productID) {
            ProductID = productID;
        }

        public int getProductSetType() {
            return ProductSetType;
        }

        public void setProductSetType(int productSetType) {
            ProductSetType = productSetType;
        }

        public int getOrderStatusID() {
            return OrderStatusID;
        }

        public void setOrderStatusID(int orderStatusID) {
            OrderStatusID = orderStatusID;
        }

        public int getSaleMode() {
            return SaleMode;
        }

        public void setSaleMode(int saleMode) {
            SaleMode = saleMode;
        }

        public double getTotalQty() {
            return TotalQty;
        }

        public void setTotalQty(double totalQty) {
            TotalQty = totalQty;
        }

        public double getPricePerUnit() {
            return PricePerUnit;
        }

        public void setPricePerUnit(double pricePerUnit) {
            PricePerUnit = pricePerUnit;
        }

        public double getTotalRetailPrice() {
            return TotalRetailPrice;
        }

        public void setTotalRetailPrice(double totalRetailPrice) {
            TotalRetailPrice = totalRetailPrice;
        }

        public double getOrgPricePerUnit() {
            return OrgPricePerUnit;
        }

        public void setOrgPricePerUnit(double orgPricePerUnit) {
            OrgPricePerUnit = orgPricePerUnit;
        }

        public double getOrgTotalRetailPrice() {
            return OrgTotalRetailPrice;
        }

        public void setOrgTotalRetailPrice(double orgTotalRetailPrice) {
            OrgTotalRetailPrice = orgTotalRetailPrice;
        }

        public double getDiscPrice() {
            return DiscPrice;
        }

        public void setDiscPrice(double discPrice) {
            DiscPrice = discPrice;
        }

        public double getDiscPercent() {
            return DiscPercent;
        }

        public void setDiscPercent(double discPercent) {
            DiscPercent = discPercent;
        }

        public double getDiscAmount() {
            return DiscAmount;
        }

        public void setDiscAmount(double discAmount) {
            DiscAmount = discAmount;
        }

        public double getDiscOtherPercent() {
            return DiscOtherPercent;
        }

        public void setDiscOtherPercent(double discOtherPercent) {
            DiscOtherPercent = discOtherPercent;
        }

        public double getDiscOther() {
            return DiscOther;
        }

        public void setDiscOther(double discOther) {
            DiscOther = discOther;
        }

        public double getTotalItemDisc() {
            return TotalItemDisc;
        }

        public void setTotalItemDisc(double totalItemDisc) {
            TotalItemDisc = totalItemDisc;
        }

        public double getSalePrice() {
            return SalePrice;
        }

        public void setSalePrice(double salePrice) {
            SalePrice = salePrice;
        }

        public double getDiscBill() {
            return DiscBill;
        }

        public void setDiscBill(double discBill) {
            DiscBill = discBill;
        }

        public double getTotalDiscount() {
            return TotalDiscount;
        }

        public void setTotalDiscount(double totalDiscount) {
            TotalDiscount = totalDiscount;
        }

        public double getNetSale() {
            return NetSale;
        }

        public void setNetSale(double netSale) {
            NetSale = netSale;
        }

        public double getVatable() {
            return Vatable;
        }

        public void setVatable(double vatable) {
            Vatable = vatable;
        }

        public String getProductVATCode() {
            return ProductVATCode;
        }

        public void setProductVATCode(String productVATCode) {
            ProductVATCode = productVATCode;
        }

        public String getVATDisplay() {
            return VATDisplay;
        }

        public void setVATDisplay(String VATDisplay) {
            this.VATDisplay = VATDisplay;
        }

        public double getProductVATPercent() {
            return ProductVATPercent;
        }

        public void setProductVATPercent(double productVATPercent) {
            ProductVATPercent = productVATPercent;
        }

        public double getProductVAT() {
            return ProductVAT;
        }

        public void setProductVAT(double productVAT) {
            ProductVAT = productVAT;
        }

        public double getProductBeforeVAT() {
            return ProductBeforeVAT;
        }

        public void setProductBeforeVAT(double productBeforeVAT) {
            ProductBeforeVAT = productBeforeVAT;
        }

        public double getTotalRetailVAT() {
            return TotalRetailVAT;
        }

        public void setTotalRetailVAT(double totalRetailVAT) {
            TotalRetailVAT = totalRetailVAT;
        }

        public double getDiscVAT() {
            return DiscVAT;
        }

        public void setDiscVAT(double discVAT) {
            DiscVAT = discVAT;
        }

        public int getIsSCBeforeDisc() {
            return IsSCBeforeDisc;
        }

        public void setIsSCBeforeDisc(int isSCBeforeDisc) {
            IsSCBeforeDisc = isSCBeforeDisc;
        }

        public int getHasServiceCharge() {
            return HasServiceCharge;
        }

        public void setHasServiceCharge(int hasServiceCharge) {
            HasServiceCharge = hasServiceCharge;
        }

        public double getSCPercent() {
            return SCPercent;
        }

        public void setSCPercent(double SCPercent) {
            this.SCPercent = SCPercent;
        }

        public double getSCAmount() {
            return SCAmount;
        }

        public void setSCAmount(double SCAmount) {
            this.SCAmount = SCAmount;
        }

        public double getSCVAT() {
            return SCVAT;
        }

        public void setSCVAT(double SCVAT) {
            this.SCVAT = SCVAT;
        }

        public double getSCBeforeVAT() {
            return SCBeforeVAT;
        }

        public void setSCBeforeVAT(double SCBeforeVAT) {
            this.SCBeforeVAT = SCBeforeVAT;
        }

        public double getWVatable() {
            return WVatable;
        }

        public void setWVatable(double WVatable) {
            this.WVatable = WVatable;
        }

        public double getSCWAmount() {
            return SCWAmount;
        }

        public void setSCWAmount(double SCWAmount) {
            this.SCWAmount = SCWAmount;
        }

        public double getSCWVAT() {
            return SCWVAT;
        }

        public void setSCWVAT(double SCWVAT) {
            this.SCWVAT = SCWVAT;
        }

        public double getSCWBeforeVAT() {
            return SCWBeforeVAT;
        }

        public void setSCWBeforeVAT(double SCWBeforeVAT) {
            this.SCWBeforeVAT = SCWBeforeVAT;
        }

        public double getWeightPrice() {
            return WeightPrice;
        }

        public void setWeightPrice(double weightPrice) {
            WeightPrice = weightPrice;
        }

        public double getWeightPriceVAT() {
            return WeightPriceVAT;
        }

        public void setWeightPriceVAT(double weightPriceVAT) {
            WeightPriceVAT = weightPriceVAT;
        }

        public double getWeightBeforeVAT() {
            return WeightBeforeVAT;
        }

        public void setWeightBeforeVAT(double weightBeforeVAT) {
            WeightBeforeVAT = weightBeforeVAT;
        }

        public String getOtherFoodName() {
            return OtherFoodName;
        }

        public void setOtherFoodName(String otherFoodName) {
            OtherFoodName = otherFoodName;
        }

        public int getOtherProductGroupID() {
            return OtherProductGroupID;
        }

        public void setOtherProductGroupID(int otherProductGroupID) {
            OtherProductGroupID = otherProductGroupID;
        }

        public int getDiscountAllow() {
            return DiscountAllow;
        }

        public void setDiscountAllow(int discountAllow) {
            DiscountAllow = discountAllow;
        }

        public int getItemDiscAllow() {
            return ItemDiscAllow;
        }

        public void setItemDiscAllow(int itemDiscAllow) {
            ItemDiscAllow = itemDiscAllow;
        }

        public int getLastTransactionID() {
            return LastTransactionID;
        }

        public void setLastTransactionID(int lastTransactionID) {
            LastTransactionID = lastTransactionID;
        }

        public int getLastComputerID() {
            return LastComputerID;
        }

        public void setLastComputerID(int lastComputerID) {
            LastComputerID = lastComputerID;
        }

        public int getPrinterID() {
            return PrinterID;
        }

        public void setPrinterID(int printerID) {
            PrinterID = printerID;
        }

        public int getInventoryID() {
            return InventoryID;
        }

        public void setInventoryID(int inventoryID) {
            InventoryID = inventoryID;
        }

        public int getOrderStaffID() {
            return OrderStaffID;
        }

        public void setOrderStaffID(int orderStaffID) {
            OrderStaffID = orderStaffID;
        }

        public int getOrderComputerID() {
            return OrderComputerID;
        }

        public void setOrderComputerID(int orderComputerID) {
            OrderComputerID = orderComputerID;
        }

        public int getOrderTableID() {
            return OrderTableID;
        }

        public void setOrderTableID(int orderTableID) {
            OrderTableID = orderTableID;
        }

        public int getVoidTypeID() {
            return VoidTypeID;
        }

        public void setVoidTypeID(int voidTypeID) {
            VoidTypeID = voidTypeID;
        }

        public int getVoidStaffID() {
            return VoidStaffID;
        }

        public void setVoidStaffID(int voidStaffID) {
            VoidStaffID = voidStaffID;
        }

        public String getVoidDateTime() {
            return VoidDateTime;
        }

        public void setVoidDateTime(String voidDateTime) {
            VoidDateTime = voidDateTime;
        }

        public int getVATType() {
            return VATType;
        }

        public void setVATType(int VATType) {
            this.VATType = VATType;
        }

        public int getPrintGroup() {
            return PrintGroup;
        }

        public void setPrintGroup(int printGroup) {
            PrintGroup = printGroup;
        }

        public int getNoPrintBill() {
            return NoPrintBill;
        }

        public void setNoPrintBill(int noPrintBill) {
            NoPrintBill = noPrintBill;
        }

        public int getNoRePrintOrder() {
            return NoRePrintOrder;
        }

        public void setNoRePrintOrder(int noRePrintOrder) {
            NoRePrintOrder = noRePrintOrder;
        }

        public String getStartTime() {
            return StartTime;
        }

        public void setStartTime(String startTime) {
            StartTime = startTime;
        }

        public String getFinishTime() {
            return FinishTime;
        }

        public void setFinishTime(String finishTime) {
            FinishTime = finishTime;
        }

        public int getPrintStatus() {
            return PrintStatus;
        }

        public void setPrintStatus(int printStatus) {
            PrintStatus = printStatus;
        }

        public int getProcessID() {
            return ProcessID;
        }

        public void setProcessID(int processID) {
            ProcessID = processID;
        }

        public String getSubmitOrderDateTime() {
            return SubmitOrderDateTime;
        }

        public void setSubmitOrderDateTime(String submitOrderDateTime) {
            SubmitOrderDateTime = submitOrderDateTime;
        }

        public String getComment() {
            return Comment;
        }

        public void setComment(String comment) {
            Comment = comment;
        }

        public int getIsComment() {
            return IsComment;
        }

        public void setIsComment(int isComment) {
            IsComment = isComment;
        }

        public int getDeleted() {
            return Deleted;
        }

        public void setDeleted(int deleted) {
            Deleted = deleted;
        }

        public String getProductName() {
            return ProductName;
        }

        public void setProductName(String productName) {
            ProductName = productName;
        }

        public double getDiscPricePercent() {
            return DiscPricePercent;
        }

        public void setDiscPricePercent(double discPricePercent) {
            DiscPricePercent = discPricePercent;
        }

        public boolean isChecked() {
            return isChecked;
        }

        public void setChecked(boolean isChecked) {
            this.isChecked = isChecked;
        }
    }
}
