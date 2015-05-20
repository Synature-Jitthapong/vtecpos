package com.vtec.j1tth4.vtecpos.provider;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.vtec.j1tth4.vtecpos.GlobalPropertyManager;
import com.vtec.j1tth4.vtecpos.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by j1tth4 on 4/29/15.
 */
public class TransactionDataSource {

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
    public static final String TABLE_ORDER_VATABLE_DETAIL_FRONT = "OrderVatableDetailFront";
    public static final String TABLE_ORDER_VATABLE_DETAIL = "OrderVatableDetail";
    public static final String TABLE_SALE_MODE = "SaleMode";

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
    public static final String WEIGHT_BEFORE_VAT = "WeightBeforeVAT";
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
    public static final String PROMOTION_UUID = "PromoUUID";
    public static final String DISC_TYPE_ID = "DiscTypeID";
    public static final String DISCOUNT_PRICE = "DiscountPrice";
    public static final String MULTI_PROMO_OPTION = "MultiPromoOption";
    public static final String IS_CALCULATE = "IsCalculate";
    public static final String PROMO_LINE_NO = "PromoLineNo";
    public static final String VOUCHER_ID = "VoucherID";
    public static final String VOUCHER_NUMBER = "VoucherNumber";
    public static final String IS_PRICE_DISC = "IsPriceDisc";
    public static final String BILL_ORG_DISC_AMOUNT = "BillOrgDiscAmount";
    public static final String VATABLE_BEFORE_DISC = "VatableBeforeDisc";
    public static final String VAT_CODE = "VATCode";
    public static final String VAT_PERCENT = "VATPercent";
    public static final String VAT_RATE = "VATRate";
    public static final String VATABLE_BEFORE_VAT = "VATableBeforeVAT";
    public static final String VAT_AMOUNT = "VATAmount";
    public static final String TRANS_BEFORE_VAT = "TranBeforeVAT";
    public static final String SALE_MODE_ID = "SaleModeID";

    private DatabaseHelper mDbHelper;
    private GlobalPropertyManager mGpManager;

    public TransactionDataSource(Context c){
        mDbHelper = DatabaseHelper.getInstance(c);
        mGpManager = GlobalPropertyManager.getInstance(c);
    }

    public void weightProductSet(int transId, int compId){
        SQLiteDatabase db = mDbHelper.openWritable();
        db.beginTransaction();
        try {
            Cursor cursor1 = db.rawQuery(
                    "select * from " + TABLE_ORDER_DETAIL_FRONT +
                            " where " + COMPONENT_LEVEL + "=?" +
                            " and " + ORDER_STATUS_ID + "<=?" +
                            " and " + TRANSACTION_ID + "=?" +
                            " and " + COMPUTER_ID + "=?",
                    new String[]{
                            "2",
                            "2",
                            String.valueOf(transId),
                            String.valueOf(compId)
                    });
            if (cursor1.moveToFirst()) {
                while (!cursor1.isAfterLast()) {
                    int orderDetailId = cursor1.getInt(cursor1.getColumnIndex(ORDER_DETAIL_ID));
                    double sumWeightVatable = 0;
                    double sumWeightPrice = 0;
                    double sumProductWeightVat = 0;
                    double sumWeightBeforeVat = 0;
                    double sumScWeightAmount = 0;
                    double sumScWeightVat = 0;
                    double sumScWeightBeforeVat = 0;
                    Cursor cursor2 = db.rawQuery(
                            "select * from " + TABLE_ORDER_DETAIL_FRONT +
                                    " where " + ORDER_DETAIL_ID + "=?" +
                                    " and " + TRANSACTION_ID + "=?" +
                                    " and " + COMPUTER_ID + "=?",
                            new String[]{
                                    String.valueOf(orderDetailId),
                                    String.valueOf(transId),
                                    String.valueOf(compId)
                            });
                    if (cursor2.moveToFirst()) {
                        double netSale = cursor2.getDouble(cursor2.getColumnIndex(NET_SALE));
                        double scAmount = cursor2.getDouble(cursor2.getColumnIndex(SC_AMOUNT));
                        double vatable = cursor2.getDouble((cursor2.getColumnIndex(VATABLE)));
                        double productVat = cursor2.getDouble(cursor2.getColumnIndex(PRODUCT_VAT));
                        double productBeforeVat = cursor2.getDouble(cursor2.getColumnIndex(PRODUCT_BEFORE_VAT));
                        double scVat = cursor2.getDouble(cursor2.getColumnIndex(SC_VAT));
                        double scBeforeVat = cursor2.getDouble(cursor2.getColumnIndex(SC_BEFORE_VAT));
                        Cursor cursor3 = db.rawQuery(
                                "select a.*,b." + HAS_SERVICE_CHARGE + " as SaleModeSC, " +
                                        " c." + IS_SC_BEFORE_DISC + ",c." + SC_PERCENT +
                                        " from " + TABLE_ORDER_DETAIL_FRONT + " a " +
                                        " left outer join " + TABLE_SALE_MODE + " b " +
                                        " on a." + SALE_MODE + "=b." + SALE_MODE_ID +
                                        " left outer join " + ShopDataSource.TABLE_SHOP_DATA + " c " +
                                        " on a." + SHOP_ID + "=c." + SHOP_ID +
                                        " where " + IS_COMMENT + "=?" +
                                        " and " + ORDER_DETAIL_LINK_ID + "=?" +
                                        " and " + TRANSACTION_ID + "=?" +
                                        " and " + COMPUTER_ID + "=?" +
                                        " order by a." + PRODUCT_VAT_PERCENT,
                                new String[]{
                                        "0",
                                        String.valueOf(orderDetailId),
                                        String.valueOf(transId),
                                        String.valueOf(compId)
                                });
                        if (cursor3.moveToFirst()) {
                            double sumOrgPrice = 0;
                            while (!cursor3.isAfterLast()) {
                                sumOrgPrice += cursor3.getDouble(cursor3.getColumnIndex(ORG_TOTAL_RETAIL_PRICE));
                                cursor3.moveToNext();
                            }
                            cursor3.moveToFirst();
                            while (!cursor3.isAfterLast()) {
                                double weightPrice = 0;
                                double weightVatable = 0;
                                double scWeightAmount = 0;
                                double productWeightVat = 0;
                                double weightBeforeVat = 0;
                                double scWeightVat = 0;
                                double scWeightBeforeVat = 0;
                                double orgTotalRetailPrice = cursor3.getDouble(cursor3.getColumnIndex(ORG_TOTAL_RETAIL_PRICE));
                                double productVatPercent = cursor3.getDouble(cursor3.getColumnIndex(PRODUCT_VAT_PERCENT));
                                int vatType = cursor3.getInt(cursor3.getColumnIndex(VAT_TYPE));
                                if (cursor3.getPosition() < cursor3.getCount() - 1) {
                                    weightPrice = Utils.round((orgTotalRetailPrice * netSale) / sumOrgPrice, 0);
                                    weightVatable = weightPrice;
                                    scWeightAmount = Utils.round((orgTotalRetailPrice * scAmount) / sumOrgPrice, 0);
                                    if (vatType == 1) {
                                        productWeightVat = Utils.round(weightPrice *
                                                productVatPercent / (100 + productVatPercent), mGpManager.getRoundingDigit());
                                        weightBeforeVat = weightPrice - productWeightVat;

                                        scWeightVat = Utils.round(scWeightAmount *
                                                productVatPercent / (100 + productVatPercent), mGpManager.getRoundingDigit());
                                        scWeightBeforeVat = scWeightAmount - scWeightVat;
                                    } else {
                                        productWeightVat = Utils.round(weightPrice * productVatPercent / 100, mGpManager.getRoundingDigit());
                                        weightBeforeVat = weightPrice;

                                        scWeightVat = Utils.round(scWeightAmount * productVatPercent / 100, mGpManager.getRoundingDigit());
                                        scWeightBeforeVat = scWeightVat;
                                    }
                                    sumWeightVatable += weightVatable;
                                    sumWeightPrice += weightPrice;
                                    sumProductWeightVat += productWeightVat;
                                    sumWeightBeforeVat += weightBeforeVat;
                                    sumScWeightAmount += scWeightAmount;
                                    sumScWeightVat += scWeightVat;
                                    sumScWeightBeforeVat += scWeightBeforeVat;
                                } else {
                                    weightVatable = vatable - sumWeightVatable;
                                    weightPrice = netSale - sumWeightPrice;
                                    productWeightVat = productVat - sumProductWeightVat;
                                    weightBeforeVat = productBeforeVat - sumWeightBeforeVat;
                                    scWeightAmount = scAmount - sumScWeightAmount;
                                    scWeightVat = scVat - sumScWeightVat;
                                    scWeightBeforeVat = scBeforeVat - sumScWeightBeforeVat;
                                }
                                ContentValues cv = new ContentValues();
                                cv.put(W_VATABLE, weightVatable);
                                cv.put(WEIGHT_PRICE, weightPrice);
                                cv.put(WEIGHT_PRICE_VAT, productWeightVat);
                                cv.put(WEIGHT_BEFORE_VAT, weightBeforeVat);
                                cv.put(SCW_AMOUNT, scWeightAmount);
                                cv.put(SCW_VAT, scWeightVat);
                                cv.put(SCW_BEFORE_VAT, scWeightBeforeVat);
                                db.update(
                                        TABLE_ORDER_DETAIL_FRONT,
                                        cv,
                                        ORDER_DETAIL_ID + "=?" +
                                                " and " + TRANSACTION_ID + "=?" +
                                                " and " + COMPUTER_ID + "=?",
                                        new String[]{
                                                cursor3.getString(cursor3.getColumnIndex(ORDER_DETAIL_ID)),
                                                cursor3.getString(cursor3.getColumnIndex(TRANSACTION_ID)),
                                                cursor3.getString(cursor3.getColumnIndex(COMPUTER_ID))
                                        });
                                cursor3.moveToNext();
                            }
                        }
                        cursor3.close();
                    }
                    cursor2.close();
                    cursor1.moveToNext();
                }
                db.execSQL("update " + TABLE_ORDER_DETAIL_FRONT +
                                " set " + W_VATABLE + "=" + VATABLE + "+" + W_VATABLE + ", " +
                                WEIGHT_PRICE + "=" + WEIGHT_PRICE + "+" + NET_SALE + ", " +
                                WEIGHT_PRICE_VAT + "=" + WEIGHT_PRICE_VAT + "+" + PRODUCT_VAT + ", " +
                                WEIGHT_BEFORE_VAT + "=" + WEIGHT_BEFORE_VAT + "+" + PRODUCT_BEFORE_VAT + ", " +
                                SCW_AMOUNT + "=" + SCW_AMOUNT + "+" + SC_AMOUNT + ", " +
                                SCW_VAT + "=" + SCW_VAT + "+" + SC_VAT + ", " +
                                SCW_BEFORE_VAT + "=" + SCW_BEFORE_VAT + "+" + SC_BEFORE_VAT +
                                " where " + ORDER_STATUS_ID + "<=?" +
                                " and " + COMPONENT_LEVEL + "<?" +
                                " and " + TRANSACTION_ID + "=?" +
                                " and " + COMPUTER_ID + "=?",
                        new String[]{
                                "2",
                                "2",
                                String.valueOf(transId),
                                String.valueOf(compId)
                        });
            }
            cursor1.close();

            //Move to real table
            String[] tables = {
                    TABLE_TRANSACTION,
                    TABLE_ORDER_DETAIL,
                    PaymentDataSource.TABLE_ORDER_PAY_DETAIL,
                    TABLE_ORDER_PROMOTION_APPLY,
                    TABLE_ORDER_PROMOTION_DETAIL,
                    TABLE_ORDER_VATABLE_DETAIL
            };
            String[] whereArgs = {
                    String.valueOf(transId),
                    String.valueOf(compId)
            };
            for (int i = 0; i < tables.length; i++) {
                db.execSQL("delete from " + tables[i] +
                                " where " + TRANSACTION_ID + "=? " +
                                " and " + COMPUTER_ID + "=?",
                        whereArgs);
                db.execSQL("insert into " + tables[i] +
                                " select * from " + tables[i] + "Front" +
                                " where " + TRANSACTION_ID + "=?" +
                                " and " + COMPUTER_ID + "=?",
                        whereArgs);
                db.execSQL("delete from " + tables[i] + "Front" +
                                " where " + TRANSACTION_ID + "=?" +
                                " and " + COMPUTER_ID + "=?",
                        whereArgs);
            }
            db.setTransactionSuccessful();
        }finally {
            db.endTransaction();
        }
    }

    public void finalizeBill(int transId, int compId){
        SQLiteDatabase db = mDbHelper.openWritable();
        db.beginTransaction();
        try {
            Cursor cursor = db.query(
                    TABLE_TRANSACTION_FRONT,
                    new String[]{
                            VAT_PERCENT,
                            SERVICE_CHARGE_VAT,
                            TRANSACTION_VAT
                    }, TRANSACTION_ID + "=?" +
                            " and " + COMPUTER_ID + "=?",
                    new String[]{
                            String.valueOf(transId),
                            String.valueOf(compId)
                    }, null, null, null);
            double vatPercent = 0;
            double transScVat = 0;
            double transVat = 0;
            if (cursor.moveToFirst()) {
                vatPercent = cursor.getDouble(cursor.getColumnIndex(VAT_PERCENT));
                transScVat = cursor.getDouble(cursor.getColumnIndex(SERVICE_CHARGE_VAT));
                transVat = cursor.getDouble(cursor.getColumnIndex(TRANSACTION_VAT));
            }
            cursor.close();
            cursor = db.rawQuery(
                    "select sum(" + DISCOUNT_PRICE + ") " +
                            " from " + TABLE_ORDER_PROMOTION_DETAIL_FRONT +
                            " where " + BILL_DISC + "=? " +
                            " and " + TRANSACTION_ID + "=?" +
                            " and " + COMPUTER_ID + "=?",
                    new String[]{
                            "1",
                            String.valueOf(transId),
                            String.valueOf(compId)
                    });
            double totalBillDisc = 0;
            if (cursor.moveToFirst()) {
                totalBillDisc = cursor.getDouble(0);
            }
            cursor.close();
            if (totalBillDisc > 0) {
                cursor = db.rawQuery(
                        "select * from " + TABLE_ORDER_DETAIL_FRONT +
                                " where " + ORDER_STATUS_ID + "<=?" +
                                " and " + PRODUCT_VAT_PERCENT + ">? " +
                                " and " + SALE_PRICE + ">?" +
                                " and " + INDENT_LEVEL + "=?",
                        new String[]{
                                "2",
                                "0",
                                "0",
                                "0"
                        });
                if (cursor.moveToFirst()) {
                    double totalSale = 0;
                    double discBill = 0;
                    double sumDiscBill = 0;
                    int rowCount = cursor.getCount();
                    while (!cursor.isAfterLast()) {
                        totalSale += cursor.getDouble(cursor.getColumnIndex(SALE_PRICE));
                        cursor.moveToNext();
                    }
                    cursor.moveToFirst();
                    while (!cursor.isAfterLast()) {
                        if (cursor.getPosition() == rowCount) {
                            discBill = totalBillDisc - sumDiscBill;
                        } else {
                            discBill = Utils.round(cursor.getDouble(cursor.getColumnIndex(SALE_PRICE))
                                    * totalBillDisc / totalSale, 0);
                        }
                        sumDiscBill += discBill;
                        db.execSQL("update " + TABLE_ORDER_DETAIL_FRONT +
                                        " set " + DISC_BILL + "=" + discBill + ", " +
                                        NET_SALE + "=" + SALE_PRICE + "-" + discBill +
                                        " where " + ORDER_DETAIL_ID + "=?" +
                                        " and " + TRANSACTION_ID + "=?" +
                                        " and " + COMPUTER_ID + "=?",
                                new String[]{
                                        cursor.getString(cursor.getColumnIndex(ORDER_DETAIL_ID)),
                                        cursor.getString(cursor.getColumnIndex(TRANSACTION_ID)),
                                        cursor.getString(cursor.getColumnIndex(COMPUTER_ID))
                                });
                        cursor.moveToNext();
                    }
                }
                cursor.close();
            }
            db.execSQL(
                    "update " + TABLE_ORDER_DETAIL_FRONT +
                            " set " + NET_SALE + "=" + SALE_PRICE +
                            " where " + ORDER_STATUS_ID + "<=?" +
                            " and (" + INDENT_LEVEL + ">0 OR (" + INDENT_LEVEL + "=0 and " + PRODUCT_VAT_PERCENT + "=0))" +
                            " and " + TRANSACTION_ID + "=?" +
                            " and " + COMPUTER_ID + "=?",
                    new String[]{
                            "2",
                            String.valueOf(transId),
                            String.valueOf(compId)
                    });
            db.execSQL("update " + TABLE_ORDER_DETAIL_FRONT +
                            " set " + SC_AMOUNT + "=" +
                            " case when " + HAS_SERVICE_CHARGE + "=0 then 0" +
                            " when " + IS_SC_BEFORE_DISC + "=0 then round(" + NET_SALE + "*" + SC_PERCENT + "/100," + mGpManager.getRoundingDigit() + ") else round(" + TOTAL_RETAIL_PRICE + "*" + SC_PERCENT + "/100," + mGpManager.getRoundingDigit() + ") end, " +
                            SC_VAT + "=" +
                            " case when " + HAS_SERVICE_CHARGE + "=0 then 0 " +
                            " when " + IS_SC_BEFORE_DISC + "=0 then " +
                            " case when " + VAT_TYPE + "=1 then round(round(" + NET_SALE + "*" + SC_PERCENT + "/100," + mGpManager.getRoundingDigit() + ") * " + vatPercent + "/(100 + " + vatPercent + "), " + mGpManager.getRoundingDigit() + ") else round(round(" + NET_SALE + "*" + SC_PERCENT + "/100, " + mGpManager.getRoundingDigit() + ") * " + vatPercent + "/100, " + mGpManager.getRoundingDigit() + ") end " +
                            " else " +
                            " case when " + VAT_TYPE + "=1 then round(round(" + TOTAL_RETAIL_PRICE + "*" + SC_PERCENT + "/100," + mGpManager.getRoundingDigit() + ") * " + vatPercent + "/(100 + " + vatPercent + "), " + mGpManager.getRoundingDigit() + ") else round(round(" + TOTAL_RETAIL_PRICE + "*" + SC_PERCENT + "/100, " + mGpManager.getRoundingDigit() + ") * " + vatPercent + "/100, " + mGpManager.getRoundingDigit() + ") end " +
                            " end, " + PRODUCT_VAT + "=" +
                            " case when " + VAT_TYPE + "=1 then round(" + NET_SALE + "*" + PRODUCT_VAT_PERCENT + "/(100 + " + PRODUCT_VAT_PERCENT + "), " + mGpManager.getRoundingDigit() + ") else round(" + NET_SALE + "*" + PRODUCT_VAT_PERCENT + "/100, " + mGpManager.getRoundingDigit() + ") end " +
                            " where " + ORDER_STATUS_ID + "<=?" +
                            " and " + TRANSACTION_ID + "=?" +
                            " and " + COMPUTER_ID + "=?",
                    new String[]{
                            "2",
                            String.valueOf(transId),
                            String.valueOf(compId)
                    });
            cursor = db.rawQuery("select sum(" + SC_VAT + ") as " + SC_VAT + ", " +
                            " sum(" + PRODUCT_VAT + ") as " + PRODUCT_VAT +
                            " from " + TABLE_ORDER_DETAIL_FRONT +
                            " where " + ORDER_STATUS_ID + "<=?" +
                            " and " + TRANSACTION_ID + "=?" +
                            " and " + COMPUTER_ID + "=?",
                    new String[]{
                            "2",
                            String.valueOf(transId),
                            String.valueOf(compId)
                    });
            if (cursor.moveToFirst()) {
                if (!cursor.isNull(cursor.getColumnIndex(SC_VAT))) {
                    double diffScVat = transScVat - cursor.getDouble(cursor.getColumnIndex(SC_VAT));
                    if (diffScVat != 0) {
                        Cursor cursor1 = db.rawQuery(
                                "select * from " + TABLE_ORDER_DETAIL_FRONT +
                                        " where " + SC_VAT + ">0 " +
                                        " and " + ORDER_STATUS_ID + "<=?" +
                                        " and " + TRANSACTION_ID + "=?" +
                                        " and " + COMPUTER_ID + "=?" +
                                        " order by " + ORDER_DETAIL_ID + " desc",
                                new String[]{
                                        "2",
                                        String.valueOf(transId),
                                        String.valueOf(compId)
                                });
                        if (cursor1.moveToFirst()) {
                            while (!cursor1.isAfterLast()) {
                                if (cursor1.getDouble(cursor1.getColumnIndex(SC_VAT)) +
                                        (transScVat - cursor.getDouble(cursor.getColumnIndex(SC_VAT))) > 0) {
                                    db.execSQL("update " + TABLE_ORDER_DETAIL_FRONT +
                                                    " set " + SC_VAT + "=" + SC_VAT + "+" +
                                                    (transScVat - cursor.getDouble(cursor.getColumnIndex(SC_VAT))) +
                                                    " where " + ORDER_DETAIL_ID + "=?" +
                                                    " and " + TRANSACTION_ID + "=?" +
                                                    " and " + COMPUTER_ID + "=?",
                                            new String[]{
                                                    cursor1.getString(cursor1.getColumnIndex(ORDER_DETAIL_ID)),
                                                    String.valueOf(transId),
                                                    String.valueOf(compId)
                                            });
                                    break;
                                }
                                cursor1.moveToNext();
                            }
                        }
                        cursor1.close();
                    }
                }
                if (!cursor.isNull(cursor.getColumnIndex(PRODUCT_VAT))) {
                    if (transScVat + cursor.getDouble(cursor.getColumnIndex(PRODUCT_VAT)) != transVat) {
                        Cursor cursor1 = db.rawQuery(
                                "select * from " + TABLE_ORDER_DETAIL_FRONT +
                                        " where " + PRODUCT_VAT + ">0 " +
                                        " and " + ORDER_STATUS_ID + "<=?" +
                                        " and " + TRANSACTION_ID + "=?" +
                                        " and " + COMPUTER_ID + "=?" +
                                        " order by " + ORDER_DETAIL_ID + " desc",
                                new String[]{
                                        "2",
                                        String.valueOf(transId),
                                        String.valueOf(compId)
                                });
                        if (cursor1.moveToFirst()) {
                            while (!cursor1.isAfterLast()) {
                                if (cursor1.getDouble(cursor1.getColumnIndex(PRODUCT_VAT)) +
                                        (transVat - (transScVat + cursor.getDouble(cursor.getColumnIndex(PRODUCT_VAT)))) > 0) {
                                    db.execSQL(
                                            "update " + TABLE_ORDER_DETAIL_FRONT +
                                                    " set " + PRODUCT_VAT + "=" + PRODUCT_VAT + "+" +
                                                    (transVat - (transScVat + cursor.getDouble(cursor.getColumnIndex(PRODUCT_VAT)))) +
                                                    " where " + ORDER_DETAIL_ID + "=?" +
                                                    " and " + TRANSACTION_ID + "=?" +
                                                    " and " + COMPUTER_ID + "=?",
                                            new String[]{
                                                    cursor1.getString(cursor1.getColumnIndex(ORDER_DETAIL_ID)),
                                                    String.valueOf(transId),
                                                    String.valueOf(compId)
                                            });
                                    break;
                                }
                                cursor1.moveToNext();
                            }
                        }
                    }
                }
            }
            cursor.close();
            db.execSQL(
                    "update " + TABLE_ORDER_DETAIL_FRONT +
                            " set " + PRODUCT_BEFORE_VAT + "=" +
                            " case when " + VAT_TYPE + "=1 then " + NET_SALE + "-" + PRODUCT_VAT + " else " + NET_SALE + " end, " +
                            SC_BEFORE_VAT + "=" +
                            " case when " + VAT_TYPE + "=1 then " + SC_AMOUNT + "-" + SC_VAT + " else " + SC_AMOUNT + " end, " +
                            VATABLE + "=" +
                            " case when " + VATABLE + "=0 then 0 else " + NET_SALE + " end, " +
                            TOTAL_RETAIL_VAT + "=" +
                            " case when " + VAT_TYPE + "=1 then round(" + TOTAL_RETAIL_PRICE + "*" + PRODUCT_VAT_PERCENT + "/ (100 + " + PRODUCT_VAT_PERCENT + "), " + mGpManager.getRoundingDigit() + ") else " +
                            " round(" + TOTAL_RETAIL_PRICE + "*" + PRODUCT_VAT_PERCENT + "/ 100, " + mGpManager.getRoundingDigit() + ") end, " +
                            DISC_VAT + "=" +
                            " case when " + VAT_TYPE + "=1 then round(" + TOTAL_RETAIL_PRICE + "*" + PRODUCT_VAT_PERCENT + "/ (100 + " + PRODUCT_VAT_PERCENT + "), " + mGpManager.getRoundingDigit() + ") else " +
                            " round(" + TOTAL_RETAIL_PRICE + "*" + PRODUCT_VAT_PERCENT + "/ 100, " + mGpManager.getRoundingDigit() + ") - " + PRODUCT_VAT + " end " +
                            " where OrderStatusID <=? " +
                            " and " + TRANSACTION_ID + "=?" +
                            " and " + COMPUTER_ID + "=?",
                    new String[]{
                            "2",
                            String.valueOf(transId),
                            String.valueOf(compId)
                    });
            db.setTransactionSuccessful();
        }finally {
            db.endTransaction();
        }
        mDbHelper.close();
    }

    public void calculateBill(int transId, int compId) {
        SQLiteDatabase db = mDbHelper.openWritable();
        db.beginTransaction();
        try {
            db.delete(TABLE_ORDER_VATABLE_DETAIL_FRONT,
                    TRANSACTION_ID + "=?" +
                            " and " + COMPUTER_ID + "=?",
                    new String[]{
                            String.valueOf(transId),
                            String.valueOf(compId)
                    });
            Cursor cursor1 = db.rawQuery(
                    "select " + TRANSACTION_ID + "," + COMPUTER_ID + ", " +
                            PRODUCT_VAT_CODE + ", " + PRODUCT_VAT_PERCENT + ", " +
                            VAT_TYPE + ", sum(" + TOTAL_RETAIL_PRICE + ") as " + TOTAL_RETAIL_PRICE + ", " +
                            " sum(" + SALE_PRICE + ") as " + SALE_PRICE + ", " +
                            " sum(" + VATABLE + ") as " + VATABLE + ", " +
                            " sum(case when " + PRODUCT_VAT_PERCENT + "=0 then 0 else " + TOTAL_RETAIL_PRICE + " end) " +
                            " as " + VATABLE_BEFORE_DISC + ", " +
                            " sum(" + TOTAL_ITEM_DISC + ") as " + TOTAL_ITEM_DISC + ", " +
                            " sum(case when " + INDENT_LEVEL + ">1 then 0 else " + TOTAL_QTY + " end) " +
                            " as " + TOTAL_QTY +
                            " from " + TABLE_ORDER_DETAIL_FRONT +
                            " where " + ORDER_STATUS_ID + "<=? " +
                            " and " + TRANSACTION_ID + "=?" +
                            " and " + COMPUTER_ID + "=?" +
                            " group by " + TRANSACTION_ID + ", " + COMPUTER_ID + ", " +
                            PRODUCT_VAT_CODE + ", " + PRODUCT_VAT_PERCENT + ", " + VAT_TYPE,
                    new String[]{
                            "2",
                            String.valueOf(transId),
                            String.valueOf(compId)
                    });
            double totalQty = 0;
            double totalSale = 0;
            double totalDisc = 0;
            double netSale = 0;
            double totalRetailPrice = 0;
            double vatableBeforeVat = 0;
            double vatableBeforeDisc = 0;
            double totalVatable = 0;
            if (cursor1.moveToFirst()) {
                double vatAmount = 0;
                while (!cursor1.isAfterLast()) {
                    int vatType = cursor1.getInt(cursor1.getColumnIndex(VAT_TYPE));
                    double vatable = cursor1.getDouble(cursor1.getColumnIndex(VATABLE));
                    double productVatPercent = cursor1.getDouble(cursor1.getColumnIndex(PRODUCT_VAT_PERCENT));
                    if (vatType == 1) {//Include VAT
                        vatAmount = Utils.round(vatable * productVatPercent /
                                (100 + productVatPercent), mGpManager.getRoundingDigit());
                        vatableBeforeVat = vatable - vatAmount;
                    } else {
                        vatAmount = Utils.round(vatable * productVatPercent, mGpManager.getRoundingDigit());
                        vatableBeforeVat = vatable;
                    }
                    double salePrice = cursor1.getDouble(cursor1.getColumnIndex(SALE_PRICE));
                    ContentValues cv = new ContentValues();
                    cv.put(TRANSACTION_ID, transId);
                    cv.put(COMPUTER_ID, compId);
                    cv.put(SALE_PRICE, salePrice);
                    cv.put(VATABLE_BEFORE_DISC, cursor1.getDouble(cursor1.getColumnIndex(VATABLE_BEFORE_DISC)));
                    cv.put(VAT_CODE, cursor1.getString(cursor1.getColumnIndex(PRODUCT_VAT_CODE)));
                    cv.put(VAT_RATE, cursor1.getDouble(cursor1.getColumnIndex(PRODUCT_VAT_PERCENT)));
                    cv.put(VATABLE, vatable);
                    cv.put(VATABLE_BEFORE_VAT, vatableBeforeVat);
                    cv.put(VAT_AMOUNT, vatAmount);
                    cv.put(VAT_TYPE, vatType);
                    db.insert(TABLE_ORDER_VATABLE_DETAIL_FRONT, null, cv);

                    totalSale += salePrice;
                    totalDisc += cursor1.getDouble(cursor1.getColumnIndex(TOTAL_ITEM_DISC));
                    netSale += salePrice;
                    totalRetailPrice += cursor1.getDouble(cursor1.getColumnIndex(TOTAL_RETAIL_PRICE));
                    vatableBeforeDisc += cursor1.getDouble(cursor1.getColumnIndex(VATABLE_BEFORE_DISC));
                    totalVatable += cursor1.getDouble(cursor1.getColumnIndex(VATABLE));
                    totalQty += cursor1.getDouble(cursor1.getColumnIndex(TOTAL_QTY));
                    cursor1.moveToNext();
                }
            }
            cursor1.close();

            double scAmount = 0;
            Cursor cursor2 = db.rawQuery(
                    "select sum(case when " + ORDER_STATUS_ID + " > 2 then 0 " +
                            " when " + HAS_SERVICE_CHARGE + "=0 then 0 " +
                            " when " + IS_SC_BEFORE_DISC + "=1 then " + TOTAL_RETAIL_PRICE + "*" + SC_PERCENT + "/100 " +
                            " else " + SALE_PRICE + "*" + SC_PERCENT + "/100 end) as " + SC_AMOUNT +
                            " from " + TABLE_ORDER_DETAIL_FRONT +
                            " where " + ORDER_STATUS_ID + "<=?" +
                            " and " + TRANSACTION_ID + "=?" +
                            " and " + COMPUTER_ID + "=?",
                    new String[]{
                            "2",
                            String.valueOf(transId),
                            String.valueOf(compId)
                    });
            if (cursor2.moveToFirst()) {
                scAmount = cursor2.getDouble(cursor2.getColumnIndex(SC_AMOUNT));
            }
            cursor2.close();

            Cursor cursor3 = db.rawQuery(
                    "select sum(" + DISCOUNT_PRICE + ") " +
                            " from " + TABLE_ORDER_PROMOTION_DETAIL_FRONT +
                            " where " + BILL_DISC + "=?" +
                            " and " + TRANSACTION_ID + "=?" +
                            " and " + COMPUTER_ID + "=?",
                    new String[]{
                            "1",
                            String.valueOf(transId),
                            String.valueOf(compId)
                    });
            double totalBillDisc = 0;
            if (cursor3.moveToFirst()) {
                totalBillDisc = cursor3.getDouble(0);
                netSale = netSale - totalBillDisc;
                totalVatable = totalVatable - totalBillDisc;
                totalDisc += totalBillDisc;
            }
            cursor3.close();

            double scBillDisc = 0;
            if (mGpManager.getScBeforeDisc() == 1) {
                if (totalBillDisc > 0) {
                    scBillDisc = totalBillDisc * mGpManager.getScPercent() / 100;
                }
                scAmount = scAmount - scBillDisc;
            }
            scAmount = Utils.round(scAmount, mGpManager.getRoundingDigit());
            netSale += scAmount;
            vatableBeforeDisc += scAmount;
            totalVatable += scAmount;

            if (netSale == 0 && mGpManager.getCalVatWhenZeroBill() == 1) {
                totalVatable = vatableBeforeDisc;
            }

            double transVat = 0;
            double transBeforeVat = 0;
            double scVat = 0;
            double scBeforeVat = 0;
            double vatPercent = mGpManager.getVatPercent();
            int vatDigit = mGpManager.getVatDigit();
            if (mGpManager.getVatType() == 1) {
                transVat = Utils.round(totalVatable * vatPercent / (100 + vatPercent), vatDigit);
                transBeforeVat = totalVatable - transVat;
                scVat = Utils.round(scAmount * vatPercent / (100 + vatPercent), mGpManager.getRoundingDigit());
                scBeforeVat = scAmount - scVat;
            } else {
                transVat = Utils.round(totalVatable * vatPercent / 100, vatDigit);
                transBeforeVat = totalVatable;
                scVat = Utils.round(scAmount * vatPercent / 100, mGpManager.getRoundingDigit());
                scBeforeVat = scAmount;
            }
            ContentValues cv = new ContentValues();
            cv.put(VAT_CODE, mGpManager.getVatCode());
            cv.put(VAT_PERCENT, vatPercent);
            cv.put(SERVICE_CHARGE_PERCENT, mGpManager.getScPercent());
            cv.put(SERVICE_CHARGE, scAmount);
            cv.put(SERVICE_CHARGE_VAT, scVat);
            cv.put(SC_BEFORE_VAT, scBeforeVat);
            cv.put(TRANSACTION_VATABLE, totalVatable);
            cv.put(TRANSACTION_VAT, transVat);
            cv.put(TRANS_BEFORE_VAT, transBeforeVat);
            cv.put(RECEIPT_TOTAL_QTY, totalQty);
            cv.put(RECEIPT_RETAIL_PRICE, totalRetailPrice);
            cv.put(RECEIPT_DISCOUNT, totalDisc);
            cv.put(RECEIPT_SALE_PRICE, totalSale);
            cv.put(RECEIPT_NET_SALE, netSale);
            db.update(TABLE_TRANSACTION_FRONT, cv,
                    TRANSACTION_ID + "=? " +
                            " and " + COMPUTER_ID + "=?",
                    new String[]{
                            String.valueOf(transId),
                            String.valueOf(compId)
                    });
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
            mDbHelper.close();
        }
    }

    private void refreshPromotion(int transId, int compId){
        SQLiteDatabase db = mDbHelper.openWritable();
        db.beginTransaction();
        try {
            Cursor cursor1 = db.rawQuery(
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
            if (cursor1.moveToFirst()) {
                // refresh for new calculate
                db.delete(
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
                db.update(
                        TABLE_ORDER_DETAIL_FRONT,
                        cv,
                        TRANSACTION_ID + "=?" +
                                " and " + COMPUTER_ID + "=?",
                        new String[]{
                                String.valueOf(transId),
                                String.valueOf(compId)
                        }
                );
                while (!cursor1.isAfterLast()) {
                    String promoId = cursor1.getString(cursor1.getColumnIndex(PROMOTION_ID));
                    Cursor cursor2 = db.rawQuery(
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
                    if (cursor2.moveToFirst()) {
                        while (!cursor2.isAfterLast()) {
                            double discountPercent = 0;
                            double discountAmount = 0;
                            double totalPrice = cursor2.getDouble(cursor2.getColumnIndex(TOTAL_RETAIL_PRICE))
                                    - cursor2.getDouble(cursor1.getColumnIndex(DISC_OTHER));
                            double productQty = cursor2.getDouble(cursor2.getColumnIndex(TOTAL_QTY));
                            int promoLineNo = cursor2.getInt(cursor2.getColumnIndex(INSERT_NO));
                            if (cursor1.getDouble(cursor1.getColumnIndex(DISCOUNT_PERCENT)) > 0) {
                                discountPercent = cursor1.getDouble(cursor1.getColumnIndex(DISCOUNT_PERCENT));
                                discountAmount = Utils.round(totalPrice * discountPercent / 100, mGpManager.getRoundingDigit());
                            } else if (cursor2.getDouble(cursor2.getColumnIndex(DISCOUNT_PERCENT)) > 0) {
                                discountPercent = cursor2.getDouble(cursor2.getColumnIndex(DISCOUNT_PERCENT));
                                discountAmount = Utils.round(totalPrice * discountPercent / 100, mGpManager.getRoundingDigit());
                            } else if (cursor2.getDouble(cursor2.getColumnIndex(DISCOUNT_AMOUNT)) > 0) {
                                discountAmount = Utils.round(productQty *
                                        cursor2.getDouble(cursor2.getColumnIndex(DISCOUNT_AMOUNT)), mGpManager.getRoundingDigit());
                            }

                            if (discountAmount > 0) {
                                cv = new ContentValues();
                                cv.put(PROMOTION_UUID, cursor1.getString(cursor1.getColumnIndex(PROMOTION_UUID)));
                                cv.put(TRANSACTION_ID, transId);
                                cv.put(COMPUTER_ID, compId);
                                cv.put(ORDER_DETAIL_ID, cursor2.getInt(cursor2.getColumnIndex(ORDER_DETAIL_ID)));
                                cv.put(DISC_TYPE_ID, cursor1.getInt(cursor1.getColumnIndex(DISC_TYPE_ID)));
                                cv.put(BILL_DISC, cursor1.getDouble(cursor1.getColumnIndex(BILL_DISC)));
                                cv.put(PROMOTION_ID, cursor1.getInt(cursor1.getColumnIndex(PROMOTION_ID)));
                                cv.put(DISC_PRIORITY, cursor1.getInt(cursor1.getColumnIndex(DISC_PRIORITY)));
                                cv.put(DISCOUNT_PRICE, discountAmount);
                                cv.put(MULTI_PROMO_OPTION, cursor1.getInt(cursor1.getColumnIndex(MULTI_PROMO_OPTION)));
                                cv.put(IS_CALCULATE, 2);
                                cv.put(PROMO_LINE_NO, promoLineNo);
                                cv.put(VOUCHER_ID, cursor1.getInt(cursor1.getColumnIndex(VOUCHER_ID)));
                                cv.put(VOUCHER_NUMBER, cursor1.getString(cursor1.getColumnIndex(VOUCHER_NUMBER)));
                                db.insert(TABLE_ORDER_PROMOTION_DETAIL_FRONT, null, cv);
                            }

                            int itemDiscountAllow = 0;
                            if (cursor1.getInt(cursor1.getColumnIndex(MULTI_PROMO_OPTION)) > 2) {
                                itemDiscountAllow = 0;
                            } else {
                                itemDiscountAllow = 1;
                            }

                            double totalDiscount = 0;
                            Cursor cursor3 = db.rawQuery(
                                    "select sum(" + DISCOUNT_PRICE + ") " +
                                            " from " + TABLE_ORDER_PROMOTION_DETAIL_FRONT +
                                            " where " + TRANSACTION_ID + "=?" +
                                            " and " + COMPUTER_ID + "=?" +
                                            " and " + ORDER_DETAIL_ID + "=?",
                                    new String[]{
                                            String.valueOf(transId),
                                            String.valueOf(compId),
                                            cursor2.getString(cursor2.getColumnIndex(ORDER_DETAIL_ID))
                                    });
                            if (cursor3.moveToFirst()) {
                                totalDiscount = cursor3.getDouble(0);
                            }

                            if (cursor1.getInt(cursor1.getColumnIndex(IS_PRICE_DISC)) == 1) {
                                cv = new ContentValues();
                                cv.put(ITEM_DISC_ALLOW, itemDiscountAllow);
                                cv.put(DISC_PRICE_PERCENT, discountPercent);
                                cv.put(DISC_PRICE, totalDiscount);
                                db.update(TABLE_ORDER_DETAIL_FRONT, cv,
                                        TRANSACTION_ID + "=?" +
                                                " and " + COMPUTER_ID + "=?" +
                                                " and " + ORDER_DETAIL_ID + "=?",
                                        new String[]{
                                                String.valueOf(transId),
                                                String.valueOf(compId),
                                                cursor2.getString(cursor2.getColumnIndex(ORDER_DETAIL_ID))
                                        });
                            } else {
                                cv = new ContentValues();
                                cv.put(ITEM_DISC_ALLOW, itemDiscountAllow);
                                cv.put(DISC_PERCENT, discountPercent);
                                cv.put(DISC_AMOUNT, discountAmount);
                                db.update(TABLE_ORDER_DETAIL_FRONT, cv,
                                        TRANSACTION_ID + "=?" +
                                                " and " + COMPUTER_ID + "=?" +
                                                " and " + ORDER_DETAIL_ID + "=?",
                                        new String[]{
                                                String.valueOf(transId),
                                                String.valueOf(compId),
                                                cursor2.getString(cursor2.getColumnIndex(ORDER_DETAIL_ID))
                                        });
                            }
                            db.execSQL(
                                    "update " + TABLE_ORDER_DETAIL_FRONT +
                                            " set " + VATABLE + "=" +
                                            " case when " + PRODUCT_VAT_PERCENT + "=0 then 0" +
                                            " else " + SALE_PRICE + " end, " +
                                            TOTAL_ITEM_DISC + "=" + DISC_PRICE + "+" + DISC_AMOUNT + "+" + DISC_OTHER + ", " +
                                            SALE_PRICE + "=" + TOTAL_RETAIL_PRICE + "-(" + DISC_PRICE + "+" + DISC_AMOUNT + "+" + DISC_OTHER + ")" +
                                            " where " + TRANSACTION_ID + "=?" +
                                            " and " + COMPUTER_ID + "=?" +
                                            " and " + ORDER_DETAIL_ID + "=?",
                                    new String[]{
                                            String.valueOf(transId),
                                            String.valueOf(compId),
                                            cursor2.getString(cursor2.getColumnIndex(ORDER_DETAIL_ID))
                                    });
                            cursor2.moveToNext();
                        }
                    }
                    cursor2.close();
                    cursor1.moveToNext();
                }
            }
            cursor1.close();

            //Get Bill Discount for Calculate
            Cursor cursor4 = db.rawQuery(
                    "select * from " + TABLE_ORDER_PROMOTION_APPLY_FRONT +
                            " where " + IS_CALCULATE + " in (0,1)" +
                            " and " + BILL_DISC + "=?" +
                            " and " + TRANSACTION_ID + "=?" +
                            " and " + COMPUTER_ID + "=?" +
                            " order by " + DISC_PRIORITY,
                    new String[]{
                            "1",
                            String.valueOf(transId),
                            String.valueOf(compId)
                    });

            if (cursor4.moveToFirst()) {
                Cursor cursor5 = db.rawQuery(
                        "select sum(" + SALE_PRICE + ") " +
                                " from " + TABLE_ORDER_DETAIL_FRONT +
                                " where " + ORDER_STATUS_ID + "<=?" +
                                " and " + TRANSACTION_ID + "=?" +
                                " and " + COMPUTER_ID + "=?",
                        new String[]{
                                "2",
                                String.valueOf(transId),
                                String.valueOf(compId)
                        });
                double totalSale = 0;
                if (cursor5.moveToFirst()) {
                    totalSale = cursor5.getDouble(0);
                }
                cursor5.close();

                while (!cursor4.isAfterLast()) {
                    double discAmount = 0;
                    double billOrgDiscAmount = cursor4.getDouble(cursor4.getColumnIndex(BILL_ORG_DISC_AMOUNT));
                    if (cursor4.getDouble(cursor4.getColumnIndex(DISCOUNT_PERCENT)) > 0) {
                        discAmount = Utils.round(totalSale *
                                cursor4.getDouble(cursor4.getColumnIndex(DISCOUNT_PERCENT)) / 100, mGpManager.getRoundingDigit());
                    } else if (billOrgDiscAmount > 0) {
                        if (billOrgDiscAmount <= totalSale) {
                            discAmount = billOrgDiscAmount;
                        } else {
                            discAmount = totalSale;
                        }
                    }
                    ContentValues cv = new ContentValues();
                    cv.put(PROMOTION_UUID, cursor4.getString(cursor4.getColumnIndex(PROMOTION_UUID)));
                    cv.put(TRANSACTION_ID, transId);
                    cv.put(COMPUTER_ID, compId);
                    cv.put(ORDER_DETAIL_ID, 0);
                    cv.put(DISC_TYPE_ID, cursor4.getInt(cursor4.getColumnIndex(DISC_TYPE_ID)));
                    cv.put(BILL_DISC, cursor4.getDouble(cursor4.getColumnIndex(BILL_DISC)));
                    cv.put(PROMOTION_ID, cursor4.getInt(cursor4.getColumnIndex(PROMOTION_ID)));
                    cv.put(DISC_PRIORITY, cursor4.getInt(cursor4.getColumnIndex(DISC_PRIORITY)));
                    cv.put(DISCOUNT_PERCENT, cursor4.getDouble(cursor4.getColumnIndex(DISCOUNT_PERCENT)));
                    cv.put(DISCOUNT_PRICE, discAmount);
                    cv.put(BILL_ORG_DISC_AMOUNT, cursor4.getDouble(cursor4.getColumnIndex(BILL_ORG_DISC_AMOUNT)));
                    cv.put(MULTI_PROMO_OPTION, cursor4.getInt(cursor4.getColumnIndex(MULTI_PROMO_OPTION)));
                    cv.put(IS_CALCULATE, cursor4.getInt(cursor4.getColumnIndex(IS_CALCULATE)));
                    cv.put(PROMO_LINE_NO, cursor4.getInt(cursor4.getColumnIndex(INSERT_NO)));
                    cv.put(VOUCHER_ID, cursor4.getInt(cursor4.getColumnIndex(VOUCHER_ID)));
                    cv.put(VOUCHER_NUMBER, cursor4.getString(cursor4.getColumnIndex(VOUCHER_NUMBER)));
                    db.insert(TABLE_ORDER_PROMOTION_DETAIL_FRONT, null, cv);

                    totalSale = totalSale - discAmount;
                    cursor4.moveToNext();
                }
            }
            cursor4.close();
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }
    }

    public Transaction.OrderDetail getOrderDetail(int transId, int compId, int orderId){
        Transaction.OrderDetail orderDetail = null;
        Cursor cursor = mDbHelper.openReadable().rawQuery(
                "select a.*, b." + ProductDataSource.PRODUCT_NAME +
                        " from " + TABLE_ORDER_DETAIL_FRONT + " a " +
                        " left join " + ProductDataSource.TABLE_PRODUCTS + " b " +
                        " on a." + PRODUCT_ID + "=b." + PRODUCT_ID +
                        " where a." + TRANSACTION_ID + "=?" +
                        " and a." + COMPUTER_ID + "=?" +
                        " and a." + ORDER_DETAIL_ID + "=?",
                new String[]{
                        String.valueOf(transId),
                        String.valueOf(compId),
                        String.valueOf(orderId)
                });
        OrderDetailCursor orderCursor =
                new OrderDetailCursor(cursor);
        try {
            if (orderCursor.moveToFirst()) {
                orderDetail = orderCursor.getOrderDetail();
            }
        }finally {
            if(orderCursor != null)
                orderCursor.close();
            mDbHelper.close();
        }
        return orderDetail;
    }

    public List<Transaction.OrderDetail> listOrderDetail(int transId, int compId){
        List<Transaction.OrderDetail> orderDetailList = null;
        Cursor cursor = mDbHelper.openReadable().rawQuery(
                "select a.*, b." + ProductDataSource.PRODUCT_NAME +
                        " from " + TABLE_ORDER_DETAIL_FRONT + " a " +
                        " left join " + ProductDataSource.TABLE_PRODUCTS + " b " +
                        " on a." + PRODUCT_ID + "=b." + PRODUCT_ID +
                        " where a." + TRANSACTION_ID + "=?" +
                        " and a." + COMPUTER_ID + "=?",
                new String[]{
                        String.valueOf(transId),
                        String.valueOf(compId)
                });
        OrderDetailCursor orderCursor =
                new OrderDetailCursor(cursor);
        try {
            if (orderCursor.moveToFirst()) {
                orderDetailList = new ArrayList<Transaction.OrderDetail>();
                while (!orderCursor.isAfterLast()){
                    Transaction.OrderDetail orderDetail =
                            orderCursor.getOrderDetail();
                    orderDetailList.add(orderDetail);
                    orderCursor.moveToNext();
                }
            }
        }finally {
            if(orderCursor != null)
                orderCursor.close();
            mDbHelper.close();
        }
        return orderDetailList;
    }

    public Transaction getTransaction(int transId){
        Cursor cursor = mDbHelper.openReadable().rawQuery(
                "select * from " + TABLE_TRANSACTION_FRONT +
                        " where " + TRANSACTION_ID + "=?",
                new String[]{
                        String.valueOf(transId)
                });
        Transaction trans = null;
        if(cursor.moveToFirst()){
            trans = new Transaction();
            trans.setTransactionId(cursor.getInt(cursor.getColumnIndex(TRANSACTION_ID)));
            trans.setComputerId(cursor.getInt(cursor.getColumnIndex(COMPUTER_ID)));
            trans.setReceiptNetSale(cursor.getDouble(cursor.getColumnIndex(RECEIPT_NET_SALE)));
            trans.setTransactionVAT(cursor.getDouble(cursor.getColumnIndex(TRANSACTION_VAT)));
            trans.setTransactionVATable(cursor.getDouble(cursor.getColumnIndex(TRANSACTION_VATABLE)));
        }
        cursor.close();
        mDbHelper.close();
        return trans;
    }

    public int getCurrentTransactionId(String saleDate){
        int currTransId = 0;
        Cursor cursor = mDbHelper.openReadable().rawQuery(
                "select " + TRANSACTION_ID +
                        " from " + TABLE_TRANSACTION_FRONT +
                        " where " + TRANSACTION_STATUS_ID + "=?" +
                        " and " + SALE_DATE + "=?",
                new String[]{
                        "1",
                        saleDate
                });
        if(cursor.moveToFirst()){
            currTransId = cursor.getInt(0);
        }
        cursor.close();
        mDbHelper.close();
        return currTransId;
    }

    public void updateOrderDetail(int transId, int compId, int orderId, double qty,
                                  double totalRetailPrice, double orgTotalRetailPrice, double salePrice){
        ContentValues cv = new ContentValues();
        cv.put(TOTAL_QTY, qty);
        cv.put(TOTAL_RETAIL_PRICE, totalRetailPrice);
        cv.put(ORG_TOTAL_RETAIL_PRICE, orgTotalRetailPrice);
        cv.put(SALE_PRICE, salePrice);
        mDbHelper.openWritable().update(TABLE_ORDER_DETAIL_FRONT, cv,
                TRANSACTION_ID + "=?" +
                        " and " + COMPUTER_ID + "=?" +
                        " and " + ORDER_DETAIL_ID + "=?",
                new String[]{
                        String.valueOf(transId),
                        String.valueOf(compId),
                        String.valueOf(orderId)
                });
        mDbHelper.close();
    }

    public void deleteOrderDetail(int transId, int compId, int orderId){
        mDbHelper.openWritable().delete(TABLE_ORDER_DETAIL_FRONT,
                TRANSACTION_ID + "=?" +
                        " and " + COMPUTER_ID + "=?" +
                        " and " + ORDER_DETAIL_ID + "=?",
                new String[]{
                        String.valueOf(transId),
                        String.valueOf(compId),
                        String.valueOf(orderId)
                });
        mDbHelper.close();
    }

    /**
     * @param model
     * @return
     * @throws SQLException
     */
    public int insertOrderDetail(Transaction.OrderDetail model) throws SQLException{
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
        cv.put(START_TIME, model.getStartTime());
        cv.putNull(FINISH_TIME);
        cv.put(PRINT_STATUS, model.getPrintStatus());
        cv.put(PROCESS_ID, model.getProcessId());
        cv.put(SUBMIT_ORDER_DATE_TIME, model.getSubmitOrderDateTime());
        cv.put(COMMENT, model.getComment());
        cv.put(IS_COMMENT, model.getIsComment());
        cv.put(DELETED, model.getDeleted());
        SQLiteDatabase db = mDbHelper.openWritable();
        db.insertOrThrow(TABLE_ORDER_DETAIL_FRONT, null, cv);
        mDbHelper.close();
        return ordId;
    }

    /**
     * @param model
     * @return last transactionId | 0 if fail
     * @throws SQLException
     */
    public int insertTransaction(Transaction model) throws SQLException{
        int transId = getMaxTransId(model.getComputerId());
        String saleDate = model.getSaleDate();
        String[] dateSplit = saleDate.split("-");
        String year = dateSplit[0];
        String month = dateSplit[1];
        String day = dateSplit[2];
        ContentValues cv = new ContentValues();
        cv.put(TRANSACTION_ID, transId);
        cv.put(COMPUTER_ID, model.getComputerId());
        cv.put(TRANSACTION_UUID, UUID.randomUUID().toString());
        cv.put(OPEN_TIME, model.getOpenTime());
        cv.put(OPEN_STAFF_ID, model.getOpenStaffId());
        cv.put(SALE_MODE, model.getSaleMode());
        cv.put(NO_CUSTOMER, model.getNoCustomer());
        cv.put(DOC_TYPE, model.getDocType());
        cv.put(RECEIPT_YEAR, year);
        cv.put(RECEIPT_MONTH, month);
        cv.put(SALE_DATE, saleDate);
        cv.put(SHOP_ID, model.getShopId());
        SQLiteDatabase db = mDbHelper.openWritable();
        db.insertOrThrow(TABLE_TRANSACTION_FRONT, null, cv);
        mDbHelper.close();
        return transId;
    }

    /**
     * @param isoSaleDate
     * @return max receiptId
     */
    private int getMaxReceiptId(String isoSaleDate){
        int maxReceiptId = 0;
        SQLiteDatabase db = mDbHelper.openWritable();
        Cursor cursor = db.rawQuery(
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
        mDbHelper.close();
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
        SQLiteDatabase db = mDbHelper.openWritable();
        Cursor cursor = db.rawQuery(
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
        SQLiteDatabase db = mDbHelper.openWritable();
        Cursor cursor = db.rawQuery(
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
        SQLiteDatabase db = mDbHelper.openWritable();
        Cursor cursor = db.rawQuery(
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
            cursor = db.rawQuery(
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
     * @param compId
     * @return max transactionId
     */
    private int getMaxTransId(int compId){
        int maxTransId = 0;
        SQLiteDatabase db = mDbHelper.openWritable();
        Cursor cursor = db.rawQuery(
                "select max(" + TRANSACTION_ID + ")" +
                        " from " + TABLE_TRANSACTION_FRONT +
                        " where " + COMPUTER_ID + "=?",
                new String[]{
                        String.valueOf(compId)
                });
        if (cursor.moveToFirst()) {
            maxTransId = cursor.getInt(0);
        }
        cursor.close();
        if(maxTransId == 0){
            cursor = db.rawQuery(
                    "select max(" + TRANSACTION_ID + ")" +
                            " from " + TABLE_TRANSACTION +
                            " where " + COMPUTER_ID + "=? " +
                            " and " + TRANSACTION_STATUS_ID + "=?",
                    new String[]{
                            String.valueOf(compId),
                            String.valueOf(SUCCESS_TRANS)
                    });
            if(cursor.moveToFirst()){
                maxTransId = cursor.getInt(0);
            }
            cursor.close();
        }
        mDbHelper.close();
        return maxTransId + 1;
    }

    public static class OrderDetailCursor extends CursorWrapper{

        /**
         * Creates a cursor wrapper.
         *
         * @param cursor The underlying cursor to wrap.
         */
        public OrderDetailCursor(Cursor cursor) {
            super(cursor);
        }

        public Transaction.OrderDetail getOrderDetail(){
            if(isBeforeFirst() || isAfterLast())
                return null;
            return new Transaction.OrderDetail(
                            getInt(getColumnIndex(ORDER_DETAIL_ID)),
                            getInt(getColumnIndex(TRANSACTION_ID)),
                            getInt(getColumnIndex(COMPUTER_ID)),
                            getInt(getColumnIndex(COMPONENT_LEVEL)),
                            getInt(getColumnIndex(ORDER_DETAIL_LINK_ID)),
                            getInt(getColumnIndex(INSERT_ORDER_NO)),
                            getInt(getColumnIndex(INDENT_LEVEL)),
                            getInt(getColumnIndex(DISPLAY_ORDERING)),
                            getString(getColumnIndex(SALE_DATE)),
                            getInt(getColumnIndex(SHOP_ID)),
                            getInt(getColumnIndex(PRODUCT_ID)),
                            getInt(getColumnIndex(PRODUCT_SET_TYPE)),
                            getString(getColumnIndex(ProductDataSource.PRODUCT_NAME)),
                            getInt(getColumnIndex(ORDER_STATUS_ID)),
                            getInt(getColumnIndex(SALE_MODE)),
                            getDouble(getColumnIndex(TOTAL_QTY)),
                            getDouble(getColumnIndex(PRICE_PER_UNIT)),
                            getDouble(getColumnIndex(TOTAL_RETAIL_PRICE)),
                            getDouble(getColumnIndex(ORG_PRICE_PER_UNIT)),
                            getDouble(getColumnIndex(ORG_TOTAL_RETAIL_PRICE)),
                            getDouble(getColumnIndex(DISC_PRICE)),
                            getDouble(getColumnIndex(DISC_PERCENT)),
                            getDouble(getColumnIndex(DISC_PRICE_PERCENT)),
                            getDouble(getColumnIndex(DISC_AMOUNT)),
                            getDouble(getColumnIndex(DISC_OTHER_PERCENT)),
                            getDouble(getColumnIndex(DISC_OTHER)),
                            getDouble(getColumnIndex(TOTAL_ITEM_DISC)),
                            getDouble(getColumnIndex(SALE_PRICE)),
                            getDouble(getColumnIndex(DISC_BILL)),
                            getDouble(getColumnIndex(TOTAL_DISCOUNT)),
                            getDouble(getColumnIndex(NET_SALE)),
                            getDouble(getColumnIndex(VATABLE)),
                            getString(getColumnIndex(PRODUCT_VAT_CODE)),
                            getString(getColumnIndex(VAT_DISPLAY)),
                            getDouble(getColumnIndex(PRODUCT_VAT_PERCENT)),
                            getDouble(getColumnIndex(PRODUCT_VAT)),
                            getDouble(getColumnIndex(PRODUCT_BEFORE_VAT)),
                            getDouble(getColumnIndex(TOTAL_RETAIL_VAT)),
                            getDouble(getColumnIndex(DISC_VAT)),
                            getInt(getColumnIndex(IS_SC_BEFORE_DISC)),
                            getInt(getColumnIndex(HAS_SERVICE_CHARGE)),
                            getDouble(getColumnIndex(SC_PERCENT)),
                            getDouble(getColumnIndex(SC_AMOUNT)),
                            getDouble(getColumnIndex(SC_VAT)),
                            getDouble(getColumnIndex(SC_BEFORE_VAT)),
                            getDouble(getColumnIndex(W_VATABLE)),
                            getDouble(getColumnIndex(SCW_AMOUNT)),
                            getDouble(getColumnIndex(SCW_VAT)),
                            getDouble(getColumnIndex(SCW_BEFORE_VAT)),
                            getDouble(getColumnIndex(WEIGHT_PRICE)),
                            getDouble(getColumnIndex(WEIGHT_PRICE_VAT)),
                            getDouble(getColumnIndex(WEIGHT_BEFORE_VAT)),
                            getString(getColumnIndex(OTHER_FOOD_NAME)),
                            getInt(getColumnIndex(OTHER_PRODUCT_GROUP_ID)),
                            getInt(getColumnIndex(DISCOUNT_ALLOW)),
                            getInt(getColumnIndex(ITEM_DISC_ALLOW)),
                            getInt(getColumnIndex(LAST_TRANSACTION_ID)),
                            getInt(getColumnIndex(LAST_COMPUTER_ID)),
                            getInt(getColumnIndex(PRINTER_ID)),
                            getInt(getColumnIndex(INVENTORY_ID)),
                            getInt(getColumnIndex(ORDER_STAFF_ID)),
                            getInt(getColumnIndex(ORDER_COMPUTER_ID)),
                            getInt(getColumnIndex(ORDER_TABLE_ID)),
                            getInt(getColumnIndex(VOID_TYPE_ID)),
                            getInt(getColumnIndex(VOID_STAFF_ID)),
                            getString(getColumnIndex(VOID_DATE_TIME)),
                            getInt(getColumnIndex(VAT_TYPE)),
                            getInt(getColumnIndex(PRINT_GROUP)),
                            getInt(getColumnIndex(NO_PRINT_BILL)),
                            getInt(getColumnIndex(NO_REPRINT_ORDER)),
                            getString(getColumnIndex(START_TIME)),
                            getString(getColumnIndex(FINISH_TIME)),
                            getInt(getColumnIndex(PRINT_STATUS)),
                            getInt(getColumnIndex(PROCESS_ID)),
                            getString(getColumnIndex(SUBMIT_ORDER_DATE_TIME)),
                            getString(getColumnIndex(COMMENT)),
                            getInt(getColumnIndex(IS_COMMENT)),
                            getInt(getColumnIndex(DELETED)));
        }
    }
}
