package com.vtec.j1tth4.vtecpos;

import android.content.Context;

import com.vtec.j1tth4.vtecpos.provider.OrderPrintJob;
import com.vtec.j1tth4.vtecpos.provider.PayDetail;
import com.vtec.j1tth4.vtecpos.provider.PaymentDataSource;
import com.vtec.j1tth4.vtecpos.provider.PrintJobDataSource;
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
        PrintJobDataSource jobDataSource = new PrintJobDataSource(mContext);
        OrderPrintJob job = new OrderPrintJob();
        job.setTransactionID(mCurrentTransId);
        job.setComputerID(mGlobalManager.getComputerId());
        job.setPrintNo(1);
        jobDataSource.insertPrintJob(job);
        mCurrentTransId = 0;
    }

    public PayDetail getPayDetail(boolean onProcess){
        return mPaymentDataSource.getPayDetail(mCurrentTransId,
                mGlobalManager.getComputerId(), onProcess);
    }

    public List<PayDetail> listPayDetail(boolean onProcess){
        return mPaymentDataSource.listPayDetail(mCurrentTransId,
                mGlobalManager.getComputerId(), onProcess);
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

    public Transaction.OrderDetail getOrder(int orderId, boolean onProcess){
        return mTransDataSource.getOrderDetail(mCurrentTransId, mGlobalManager.getComputerId(),
                orderId, onProcess);
    }

    public List<Transaction.OrderDetail> listOrder(boolean onProcess){
        return mTransDataSource.listOrderDetail(mCurrentTransId,
                mGlobalManager.getComputerId(), onProcess);
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
        orderDetail.setTransactionID(mCurrentTransId);
        orderDetail.setComputerID(mGlobalManager.getComputerId());
        orderDetail.setComponentLevel(componentLevel);
        orderDetail.setOrderDetailLinkID(0);
        orderDetail.setInsertOrderNo(0);
        orderDetail.setIndentLevel(0);
        orderDetail.setDisplayOrdering(0);
        orderDetail.setSaleDate(Utils.getISODate());
        orderDetail.setShopID(mGlobalManager.getShopId());
        orderDetail.setProductID(product.getProductId());
        orderDetail.setProductSetType(product.getProductTypeId());
        orderDetail.setOrderStatusID(2);
        orderDetail.setSaleMode(mGlobalManager.getSaleMode());
        orderDetail.setTotalQty(qty);
        orderDetail.setPricePerUnit(unitPrice);
        orderDetail.setTotalRetailPrice(totalRetailPrice);
        orderDetail.setOrgPricePerUnit(orgPricePerUnit);
        orderDetail.setOrgTotalRetailPrice(orgTotalRetailPrice);
        orderDetail.setDiscPricePercent(0.0d);
        orderDetail.setDiscPrice(0.0d);
        orderDetail.setDiscOther(0.0d);
        orderDetail.setTotalItemDisc(0.0d);
        orderDetail.setSalePrice(salePrice);
        orderDetail.setProductVATCode(product.getVatCode());
        orderDetail.setVATDisplay(product.getProductVatDisplay());
        orderDetail.setProductVATPercent(product.getProductVatPercent());
        orderDetail.setVatable(vatable);
        orderDetail.setIsSCBeforeDisc(mGlobalManager.getScBeforeDisc());
        orderDetail.setHasServiceCharge(isSc);
        orderDetail.setSCPercent(mGlobalManager.getScPercent());
        orderDetail.setOtherFoodName("");
        orderDetail.setOtherProductGroupID(0);
        orderDetail.setDiscountAllow(discountAllow);
        orderDetail.setItemDiscAllow(itemDiscountAllow);
        orderDetail.setLastTransactionID(0);
        orderDetail.setLastComputerID(0);
        orderDetail.setPrinterID(0);
        orderDetail.setInventoryID(0);
        orderDetail.setOrderStaffID(0);
        orderDetail.setOrderComputerID(mGlobalManager.getComputerId());
        orderDetail.setOrderTableID(0);
        orderDetail.setVoidTypeID(0);
        orderDetail.setVoidStaffID(0);
//        cv.putNull(VOID_DATE_TIME);
          orderDetail.setVATType(product.getVatType());//cv.put(VAT_TYPE, model.getVatType());
        orderDetail.setPrintGroup(0);
        orderDetail.setNoPrintBill(0);
        orderDetail.setNoRePrintOrder(0);
//        cv.put(START_TIME, model.getStartTime());
//        cv.putNull(FINISH_TIME);
        orderDetail.setPrintStatus(0);
        orderDetail.setProcessID(0);
        orderDetail.setSubmitOrderDateTime(Utils.getISODateTime());
        orderDetail.setComment("");
        orderDetail.setIsComment(0);
        orderDetail.setDeleted(0);
        int orderId = mTransDataSource.insertOrderDetail(orderDetail);
        mTransDataSource.calculateBill(mCurrentTransId, mGlobalManager.getComputerId());
        return orderId;
    }

    public Transaction getTransaction(boolean onProcess){
        TransactionDataSource dataSource = new TransactionDataSource(mContext);
        return dataSource.getTransaction(mCurrentTransId, onProcess);
    }

    public void insertTransaction(){
        mCurrentTransId = mTransDataSource.getCurrentTransactionId(Utils.getISODate());
        if(mCurrentTransId == 0) {
            GlobalPropertyManager gm = GlobalPropertyManager.getInstance(mContext);
            Transaction trans = new Transaction();
            trans.setComputerID(gm.getComputerId());
            trans.setOpenTime(Utils.getISODateTime());
            trans.setOpenStaffID(gm.getStaffId());
            trans.setSaleDate(Utils.getISODate());
            trans.setShopID(gm.getShopId());
            mCurrentTransId = mTransDataSource.insertTransaction(trans);
        }
    }
}
