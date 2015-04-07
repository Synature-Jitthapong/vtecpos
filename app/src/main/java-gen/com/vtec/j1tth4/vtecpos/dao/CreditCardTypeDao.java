package com.vtec.j1tth4.vtecpos.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.vtec.j1tth4.vtecpos.dao.CreditCardType;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table CREDIT_CARD_TYPE.
*/
public class CreditCardTypeDao extends AbstractDao<CreditCardType, Integer> {

    public static final String TABLENAME = "CREDIT_CARD_TYPE";

    /**
     * Properties of entity CreditCardType.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property CCTypeID = new Property(0, int.class, "CCTypeID", true, "CCTYPE_ID");
        public final static Property CreditCardType = new Property(1, int.class, "CreditCardType", false, "CREDIT_CARD_TYPE");
        public final static Property Deleted = new Property(2, int.class, "Deleted", false, "DELETED");
    };


    public CreditCardTypeDao(DaoConfig config) {
        super(config);
    }
    
    public CreditCardTypeDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, CreditCardType entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getCCTypeID());
        stmt.bindLong(2, entity.getCreditCardType());
        stmt.bindLong(3, entity.getDeleted());
    }

    /** @inheritdoc */
    @Override
    public Integer readKey(Cursor cursor, int offset) {
        return cursor.getInt(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public CreditCardType readEntity(Cursor cursor, int offset) {
        CreditCardType entity = new CreditCardType( //
            cursor.getInt(offset + 0), // CCTypeID
            cursor.getInt(offset + 1), // CreditCardType
            cursor.getInt(offset + 2) // Deleted
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, CreditCardType entity, int offset) {
        entity.setCCTypeID(cursor.getInt(offset + 0));
        entity.setCreditCardType(cursor.getInt(offset + 1));
        entity.setDeleted(cursor.getInt(offset + 2));
     }
    
    /** @inheritdoc */
    @Override
    protected Integer updateKeyAfterInsert(CreditCardType entity, long rowId) {
        return entity.getCCTypeID();
    }
    
    /** @inheritdoc */
    @Override
    public Integer getKey(CreditCardType entity) {
        if(entity != null) {
            return entity.getCCTypeID();
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
