package com.vtec.j1tth4.vtecpos.provider;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.vtec.j1tth4.vtecpos.Utils;
import com.vtec.j1tth4.vtecpos.VtecPosApplication;

import java.util.UUID;

/**
 * Created by j1tth4 on 4/29/15.
 */
public class Orders extends SQLiteHelperBase{

    public static final int NEW_TRANS = 1;
    public static final int SUCCESS_TRANS = 2;
    public static final int VOID_TRANS = 99;

    public static final String TABLE_TRANSACTION = "OrderTransaction";
    public static final String TABLE_TRANSACTION_FRONT = "OrderTransactionFront";
    public static final String TABLE_ORDER_DETAIL = "OrderDetail";
    public static final String TABLE_ORDER_DETAIL_FRONT = "OrderDetailFront";
    public static final String TABLE_ORDER_PROMOTION_APPLY = "OrderPromotionApply";
    public static final String TABLE_ORDER_PROMOTION_APPLY_FRONT = "OrderPromotionApplyFront";
    public static final String TABLE_ORDER_PROMOTION_DETAIL = "OrderPromotionDetail";
    public static final String TABLE_ORDER_PROMOTION_DETAIL_FRONT = "OrderPromotionDetailFront";
    public static final String TABLE_PROMOTION_PRODUCT = "PromotionProducts";

    public static final String TRANSACTION_ID = "TransactionID";
    public static final String COMPUTER_ID = "ComputerID";
    public static final String SHOP_ID = "ShopID";
    public static final String TRANSACTION_UUID = "TransactionUUID";
    public static final String RESERVE_TIME = "ReserveTime";
    public static final String RESERVE_STAFF_ID = "ReserveStaffID";
    public static final String OPEN_TIME = "OpenTime";
    public static final String OPEN_STAFF_ID = "OpenStaffID";
    public static final String PAID_TIME = "PaidTime";
    public static final String PAID_STAFF_ID = "PaidStaffID";
    public static final String CLOSE_TIME = "CloseTime";
    public static final String SALE_DATE = "SaleDate";
    public static final String COMM_STAFF_ID = "CommStaffID";
    public static final String DISCOUNT_ITEM = "DiscountItem";
    public static final String DISCOUNT_BILL = "DiscountBill";
    public static final String TRANSACTION_STATUS_ID = "TransactionStatusID";
    public static final String TRANSACTION_NAME = "TransactionName";
    public static final String QUEUE_NAME = "QueueName";
    public static final String NO_CUSTOMER = "NoCustomer";
    public static final String NO_CUSTOMER_WHEN_OPEN = "NoCustomerWhenOpen";
    public static final String RECEIPT_NUMBER = "ReceiptNumber";
    public static final String TRANSACTION_VAT = "TransactionVAT";
    public static final String TRANSACTION_VATABLE = "TransactionVATable";
    public static final String IS_CAL_SC = "IsCalSC";
    public static final String SERVICE_CHARGE_PERCENT = "ServiceChargePercent";
    public static final String SERVICE_CHARGE = "ServiceCharge";
    public static final String SERVICE_CHARGE_VAT = "ServiceChargeVAT";
    public static final String OTHER_INCOME = "OtherIncome";
    public static final String OTHER_INCOME_VAT = "OtherIncomeVAT";
    public static final String OTHER_INCOME_BEFORE_VAT = "OhterIncomeBeforeVAT";
    public static final String RECEIPT_YEAR = "ReceiptYear";
    public static final String RECEIPT_MONTH = "ReceiptMonth";
    public static final String RECEIPT_ID = "ReceiptID";
    public static final String RECEIPT_NO = "ReceiptNo";
    public static final String RECEIPT_SALE_PRICE = "ReceiptSalePrice";
    public static final String RECEIPT_PAY_PRICE = "ReceiptPayPrice";
    public static final String RECEIPT_DISCOUNT = "ReceiptDiscount";
    public static final String RECEIPT_TOTAL_QTY = "ReceiptTotalQty";
    public static final String DISCOUNT_OTHER = "DiscountOther";
    public static final String TRAN_BEFORE_VAT = "TranBeforeVAT";
    public static final String RECEIPT_RETAIL_PRICE = "ReceiptRetailPrice";
    public static final String RECEIPT_NET_SALE = "ReceiptNetSale";
    public static final String RECEIPT_ROUNDING_BILL = "ReceiptRoundingBill";
    public static final String SESSION_ID = "SessionID";
    public static final String CLOSE_COMPUTER_ID = "CloseComputerID";
    public static final String VOID_REASON = "VoidReason";
    public static final String VOID_TIME = "VoidTime";
    public static final String IS_CLONE_BILL = "IsCloneBill";
    public static final String VOID_TRANS_ID = "VoidTranID";
    public static final String VOID_COM_ID = "VoidComID";
    public static final String DIFF_CLONE_BILL = "DiffCloneBill";
    public static final String HAS_ORDER = "HasOrder";
    public static final String NO_PRiNT_BILL_DETAIL = "NoPrintBillDetail";
    public static final String DIFF_PAY_CHECK_BILL = "DiffPayCheckBill";
    public static final String BILL_DETAIL_REFERENCE_NO = "BillDetailReferenceNo";
    public static final String CALL_FOR_CHECK_BILl = "CallForCheckBill";
    public static final String TRANSACTION_NOTE = "TransactionNote";
    public static final String CURRENT_ACCESS_COMPUTER = "CurrentAccessComputer";
    public static final String BEGIN_TIME = "BeginTime";
    public static final String END_TIME = "EndTime";
    public static final String PRINT_WARNING_TIME = "PrintWarningTime";
    public static final String PRINT_BEGIN_TIME = "PrintBeginTime";
    public static final String ALREADY_CALCULATE_STOCK = "AlreadyCalculateStock";
    public static final String ALREADY_EXPORT_TO_HQ = "AlreadyExportToHQ";
    public static final String TABLE_ID = "TableID";
    public static final String IS_SPLIT_TRANSACTION = "IsSplitTransaction";
    public static final String IS_FROM_OTHER_TRANSACTION = "IsFromOtherTransaction";
    public static final String REFERENCE_NO = "ReferenceNo";
    public static final String FROM_DEPOSIT_TRANSACTION_ID = "FromDepositTransactionID";
    public static final String FROM_DEPOSIT_COMPUTER_ID = "FromDepositComputerID";
    public static final String ORDER_DETAIL_ID = "OrderDetailID";
    public static final String ORDER_DETAIL_LINK_ID = "OrderDetailLinkID";
    public static final String INSERT_ORDER_NO = "InsertOrderNo";
    public static final String PRODUCT_SET_TYPE = "ProductSetType";
    public static final String ORDER_STATUS_ID = "OrderStatusID";
    public static final String PRODUCT_ID = "ProductID";
    public static final String TOTAL_QTY = "TotalQty";
    public static final String PRICE_PER_UNIT = "PricePerUnit";
    public static final String TOTAL_RETAIL_PRICE = "TotalRetailPrice";
    public static final String ORG_PRICE_PER_UNIT = "OrgPricePerUnit";
    public static final String ORG_TOTAL_RETAIL_PRICE = "OrgTotalRetailPrice";
    public static final String INDENT_LEVEL = "IndentLevel";
    public static final String DISC_PRICE = "DiscPrice";
    public static final String DISC_OTHER_PERCENT = "DiscOtherPercent";
    public static final String DISC_OTHER = "DiscOther";
    public static final String TOTAL_ITEM_DISC = "TotalItemDisc";
    public static final String DISC_BILL = "DiscBill";
    public static final String NET_SALE = "NetSale";
    public static final String W_VATABLE = "WVatable";
    public static final String SCW_AMOUNT = "SCWAmount";
    public static final String SCW_VAT = "SCWVAT";
    public static final String SCW_BEFORE_VAT = "SCWBeforeVAT";
    public static final String ITEM_DISC_ALLOW = "ItemDiscAllow";
    public static final String DISC_PERCENT = "DiscPercent";
    public static final String DISC_AMOUNT = "DiscAmount";
    public static final String TOTAL_DISCOUNT = "TotalDiscount";
    public static final String SALE_PRICE = "SalePrice";
    public static final String PRODUCT_VAT = "ProductVAT";
    public static final String PRODUCT_BEFORE_VAT = "ProductBeforeVAT";
    public static final String TOTAL_RETAIL_VAT = "TotalRetailVAT";
    public static final String DISC_VAT = "DiscVAT";
    public static final String VATABLE = "Vatable";
    public static final String SC_AMOUNT = "SCAmount";
    public static final String SC_VAT = "SCVAT";
    public static final String SC_BEFORE_VAT = "SCBeforeVAT";
    public static final String WEIGHT_PRICE = "WeightPrice";
    public static final String WEIGHT_PRICE_VAT = "WeightPriceVAT";
    public static final String WEIGHT_PRICE_BEFORE_VAT = "WeightBeforeVAT";
    public static final String OTHER_FOOD_NAME = "OtherFoodName";
    public static final String OTHER_PRODUCT_GROUP_ID = "OtherProductGroupID";
    public static final String LAST_TRANSACTION_ID = "LastTransactionID";
    public static final String LAST_COMPUTER_ID = "LastComputerID";
    public static final String ORDER_STAFF_ID = "OrderStaffID";
    public static final String ORDER_COMPUTER_ID = "OrderComputerID";
    public static final String ORDER_TABLE_ID = "OrderTableID";
    public static final String VOID_TYPE_ID = "VoidTypeID";
    public static final String VOID_STAFF_ID = "VoidStaffID";
    public static final String VOID_DATE_TIME = "VoidDateTime";
    public static final String NO_PRINT_BILL = "NoPrintBill";
    public static final String NO_PRINT_ORDER = "NoRePrintOrder";
    public static final String START_TIME = "StartTime";
    public static final String FINISH_TIME = "FinishTime";
    public static final String PRINT_STATUS = "PrintStatus";
    public static final String PROCESS_ID = "ProcessID";
    public static final String SUBMIT_ORDER_DATE_TIME = "SubmitOrderDateTime";
    public static final String COMMENT = "Comment";
    public static final String DOC_TYPE = "DocType";
    public static final String COMPONENT_LEVEL = "ComponentLevel";
    public static final String DISPLAY_ORDERING = "DisplayOrdering";
    public static final String DISC_PRICE_PERCENT = "DiscPricePercent";
    public static final String VAT_DISPLAY = "VATDisplay";
    public static final String PRODUCT_VAT_PERCENT = "ProductVATPercent";
    public static final String IS_SC_BEFORE_DISC = "IsSCBeforeDisc";
    public static final String HAS_SERVICE_CHARGE = "HasServiceCharge";
    public static final String SC_PERCENT = "SCPercent";
    public static final String SALE_MODE = "SaleMode";
    public static final String PRODUCT_VAT_CODE = "ProductVATCode";
    public static final String DISCOUNT_ALLOW = "DiscountAllow";
    public static final String PRINTER_ID = "PrinterID";
    public static final String INVENTORY_ID = "InventoryID";
    public static final String VAT_TYPE = "VATType";
    public static final String PRINT_GROUP = "PrintGroup";
    public static final String NO_REPRINT_ORDER = "NoRePrintOrder";
    public static final String IS_COMMENT = "IsComment";
    public static final String DELETED = "Deleted";
    public static final String BILL_DISC = "BillDisc";
    public static final String DISC_PRIORITY = "DiscPriority";
    public static final String INSERT_NO = "InsertNo";
    public static final String PROMOTION_ID = "PromotionID";
    public static final String DISCOUNT_AMOUNT = "DiscountAmount";
    public static final String DISCOUNT_PERCENT = "DiscountPercent";


    public Orders(Context c){
        super(c);
    }


    public void refreshPromotion(int transId, int compId){
        Cursor cursorPromoApply = openReadable().rawQuery(
                "select * from " + TABLE_ORDER_PROMOTION_APPLY_FRONT +
                        " where " + BILL_DISC + "=?" +
                        " and " + TRANSACTION_ID + "=?" +
                        " and " + COMPUTER_ID + "=?" +
                        " order by " + DISC_PRIORITY + "," + INSERT_NO,
                new String[]{
                        "0",
                        String.valueOf(transId),
                        String.valueOf(compId)
                });
        if(cursorPromoApply.moveToFirst()){
            // refresh for new calculate
            openWritable().delete(
                    TABLE_ORDER_PROMOTION_DETAIL_FRONT,
                    TRANSACTION_ID + "=?" +
                            " and " + COMPUTER_ID + "=?",
                    new String[]{
                            String.valueOf(transId),
                            String.valueOf(compId)
                    });
            ContentValues cv = new ContentValues();
            cv.put(ITEM_DISC_ALLOW, DISCOUNT_ALLOW);
            cv.put(DISC_PRICE_PERCENT, 0);
            cv.put(DISC_PRICE, 0);
            cv.put(DISC_PERCENT, 0);
            cv.put(DISC_AMOUNT, 0);
            openWritable().update(
                    TABLE_ORDER_DETAIL_FRONT,
                    cv,
                    TRANSACTION_ID + "=?" +
                            " and " + COMPUTER_ID + "=?",
                    new String[]{
                            String.valueOf(transId),
                            String.valueOf(compId)
                    }
            );
            while(!cursorPromoApply.isAfterLast()){
                String promoId = cursorPromoApply.getString(cursorPromoApply.getColumnIndex(PROMOTION_ID));
                Cursor cursorPromoProduct = openReadable().rawQuery(
                        "select * from " +
                                TABLE_ORDER_DETAIL_FRONT + " a " +
                                " inner join " +
                                TABLE_PROMOTION_PRODUCT + " b " +
                                " on a." + PRODUCT_ID + "=b." + PRODUCT_ID +
                                " and a." + SALE_MODE + "=b." + SALE_MODE +
                                " where b." + PROMOTION_ID + "=?" +
                                " and a." + ORDER_STATUS_ID + "<=?" +
                                " and a." + ITEM_DISC_ALLOW + "=?" +
                                " and a." + INDENT_LEVEL + "=?" +
                                " and a." + TRANSACTION_ID + "=?" +
                                " and a." + COMPUTER_ID + "=?",
                        new String[]{
                                promoId,
                                "2",
                                "1",
                                "0",
                                String.valueOf(transId),
                                String.valueOf(compId)
                        });
                if(cursorPromoProduct.moveToFirst()){
                    while(!cursorPromoProduct.isAfterLast()){
                        double discountPercent = 0;
                        double discountAmount = 0;
                        double totalPrice = cursorPromoProduct.getDouble(cursorPromoProduct.getColumnIndex(TOTAL_RETAIL_PRICE))
                                - cursorPromoProduct.getDouble(cursorPromoApply.getColumnIndex(DISC_OTHER));
                        double productQty = cursorPromoProduct.getDouble(cursorPromoProduct.getColumnIndex(TOTAL_QTY));
                        int promoLineNo = cursorPromoProduct.getInt(cursorPromoProduct.getColumnIndex(INSERT_NO));
                        if(cursorPromoApply.getDouble(cursorPromoApply.getColumnIndex(DISCOUNT_PERCENT)) > 0){
                            discountPercent = cursorPromoApply.getDouble(cursorPromoApply.getColumnIndex(DISCOUNT_PERCENT));
                            discountAmount = Utils.round(totalPrice * discountPercent / 100, VtecPosApplication.ROUND_DIGIT);
                        }else if(cursorPromoProduct.getDouble(cursorPromoProduct.getColumnIndex(DISCOUNT_PERCENT)) > 0){
                            discountPercent = cursorPromoProduct.getDouble(cursorPromoProduct.getColumnIndex(DISCOUNT_PERCENT));
                            discountAmount = Utils.round(totalPrice * discountPercent / 100, VtecPosApplication.ROUND_DIGIT);
                        }else if(){

                        }
                        ElseIf ProductPromo.Rows(j)("DiscountAmount") > 0 Then
                                DiscAmount = Math.ROUND(ProductQty * ProductPromo.Rows(j)("DiscountAmount"), DecimalDigit)
                        End If
                        cursorPromoProduct.moveToNext();
                    }
                }
                cursorPromoProduct.close();
                cursorPromoApply.moveToNext();
            }
        }
        cursorPromoApply.close();
    }

    /**
     * @param model
     * @return
     * @throws SQLException
     */
    public int insertOrderDetail(OrdersDataModel.OrderDetail model) throws SQLException{
        int ordId = getMaxOrderId(model.getTransactionId(), model.getComputerId());
        int insertOrdNo = getMaxInsertOrderNo(model.getTransactionId(), model.getComputerId());
        int ordering = 0;
        if(model.getIndentLevel() > 1 && model.getOrderDetailLinkId() > 0)
            ordering = getDisplayOrdering(model.getOrderDetailLinkId(), model.getTransactionId(),
                model.getComputerId());
        ContentValues cv = new ContentValues();
        cv.put(ORDER_DETAIL_ID, ordId);
        cv.put(TRANSACTION_ID, model.getTransactionId());
        cv.put(COMPUTER_ID, model.getComputerId());
        cv.put(COMPONENT_LEVEL, model.getComponentLevel());
        cv.put(ORDER_DETAIL_LINK_ID, model.getOrderDetailLinkId());
        cv.put(INSERT_ORDER_NO, insertOrdNo);
        cv.put(INDENT_LEVEL, model.getIndentLevel());
        cv.put(DISPLAY_ORDERING, ordering);
        cv.put(SALE_DATE, model.getSaleDate());
        cv.put(SHOP_ID, model.getShopId());
        cv.put(PRODUCT_ID, model.getProductId());
        cv.put(PRODUCT_SET_TYPE, model.getProductSetType());
        cv.put(ORDER_STATUS_ID, model.getOrderStatusId());
        cv.put(SALE_MODE, model.getSaleMode());
        cv.put(TOTAL_QTY, model.getTotalQty());
        cv.put(PRICE_PER_UNIT, model.getPricePerUnit());
        cv.put(TOTAL_RETAIL_PRICE, model.getTotalRetailPrice());
        cv.put(ORG_PRICE_PER_UNIT, model.getOrgPricePerUnit());
        cv.put(ORG_TOTAL_RETAIL_PRICE, model.getOrgTotalRetailPrice());
        cv.put(DISC_PRICE_PERCENT, model.getDiscPricePercent());
        cv.put(DISC_PRICE, model.getDiscPrice());
        cv.put(DISC_OTHER, model.getDiscOther());
        cv.put(TOTAL_ITEM_DISC, model.getTotalItemDisc());
        cv.put(SALE_PRICE, model.getSalePrice());
        cv.put(PRODUCT_VAT_CODE, model.getProductVATCode());
        cv.put(VAT_DISPLAY, model.getVatDisplay());
        cv.put(PRODUCT_VAT_PERCENT, model.getProductVATPercent());
        cv.put(VATABLE, model.getVatable());
        cv.put(IS_SC_BEFORE_DISC, model.getIsSCBeforeDisc());
        cv.put(HAS_SERVICE_CHARGE, model.getHasServiceCharge());
        cv.put(SC_PERCENT, model.getScPercent());
        cv.put(OTHER_FOOD_NAME, model.getOtherFoodName());
        cv.put(OTHER_PRODUCT_GROUP_ID, model.getOtherProductGroupID());
        cv.put(DISCOUNT_ALLOW, model.getDiscountAllow());
        cv.put(ITEM_DISC_ALLOW, model.getItemDiscAllow());
        cv.put(LAST_TRANSACTION_ID, model.getLastTransactionId());
        cv.put(LAST_COMPUTER_ID, model.getLastComputerId());
        cv.put(PRINTER_ID, model.getPrinterId());
        cv.put(INVENTORY_ID, model.getInventoryId());
        cv.put(ORDER_STAFF_ID, model.getOrderStaffId());
        cv.put(ORDER_COMPUTER_ID, model.getOrderComputerId());
        cv.put(ORDER_TABLE_ID, model.getOrderTableId());
        cv.put(VOID_TYPE_ID, model.getVoidTypeId());
        cv.put(VOID_STAFF_ID, model.getVoidStaffId());
        cv.putNull(VOID_DATE_TIME);
        cv.put(VAT_TYPE, model.getVatType());
        cv.put(PRINT_GROUP, model.getPrintGroup());
        cv.put(NO_PRINT_BILL, model.getNoPrintBill());
        cv.put(NO_REPRINT_ORDER, model.getNoRePrintOrder());
        cv.put(START_TIME, VtecPosApplication.getISODateTime());
        cv.putNull(FINISH_TIME);
        cv.put(PRINT_STATUS, model.getPrintStatus());
        cv.put(PROCESS_ID, model.getProcessId());
        cv.put(SUBMIT_ORDER_DATE_TIME, VtecPosApplication.getISODateTime());
        cv.put(COMMENT, model.getComment());
        cv.put(IS_COMMENT, model.getIsComment());
        cv.put(DELETED, model.getDeleted());
        openWritable().insertOrThrow(TABLE_ORDER_DETAIL_FRONT, null, cv);
        return ordId;
    }

    /**
     * @param model
     * @return last transactionId | 0 if fail
     * @throws SQLException
     */
    public int insertTransaction(OrdersDataModel model) throws SQLException{
        int transId = getMaxTransId();
        String saleDate = VtecPosApplication.getISODate();
        String[] dateSplit = saleDate.split("-");
        String year = dateSplit[0];
        String month = dateSplit[1];
        String day = dateSplit[2];
        ContentValues cv = new ContentValues();
        cv.put(TRANSACTION_ID, transId);
        cv.put(COMPUTER_ID, model.getComputerId());
        cv.put(TRANSACTION_UUID, UUID.randomUUID().toString());
        cv.put(OPEN_TIME, VtecPosApplication.getISODateTime());
        cv.put(OPEN_STAFF_ID, model.getOpenStaffId());
        cv.put(SALE_MODE, model.getSaleMode());
        cv.put(NO_CUSTOMER, model.getSaleMode());
        cv.put(DOC_TYPE, model.getDocType());
        cv.put(RECEIPT_YEAR, year);
        cv.put(RECEIPT_MONTH, month);
        cv.put(SALE_DATE, saleDate);
        cv.put(SHOP_ID, model.getShopId());
        openWritable().insertOrThrow(TABLE_TRANSACTION_FRONT, null, cv);
        return transId;
    }

    /**
     * @param isoSaleDate
     * @return max receiptId
     */
    private int getMaxReceiptId(String isoSaleDate){
        int maxReceiptId = 0;
        Cursor cursor = openReadable().rawQuery(
                "select max(" + RECEIPT_ID + ") " +
                        " from " + TABLE_TRANSACTION +
                        " where " + SALE_DATE + "=?" +
                        " and " + TRANSACTION_STATUS_ID + "=?",
                new String[]{
                        isoSaleDate,
                        String.valueOf(SUCCESS_TRANS)
                });
        if(cursor.moveToFirst()){
            maxReceiptId = cursor.getInt(0);
        }
        cursor.close();
        return maxReceiptId + 1;
    }

    /**
     * @param ordLinkId
     * @param transId
     * @param compId
     * @return displayOrdering
     */
    private int getDisplayOrdering(int ordLinkId, int transId, int compId){
        int ordering = 0;
        Cursor cursor = openReadable().rawQuery(
                "select " + DISPLAY_ORDERING +
                    " from " + TABLE_ORDER_DETAIL_FRONT +
                    " where " + ORDER_DETAIL_ID + "=?" +
                    " and " + TRANSACTION_ID + "=?" +
                    " and " + COMPUTER_ID + "?",
                new String[]{
                        String.valueOf(ordLinkId),
                        String.valueOf(transId),
                        String.valueOf(compId)
                });
        if(cursor.moveToFirst()){
            ordering = cursor.getInt(0);
        }
        cursor.close();
        return ordering;
    }

    /**
     * @param transId
     * @param compId
     * @return max insertOrderNo | 0 if no record
     */
    private int getMaxInsertOrderNo(int transId, int compId){
        int maxOrderNo = 0;
        Cursor cursor = openReadable().rawQuery(
                "select max(" + INSERT_ORDER_NO + ") " +
                        " from " + TABLE_ORDER_DETAIL_FRONT +
                        " where " + TRANSACTION_ID + "=? " +
                        " and " + COMPUTER_ID + "=?",
                new String[]{
                        String.valueOf(transId),
                        String.valueOf(compId)
                });
        if(cursor.moveToFirst()){
            maxOrderNo = cursor.getInt(0);
        }
        cursor.close();
        return maxOrderNo;
    }

    /**
     * @param transId
     * @param compId
     * @return max orderDetailId
     */
    private int getMaxOrderId(int transId, int compId){
        int maxOrderId = 0;
        Cursor cursor = openReadable().rawQuery(
                "select max(" + ORDER_DETAIL_ID + ")" +
                        " from " + TABLE_ORDER_DETAIL_FRONT +
                        " where " + TRANSACTION_ID + "=?" +
                        " and " + COMPUTER_ID + "=?",
                new String[]{
                        String.valueOf(transId),
                        String.valueOf(compId)
                });
        if(cursor.moveToFirst()){
            maxOrderId = cursor.getInt(0);
        }
        cursor.close();
        if(maxOrderId == 0){
            cursor = openReadable().rawQuery(
                    "select max(" + ORDER_DETAIL_ID + ")" +
                            " from " + TABLE_ORDER_DETAIL +
                            " where " + TRANSACTION_ID + "=?" +
                            " and " + COMPUTER_ID + "=?",
                    new String[]{
                            String.valueOf(transId),
                            String.valueOf(compId)
                    });
            if(cursor.moveToFirst()){
                maxOrderId = cursor.getInt(0);
            }
            cursor.close();
        }
        return maxOrderId + 1;
    }

    /**
     * @return max transactionId
     */
    private int getMaxTransId(){
        int maxTransId = 0;
        Cursor cursor = openReadable().rawQuery(
                "select max(" + TRANSACTION_ID + ")" +
                        " from " + TABLE_TRANSACTION_FRONT, null);
        if (cursor.moveToFirst()) {
            maxTransId = cursor.getInt(0);
        }
        cursor.close();
        if(maxTransId == 0){
            cursor = openReadable().rawQuery(
                    "select max(" + TRANSACTION_ID + ")" +
                            " from " + TABLE_TRANSACTION +
                            " where " + TRANSACTION_STATUS_ID + "=?",
                    new String[]{
                            String.valueOf(SUCCESS_TRANS)
                    });
            if(cursor.moveToFirst()){
                maxTransId = cursor.getInt(0);
            }
            cursor.close();
        }
        return maxTransId + 1;
    }

}
