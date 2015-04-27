package com.vtec.j1tth4.vtecpos.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.vtec.j1tth4.vtecpos.dao.ProductComponentGroup;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ProductComponentGroup.
*/
public class ProductComponentGroupDao extends AbstractDao<ProductComponentGroup, Integer> {

    public static final String TABLENAME = "ProductComponentGroup";

    /**
     * Properties of entity ProductComponentGroup.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property PGroupID = new Property(0, Integer.class, "PGroupID", true, "PGroupID");
        public final static Property ProductID = new Property(1, Integer.class, "ProductID", false, "ProductID");
        public final static Property SaleMode = new Property(2, Integer.class, "SaleMode", false, "SaleMode");
        public final static Property StartDate = new Property(3, String.class, "StartDate", false, "StartDate");
        public final static Property EndDate = new Property(4, String.class, "EndDate", false, "EndDate");
        public final static Property SetGroupNo = new Property(5, Integer.class, "SetGroupNo", false, "SetGroupNo");
        public final static Property SetGroupName = new Property(6, String.class, "SetGroupName", false, "SetGroupName");
        public final static Property RequireAddAmountForProduct = new Property(7, Integer.class, "RequireAddAmountForProduct", false, "RequireAddAmountForProduct");
        public final static Property AddingFromBranch = new Property(8, Integer.class, "AddingFromBranch", false, "AddingFromBranch");
    };


    public ProductComponentGroupDao(DaoConfig config) {
        super(config);
    }
    
    public ProductComponentGroupDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ProductComponentGroup entity) {
        stmt.clearBindings();
 
        Integer PGroupID = entity.getPGroupID();
        if (PGroupID != null) {
            stmt.bindLong(1, PGroupID);
        }
 
        Integer ProductID = entity.getProductID();
        if (ProductID != null) {
            stmt.bindLong(2, ProductID);
        }
 
        Integer SaleMode = entity.getSaleMode();
        if (SaleMode != null) {
            stmt.bindLong(3, SaleMode);
        }
 
        String StartDate = entity.getStartDate();
        if (StartDate != null) {
            stmt.bindString(4, StartDate);
        }
 
        String EndDate = entity.getEndDate();
        if (EndDate != null) {
            stmt.bindString(5, EndDate);
        }
 
        Integer SetGroupNo = entity.getSetGroupNo();
        if (SetGroupNo != null) {
            stmt.bindLong(6, SetGroupNo);
        }
 
        String SetGroupName = entity.getSetGroupName();
        if (SetGroupName != null) {
            stmt.bindString(7, SetGroupName);
        }
 
        Integer RequireAddAmountForProduct = entity.getRequireAddAmountForProduct();
        if (RequireAddAmountForProduct != null) {
            stmt.bindLong(8, RequireAddAmountForProduct);
        }
 
        Integer AddingFromBranch = entity.getAddingFromBranch();
        if (AddingFromBranch != null) {
            stmt.bindLong(9, AddingFromBranch);
        }
    }

    /** @inheritdoc */
    @Override
    public Integer readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public ProductComponentGroup readEntity(Cursor cursor, int offset) {
        ProductComponentGroup entity = new ProductComponentGroup( //
            cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0), // PGroupID
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // ProductID
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // SaleMode
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // StartDate
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // EndDate
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // SetGroupNo
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // SetGroupName
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // RequireAddAmountForProduct
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8) // AddingFromBranch
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ProductComponentGroup entity, int offset) {
        entity.setPGroupID(cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0));
        entity.setProductID(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setSaleMode(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setStartDate(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setEndDate(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setSetGroupNo(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setSetGroupName(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setRequireAddAmountForProduct(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setAddingFromBranch(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
     }
    
    /** @inheritdoc */
    @Override
    protected Integer updateKeyAfterInsert(ProductComponentGroup entity, long rowId) {
        return entity.getPGroupID();
    }
    
    /** @inheritdoc */
    @Override
    public Integer getKey(ProductComponentGroup entity) {
        if(entity != null) {
            return entity.getPGroupID();
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
