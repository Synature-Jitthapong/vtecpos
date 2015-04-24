package com.vtec.j1tth4.vtecpos;

import android.content.Context;

import java.util.List;

import de.greenrobot.dao.query.Query;

/**
 * Created by j1tth4 on 4/9/15.
 */
public class ProductRepository {

    public static void insert(Context c, Products products){
        getProductDao(c).insert(products);
    }

    /**
     * @param c
     * @param productId
     * @return Products object or null
     */
    public Products getProduct(Context c, int productId){
        Query query = getProductDao(c).queryRawCreate(
                "left outer join " + ProductTypeDao.TABLENAME + " t2 " +
                        " on t." + ProductsDao.Properties.ProductTypeID.columnName + "=" +
                        " t2." + ProductTypeDao.Properties.ProductTypeID.columnName +
                "left outer join " + ProductVatDao.TABLENAME + " t3 " +
                        " on t." + ProductsDao.Properties.VATCode + "=" +
                        " t3." + ProductVatDao.Properties.ProductVATCode +
                "where t." + ProductsDao.Properties.ProductID.columnName + "=?",
                String.valueOf(productId));
        return (Products) query.unique();
    }

    /**
     * @param c
     * @param productGroupId
     * @param productDeptId
     * @return
     */
    public static List<Products> getProducts(Context c, int productGroupId, int productDeptId){
        Query query = getProductDao(c).queryRawCreate(
                "where " + ProductsDao.Properties.ProductGroupID.columnName + "=?" +
                        " and " + ProductsDao.Properties.ProductDeptID.columnName + "=?" +
                        " and " + ProductsDao.Properties.Deleted.columnName + "=?",
                String.valueOf(productGroupId), String.valueOf(productDeptId), "0");
        return query.list();
    }

    public static List<Products> getAllProducts(Context c){
        return getProductDao(c).loadAll();
    }

    private static ProductComponentDao getProductComponentDao(Context c){
        return ((VtecPosApplication) c.getApplicationContext()).getDaoSession().getProductComponentDao();
    }

    private static ProductsDao getProductDao(Context c){
        return ((VtecPosApplication) c.getApplicationContext()).getDaoSession().getProductsDao();
    }

    private static ProductVatDao getProductVatDao(Context c){
        return ((VtecPosApplication) c.getApplicationContext()).getDaoSession().getProductVatDao();
    }
}
