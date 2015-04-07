package com.vtec.j1tth4.vtecpos.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.vtec.j1tth4.vtecpos.dao.OrderTransaction;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ORDER_TRANSACTION.
*/
public class OrderTransactionDao extends AbstractDao<OrderTransaction, Integer> {

    public static final String TABLENAME = "ORDER_TRANSACTION";

    /**
     * Properties of entity OrderTransaction.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property TransactionID = new Property(0, int.class, "TransactionID", true, "TRANSACTION_ID");
        public final static Property ComputerID = new Property(1, int.class, "ComputerID", false, "COMPUTER_ID");
        public final static Property TransactionUUID = new Property(2, String.class, "TransactionUUID", false, "TRANSACTION_UUID");
        public final static Property ReserveTime = new Property(3, java.util.Date.class, "ReserveTime", false, "RESERVE_TIME");
        public final static Property ReserveStaffID = new Property(4, Integer.class, "ReserveStaffID", false, "RESERVE_STAFF_ID");
        public final static Property OpenTime = new Property(5, java.util.Date.class, "OpenTime", false, "OPEN_TIME");
        public final static Property OpenStaffID = new Property(6, int.class, "OpenStaffID", false, "OPEN_STAFF_ID");
        public final static Property PaidTime = new Property(7, java.util.Date.class, "PaidTime", false, "PAID_TIME");
        public final static Property PaidStaffID = new Property(8, Integer.class, "PaidStaffID", false, "PAID_STAFF_ID");
        public final static Property CloseTime = new Property(9, java.util.Date.class, "CloseTime", false, "CLOSE_TIME");
        public final static Property CommStaffID = new Property(10, Integer.class, "CommStaffID", false, "COMM_STAFF_ID");
        public final static Property OtherPercentDiscount = new Property(11, Double.class, "OtherPercentDiscount", false, "OTHER_PERCENT_DISCOUNT");
        public final static Property OtherAmountDiscount = new Property(12, Double.class, "OtherAmountDiscount", false, "OTHER_AMOUNT_DISCOUNT");
        public final static Property TransactionStatusID = new Property(13, int.class, "TransactionStatusID", false, "TRANSACTION_STATUS_ID");
        public final static Property SaleMode = new Property(14, int.class, "SaleMode", false, "SALE_MODE");
        public final static Property TransactionName = new Property(15, String.class, "TransactionName", false, "TRANSACTION_NAME");
        public final static Property QueueName = new Property(16, String.class, "QueueName", false, "QUEUE_NAME");
        public final static Property NoCustomer = new Property(17, Integer.class, "NoCustomer", false, "NO_CUSTOMER");
        public final static Property NoCustomerWhenOpen = new Property(18, Integer.class, "NoCustomerWhenOpen", false, "NO_CUSTOMER_WHEN_OPEN");
        public final static Property DocType = new Property(19, int.class, "DocType", false, "DOC_TYPE");
        public final static Property ReceiptYear = new Property(20, int.class, "ReceiptYear", false, "RECEIPT_YEAR");
        public final static Property ReceiptMonth = new Property(21, int.class, "ReceiptMonth", false, "RECEIPT_MONTH");
        public final static Property ReceiptID = new Property(22, Integer.class, "ReceiptID", false, "RECEIPT_ID");
        public final static Property ReceiptNumber = new Property(23, String.class, "ReceiptNumber", false, "RECEIPT_NUMBER");
        public final static Property SaleDate = new Property(24, java.util.Date.class, "SaleDate", false, "SALE_DATE");
        public final static Property ShopID = new Property(25, int.class, "ShopID", false, "SHOP_ID");
        public final static Property TransactionVAT = new Property(26, Double.class, "TransactionVAT", false, "TRANSACTION_VAT");
        public final static Property TransactionExcludeVAT = new Property(27, Double.class, "TransactionExcludeVAT", false, "TRANSACTION_EXCLUDE_VAT");
        public final static Property ServiceCharge = new Property(28, Double.class, "ServiceCharge", false, "SERVICE_CHARGE");
        public final static Property ServiceChargeVAT = new Property(29, Double.class, "ServiceChargeVAT", false, "SERVICE_CHARGE_VAT");
        public final static Property OtherIncome = new Property(30, Double.class, "OtherIncome", false, "OTHER_INCOME");
        public final static Property OtherIncomeVAT = new Property(31, Double.class, "OtherIncomeVAT", false, "OTHER_INCOME_VAT");
        public final static Property TransactionVATable = new Property(32, Double.class, "TransactionVATable", false, "TRANSACTION_VATABLE");
        public final static Property ReceiptProductRetailPrice = new Property(33, Double.class, "ReceiptProductRetailPrice", false, "RECEIPT_PRODUCT_RETAIL_PRICE");
        public final static Property ReceiptSalePrice = new Property(34, Double.class, "ReceiptSalePrice", false, "RECEIPT_SALE_PRICE");
        public final static Property ReceiptPayPrice = new Property(35, Double.class, "ReceiptPayPrice", false, "RECEIPT_PAY_PRICE");
        public final static Property ReceiptDiscount = new Property(36, Double.class, "ReceiptDiscount", false, "RECEIPT_DISCOUNT");
        public final static Property ReceiptTotalQty = new Property(37, Double.class, "ReceiptTotalQty", false, "RECEIPT_TOTAL_QTY");
        public final static Property VATPercent = new Property(38, Double.class, "VATPercent", false, "VATPERCENT");
        public final static Property ServiceChargePercent = new Property(39, Double.class, "ServiceChargePercent", false, "SERVICE_CHARGE_PERCENT");
        public final static Property IsCalculateServiceCharge = new Property(40, Integer.class, "IsCalculateServiceCharge", false, "IS_CALCULATE_SERVICE_CHARGE");
        public final static Property SessionID = new Property(41, int.class, "SessionID", false, "SESSION_ID");
        public final static Property CloseComputerID = new Property(42, Integer.class, "CloseComputerID", false, "CLOSE_COMPUTER_ID");
        public final static Property VoidStaffID = new Property(43, Integer.class, "VoidStaffID", false, "VOID_STAFF_ID");
        public final static Property VoidReason = new Property(44, String.class, "VoidReason", false, "VOID_REASON");
        public final static Property VoidTime = new Property(45, java.util.Date.class, "VoidTime", false, "VOID_TIME");
        public final static Property MemberID = new Property(46, Integer.class, "MemberID", false, "MEMBER_ID");
        public final static Property HasOrder = new Property(47, Integer.class, "HasOrder", false, "HAS_ORDER");
        public final static Property NoPrintBillDetail = new Property(48, Integer.class, "NoPrintBillDetail", false, "NO_PRINT_BILL_DETAIL");
        public final static Property BillDetailReferenceNo = new Property(49, Integer.class, "BillDetailReferenceNo", false, "BILL_DETAIL_REFERENCE_NO");
        public final static Property CallForCheckBill = new Property(50, Integer.class, "CallForCheckBill", false, "CALL_FOR_CHECK_BILL");
        public final static Property TransactionNote = new Property(51, String.class, "TransactionNote", false, "TRANSACTION_NOTE");
        public final static Property CurrentAccessComputer = new Property(52, Integer.class, "CurrentAccessComputer", false, "CURRENT_ACCESS_COMPUTER");
        public final static Property UpdateDate = new Property(53, java.util.Date.class, "UpdateDate", false, "UPDATE_DATE");
        public final static Property BeginTime = new Property(54, java.util.Date.class, "BeginTime", false, "BEGIN_TIME");
        public final static Property EndTime = new Property(55, java.util.Date.class, "EndTime", false, "END_TIME");
        public final static Property PrintWarningTime = new Property(56, java.util.Date.class, "PrintWarningTime", false, "PRINT_WARNING_TIME");
        public final static Property PrintBeginTime = new Property(57, Integer.class, "PrintBeginTime", false, "PRINT_BEGIN_TIME");
        public final static Property AlreadyCalculateStock = new Property(58, Integer.class, "AlreadyCalculateStock", false, "ALREADY_CALCULATE_STOCK");
        public final static Property AlreadyExportToHQ = new Property(59, Integer.class, "AlreadyExportToHQ", false, "ALREADY_EXPORT_TO_HQ");
        public final static Property TableID = new Property(60, Integer.class, "TableID", false, "TABLE_ID");
        public final static Property IsSplitTransaction = new Property(61, Integer.class, "IsSplitTransaction", false, "IS_SPLIT_TRANSACTION");
        public final static Property IsFromOtherTransaction = new Property(62, Integer.class, "IsFromOtherTransaction", false, "IS_FROM_OTHER_TRANSACTION");
        public final static Property ReferenceNo = new Property(63, String.class, "ReferenceNo", false, "REFERENCE_NO");
        public final static Property FromDepositTransactionID = new Property(64, Integer.class, "FromDepositTransactionID", false, "FROM_DEPOSIT_TRANSACTION_ID");
        public final static Property FromDepositComputerID = new Property(65, Integer.class, "FromDepositComputerID", false, "FROM_DEPOSIT_COMPUTER_ID");
        public final static Property Deleted = new Property(66, Integer.class, "Deleted", false, "DELETED");
    };


    public OrderTransactionDao(DaoConfig config) {
        super(config);
    }
    
    public OrderTransactionDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, OrderTransaction entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getTransactionID());
        stmt.bindLong(2, entity.getComputerID());
        stmt.bindString(3, entity.getTransactionUUID());
 
        java.util.Date ReserveTime = entity.getReserveTime();
        if (ReserveTime != null) {
            stmt.bindLong(4, ReserveTime.getTime());
        }
 
        Integer ReserveStaffID = entity.getReserveStaffID();
        if (ReserveStaffID != null) {
            stmt.bindLong(5, ReserveStaffID);
        }
        stmt.bindLong(6, entity.getOpenTime().getTime());
        stmt.bindLong(7, entity.getOpenStaffID());
 
        java.util.Date PaidTime = entity.getPaidTime();
        if (PaidTime != null) {
            stmt.bindLong(8, PaidTime.getTime());
        }
 
        Integer PaidStaffID = entity.getPaidStaffID();
        if (PaidStaffID != null) {
            stmt.bindLong(9, PaidStaffID);
        }
 
        java.util.Date CloseTime = entity.getCloseTime();
        if (CloseTime != null) {
            stmt.bindLong(10, CloseTime.getTime());
        }
 
        Integer CommStaffID = entity.getCommStaffID();
        if (CommStaffID != null) {
            stmt.bindLong(11, CommStaffID);
        }
 
        Double OtherPercentDiscount = entity.getOtherPercentDiscount();
        if (OtherPercentDiscount != null) {
            stmt.bindDouble(12, OtherPercentDiscount);
        }
 
        Double OtherAmountDiscount = entity.getOtherAmountDiscount();
        if (OtherAmountDiscount != null) {
            stmt.bindDouble(13, OtherAmountDiscount);
        }
        stmt.bindLong(14, entity.getTransactionStatusID());
        stmt.bindLong(15, entity.getSaleMode());
 
        String TransactionName = entity.getTransactionName();
        if (TransactionName != null) {
            stmt.bindString(16, TransactionName);
        }
 
        String QueueName = entity.getQueueName();
        if (QueueName != null) {
            stmt.bindString(17, QueueName);
        }
 
        Integer NoCustomer = entity.getNoCustomer();
        if (NoCustomer != null) {
            stmt.bindLong(18, NoCustomer);
        }
 
        Integer NoCustomerWhenOpen = entity.getNoCustomerWhenOpen();
        if (NoCustomerWhenOpen != null) {
            stmt.bindLong(19, NoCustomerWhenOpen);
        }
        stmt.bindLong(20, entity.getDocType());
        stmt.bindLong(21, entity.getReceiptYear());
        stmt.bindLong(22, entity.getReceiptMonth());
 
        Integer ReceiptID = entity.getReceiptID();
        if (ReceiptID != null) {
            stmt.bindLong(23, ReceiptID);
        }
 
        String ReceiptNumber = entity.getReceiptNumber();
        if (ReceiptNumber != null) {
            stmt.bindString(24, ReceiptNumber);
        }
        stmt.bindLong(25, entity.getSaleDate().getTime());
        stmt.bindLong(26, entity.getShopID());
 
        Double TransactionVAT = entity.getTransactionVAT();
        if (TransactionVAT != null) {
            stmt.bindDouble(27, TransactionVAT);
        }
 
        Double TransactionExcludeVAT = entity.getTransactionExcludeVAT();
        if (TransactionExcludeVAT != null) {
            stmt.bindDouble(28, TransactionExcludeVAT);
        }
 
        Double ServiceCharge = entity.getServiceCharge();
        if (ServiceCharge != null) {
            stmt.bindDouble(29, ServiceCharge);
        }
 
        Double ServiceChargeVAT = entity.getServiceChargeVAT();
        if (ServiceChargeVAT != null) {
            stmt.bindDouble(30, ServiceChargeVAT);
        }
 
        Double OtherIncome = entity.getOtherIncome();
        if (OtherIncome != null) {
            stmt.bindDouble(31, OtherIncome);
        }
 
        Double OtherIncomeVAT = entity.getOtherIncomeVAT();
        if (OtherIncomeVAT != null) {
            stmt.bindDouble(32, OtherIncomeVAT);
        }
 
        Double TransactionVATable = entity.getTransactionVATable();
        if (TransactionVATable != null) {
            stmt.bindDouble(33, TransactionVATable);
        }
 
        Double ReceiptProductRetailPrice = entity.getReceiptProductRetailPrice();
        if (ReceiptProductRetailPrice != null) {
            stmt.bindDouble(34, ReceiptProductRetailPrice);
        }
 
        Double ReceiptSalePrice = entity.getReceiptSalePrice();
        if (ReceiptSalePrice != null) {
            stmt.bindDouble(35, ReceiptSalePrice);
        }
 
        Double ReceiptPayPrice = entity.getReceiptPayPrice();
        if (ReceiptPayPrice != null) {
            stmt.bindDouble(36, ReceiptPayPrice);
        }
 
        Double ReceiptDiscount = entity.getReceiptDiscount();
        if (ReceiptDiscount != null) {
            stmt.bindDouble(37, ReceiptDiscount);
        }
 
        Double ReceiptTotalQty = entity.getReceiptTotalQty();
        if (ReceiptTotalQty != null) {
            stmt.bindDouble(38, ReceiptTotalQty);
        }
 
        Double VATPercent = entity.getVATPercent();
        if (VATPercent != null) {
            stmt.bindDouble(39, VATPercent);
        }
 
        Double ServiceChargePercent = entity.getServiceChargePercent();
        if (ServiceChargePercent != null) {
            stmt.bindDouble(40, ServiceChargePercent);
        }
 
        Integer IsCalculateServiceCharge = entity.getIsCalculateServiceCharge();
        if (IsCalculateServiceCharge != null) {
            stmt.bindLong(41, IsCalculateServiceCharge);
        }
        stmt.bindLong(42, entity.getSessionID());
 
        Integer CloseComputerID = entity.getCloseComputerID();
        if (CloseComputerID != null) {
            stmt.bindLong(43, CloseComputerID);
        }
 
        Integer VoidStaffID = entity.getVoidStaffID();
        if (VoidStaffID != null) {
            stmt.bindLong(44, VoidStaffID);
        }
 
        String VoidReason = entity.getVoidReason();
        if (VoidReason != null) {
            stmt.bindString(45, VoidReason);
        }
 
        java.util.Date VoidTime = entity.getVoidTime();
        if (VoidTime != null) {
            stmt.bindLong(46, VoidTime.getTime());
        }
 
        Integer MemberID = entity.getMemberID();
        if (MemberID != null) {
            stmt.bindLong(47, MemberID);
        }
 
        Integer HasOrder = entity.getHasOrder();
        if (HasOrder != null) {
            stmt.bindLong(48, HasOrder);
        }
 
        Integer NoPrintBillDetail = entity.getNoPrintBillDetail();
        if (NoPrintBillDetail != null) {
            stmt.bindLong(49, NoPrintBillDetail);
        }
 
        Integer BillDetailReferenceNo = entity.getBillDetailReferenceNo();
        if (BillDetailReferenceNo != null) {
            stmt.bindLong(50, BillDetailReferenceNo);
        }
 
        Integer CallForCheckBill = entity.getCallForCheckBill();
        if (CallForCheckBill != null) {
            stmt.bindLong(51, CallForCheckBill);
        }
 
        String TransactionNote = entity.getTransactionNote();
        if (TransactionNote != null) {
            stmt.bindString(52, TransactionNote);
        }
 
        Integer CurrentAccessComputer = entity.getCurrentAccessComputer();
        if (CurrentAccessComputer != null) {
            stmt.bindLong(53, CurrentAccessComputer);
        }
 
        java.util.Date UpdateDate = entity.getUpdateDate();
        if (UpdateDate != null) {
            stmt.bindLong(54, UpdateDate.getTime());
        }
 
        java.util.Date BeginTime = entity.getBeginTime();
        if (BeginTime != null) {
            stmt.bindLong(55, BeginTime.getTime());
        }
 
        java.util.Date EndTime = entity.getEndTime();
        if (EndTime != null) {
            stmt.bindLong(56, EndTime.getTime());
        }
 
        java.util.Date PrintWarningTime = entity.getPrintWarningTime();
        if (PrintWarningTime != null) {
            stmt.bindLong(57, PrintWarningTime.getTime());
        }
 
        Integer PrintBeginTime = entity.getPrintBeginTime();
        if (PrintBeginTime != null) {
            stmt.bindLong(58, PrintBeginTime);
        }
 
        Integer AlreadyCalculateStock = entity.getAlreadyCalculateStock();
        if (AlreadyCalculateStock != null) {
            stmt.bindLong(59, AlreadyCalculateStock);
        }
 
        Integer AlreadyExportToHQ = entity.getAlreadyExportToHQ();
        if (AlreadyExportToHQ != null) {
            stmt.bindLong(60, AlreadyExportToHQ);
        }
 
        Integer TableID = entity.getTableID();
        if (TableID != null) {
            stmt.bindLong(61, TableID);
        }
 
        Integer IsSplitTransaction = entity.getIsSplitTransaction();
        if (IsSplitTransaction != null) {
            stmt.bindLong(62, IsSplitTransaction);
        }
 
        Integer IsFromOtherTransaction = entity.getIsFromOtherTransaction();
        if (IsFromOtherTransaction != null) {
            stmt.bindLong(63, IsFromOtherTransaction);
        }
 
        String ReferenceNo = entity.getReferenceNo();
        if (ReferenceNo != null) {
            stmt.bindString(64, ReferenceNo);
        }
 
        Integer FromDepositTransactionID = entity.getFromDepositTransactionID();
        if (FromDepositTransactionID != null) {
            stmt.bindLong(65, FromDepositTransactionID);
        }
 
        Integer FromDepositComputerID = entity.getFromDepositComputerID();
        if (FromDepositComputerID != null) {
            stmt.bindLong(66, FromDepositComputerID);
        }
 
        Integer Deleted = entity.getDeleted();
        if (Deleted != null) {
            stmt.bindLong(67, Deleted);
        }
    }

    /** @inheritdoc */
    @Override
    public Integer readKey(Cursor cursor, int offset) {
        return cursor.getInt(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public OrderTransaction readEntity(Cursor cursor, int offset) {
        OrderTransaction entity = new OrderTransaction( //
            cursor.getInt(offset + 0), // TransactionID
            cursor.getInt(offset + 1), // ComputerID
            cursor.getString(offset + 2), // TransactionUUID
            cursor.isNull(offset + 3) ? null : new java.util.Date(cursor.getLong(offset + 3)), // ReserveTime
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // ReserveStaffID
            new java.util.Date(cursor.getLong(offset + 5)), // OpenTime
            cursor.getInt(offset + 6), // OpenStaffID
            cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)), // PaidTime
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // PaidStaffID
            cursor.isNull(offset + 9) ? null : new java.util.Date(cursor.getLong(offset + 9)), // CloseTime
            cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10), // CommStaffID
            cursor.isNull(offset + 11) ? null : cursor.getDouble(offset + 11), // OtherPercentDiscount
            cursor.isNull(offset + 12) ? null : cursor.getDouble(offset + 12), // OtherAmountDiscount
            cursor.getInt(offset + 13), // TransactionStatusID
            cursor.getInt(offset + 14), // SaleMode
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // TransactionName
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // QueueName
            cursor.isNull(offset + 17) ? null : cursor.getInt(offset + 17), // NoCustomer
            cursor.isNull(offset + 18) ? null : cursor.getInt(offset + 18), // NoCustomerWhenOpen
            cursor.getInt(offset + 19), // DocType
            cursor.getInt(offset + 20), // ReceiptYear
            cursor.getInt(offset + 21), // ReceiptMonth
            cursor.isNull(offset + 22) ? null : cursor.getInt(offset + 22), // ReceiptID
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // ReceiptNumber
            new java.util.Date(cursor.getLong(offset + 24)), // SaleDate
            cursor.getInt(offset + 25), // ShopID
            cursor.isNull(offset + 26) ? null : cursor.getDouble(offset + 26), // TransactionVAT
            cursor.isNull(offset + 27) ? null : cursor.getDouble(offset + 27), // TransactionExcludeVAT
            cursor.isNull(offset + 28) ? null : cursor.getDouble(offset + 28), // ServiceCharge
            cursor.isNull(offset + 29) ? null : cursor.getDouble(offset + 29), // ServiceChargeVAT
            cursor.isNull(offset + 30) ? null : cursor.getDouble(offset + 30), // OtherIncome
            cursor.isNull(offset + 31) ? null : cursor.getDouble(offset + 31), // OtherIncomeVAT
            cursor.isNull(offset + 32) ? null : cursor.getDouble(offset + 32), // TransactionVATable
            cursor.isNull(offset + 33) ? null : cursor.getDouble(offset + 33), // ReceiptProductRetailPrice
            cursor.isNull(offset + 34) ? null : cursor.getDouble(offset + 34), // ReceiptSalePrice
            cursor.isNull(offset + 35) ? null : cursor.getDouble(offset + 35), // ReceiptPayPrice
            cursor.isNull(offset + 36) ? null : cursor.getDouble(offset + 36), // ReceiptDiscount
            cursor.isNull(offset + 37) ? null : cursor.getDouble(offset + 37), // ReceiptTotalQty
            cursor.isNull(offset + 38) ? null : cursor.getDouble(offset + 38), // VATPercent
            cursor.isNull(offset + 39) ? null : cursor.getDouble(offset + 39), // ServiceChargePercent
            cursor.isNull(offset + 40) ? null : cursor.getInt(offset + 40), // IsCalculateServiceCharge
            cursor.getInt(offset + 41), // SessionID
            cursor.isNull(offset + 42) ? null : cursor.getInt(offset + 42), // CloseComputerID
            cursor.isNull(offset + 43) ? null : cursor.getInt(offset + 43), // VoidStaffID
            cursor.isNull(offset + 44) ? null : cursor.getString(offset + 44), // VoidReason
            cursor.isNull(offset + 45) ? null : new java.util.Date(cursor.getLong(offset + 45)), // VoidTime
            cursor.isNull(offset + 46) ? null : cursor.getInt(offset + 46), // MemberID
            cursor.isNull(offset + 47) ? null : cursor.getInt(offset + 47), // HasOrder
            cursor.isNull(offset + 48) ? null : cursor.getInt(offset + 48), // NoPrintBillDetail
            cursor.isNull(offset + 49) ? null : cursor.getInt(offset + 49), // BillDetailReferenceNo
            cursor.isNull(offset + 50) ? null : cursor.getInt(offset + 50), // CallForCheckBill
            cursor.isNull(offset + 51) ? null : cursor.getString(offset + 51), // TransactionNote
            cursor.isNull(offset + 52) ? null : cursor.getInt(offset + 52), // CurrentAccessComputer
            cursor.isNull(offset + 53) ? null : new java.util.Date(cursor.getLong(offset + 53)), // UpdateDate
            cursor.isNull(offset + 54) ? null : new java.util.Date(cursor.getLong(offset + 54)), // BeginTime
            cursor.isNull(offset + 55) ? null : new java.util.Date(cursor.getLong(offset + 55)), // EndTime
            cursor.isNull(offset + 56) ? null : new java.util.Date(cursor.getLong(offset + 56)), // PrintWarningTime
            cursor.isNull(offset + 57) ? null : cursor.getInt(offset + 57), // PrintBeginTime
            cursor.isNull(offset + 58) ? null : cursor.getInt(offset + 58), // AlreadyCalculateStock
            cursor.isNull(offset + 59) ? null : cursor.getInt(offset + 59), // AlreadyExportToHQ
            cursor.isNull(offset + 60) ? null : cursor.getInt(offset + 60), // TableID
            cursor.isNull(offset + 61) ? null : cursor.getInt(offset + 61), // IsSplitTransaction
            cursor.isNull(offset + 62) ? null : cursor.getInt(offset + 62), // IsFromOtherTransaction
            cursor.isNull(offset + 63) ? null : cursor.getString(offset + 63), // ReferenceNo
            cursor.isNull(offset + 64) ? null : cursor.getInt(offset + 64), // FromDepositTransactionID
            cursor.isNull(offset + 65) ? null : cursor.getInt(offset + 65), // FromDepositComputerID
            cursor.isNull(offset + 66) ? null : cursor.getInt(offset + 66) // Deleted
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, OrderTransaction entity, int offset) {
        entity.setTransactionID(cursor.getInt(offset + 0));
        entity.setComputerID(cursor.getInt(offset + 1));
        entity.setTransactionUUID(cursor.getString(offset + 2));
        entity.setReserveTime(cursor.isNull(offset + 3) ? null : new java.util.Date(cursor.getLong(offset + 3)));
        entity.setReserveStaffID(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setOpenTime(new java.util.Date(cursor.getLong(offset + 5)));
        entity.setOpenStaffID(cursor.getInt(offset + 6));
        entity.setPaidTime(cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)));
        entity.setPaidStaffID(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setCloseTime(cursor.isNull(offset + 9) ? null : new java.util.Date(cursor.getLong(offset + 9)));
        entity.setCommStaffID(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
        entity.setOtherPercentDiscount(cursor.isNull(offset + 11) ? null : cursor.getDouble(offset + 11));
        entity.setOtherAmountDiscount(cursor.isNull(offset + 12) ? null : cursor.getDouble(offset + 12));
        entity.setTransactionStatusID(cursor.getInt(offset + 13));
        entity.setSaleMode(cursor.getInt(offset + 14));
        entity.setTransactionName(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setQueueName(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setNoCustomer(cursor.isNull(offset + 17) ? null : cursor.getInt(offset + 17));
        entity.setNoCustomerWhenOpen(cursor.isNull(offset + 18) ? null : cursor.getInt(offset + 18));
        entity.setDocType(cursor.getInt(offset + 19));
        entity.setReceiptYear(cursor.getInt(offset + 20));
        entity.setReceiptMonth(cursor.getInt(offset + 21));
        entity.setReceiptID(cursor.isNull(offset + 22) ? null : cursor.getInt(offset + 22));
        entity.setReceiptNumber(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setSaleDate(new java.util.Date(cursor.getLong(offset + 24)));
        entity.setShopID(cursor.getInt(offset + 25));
        entity.setTransactionVAT(cursor.isNull(offset + 26) ? null : cursor.getDouble(offset + 26));
        entity.setTransactionExcludeVAT(cursor.isNull(offset + 27) ? null : cursor.getDouble(offset + 27));
        entity.setServiceCharge(cursor.isNull(offset + 28) ? null : cursor.getDouble(offset + 28));
        entity.setServiceChargeVAT(cursor.isNull(offset + 29) ? null : cursor.getDouble(offset + 29));
        entity.setOtherIncome(cursor.isNull(offset + 30) ? null : cursor.getDouble(offset + 30));
        entity.setOtherIncomeVAT(cursor.isNull(offset + 31) ? null : cursor.getDouble(offset + 31));
        entity.setTransactionVATable(cursor.isNull(offset + 32) ? null : cursor.getDouble(offset + 32));
        entity.setReceiptProductRetailPrice(cursor.isNull(offset + 33) ? null : cursor.getDouble(offset + 33));
        entity.setReceiptSalePrice(cursor.isNull(offset + 34) ? null : cursor.getDouble(offset + 34));
        entity.setReceiptPayPrice(cursor.isNull(offset + 35) ? null : cursor.getDouble(offset + 35));
        entity.setReceiptDiscount(cursor.isNull(offset + 36) ? null : cursor.getDouble(offset + 36));
        entity.setReceiptTotalQty(cursor.isNull(offset + 37) ? null : cursor.getDouble(offset + 37));
        entity.setVATPercent(cursor.isNull(offset + 38) ? null : cursor.getDouble(offset + 38));
        entity.setServiceChargePercent(cursor.isNull(offset + 39) ? null : cursor.getDouble(offset + 39));
        entity.setIsCalculateServiceCharge(cursor.isNull(offset + 40) ? null : cursor.getInt(offset + 40));
        entity.setSessionID(cursor.getInt(offset + 41));
        entity.setCloseComputerID(cursor.isNull(offset + 42) ? null : cursor.getInt(offset + 42));
        entity.setVoidStaffID(cursor.isNull(offset + 43) ? null : cursor.getInt(offset + 43));
        entity.setVoidReason(cursor.isNull(offset + 44) ? null : cursor.getString(offset + 44));
        entity.setVoidTime(cursor.isNull(offset + 45) ? null : new java.util.Date(cursor.getLong(offset + 45)));
        entity.setMemberID(cursor.isNull(offset + 46) ? null : cursor.getInt(offset + 46));
        entity.setHasOrder(cursor.isNull(offset + 47) ? null : cursor.getInt(offset + 47));
        entity.setNoPrintBillDetail(cursor.isNull(offset + 48) ? null : cursor.getInt(offset + 48));
        entity.setBillDetailReferenceNo(cursor.isNull(offset + 49) ? null : cursor.getInt(offset + 49));
        entity.setCallForCheckBill(cursor.isNull(offset + 50) ? null : cursor.getInt(offset + 50));
        entity.setTransactionNote(cursor.isNull(offset + 51) ? null : cursor.getString(offset + 51));
        entity.setCurrentAccessComputer(cursor.isNull(offset + 52) ? null : cursor.getInt(offset + 52));
        entity.setUpdateDate(cursor.isNull(offset + 53) ? null : new java.util.Date(cursor.getLong(offset + 53)));
        entity.setBeginTime(cursor.isNull(offset + 54) ? null : new java.util.Date(cursor.getLong(offset + 54)));
        entity.setEndTime(cursor.isNull(offset + 55) ? null : new java.util.Date(cursor.getLong(offset + 55)));
        entity.setPrintWarningTime(cursor.isNull(offset + 56) ? null : new java.util.Date(cursor.getLong(offset + 56)));
        entity.setPrintBeginTime(cursor.isNull(offset + 57) ? null : cursor.getInt(offset + 57));
        entity.setAlreadyCalculateStock(cursor.isNull(offset + 58) ? null : cursor.getInt(offset + 58));
        entity.setAlreadyExportToHQ(cursor.isNull(offset + 59) ? null : cursor.getInt(offset + 59));
        entity.setTableID(cursor.isNull(offset + 60) ? null : cursor.getInt(offset + 60));
        entity.setIsSplitTransaction(cursor.isNull(offset + 61) ? null : cursor.getInt(offset + 61));
        entity.setIsFromOtherTransaction(cursor.isNull(offset + 62) ? null : cursor.getInt(offset + 62));
        entity.setReferenceNo(cursor.isNull(offset + 63) ? null : cursor.getString(offset + 63));
        entity.setFromDepositTransactionID(cursor.isNull(offset + 64) ? null : cursor.getInt(offset + 64));
        entity.setFromDepositComputerID(cursor.isNull(offset + 65) ? null : cursor.getInt(offset + 65));
        entity.setDeleted(cursor.isNull(offset + 66) ? null : cursor.getInt(offset + 66));
     }
    
    /** @inheritdoc */
    @Override
    protected Integer updateKeyAfterInsert(OrderTransaction entity, long rowId) {
        return entity.getTransactionID();
    }
    
    /** @inheritdoc */
    @Override
    public Integer getKey(OrderTransaction entity) {
        if(entity != null) {
            return entity.getTransactionID();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
