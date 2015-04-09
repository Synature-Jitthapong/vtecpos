package com.vtec.j1tth4.vtecpos;

import android.content.Context;

import com.vtec.j1tth4.vtecpos.dao.Products;
import com.vtec.j1tth4.vtecpos.dao.ProductsDao;

import java.util.List;

/**
 * Created by j1tth4 on 4/9/15.
 */
public class ProductRepository {

    public static void insert(Context c, Products products){
        getProductDao(c).insert(products);
    }

    public static List<Products> getAllProducts(Context c){
        return getProductDao(c).loadAll();
    }

    private static ProductsDao getProductDao(Context c){
        return ((VtecPosApplication) c.getApplicationContext()).getDaoSession().getProductsDao();
    }
}
