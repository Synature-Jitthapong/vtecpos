package com.vtec.j1tth4.vtecpos.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.vtec.j1tth4.vtecpos.dao.ProductGroup;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table PRODUCT_GROUP.
*/
public class ProductGroupDao extends AbstractDao<ProductGroup, Integer> {

    public static final String TABLENAME = "PRODUCT_GROUP";

    /**
     * Properties of entity ProductGroup.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property ProductGroupID = new Property(0, int.class, "ProductGroupID", true, "PRODUCT_GROUP_ID");
        public final static Property ShopID = new Property(1, Integer.class, "ShopID", false, "SHOP_ID");
        public final static Property ProductGroupCode = new Property(2, String.class, "ProductGroupCode", false, "PRODUCT_GROUP_CODE");
        public final static Property ProductGroupName = new Property(3, String.class, "ProductGroupName", false, "PRODUCT_GROUP_NAME");
        public final static Property ProductGroupNameLang1 = new Property(4, String.class, "ProductGroupNameLang1", false, "PRODUCT_GROUP_NAME_LANG1");
        public final static Property ProductGroupNameLang2 = new Property(5, String.class, "ProductGroupNameLang2", false, "PRODUCT_GROUP_NAME_LANG2");
        public final static Property ProductGroupNameLang3 = new Property(6, String.class, "ProductGroupNameLang3", false, "PRODUCT_GROUP_NAME_LANG3");
        public final static Property ProductGroupNameLang4 = new Property(7, String.class, "ProductGroupNameLang4", false, "PRODUCT_GROUP_NAME_LANG4");
        public final static Property ProductGroupNameLang5 = new Property(8, String.class, "ProductGroupNameLang5", false, "PRODUCT_GROUP_NAME_LANG5");
        public final static Property ProductGroupActivate = new Property(9, int.class, "ProductGroupActivate", false, "PRODUCT_GROUP_ACTIVATE");
        public final static Property ProductGroupSaleMode = new Property(10, int.class, "ProductGroupSaleMode", false, "PRODUCT_GROUP_SALE_MODE");
        public final static Property ProductGroupType = new Property(11, int.class, "ProductGroupType", false, "PRODUCT_GROUP_TYPE");
        public final static Property ProductGroupOrdering = new Property(12, int.class, "ProductGroupOrdering", false, "PRODUCT_GROUP_ORDERING");
        public final static Property PrintDeptForSession = new Property(13, int.class, "PrintDeptForSession", false, "PRINT_DEPT_FOR_SESSION");
        public final static Property DisplayMobile = new Property(14, int.class, "DisplayMobile", false, "DISPLAY_MOBILE");
        public final static Property IsComment = new Property(15, int.class, "IsComment", false, "IS_COMMENT");
        public final static Property AddingFromBranch = new Property(16, int.class, "AddingFromBranch", false, "ADDING_FROM_BRANCH");
        public final static Property Deleted = new Property(17, int.class, "Deleted", false, "DELETED");
    };


    public ProductGroupDao(DaoConfig config) {
        super(config);
    }
    
    public ProductGroupDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ProductGroup entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getProductGroupID());
 
        Integer ShopID = entity.getShopID();
        if (ShopID != null) {
            stmt.bindLong(2, ShopID);
        }
 
        String ProductGroupCode = entity.getProductGroupCode();
        if (ProductGroupCode != null) {
            stmt.bindString(3, ProductGroupCode);
        }
 
        String ProductGroupName = entity.getProductGroupName();
        if (ProductGroupName != null) {
            stmt.bindString(4, ProductGroupName);
        }
 
        String ProductGroupNameLang1 = entity.getProductGroupNameLang1();
        if (ProductGroupNameLang1 != null) {
            stmt.bindString(5, ProductGroupNameLang1);
        }
 
        String ProductGroupNameLang2 = entity.getProductGroupNameLang2();
        if (ProductGroupNameLang2 != null) {
            stmt.bindString(6, ProductGroupNameLang2);
        }
 
        String ProductGroupNameLang3 = entity.getProductGroupNameLang3();
        if (ProductGroupNameLang3 != null) {
            stmt.bindString(7, ProductGroupNameLang3);
        }
 
        String ProductGroupNameLang4 = entity.getProductGroupNameLang4();
        if (ProductGroupNameLang4 != null) {
            stmt.bindString(8, ProductGroupNameLang4);
        }
 
        String ProductGroupNameLang5 = entity.getProductGroupNameLang5();
        if (ProductGroupNameLang5 != null) {
            stmt.bindString(9, ProductGroupNameLang5);
        }
        stmt.bindLong(10, entity.getProductGroupActivate());
        stmt.bindLong(11, entity.getProductGroupSaleMode());
        stmt.bindLong(12, entity.getProductGroupType());
        stmt.bindLong(13, entity.getProductGroupOrdering());
        stmt.bindLong(14, entity.getPrintDeptForSession());
        stmt.bindLong(15, entity.getDisplayMobile());
        stmt.bindLong(16, entity.getIsComment());
        stmt.bindLong(17, entity.getAddingFromBranch());
        stmt.bindLong(18, entity.getDeleted());
    }

    /** @inheritdoc */
    @Override
    public Integer readKey(Cursor cursor, int offset) {
        return cursor.getInt(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public ProductGroup readEntity(Cursor cursor, int offset) {
        ProductGroup entity = new ProductGroup( //
            cursor.getInt(offset + 0), // ProductGroupID
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // ShopID
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // ProductGroupCode
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // ProductGroupName
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // ProductGroupNameLang1
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // ProductGroupNameLang2
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // ProductGroupNameLang3
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // ProductGroupNameLang4
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // ProductGroupNameLang5
            cursor.getInt(offset + 9), // ProductGroupActivate
            cursor.getInt(offset + 10), // ProductGroupSaleMode
            cursor.getInt(offset + 11), // ProductGroupType
            cursor.getInt(offset + 12), // ProductGroupOrdering
            cursor.getInt(offset + 13), // PrintDeptForSession
            cursor.getInt(offset + 14), // DisplayMobile
            cursor.getInt(offset + 15), // IsComment
            cursor.getInt(offset + 16), // AddingFromBranch
            cursor.getInt(offset + 17) // Deleted
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ProductGroup entity, int offset) {
        entity.setProductGroupID(cursor.getInt(offset + 0));
        entity.setShopID(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setProductGroupCode(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setProductGroupName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setProductGroupNameLang1(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setProductGroupNameLang2(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setProductGroupNameLang3(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setProductGroupNameLang4(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setProductGroupNameLang5(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setProductGroupActivate(cursor.getInt(offset + 9));
        entity.setProductGroupSaleMode(cursor.getInt(offset + 10));
        entity.setProductGroupType(cursor.getInt(offset + 11));
        entity.setProductGroupOrdering(cursor.getInt(offset + 12));
        entity.setPrintDeptForSession(cursor.getInt(offset + 13));
        entity.setDisplayMobile(cursor.getInt(offset + 14));
        entity.setIsComment(cursor.getInt(offset + 15));
        entity.setAddingFromBranch(cursor.getInt(offset + 16));
        entity.setDeleted(cursor.getInt(offset + 17));
     }
    
    /** @inheritdoc */
    @Override
    protected Integer updateKeyAfterInsert(ProductGroup entity, long rowId) {
        return entity.getProductGroupID();
    }
    
    /** @inheritdoc */
    @Override
    public Integer getKey(ProductGroup entity) {
        if(entity != null) {
            return entity.getProductGroupID();
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
