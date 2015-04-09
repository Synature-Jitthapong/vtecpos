package pl.surecase.eu;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class MyDaoGenerator {

    public static final int SCHEMA_VERSION = 1;
    public static final String SCHEMA = "com.vtec.j1tth4.vtecpos.dao";

    public static final String BANK_NAME_ENTITY = "BankName";
    public static final String COMPUTER_NAME_ENTITY = "ComputerName";
    public static final String CREDIT_CARD_TYPE_ENTITY = "CreditCardType";
    public static final String SHOP_CATEGORY_ENTITY = "ShopCategory";
    public static final String SHOP_DATA_ENTITY = "ShopData";
    public static final String STAFF_ENTITY_ENTITY = "Staffs";
    public static final String STAFF_ROLE_ENTITY = "StaffRole";

    public static final String SESSION_ENTITY = "Session";
    public static final String SESSION_ENDDAY_DETAIL_ENTITY = "SessionEnddayDetail";
    public static final String ORDER_TRANSACTION_ENTITY = "OrderTransaction";
    public static final String ORDER_DETAIL_ENTITY = "OrderDetail";
    public static final String ORDER_PAY_DETAIL_ENTITY = "OrderPayDetail";

    public static final String PRODUCT_VAT_ENTITY = "ProductVat";
    public static final String PRODUCT_TYPE_ENTITY = "ProductType";
    public static final String PRODUCT_PRICE_GROUP_SHOP_ENTITY = "ProductPriceGroupShop";
    public static final String PRODUCT_PRICE_GROUP_DATE_ENTITY = "ProductPriceGroupDate";
    public static final String PRODUCT_PRICE_GROUP_DATA_ENTITY = "ProductPriceGroupData";
    public static final String PRODUCT_PRICE_GROUP_ENTITY = "ProductPriceGroup";
    public static final String PRODUCT_PRICE_ENTITY = "ProductPrice";
    public static final String PRODUCT_COMPONENT_GROUP_ENTITY = "ProductComponentGroup";
    public static final String PRODUCT_COMPONENT_ENTITY = "ProductComponent";
    public static final String PRODUCT_CATEGORY_ENTITY = "ProductCategory";
    public static final String PRODUCT_GROUP_ENTITY = "ProductGroup";
    public static final String PRODUCT_DEPT_ENTITY = "ProductDept";
    public static final String PRODUCTS_ENTITY = "Products";

    public static final String COLUMN_BANK_NAME_ID = "BankNameID";
    public static final String COLUMN_BANK_NAME = "BankName";

    public static final String COLUMN_PRODUCT_ID = "ProductID";
    public static final String COLUMN_SHOP_ID = "ShopID";
    public static final String COLUMN_INVENTORY_ID = "InventoryID";
    public static final String COLUMN_PRODUCT_GROUP_ID = "ProductGroupID";
    public static final String COLUMN_PRODUCT_DEPT_ID = "ProductDeptID";
    public static final String COLUMN_PRODUCT_CAT_1ID = "ProductCat1ID";
    public static final String COLUMN_PRODUCT_CAT_2ID = "ProductCat2ID";
    public static final String COLUMN_PRODUCT_CAT_3ID = "ProductCat3ID";
    public static final String COLUMN_PRODUCT_CAT_4ID = "ProductCat4ID";
    public static final String COLUMN_PRODUCT_CAT_5ID = "ProductCat5ID";
    public static final String COLUMN_PRODUCT_TYPE_ID = "ProductTypeID";
    public static final String COLUMN_PRODUCT_CODE = "ProductCode";
    public static final String COLUMN_PRODUCT_BARCODE = "ProductBarCode";
    public static final String COLUMN_PRODUCT_NAME = "ProductName";
    public static final String COLUMN_PRODUCT_NAME_LANG1 = "ProductNameLang1";
    public static final String COLUMN_PRODUCT_NAME_LANG2 = "ProductNameLang2";
    public static final String COLUMN_PRODUCT_NAME_LANG3 = "ProductNameLang3";
    public static final String COLUMN_PRODUCT_NAME_LANG4 = "ProductNameLang4";
    public static final String COLUMN_PRODUCT_NAME_LANG5 = "ProductNameLang5";
    public static final String COLUMN_PRODUCT_MNAME = "ProductMName";
    public static final String COLUMN_PRODUCT_MNAME_LANG1 = "ProductMNameLang1";
    public static final String COLUMN_PRODUCT_MNAME_LANG2 = "ProductMNameLang2";
    public static final String COLUMN_PRODUCT_MNAME_LANG3 = "ProductMNameLang3";
    public static final String COLUMN_PRODUCT_MNAME_LANG4 = "ProductMNameLang4";
    public static final String COLUMN_PRODUCT_MNAME_LANG5 = "ProductMNameLang5";
    public static final String COLUMN_PRODUCT_PICTURE_SERVER = "ProductPictureServer";
    public static final String COLUMN_PRODUCT_PICTURE_CLIENT = "ProductPictureClient";
    public static final String COLUMN_PRINTER_ID = "PrinterID";
    public static final String COLUMN_PRINT_GROUP = "PrintGroup";
    public static final String COLUMN_PRINT_PRODUCT_NAME = "PrintProductName";
    public static final String COLUMN_DURATION_TIME = "DurationTime";
    public static final String COLUMN_HAS_SERVICE_CHARGE = "HasServiceCharge";
    public static final String COLUMN_IS_OUTOF_STOCK = "IsOutOfStock";
    public static final String COLUMN_AUTO_COMMENT = "AutoComment";
    public static final String COLUMN_IS_DISPLAY_BILl = "IsDisplayBill";
    public static final String COLUMN_IS_PRINT_CHECK = "IsPrintCheck";
    public static final String COLUMN_IS_PRINT_RECEIPT = "IsPrintReceipt";
    public static final String COLUMN_CAN_RETURN_PRODUCT = "CanReturnProduct";
    public static final String COLUMN_DISPLAY_AT_CHECKER_SYSTEM = "DisplayAtCheckerSystem";
    public static final String COLUMN_PRODUCT_ENABLE_DATE_TIME = "ProductEnableDateTime";
    public static final String COLUMN_PRODUCT_EXPIRE_DATE_TIME = "ProductExpireDateTime";
    public static final String COLUMN_PRODUCT_ENABLE_DAY_STRING = "ProductEnableDayString";
    public static final String COLUMN_WARNING_TIME = "WarningTime";
    public static final String COLUMN_CRITICAL_TIME = "CriticalTime";
    public static final String COLUMN_SALE_MODE1 = "SaleMode1";
    public static final String COLUMN_SALE_MODE2 = "SaleMode2";
    public static final String COLUMN_SALE_MODE3 = "SaleMode3";
    public static final String COLUMN_SALE_MODE4 = "SaleMode4";
    public static final String COLUMN_SALE_MODE5 = "SaleMode5";
    public static final String COLUMN_SALE_MODE6 = "SaleMode6";
    public static final String COLUMN_SALE_MODE7 = "SaleMode7";
    public static final String COLUMN_SALE_MODE8 = "SaleMode8";
    public static final String COLUMN_SALE_MODE9 = "SaleMode9";
    public static final String COLUMN_SALE_MODE10 = "SaleMode10";
    public static final String COLUMN_VAT_TYPE = "VATType";
    public static final String COLUMN_VAT_CODE = "VATCode";
    public static final String COLUMN_PRODUCT_UNIT_NAME = "ProductUnitName";
    public static final String COLUMN_DISCOUNT_ALLOW = "DiscountAllow";
    public static final String COLUMN_ZERO_PRICE_ALLOW = "ZeroPriceAllow";
    public static final String COLUMN_LIMIT_DISCOUNT_AMOUNT = "LimitDiscountAmount";
    public static final String COLUMN_LIMIT_DISCOUNT_PERCENT = "LimitDiscountPercent";
    public static final String COLUMN_COMM_RATE = "CommRate";
    public static final String COLUMN_PRODUCT_DESP = "ProductDesp";
    public static final String COLUMN_PRODUCT_DISPLAY = "ProductDisplay";
    public static final String COLUMN_PRODUCT_ACTIVATE = "ProductActivate";
    public static final String COLUMN_PRODUCT_ORDERING = "ProductOrdering";
    public static final String COLUMN_PRINT_ORDERING = "PrintOrdering";
    public static final String COLUMN_ADDING_FROM_BRANCH = "AddingFromBranch";
    public static final String COLUMN_DELETED = "Deleted";
    public static final String COLUMN_INSERT_DATE = "InsertDate";
    public static final String COLUMN_UPDATE_DATE = "UpdateDate";

    public static void main(String args[]) throws Exception {
        Schema schema = new Schema(SCHEMA_VERSION, SCHEMA);
        createProductEntity(schema);
        createProductDeptEntity(schema);
        createProductGroupEntity(schema);
        createProductCategoryEntity(schema);
        createProductComponentEntity(schema);
        createProductComponentGroupEntity(schema);
        createProductPriceEntity(schema);
        createProductPriceGroupEntity(schema);
        createProductPriceGroupDataEntity(schema);
        createProductPriceGroupDateEntity(schema);
        createProductPriceGroupShopEntity(schema);
        createProductTypeEntity(schema);
        createProductVatEntity(schema);
        createBankNameEntity(schema);
        createComputerNameEntity(schema);
        createCreditCardTypeEntity(schema);
        createShopCategoryEntity(schema);
        createShopDataEntity(schema);
        createOrderTransactionEntity(schema);
        createOrderDetailEntity(schema);
        createOrderPayDetailEntity(schema);
        createStaffEntity(schema);
        createStaffRoleEntity(schema);
        createSessionEntity(schema);
        createSessionEnddayDetailEntity(schema);
        new DaoGenerator().generateAll(schema, args[0]);
    }

    public static void createBankNameEntity(Schema schema){
        Entity bankName = schema.addEntity(BANK_NAME_ENTITY);
        bankName.setTableName(BANK_NAME_ENTITY);
        bankName.addIntProperty("BankNameID").notNull().primaryKey();
        bankName.addStringProperty("BankName").notNull();
        bankName.addIntProperty("Deleted").notNull();
        bankName.setSkipTableCreation(true);
    }

    public static void createStaffRoleEntity(Schema schema){
        Entity staffRole = schema.addEntity(STAFF_ROLE_ENTITY);
        staffRole.addIntProperty("StaffRoleID").notNull().primaryKey();
        staffRole.addIntProperty("StaffRoleLevel");
        staffRole.addStringProperty("StaffRoleName");
        staffRole.addIntProperty("Deleted");
        staffRole.addIntProperty("AddingFromBranch");
        staffRole.setSkipTableCreation(true);
    }

    public static void createStaffEntity(Schema schema){
        Entity staff = schema.addEntity(STAFF_ENTITY_ENTITY);
        staff.addIntProperty("StaffID").notNull().primaryKey();
        staff.addIntProperty("StaffRoleID").notNull();
        staff.addStringProperty("StaffPassword").notNull();
        staff.addStringProperty("StaffCode").notNull();
        staff.addIntProperty("StaffGender");
        staff.addStringProperty("StaffFirstName").notNull();
        staff.addStringProperty("StaffLastName").notNull();
        staff.addStringProperty("StaffAddress1");
        staff.addStringProperty("StaffAddress2");
        staff.addStringProperty("StaffCity");
        staff.addIntProperty("StaffProvince");
        staff.addStringProperty("StaffZipCode");
        staff.addStringProperty("StaffTelephone");
        staff.addStringProperty("StaffMobile");
        staff.addStringProperty("StaffEmail");
        staff.addDateProperty("StaffBirthDay");
        staff.addStringProperty("StaffAdditional");
        staff.addStringProperty("StaffIDNumber");
        staff.addDateProperty("StaffIDIssueDate");
        staff.addDateProperty("StaffIDExpiration");
        staff.addStringProperty("StaffBlood");
        staff.addStringProperty("StaffPictureFileServer");
        staff.addStringProperty("StaffPictureFileClient");
        staff.addDoubleProperty("BasedSalary");
        staff.addIntProperty("LangID");
        staff.addDateProperty("InputDate");
        staff.addIntProperty("InputBy");
        staff.addDateProperty("UpdateDate");
        staff.addIntProperty("UpdateBy");
        staff.addDateProperty("LastUseDate");
        staff.addIntProperty("Activated");
        staff.addIntProperty("Deleted");
        staff.addIntProperty("AddingFromBranch");
        staff.setSkipTableCreation(true);
    }

    public static void createOrderPayDetailEntity(Schema schema){
        Entity orderPayDetail = schema.addEntity(ORDER_PAY_DETAIL_ENTITY);
        orderPayDetail.addIntProperty("PayDetailID").notNull().primaryKey();
        orderPayDetail.addIntProperty("TransactionID").notNull();
        orderPayDetail.addIntProperty("ComputerID").notNull();
        orderPayDetail.addIntProperty("PayTypeID").notNull();
        orderPayDetail.addDoubleProperty("Amount").notNull();
        orderPayDetail.addStringProperty("CreditCardNo");
        orderPayDetail.addIntProperty("ExpireMonth");
        orderPayDetail.addIntProperty("ExpireYear");
        orderPayDetail.addStringProperty("ChequeNumber");
        orderPayDetail.addDateProperty("ChequeDate");
        orderPayDetail.addStringProperty("BankName");
        orderPayDetail.addIntProperty("CreditCardType");
        orderPayDetail.addStringProperty("PaidByName");
        orderPayDetail.addDoubleProperty("Paid").notNull();
        orderPayDetail.addDoubleProperty("PaymentVAT").notNull();
        orderPayDetail.addIntProperty("CardID");
        orderPayDetail.addStringProperty("CardNo");
        orderPayDetail.addDoubleProperty("PrepaidDiscountPercent");
        orderPayDetail.addIntProperty("IsFromEDC");
        orderPayDetail.setSkipTableCreation(true);
    }

    public static void createOrderDetailEntity(Schema schema){
        Entity orderDetail = schema.addEntity(ORDER_DETAIL_ENTITY);
        orderDetail.addIntProperty("OrderDetailID").notNull().primaryKey();
        orderDetail.addIntProperty("TransactionID").notNull().indexAsc("trans_order_idx", true);
        orderDetail.addIntProperty("ComputerID").notNull();
        orderDetail.addIntProperty("OrderDetailLevel");
        orderDetail.addIntProperty("OrderDetailLinkID");
        orderDetail.addDateProperty("SaleDate").notNull();
        orderDetail.addIntProperty("ShopID").notNull();
        orderDetail.addIntProperty("ProductID").notNull();
        orderDetail.addIntProperty("ProductSetType").notNull();
        orderDetail.addIntProperty("OrderStatusID").notNull();
        orderDetail.addIntProperty("SaleMode").notNull();
        orderDetail.addDoubleProperty("TotalQty").notNull();
        orderDetail.addDoubleProperty("RetailPrice").notNull();
        orderDetail.addDoubleProperty("TotalRetailPrice").notNull();
        orderDetail.addDoubleProperty("TotalDiscount").notNull();
        orderDetail.addDoubleProperty("SalePrice").notNull();
        orderDetail.addStringProperty("ProductVATCode").notNull();
        orderDetail.addDoubleProperty("ProductVATPercent").notNull();
        orderDetail.addDoubleProperty("ProductVAT").notNull();
        orderDetail.addIntProperty("HasServiceCharge");
        orderDetail.addDoubleProperty("ServiceCharge");
        orderDetail.addDoubleProperty("ServiceChargeVAT");
        orderDetail.addDoubleProperty("WeightPrice");
        orderDetail.addDoubleProperty("WeightPriceVAT");
        orderDetail.addStringProperty("OtherFoodName");
        orderDetail.addIntProperty("OtherProductGroupID");
        orderDetail.addIntProperty("DiscountAllow");
        orderDetail.addIntProperty("LastTransactionID");
        orderDetail.addIntProperty("LastComputerID");
        orderDetail.addIntProperty("PrinterID");
        orderDetail.addIntProperty("InventoryID");
        orderDetail.addIntProperty("OrderStaffID");
        orderDetail.addIntProperty("OrderComputerID");
        orderDetail.addIntProperty("OrderTableID");
        orderDetail.addIntProperty("VoidTypeID");
        orderDetail.addIntProperty("VoidStaffID");
        orderDetail.addIntProperty("VATType");
        orderDetail.addIntProperty("PrintGroup");
        orderDetail.addIntProperty("NoPrintBill");
        orderDetail.addIntProperty("NoRePrintOrder");
        orderDetail.addDateProperty("StartTime");
        orderDetail.addDateProperty("FinishTime");
        orderDetail.addIntProperty("PrintStatus");
        orderDetail.addIntProperty("ProcessID");
        orderDetail.addDateProperty("SubmitOrderDateTime");
        orderDetail.addStringProperty("Comment");
        orderDetail.addIntProperty("Deleted");
        orderDetail.setSkipTableCreation(true);
    }

    public static void createOrderTransactionEntity(Schema schema){
        Entity orderTransaction = schema.addEntity(ORDER_TRANSACTION_ENTITY);
        orderTransaction.addIntProperty("TransactionID").notNull().primaryKey();
        orderTransaction.addIntProperty("ComputerID").notNull();
        orderTransaction.addStringProperty("TransactionUUID").notNull();
        orderTransaction.addDateProperty("ReserveTime");
        orderTransaction.addIntProperty("ReserveStaffID");
        orderTransaction.addDateProperty("OpenTime").notNull();
        orderTransaction.addIntProperty("OpenStaffID").notNull();
        orderTransaction.addDateProperty("PaidTime");
        orderTransaction.addIntProperty("PaidStaffID");
        orderTransaction.addDateProperty("CloseTime");
        orderTransaction.addIntProperty("CommStaffID");
        orderTransaction.addDoubleProperty("OtherPercentDiscount");
        orderTransaction.addDoubleProperty("OtherAmountDiscount");
        orderTransaction.addIntProperty("TransactionStatusID").notNull();
        orderTransaction.addIntProperty("SaleMode").notNull();
        orderTransaction.addStringProperty("TransactionName");
        orderTransaction.addStringProperty("QueueName");
        orderTransaction.addIntProperty("NoCustomer");
        orderTransaction.addIntProperty("NoCustomerWhenOpen");
        orderTransaction.addIntProperty("DocType").notNull();
        orderTransaction.addIntProperty("ReceiptYear").notNull();
        orderTransaction.addIntProperty("ReceiptMonth").notNull();
        orderTransaction.addIntProperty("ReceiptID");
        orderTransaction.addStringProperty("ReceiptNumber");
        orderTransaction.addDateProperty("SaleDate").notNull().indexAsc("sale_date_idx", true);
        orderTransaction.addIntProperty("ShopID").notNull();
        orderTransaction.addDoubleProperty("TransactionVAT");
        orderTransaction.addDoubleProperty("TransactionExcludeVAT");
        orderTransaction.addDoubleProperty("ServiceCharge");
        orderTransaction.addDoubleProperty("ServiceChargeVAT");
        orderTransaction.addDoubleProperty("OtherIncome");
        orderTransaction.addDoubleProperty("OtherIncomeVAT");
        orderTransaction.addDoubleProperty("TransactionVATable");
        orderTransaction.addDoubleProperty("ReceiptProductRetailPrice");
        orderTransaction.addDoubleProperty("ReceiptSalePrice");
        orderTransaction.addDoubleProperty("ReceiptPayPrice");
        orderTransaction.addDoubleProperty("ReceiptDiscount");
        orderTransaction.addDoubleProperty("ReceiptTotalQty");
        orderTransaction.addDoubleProperty("VATPercent");
        orderTransaction.addDoubleProperty("ServiceChargePercent");
        orderTransaction.addIntProperty("IsCalculateServiceCharge");
        orderTransaction.addIntProperty("SessionID").notNull();
        orderTransaction.addIntProperty("CloseComputerID");
        orderTransaction.addIntProperty("VoidStaffID");
        orderTransaction.addStringProperty("VoidReason");
        orderTransaction.addDateProperty("VoidTime");
        orderTransaction.addIntProperty("MemberID").indexAsc("member_id_index", true);
        orderTransaction.addIntProperty("HasOrder");
        orderTransaction.addIntProperty("NoPrintBillDetail");
        orderTransaction.addIntProperty("BillDetailReferenceNo");
        orderTransaction.addIntProperty("CallForCheckBill");
        orderTransaction.addStringProperty("TransactionNote");
        orderTransaction.addIntProperty("CurrentAccessComputer");
        orderTransaction.addDateProperty("UpdateDate");
        orderTransaction.addDateProperty("BeginTime");
        orderTransaction.addDateProperty("EndTime");
        orderTransaction.addDateProperty("PrintWarningTime");
        orderTransaction.addIntProperty("PrintBeginTime");
        orderTransaction.addIntProperty("AlreadyCalculateStock");
        orderTransaction.addIntProperty("AlreadyExportToHQ");
        orderTransaction.addIntProperty("TableID");
        orderTransaction.addIntProperty("IsSplitTransaction");
        orderTransaction.addIntProperty("IsFromOtherTransaction");
        orderTransaction.addStringProperty("ReferenceNo");
        orderTransaction.addIntProperty("FromDepositTransactionID");
        orderTransaction.addIntProperty("FromDepositComputerID");
        orderTransaction.addIntProperty("Deleted");
        orderTransaction.setSkipTableCreation(true);
    }

    public static void createSessionEnddayDetailEntity(Schema schema){
        Entity sessionEndday = schema.addEntity(SESSION_ENDDAY_DETAIL_ENTITY);
        sessionEndday.addDateProperty("SessionDate").notNull().primaryKey();
        sessionEndday.addIntProperty("ShopID").notNull();
        sessionEndday.addIntProperty("IsEndDay");
        sessionEndday.addIntProperty("EndDayStaffID");
        sessionEndday.addDateProperty("EndDayDateTime");
        sessionEndday.addIntProperty("TotalReceipt");
        sessionEndday.addDoubleProperty("TotalPayPrice");
        sessionEndday.addIntProperty("EndDayComputerID");
        sessionEndday.addIntProperty("NoOfSync");
        sessionEndday.addStringProperty("Remark");
        sessionEndday.setSkipTableCreation(true);
    }

    public static void createSessionEntity(Schema schema){
        Entity session = schema.addEntity(SESSION_ENTITY);
        session.addIntProperty("SessionID").notNull().primaryKey();
        session.addIntProperty("ComputerID").notNull();
        session.addIntProperty("OpenStaffID").notNull();
        session.addIntProperty("CloseStaffID");
        session.addDateProperty("OpenSessionDateTime");
        session.addDateProperty("CloseSessionDateTime");
        session.addDateProperty("SessionDate");
        session.addDoubleProperty("OpenSessionAmount").notNull();
        session.addDoubleProperty("CashAmount");
        session.addDoubleProperty("CashInAmount");
        session.addDoubleProperty("CashOutAmount");
        session.addDoubleProperty("CloseSessionAmount");
        session.addDoubleProperty("CashShortOver");
        session.addDateProperty("SessionUpdateDate");
        session.addIntProperty("ShopID");
        session.addIntProperty("IsEndDaySession");
        session.setSkipTableCreation(true);
    }

    public static void createShopDataEntity(Schema schema){
        Entity shopData = schema.addEntity(SHOP_DATA_ENTITY);
        shopData.addIntProperty("ShopID").notNull().primaryKey();
        shopData.addStringProperty("ShopCode");
        shopData.addStringProperty("ShopName");
        shopData.addIntProperty("IsShop").notNull();
        shopData.addIntProperty("IsInv").notNull();
        shopData.addIntProperty("MasterShop").notNull();
        shopData.addIntProperty("MasterShopLink").notNull();
        shopData.addIntProperty("ShowInReport").notNull();
        shopData.addIntProperty("ShopTypeID").notNull();
        shopData.addIntProperty("ShopCatID1").notNull();
        shopData.addIntProperty("ShopCatID2").notNull();
        shopData.addIntProperty("ShopCatID3").notNull();
        shopData.addIntProperty("ShopCatID4").notNull();
        shopData.addIntProperty("ShopCatID5").notNull();
        shopData.addIntProperty("ShopCatID6").notNull();
        shopData.addIntProperty("ShopCatID7").notNull();
        shopData.addIntProperty("ShopCatID8").notNull();
        shopData.addIntProperty("ShopCatID9").notNull();
        shopData.addIntProperty("ShopCatID10").notNull();
        shopData.addDateProperty("OpenHour");
        shopData.addDateProperty("CloseHour");
        shopData.addStringProperty("CompanyName");
        shopData.addStringProperty("CompanyAddress1");
        shopData.addStringProperty("CompanyAddress2");
        shopData.addStringProperty("CompanyCity");
        shopData.addIntProperty("CompanyProvince");
        shopData.addIntProperty("DisplayCompanyProvinceLangID");
        shopData.addStringProperty("CompanyZipCode");
        shopData.addStringProperty("CompanyTelephone");
        shopData.addStringProperty("CompanyFax");
        shopData.addStringProperty("CompanyCountry");
        shopData.addStringProperty("CompanyTaxID");
        shopData.addStringProperty("CompanyRegisterID");
        shopData.addStringProperty("AccountingCode");
        shopData.addDoubleProperty("CompanyVAT");
        shopData.addStringProperty("DeliveryName");
        shopData.addStringProperty("DeliveryAddress1");
        shopData.addStringProperty("DeliveryAddress2");
        shopData.addStringProperty("DeliveryCity");
        shopData.addIntProperty("DeliveryProvince");
        shopData.addStringProperty("DeliveryZipCode");
        shopData.addStringProperty("DeliveryTelephone");
        shopData.addStringProperty("DeliveryFax");
        shopData.addStringProperty("IPAddress");
        shopData.addStringProperty("Addtional");
        shopData.addIntProperty("ProductLevelOrder");
        shopData.addIntProperty("Deleted");
        shopData.setSkipTableCreation(true);
    }

    public static void createShopCategoryEntity(Schema schema){
        Entity shopCategory = schema.addEntity(SHOP_CATEGORY_ENTITY);
        shopCategory.addIntProperty("ShopCatID").notNull().primaryKey();
        shopCategory.addIntProperty("ShopCatGroupID").notNull();
        shopCategory.addStringProperty("ShopCatName").notNull();
        shopCategory.addIntProperty("LangID").notNull();
        shopCategory.addIntProperty("Deleted");
        shopCategory.setSkipTableCreation(true);
    }

    public static void createCreditCardTypeEntity(Schema schema){
        Entity creditCardType = schema.addEntity(CREDIT_CARD_TYPE_ENTITY);
        creditCardType.addIntProperty("CCTypeID").notNull().primaryKey();
        creditCardType.addIntProperty("CreditCardType").notNull();
        creditCardType.addIntProperty("Deleted").notNull();
        creditCardType.setSkipTableCreation(true);
    }

    public static void createComputerNameEntity(Schema schema){
        Entity computerName = schema.addEntity(COMPUTER_NAME_ENTITY);
        computerName.addIntProperty("ComputerID").notNull().primaryKey();
        computerName.addStringProperty("ComputerName");
        computerName.addIntProperty("ShopID").notNull();
        computerName.addIntProperty("ComputerType").notNull();
        computerName.addStringProperty("IPAddress");
        computerName.addStringProperty("RegistrationNumber");
        computerName.addStringProperty("DeviceCode");
        computerName.addIntProperty("KDSID");
        computerName.addStringProperty("Description");
        computerName.addIntProperty("Deleted");
        computerName.setSkipTableCreation(true);
    }

    public static void createProductVatEntity(Schema schema){
        Entity productVat = schema.addEntity(PRODUCT_VAT_ENTITY);
        productVat.addIntProperty("ProductVATID").notNull().primaryKey();
        productVat.addStringProperty("ProductVATCode").notNull();
        productVat.addDoubleProperty("ProductVATPercent").notNull();
        productVat.addIntProperty("Deleted").notNull();
        productVat.setSkipTableCreation(true);
    }

    public static void createProductTypeEntity(Schema schema){
        Entity productType = schema.addEntity(PRODUCT_TYPE_ENTITY);
        productType.addIntProperty("ProductTypeID").notNull().primaryKey();
        productType.addStringProperty("ProductTypeName");
        productType.addIntProperty("ComponentLevel").notNull();
        productType.addIntProperty("ShowInFront").notNull();
        productType.addIntProperty("AutoAddMaterial").notNull();
        productType.addIntProperty("NotInRevenue").notNull();
        productType.addIntProperty("WeightPriceForRevenue").notNull();
        productType.addIntProperty("DisplayOrdering").notNull();
        productType.addIntProperty("Deleted").notNull();
        productType.setSkipTableCreation(true);
    }

    public static void createProductPriceGroupShopEntity(Schema schema){
        Entity productPriceGroupShop = schema.addEntity(PRODUCT_PRICE_GROUP_SHOP_ENTITY);
        productPriceGroupShop.addIntProperty("PriceGroupID").notNull().primaryKey();
        productPriceGroupShop.addIntProperty("ShopID").notNull();
        productPriceGroupShop.setSkipTableCreation(true);
    }

    public static void createProductPriceGroupDateEntity(Schema schema){
        Entity productPriceGroupDate = schema.addEntity(PRODUCT_PRICE_GROUP_DATE_ENTITY);
        productPriceGroupDate.addIntProperty("PriceGroupDateID").notNull().primaryKey();
        productPriceGroupDate.addIntProperty("PriceGroupID").notNull();
        productPriceGroupDate.addDateProperty("FromDate").notNull();
        productPriceGroupDate.addDateProperty("ToDate").notNull();
        productPriceGroupDate.addIntProperty("Deleted").notNull();
        productPriceGroupDate.setSkipTableCreation(true);
    }

    public static void createProductPriceGroupDataEntity(Schema schema){
        Entity productPriceGroupData = schema.addEntity(PRODUCT_PRICE_GROUP_DATA_ENTITY);
        productPriceGroupData.addIntProperty("PriceGroupDateID").notNull().primaryKey();
        productPriceGroupData.addIntProperty("PriceGroupID").notNull();
        productPriceGroupData.addIntProperty("ProductPriceID").notNull();
        productPriceGroupData.addIntProperty("ProductID");
        productPriceGroupData.addDoubleProperty("ProductPrice");
        productPriceGroupData.addDoubleProperty("PrepaidPrice").notNull();
        productPriceGroupData.addIntProperty("MainPrice").notNull();
        productPriceGroupData.addIntProperty("SaleMode").notNull();
        productPriceGroupData.addStringProperty("PriceRemark");
        productPriceGroupData.addIntProperty("AddingFromBranch").notNull();
        productPriceGroupData.setSkipTableCreation(true);
    }

    public static void createProductPriceGroupEntity(Schema schema){
        Entity productPriceGroup = schema.addEntity(PRODUCT_PRICE_GROUP_ENTITY);
        productPriceGroup.addIntProperty("PriceGroupID").notNull().primaryKey();
        productPriceGroup.addStringProperty("PriceGroupName");
        productPriceGroup.addIntProperty("Deleted").notNull();
        productPriceGroup.setSkipTableCreation(true);
    }

    public static void createProductPriceEntity(Schema schema){
        Entity productPrice = schema.addEntity(PRODUCT_PRICE_ENTITY);
        productPrice.addIntProperty("ProductPriceID").notNull().primaryKey();
        productPrice.addIntProperty("ProductID").notNull();
        productPrice.addDoubleProperty("ProductPrice");
        productPrice.addDoubleProperty("PrepaidPrice").notNull();
        productPrice.addDoubleProperty("MainPrice").notNull();
        productPrice.addIntProperty("SaleMode").notNull();
        productPrice.addStringProperty("PriceRemark");
        productPrice.addDateProperty("FromDate").notNull();
        productPrice.addDateProperty("ToDate").notNull();
        productPrice.addIntProperty("AddingFromBranch").notNull();
        productPrice.setSkipTableCreation(true);
    }

    public static void createProductComponentGroupEntity(Schema schema){
        Entity productCompGroup = schema.addEntity(PRODUCT_COMPONENT_GROUP_ENTITY);
        productCompGroup.addIntProperty("PGroupID").notNull().primaryKey();
        productCompGroup.addIntProperty("ProductID").notNull();
        productCompGroup.addIntProperty("SaleMode").notNull();
        productCompGroup.addDateProperty("StartDate");
        productCompGroup.addDateProperty("EndDate");
        productCompGroup.addIntProperty("SetGroupNo").notNull();
        productCompGroup.addStringProperty("SetGroupName");
        productCompGroup.addIntProperty("RequireAddAmountForProduct").notNull();
        productCompGroup.addIntProperty("AddingFromBranch").notNull();
        productCompGroup.setSkipTableCreation(true);
    }

    public static void createProductComponentEntity(Schema schema){
        Entity productComponent = schema.addEntity(PRODUCT_COMPONENT_ENTITY);
        productComponent.addIntProperty("PGroupID").notNull();
        productComponent.addIntProperty("ProductID").notNull();
        productComponent.addIntProperty("SaleMode").notNull();
        productComponent.addIntProperty("MaterialID").notNull();
        productComponent.addDoubleProperty("MaterialAmount").notNull();
        productComponent.addIntProperty("UnitSmallID").notNull();
        productComponent.addIntProperty("ShowOnOrder").notNull();
        productComponent.addIntProperty("DataType").notNull();
        productComponent.addDoubleProperty("FlexibleProductPrice").notNull();
        productComponent.addIntProperty("FlexibleProductIncludePrice").notNull();
        productComponent.addIntProperty("Ordering").notNull();
        productComponent.addIntProperty("AddingFromBranch").notNull();
        productComponent.setSkipTableCreation(true);
    }

    public static void createProductCategoryEntity(Schema schema){
        Entity productCat = schema.addEntity(PRODUCT_CATEGORY_ENTITY);
        productCat.addIntProperty("ProductCatID").notNull().primaryKey();
        productCat.addIntProperty("ShopID").notNull();
        productCat.addIntProperty("ProductCatTypeID").notNull();
        productCat.addStringProperty("ProductCatCode");
        productCat.addStringProperty("ProductCatName");
        productCat.addIntProperty("ProductCatDisplay").notNull();
        productCat.addIntProperty("ProductCatActivate").notNull();
        productCat.addIntProperty("ProductCatOrdering").notNull();
        productCat.addIntProperty("Deleted").notNull();
        productCat.addIntProperty("IsComment").notNull();
        productCat.addIntProperty("AddingFromBranch").notNull();
        productCat.setSkipTableCreation(true);
    }

    public static void createProductDeptEntity(Schema schema){
        Entity productDept = schema.addEntity(PRODUCT_DEPT_ENTITY);
        productDept.addIntProperty("ProductDeptID").notNull().primaryKey();
        productDept.addIntProperty("ProductGroupID").notNull();
        productDept.addIntProperty("ShopID").notNull();
        productDept.addStringProperty("ProductDeptCode");
        productDept.addStringProperty("ProductDeptName");
        productDept.addStringProperty("ProductDeptNameLang1");
        productDept.addStringProperty("ProductDeptNameLang2");
        productDept.addStringProperty("ProductDeptNameLang3");
        productDept.addStringProperty("ProductDeptNameLang4");
        productDept.addStringProperty("ProductDeptNameLang5");
        productDept.addIntProperty("ProductDeptActivate").notNull();
        productDept.addIntProperty("ProductDeptSaleMode").notNull();
        productDept.addIntProperty("ProductDeptOrdering").notNull();
        productDept.addIntProperty("PrintProductForSession").notNull();
        productDept.addIntProperty("PrintReceiptGroupingDept");
        productDept.addIntProperty("DisplayMobile").notNull();
        productDept.addIntProperty("AddingFromBranch").notNull();
        productDept.addIntProperty("Deleted").notNull();
        productDept.setSkipTableCreation(true);
    }

    public static void createProductGroupEntity(Schema schema){
        Entity productGroup = schema.addEntity(PRODUCT_GROUP_ENTITY);
        productGroup.addIntProperty("ProductGroupID").notNull().primaryKey();
        productGroup.addIntProperty("ShopID");
        productGroup.addStringProperty("ProductGroupCode");
        productGroup.addStringProperty("ProductGroupName");
        productGroup.addStringProperty("ProductGroupNameLang1");
        productGroup.addStringProperty("ProductGroupNameLang2");
        productGroup.addStringProperty("ProductGroupNameLang3");
        productGroup.addStringProperty("ProductGroupNameLang4");
        productGroup.addStringProperty("ProductGroupNameLang5");
        productGroup.addIntProperty("ProductGroupActivate").notNull();
        productGroup.addIntProperty("ProductGroupSaleMode").notNull();
        productGroup.addIntProperty("ProductGroupType").notNull();
        productGroup.addIntProperty("ProductGroupOrdering").notNull();
        productGroup.addIntProperty("PrintDeptForSession").notNull();
        productGroup.addIntProperty("DisplayMobile").notNull();
        productGroup.addIntProperty("IsComment").notNull();
        productGroup.addIntProperty("AddingFromBranch").notNull();
        productGroup.addIntProperty("Deleted").notNull();
        productGroup.setSkipTableCreation(true);
    }

    public static void createProductEntity(Schema schema){
        Entity products = schema.addEntity(PRODUCTS_ENTITY);
        products.addIntProperty(COLUMN_PRODUCT_ID).columnName(COLUMN_PRODUCT_ID).notNull().primaryKey();
        products.addIntProperty(COLUMN_SHOP_ID).columnName(COLUMN_SHOP_ID).notNull();
        products.addIntProperty(COLUMN_INVENTORY_ID).columnName(COLUMN_INVENTORY_ID);
        products.addIntProperty(COLUMN_PRODUCT_GROUP_ID).columnName(COLUMN_PRODUCT_GROUP_ID);
        products.addIntProperty(COLUMN_PRODUCT_DEPT_ID).columnName(COLUMN_PRODUCT_DEPT_ID);
        products.addIntProperty(COLUMN_PRODUCT_CAT_1ID).columnName(COLUMN_PRODUCT_CAT_1ID);
        products.addIntProperty(COLUMN_PRODUCT_CAT_2ID).columnName(COLUMN_PRODUCT_CAT_2ID);
        products.addIntProperty(COLUMN_PRODUCT_CAT_3ID).columnName(COLUMN_PRODUCT_CAT_3ID);
        products.addIntProperty(COLUMN_PRODUCT_CAT_4ID).columnName(COLUMN_PRODUCT_CAT_4ID);
        products.addIntProperty(COLUMN_PRODUCT_CAT_5ID).columnName(COLUMN_PRODUCT_CAT_5ID);
        products.addIntProperty(COLUMN_PRODUCT_TYPE_ID).columnName(COLUMN_PRODUCT_TYPE_ID);
        products.addStringProperty(COLUMN_PRODUCT_CODE).columnName(COLUMN_PRODUCT_CODE);
        products.addStringProperty(COLUMN_PRODUCT_BARCODE).columnName(COLUMN_PRODUCT_BARCODE);
        products.addStringProperty(COLUMN_PRODUCT_NAME).columnName(COLUMN_PRODUCT_NAME);
        products.addStringProperty(COLUMN_PRODUCT_NAME_LANG1).columnName(COLUMN_PRODUCT_NAME_LANG1);
        products.addStringProperty(COLUMN_PRODUCT_NAME_LANG2).columnName(COLUMN_PRODUCT_NAME_LANG2);
        products.addStringProperty(COLUMN_PRODUCT_NAME_LANG3).columnName(COLUMN_PRODUCT_NAME_LANG3);
        products.addStringProperty(COLUMN_PRODUCT_NAME_LANG4).columnName(COLUMN_PRODUCT_NAME_LANG4);
        products.addStringProperty(COLUMN_PRODUCT_NAME_LANG5).columnName(COLUMN_PRODUCT_NAME_LANG5);
        products.addStringProperty(COLUMN_PRODUCT_MNAME).columnName(COLUMN_PRODUCT_MNAME);
        products.addStringProperty(COLUMN_PRODUCT_MNAME_LANG1).columnName(COLUMN_PRODUCT_MNAME_LANG1);
        products.addStringProperty(COLUMN_PRODUCT_MNAME_LANG2).columnName(COLUMN_PRODUCT_MNAME_LANG2);
        products.addStringProperty(COLUMN_PRODUCT_MNAME_LANG3).columnName(COLUMN_PRODUCT_MNAME_LANG3);
        products.addStringProperty(COLUMN_PRODUCT_MNAME_LANG4).columnName(COLUMN_PRODUCT_MNAME_LANG4);
        products.addStringProperty(COLUMN_PRODUCT_MNAME_LANG5).columnName(COLUMN_PRODUCT_MNAME_LANG5);
        products.addStringProperty(COLUMN_PRODUCT_PICTURE_SERVER).columnName(COLUMN_PRODUCT_PICTURE_SERVER);
        products.addStringProperty(COLUMN_PRODUCT_PICTURE_CLIENT).columnName(COLUMN_PRODUCT_PICTURE_CLIENT);
        products.addIntProperty(COLUMN_PRINTER_ID).columnName(COLUMN_PRINTER_ID);
        products.addIntProperty(COLUMN_PRINT_GROUP).columnName(COLUMN_PRINT_GROUP);
        products.addStringProperty(COLUMN_PRINT_PRODUCT_NAME).columnName(COLUMN_PRINT_PRODUCT_NAME);
        products.addDateProperty(COLUMN_DURATION_TIME).columnName(COLUMN_DURATION_TIME);
        products.addIntProperty(COLUMN_HAS_SERVICE_CHARGE).columnName(COLUMN_HAS_SERVICE_CHARGE);
        products.addIntProperty(COLUMN_IS_OUTOF_STOCK).columnName(COLUMN_IS_OUTOF_STOCK);
        products.addIntProperty(COLUMN_AUTO_COMMENT).columnName(COLUMN_AUTO_COMMENT);
        products.addIntProperty(COLUMN_IS_DISPLAY_BILl).columnName(COLUMN_IS_DISPLAY_BILl);
        products.addIntProperty(COLUMN_IS_PRINT_CHECK).columnName(COLUMN_IS_PRINT_CHECK);
        products.addIntProperty(COLUMN_IS_PRINT_RECEIPT).columnName(COLUMN_IS_PRINT_RECEIPT);
        products.addIntProperty(COLUMN_CAN_RETURN_PRODUCT).columnName(COLUMN_CAN_RETURN_PRODUCT);
        products.addIntProperty(COLUMN_DISPLAY_AT_CHECKER_SYSTEM).columnName(COLUMN_DISPLAY_AT_CHECKER_SYSTEM);
        products.addDateProperty(COLUMN_PRODUCT_ENABLE_DATE_TIME).columnName(COLUMN_PRODUCT_ENABLE_DATE_TIME);
        products.addDateProperty(COLUMN_PRODUCT_EXPIRE_DATE_TIME).columnName(COLUMN_PRODUCT_EXPIRE_DATE_TIME);
        products.addDateProperty(COLUMN_PRODUCT_ENABLE_DAY_STRING).columnName(COLUMN_PRODUCT_ENABLE_DAY_STRING);
        products.addDateProperty(COLUMN_WARNING_TIME).columnName(COLUMN_WARNING_TIME);
        products.addDateProperty(COLUMN_CRITICAL_TIME).columnName(COLUMN_CRITICAL_TIME);
        products.addIntProperty(COLUMN_SALE_MODE1).columnName(COLUMN_SALE_MODE1);
        products.addIntProperty(COLUMN_SALE_MODE2).columnName(COLUMN_SALE_MODE2);
        products.addIntProperty(COLUMN_SALE_MODE3).columnName(COLUMN_SALE_MODE3);
        products.addIntProperty(COLUMN_SALE_MODE4).columnName(COLUMN_SALE_MODE4);
        products.addIntProperty(COLUMN_SALE_MODE5).columnName(COLUMN_SALE_MODE5);
        products.addIntProperty(COLUMN_SALE_MODE6).columnName(COLUMN_SALE_MODE6);
        products.addIntProperty(COLUMN_SALE_MODE7).columnName(COLUMN_SALE_MODE7);
        products.addIntProperty(COLUMN_SALE_MODE8).columnName(COLUMN_SALE_MODE8);
        products.addIntProperty(COLUMN_SALE_MODE9).columnName(COLUMN_SALE_MODE9);
        products.addIntProperty(COLUMN_SALE_MODE10).columnName(COLUMN_SALE_MODE10);
        products.addIntProperty(COLUMN_VAT_TYPE).columnName(COLUMN_VAT_TYPE);
        products.addStringProperty(COLUMN_VAT_CODE).columnName(COLUMN_VAT_CODE);
        products.addStringProperty(COLUMN_PRODUCT_UNIT_NAME).columnName(COLUMN_PRODUCT_UNIT_NAME);
        products.addIntProperty(COLUMN_DISCOUNT_ALLOW).columnName(COLUMN_DISCOUNT_ALLOW);
        products.addIntProperty(COLUMN_ZERO_PRICE_ALLOW).columnName(COLUMN_ZERO_PRICE_ALLOW);
        products.addIntProperty(COLUMN_LIMIT_DISCOUNT_AMOUNT).columnName(COLUMN_LIMIT_DISCOUNT_AMOUNT);
        products.addIntProperty(COLUMN_LIMIT_DISCOUNT_PERCENT).columnName(COLUMN_LIMIT_DISCOUNT_PERCENT);
        products.addIntProperty(COLUMN_COMM_RATE).columnName(COLUMN_COMM_RATE);
        products.addStringProperty(COLUMN_PRODUCT_DESP).columnName(COLUMN_PRODUCT_DESP);
        products.addIntProperty(COLUMN_PRODUCT_DISPLAY).columnName(COLUMN_PRODUCT_DISPLAY);
        products.addIntProperty(COLUMN_PRODUCT_ACTIVATE).columnName(COLUMN_PRODUCT_ACTIVATE);
        products.addIntProperty(COLUMN_PRODUCT_ORDERING).columnName(COLUMN_PRODUCT_ORDERING);
        products.addIntProperty(COLUMN_PRINT_ORDERING).columnName(COLUMN_PRINT_ORDERING);
        products.addIntProperty(COLUMN_ADDING_FROM_BRANCH).columnName(COLUMN_ADDING_FROM_BRANCH);
        products.addIntProperty(COLUMN_DELETED).columnName(COLUMN_DELETED);
        products.addDateProperty(COLUMN_INSERT_DATE).columnName(COLUMN_INSERT_DATE);
        products.addDateProperty(COLUMN_UPDATE_DATE).columnName(COLUMN_UPDATE_DATE);
        products.setSkipTableCreation(true);
    }
}
