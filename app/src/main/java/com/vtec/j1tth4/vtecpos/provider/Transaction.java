package com.vtec.j1tth4.vtecpos.provider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by j1tth4 on 5/1/15 AD.
 */
public class Transaction {
    private Integer TransactionID;
    private Integer ComputerID;
    private String TransactionUUID;
    private String ReserveTime;
    private Integer ReserveStaffID;
    private String OpenTime;
    private Integer OpenStaffID;
    private String PaidTime;
    private Integer PaidStaffID;
    private String CloseTime;
    private Integer CommStaffID;
    private Double DiscountItem;
    private Double DiscountBill;
    private Double DiscountOther;
    private Double TotalDiscount;
    private Integer TransactionStatusID;
    private Integer SaleMode;
    private String TransactionName;
    private String QueueName;
    private Integer NoCustomer;
    private Integer NoCustomerWhenOpen;
    private Integer DocType;
    private Integer ReceiptYear;
    private Integer ReceiptMonth;
    private Integer ReceiptID;
    private String ReceiptNumber;
    private String SaleDate;
    private Integer ShopID;
    private Double TransactionVAT;
    private Double TransactionVATable;
    private Double TranBeforeVAT;
    private String VATCode;
    private Double VATPercent;
    private Double ServiceChargePercent;
    private Double ServiceCharge;
    private Double ServiceChargeVAT;
    private Double SCBeforeVAT;
    private Double OtherIncome;
    private Double OtherIncomeVAT;
    private Double OhterIncomeBeforeVAT;
    private Double ReceiptTotalQty;
    private Double ReceiptRetailPrice;
    private Double ReceiptDiscount;
    private Double ReceiptSalePrice;
    private Double ReceiptNetSale;
    private Double ReceiptPayPrice;
    private Double ReceiptRoundingBill;
    private Integer SessionID;
    private Integer CloseComputerID;
    private Integer VoidStaffID;
    private String VoidReason;
    private String VoidTime;
    private Integer IsCloneBill;
    private Integer VoidTranID;
    private Integer VoidComID;
    private Double DiffCloneBill;
    private Integer MemberID;
    private Integer HasOrder;
    private Integer NoPrintBillDetail;
    private Double DiffPayCheckBill;
    private String BillDetailReferenceNo;
    private Integer CallForCheckBill;
    private String TransactionNote;
    private Integer CurrentAccessComputer;
    private String UpdateDate;
    private String BeginTime;
    private String EndTime;
    private String PrintWarningTime;
    private String PrintBeginTime;
    private Integer AlreadyCalculateStock;
    private Integer AlreadyExportToHQ;
    private Integer TableID;
    private Integer IsSplitTransaction;
    private Integer IsFromOtherTransaction;
    private String ReferenceNo;
    private Integer FromDepositTransactionID;
    private Integer FromDepositComputerID;
    private Integer Deleted;

    private List<OrderDetail> mOrderDetailLst;

    public Integer getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(Integer transactionID) {
        TransactionID = transactionID;
    }

    public Integer getComputerID() {
        return ComputerID;
    }

    public void setComputerID(Integer computerID) {
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

    public Integer getReserveStaffID() {
        return ReserveStaffID;
    }

    public void setReserveStaffID(Integer reserveStaffID) {
        ReserveStaffID = reserveStaffID;
    }

    public String getOpenTime() {
        return OpenTime;
    }

    public void setOpenTime(String openTime) {
        OpenTime = openTime;
    }

    public Integer getOpenStaffID() {
        return OpenStaffID;
    }

    public void setOpenStaffID(Integer openStaffID) {
        OpenStaffID = openStaffID;
    }

    public String getPaidTime() {
        return PaidTime;
    }

    public void setPaidTime(String paidTime) {
        PaidTime = paidTime;
    }

    public Integer getPaidStaffID() {
        return PaidStaffID;
    }

    public void setPaidStaffID(Integer paidStaffID) {
        PaidStaffID = paidStaffID;
    }

    public String getCloseTime() {
        return CloseTime;
    }

    public void setCloseTime(String closeTime) {
        CloseTime = closeTime;
    }

    public Integer getCommStaffID() {
        return CommStaffID;
    }

    public void setCommStaffID(Integer commStaffID) {
        CommStaffID = commStaffID;
    }

    public Double getDiscountItem() {
        return DiscountItem;
    }

    public void setDiscountItem(Double discountItem) {
        DiscountItem = discountItem;
    }

    public Double getDiscountBill() {
        return DiscountBill;
    }

    public void setDiscountBill(Double discountBill) {
        DiscountBill = discountBill;
    }

    public Double getDiscountOther() {
        return DiscountOther;
    }

    public void setDiscountOther(Double discountOther) {
        DiscountOther = discountOther;
    }

    public Double getTotalDiscount() {
        return TotalDiscount;
    }

    public void setTotalDiscount(Double totalDiscount) {
        TotalDiscount = totalDiscount;
    }

    public Integer getTransactionStatusID() {
        return TransactionStatusID;
    }

    public void setTransactionStatusID(Integer transactionStatusID) {
        TransactionStatusID = transactionStatusID;
    }

    public Integer getSaleMode() {
        return SaleMode;
    }

    public void setSaleMode(Integer saleMode) {
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

    public Integer getNoCustomer() {
        return NoCustomer;
    }

    public void setNoCustomer(Integer noCustomer) {
        NoCustomer = noCustomer;
    }

    public Integer getNoCustomerWhenOpen() {
        return NoCustomerWhenOpen;
    }

    public void setNoCustomerWhenOpen(Integer noCustomerWhenOpen) {
        NoCustomerWhenOpen = noCustomerWhenOpen;
    }

    public Integer getDocType() {
        return DocType;
    }

    public void setDocType(Integer docType) {
        DocType = docType;
    }

    public Integer getReceiptYear() {
        return ReceiptYear;
    }

    public void setReceiptYear(Integer receiptYear) {
        ReceiptYear = receiptYear;
    }

    public Integer getReceiptMonth() {
        return ReceiptMonth;
    }

    public void setReceiptMonth(Integer receiptMonth) {
        ReceiptMonth = receiptMonth;
    }

    public Integer getReceiptID() {
        return ReceiptID;
    }

    public void setReceiptID(Integer receiptID) {
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

    public Integer getShopID() {
        return ShopID;
    }

    public void setShopID(Integer shopID) {
        ShopID = shopID;
    }

    public Double getTransactionVAT() {
        return TransactionVAT;
    }

    public void setTransactionVAT(Double transactionVAT) {
        TransactionVAT = transactionVAT;
    }

    public Double getTransactionVATable() {
        return TransactionVATable;
    }

    public void setTransactionVATable(Double transactionVATable) {
        TransactionVATable = transactionVATable;
    }

    public Double getTranBeforeVAT() {
        return TranBeforeVAT;
    }

    public void setTranBeforeVAT(Double tranBeforeVAT) {
        TranBeforeVAT = tranBeforeVAT;
    }

    public String getVATCode() {
        return VATCode;
    }

    public void setVATCode(String VATCode) {
        this.VATCode = VATCode;
    }

    public Double getVATPercent() {
        return VATPercent;
    }

    public void setVATPercent(Double VATPercent) {
        this.VATPercent = VATPercent;
    }

    public Double getServiceChargePercent() {
        return ServiceChargePercent;
    }

    public void setServiceChargePercent(Double serviceChargePercent) {
        ServiceChargePercent = serviceChargePercent;
    }

    public Double getServiceCharge() {
        return ServiceCharge;
    }

    public void setServiceCharge(Double serviceCharge) {
        ServiceCharge = serviceCharge;
    }

    public Double getServiceChargeVAT() {
        return ServiceChargeVAT;
    }

    public void setServiceChargeVAT(Double serviceChargeVAT) {
        ServiceChargeVAT = serviceChargeVAT;
    }

    public Double getSCBeforeVAT() {
        return SCBeforeVAT;
    }

    public void setSCBeforeVAT(Double SCBeforeVAT) {
        this.SCBeforeVAT = SCBeforeVAT;
    }

    public Double getOtherIncome() {
        return OtherIncome;
    }

    public void setOtherIncome(Double otherIncome) {
        OtherIncome = otherIncome;
    }

    public Double getOtherIncomeVAT() {
        return OtherIncomeVAT;
    }

    public void setOtherIncomeVAT(Double otherIncomeVAT) {
        OtherIncomeVAT = otherIncomeVAT;
    }

    public Double getOhterIncomeBeforeVAT() {
        return OhterIncomeBeforeVAT;
    }

    public void setOhterIncomeBeforeVAT(Double ohterIncomeBeforeVAT) {
        OhterIncomeBeforeVAT = ohterIncomeBeforeVAT;
    }

    public Double getReceiptTotalQty() {
        return ReceiptTotalQty;
    }

    public void setReceiptTotalQty(Double receiptTotalQty) {
        ReceiptTotalQty = receiptTotalQty;
    }

    public Double getReceiptRetailPrice() {
        return ReceiptRetailPrice;
    }

    public void setReceiptRetailPrice(Double receiptRetailPrice) {
        ReceiptRetailPrice = receiptRetailPrice;
    }

    public Double getReceiptDiscount() {
        return ReceiptDiscount;
    }

    public void setReceiptDiscount(Double receiptDiscount) {
        ReceiptDiscount = receiptDiscount;
    }

    public Double getReceiptSalePrice() {
        return ReceiptSalePrice;
    }

    public void setReceiptSalePrice(Double receiptSalePrice) {
        ReceiptSalePrice = receiptSalePrice;
    }

    public Double getReceiptNetSale() {
        return ReceiptNetSale;
    }

    public void setReceiptNetSale(Double receiptNetSale) {
        ReceiptNetSale = receiptNetSale;
    }

    public Double getReceiptPayPrice() {
        return ReceiptPayPrice;
    }

    public void setReceiptPayPrice(Double receiptPayPrice) {
        ReceiptPayPrice = receiptPayPrice;
    }

    public Double getReceiptRoundingBill() {
        return ReceiptRoundingBill;
    }

    public void setReceiptRoundingBill(Double receiptRoundingBill) {
        ReceiptRoundingBill = receiptRoundingBill;
    }

    public Integer getSessionID() {
        return SessionID;
    }

    public void setSessionID(Integer sessionID) {
        SessionID = sessionID;
    }

    public Integer getCloseComputerID() {
        return CloseComputerID;
    }

    public void setCloseComputerID(Integer closeComputerID) {
        CloseComputerID = closeComputerID;
    }

    public Integer getVoidStaffID() {
        return VoidStaffID;
    }

    public void setVoidStaffID(Integer voidStaffID) {
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

    public Integer getIsCloneBill() {
        return IsCloneBill;
    }

    public void setIsCloneBill(Integer isCloneBill) {
        IsCloneBill = isCloneBill;
    }

    public Integer getVoidTranID() {
        return VoidTranID;
    }

    public void setVoidTranID(Integer voidTranID) {
        VoidTranID = voidTranID;
    }

    public Integer getVoidComID() {
        return VoidComID;
    }

    public void setVoidComID(Integer voidComID) {
        VoidComID = voidComID;
    }

    public Double getDiffCloneBill() {
        return DiffCloneBill;
    }

    public void setDiffCloneBill(Double diffCloneBill) {
        DiffCloneBill = diffCloneBill;
    }

    public Integer getMemberID() {
        return MemberID;
    }

    public void setMemberID(Integer memberID) {
        MemberID = memberID;
    }

    public Integer getHasOrder() {
        return HasOrder;
    }

    public void setHasOrder(Integer hasOrder) {
        HasOrder = hasOrder;
    }

    public Integer getNoPrintBillDetail() {
        return NoPrintBillDetail;
    }

    public void setNoPrintBillDetail(Integer noPrintBillDetail) {
        NoPrintBillDetail = noPrintBillDetail;
    }

    public Double getDiffPayCheckBill() {
        return DiffPayCheckBill;
    }

    public void setDiffPayCheckBill(Double diffPayCheckBill) {
        DiffPayCheckBill = diffPayCheckBill;
    }

    public String getBillDetailReferenceNo() {
        return BillDetailReferenceNo;
    }

    public void setBillDetailReferenceNo(String billDetailReferenceNo) {
        BillDetailReferenceNo = billDetailReferenceNo;
    }

    public Integer getCallForCheckBill() {
        return CallForCheckBill;
    }

    public void setCallForCheckBill(Integer callForCheckBill) {
        CallForCheckBill = callForCheckBill;
    }

    public String getTransactionNote() {
        return TransactionNote;
    }

    public void setTransactionNote(String transactionNote) {
        TransactionNote = transactionNote;
    }

    public Integer getCurrentAccessComputer() {
        return CurrentAccessComputer;
    }

    public void setCurrentAccessComputer(Integer currentAccessComputer) {
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

    public Integer getAlreadyCalculateStock() {
        return AlreadyCalculateStock;
    }

    public void setAlreadyCalculateStock(Integer alreadyCalculateStock) {
        AlreadyCalculateStock = alreadyCalculateStock;
    }

    public Integer getAlreadyExportToHQ() {
        return AlreadyExportToHQ;
    }

    public void setAlreadyExportToHQ(Integer alreadyExportToHQ) {
        AlreadyExportToHQ = alreadyExportToHQ;
    }

    public Integer getTableID() {
        return TableID;
    }

    public void setTableID(Integer tableID) {
        TableID = tableID;
    }

    public Integer getIsSplitTransaction() {
        return IsSplitTransaction;
    }

    public void setIsSplitTransaction(Integer isSplitTransaction) {
        IsSplitTransaction = isSplitTransaction;
    }

    public Integer getIsFromOtherTransaction() {
        return IsFromOtherTransaction;
    }

    public void setIsFromOtherTransaction(Integer isFromOtherTransaction) {
        IsFromOtherTransaction = isFromOtherTransaction;
    }

    public String getReferenceNo() {
        return ReferenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        ReferenceNo = referenceNo;
    }

    public Integer getFromDepositTransactionID() {
        return FromDepositTransactionID;
    }

    public void setFromDepositTransactionID(Integer fromDepositTransactionID) {
        FromDepositTransactionID = fromDepositTransactionID;
    }

    public Integer getFromDepositComputerID() {
        return FromDepositComputerID;
    }

    public void setFromDepositComputerID(Integer fromDepositComputerID) {
        FromDepositComputerID = fromDepositComputerID;
    }

    public Integer getDeleted() {
        return Deleted;
    }

    public void setDeleted(Integer deleted) {
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
        private Integer OrderDetailID;
        private Integer TransactionID;
        private Integer ComputerID;
        private Integer ComponentLevel;
        private Integer OrderDetailLinkID;
        private Integer InsertOrderNo;
        private Integer IndentLevel;
        private Integer DisplayOrdering;
        private String SaleDate;
        private Integer ShopID;
        private Integer ProductID;
        private Integer ProductSetType;
        private Integer OrderStatusID;
        private Integer SaleMode;
        private Double TotalQty;
        private Double PricePerUnit;
        private Double TotalRetailPrice;
        private Double OrgPricePerUnit;
        private Double OrgTotalRetailPrice;
        private Double DiscPrice;
        private Double DiscPercent;
        private Double DiscPricePercent;
        private Double DiscAmount;
        private Double DiscOtherPercent;
        private Double DiscOther;
        private Double TotalItemDisc;
        private Double SalePrice;
        private Double DiscBill;
        private Double TotalDiscount;
        private Double NetSale;
        private Double Vatable;
        private String ProductVATCode;
        private String VATDisplay;
        private Double ProductVATPercent;
        private Double ProductVAT;
        private Double ProductBeforeVAT;
        private Double TotalRetailVAT;
        private Double DiscVAT;
        private Integer IsSCBeforeDisc;
        private Integer HasServiceCharge;
        private Double SCPercent;
        private Double SCAmount;
        private Double SCVAT;
        private Double SCBeforeVAT;
        private Double WVatable;
        private Double SCWAmount;
        private Double SCWVAT;
        private Double SCWBeforeVAT;
        private Double WeightPrice;
        private Double WeightPriceVAT;
        private Double WeightBeforeVAT;
        private String OtherFoodName;
        private Integer OtherProductGroupID;
        private Integer DiscountAllow;
        private Integer ItemDiscAllow;
        private Integer LastTransactionID;
        private Integer LastComputerID;
        private Integer PrinterID;
        private Integer InventoryID;
        private Integer OrderStaffID;
        private Integer OrderComputerID;
        private Integer OrderTableID;
        private Integer VoidTypeID;
        private Integer VoidStaffID;
        private String VoidDateTime;
        private Integer VATType;
        private Integer PrintGroup;
        private Integer NoPrintBill;
        private Integer NoRePrintOrder;
        private String StartTime;
        private String FinishTime;
        private Integer PrintStatus;
        private Integer ProcessID;
        private String SubmitOrderDateTime;
        private String Comment;
        private Integer IsComment;
        private Integer Deleted;
        private String ProductName;

        public Integer getOrderDetailID() {
            return OrderDetailID;
        }

        public void setOrderDetailID(Integer orderDetailID) {
            OrderDetailID = orderDetailID;
        }

        public Integer getTransactionID() {
            return TransactionID;
        }

        public void setTransactionID(Integer transactionID) {
            TransactionID = transactionID;
        }

        public Integer getComputerID() {
            return ComputerID;
        }

        public void setComputerID(Integer computerID) {
            ComputerID = computerID;
        }

        public Integer getComponentLevel() {
            return ComponentLevel;
        }

        public void setComponentLevel(Integer componentLevel) {
            ComponentLevel = componentLevel;
        }

        public Integer getOrderDetailLinkID() {
            return OrderDetailLinkID;
        }

        public void setOrderDetailLinkID(Integer orderDetailLinkID) {
            OrderDetailLinkID = orderDetailLinkID;
        }

        public Integer getInsertOrderNo() {
            return InsertOrderNo;
        }

        public void setInsertOrderNo(Integer insertOrderNo) {
            InsertOrderNo = insertOrderNo;
        }

        public Integer getIndentLevel() {
            return IndentLevel;
        }

        public void setIndentLevel(Integer indentLevel) {
            IndentLevel = indentLevel;
        }

        public Integer getDisplayOrdering() {
            return DisplayOrdering;
        }

        public void setDisplayOrdering(Integer displayOrdering) {
            DisplayOrdering = displayOrdering;
        }

        public String getSaleDate() {
            return SaleDate;
        }

        public void setSaleDate(String saleDate) {
            SaleDate = saleDate;
        }

        public Integer getShopID() {
            return ShopID;
        }

        public void setShopID(Integer shopID) {
            ShopID = shopID;
        }

        public Integer getProductID() {
            return ProductID;
        }

        public void setProductID(Integer productID) {
            ProductID = productID;
        }

        public Integer getProductSetType() {
            return ProductSetType;
        }

        public void setProductSetType(Integer productSetType) {
            ProductSetType = productSetType;
        }

        public Integer getOrderStatusID() {
            return OrderStatusID;
        }

        public void setOrderStatusID(Integer orderStatusID) {
            OrderStatusID = orderStatusID;
        }

        public Integer getSaleMode() {
            return SaleMode;
        }

        public void setSaleMode(Integer saleMode) {
            SaleMode = saleMode;
        }

        public Double getTotalQty() {
            return TotalQty;
        }

        public void setTotalQty(Double totalQty) {
            TotalQty = totalQty;
        }

        public Double getPricePerUnit() {
            return PricePerUnit;
        }

        public void setPricePerUnit(Double pricePerUnit) {
            PricePerUnit = pricePerUnit;
        }

        public Double getTotalRetailPrice() {
            return TotalRetailPrice;
        }

        public void setTotalRetailPrice(Double totalRetailPrice) {
            TotalRetailPrice = totalRetailPrice;
        }

        public Double getOrgPricePerUnit() {
            return OrgPricePerUnit;
        }

        public void setOrgPricePerUnit(Double orgPricePerUnit) {
            OrgPricePerUnit = orgPricePerUnit;
        }

        public Double getOrgTotalRetailPrice() {
            return OrgTotalRetailPrice;
        }

        public void setOrgTotalRetailPrice(Double orgTotalRetailPrice) {
            OrgTotalRetailPrice = orgTotalRetailPrice;
        }

        public Double getDiscPrice() {
            return DiscPrice;
        }

        public void setDiscPrice(Double discPrice) {
            DiscPrice = discPrice;
        }

        public Double getDiscPercent() {
            return DiscPercent;
        }

        public void setDiscPercent(Double discPercent) {
            DiscPercent = discPercent;
        }

        public Double getDiscAmount() {
            return DiscAmount;
        }

        public void setDiscAmount(Double discAmount) {
            DiscAmount = discAmount;
        }

        public Double getDiscOtherPercent() {
            return DiscOtherPercent;
        }

        public void setDiscOtherPercent(Double discOtherPercent) {
            DiscOtherPercent = discOtherPercent;
        }

        public Double getDiscOther() {
            return DiscOther;
        }

        public void setDiscOther(Double discOther) {
            DiscOther = discOther;
        }

        public Double getTotalItemDisc() {
            return TotalItemDisc;
        }

        public void setTotalItemDisc(Double totalItemDisc) {
            TotalItemDisc = totalItemDisc;
        }

        public Double getSalePrice() {
            return SalePrice;
        }

        public void setSalePrice(Double salePrice) {
            SalePrice = salePrice;
        }

        public Double getDiscBill() {
            return DiscBill;
        }

        public void setDiscBill(Double discBill) {
            DiscBill = discBill;
        }

        public Double getTotalDiscount() {
            return TotalDiscount;
        }

        public void setTotalDiscount(Double totalDiscount) {
            TotalDiscount = totalDiscount;
        }

        public Double getNetSale() {
            return NetSale;
        }

        public void setNetSale(Double netSale) {
            NetSale = netSale;
        }

        public Double getVatable() {
            return Vatable;
        }

        public void setVatable(Double vatable) {
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

        public Double getProductVATPercent() {
            return ProductVATPercent;
        }

        public void setProductVATPercent(Double productVATPercent) {
            ProductVATPercent = productVATPercent;
        }

        public Double getProductVAT() {
            return ProductVAT;
        }

        public void setProductVAT(Double productVAT) {
            ProductVAT = productVAT;
        }

        public Double getProductBeforeVAT() {
            return ProductBeforeVAT;
        }

        public void setProductBeforeVAT(Double productBeforeVAT) {
            ProductBeforeVAT = productBeforeVAT;
        }

        public Double getTotalRetailVAT() {
            return TotalRetailVAT;
        }

        public void setTotalRetailVAT(Double totalRetailVAT) {
            TotalRetailVAT = totalRetailVAT;
        }

        public Double getDiscVAT() {
            return DiscVAT;
        }

        public void setDiscVAT(Double discVAT) {
            DiscVAT = discVAT;
        }

        public Integer getIsSCBeforeDisc() {
            return IsSCBeforeDisc;
        }

        public void setIsSCBeforeDisc(Integer isSCBeforeDisc) {
            IsSCBeforeDisc = isSCBeforeDisc;
        }

        public Integer getHasServiceCharge() {
            return HasServiceCharge;
        }

        public void setHasServiceCharge(Integer hasServiceCharge) {
            HasServiceCharge = hasServiceCharge;
        }

        public Double getSCPercent() {
            return SCPercent;
        }

        public void setSCPercent(Double SCPercent) {
            this.SCPercent = SCPercent;
        }

        public Double getSCAmount() {
            return SCAmount;
        }

        public void setSCAmount(Double SCAmount) {
            this.SCAmount = SCAmount;
        }

        public Double getSCVAT() {
            return SCVAT;
        }

        public void setSCVAT(Double SCVAT) {
            this.SCVAT = SCVAT;
        }

        public Double getSCBeforeVAT() {
            return SCBeforeVAT;
        }

        public void setSCBeforeVAT(Double SCBeforeVAT) {
            this.SCBeforeVAT = SCBeforeVAT;
        }

        public Double getWVatable() {
            return WVatable;
        }

        public void setWVatable(Double WVatable) {
            this.WVatable = WVatable;
        }

        public Double getSCWAmount() {
            return SCWAmount;
        }

        public void setSCWAmount(Double SCWAmount) {
            this.SCWAmount = SCWAmount;
        }

        public Double getSCWVAT() {
            return SCWVAT;
        }

        public void setSCWVAT(Double SCWVAT) {
            this.SCWVAT = SCWVAT;
        }

        public Double getSCWBeforeVAT() {
            return SCWBeforeVAT;
        }

        public void setSCWBeforeVAT(Double SCWBeforeVAT) {
            this.SCWBeforeVAT = SCWBeforeVAT;
        }

        public Double getWeightPrice() {
            return WeightPrice;
        }

        public void setWeightPrice(Double weightPrice) {
            WeightPrice = weightPrice;
        }

        public Double getWeightPriceVAT() {
            return WeightPriceVAT;
        }

        public void setWeightPriceVAT(Double weightPriceVAT) {
            WeightPriceVAT = weightPriceVAT;
        }

        public Double getWeightBeforeVAT() {
            return WeightBeforeVAT;
        }

        public void setWeightBeforeVAT(Double weightBeforeVAT) {
            WeightBeforeVAT = weightBeforeVAT;
        }

        public String getOtherFoodName() {
            return OtherFoodName;
        }

        public void setOtherFoodName(String otherFoodName) {
            OtherFoodName = otherFoodName;
        }

        public Integer getOtherProductGroupID() {
            return OtherProductGroupID;
        }

        public void setOtherProductGroupID(Integer otherProductGroupID) {
            OtherProductGroupID = otherProductGroupID;
        }

        public Integer getDiscountAllow() {
            return DiscountAllow;
        }

        public void setDiscountAllow(Integer discountAllow) {
            DiscountAllow = discountAllow;
        }

        public Integer getItemDiscAllow() {
            return ItemDiscAllow;
        }

        public void setItemDiscAllow(Integer itemDiscAllow) {
            ItemDiscAllow = itemDiscAllow;
        }

        public Integer getLastTransactionID() {
            return LastTransactionID;
        }

        public void setLastTransactionID(Integer lastTransactionID) {
            LastTransactionID = lastTransactionID;
        }

        public Integer getLastComputerID() {
            return LastComputerID;
        }

        public void setLastComputerID(Integer lastComputerID) {
            LastComputerID = lastComputerID;
        }

        public Integer getPrinterID() {
            return PrinterID;
        }

        public void setPrinterID(Integer printerID) {
            PrinterID = printerID;
        }

        public Integer getInventoryID() {
            return InventoryID;
        }

        public void setInventoryID(Integer inventoryID) {
            InventoryID = inventoryID;
        }

        public Integer getOrderStaffID() {
            return OrderStaffID;
        }

        public void setOrderStaffID(Integer orderStaffID) {
            OrderStaffID = orderStaffID;
        }

        public Integer getOrderComputerID() {
            return OrderComputerID;
        }

        public void setOrderComputerID(Integer orderComputerID) {
            OrderComputerID = orderComputerID;
        }

        public Integer getOrderTableID() {
            return OrderTableID;
        }

        public void setOrderTableID(Integer orderTableID) {
            OrderTableID = orderTableID;
        }

        public Integer getVoidTypeID() {
            return VoidTypeID;
        }

        public void setVoidTypeID(Integer voidTypeID) {
            VoidTypeID = voidTypeID;
        }

        public Integer getVoidStaffID() {
            return VoidStaffID;
        }

        public void setVoidStaffID(Integer voidStaffID) {
            VoidStaffID = voidStaffID;
        }

        public String getVoidDateTime() {
            return VoidDateTime;
        }

        public void setVoidDateTime(String voidDateTime) {
            VoidDateTime = voidDateTime;
        }

        public Integer getVATType() {
            return VATType;
        }

        public void setVATType(Integer VATType) {
            this.VATType = VATType;
        }

        public Integer getPrintGroup() {
            return PrintGroup;
        }

        public void setPrintGroup(Integer printGroup) {
            PrintGroup = printGroup;
        }

        public Integer getNoPrintBill() {
            return NoPrintBill;
        }

        public void setNoPrintBill(Integer noPrintBill) {
            NoPrintBill = noPrintBill;
        }

        public Integer getNoRePrintOrder() {
            return NoRePrintOrder;
        }

        public void setNoRePrintOrder(Integer noRePrintOrder) {
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

        public Integer getPrintStatus() {
            return PrintStatus;
        }

        public void setPrintStatus(Integer printStatus) {
            PrintStatus = printStatus;
        }

        public Integer getProcessID() {
            return ProcessID;
        }

        public void setProcessID(Integer processID) {
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

        public Integer getIsComment() {
            return IsComment;
        }

        public void setIsComment(Integer isComment) {
            IsComment = isComment;
        }

        public Integer getDeleted() {
            return Deleted;
        }

        public void setDeleted(Integer deleted) {
            Deleted = deleted;
        }

        public String getProductName() {
            return ProductName;
        }

        public void setProductName(String productName) {
            ProductName = productName;
        }

        public Double getDiscPricePercent() {
            return DiscPricePercent;
        }

        public void setDiscPricePercent(Double discPricePercent) {
            DiscPricePercent = discPricePercent;
        }
    }
}
