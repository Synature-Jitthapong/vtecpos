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

    public static void createBankNameEntity(Schema schema){
        Entity bankName = schema.addEntity(BANK_NAME_ENTITY);
        bankName.addIntProperty("BankNameID").notNull().primaryKey();
        bankName.addStringProperty("BankName").notNull();
        bankName.addIntProperty("Deleted").notNull();
        bankName.setSkipTableCreation(true);
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
        products.addIntProperty("ProductID").notNull().primaryKey();
        products.addIntProperty("ShopID").notNull();
        products.addIntProperty("ProductGroupID").notNull();
        products.addIntProperty("ProductDeptID").notNull();
        products.addIntProperty("ProductCat1ID").notNull();
        products.addIntProperty("ProductCat2ID").notNull();
        products.addIntProperty("ProductCat3ID").notNull();
        products.addIntProperty("ProductCat4ID").notNull();
        products.addIntProperty("ProductCat5ID").notNull();
        products.addIntProperty("ProductTypeID").notNull();
        products.addStringProperty("ProductCode");
        products.addStringProperty("ProductBarCode");
        products.addStringProperty("ProductName").notNull();
        products.addStringProperty("ProductNameLang1");
        products.addStringProperty("ProductNameLang2");
        products.addStringProperty("ProductNameLang3");
        products.addStringProperty("ProductNameLang4");
        products.addStringProperty("ProductNameLang5");
        products.addStringProperty("ProductMName");
        products.addStringProperty("ProductMNameLang1");
        products.addStringProperty("ProductMNameLang2");
        products.addStringProperty("ProductMNameLang3");
        products.addStringProperty("ProductMNameLang4");
        products.addStringProperty("ProductMNameLang5");
        products.addStringProperty("ProductPictureServer");
        products.addStringProperty("ProductPictureClient");
        products.addIntProperty("PrinterID").notNull();
        products.addIntProperty("PrintGroup").notNull();
        products.addIntProperty("DurationTime").notNull();
        products.addIntProperty("HasServiceCharge").notNull();
        products.addIntProperty("IsOutOfStock").notNull();
        products.addIntProperty("AutoComment").notNull();
        products.addIntProperty("CanReturnProduct").notNull();
        products.addIntProperty("DisplayAtCheckerSystem").notNull();
        products.addDateProperty("ProductEnableDateTime");
        products.addDateProperty("ProductExpireDateTime");
        products.addStringProperty("ProductEnableDayString");
        products.addIntProperty("WarningTime").notNull();
        products.addIntProperty("CriticalTime").notNull();
        products.addIntProperty("SaleMode1").notNull();
        products.addIntProperty("SaleMode2").notNull();
        products.addIntProperty("SaleMode3").notNull();
        products.addIntProperty("SaleMode4").notNull();
        products.addIntProperty("SaleMode5").notNull();
        products.addIntProperty("SaleMode6").notNull();
        products.addIntProperty("SaleMode7").notNull();
        products.addIntProperty("SaleMode8").notNull();
        products.addIntProperty("SaleMode9").notNull();
        products.addIntProperty("SaleMode10").notNull();
        products.addIntProperty("VATType").notNull();
        products.addStringProperty("VATCode").notNull();
        products.addStringProperty("ProductUnitName");
        products.addIntProperty("DiscountAllow").notNull();
        products.addIntProperty("ZeroPriceAllow").notNull();
        products.addDoubleProperty("LimitDiscountAmount").notNull();
        products.addDoubleProperty("LimitDiscountPercent").notNull();
        products.addIntProperty("CommRate").notNull();
        products.addStringProperty("ProductDesp");
        products.addIntProperty("ProductDisplay").notNull();
        products.addIntProperty("ProductActivate").notNull();
        products.addIntProperty("ProductOrdering").notNull();
        products.addIntProperty("PrintOrdering").notNull();
        products.addIntProperty("AddingFromBranch").notNull();
        products.addIntProperty("Deleted").notNull();
        products.addDateProperty("InsertDate");
        products.addDateProperty("UpdateDate");
        products.setSkipTableCreation(true);
    }
}
