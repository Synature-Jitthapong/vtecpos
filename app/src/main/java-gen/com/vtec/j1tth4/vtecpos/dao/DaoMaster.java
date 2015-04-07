package com.vtec.j1tth4.vtecpos.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import de.greenrobot.dao.AbstractDaoMaster;
import de.greenrobot.dao.identityscope.IdentityScopeType;

import com.vtec.j1tth4.vtecpos.dao.ProductsDao;
import com.vtec.j1tth4.vtecpos.dao.ProductDeptDao;
import com.vtec.j1tth4.vtecpos.dao.ProductGroupDao;
import com.vtec.j1tth4.vtecpos.dao.ProductCategoryDao;
import com.vtec.j1tth4.vtecpos.dao.ProductComponentDao;
import com.vtec.j1tth4.vtecpos.dao.ProductComponentGroupDao;
import com.vtec.j1tth4.vtecpos.dao.ProductPriceDao;
import com.vtec.j1tth4.vtecpos.dao.ProductPriceGroupDao;
import com.vtec.j1tth4.vtecpos.dao.ProductPriceGroupDataDao;
import com.vtec.j1tth4.vtecpos.dao.ProductPriceGroupDateDao;
import com.vtec.j1tth4.vtecpos.dao.ProductPriceGroupShopDao;
import com.vtec.j1tth4.vtecpos.dao.ProductTypeDao;
import com.vtec.j1tth4.vtecpos.dao.ProductVatDao;
import com.vtec.j1tth4.vtecpos.dao.BankNameDao;
import com.vtec.j1tth4.vtecpos.dao.ComputerNameDao;
import com.vtec.j1tth4.vtecpos.dao.CreditCardTypeDao;
import com.vtec.j1tth4.vtecpos.dao.ShopCategoryDao;
import com.vtec.j1tth4.vtecpos.dao.ShopDataDao;
import com.vtec.j1tth4.vtecpos.dao.OrderTransactionDao;
import com.vtec.j1tth4.vtecpos.dao.OrderDetailDao;
import com.vtec.j1tth4.vtecpos.dao.OrderPayDetailDao;
import com.vtec.j1tth4.vtecpos.dao.StaffsDao;
import com.vtec.j1tth4.vtecpos.dao.StaffRoleDao;
import com.vtec.j1tth4.vtecpos.dao.SessionDao;
import com.vtec.j1tth4.vtecpos.dao.SessionEnddayDetailDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * Master of DAO (schema version 1): knows all DAOs.
*/
public class DaoMaster extends AbstractDaoMaster {
    public static final int SCHEMA_VERSION = 1;

    /** Creates underlying database table using DAOs. */
    public static void createAllTables(SQLiteDatabase db, boolean ifNotExists) {
    }
    
    /** Drops underlying database table using DAOs. */
    public static void dropAllTables(SQLiteDatabase db, boolean ifExists) {
    }
    
    public static abstract class OpenHelper extends SQLiteOpenHelper {

        public OpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory, SCHEMA_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            Log.i("greenDAO", "Creating tables for schema version " + SCHEMA_VERSION);
            createAllTables(db, false);
        }
    }
    
    /** WARNING: Drops all table on Upgrade! Use only during development. */
    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Log.i("greenDAO", "Upgrading schema from version " + oldVersion + " to " + newVersion + " by dropping all tables");
            dropAllTables(db, true);
            onCreate(db);
        }
    }

    public DaoMaster(SQLiteDatabase db) {
        super(db, SCHEMA_VERSION);
        registerDaoClass(ProductsDao.class);
        registerDaoClass(ProductDeptDao.class);
        registerDaoClass(ProductGroupDao.class);
        registerDaoClass(ProductCategoryDao.class);
        registerDaoClass(ProductComponentDao.class);
        registerDaoClass(ProductComponentGroupDao.class);
        registerDaoClass(ProductPriceDao.class);
        registerDaoClass(ProductPriceGroupDao.class);
        registerDaoClass(ProductPriceGroupDataDao.class);
        registerDaoClass(ProductPriceGroupDateDao.class);
        registerDaoClass(ProductPriceGroupShopDao.class);
        registerDaoClass(ProductTypeDao.class);
        registerDaoClass(ProductVatDao.class);
        registerDaoClass(BankNameDao.class);
        registerDaoClass(ComputerNameDao.class);
        registerDaoClass(CreditCardTypeDao.class);
        registerDaoClass(ShopCategoryDao.class);
        registerDaoClass(ShopDataDao.class);
        registerDaoClass(OrderTransactionDao.class);
        registerDaoClass(OrderDetailDao.class);
        registerDaoClass(OrderPayDetailDao.class);
        registerDaoClass(StaffsDao.class);
        registerDaoClass(StaffRoleDao.class);
        registerDaoClass(SessionDao.class);
        registerDaoClass(SessionEnddayDetailDao.class);
    }
    
    public DaoSession newSession() {
        return new DaoSession(db, IdentityScopeType.Session, daoConfigMap);
    }
    
    public DaoSession newSession(IdentityScopeType type) {
        return new DaoSession(db, type, daoConfigMap);
    }
    
}
