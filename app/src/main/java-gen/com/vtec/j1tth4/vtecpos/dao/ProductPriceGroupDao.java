package com.vtec.j1tth4.vtecpos.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.vtec.j1tth4.vtecpos.dao.ProductPriceGroup;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ProductPriceGroup.
*/
public class ProductPriceGroupDao extends AbstractDao<ProductPriceGroup, Integer> {

    public static final String TABLENAME = "ProductPriceGroup";

    /**
     * Properties of entity ProductPriceGroup.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property PriceGroupID = new Property(0, Integer.class, "PriceGroupID", true, "PriceGroupID");
        public final static Property PriceGroupName = new Property(1, String.class, "PriceGroupName", false, "PriceGroupName");
        public final static Property Deleted = new Property(2, Integer.class, "Deleted", false, "Deleted");
    };


    public ProductPriceGroupDao(DaoConfig config) {
        super(config);
    }
    
    public ProductPriceGroupDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ProductPriceGroup entity) {
        stmt.clearBindings();
 
        Integer PriceGroupID = entity.getPriceGroupID();
        if (PriceGroupID != null) {
            stmt.bindLong(1, PriceGroupID);
        }
 
        String PriceGroupName = entity.getPriceGroupName();
        if (PriceGroupName != null) {
            stmt.bindString(2, PriceGroupName);
        }
 
        Integer Deleted = entity.getDeleted();
        if (Deleted != null) {
            stmt.bindLong(3, Deleted);
        }
    }

    /** @inheritdoc */
    @Override
    public Integer readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public ProductPriceGroup readEntity(Cursor cursor, int offset) {
        ProductPriceGroup entity = new ProductPriceGroup( //
            cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0), // PriceGroupID
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // PriceGroupName
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2) // Deleted
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ProductPriceGroup entity, int offset) {
        entity.setPriceGroupID(cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0));
        entity.setPriceGroupName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDeleted(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
     }
    
    /** @inheritdoc */
    @Override
    protected Integer updateKeyAfterInsert(ProductPriceGroup entity, long rowId) {
        return entity.getPriceGroupID();
    }
    
    /** @inheritdoc */
    @Override
    public Integer getKey(ProductPriceGroup entity) {
        if(entity != null) {
            return entity.getPriceGroupID();
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
