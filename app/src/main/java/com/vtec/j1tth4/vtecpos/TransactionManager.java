package com.vtec.j1tth4.vtecpos;

import android.content.Context;

import com.vtec.j1tth4.vtecpos.provider.ProductData;
import com.vtec.j1tth4.vtecpos.provider.Transaction;
import com.vtec.j1tth4.vtecpos.provider.TransactionDataSource;

import java.util.List;

/**
 * Created by j1tth4 on 5/17/15 AD.
 */
public class TransactionManager {

    private int currentTransId;
    private static TransactionManager sInstance = null;
    private Context mContext;

    public static TransactionManager getInstance(Context c){
        if(sInstance == null){
            sInstance = new TransactionManager(c);
        }
        return sInstance;
    }

    private TransactionManager(Context c){
        mContext = c;
    }

    public Transaction.OrderDetail getOrder(int orderId){
        TransactionDataSource dataSource =
                new TransactionDataSource(mContext);
        GlobalPropertyManager gm = GlobalPropertyManager.getInstance(mContext);
        return dataSource.getOrderDetail(currentTransId, gm.getComputerId(), orderId);
    }

    public List<Transaction.OrderDetail> listOrder(){
        TransactionDataSource dataSource =
                new TransactionDataSource(mContext);
        GlobalPropertyManager gm = GlobalPropertyManager.getInstance(mContext);
        return dataSource.listOrderDetail(currentTransId, gm.getComputerId());
    }

    public int insertOrder(ProductData.Products product, double qty){
        TransactionDataSource dataSource =
                new TransactionDataSource(mContext);
        GlobalPropertyManager gm = GlobalPropertyManager.getInstance(mContext);
        Transaction.OrderDetail orderDetail =
                new Transaction.OrderDetail();
        int componentLevel = 0;
        double orgPricePerUnit = product.getProductPrice();
        double totalRetailPrice = Utils.round(qty * product.getProductPrice(), gm.getRoundingDigit());
        double orgTotalRetailPrice = Utils.round(qty * orgPricePerUnit, gm.getRoundingDigit());
        double totalDisc = 0;
        double salePrice = totalRetailPrice - totalDisc;
        orderDetail.setTransactionId(currentTransId);
        orderDetail.setComputerId(gm.getComputerId());
        orderDetail.setComponentLevel(componentLevel);
        orderDetail.setOrderDetailLinkId(0);
        orderDetail.setInsertOrderNo(0);
        orderDetail.setIndentLevel(0);
        orderDetail.setDisplayOrdering(0);
        orderDetail.setSaleDate(Utils.getISODate());
        orderDetail.setShopId(gm.getShopId());
        orderDetail.setProductId(product.getProductId());
        orderDetail.setProductSetType(product.getProductTypeId());
        orderDetail.setOrderStatusId(1);
        orderDetail.setSaleMode(1);
        orderDetail.setTotalQty(1);
        orderDetail.setPricePerUnit(product.getProductPrice());
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
//        cv.put(VATABLE, model.getVatable());
//        cv.put(IS_SC_BEFORE_DISC, model.getIsSCBeforeDisc());
//        cv.put(HAS_SERVICE_CHARGE, model.getHasServiceCharge());
//        cv.put(SC_PERCENT, model.getScPercent());
        orderDetail.setOtherFoodName("");
//        cv.put(OTHER_PRODUCT_GROUP_ID, model.getOtherProductGroupID());
//        cv.put(DISCOUNT_ALLOW, model.getDiscountAllow());
//        cv.put(ITEM_DISC_ALLOW, model.getItemDiscAllow());
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
//        cv.put(VAT_TYPE, model.getVatType());
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
//        cv.put(DELETED, model.getDeleted());
        return dataSource.insertOrderDetail(orderDetail);
    }

    public void insertTransaction(){
        if(currentTransId == 0) {
            TransactionDataSource dataSource =
                    new TransactionDataSource(mContext);
            GlobalPropertyManager gm = GlobalPropertyManager.getInstance(mContext);
            Transaction trans = new Transaction();
            trans.setComputerId(gm.getComputerId());
            trans.setOpenTime(Utils.getISODateTime());
            trans.setOpenStaffId(gm.getStaffId());
            trans.setSaleDate(Utils.getISODate());
            trans.setShopId(gm.getShopId());
            currentTransId = dataSource.insertTransaction(trans);
        }
    }
}
