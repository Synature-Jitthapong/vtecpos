package com.vtec.j1tth4.vtecpos.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.vtec.j1tth4.vtecpos.dao.ProductPriceGroupData;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ProductPriceGroupData.
*/
public class ProductPriceGroupDataDao extends AbstractDao<ProductPriceGroupData, Void> {

    public static final String TABLENAME = "ProductPriceGroupData";

    /**
     * Properties of entity ProductPriceGroupData.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property PriceGroupDateID = new Property(0, Integer.class, "PriceGroupDateID", true, "PriceGroupDateID");
        public final static Property PriceGroupID = new Property(1, Integer.class, "PriceGroupID", true, "PriceGroupID");
        public final static Property ProductPriceID = new Property(2, Integer.class, "ProductPriceID", true, "ProductPriceID");
        public final static Property ProductID = new Property(3, Integer.class, "ProductID", false, "ProductID");
        public final static Property ProductPrice = new Property(4, Double.class, "ProductPrice", false, "ProductPrice");
        public final static Property PrepaidPrice = new Property(5, Double.class, "PrepaidPrice", false, "PrepaidPrice");
        public final static Property MainPrice = new Property(6, Double.class, "MainPrice", false, "MainPrice");
        public final static Property SaleMode = new Property(7, Integer.class, "SaleMode", false, "SaleMode");
        public final static Property PriceRemark = new Property(8, String.class, "PriceRemark", false, "PriceRemark");
        public final static Property AddingFromBranch = new Property(9, Integer.class, "AddingFromBranch", false, "AddingFromBranch");
    };


    public ProductPriceGroupDataDao(DaoConfig config) {
        super(config);
    }
    
    public ProductPriceGroupDataDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ProductPriceGroupData entity) {
        stmt.clearBindings();
 
        Integer PriceGroupDateID = entity.getPriceGroupDateID();
        if (PriceGroupDateID != null) {
            stmt.bindLong(1, PriceGroupDateID);
        }
 
        Integer PriceGroupID = entity.getPriceGroupID();
        if (PriceGroupID != null) {
            stmt.bindLong(2, PriceGroupID);
        }
 
        Integer ProductPriceID = entity.getProductPriceID();
        if (ProductPriceID != null) {
            stmt.bindLong(3, ProductPriceID);
        }
 
        Integer ProductID = entity.getProductID();
        if (ProductID != null) {
            stmt.bindLong(4, ProductID);
        }
 
        Double ProductPrice = entity.getProductPrice();
        if (ProductPrice != null) {
            stmt.bindDouble(5, ProductPrice);
        }
 
        Double PrepaidPrice = entity.getPrepaidPrice();
        if (PrepaidPrice != null) {
            stmt.bindDouble(6, PrepaidPrice);
        }
 
        Double MainPrice = entity.getMainPrice();
        if (MainPrice != null) {
            stmt.bindDouble(7, MainPrice);
        }
 
        Integer SaleMode = entity.getSaleMode();
        if (SaleMode != null) {
            stmt.bindLong(8, SaleMode);
        }
 
        String PriceRemark = entity.getPriceRemark();
        if (PriceRemark != null) {
            stmt.bindString(9, PriceRemark);
        }
 
        Integer AddingFromBranch = entity.getAddingFromBranch();
        if (AddingFromBranch != null) {
            stmt.bindLong(10, AddingFromBranch);
        }
    }

    /** @inheritdoc */
    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    /** @inheritdoc */
    @Override
    public ProductPriceGroupData readEntity(Cursor cursor, int offset) {
        ProductPriceGroupData entity = new ProductPriceGroupData( //
            cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0), // PriceGroupDateID
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // PriceGroupID
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // ProductPriceID
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // ProductID
            cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4), // ProductPrice
            cursor.isNull(offset + 5) ? null : cursor.getDouble(offset + 5), // PrepaidPrice
            cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6), // MainPrice
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // SaleMode
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // PriceRemark
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9) // AddingFromBranch
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ProductPriceGroupData entity, int offset) {
        entity.setPriceGroupDateID(cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0));
        entity.setPriceGroupID(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setProductPriceID(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setProductID(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setProductPrice(cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4));
        entity.setPrepaidPrice(cursor.isNull(offset + 5) ? null : cursor.getDouble(offset + 5));
        entity.setMainPrice(cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6));
        entity.setSaleMode(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setPriceRemark(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setAddingFromBranch(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
     }
    
    /** @inheritdoc */
    @Override
    protected Void updateKeyAfterInsert(ProductPriceGroupData entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    /** @inheritdoc */
    @Override
    public Void getKey(ProductPriceGroupData entity) {
        return null;
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
