package com.vtec.j1tth4.vtecpos.provider;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by j1tth4 on 5/20/15.
 */
public class PaymentDataSource {
    public static final String TABLE_PAY_TYPE = "PayType";

    public static final String TABLE_ORDER_PAY_DETAIL = "OrderPayDetail";
    public static final String TABLE_ORDER_PAY_DETAIL_FRONT = "OrderPayDetailFront";

    public static final String PAY_TYPE_ID = "PayTypeID";
    public static final String PAY_TYPE_NAME = "PayTypeName";
    public static final String PAY_TYPE_CODE = "PayTypeCode";
    public static final String DISPLAY_NAME = "DisplayName";
    public static final String IS_AVAILABLE = "IsAvailable";
    public static final String SET_DEFAULT = "SetDefault";
    public static final String CONVERT_PAY_TYPE_TO = "ConvertPayTypeTo";
    public static final String IS_DSP_NAME_ORIGINAL_PAY_TYPE = "IsDisplayNameByOriginalPayType";
    public static final String EDC_TYPE = "EDCType";
    public static final String IS_SALE = "IsSale";
    public static final String IS_VAT = "IsVAT";
    public static final String IS_OTHER_RECEIPT = "IsOtherReceipt";
    public static final String IS_PRINT_OTHER_RECEIPT = "IsPrintOtherReceipt";
    public static final String IS_PREPAID = "IsPrepaid";
    public static final String PREPAID_DISCOUNT_PERCENT = "PrepaidDiscountPercent";
    public static final String PERCENT_REVENUE = "PercentRevenue";
    public static final String DEFAULT_PAY_PRICE = "DefaultPayPrice";
    public static final String MINIMUM_CAN_PAY_PRICE = "MinimumCanPayPrice";
    public static final String MAXIMUM_CAN_PAY_PRICE = "MaximumCanPayPrice";
    public static final String PAY_TYPE_GROUP_ID = "PayTypeGroupID";
    public static final String IS_REQUIRE = "IsRequire";
    public static final String IS_FIX_PRICE = "IsFixPrice";
    public static final String IS_OPEN_DRAWER = "IsOpenDrawer";
    public static final String IS_VOID_FROM_EDC = "IsVoidFromEDC";
    public static final String MAX_NO_PAY_IN_TRANS = "MaxNoPayInTransaction";
    public static final String NO_PRINT_RECEIPT_COPY = "NoPrintReceiptCopy";
    public static final String PRINT_SIGNATURE_IN_RECEIPT = "PrintSignatureInReceipt";
    public static final String NO_ROUNDING_PAYMENT = "NoRoundingPayment";
    public static final String PAY_TYPE_FUNCTION = "PayTypeFunction";
    public static final String PAY_TYPE_PROPERTY = "PayTypeProperty";
    public static final String CAN_EDIT_DELETE_PAYMENT_IN_MULTIPLE = "CanEditDeletePaymentInMultiple";
    public static final String INCLUDE_IN_MULTIPLE_PAYMENT = "IncludeInMultiplePayment";
    public static final String NO_CHECK_SAME_PAYMENT_DETAIL = "NotCheckSamePaymentDetail";
    public static final String DEFAULT_CREDIT_CARD_TYPE = "DefaultCreditCardType";
    public static final String DEFAULT_BANK_NAME = "DefaultBankName";
    public static final String PAY_TYPE_ORDERING = "PayTypeOrdering";

    public static final String PAY_DETAIL_ID = "PayDetailID";
    public static final String PAY_AMOUNT = "PayAmount";
    public static final String CASH_CHANGE = "CashChange";
    public static final String CREDIT_CARD_NO = "CreditCardNo";
    public static final String EXPIRE_MONTH = "ExpireMonth";
    public static final String EXPIRE_YEAR = "ExpireYear";
    public static final String CHEQUE_NUMBER = "ChequeNumber";
    public static final String CHEQUE_DATE = "ChequeDate";
    public static final String BANK_NAME = "BankName";
    public static final String CREDIT_CARD_TYPE = "CreditCardType";
    public static final String PAID_BY_NAME = "PaidByName";
    public static final String PAID = "Paid";
    public static final String CARD_ID = "CardID";
    public static final String CARD_NO = "CardNo";
    public static final String REVENUE_RATIO = "RevenueRatio";
    public static final String IS_FROM_EDC = "IsFromEDC";
    public static final String CURRENCY_CODE = "CurrencyCode";
    public static final String CURRENCY_NAME = "CurrencyName";
    public static final String MAIN_CURRENCY_RATIO = "MainCurrencyRatio";
    public static final String CURRENCY_RATIO = "CurrencyRatio";
    public static final String CURRENCY_AMOUNT = "CurrencyAmount";
    public static final String DELETED = "Deleted";

    private DatabaseHelper mDbHelper;

    public PaymentDataSource(Context c){
        mDbHelper = DatabaseHelper.getInstance(c);
    }

    /**
     *
     * @param transId
     * @param compId
     * @return
     */
    public List<PayDetail> listPayDetail(int transId, int compId){
        Cursor cursor = mDbHelper.openReadable().rawQuery(
                "select a." + PAY_TYPE_ID + ", b." + PAY_TYPE_CODE + ", " +
                        " sum(a." + PAY_AMOUNT + ") as " + PAY_AMOUNT + ", " +
                        " sum(a." + PAID + ") as " + PAID + ", " +
                        " b." + PAY_TYPE_CODE + ", " +
                        " b." + PAY_TYPE_NAME +
                        " from " + TABLE_ORDER_PAY_DETAIL_FRONT + " a " +
                        " left join " + TABLE_PAY_TYPE + " b " +
                        " on a." + PAY_TYPE_ID + "=b." + PAY_TYPE_ID +
                        " where a." + TransactionDataSource.TRANSACTION_ID + "=?" +
                        " and a." + TransactionDataSource.COMPUTER_ID + "=?" +
                        " group by a." + PAY_TYPE_ID,
                new String[]{
                        String.valueOf(transId),
                        String.valueOf(compId)
                });
        List<PayDetail> payDetailList = null;
        if(cursor.moveToFirst()){
            payDetailList = new ArrayList<>();
            while(!cursor.isAfterLast()) {
                PayDetail payDetail = new PayDetail();
                payDetail = new PayDetail();
                payDetail.setPayTypeID(cursor.getInt(cursor.getColumnIndex(PAY_TYPE_ID)));
                payDetail.setPaid(cursor.getDouble(cursor.getColumnIndex(PAID)));
                payDetail.setPayAmount(cursor.getDouble(cursor.getColumnIndex(PAY_AMOUNT)));
                payDetail.setPayTypeCode(cursor.getString(cursor.getColumnIndex(PAY_TYPE_CODE)));
                payDetail.setPayTypeName(cursor.getString(cursor.getColumnIndex(PAY_TYPE_NAME)));
                payDetailList.add(payDetail);
                cursor.moveToNext();
            }
        }
        cursor.close();
        mDbHelper.close();
        return payDetailList;
    }

    /**
     *
     * @param transId
     * @param compId
     * @return
     */
    public PayDetail getPayDetail(int transId, int compId){
        Cursor cursor = mDbHelper.openReadable().rawQuery(
                "select sum(" + PAY_AMOUNT +") as " + PAY_AMOUNT + ", " +
                        " sum(" + PAID + ") as " + PAID +
                        " from " + TABLE_ORDER_PAY_DETAIL_FRONT +
                        " where " + TransactionDataSource.TRANSACTION_ID + "=?" +
                        " and " + TransactionDataSource.COMPUTER_ID + "=?",
                new String[]{
                        String.valueOf(transId),
                        String.valueOf(compId)
                });
        PayDetail payDetail = null;
        if(cursor.moveToFirst()){
            payDetail = new PayDetail();
            payDetail.setPaid(cursor.getDouble(cursor.getColumnIndex(PAID)));
            payDetail.setPayAmount(cursor.getDouble(cursor.getColumnIndex(PAY_AMOUNT)));
        }
        cursor.close();
        mDbHelper.close();
        return payDetail;
    }

    /**
     *
     * @param transId
     * @param compId
     * @param payTypeId
     */
    public void deletePaymentDetail(int transId, int compId, int payTypeId) {
        mDbHelper.openWritable().delete(TABLE_ORDER_PAY_DETAIL_FRONT,
                TransactionDataSource.TRANSACTION_ID + "=?" +
                        " and " + TransactionDataSource.COMPUTER_ID + "=?" +
                        " and " + PAY_TYPE_ID + "=?",
                new String[]{
                        String.valueOf(transId),
                        String.valueOf(compId),
                        String.valueOf(payTypeId)
                });
    }

    /**
     *
     * @param transId
     * @param compId
     */
    public void deletePaymentDetail(int transId, int compId) {
        mDbHelper.openWritable().delete(TABLE_ORDER_PAY_DETAIL_FRONT,
                TransactionDataSource.TRANSACTION_ID + "=?" +
                        " and " + TransactionDataSource.COMPUTER_ID + "=?",
                new String[]{
                        String.valueOf(transId),
                        String.valueOf(compId)
                });
    }

    /**
     *
     * @param payDetail
     * @return max payDetailId
     */
    public int insertPaymentDetail(PayDetail payDetail){
        int maxPayId = getMaxPayDetailId(payDetail.getTransactionID(), payDetail.getComputerID());
        ContentValues cv = new ContentValues();
        cv.put(PAY_DETAIL_ID, maxPayId);
        cv.put(TransactionDataSource.TRANSACTION_ID, payDetail.getTransactionID());
        cv.put(TransactionDataSource.COMPUTER_ID, payDetail.getComputerID());
        cv.put(PAY_TYPE_ID, payDetail.getPayTypeID());
        cv.put(PAY_AMOUNT, payDetail.getPayAmount());
        cv.put(CASH_CHANGE, payDetail.getCashChange());
        cv.put(CREDIT_CARD_NO, payDetail.getCreditCardNo());
        cv.put(EXPIRE_MONTH, payDetail.getExpireMonth());
        cv.put(EXPIRE_YEAR, payDetail.getExpireYear());
        cv.put(CHEQUE_NUMBER, payDetail.getChequeNumber());
        cv.put(CHEQUE_DATE, payDetail.getChequeDate());
        cv.put(BANK_NAME, payDetail.getBankName());
        cv.put(CREDIT_CARD_TYPE, payDetail.getCreditCardType());
        cv.put(PAID_BY_NAME, payDetail.getPaidByName());
        cv.put(PAID, payDetail.getPaid());
        cv.put(CARD_ID, payDetail.getCardID());
        cv.put(CARD_NO, payDetail.getCardNo());
        cv.put(PREPAID_DISCOUNT_PERCENT, payDetail.getPrepaidDiscountPercent());
        cv.put(REVENUE_RATIO, payDetail.getRevenueRatio());
        cv.put(IS_FROM_EDC, payDetail.getIsFromEDC());
        cv.put(CURRENCY_CODE, payDetail.getCurrencyCode());
        cv.put(CURRENCY_NAME, payDetail.getCurrencyName());
        cv.put(MAIN_CURRENCY_RATIO, payDetail.getMainCurrencyRatio());
        cv.put(CURRENCY_RATIO, payDetail.getCurrencyRatio());
        cv.put(CURRENCY_AMOUNT, payDetail.getCurrencyAmount());
        mDbHelper.openWritable().insertOrThrow(TABLE_ORDER_PAY_DETAIL_FRONT, null, cv);
        return maxPayId;
    }

    /**
     *
     * @param transId
     * @param compId
     * @return
     */
    private int getMaxPayDetailId(int transId, int compId){
        int maxPayDetailId = 0;
        SQLiteDatabase db = mDbHelper.openWritable();
        String[] whereArgs = {
                String.valueOf(transId),
                String.valueOf(compId)
        };
        Cursor cursor = db.rawQuery(
                "select max(" + PAY_DETAIL_ID + ")" +
                        " from " + TABLE_ORDER_PAY_DETAIL_FRONT +
                        " where " + TransactionDataSource.TRANSACTION_ID + "=?" +
                        " and " + TransactionDataSource.COMPUTER_ID + "=?", whereArgs);
        if (cursor.moveToFirst()) {
            maxPayDetailId = cursor.getInt(0);
        }
        cursor.close();
        if(maxPayDetailId == 0){
            cursor = db.rawQuery(
                    "select max(" + PAY_DETAIL_ID + ")" +
                            " from " + TABLE_ORDER_PAY_DETAIL +
                            " where " + TransactionDataSource.TRANSACTION_ID + "=?" +
                            " and " + TransactionDataSource.COMPUTER_ID + "=?", whereArgs);
            if(cursor.moveToFirst()){
                maxPayDetailId = cursor.getInt(0);
            }
            cursor.close();
        }
        mDbHelper.close();
        return maxPayDetailId + 1;
    }
}
