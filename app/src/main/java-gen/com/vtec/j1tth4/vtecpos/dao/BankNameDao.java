package com.vtec.j1tth4.vtecpos.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.vtec.j1tth4.vtecpos.dao.BankName;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table BankName.
*/
public class BankNameDao extends AbstractDao<BankName, Integer> {

    public static final String TABLENAME = "BankName";

    /**
     * Properties of entity BankName.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property BankNameID = new Property(0, Integer.class, "BankNameID", true, "BankNameID");
        public final static Property BankName = new Property(1, String.class, "BankName", false, "BankName");
        public final static Property Deleted = new Property(2, Integer.class, "Deleted", false, "Deleted");
    };


    public BankNameDao(DaoConfig config) {
        super(config);
    }
    
    public BankNameDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, BankName entity) {
        stmt.clearBindings();
 
        Integer BankNameID = entity.getBankNameID();
        if (BankNameID != null) {
            stmt.bindLong(1, BankNameID);
        }
 
        String BankName = entity.getBankName();
        if (BankName != null) {
            stmt.bindString(2, BankName);
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
    public BankName readEntity(Cursor cursor, int offset) {
        BankName entity = new BankName( //
            cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0), // BankNameID
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // BankName
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2) // Deleted
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, BankName entity, int offset) {
        entity.setBankNameID(cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0));
        entity.setBankName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDeleted(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
     }
    
    /** @inheritdoc */
    @Override
    protected Integer updateKeyAfterInsert(BankName entity, long rowId) {
        return entity.getBankNameID();
    }
    
    /** @inheritdoc */
    @Override
    public Integer getKey(BankName entity) {
        if(entity != null) {
            return entity.getBankNameID();
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
