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
 * DAO for table PRODUCT_COMPONENT.
*/
public class ProductComponentDao extends AbstractDao<ProductComponent, Void> {

    public static final String TABLENAME = "PRODUCT_COMPONENT";

    /**
     * Properties of entity ProductComponent.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property PGroupID = new Property(0, int.class, "PGroupID", false, "PGROUP_ID");
        public final static Property ProductID = new Property(1, int.class, "ProductID", false, "PRODUCT_ID");
        public final static Property SaleMode = new Property(2, int.class, "SaleMode", false, "SALE_MODE");
        public final static Property MaterialID = new Property(3, int.class, "MaterialID", false, "MATERIAL_ID");
        public final static Property MaterialAmount = new Property(4, double.class, "MaterialAmount", false, "MATERIAL_AMOUNT");
        public final static Property UnitSmallID = new Property(5, int.class, "UnitSmallID", false, "UNIT_SMALL_ID");
        public final static Property ShowOnOrder = new Property(6, int.class, "ShowOnOrder", false, "SHOW_ON_ORDER");
        public final static Property DataType = new Property(7, int.class, "DataType", false, "DATA_TYPE");
        public final static Property FlexibleProductPrice = new Property(8, double.class, "FlexibleProductPrice", false, "FLEXIBLE_PRODUCT_PRICE");
        public final static Property FlexibleProductIncludePrice = new Property(9, int.class, "FlexibleProductIncludePrice", false, "FLEXIBLE_PRODUCT_INCLUDE_PRICE");
        public final static Property Ordering = new Property(10, int.class, "Ordering", false, "ORDERING");
        public final static Property AddingFromBranch = new Property(11, int.class, "AddingFromBranch", false, "ADDING_FROM_BRANCH");
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
        stmt.bindLong(1, entity.getPGroupID());
        stmt.bindLong(2, entity.getProductID());
        stmt.bindLong(3, entity.getSaleMode());
        stmt.bindLong(4, entity.getMaterialID());
        stmt.bindDouble(5, entity.getMaterialAmount());
        stmt.bindLong(6, entity.getUnitSmallID());
        stmt.bindLong(7, entity.getShowOnOrder());
        stmt.bindLong(8, entity.getDataType());
        stmt.bindDouble(9, entity.getFlexibleProductPrice());
        stmt.bindLong(10, entity.getFlexibleProductIncludePrice());
        stmt.bindLong(11, entity.getOrdering());
        stmt.bindLong(12, entity.getAddingFromBranch());
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
            cursor.getInt(offset + 0), // PGroupID
            cursor.getInt(offset + 1), // ProductID
            cursor.getInt(offset + 2), // SaleMode
            cursor.getInt(offset + 3), // MaterialID
            cursor.getDouble(offset + 4), // MaterialAmount
            cursor.getInt(offset + 5), // UnitSmallID
            cursor.getInt(offset + 6), // ShowOnOrder
            cursor.getInt(offset + 7), // DataType
            cursor.getDouble(offset + 8), // FlexibleProductPrice
            cursor.getInt(offset + 9), // FlexibleProductIncludePrice
            cursor.getInt(offset + 10), // Ordering
            cursor.getInt(offset + 11) // AddingFromBranch
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ProductComponent entity, int offset) {
        entity.setPGroupID(cursor.getInt(offset + 0));
        entity.setProductID(cursor.getInt(offset + 1));
        entity.setSaleMode(cursor.getInt(offset + 2));
        entity.setMaterialID(cursor.getInt(offset + 3));
        entity.setMaterialAmount(cursor.getDouble(offset + 4));
        entity.setUnitSmallID(cursor.getInt(offset + 5));
        entity.setShowOnOrder(cursor.getInt(offset + 6));
        entity.setDataType(cursor.getInt(offset + 7));
        entity.setFlexibleProductPrice(cursor.getDouble(offset + 8));
        entity.setFlexibleProductIncludePrice(cursor.getInt(offset + 9));
        entity.setOrdering(cursor.getInt(offset + 10));
        entity.setAddingFromBranch(cursor.getInt(offset + 11));
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
