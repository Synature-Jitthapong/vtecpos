package com.vtec.j1tth4.vtecpos.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.vtec.j1tth4.vtecpos.dao.ProductVat;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ProductVat.
*/
public class ProductVatDao extends AbstractDao<ProductVat, Integer> {

    public static final String TABLENAME = "ProductVat";

    /**
     * Properties of entity ProductVat.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property ProductVATID = new Property(0, Integer.class, "ProductVATID", true, "ProductVATID");
        public final static Property ProductVATCode = new Property(1, String.class, "ProductVATCode", false, "ProductVATCode");
        public final static Property ProductVATPercent = new Property(2, Double.class, "ProductVATPercent", false, "ProductVATPercent");
        public final static Property VATDisplay = new Property(3, String.class, "VATDisplay", false, "VATDisplay");
        public final static Property VATDesp = new Property(4, String.class, "VATDesp", false, "VATDesp");
        public final static Property Deleted = new Property(5, Integer.class, "Deleted", false, "Deleted");
    };


    public ProductVatDao(DaoConfig config) {
        super(config);
    }
    
    public ProductVatDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ProductVat entity) {
        stmt.clearBindings();
 
        Integer ProductVATID = entity.getProductVATID();
        if (ProductVATID != null) {
            stmt.bindLong(1, ProductVATID);
        }
 
        String ProductVATCode = entity.getProductVATCode();
        if (ProductVATCode != null) {
            stmt.bindString(2, ProductVATCode);
        }
 
        Double ProductVATPercent = entity.getProductVATPercent();
        if (ProductVATPercent != null) {
            stmt.bindDouble(3, ProductVATPercent);
        }
 
        String VATDisplay = entity.getVATDisplay();
        if (VATDisplay != null) {
            stmt.bindString(4, VATDisplay);
        }
 
        String VATDesp = entity.getVATDesp();
        if (VATDesp != null) {
            stmt.bindString(5, VATDesp);
        }
 
        Integer Deleted = entity.getDeleted();
        if (Deleted != null) {
            stmt.bindLong(6, Deleted);
        }
    }

    /** @inheritdoc */
    @Override
    public Integer readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public ProductVat readEntity(Cursor cursor, int offset) {
        ProductVat entity = new ProductVat( //
            cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0), // ProductVATID
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // ProductVATCode
            cursor.isNull(offset + 2) ? null : cursor.getDouble(offset + 2), // ProductVATPercent
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // VATDisplay
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // VATDesp
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5) // Deleted
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ProductVat entity, int offset) {
        entity.setProductVATID(cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0));
        entity.setProductVATCode(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setProductVATPercent(cursor.isNull(offset + 2) ? null : cursor.getDouble(offset + 2));
        entity.setVATDisplay(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setVATDesp(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setDeleted(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Integer updateKeyAfterInsert(ProductVat entity, long rowId) {
        return entity.getProductVATID();
    }
    
    /** @inheritdoc */
    @Override
    public Integer getKey(ProductVat entity) {
        if(entity != null) {
            return entity.getProductVATID();
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
