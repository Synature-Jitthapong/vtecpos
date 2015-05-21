package com.vtec.j1tth4.vtecpos;

import android.content.Context;

import com.vtec.j1tth4.vtecpos.provider.PayDetail;
import com.vtec.j1tth4.vtecpos.provider.PaymentDataSource;
import com.vtec.j1tth4.vtecpos.provider.ProductData;
import com.vtec.j1tth4.vtecpos.provider.SaleMode;
import com.vtec.j1tth4.vtecpos.provider.SaleModeDataSource;
import com.vtec.j1tth4.vtecpos.provider.Transaction;
import com.vtec.j1tth4.vtecpos.provider.TransactionDataSource;

import java.util.List;

/**
 * Created by j1tth4 on 5/17/15 AD.
 */
public class TransactionManager {

    private int mCurrentTransId;
    private static TransactionManager sInstance = null;
    private Context mContext;
    private TransactionDataSource mTransDataSource;
    private GlobalPropertyManager mGlobalManager;
    private PaymentDataSource mPaymentDataSource;

    public static TransactionManager getInstance(Context c){
        if(sInstance == null){
            sInstance = new TransactionManager(c);
        }
        return sInstance;
    }

    private TransactionManager(Context c){
        mContext = c;
        mTransDataSource = new TransactionDataSource(mContext);
        mGlobalManager = GlobalPropertyManager.getInstance(mContext);
        mPaymentDataSource = new PaymentDataSource(mContext);
    }

    public void finalizeBill(){
        mTransDataSource.finalizeBill(mCurrentTransId, mGlobalManager.getComputerId());
        mTransDataSource.weightProductSet(mCurrentTransId, mGlobalManager.getComputerId());
        mCurrentTransId = 0;
    }

    public PayDetail getPayDetail(){
        return mPaymentDataSource.getPayDetail(mCurrentTransId, mGlobalManager.getComputerId());
    }

    public List<PayDetail> listPayDetail(){
        return mPaymentDataSource.listPayDetail(mCurrentTransId, mGlobalManager.getComputerId());
    }

    public void deletePaymentDetail(int payTypeId){
        mPaymentDataSource.deletePaymentDetail(mCurrentTransId,
                mGlobalManager.getComputerId(), payTypeId);
    }

    public void deletePaymentDetail(){
        mPaymentDataSource.deletePaymentDetail(mCurrentTransId, mGlobalManager.getComputerId());
    }

    public void insertPayDetail(PayDetail payDetail){
        payDetail.setTransactionID(mCurrentTransId);
        payDetail.setComputerID(mGlobalManager.getComputerId());
        mPaymentDataSource.insertPaymentDetail(payDetail);
    }

    public Transaction.OrderDetail getOrder(int orderId){
        return mTransDataSource.getOrderDetail(mCurrentTransId, mGlobalManager.getComputerId(), orderId);
    }

    public List<Transaction.OrderDetail> listOrder(){
        return mTransDataSource.listOrderDetail(mCurrentTransId, mGlobalManager.getComputerId());
    }

    public void updateOrder(int orderId, double unitPrice, double qty){
        double orgPricePerUnit = unitPrice;
        double totalRetailPrice = Utils.round(qty * unitPrice, mGlobalManager.getRoundingDigit());
        double orgTotalRetailPrice = Utils.round(qty * orgPricePerUnit, mGlobalManager.getRoundingDigit());
        double totalDisc = 0;
        double salePrice = totalRetailPrice - totalDisc;

        mTransDataSource.updateOrderDetail(mCurrentTransId, mGlobalManager.getComputerId(), orderId,
                qty, totalRetailPrice, orgTotalRetailPrice, salePrice);
    }

    public void deleteOrder(int orderId){
        mTransDataSource.deleteOrderDetail(mCurrentTransId, mGlobalManager.getComputerId(), orderId);
    }

    public int insertOrder(ProductData.Products product, double qty){
        Transaction.OrderDetail orderDetail = new Transaction.OrderDetail();

        double unitPrice = product.getProductPrice() == -1 ? 1 : product.getProductPrice();
        double orgPricePerUnit = unitPrice;
        double totalRetailPrice = Utils.round(qty * unitPrice, mGlobalManager.getRoundingDigit());
        double orgTotalRetailPrice = Utils.round(qty * orgPricePerUnit, mGlobalManager.getRoundingDigit());
        double totalDisc = 0;
        double salePrice = totalRetailPrice - totalDisc;
        double vatable = salePrice;

        if(product.getProductVatPercent() == 0){
            vatable = 0;
        }

        int discountAllow = product.getDiscountAllow();
        // if isComponentProduct when discountAllow = 0
        int itemDiscountAllow = discountAllow;
        int componentLevel = product.getComponentLevel();
        int isSc = mGlobalManager.getHasSc();
        SaleModeDataSource smSource = new SaleModeDataSource(mContext);
        SaleMode saleMode = smSource.getSaleMode(mGlobalManager.getSaleMode());
        if(saleMode != null){
            isSc = saleMode.getHasServiceCharge();
        }
        if(isSc == 1){
            isSc = product.getHasServiceCharge();
        }
        orderDetail.setTransactionId(mCurrentTransId);
        orderDetail.setComputerId(mGlobalManager.getComputerId());
        orderDetail.setComponentLevel(componentLevel);
        orderDetail.setOrderDetailLinkId(0);
        orderDetail.setInsertOrderNo(0);
        orderDetail.setIndentLevel(0);
        orderDetail.setDisplayOrdering(0);
        orderDetail.setSaleDate(Utils.getISODate());
        orderDetail.setShopId(mGlobalManager.getShopId());
        orderDetail.setProductId(product.getProductId());
        orderDetail.setProductSetType(product.getProductTypeId());
        orderDetail.setOrderStatusId(2);
        orderDetail.setSaleMode(mGlobalManager.getSaleMode());
        orderDetail.setTotalQty(qty);
        orderDetail.setPricePerUnit(unitPrice);
        orderDetail.setTotalRetailPrice(totalRetailPrice);
        orderDetail.setOrgPricePerUnit(orgPricePerUnit);
        orderDetail.setOrgTotalRetailPrice(orgTotalRetailPrice);
        orderDetail.setDiscPricePercent(0);
        orderDetail.setDiscPrice(0);
        orderDetail.setDiscOther(0);
        orderDetail.setTotalItemDisc(0);
        orderDetail.setSalePrice(salePrice);
        orderDetail.setProductVATCode(product.getVatCode());
        orderDetail.setVatDisplay(product.getProductVatDisplay());
        orderDetail.setProductVATPercent(product.getProductVatPercent());
        orderDetail.setVatable(vatable);
        orderDetail.setIsSCBeforeDisc(mGlobalManager.getScBeforeDisc());
        orderDetail.setHasServiceCharge(isSc);
        orderDetail.setScPercent(mGlobalManager.getScPercent());
        orderDetail.setOtherFoodName("");
//        cv.put(OTHER_PRODUCT_GROUP_ID, model.getOtherProductGroupID());
        orderDetail.setDiscountAllow(discountAllow);
        orderDetail.setItemDiscAllow(itemDiscountAllow);
//        cv.put(LAST_TRANSACTION_ID, model.getLastTransactionId());
//        cv.put(LAST_COMPUTER_ID, model.getLastComputerId());
//        cv.put(PRINTER_ID, model.getPrinterId());
//        cv.put(INVENTORY_ID, model.getInventoryId());
//        cv.put(ORDER_STAFF_ID, model.getOrderStaffId());
//        cv.put(ORDER_COMPUTER_ID, model.getOrderComputerId());
//        cv.put(ORDER_TABLE_ID, model.getOrderTableId());
//        cv.put(VOID_TYPE_ID, model.getVoidTypeId());
//        cv.put(VOID_STAFF_ID, model.getVoidStaffId());
//        cv.putNull(VOID_DATE_TIME);
          orderDetail.setVatType(product.getVatType());//cv.put(VAT_TYPE, model.getVatType());
//        cv.put(PRINT_GROUP, model.getPrintGroup());
//        cv.put(NO_PRINT_BILL, model.getNoPrintBill());
//        cv.put(NO_REPRINT_ORDER, model.getNoRePrintOrder());
//        cv.put(START_TIME, model.getStartTime());
//        cv.putNull(FINISH_TIME);
//        cv.put(PRINT_STATUS, model.getPrintStatus());
//        cv.put(PROCESS_ID, model.getProcessId());
//        cv.put(SUBMIT_ORDER_DATE_TIME, model.getSubmitOrderDateTime());
//        cv.put(COMMENT, model.getComment());
//        cv.put(IS_COMMENT, model.getIsComment());
        orderDetail.setDeleted(0);
        int orderId = mTransDataSource.insertOrderDetail(orderDetail);
        mTransDataSource.calculateBill(mCurrentTransId, mGlobalManager.getComputerId());
        return orderId;
    }

    public Transaction getTransaction(){
        TransactionDataSource dataSource = new TransactionDataSource(mContext);
        return dataSource.getTransaction(mCurrentTransId);
    }

    public void insertTransaction(){
        mCurrentTransId = mTransDataSource.getCurrentTransactionId(Utils.getISODate());
        if(mCurrentTransId == 0) {
            GlobalPropertyManager gm = GlobalPropertyManager.getInstance(mContext);
            Transaction trans = new Transaction();
            trans.setComputerId(gm.getComputerId());
            trans.setOpenTime(Utils.getISODateTime());
            trans.setOpenStaffId(gm.getStaffId());
            trans.setSaleDate(Utils.getISODate());
            trans.setShopId(gm.getShopId());
            mCurrentTransId = mTransDataSource.insertTransaction(trans);
        }
    }
}
