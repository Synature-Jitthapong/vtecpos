package com.vtec.j1tth4.vtecpos.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.vtec.j1tth4.vtecpos.dao.ProductCategory;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ProductCategory.
*/
public class ProductCategoryDao extends AbstractDao<ProductCategory, Integer> {

    public static final String TABLENAME = "ProductCategory";

    /**
     * Properties of entity ProductCategory.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property ProductCatID = new Property(0, Integer.class, "ProductCatID", true, "ProductCatID");
        public final static Property ShopID = new Property(1, Integer.class, "ShopID", false, "ShopID");
        public final static Property ProductCatTypeID = new Property(2, Integer.class, "ProductCatTypeID", false, "ProductCatTypeID");
        public final static Property ProductCatCode = new Property(3, String.class, "ProductCatCode", false, "ProductCatCode");
        public final static Property ProductCatName = new Property(4, String.class, "ProductCatName", false, "ProductCatName");
        public final static Property ProductCatDisplay = new Property(5, Integer.class, "ProductCatDisplay", false, "ProductCatDisplay");
        public final static Property ProductCatActivate = new Property(6, Integer.class, "ProductCatActivate", false, "ProductCatActivate");
        public final static Property ProductCatOrdering = new Property(7, Integer.class, "ProductCatOrdering", false, "ProductCatOrdering");
        public final static Property Deleted = new Property(8, Integer.class, "Deleted", false, "Deleted");
        public final static Property IsComment = new Property(9, Integer.class, "IsComment", false, "IsComment");
        public final static Property AddingFromBranch = new Property(10, Integer.class, "AddingFromBranch", false, "AddingFromBranch");
    };


    public ProductCategoryDao(DaoConfig config) {
        super(config);
    }
    
    public ProductCategoryDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ProductCategory entity) {
        stmt.clearBindings();
 
        Integer ProductCatID = entity.getProductCatID();
        if (ProductCatID != null) {
            stmt.bindLong(1, ProductCatID);
        }
 
        Integer ShopID = entity.getShopID();
        if (ShopID != null) {
            stmt.bindLong(2, ShopID);
        }
 
        Integer ProductCatTypeID = entity.getProductCatTypeID();
        if (ProductCatTypeID != null) {
            stmt.bindLong(3, ProductCatTypeID);
        }
 
        String ProductCatCode = entity.getProductCatCode();
        if (ProductCatCode != null) {
            stmt.bindString(4, ProductCatCode);
        }
 
        String ProductCatName = entity.getProductCatName();
        if (ProductCatName != null) {
            stmt.bindString(5, ProductCatName);
        }
 
        Integer ProductCatDisplay = entity.getProductCatDisplay();
        if (ProductCatDisplay != null) {
            stmt.bindLong(6, ProductCatDisplay);
        }
 
        Integer ProductCatActivate = entity.getProductCatActivate();
        if (ProductCatActivate != null) {
            stmt.bindLong(7, ProductCatActivate);
        }
 
        Integer ProductCatOrdering = entity.getProductCatOrdering();
        if (ProductCatOrdering != null) {
            stmt.bindLong(8, ProductCatOrdering);
        }
 
        Integer Deleted = entity.getDeleted();
        if (Deleted != null) {
            stmt.bindLong(9, Deleted);
        }
 
        Integer IsComment = entity.getIsComment();
        if (IsComment != null) {
            stmt.bindLong(10, IsComment);
        }
 
        Integer AddingFromBranch = entity.getAddingFromBranch();
        if (AddingFromBranch != null) {
            stmt.bindLong(11, AddingFromBranch);
        }
    }

    /** @inheritdoc */
    @Override
    public Integer readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public ProductCategory readEntity(Cursor cursor, int offset) {
        ProductCategory entity = new ProductCategory( //
            cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0), // ProductCatID
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // ShopID
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // ProductCatTypeID
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // ProductCatCode
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // ProductCatName
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // ProductCatDisplay
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // ProductCatActivate
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // ProductCatOrdering
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // Deleted
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // IsComment
            cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10) // AddingFromBranch
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ProductCategory entity, int offset) {
        entity.setProductCatID(cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0));
        entity.setShopID(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setProductCatTypeID(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setProductCatCode(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setProductCatName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setProductCatDisplay(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setProductCatActivate(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setProductCatOrdering(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setDeleted(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setIsComment(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setAddingFromBranch(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
     }
    
    /** @inheritdoc */
    @Override
    protected Integer updateKeyAfterInsert(ProductCategory entity, long rowId) {
        return entity.getProductCatID();
    }
    
    /** @inheritdoc */
    @Override
    public Integer getKey(ProductCategory entity) {
        if(entity != null) {
            return entity.getProductCatID();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
