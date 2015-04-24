package com.vtec.j1tth4.vtecpos;

import android.content.Context;

import java.util.List;

import de.greenrobot.dao.query.Query;

/**
 * Created by j1tth4 on 4/23/15.
 */
public class ProductPriceRepository {

    /**
     * @param c
     * @param productId
     * @param saleMode
     * @param dateFrom
     * @param dateTo
     * @return 0 if no record
     */
    public static double getProductPrice(Context c, int productId, int saleMode,
                                               String dateFrom, String dateTo){
        double productPrice = 0;
        Query query = getProductPriceDao(c).queryRawCreate(
                "where " + ProductPriceDao.Properties.ProductID.columnName + "=? " +
                        " and " + ProductPriceDao.Properties.SaleMode.columnName + "=?" +
                        " and " + ProductPriceDao.Properties.FromDate + ">=?" +
                        " and " + ProductPriceDao.Properties.FromDate + "<=?",
                String.valueOf(productId), String.valueOf(saleMode), dateFrom, dateTo);
        List<ProductPrice> priceLst = query.list();
        if(priceLst != null && priceLst.size() > 0){
            productPrice = priceLst.get(0).getProductPrice();
        }else if(saleMode > 1){
            query = getProductPriceDao(c).queryRawCreate(
                    "where " + ProductPriceDao.Properties.ProductID.columnName + "=? " +
                            " and " + ProductPriceDao.Properties.SaleMode.columnName + "=?" +
                            " and " + ProductPriceDao.Properties.FromDate + ">=?" +
                            " and " + ProductPriceDao.Properties.FromDate + "<=?",
                    String.valueOf(productId), "1", dateFrom, dateTo);
            priceLst = query.list();
            if(priceLst != null && priceLst.size() > 0){
                productPrice = priceLst.get(0).getProductPrice();
            }
        }
        return productPrice;
    }

    private static ProductPriceDao getProductPriceDao(Context c){
        return ((VtecPosApplication) c.getApplicationContext()).getDaoSession().getProductPriceDao();
    }
}
