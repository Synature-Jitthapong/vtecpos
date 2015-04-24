package com.vtec.j1tth4.vtecpos.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table OrderTransaction.
 */
public class OrderTransaction {

    private Integer TransactionID;
    private Integer ComputerID;
    private String TransactionUUID;
    private java.util.Date ReserveTime;
    private Integer ReserveStaffID;
    private java.util.Date OpenTime;
    private Integer OpenStaffID;
    private java.util.Date PaidTime;
    private Integer PaidStaffID;
    private java.util.Date CloseTime;
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
    private java.util.Date SaleDate;
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
    private java.util.Date VoidTime;
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
    private java.util.Date UpdateDate;
    private java.util.Date BeginTime;
    private java.util.Date EndTime;
    private java.util.Date PrintWarningTime;
    private java.util.Date PrintBeginTime;
    private Integer AlreadyCalculateStock;
    private Integer AlreadyExportToHQ;
    private Integer TableID;
    private Integer IsSplitTransaction;
    private Integer IsFromOtherTransaction;
    private String ReferenceNo;
    private Integer FromDepositTransactionID;
    private Integer FromDepositComputerID;
    private Integer Deleted;

    public OrderTransaction() {
    }

    public OrderTransaction(Integer TransactionID, Integer ComputerID) {
        this.TransactionID = TransactionID;
        this.ComputerID = ComputerID;
    }

    public OrderTransaction(Integer TransactionID, Integer ComputerID, String TransactionUUID, java.util.Date ReserveTime, Integer ReserveStaffID, java.util.Date OpenTime, Integer OpenStaffID, java.util.Date PaidTime, Integer PaidStaffID, java.util.Date CloseTime, Integer CommStaffID, Double DiscountItem, Double DiscountBill, Double DiscountOther, Double TotalDiscount, Integer TransactionStatusID, Integer SaleMode, String TransactionName, String QueueName, Integer NoCustomer, Integer NoCustomerWhenOpen, Integer DocType, Integer ReceiptYear, Integer ReceiptMonth, Integer ReceiptID, String ReceiptNumber, java.util.Date SaleDate, Integer ShopID, Double TransactionVAT, Double TransactionVATable, Double TranBeforeVAT, String VATCode, Double VATPercent, Double ServiceChargePercent, Double ServiceCharge, Double ServiceChargeVAT, Double SCBeforeVAT, Double OtherIncome, Double OtherIncomeVAT, Double OhterIncomeBeforeVAT, Double ReceiptTotalQty, Double ReceiptRetailPrice, Double ReceiptDiscount, Double ReceiptSalePrice, Double ReceiptNetSale, Double ReceiptPayPrice, Double ReceiptRoundingBill, Integer SessionID, Integer CloseComputerID, Integer VoidStaffID, String VoidReason, java.util.Date VoidTime, Integer IsCloneBill, Integer VoidTranID, Integer VoidComID, Double DiffCloneBill, Integer MemberID, Integer HasOrder, Integer NoPrintBillDetail, Double DiffPayCheckBill, String BillDetailReferenceNo, Integer CallForCheckBill, String TransactionNote, Integer CurrentAccessComputer, java.util.Date UpdateDate, java.util.Date BeginTime, java.util.Date EndTime, java.util.Date PrintWarningTime, java.util.Date PrintBeginTime, Integer AlreadyCalculateStock, Integer AlreadyExportToHQ, Integer TableID, Integer IsSplitTransaction, Integer IsFromOtherTransaction, String ReferenceNo, Integer FromDepositTransactionID, Integer FromDepositComputerID, Integer Deleted) {
        this.TransactionID = TransactionID;
        this.ComputerID = ComputerID;
        this.TransactionUUID = TransactionUUID;
        this.ReserveTime = ReserveTime;
        this.ReserveStaffID = ReserveStaffID;
        this.OpenTime = OpenTime;
        this.OpenStaffID = OpenStaffID;
        this.PaidTime = PaidTime;
        this.PaidStaffID = PaidStaffID;
        this.CloseTime = CloseTime;
        this.CommStaffID = CommStaffID;
        this.DiscountItem = DiscountItem;
        this.DiscountBill = DiscountBill;
        this.DiscountOther = DiscountOther;
        this.TotalDiscount = TotalDiscount;
        this.TransactionStatusID = TransactionStatusID;
        this.SaleMode = SaleMode;
        this.TransactionName = TransactionName;
        this.QueueName = QueueName;
        this.NoCustomer = NoCustomer;
        this.NoCustomerWhenOpen = NoCustomerWhenOpen;
        this.DocType = DocType;
        this.ReceiptYear = ReceiptYear;
        this.ReceiptMonth = ReceiptMonth;
        this.ReceiptID = ReceiptID;
        this.ReceiptNumber = ReceiptNumber;
        this.SaleDate = SaleDate;
        this.ShopID = ShopID;
        this.TransactionVAT = TransactionVAT;
        this.TransactionVATable = TransactionVATable;
        this.TranBeforeVAT = TranBeforeVAT;
        this.VATCode = VATCode;
        this.VATPercent = VATPercent;
        this.ServiceChargePercent = ServiceChargePercent;
        this.ServiceCharge = ServiceCharge;
        this.ServiceChargeVAT = ServiceChargeVAT;
        this.SCBeforeVAT = SCBeforeVAT;
        this.OtherIncome = OtherIncome;
        this.OtherIncomeVAT = OtherIncomeVAT;
        this.OhterIncomeBeforeVAT = OhterIncomeBeforeVAT;
        this.ReceiptTotalQty = ReceiptTotalQty;
        this.ReceiptRetailPrice = ReceiptRetailPrice;
        this.ReceiptDiscount = ReceiptDiscount;
        this.ReceiptSalePrice = ReceiptSalePrice;
        this.ReceiptNetSale = ReceiptNetSale;
        this.ReceiptPayPrice = ReceiptPayPrice;
        this.ReceiptRoundingBill = ReceiptRoundingBill;
        this.SessionID = SessionID;
        this.CloseComputerID = CloseComputerID;
        this.VoidStaffID = VoidStaffID;
        this.VoidReason = VoidReason;
        this.VoidTime = VoidTime;
        this.IsCloneBill = IsCloneBill;
        this.VoidTranID = VoidTranID;
        this.VoidComID = VoidComID;
        this.DiffCloneBill = DiffCloneBill;
        this.MemberID = MemberID;
        this.HasOrder = HasOrder;
        this.NoPrintBillDetail = NoPrintBillDetail;
        this.DiffPayCheckBill = DiffPayCheckBill;
        this.BillDetailReferenceNo = BillDetailReferenceNo;
        this.CallForCheckBill = CallForCheckBill;
        this.TransactionNote = TransactionNote;
        this.CurrentAccessComputer = CurrentAccessComputer;
        this.UpdateDate = UpdateDate;
        this.BeginTime = BeginTime;
        this.EndTime = EndTime;
        this.PrintWarningTime = PrintWarningTime;
        this.PrintBeginTime = PrintBeginTime;
        this.AlreadyCalculateStock = AlreadyCalculateStock;
        this.AlreadyExportToHQ = AlreadyExportToHQ;
        this.TableID = TableID;
        this.IsSplitTransaction = IsSplitTransaction;
        this.IsFromOtherTransaction = IsFromOtherTransaction;
        this.ReferenceNo = ReferenceNo;
        this.FromDepositTransactionID = FromDepositTransactionID;
        this.FromDepositComputerID = FromDepositComputerID;
        this.Deleted = Deleted;
    }

    public Integer getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(Integer TransactionID) {
        this.TransactionID = TransactionID;
    }

    public Integer getComputerID() {
        return ComputerID;
    }

    public void setComputerID(Integer ComputerID) {
        this.ComputerID = ComputerID;
    }

    public String getTransactionUUID() {
        return TransactionUUID;
    }

    public void setTransactionUUID(String TransactionUUID) {
        this.TransactionUUID = TransactionUUID;
    }

    public java.util.Date getReserveTime() {
        return ReserveTime;
    }

    public void setReserveTime(java.util.Date ReserveTime) {
        this.ReserveTime = ReserveTime;
    }

    public Integer getReserveStaffID() {
        return ReserveStaffID;
    }

    public void setReserveStaffID(Integer ReserveStaffID) {
        this.ReserveStaffID = ReserveStaffID;
    }

    public java.util.Date getOpenTime() {
        return OpenTime;
    }

    public void setOpenTime(java.util.Date OpenTime) {
        this.OpenTime = OpenTime;
    }

    public Integer getOpenStaffID() {
        return OpenStaffID;
    }

    public void setOpenStaffID(Integer OpenStaffID) {
        this.OpenStaffID = OpenStaffID;
    }

    public java.util.Date getPaidTime() {
        return PaidTime;
    }

    public void setPaidTime(java.util.Date PaidTime) {
        this.PaidTime = PaidTime;
    }

    public Integer getPaidStaffID() {
        return PaidStaffID;
    }

    public void setPaidStaffID(Integer PaidStaffID) {
        this.PaidStaffID = PaidStaffID;
    }

    public java.util.Date getCloseTime() {
        return CloseTime;
    }

    public void setCloseTime(java.util.Date CloseTime) {
        this.CloseTime = CloseTime;
    }

    public Integer getCommStaffID() {
        return CommStaffID;
    }

    public void setCommStaffID(Integer CommStaffID) {
        this.CommStaffID = CommStaffID;
    }

    public Double getDiscountItem() {
        return DiscountItem;
    }

    public void setDiscountItem(Double DiscountItem) {
        this.DiscountItem = DiscountItem;
    }

    public Double getDiscountBill() {
        return DiscountBill;
    }

    public void setDiscountBill(Double DiscountBill) {
        this.DiscountBill = DiscountBill;
    }

    public Double getDiscountOther() {
        return DiscountOther;
    }

    public void setDiscountOther(Double DiscountOther) {
        this.DiscountOther = DiscountOther;
    }

    public Double getTotalDiscount() {
        return TotalDiscount;
    }

    public void setTotalDiscount(Double TotalDiscount) {
        this.TotalDiscount = TotalDiscount;
    }

    public Integer getTransactionStatusID() {
        return TransactionStatusID;
    }

    public void setTransactionStatusID(Integer TransactionStatusID) {
        this.TransactionStatusID = TransactionStatusID;
    }

    public Integer getSaleMode() {
        return SaleMode;
    }

    public void setSaleMode(Integer SaleMode) {
        this.SaleMode = SaleMode;
    }

    public String getTransactionName() {
        return TransactionName;
    }

    public void setTransactionName(String TransactionName) {
        this.TransactionName = TransactionName;
    }

    public String getQueueName() {
        return QueueName;
    }

    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    public Integer getNoCustomer() {
        return NoCustomer;
    }

    public void setNoCustomer(Integer NoCustomer) {
        this.NoCustomer = NoCustomer;
    }

    public Integer getNoCustomerWhenOpen() {
        return NoCustomerWhenOpen;
    }

    public void setNoCustomerWhenOpen(Integer NoCustomerWhenOpen) {
        this.NoCustomerWhenOpen = NoCustomerWhenOpen;
    }

    public Integer getDocType() {
        return DocType;
    }

    public void setDocType(Integer DocType) {
        this.DocType = DocType;
    }

    public Integer getReceiptYear() {
        return ReceiptYear;
    }

    public void setReceiptYear(Integer ReceiptYear) {
        this.ReceiptYear = ReceiptYear;
    }

    public Integer getReceiptMonth() {
        return ReceiptMonth;
    }

    public void setReceiptMonth(Integer ReceiptMonth) {
        this.ReceiptMonth = ReceiptMonth;
    }

    public Integer getReceiptID() {
        return ReceiptID;
    }

    public void setReceiptID(Integer ReceiptID) {
        this.ReceiptID = ReceiptID;
    }

    public String getReceiptNumber() {
        return ReceiptNumber;
    }

    public void setReceiptNumber(String ReceiptNumber) {
        this.ReceiptNumber = ReceiptNumber;
    }

    public java.util.Date getSaleDate() {
        return SaleDate;
    }

    public void setSaleDate(java.util.Date SaleDate) {
        this.SaleDate = SaleDate;
    }

    public Integer getShopID() {
        return ShopID;
    }

    public void setShopID(Integer ShopID) {
        this.ShopID = ShopID;
    }

    public Double getTransactionVAT() {
        return TransactionVAT;
    }

    public void setTransactionVAT(Double TransactionVAT) {
        this.TransactionVAT = TransactionVAT;
    }

    public Double getTransactionVATable() {
        return TransactionVATable;
    }

    public void setTransactionVATable(Double TransactionVATable) {
        this.TransactionVATable = TransactionVATable;
    }

    public Double getTranBeforeVAT() {
        return TranBeforeVAT;
    }

    public void setTranBeforeVAT(Double TranBeforeVAT) {
        this.TranBeforeVAT = TranBeforeVAT;
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

    public void setServiceChargePercent(Double ServiceChargePercent) {
        this.ServiceChargePercent = ServiceChargePercent;
    }

    public Double getServiceCharge() {
        return ServiceCharge;
    }

    public void setServiceCharge(Double ServiceCharge) {
        this.ServiceCharge = ServiceCharge;
    }

    public Double getServiceChargeVAT() {
        return ServiceChargeVAT;
    }

    public void setServiceChargeVAT(Double ServiceChargeVAT) {
        this.ServiceChargeVAT = ServiceChargeVAT;
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

    public void setOtherIncome(Double OtherIncome) {
        this.OtherIncome = OtherIncome;
    }

    public Double getOtherIncomeVAT() {
        return OtherIncomeVAT;
    }

    public void setOtherIncomeVAT(Double OtherIncomeVAT) {
        this.OtherIncomeVAT = OtherIncomeVAT;
    }

    public Double getOhterIncomeBeforeVAT() {
        return OhterIncomeBeforeVAT;
    }

    public void setOhterIncomeBeforeVAT(Double OhterIncomeBeforeVAT) {
        this.OhterIncomeBeforeVAT = OhterIncomeBeforeVAT;
    }

    public Double getReceiptTotalQty() {
        return ReceiptTotalQty;
    }

    public void setReceiptTotalQty(Double ReceiptTotalQty) {
        this.ReceiptTotalQty = ReceiptTotalQty;
    }

    public Double getReceiptRetailPrice() {
        return ReceiptRetailPrice;
    }

    public void setReceiptRetailPrice(Double ReceiptRetailPrice) {
        this.ReceiptRetailPrice = ReceiptRetailPrice;
    }

    public Double getReceiptDiscount() {
        return ReceiptDiscount;
    }

    public void setReceiptDiscount(Double ReceiptDiscount) {
        this.ReceiptDiscount = ReceiptDiscount;
    }

    public Double getReceiptSalePrice() {
        return ReceiptSalePrice;
    }

    public void setReceiptSalePrice(Double ReceiptSalePrice) {
        this.ReceiptSalePrice = ReceiptSalePrice;
    }

    public Double getReceiptNetSale() {
        return ReceiptNetSale;
    }

    public void setReceiptNetSale(Double ReceiptNetSale) {
        this.ReceiptNetSale = ReceiptNetSale;
    }

    public Double getReceiptPayPrice() {
        return ReceiptPayPrice;
    }

    public void setReceiptPayPrice(Double ReceiptPayPrice) {
        this.ReceiptPayPrice = ReceiptPayPrice;
    }

    public Double getReceiptRoundingBill() {
        return ReceiptRoundingBill;
    }

    public void setReceiptRoundingBill(Double ReceiptRoundingBill) {
        this.ReceiptRoundingBill = ReceiptRoundingBill;
    }

    public Integer getSessionID() {
        return SessionID;
    }

    public void setSessionID(Integer SessionID) {
        this.SessionID = SessionID;
    }

    public Integer getCloseComputerID() {
        return CloseComputerID;
    }

    public void setCloseComputerID(Integer CloseComputerID) {
        this.CloseComputerID = CloseComputerID;
    }

    public Integer getVoidStaffID() {
        return VoidStaffID;
    }

    public void setVoidStaffID(Integer VoidStaffID) {
        this.VoidStaffID = VoidStaffID;
    }

    public String getVoidReason() {
        return VoidReason;
    }

    public void setVoidReason(String VoidReason) {
        this.VoidReason = VoidReason;
    }

    public java.util.Date getVoidTime() {
        return VoidTime;
    }

    public void setVoidTime(java.util.Date VoidTime) {
        this.VoidTime = VoidTime;
    }

    public Integer getIsCloneBill() {
        return IsCloneBill;
    }

    public void setIsCloneBill(Integer IsCloneBill) {
        this.IsCloneBill = IsCloneBill;
    }

    public Integer getVoidTranID() {
        return VoidTranID;
    }

    public void setVoidTranID(Integer VoidTranID) {
        this.VoidTranID = VoidTranID;
    }

    public Integer getVoidComID() {
        return VoidComID;
    }

    public void setVoidComID(Integer VoidComID) {
        this.VoidComID = VoidComID;
    }

    public Double getDiffCloneBill() {
        return DiffCloneBill;
    }

    public void setDiffCloneBill(Double DiffCloneBill) {
        this.DiffCloneBill = DiffCloneBill;
    }

    public Integer getMemberID() {
        return MemberID;
    }

    public void setMemberID(Integer MemberID) {
        this.MemberID = MemberID;
    }

    public Integer getHasOrder() {
        return HasOrder;
    }

    public void setHasOrder(Integer HasOrder) {
        this.HasOrder = HasOrder;
    }

    public Integer getNoPrintBillDetail() {
        return NoPrintBillDetail;
    }

    public void setNoPrintBillDetail(Integer NoPrintBillDetail) {
        this.NoPrintBillDetail = NoPrintBillDetail;
    }

    public Double getDiffPayCheckBill() {
        return DiffPayCheckBill;
    }

    public void setDiffPayCheckBill(Double DiffPayCheckBill) {
        this.DiffPayCheckBill = DiffPayCheckBill;
    }

    public String getBillDetailReferenceNo() {
        return BillDetailReferenceNo;
    }

    public void setBillDetailReferenceNo(String BillDetailReferenceNo) {
        this.BillDetailReferenceNo = BillDetailReferenceNo;
    }

    public Integer getCallForCheckBill() {
        return CallForCheckBill;
    }

    public void setCallForCheckBill(Integer CallForCheckBill) {
        this.CallForCheckBill = CallForCheckBill;
    }

    public String getTransactionNote() {
        return TransactionNote;
    }

    public void setTransactionNote(String TransactionNote) {
        this.TransactionNote = TransactionNote;
    }

    public Integer getCurrentAccessComputer() {
        return CurrentAccessComputer;
    }

    public void setCurrentAccessComputer(Integer CurrentAccessComputer) {
        this.CurrentAccessComputer = CurrentAccessComputer;
    }

    public java.util.Date getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(java.util.Date UpdateDate) {
        this.UpdateDate = UpdateDate;
    }

    public java.util.Date getBeginTime() {
        return BeginTime;
    }

    public void setBeginTime(java.util.Date BeginTime) {
        this.BeginTime = BeginTime;
    }

    public java.util.Date getEndTime() {
        return EndTime;
    }

    public void setEndTime(java.util.Date EndTime) {
        this.EndTime = EndTime;
    }

    public java.util.Date getPrintWarningTime() {
        return PrintWarningTime;
    }

    public void setPrintWarningTime(java.util.Date PrintWarningTime) {
        this.PrintWarningTime = PrintWarningTime;
    }

    public java.util.Date getPrintBeginTime() {
        return PrintBeginTime;
    }

    public void setPrintBeginTime(java.util.Date PrintBeginTime) {
        this.PrintBeginTime = PrintBeginTime;
    }

    public Integer getAlreadyCalculateStock() {
        return AlreadyCalculateStock;
    }

    public void setAlreadyCalculateStock(Integer AlreadyCalculateStock) {
        this.AlreadyCalculateStock = AlreadyCalculateStock;
    }

    public Integer getAlreadyExportToHQ() {
        return AlreadyExportToHQ;
    }

    public void setAlreadyExportToHQ(Integer AlreadyExportToHQ) {
        this.AlreadyExportToHQ = AlreadyExportToHQ;
    }

    public Integer getTableID() {
        return TableID;
    }

    public void setTableID(Integer TableID) {
        this.TableID = TableID;
    }

    public Integer getIsSplitTransaction() {
        return IsSplitTransaction;
    }

    public void setIsSplitTransaction(Integer IsSplitTransaction) {
        this.IsSplitTransaction = IsSplitTransaction;
    }

    public Integer getIsFromOtherTransaction() {
        return IsFromOtherTransaction;
    }

    public void setIsFromOtherTransaction(Integer IsFromOtherTransaction) {
        this.IsFromOtherTransaction = IsFromOtherTransaction;
    }

    public String getReferenceNo() {
        return ReferenceNo;
    }

    public void setReferenceNo(String ReferenceNo) {
        this.ReferenceNo = ReferenceNo;
    }

    public Integer getFromDepositTransactionID() {
        return FromDepositTransactionID;
    }

    public void setFromDepositTransactionID(Integer FromDepositTransactionID) {
        this.FromDepositTransactionID = FromDepositTransactionID;
    }

    public Integer getFromDepositComputerID() {
        return FromDepositComputerID;
    }

    public void setFromDepositComputerID(Integer FromDepositComputerID) {
        this.FromDepositComputerID = FromDepositComputerID;
    }

    public Integer getDeleted() {
        return Deleted;
    }

    public void setDeleted(Integer Deleted) {
        this.Deleted = Deleted;
    }

}
