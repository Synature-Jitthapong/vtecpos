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
 * DAO for table PRODUCT_COMPONENT_GROUP.
*/
public class ProductComponentGroupDao extends AbstractDao<ProductComponentGroup, Integer> {

    public static final String TABLENAME = "PRODUCT_COMPONENT_GROUP";

    /**
     * Properties of entity ProductComponentGroup.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property PGroupID = new Property(0, int.class, "PGroupID", true, "PGROUP_ID");
        public final static Property ProductID = new Property(1, int.class, "ProductID", false, "PRODUCT_ID");
        public final static Property SaleMode = new Property(2, int.class, "SaleMode", false, "SALE_MODE");
        public final static Property StartDate = new Property(3, java.util.Date.class, "StartDate", false, "START_DATE");
        public final static Property EndDate = new Property(4, java.util.Date.class, "EndDate", false, "END_DATE");
        public final static Property SetGroupNo = new Property(5, int.class, "SetGroupNo", false, "SET_GROUP_NO");
        public final static Property SetGroupName = new Property(6, String.class, "SetGroupName", false, "SET_GROUP_NAME");
        public final static Property RequireAddAmountForProduct = new Property(7, int.class, "RequireAddAmountForProduct", false, "REQUIRE_ADD_AMOUNT_FOR_PRODUCT");
        public final static Property AddingFromBranch = new Property(8, int.class, "AddingFromBranch", false, "ADDING_FROM_BRANCH");
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
        stmt.bindLong(1, entity.getPGroupID());
        stmt.bindLong(2, entity.getProductID());
        stmt.bindLong(3, entity.getSaleMode());
 
        java.util.Date StartDate = entity.getStartDate();
        if (StartDate != null) {
            stmt.bindLong(4, StartDate.getTime());
        }
 
        java.util.Date EndDate = entity.getEndDate();
        if (EndDate != null) {
            stmt.bindLong(5, EndDate.getTime());
        }
        stmt.bindLong(6, entity.getSetGroupNo());
 
        String SetGroupName = entity.getSetGroupName();
        if (SetGroupName != null) {
            stmt.bindString(7, SetGroupName);
        }
        stmt.bindLong(8, entity.getRequireAddAmountForProduct());
        stmt.bindLong(9, entity.getAddingFromBranch());
    }

    /** @inheritdoc */
    @Override
    public Integer readKey(Cursor cursor, int offset) {
        return cursor.getInt(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public ProductComponentGroup readEntity(Cursor cursor, int offset) {
        ProductComponentGroup entity = new ProductComponentGroup( //
            cursor.getInt(offset + 0), // PGroupID
            cursor.getInt(offset + 1), // ProductID
            cursor.getInt(offset + 2), // SaleMode
            cursor.isNull(offset + 3) ? null : new java.util.Date(cursor.getLong(offset + 3)), // StartDate
            cursor.isNull(offset + 4) ? null : new java.util.Date(cursor.getLong(offset + 4)), // EndDate
            cursor.getInt(offset + 5), // SetGroupNo
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // SetGroupName
            cursor.getInt(offset + 7), // RequireAddAmountForProduct
            cursor.getInt(offset + 8) // AddingFromBranch
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ProductComponentGroup entity, int offset) {
        entity.setPGroupID(cursor.getInt(offset + 0));
        entity.setProductID(cursor.getInt(offset + 1));
        entity.setSaleMode(cursor.getInt(offset + 2));
        entity.setStartDate(cursor.isNull(offset + 3) ? null : new java.util.Date(cursor.getLong(offset + 3)));
        entity.setEndDate(cursor.isNull(offset + 4) ? null : new java.util.Date(cursor.getLong(offset + 4)));
        entity.setSetGroupNo(cursor.getInt(offset + 5));
        entity.setSetGroupName(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setRequireAddAmountForProduct(cursor.getInt(offset + 7));
        entity.setAddingFromBranch(cursor.getInt(offset + 8));
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
