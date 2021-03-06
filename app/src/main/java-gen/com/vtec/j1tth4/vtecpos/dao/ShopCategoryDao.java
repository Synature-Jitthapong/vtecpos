package com.vtec.j1tth4.vtecpos.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.vtec.j1tth4.vtecpos.dao.ShopCategory;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ShopCategory.
*/
public class ShopCategoryDao extends AbstractDao<ShopCategory, Integer> {

    public static final String TABLENAME = "ShopCategory";

    /**
     * Properties of entity ShopCategory.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property ShopCatID = new Property(0, Integer.class, "ShopCatID", true, "ShopCatID");
        public final static Property ShopCatGroupID = new Property(1, Integer.class, "ShopCatGroupID", false, "ShopCatGroupID");
        public final static Property ShopCatName = new Property(2, String.class, "ShopCatName", false, "ShopCatName");
        public final static Property LangID = new Property(3, Integer.class, "LangID", false, "LangID");
        public final static Property Deleted = new Property(4, Integer.class, "Deleted", false, "Deleted");
    };


    public ShopCategoryDao(DaoConfig config) {
        super(config);
    }
    
    public ShopCategoryDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ShopCategory entity) {
        stmt.clearBindings();
 
        Integer ShopCatID = entity.getShopCatID();
        if (ShopCatID != null) {
            stmt.bindLong(1, ShopCatID);
        }
 
        Integer ShopCatGroupID = entity.getShopCatGroupID();
        if (ShopCatGroupID != null) {
            stmt.bindLong(2, ShopCatGroupID);
        }
 
        String ShopCatName = entity.getShopCatName();
        if (ShopCatName != null) {
            stmt.bindString(3, ShopCatName);
        }
 
        Integer LangID = entity.getLangID();
        if (LangID != null) {
            stmt.bindLong(4, LangID);
        }
 
        Integer Deleted = entity.getDeleted();
        if (Deleted != null) {
            stmt.bindLong(5, Deleted);
        }
    }

    /** @inheritdoc */
    @Override
    public Integer readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public ShopCategory readEntity(Cursor cursor, int offset) {
        ShopCategory entity = new ShopCategory( //
            cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0), // ShopCatID
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // ShopCatGroupID
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // ShopCatName
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // LangID
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4) // Deleted
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ShopCategory entity, int offset) {
        entity.setShopCatID(cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0));
        entity.setShopCatGroupID(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setShopCatName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setLangID(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setDeleted(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
     }
    
    /** @inheritdoc */
    @Override
    protected Integer updateKeyAfterInsert(ShopCategory entity, long rowId) {
        return entity.getShopCatID();
    }
    
    /** @inheritdoc */
    @Override
    public Integer getKey(ShopCategory entity) {
        if(entity != null) {
            return entity.getShopCatID();
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
