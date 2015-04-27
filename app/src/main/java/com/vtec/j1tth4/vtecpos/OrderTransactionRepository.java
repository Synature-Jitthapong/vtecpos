package com.vtec.j1tth4.vtecpos;

import android.content.Context;
import android.database.Cursor;

import com.vtec.j1tth4.vtecpos.dao.OrderDetailDao;
import com.vtec.j1tth4.vtecpos.dao.OrderTransaction;
import com.vtec.j1tth4.vtecpos.dao.OrderTransactionDao;

import de.greenrobot.dao.query.Query;

/**
 * Created by j1tth4 on 4/27/15.
 */
public class OrderTransactionRepository {

    public static final int NEW_TRANSACTION_STATUS = 1;
    public static final int SUCCESS_TRANSACTION_STATUS = 2;
    public static final int VOID_TRANSACTION_STATUS = 99;

//    public static void insertOrderDetail(Context c, OrderDetail orderDetail){
//        sqlStatement =
//                "INSERT INTO OrderDetail" + TableExtraString + " (OrderDetailID,TransactionID,ComputerID,ComponentLevel,OrderDetailLinkID,InsertOrderNo,IndentLevel,DisplayOrdering,SaleDate,ShopID,ProductID,ProductSetType,OrderStatusID,SaleMode,TotalQty,PricePerUnit,TotalRetailPrice,OrgPricePerUnit,OrgTotalRetailPrice,DiscPricePercent,DiscPrice,DiscOther,TotalItemDisc,SalePrice,ProductVATCode,VATDisplay,ProductVATPercent,Vatable,IsSCBeforeDisc,HasServiceCharge,SCPercent,OtherFoodName,OtherProductGroupID,DiscountAllow,ItemDiscAllow,LastTransactionID,LastComputerID,PrinterID,InventoryID,OrderStaffID,OrderComputerID,OrderTableID,VoidTypeID,VoidStaffID,VoidDateTime,VATType,PrintGroup,NoPrintBill,NoRePrintOrder,StartTime,FinishTime,PrintStatus,ProcessID,SubmitOrderDateTime,Comment,IsComment,Deleted) values (" + OrderDetailID.ToString + "," + TransactionID.ToString + "," + ComputerID.ToString + "," + ComponentLevel.ToString + "," + OrderDetailLinkID.ToString + "," + InsertOrderNo.ToString + "," + IndentLevel.ToString + "," + DisplayOrdering.ToString + "," + SaleDate + "," + ShopID.ToString + "," + ProductID.ToString + "," + ProductTypeID.ToString + "," + OrderStatusID.ToString + "," + SaleMode.ToString + "," + ProductQty.ToString + "," + PricePerUnit.ToString + "," + TotalRetailPrice.ToString + "," + OrgPricePerUnit.ToString + "," + OrgTotalRetailPrice.ToString + "," + DiscPercent.ToString + "," + DiscAmount.ToString + "," + DiscOther.ToString + "," + TotalDiscount.ToString + "," + SalePrice.ToString + ",'" + Replace(ProductVATCode,"'","''") + "','" + Replace(VATDisplay,"'","''") + "'," + ProductVATPercent.ToString + "," + Vatable.ToString + "," + SCBeforeDisc.ToString + "," + IsSC.ToString + "," + SCPercent.ToString + ",'" + Replace(OtherFoodName,"'","''") + "'," + OtherProductGroupID.ToString + "," + DiscountAllow.ToString + "," + ItemDiscAllow.ToString + "," + LastTransactionID.ToString + "," + LastComputerID.ToString + ",'" + PrinterID.ToString + "'," + InventoryID.ToString + "," + OrderStaffID.ToString + "," + OrderComputerID.ToString + "," + OrderTableID.ToString + "," + VoidTypeID.ToString + "," + VoidStaffID.ToString + "," + VoidDateTime.ToString + "," + VATType.ToString + "," + PrintGroup.ToString + "," + NoPrintBill.ToString + "," + NoRePrintOrder.ToString + "," + StartTime.ToString + "," + FinishTime.ToString + "," + PrintStatus.ToString + "," + ProcessID.ToString + "," + SubmitOrderDateTime.ToString + ",'" + Replace(Comment,"'","''") + "'," + IsComment.ToString + "," + Deleted.ToString + ")"
//
//        getOrderDetailDao(c).insert(orderDetail);
//    }


//    public static List<OrderDetail> getOrders(Context c){
//        Query query = getOrderDetailDao(c).queryRawCreate();
//    }

    public static OrderTransactionRepository getOrderTransaction(Context c, String isoSaleDate){
        Query query = getOrderTransactionDao(c).queryRawCreate(
                "where " + OrderTransactionDao.Properties.SaleDate.columnName + "=?" +
                        " and " + OrderTransactionDao.Properties.TransactionStatusID + "=?",
                isoSaleDate, String.valueOf(NEW_TRANSACTION_STATUS));
        return (OrderTransactionRepository) query.unique();
    }

    public static void insertOrderTransaction(Context c, int computerId, int sessionId,
                                              int staffId, String isoSaleDate){
        int maxTransactionId = getMaxOrderTransaction(c);
        OrderTransaction trans = new OrderTransaction();
        trans.setTransactionID(maxTransactionId);
        trans.setSaleDate(isoSaleDate);
        trans.
        getOrderTransactionDao(c).insert(trans);
    }

    private static int getMaxOrderTransaction(Context c){
        int maxTransactionId = 0;
        String transIdColumn = OrderTransactionDao.Properties.TransactionID.columnName;
        Cursor cursor = getOrderTransactionDao(c)
                .getDatabase().rawQuery(
                        "select max(" + transIdColumn + ")" +
                                " from " + OrderTransactionDao.TABLENAME,
                        null);
        try {
            if(cursor.moveToFirst()){
                maxTransactionId = cursor.getInt(0);
            }
        } finally{
            if(cursor != null)
                cursor.close();
        }
        return maxTransactionId + 1;
    }

    private static OrderDetailDao getOrderDetailDao(Context c){
        return ((VtecPosApplication) c.getApplicationContext()).getDaoSession().getOrderDetailDao();
    }

    private static OrderTransactionDao getOrderTransactionDao(Context c){
        return ((VtecPosApplication) c.getApplicationContext()).getDaoSession().getOrderTransactionDao();
    }
}
