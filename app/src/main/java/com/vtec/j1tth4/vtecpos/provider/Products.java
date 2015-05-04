package com.vtec.j1tth4.vtecpos.provider;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by j1tth4 on 4/29/15.
 */
public class Products extends SQLiteHelperBase{

    public static final String TABLE_PRODUCT_GROUP = "ProductGroup";
    public static final String TABLE_PRODUCT_DEPT = "ProductDept";
    public static final String TABLE_PRODUCTS = "Products";
    public static final String TABLE_PRODUCT_PRICE = "ProductPrice";

    public static final String PRODUCT_GROUP_ID = "ProductGroupID";
    public static final String PRODUCT_GROUP_CODE = "ProductGroupCode";
    public static final String PRODUCT_GROUP_NAME = "ProductGroupName";
    public static final String PRODUCT_GROUP_NAME_LANG1 = "ProductGroupNameLang1";
    public static final String PRODUCT_GROUP_NAME_LANG2 = "ProductGroupNameLang2";
    public static final String PRODUCT_GROUP_NAME_LANG3 = "ProductGroupNameLang3";
    public static final String PRODUCT_GROUP_NAME_LANG4 = "ProductGroupNameLang4";
    public static final String PRODUCT_GROUP_NAME_LANG5 = "ProductGroupNameLang5";
    public static final String PRODUCT_GROUP_ACTIVATE = "ProductGroupActivate";
    public static final String PRODUCT_GROUP_SALE_MODE = "ProductGroupSaleMode";
    public static final String PRODUCT_GROUP_TYPE = "ProductGroupType";
    public static final String PRODUCT_GROUP_ORDERING = "ProductGroupOrdering";
    public static final String PRINT_DEPT_FOR_SESSION = "PrintDeptForSession";
    public static final String DISPLAY_MOBILE = "DisplayMobile";
    public static final String IS_COMMENT = "IsComment";
    public static final String PRODUCT_DEPT_ID = "ProductDeptID";
    public static final String PRODUCT_DEPT_CODE = "ProductDeptCode";
    public static final String PRODUCT_DEPT_NAME = "ProductDeptName";
    public static final String PRODUCT_DEPT_NAME_LANG1 = "ProductDeptNameLang1";
    public static final String PRODUCT_DEPT_NAME_LANG2 = "ProductDeptNameLang2";
    public static final String PRODUCT_DEPT_NAME_LANG3 = "ProductDeptNameLang3";
    public static final String PRODUCT_DEPT_NAME_LANG4 = "ProductDeptNameLang4";
    public static final String PRODUCT_DEPT_NAME_LANG5 = "ProductDeptNameLang5";
    public static final String PRODUCT_DEPT_ACTIVATE = "ProductDeptActivate";
    public static final String PRODUCT_DEPT_SALE_MODE = "ProductDeptSaleMode";
    public static final String PRODUCT_DEPT_ORDERING = "ProductDeptOrdering";
    public static final String PRINT_PRODUCT_FOR_SESSION = "PrintProductForSession";
    public static final String PRINT_RECEIPT_GROUP_DEPT = "PrintReceiptGroupingDept";
    public static final String PRODUCT_ID = "ProductID";
    public static final String INVENTORY_ID = "InventoryID";
    public static final String PRODUCT_CAT_1ID = "ProductCat1ID";
    public static final String PRODUCT_CAT_2ID = "ProductCat2ID";
    public static final String PRODUCT_CAT_3ID = "ProductCat3ID";
    public static final String PRODUCT_CAT_4ID = "ProductCat4ID";
    public static final String PRODUCT_CAT_5ID = "ProductCat5ID";
    public static final String PRODUCT_CODE = "ProductCode";
    public static final String PRODUCT_BARCODE = "ProductBarCode";
    public static final String PRODUCT_NAME = "ProductName";
    public static final String PRODUCT_NAME_LANG1 = "ProductNameLang1";
    public static final String PRODUCT_NAME_LANG2 = "ProductNameLang2";
    public static final String PRODUCT_NAME_LANG3 = "ProductNameLang3";
    public static final String PRODUCT_NAME_LANG4 = "ProductNameLang4";
    public static final String PRODUCT_NAME_LANG5 = "ProductNameLang5";
    public static final String PRODUCT_MNAME = "ProductMName";
    public static final String PRODUCT_MNAME_LANG1 = "ProductMNameLang1";
    public static final String PRODUCT_MNAME_LANG2 = "ProductMNameLang2";
    public static final String PRODUCT_MNAME_LANG3 = "ProductMNameLang3";
    public static final String PRODUCT_MNAME_LANG4 = "ProductMNameLang4";
    public static final String PRODUCT_MNAME_LANG5 = "ProductMNameLang5";
    public static final String PRODUCT_PICTURE_SERVER = "ProductPictureServer";
    public static final String PRODUCT_PICTURE_CLIENT = "ProductPictureClient";
    public static final String PRINTER_ID = "PrinterID";
    public static final String PRINT_GROUP = "PrintGroup";
    public static final String PRINT_PRODUCT_NAME = "PrintProductName";
    public static final String DURATION_TIME = "DurationTime";
    public static final String HAS_SERVICE_CHARGE = "HasServiceCharge";
    public static final String IS_OUTOF_STOCK = "IsOutOfStock";
    public static final String AUTO_COMMENT = "AutoComment";
    public static final String IS_DISPLAY_BILl = "IsDisplayBill";
    public static final String IS_PRINT_CHECK = "IsPrintCheck";
    public static final String IS_PRINT_RECEIPT = "IsPrintReceipt";
    public static final String CAN_RETURN_PRODUCT = "CanReturnProduct";
    public static final String DISPLAY_AT_CHECKER_SYSTEM = "DisplayAtCheckerSystem";
    public static final String PRODUCT_ENABLE_DATE_TIME = "ProductEnableDateTime";
    public static final String PRODUCT_EXPIRE_DATE_TIME = "ProductExpireDateTime";
    public static final String PRODUCT_ENABLE_DAY_STRING = "ProductEnableDayString";
    public static final String WARNING_TIME = "WarningTime";
    public static final String CRITICAL_TIME = "CriticalTime";
    public static final String SALE_MODE = "SaleMode";
    public static final String SALE_MODE1 = "SaleMode1";
    public static final String SALE_MODE2 = "SaleMode2";
    public static final String SALE_MODE3 = "SaleMode3";
    public static final String SALE_MODE4 = "SaleMode4";
    public static final String SALE_MODE5 = "SaleMode5";
    public static final String SALE_MODE6 = "SaleMode6";
    public static final String SALE_MODE7 = "SaleMode7";
    public static final String SALE_MODE8 = "SaleMode8";
    public static final String SALE_MODE9 = "SaleMode9";
    public static final String SALE_MODE10 = "SaleMode10";
    public static final String PRODUCT_UNIT_NAME = "ProductUnitName";
    public static final String ZERO_PRICE_ALLOW = "ZeroPriceAllow";
    public static final String LIMIT_DISCOUNT_AMOUNT = "LimitDiscountAmount";
    public static final String LIMIT_DISCOUNT_PERCENT = "LimitDiscountPercent";
    public static final String COMM_RATE = "CommRate";
    public static final String PRODUCT_DESP = "ProductDesp";
    public static final String PRODUCT_DISPLAY = "ProductDisplay";
    public static final String PRODUCT_ACTIVATE = "ProductActivate";
    public static final String PRODUCT_ORDERING = "ProductOrdering";
    public static final String PRINT_ORDERING = "PrintOrdering";
    public static final String ADDING_FROM_BRANCH = "AddingFromBranch";
    public static final String DELETED = "Deleted";
    public static final String INSERT_DATE = "InsertDate";
    public static final String UPDATE_DATE = "UpdateDate";
    public static final String SHOP_ID = "ShopID";
    public static final String PRODUCT_PRICE_ID = "ProductPriceID";
    public static final String PRODUCT_PRICE = "ProductPrice";
    public static final String PREPAID_PRICE = "PrepaidPrice";
    public static final String MAIN_PRICE = "MainPrice";
    public static final String PRICE_REMARK = "PriceRemark";
    public static final String FROM_DATE = "FromDate";
    public static final String TO_DATE = "ToDate";

    public static final String[] ALL_PRODUCT_PRICE_COLUMN = {
            PRODUCT_PRICE_ID,
            PRODUCT_PRICE,
            PREPAID_PRICE,
            MAIN_PRICE,
            PRICE_REMARK,
            FROM_DATE,
            TO_DATE
    };

    public static final String[] ALL_PRODUCT_COLUMN = {
            PRODUCT_ID,
            SHOP_ID,
            INVENTORY_ID,
            PRODUCT_CAT_1ID,
            PRODUCT_CAT_2ID,
            PRODUCT_CAT_3ID,
            PRODUCT_CAT_4ID,
            PRODUCT_CAT_5ID,
            PRODUCT_CODE,
            PRODUCT_BARCODE,
            PRODUCT_NAME,
            PRODUCT_NAME_LANG1,
            PRODUCT_NAME_LANG2,
            PRODUCT_NAME_LANG3,
            PRODUCT_NAME_LANG4,
            PRODUCT_NAME_LANG5,
            PRODUCT_MNAME,
            PRODUCT_MNAME_LANG1,
            PRODUCT_MNAME_LANG2,
            PRODUCT_MNAME_LANG3,
            PRODUCT_MNAME_LANG4,
            PRODUCT_MNAME_LANG5,
            PRODUCT_PICTURE_SERVER,
            PRODUCT_PICTURE_CLIENT,
            PRINTER_ID,
            PRINT_GROUP,
            PRINT_PRODUCT_NAME,
            DURATION_TIME,
            HAS_SERVICE_CHARGE,
            IS_OUTOF_STOCK,
            AUTO_COMMENT,
            IS_DISPLAY_BILl,
            IS_PRINT_CHECK,
            IS_PRINT_RECEIPT,
            CAN_RETURN_PRODUCT,
            DISPLAY_AT_CHECKER_SYSTEM,
            PRODUCT_ENABLE_DATE_TIME,
            PRODUCT_EXPIRE_DATE_TIME,
            PRODUCT_ENABLE_DAY_STRING,
            WARNING_TIME,
            CRITICAL_TIME,
            SALE_MODE,
            SALE_MODE1,
            SALE_MODE2,
            SALE_MODE3,
            SALE_MODE4,
            SALE_MODE5,
            SALE_MODE6,
            SALE_MODE7,
            SALE_MODE8,
            SALE_MODE9,
            SALE_MODE10,
            PRODUCT_UNIT_NAME,
            ZERO_PRICE_ALLOW,
            LIMIT_DISCOUNT_AMOUNT,
            LIMIT_DISCOUNT_PERCENT,
            COMM_RATE,
            PRODUCT_DESP,
            PRODUCT_DISPLAY,
            PRODUCT_ACTIVATE,
            PRODUCT_ORDERING,
            PRINT_ORDERING,
            ADDING_FROM_BRANCH,
            DELETED,
    };

    public static final String[] ALL_PRODUCT_DEPT_COLUMN = {
            PRODUCT_DEPT_ID,
            PRODUCT_GROUP_ID,
            SHOP_ID,
            PRODUCT_DEPT_CODE,
            PRODUCT_DEPT_NAME,
            PRODUCT_DEPT_NAME_LANG1,
            PRODUCT_DEPT_NAME_LANG2,
            PRODUCT_DEPT_NAME_LANG3,
            PRODUCT_DEPT_NAME_LANG4,
            PRODUCT_DEPT_NAME_LANG5,
            PRODUCT_DEPT_ACTIVATE,
            PRODUCT_DEPT_SALE_MODE,
            PRODUCT_DEPT_ORDERING,
            PRINT_PRODUCT_FOR_SESSION,
            PRINT_RECEIPT_GROUP_DEPT,
            DISPLAY_MOBILE,
            ADDING_FROM_BRANCH,
            DELETED
    };

    public static final String[] ALL_PRODUCT_GROUP_COLUMN = {
            PRODUCT_GROUP_ID,
            SHOP_ID,
            PRODUCT_GROUP_CODE,
            PRODUCT_GROUP_NAME,
            PRODUCT_GROUP_NAME_LANG1,
            PRODUCT_GROUP_NAME_LANG2,
            PRODUCT_GROUP_NAME_LANG3,
            PRODUCT_GROUP_NAME_LANG4,
            PRODUCT_GROUP_NAME_LANG5,
            PRODUCT_ACTIVATE,
            PRODUCT_GROUP_SALE_MODE,
            PRODUCT_GROUP_TYPE,
            PRODUCT_GROUP_ORDERING,
            PRINT_DEPT_FOR_SESSION,
            DISPLAY_MOBILE,
            IS_COMMENT,
            ADDING_FROM_BRANCH,
            DELETED
    };

    public Products(Context c) {
        super(c);
    }

    /**
     * @param productId
     * @param saleMode
     * @param isoCurrDate
     * @return 0 if no record instead use open price
     */
    public double getProductPrice(int productId, int saleMode, String isoCurrDate){
        double productPrice = 0;
        String selection = PRODUCT_ID + "=?" +
                " and " + SALE_MODE + "=?" +
                " and " + FROM_DATE + "<=?" +
                " and " + TO_DATE + ">=?";
        String[] selectionArgs = new String[]{
                String.valueOf(productId),
                String.valueOf(saleMode),
                isoCurrDate,
                isoCurrDate
        };
        Cursor cursor = openReadable().query(
                TABLE_PRODUCT_PRICE,
                ALL_PRODUCT_PRICE_COLUMN,
                selection,
                selectionArgs,
                null, null, null);
        boolean haveRecord = cursor.moveToFirst();
        if(haveRecord){
            productPrice = cursor.getDouble(cursor.getColumnIndex(PRODUCT_PRICE));
        }
        cursor.close();
        if(saleMode > 1 && !haveRecord){
            selectionArgs = new String[]{
                    String.valueOf(productId),
                    "1",
                    isoCurrDate,
                    isoCurrDate
            };
            cursor = openReadable().query(
                    TABLE_PRODUCT_PRICE,
                    ALL_PRODUCT_PRICE_COLUMN,
                    selection,
                    selectionArgs,
                    null, null, null);
            if(cursor.moveToFirst()){
                productPrice = cursor.getDouble(cursor.getColumnIndex(PRODUCT_PRICE));
            }
            cursor.close();
        }
        return productPrice;
    }

    /**
     * @param groupId
     * @param deptId
     * @return null if no record
     */
    public List<ProductsDataModel.Products> getProducts(int groupId, int deptId){
        List<ProductsDataModel.Products> productsList = null;
        Cursor cursor = openReadable().query(
                TABLE_PRODUCTS,
                ALL_PRODUCT_COLUMN,
                PRODUCT_GROUP_ID + "=?" +
                        " and " + PRODUCT_DEPT_ID + "=?" +
                        " and " + DELETED + "=?",
                new String[]{
                        String.valueOf(groupId),
                        String.valueOf(deptId),
                        "0"
                }, PRODUCT_ORDERING, null, null
        );
        if(cursor.moveToFirst()){
            productsList = new ArrayList<>();
            while(!cursor.isAfterLast()){
                ProductsDataModel.Products product =
                        new ProductsDataModel.Products();
                product.setProductId(cursor.getInt(cursor.getColumnIndex(PRODUCT_ID)));
                product.setShopId(cursor.getInt(cursor.getColumnIndex(SHOP_ID)));
                product.setInventoryId(cursor.getInt(cursor.getColumnIndex(INVENTORY_ID)));
                product.setProductCat1Id(cursor.getInt(cursor.getColumnIndex(PRODUCT_CAT_1ID)));
                product.setProductCat2Id(cursor.getInt(cursor.getColumnIndex(PRODUCT_CAT_2ID)));
                product.setProductCat3Id(cursor.getInt(cursor.getColumnIndex(PRODUCT_CAT_3ID)));
                product.setProductCat4Id(cursor.getInt(cursor.getColumnIndex(PRODUCT_CAT_4ID)));
                product.setProductCat5Id(cursor.getInt(cursor.getColumnIndex(PRODUCT_CAT_5ID)));
                product.setProductCode(cursor.getString(cursor.getColumnIndex(PRODUCT_CODE)));
                product.setProductBarCode(cursor.getString(cursor.getColumnIndex(PRODUCT_BARCODE)));
                product.setProductName(cursor.getString(cursor.getColumnIndex(PRODUCT_NAME)));
                product.setProductNameLang1(cursor.getString(cursor.getColumnIndex(PRODUCT_NAME_LANG1)));
                product.setProductNameLang2(cursor.getString(cursor.getColumnIndex(PRODUCT_NAME_LANG2)));
                product.setProductNameLang3(cursor.getString(cursor.getColumnIndex(PRODUCT_NAME_LANG3)));
                product.setProductNameLang4(cursor.getString(cursor.getColumnIndex(PRODUCT_NAME_LANG4)));
                product.setProductNameLang5(cursor.getString(cursor.getColumnIndex(PRODUCT_NAME_LANG5)));
                product.setProductMName(cursor.getString(cursor.getColumnIndex(PRODUCT_MNAME)));
                product.setProductMNameLang1(cursor.getString(cursor.getColumnIndex(PRODUCT_MNAME_LANG1)));
                product.setProductMNameLang2(cursor.getString(cursor.getColumnIndex(PRODUCT_MNAME_LANG2)));
                product.setProductMNameLang3(cursor.getString(cursor.getColumnIndex(PRODUCT_MNAME_LANG3)));
                product.setProductMNameLang4(cursor.getString(cursor.getColumnIndex(PRODUCT_MNAME_LANG4)));
                product.setProductMNameLang5(cursor.getString(cursor.getColumnIndex(PRODUCT_MNAME_LANG5)));
                product.setProductPictureServer(cursor.getString(cursor.getColumnIndex(PRODUCT_PICTURE_SERVER)));
                product.setProductPictureClient(cursor.getString(cursor.getColumnIndex(PRODUCT_PICTURE_CLIENT)));
                product.setPrinterId(cursor.getInt(cursor.getColumnIndex(PRINTER_ID)));
                product.setPrintGroup(cursor.getInt(cursor.getColumnIndex(PRINT_GROUP)));
                product.setPrintProductName(cursor.getString(cursor.getColumnIndex(PRINT_PRODUCT_NAME)));
                product.setDurationTime(cursor.getString(cursor.getColumnIndex(DURATION_TIME)));
                product.setHasServiceCharge(cursor.getInt(cursor.getColumnIndex(HAS_SERVICE_CHARGE)));
                product.setIsOutOfStock(cursor.getInt(cursor.getColumnIndex(IS_OUTOF_STOCK)));
                product.setAutoComment(cursor.getInt(cursor.getColumnIndex(AUTO_COMMENT)));
                product.setIsDisplayBill(cursor.getInt(cursor.getColumnIndex(IS_DISPLAY_BILl)));
                product.setIsPrintCheck(cursor.getInt(cursor.getColumnIndex(IS_PRINT_CHECK)));
                product.setIsPrintReceipt(cursor.getInt(cursor.getColumnIndex(IS_PRINT_RECEIPT)));
                product.setCanReturnProduct(cursor.getInt(cursor.getColumnIndex(CAN_RETURN_PRODUCT)));
                product.setDisplayAtCheckerSystem(cursor.getInt(cursor.getColumnIndex(DISPLAY_AT_CHECKER_SYSTEM)));
                product.setProductEnableDateTime(cursor.getString(cursor.getColumnIndex(PRODUCT_ENABLE_DATE_TIME)));
                product.setProductExpireDateTime(cursor.getString(cursor.getColumnIndex(PRODUCT_EXPIRE_DATE_TIME)));
                product.setProductEnableDayString(cursor.getString(cursor.getColumnIndex(PRODUCT_ENABLE_DAY_STRING)));
                product.setWarningTime(cursor.getString(cursor.getColumnIndex(WARNING_TIME)));
                product.setCriticalTime(cursor.getString(cursor.getColumnIndex(CRITICAL_TIME)));
                product.setSaleMode(cursor.getInt(cursor.getColumnIndex(SALE_MODE)));
                product.setSaleMode1(cursor.getInt(cursor.getColumnIndex(SALE_MODE1)));
                product.setSaleMode2(cursor.getInt(cursor.getColumnIndex(SALE_MODE2)));
                product.setSaleMode3(cursor.getInt(cursor.getColumnIndex(SALE_MODE3)));
                product.setSaleMode4(cursor.getInt(cursor.getColumnIndex(SALE_MODE4)));
                product.setSaleMode5(cursor.getInt(cursor.getColumnIndex(SALE_MODE5)));
                product.setSaleMode6(cursor.getInt(cursor.getColumnIndex(SALE_MODE6)));
                product.setSaleMode7(cursor.getInt(cursor.getColumnIndex(SALE_MODE7)));
                product.setSaleMode8(cursor.getInt(cursor.getColumnIndex(SALE_MODE8)));
                product.setSaleMode9(cursor.getInt(cursor.getColumnIndex(SALE_MODE9)));
                product.setSaleMode10(cursor.getInt(cursor.getColumnIndex(SALE_MODE10)));
                product.setProductUnitName(cursor.getString(cursor.getColumnIndex(PRODUCT_UNIT_NAME)));
                product.setZeroPriceAllow(cursor.getInt(cursor.getColumnIndex(ZERO_PRICE_ALLOW)));
                product.setLimitDiscountAmount(cursor.getDouble(cursor.getColumnIndex(LIMIT_DISCOUNT_AMOUNT)));
                product.setLimitDiscountPercent(cursor.getDouble(cursor.getColumnIndex(LIMIT_DISCOUNT_PERCENT)));
                product.setCommRate(cursor.getDouble(cursor.getColumnIndex(COMM_RATE)));
                product.setProductDesp(cursor.getString(cursor.getColumnIndex(PRODUCT_DESP)));
                product.setPrintOrdering(cursor.getInt(cursor.getColumnIndex(PRINT_ORDERING)));
                product.setAddingFromBranch(cursor.getInt(cursor.getColumnIndex(ADDING_FROM_BRANCH)));
                productsList.add(product);
            }
        }
        cursor.close();
        return  productsList;
    }

    /**
     * @param groupId
     * @return null if no record
     */
    public List<ProductsDataModel.ProductDept> getProductDepts(int groupId){
        List<ProductsDataModel.ProductDept> productDeptList = null;
        Cursor cursor = openReadable().query(
                TABLE_PRODUCT_DEPT,
                ALL_PRODUCT_DEPT_COLUMN,
                //PRODUCT_GROUP_ID + "=?" +
                DELETED + "=?",
                new String[]{
                        //String.valueOf(groupId),
                        "0"
                }, null, null, null);
        if(cursor.moveToFirst()){
            productDeptList = new ArrayList<>();
            while (!cursor.isAfterLast()){
                ProductsDataModel.ProductDept productDept =
                        new ProductsDataModel.ProductDept();
                productDept.setProductDeptId(cursor.getInt(cursor.getColumnIndex(PRODUCT_DEPT_ID)));
                productDept.setProductGroupId(cursor.getInt(cursor.getColumnIndex(PRODUCT_GROUP_ID)));
                productDept.setProductDeptId(cursor.getInt(cursor.getColumnIndex(SHOP_ID)));
                productDept.setProductDeptCode(cursor.getString(cursor.getColumnIndex(PRODUCT_DEPT_CODE)));
                productDept.setProductDeptName(cursor.getString(cursor.getColumnIndex(PRODUCT_DEPT_NAME)));
                productDept.setProductDeptNameLang1(cursor.getString(cursor.getColumnIndex(PRODUCT_DEPT_NAME_LANG1)));
                productDept.setProductDeptNameLang2(cursor.getString(cursor.getColumnIndex(PRODUCT_DEPT_NAME_LANG2)));
                productDept.setProductDeptNameLang3(cursor.getString(cursor.getColumnIndex(PRODUCT_DEPT_NAME_LANG3)));
                productDept.setProductDeptNameLang4(cursor.getString(cursor.getColumnIndex(PRODUCT_DEPT_NAME_LANG4)));
                productDept.setProductDeptNameLang5(cursor.getString(cursor.getColumnIndex(PRODUCT_DEPT_NAME_LANG5)));
                productDept.setProductDeptActivate(cursor.getInt(cursor.getColumnIndex(PRODUCT_DEPT_ACTIVATE)));
                productDept.setProductDeptSaleMode(cursor.getInt(cursor.getColumnIndex(PRODUCT_DEPT_SALE_MODE)));
                productDept.setProductDeptOrdering(cursor.getInt(cursor.getColumnIndex(PRODUCT_DEPT_ORDERING)));
                productDept.setPrintProductForSession(cursor.getInt(cursor.getColumnIndex(PRINT_PRODUCT_FOR_SESSION)));
                productDept.setPrintReceiptGroupingDept(cursor.getInt(cursor.getColumnIndex(PRINT_RECEIPT_GROUP_DEPT)));
                productDept.setDisplayMobile(cursor.getInt(cursor.getColumnIndex(DISPLAY_MOBILE)));
                productDept.setAddingFromBranch(cursor.getInt(cursor.getColumnIndex(ADDING_FROM_BRANCH)));
                productDeptList.add(productDept);
            }
        }
        cursor.close();
        return productDeptList;
    }

    /**
     * @return null if no record
     */
    public List<ProductsDataModel.ProductGroups> getProductGroups(){
        List<ProductsDataModel.ProductGroups> productGroupsList = null;
        Cursor cursor = openReadable().query(
                TABLE_PRODUCT_GROUP,
                ALL_PRODUCT_GROUP_COLUMN,
                DELETED + "=?",
                new String[]{
                        "0"
                }, null, null, null);
        if(cursor.moveToFirst()){
            productGroupsList = new ArrayList<>();
            while (!cursor.isAfterLast()){
                ProductsDataModel.ProductGroups productGroups =
                        new ProductsDataModel.ProductGroups();
                productGroups.setProductGroupId(cursor.getInt(cursor.getColumnIndex(PRODUCT_GROUP_ID)));
                productGroups.setShopId(cursor.getInt(cursor.getColumnIndex(SHOP_ID)));
                productGroups.setProductGroupCode(cursor.getString(cursor.getColumnIndex(PRODUCT_GROUP_CODE)));
                productGroups.setProductGroupName(cursor.getString(cursor.getColumnIndex(PRODUCT_GROUP_NAME)));
                productGroups.setProductGroupNameLang1(cursor.getString(cursor.getColumnIndex(PRODUCT_GROUP_NAME_LANG1)));
                productGroups.setProductGroupNameLang2(cursor.getString(cursor.getColumnIndex(PRODUCT_GROUP_NAME_LANG2)));
                productGroups.setProductGroupNameLang3(cursor.getString(cursor.getColumnIndex(PRODUCT_GROUP_NAME_LANG3)));
                productGroups.setProductGroupNameLang4(cursor.getString(cursor.getColumnIndex(PRODUCT_GROUP_NAME_LANG4)));
                productGroups.setProductGroupNameLang5(cursor.getString(cursor.getColumnIndex(PRODUCT_GROUP_NAME_LANG5)));
                productGroups.setProductGroupActivate(cursor.getInt(cursor.getColumnIndex(PRODUCT_GROUP_ACTIVATE)));
                productGroups.setProductGroupSaleMode(cursor.getInt(cursor.getColumnIndex(PRODUCT_DEPT_SALE_MODE)));
                productGroups.setProductGroupType(cursor.getInt(cursor.getColumnIndex(PRODUCT_GROUP_TYPE)));
                productGroups.setProductGroupOrdering(cursor.getInt(cursor.getColumnIndex(PRODUCT_GROUP_ORDERING)));
                productGroups.setPrintDeptForSession(cursor.getInt(cursor.getColumnIndex(PRINT_DEPT_FOR_SESSION)));
                productGroups.setDisplayMobile(cursor.getInt(cursor.getColumnIndex(DISPLAY_MOBILE)));
                productGroups.setIsComment(cursor.getInt(cursor.getColumnIndex(IS_COMMENT)));
                productGroups.setAddingFromBranch(cursor.getInt(cursor.getColumnIndex(ADDING_FROM_BRANCH)));
                productGroupsList.add(productGroups);
            }
        }
        cursor.close();
        return productGroupsList;
    }
}
