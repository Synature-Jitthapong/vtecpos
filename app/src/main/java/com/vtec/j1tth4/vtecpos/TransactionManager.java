package com.vtec.j1tth4.vtecpos;

import android.content.Context;

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

    public void updateOrder(int orderId, double unitPrice, double qty){
        TransactionDataSource dataSource =
                new TransactionDataSource(mContext);
        GlobalPropertyManager gm = GlobalPropertyManager.getInstance(mContext);

        double orgPricePerUnit = unitPrice;
        double totalRetailPrice = Utils.round(qty * unitPrice, gm.getRoundingDigit());
        double orgTotalRetailPrice = Utils.round(qty * orgPricePerUnit, gm.getRoundingDigit());
        double totalDisc = 0;
        double salePrice = totalRetailPrice - totalDisc;

        dataSource.updateOrderDetail(currentTransId, gm.getComputerId(), orderId,
                qty, totalRetailPrice, orgTotalRetailPrice, salePrice);
    }

    public void deleteOrder(int orderId){
        TransactionDataSource dataSource =
                new TransactionDataSource(mContext);
        GlobalPropertyManager gm = GlobalPropertyManager.getInstance(mContext);
        dataSource.deleteOrderDetail(currentTransId, gm.getComputerId(), orderId);
    }

    public int insertOrder(ProductData.Products product, double qty){
        TransactionDataSource dataSource = new TransactionDataSource(mContext);
        GlobalPropertyManager gm = GlobalPropertyManager.getInstance(mContext);
        Transaction.OrderDetail orderDetail = new Transaction.OrderDetail();

        double orgPricePerUnit = product.getProductPrice();
        double totalRetailPrice = Utils.round(qty * product.getProductPrice(), gm.getRoundingDigit());
        double orgTotalRetailPrice = Utils.round(qty * orgPricePerUnit, gm.getRoundingDigit());
        double totalDisc = 0;
        double salePrice = totalRetailPrice - totalDisc;
        int componentLevel = product.getComponentLevel();
        int isSc = gm.getHasSc();
        SaleModeDataSource smSource = new SaleModeDataSource(mContext);
        SaleMode saleMode = smSource.getSaleMode(gm.getSaleMode());
        if(saleMode != null){
            isSc = saleMode.getHasServiceCharge();
        }
        if(isSc == 1){
            isSc = product.getHasServiceCharge();
        }
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
        orderDetail.setOrderStatusId(2);
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
        orderDetail.setIsSCBeforeDisc(gm.scBeforeDisc());
        orderDetail.setHasServiceCharge(isSc);
        orderDetail.setScPercent(gm.getScPercent());
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
//        cv.put(DELETED, model.getDeleted());
        //sqlStatement = "INSERT INTO OrderDetail" + TableExtraString + " (OrderDetailID,TransactionID,ComputerID,ComponentLevel,OrderDetailLinkID,InsertOrderNo,IndentLevel,DisplayOrdering,SaleDate,ShopID,ProductID,ProductSetType,OrderStatusID,SaleMode,TotalQty,PricePerUnit,TotalRetailPrice,OrgPricePerUnit,OrgTotalRetailPrice,DiscPricePercent,DiscPrice,DiscOther,TotalItemDisc,SalePrice,ProductVATCode,VATDisplay,ProductVATPercent,Vatable,IsSCBeforeDisc,HasServiceCharge,SCPercent,OtherFoodName,OtherProductGroupID,DiscountAllow,ItemDiscAllow,LastTransactionID,LastComputerID,PrinterID,InventoryID,OrderStaffID,OrderComputerID,OrderTableID,VoidTypeID,VoidStaffID,VoidDateTime,VATType,PrintGroup,NoPrintBill,NoRePrintOrder,StartTime,FinishTime,PrintStatus,ProcessID,SubmitOrderDateTime,Comment,IsComment,Deleted) values (" + OrderDetailID.ToString + "," + TransactionID.ToString + "," + ComputerID.ToString + "," + ComponentLevel.ToString + "," + OrderDetailLinkID.ToString + "," + InsertOrderNo.ToString + "," + IndentLevel.ToString + "," + DisplayOrdering.ToString + "," + SaleDate + "," + ShopID.ToString + "," + ProductID.ToString + "," + ProductTypeID.ToString + "," + OrderStatusID.ToString + "," + SaleMode.ToString + "," + ProductQty.ToString + "," + PricePerUnit.ToString + "," + TotalRetailPrice.ToString + "," + OrgPricePerUnit.ToString + "," + OrgTotalRetailPrice.ToString + "," + DiscPercent.ToString + "," + DiscAmount.ToString + "," + DiscOther.ToString + "," + TotalDiscount.ToString + "," + SalePrice.ToString + ",'" + Replace(ProductVATCode,"'","''") + "','" + Replace(VATDisplay,"'","''") + "'," + ProductVATPercent.ToString + "," + Vatable.ToString + "," + SCBeforeDisc.ToString + "," + IsSC.ToString + "," + SCPercent.ToString + ",'" + Replace(OtherFoodName,"'","''") + "'," + OtherProductGroupID.ToString + "," + DiscountAllow.ToString + "," + ItemDiscAllow.ToString + "," + LastTransactionID.ToString + "," + LastComputerID.ToString + ",'" + PrinterID.ToString + "'," + InventoryID.ToString + "," + OrderStaffID.ToString + "," + OrderComputerID.ToString + "," + OrderTableID.ToString + "," + VoidTypeID.ToString + "," + VoidStaffID.ToString + "," + VoidDateTime.ToString + "," + VATType.ToString + "," + PrintGroup.ToString + "," + NoPrintBill.ToString + "," + NoRePrintOrder.ToString + "," + StartTime.ToString + "," + FinishTime.ToString + "," + PrintStatus.ToString + "," + ProcessID.ToString + "," + SubmitOrderDateTime.ToString + ",'" + Replace(Comment,"'","''") + "'," + IsComment.ToString + "," + Deleted.ToString + ")"
        int orderId = dataSource.insertOrderDetail(orderDetail);
        dataSource.calculateBill(currentTransId, gm.getComputerId());
        return orderId;
    }

    public void insertTransaction(){
        TransactionDataSource dataSource =
                new TransactionDataSource(mContext);
        currentTransId = dataSource.getCurrentTransactionId(Utils.getISODate());
        if(currentTransId == 0) {
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
