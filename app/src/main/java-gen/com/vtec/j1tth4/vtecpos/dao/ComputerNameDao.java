package com.vtec.j1tth4.vtecpos.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.vtec.j1tth4.vtecpos.dao.ComputerName;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ComputerName.
*/
public class ComputerNameDao extends AbstractDao<ComputerName, Integer> {

    public static final String TABLENAME = "ComputerName";

    /**
     * Properties of entity ComputerName.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property ComputerID = new Property(0, Integer.class, "ComputerID", true, "ComputerID");
        public final static Property ComputerName = new Property(1, String.class, "ComputerName", false, "ComputerName");
        public final static Property ShopID = new Property(2, Integer.class, "ShopID", false, "ShopID");
        public final static Property ComputerType = new Property(3, Integer.class, "ComputerType", false, "ComputerType");
        public final static Property IPAddress = new Property(4, String.class, "IPAddress", false, "IPAddress");
        public final static Property RegistrationNumber = new Property(5, String.class, "RegistrationNumber", false, "RegistrationNumber");
        public final static Property DeviceCode = new Property(6, String.class, "DeviceCode", false, "DeviceCode");
        public final static Property KDSID = new Property(7, Integer.class, "KDSID", false, "KDSID");
        public final static Property Description = new Property(8, String.class, "Description", false, "Description");
        public final static Property Deleted = new Property(9, Integer.class, "Deleted", false, "Deleted");
    };


    public ComputerNameDao(DaoConfig config) {
        super(config);
    }
    
    public ComputerNameDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ComputerName entity) {
        stmt.clearBindings();
 
        Integer ComputerID = entity.getComputerID();
        if (ComputerID != null) {
            stmt.bindLong(1, ComputerID);
        }
 
        String ComputerName = entity.getComputerName();
        if (ComputerName != null) {
            stmt.bindString(2, ComputerName);
        }
 
        Integer ShopID = entity.getShopID();
        if (ShopID != null) {
            stmt.bindLong(3, ShopID);
        }
 
        Integer ComputerType = entity.getComputerType();
        if (ComputerType != null) {
            stmt.bindLong(4, ComputerType);
        }
 
        String IPAddress = entity.getIPAddress();
        if (IPAddress != null) {
            stmt.bindString(5, IPAddress);
        }
 
        String RegistrationNumber = entity.getRegistrationNumber();
        if (RegistrationNumber != null) {
            stmt.bindString(6, RegistrationNumber);
        }
 
        String DeviceCode = entity.getDeviceCode();
        if (DeviceCode != null) {
            stmt.bindString(7, DeviceCode);
        }
 
        Integer KDSID = entity.getKDSID();
        if (KDSID != null) {
            stmt.bindLong(8, KDSID);
        }
 
        String Description = entity.getDescription();
        if (Description != null) {
            stmt.bindString(9, Description);
        }
 
        Integer Deleted = entity.getDeleted();
        if (Deleted != null) {
            stmt.bindLong(10, Deleted);
        }
    }

    /** @inheritdoc */
    @Override
    public Integer readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public ComputerName readEntity(Cursor cursor, int offset) {
        ComputerName entity = new ComputerName( //
            cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0), // ComputerID
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // ComputerName
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // ShopID
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // ComputerType
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // IPAddress
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // RegistrationNumber
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // DeviceCode
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // KDSID
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // Description
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9) // Deleted
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ComputerName entity, int offset) {
        entity.setComputerID(cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0));
        entity.setComputerName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setShopID(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setComputerType(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setIPAddress(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setRegistrationNumber(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setDeviceCode(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setKDSID(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setDescription(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setDeleted(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
     }
    
    /** @inheritdoc */
    @Override
    protected Integer updateKeyAfterInsert(ComputerName entity, long rowId) {
        return entity.getComputerID();
    }
    
    /** @inheritdoc */
    @Override
    public Integer getKey(ComputerName entity) {
        if(entity != null) {
            return entity.getComputerID();
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
