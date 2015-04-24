package com.vtec.j1tth4.vtecpos.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.vtec.j1tth4.vtecpos.dao.ProductComponent;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ProductComponent.
*/
public class ProductComponentDao extends AbstractDao<ProductComponent, Void> {

    public static final String TABLENAME = "ProductComponent";

    /**
     * Properties of entity ProductComponent.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property PGroupID = new Property(0, Integer.class, "PGroupID", true, "PGroupID");
        public final static Property ProductID = new Property(1, Integer.class, "ProductID", true, "ProductID");
        public final static Property SaleMode = new Property(2, Integer.class, "SaleMode", true, "SaleMode");
        public final static Property MaterialID = new Property(3, Integer.class, "MaterialID", true, "MaterialID");
        public final static Property MaterialAmount = new Property(4, Double.class, "MaterialAmount", false, "MaterialAmount");
        public final static Property UnitSmallID = new Property(5, Integer.class, "UnitSmallID", false, "UnitSmallID");
        public final static Property ShowOnOrder = new Property(6, Integer.class, "ShowOnOrder", false, "ShowOnOrder");
        public final static Property DataType = new Property(7, Integer.class, "DataType", false, "DataType");
        public final static Property FlexibleProductPrice = new Property(8, Double.class, "FlexibleProductPrice", false, "FlexibleProductPrice");
        public final static Property FlexibleProductIncludePrice = new Property(9, Integer.class, "FlexibleProductIncludePrice", false, "FlexibleProductIncludePrice");
        public final static Property Ordering = new Property(10, Integer.class, "Ordering", false, "Ordering");
        public final static Property AddingFromBranch = new Property(11, Integer.class, "AddingFromBranch", false, "AddingFromBranch");
    };


    public ProductComponentDao(DaoConfig config) {
        super(config);
    }
    
    public ProductComponentDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ProductComponent entity) {
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
 
        Integer MaterialID = entity.getMaterialID();
        if (MaterialID != null) {
            stmt.bindLong(4, MaterialID);
        }
 
        Double MaterialAmount = entity.getMaterialAmount();
        if (MaterialAmount != null) {
            stmt.bindDouble(5, MaterialAmount);
        }
 
        Integer UnitSmallID = entity.getUnitSmallID();
        if (UnitSmallID != null) {
            stmt.bindLong(6, UnitSmallID);
        }
 
        Integer ShowOnOrder = entity.getShowOnOrder();
        if (ShowOnOrder != null) {
            stmt.bindLong(7, ShowOnOrder);
        }
 
        Integer DataType = entity.getDataType();
        if (DataType != null) {
            stmt.bindLong(8, DataType);
        }
 
        Double FlexibleProductPrice = entity.getFlexibleProductPrice();
        if (FlexibleProductPrice != null) {
            stmt.bindDouble(9, FlexibleProductPrice);
        }
 
        Integer FlexibleProductIncludePrice = entity.getFlexibleProductIncludePrice();
        if (FlexibleProductIncludePrice != null) {
            stmt.bindLong(10, FlexibleProductIncludePrice);
        }
 
        Integer Ordering = entity.getOrdering();
        if (Ordering != null) {
            stmt.bindLong(11, Ordering);
        }
 
        Integer AddingFromBranch = entity.getAddingFromBranch();
        if (AddingFromBranch != null) {
            stmt.bindLong(12, AddingFromBranch);
        }
    }

    /** @inheritdoc */
    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    /** @inheritdoc */
    @Override
    public ProductComponent readEntity(Cursor cursor, int offset) {
        ProductComponent entity = new ProductComponent( //
            cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0), // PGroupID
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // ProductID
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // SaleMode
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // MaterialID
            cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4), // MaterialAmount
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // UnitSmallID
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // ShowOnOrder
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // DataType
            cursor.isNull(offset + 8) ? null : cursor.getDouble(offset + 8), // FlexibleProductPrice
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // FlexibleProductIncludePrice
            cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10), // Ordering
            cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11) // AddingFromBranch
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ProductComponent entity, int offset) {
        entity.setPGroupID(cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0));
        entity.setProductID(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setSaleMode(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setMaterialID(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setMaterialAmount(cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4));
        entity.setUnitSmallID(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setShowOnOrder(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setDataType(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setFlexibleProductPrice(cursor.isNull(offset + 8) ? null : cursor.getDouble(offset + 8));
        entity.setFlexibleProductIncludePrice(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setOrdering(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
        entity.setAddingFromBranch(cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11));
     }
    
    /** @inheritdoc */
    @Override
    protected Void updateKeyAfterInsert(ProductComponent entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    /** @inheritdoc */
    @Override
    public Void getKey(ProductComponent entity) {
        return null;
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
