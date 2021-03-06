package com.vtec.j1tth4.vtecpos.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.vtec.j1tth4.vtecpos.dao.ProgramProperty;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ProgramProperty.
*/
public class ProgramPropertyDao extends AbstractDao<ProgramProperty, Integer> {

    public static final String TABLENAME = "ProgramProperty";

    /**
     * Properties of entity ProgramProperty.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property PropertyID = new Property(0, Integer.class, "PropertyID", true, "PropertyID");
        public final static Property PropertyLevelID = new Property(1, Integer.class, "PropertyLevelID", false, "PropertyLevelID");
        public final static Property PropertyGroupID = new Property(2, Integer.class, "PropertyGroupID", false, "PropertyGroupID");
        public final static Property PropertyDeptID = new Property(3, Integer.class, "PropertyDeptID", false, "PropertyDeptID");
        public final static Property PropertyFunctionID = new Property(4, Integer.class, "PropertyFunctionID", false, "PropertyFunctionID");
        public final static Property PropertyName = new Property(5, String.class, "PropertyName", false, "PropertyName");
        public final static Property PropertyParam = new Property(6, String.class, "PropertyParam", false, "PropertyParam");
        public final static Property PropertyDetailUrl = new Property(7, String.class, "PropertyDetailUrl", false, "PropertyDetailUrl");
        public final static Property PropertyDesp = new Property(8, String.class, "PropertyDesp", false, "PropertyDesp");
        public final static Property IsFixProperty = new Property(9, Integer.class, "IsFixProperty", false, "IsFixProperty");
        public final static Property CanChangeAtBranch = new Property(10, Integer.class, "CanChangeAtBranch", false, "CanChangeAtBranch");
        public final static Property Ordering = new Property(11, Integer.class, "Ordering", false, "Ordering");
        public final static Property Deleted = new Property(12, Integer.class, "Deleted", false, "Deleted");
    };


    public ProgramPropertyDao(DaoConfig config) {
        super(config);
    }
    
    public ProgramPropertyDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ProgramProperty entity) {
        stmt.clearBindings();
 
        Integer PropertyID = entity.getPropertyID();
        if (PropertyID != null) {
            stmt.bindLong(1, PropertyID);
        }
 
        Integer PropertyLevelID = entity.getPropertyLevelID();
        if (PropertyLevelID != null) {
            stmt.bindLong(2, PropertyLevelID);
        }
 
        Integer PropertyGroupID = entity.getPropertyGroupID();
        if (PropertyGroupID != null) {
            stmt.bindLong(3, PropertyGroupID);
        }
 
        Integer PropertyDeptID = entity.getPropertyDeptID();
        if (PropertyDeptID != null) {
            stmt.bindLong(4, PropertyDeptID);
        }
 
        Integer PropertyFunctionID = entity.getPropertyFunctionID();
        if (PropertyFunctionID != null) {
            stmt.bindLong(5, PropertyFunctionID);
        }
 
        String PropertyName = entity.getPropertyName();
        if (PropertyName != null) {
            stmt.bindString(6, PropertyName);
        }
 
        String PropertyParam = entity.getPropertyParam();
        if (PropertyParam != null) {
            stmt.bindString(7, PropertyParam);
        }
 
        String PropertyDetailUrl = entity.getPropertyDetailUrl();
        if (PropertyDetailUrl != null) {
            stmt.bindString(8, PropertyDetailUrl);
        }
 
        String PropertyDesp = entity.getPropertyDesp();
        if (PropertyDesp != null) {
            stmt.bindString(9, PropertyDesp);
        }
 
        Integer IsFixProperty = entity.getIsFixProperty();
        if (IsFixProperty != null) {
            stmt.bindLong(10, IsFixProperty);
        }
 
        Integer CanChangeAtBranch = entity.getCanChangeAtBranch();
        if (CanChangeAtBranch != null) {
            stmt.bindLong(11, CanChangeAtBranch);
        }
 
        Integer Ordering = entity.getOrdering();
        if (Ordering != null) {
            stmt.bindLong(12, Ordering);
        }
 
        Integer Deleted = entity.getDeleted();
        if (Deleted != null) {
            stmt.bindLong(13, Deleted);
        }
    }

    /** @inheritdoc */
    @Override
    public Integer readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public ProgramProperty readEntity(Cursor cursor, int offset) {
        ProgramProperty entity = new ProgramProperty( //
            cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0), // PropertyID
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // PropertyLevelID
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // PropertyGroupID
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // PropertyDeptID
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // PropertyFunctionID
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // PropertyName
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // PropertyParam
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // PropertyDetailUrl
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // PropertyDesp
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // IsFixProperty
            cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10), // CanChangeAtBranch
            cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11), // Ordering
            cursor.isNull(offset + 12) ? null : cursor.getInt(offset + 12) // Deleted
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ProgramProperty entity, int offset) {
        entity.setPropertyID(cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0));
        entity.setPropertyLevelID(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setPropertyGroupID(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setPropertyDeptID(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setPropertyFunctionID(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setPropertyName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setPropertyParam(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setPropertyDetailUrl(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setPropertyDesp(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setIsFixProperty(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setCanChangeAtBranch(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
        entity.setOrdering(cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11));
        entity.setDeleted(cursor.isNull(offset + 12) ? null : cursor.getInt(offset + 12));
     }
    
    /** @inheritdoc */
    @Override
    protected Integer updateKeyAfterInsert(ProgramProperty entity, long rowId) {
        return entity.getPropertyID();
    }
    
    /** @inheritdoc */
    @Override
    public Integer getKey(ProgramProperty entity) {
        if(entity != null) {
            return entity.getPropertyID();
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
