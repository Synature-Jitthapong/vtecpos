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
    public static final String DOCUMENT_ENTITY = "Document";
    public static final String DOCUMENT_TYPE_ENTITY = "Documenttype";
    public static final String FC_CARD_HISTORY_ENTITY = "FcCardHistory";
    public static final String FC_CARD_INFO_ENTITY = "FcCardInfo";
    public static final String FC_TRAN_DETAIL_ENTITY = "FcTranDetail";
    public static final String FC_TRAN_PAYMENT_ENTITY = "FcTranPayment";
    public static final String FC_TRANSACTION_ENTITY = "FcTransaction";
    public static final String LANGUAGE_ENTITY = "Language";
    public static final String LOG_ACCESS_INFO_ENTITY = "LogAccessInfo";

    public static final String ORDER_DETAIL_ENTITY = "OrderDetail";
    public static final String ORDER_PAY_DETAIL_ENTITY = "OrderpayDetail";
    public static final String ORDER_PRINT_JOB_ENTITY = "OrderPrintJob";
    public static final String ORDER_TRANSACTION_ENTITY = "OrderTransaction";

    public static final String SHOP_CATEGORY_ENTITY = "ShopCategory";
    public static final String SHOP_DATA_ENTITY = "ShopData";
    public static final String STAFF_ENTITY = "Staffs";
    public static final String STAFF_ROLE_ENTITY = "StaffRole";

    public static final String SESSION_ENTITY = "Session";
    public static final String SESSION_ENDDAY_DETAIL_ENTITY = "SessionEnddayDetail";
    public static final String SALE_MODE_ENTITY = "SaleMode";

    public static final String PRODUCT_VAT_ENTITY = "ProductVat";
    public static final String PRODUCT_TYPE_ENTITY = "ProductType";
    public static final String PROGRAM_PROPERTY_ENTITY = "ProgramProperty";
    public static final String PROGRAM_PROPERTY_VALUE_ENTITY = "ProgramPropertyValue";
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

    public static final String COLUMN_COMPUTER_ID = "ComputerID";
    public static final String COLUMN_COMPUTER_NAME = "ComputerName";
    public static final String COLUMN_COMPUTER_TYPE = "ComputerType";
    public static final String COLUMN_REGISTRATION_NUMBER = "RegistrationNumber";
    public static final String COLUMN_DEVICE_CODE = "DeviceCode";
    public static final String COLUMN_KDS_ID = "KDSID";
    public static final String COLUMN_DESCRIPTION = "Description";

    public static final String COLUMN_CREDIT_CARD_TYPE_ID = "CCTypeID";
    public static final String COLUMN_CREDIT_CARD_TYPE = "CreditCardType";

    public static final String COLUMN_DOCUMENT_ID = "DocumentID";
    public static final String COLUMN_VENDOR_ID = "VendorID";
    public static final String COLUMN_VENDOR_GROUP_ID = "VendorGroupID";
    public static final String COLUMN_VENDOR_SHOP_ID = "VendorShopID";
    public static final String COLUMN_DOCUMENT_TYPE_ID = "DocumentTypeID";
    public static final String COLUMN_DOCUMENT_YEAR = "DocumentYear";
    public static final String COLUMN_DOCUMENT_MONTH = "DocumentMonth";
    public static final String COLUMN_DOCUMENT_NUMBER = "DocumentNumber";
    public static final String COLUMN_DOCUMENT_DATE = "DocumentDate";
    public static final String COLUMN_INPUT_BY = "InputBy";
    public static final String COLUMN_UPDATE_BY = "UpdateBy";
    public static final String COLUMN_APPROVE_BY = "ApproveBy";
    public static final String COLUMN_VOID_BY = "VoidBy";
    public static final String COLUMN_RECEIPT_BY = "ReceiveBy";
    public static final String COLUMN_DOCUMENT_STATUS = "DocumentStatus";
    public static final String COLUMN_INVOICE_REF = "InvoiceRef";
    public static final String COLUMN_DOCUMENT_UUID = "DocumentUDDID";
    public static final String COLUMN_DOCUMENT_ID_REF = "DocumentIDRef";
    public static final String COLUMN_DOCUMENT_ID_REF_SHOP_ID = "DocIDRefShopID";
    public static final String COLUMN_TO_INV_ID = "ToInvID";
    public static final String COLUMN_FROM_INV_ID = "FromInvID";
    public static final String COLUMN_FROM_TEMPLATE_ID = "FromTemplateID";
    public static final String COLUMN_FROM_TEMPLATE_SHOP_ID = "FromTemplateShopID";
    public static final String COLUMN_IS_SMALL_UNIT= "IsSmallUnit";
    public static final String COLUMN_REMARK = "Remark";
    public static final String COLUMN_TERM_OF_PAYMENT = "TermOfPayment";
    public static final String COLUMN_DUE_DATE = "DueDate";
    public static final String COLUMN_DOCUMENT_HEADER = "DocumentHeader";
    public static final String COLUMN_CREDIT_DAY = "CreditDay";
    public static final String COLUMN_APPROVE_DATE = "ApproveDate";
    public static final String COLUMN_CANCEL_DATE = "CancelDate";
    public static final String COLUMN_NEW_SEND = "NewSend";
    public static final String COLUMN_CURRENT_STAFF_ACCESS = "CurrentAccessStaff";
    public static final String COLUMN_OTHER_PERCENT_DISCOUNT = "OtherPercentDiscount";
    public static final String COLUMN_OTHER_AMOUNT_DISCOUNT = "OtherAmountDiscount";
    public static final String COLUMN_DOCUMENT_VAT_TYPE = "DocumentVATType";
    public static final String COLUMN_VAT_PERCENT = "VATPercent";
    public static final String COLUMN_LOCK_EDIT_DETAIL = "LockEditDetail";
    public static final String COLUMN_DOCUMENT_BATCH_ID = "DocumentBatchID";
    public static final String COLUMN_DOCUMENT_BATCH_SHOP_ID = "DocumentBatchShopID";
    public static final String COLUMN_ALREADY_SEND_TO_HQ = "AlreadyExportToHQ";
    public static final String COLUMN_ALREADY_EXPORT_TO_BRANCH = "AlreadyExportToBranch";
    public static final String COLUMN_IS_UPDATE_DOC_DETAIL = "IsUpdateDocDetail";

    public static final String COLUMN_DOCUMENT_STORE_CODE = "DocumentStoreCode";
    public static final String COLUMN_DOCUMENT_TYPE_HEADER = "DocumentTypeHeader";
    public static final String COLUMN_DOCUMENT_TYPE_NAME = "DocumentTypeName";
    public static final String COLUMN_DOCUMENT_TYPE_NAME_LANG1 = "DocumentTypeNameLang1";
    public static final String COLUMN_DOCUMENT_TYPE_NAME_LANG2 = "DocumentTypeNameLang2";
    public static final String COLUMN_DOCUMENT_TYPE_NAME_LANG3 = "DocumentTypeNameLang3";
    public static final String COLUMN_DOCUMENT_TYPE_NAME_LANG4 = "DocumentTypeNameLang4";
    public static final String COLUMN_DOCUMENT_TYPE_NAME_LANG5 = "DocumentTypeNameLang5";
    public static final String COLUMN_SHOW_ON_SEARCH = "ShowOnSearch";
    public static final String COLUMN_MOVEMENT_IN_STOCK = "MovementInStock";
    public static final String COLUMN_IS_ADD_REDUCE_DOC = "IsAddReduceDoc";
    public static final String COLUMN_CALCULATE_IN_PROFITLOSS = "CalculateInProfitLoss";
    public static final String COLUMN_CALCULATE_NET_USE = "CalculateNetUse";
    public static final String COLUMN_CALCULATE_STANDARD_PROFITLOSS = "CalculateStandardProfitLoss";

    public static final String COLUMN_HISTORY_ID = "HistoryID";
    public static final String COLUMN_TRANS_UUID = "TranUUID";
    public static final String COLUMN_CARD_ID = "CardID";
    public static final String COLUMN_CARD_NO = "CardNo";
    public static final String COLUMN_TRANSACTION_ID = "TransactionID";
    public static final String COLUMN_SALE_DATE = "SaleDate";
    public static final String COLUMN_RECEIPT_NO = "ReceiptNo";
    public static final String COLUMN_PREVIOUS_BALANCE = "PreviousBalance";
    public static final String COLUMN_TRANS_AMOUNT = "TranAmount";
    public static final String COLUMN_DOC_TYPE = "DocType";
    public static final String COLUMN_STAFF_ID = "StaffID";

    public static final String COLUMN_CARD_STATUS = "CardStatus";
    public static final String COLUMN_LOG_ID = "LogID";
    public static final String COLUMN_CARD_DEPOSIT_AMOUNT = "CardDepositAmount";
    public static final String COLUMN_CARD_CURRENT_AMOUNT = "CardCurrentAmount";
    public static final String COLUMN_CARD_LIMIT_AMOUNT = "CardLimitAmount";
    public static final String COLUMN_CREATE_STAFF_ID = "CreateStaffID";
    public static final String COLUMN_UPDATE_STAFF_ID = "UpdateStaffID";
    public static final String COLUMN_MEMBER_ID = "MemberID";
    public static final String COLUMN_CREATE_DATE = "CreateDate";
    public static final String COLUMN_EXPIRE_DATE = "ExpireDate";

    public static final String COLUMN_ORDER_DETAIL_ID = "OrderDetailID";
    public static final String COLUMN_RECORD_STATUS = "RecordStatus";

    public static final String COLUMN_PAY_DETAIL_ID = "PayDetailID";
    public static final String COLUMN_PAY_TYPE_ID = "PayTypeID";
    public static final String COLUMN_PAY_AMOUNT = "PayAmount";
    public static final String COLUMN_CC_NUMBER = "CCNumber";
    public static final String COLUMN_CC_EXP_MONTH = "CCExpMonth";
    public static final String COLUMN_CC_EXP_YEAR = "CCExpYear";
    public static final String COLUMN_CC_TYPE = "CCType";
    public static final String COLUMN_CC_BANK = "CCBank";
    public static final String COLUMN_CC_NAME = "CCName";
    public static final String COLUMN_CC_APPROVE_CODE = "CCApproveCode";
    public static final String COLUMN_CC_RESPONSE = "CCResponse";

    public static final String COLUMN_RECEIPT_YEAR = "ReceiptYear";
    public static final String COLUMN_RECEIPT_MONTH = "ReceiptMonth";
    public static final String COLUMN_RECEIPT_ID = "ReceiptID";
    public static final String COLUMN_TOTAL_AMOUNT = "TotalAmount";
    public static final String COLUMN_TRANS_STATUS = "TranStatus";

    public static final String COLUMN_LANG_ID = "LangID";
    public static final String COLUMN_LANG_NAME = "LangName";
    public static final String COLUMN_LANG_CODE = "LangCode";
    public static final String COLUMN_LANG_FILE_LETTER = "LangFileLetter";
    public static final String COLUMN_LANG_CULTURE_STRING = "LangCultureString";
    public static final String COLUMN_IS_AVAILABLE = "IsAvailable";

    public static final String COLUMN_ACCESS_ID = "AccessID";
    public static final String COLUMN_ACCESS_NAME = "AccessName";

    public static final String COLUMN_ORDER_DETAIL_LINK_ID = "OrderDetailLinkID";
    public static final String COLUMN_INSERT_ORDER_NO = "InsertOrderNo";
    public static final String COLUMN_PRODUCT_SET_TYPE = "ProductSetType";
    public static final String COLUMN_ORDER_STATUS_ID = "OrderStatusID";
    public static final String COLUMN_TOTAL_QTY = "TotalQty";
    public static final String COLUMN_PRICE_PER_UNIT = "PricePerUnit";
    public static final String COLUMN_TOTAL_RETAIL_PRICE = "TotalRetailPrice";
    public static final String COLUMN_ORG_PRICE_PER_UNIT = "OrgPricePerUnit";
    public static final String COLUMN_ORG_TOTAL_RETAIL_PRICE = "OrgTotalRetailPrice";
    public static final String COLUMN_INDENT_LEVEL = "IndentLevel";
    public static final String COLUMN_DISC_PRICE = "DiscPrice";
    public static final String COLUMN_DISC_OTHER_PERCENT = "DiscOtherPercent";
    public static final String COLUMN_DISC_OTHER = "DiscOther";
    public static final String COLUMN_TOTAL_ITEM_DISC = "TotalItemDisc";
    public static final String COLUMN_DISC_BILL = "DiscBill";
    public static final String COLUMN_NET_SALE = "NetSale";
    public static final String COLUMN_W_VATABLE = "WVatable";
    public static final String COLUMN_SCW_AMOUNT = "SCWAmount";
    public static final String COLUMN_SCW_VAT = "SCWVAT";
    public static final String COLUMN_SCW_BEFORE_VAT = "SCWBeforeVAT";
    public static final String COLUMN_ITEM_DISC_ALLOW = "ItemDiscAllow";
    public static final String COLUMN_DISC_PERCENT = "DiscPercent";
    public static final String COLUMN_DISC_AMOUNT = "DiscAmount";
    public static final String COLUMN_TOTAL_DISCOUNT = "TotalDiscount";
    public static final String COLUMN_SALE_PRICE = "SalePrice";
    public static final String COLUMN_PRODUCT_VAT = "ProductVAT";
    public static final String COLUMN_PRODUCT_BEFORE_VAT = "ProductBeforeVAT";
    public static final String COLUMN_TOTAL_RETAIL_VAT = "TotalRetailVAT";
    public static final String COLUMN_DISC_VAT = "DiscVAT";
    public static final String COLUMN_VATABLE = "Vatable";
    public static final String COLUMN_SC_AMOUNT = "SCAmount";
    public static final String COLUMN_SC_VAT = "SCVAT";
    public static final String COLUMN_SC_BEFORE_VAT = "SCBeforeVAT";
    public static final String COLUMN_WEIGHT_PRICE = "WeightPrice";
    public static final String COLUMN_WEIGHT_PRICE_VAT = "WeightPriceVAT";
    public static final String COLUMN_WEIGHT_PRICE_BEFORE_VAT = "WeightBeforeVAT";
    public static final String COLUMN_OTHER_FOOD_NAME = "OtherFoodName";
    public static final String COLUMN_OTHER_PRODUCT_GROUP_ID = "OtherProductGroupID";
    public static final String COLUMN_LAST_TRANSACTION_ID = "LastTransactionID";
    public static final String COLUMN_LAST_COMPUTER_ID = "LastComputerID";
    public static final String COLUMN_ORDER_STAFF_ID = "OrderStaffID";
    public static final String COLUMN_ORDER_COMPUTER_ID = "OrderComputerID";
    public static final String COLUMN_ORDER_TABLE_ID = "OrderTableID";
    public static final String COLUMN_VOID_TYPE_ID = "VoidTypeID";
    public static final String COLUMN_VOID_STAFF_ID = "VoidStaffID";
    public static final String COLUMN_VOID_DATE_TIME = "VoidDateTime";
    public static final String COLUMN_NO_PRINT_BILL = "NoPrintBill";
    public static final String COLUMN_NO_PRINT_ORDER = "NoRePrintOrder";
    public static final String COLUMN_START_TIME = "StartTime";
    public static final String COLUMN_FINISH_TIME = "FinishTime";
    public static final String COLUMN_PRINT_STATUS = "PrintStatus";
    public static final String COLUMN_PROCESS_ID = "ProcessID";
    public static final String COLUMN_SUBMIT_ORDER_DATE_TIME = "SubmitOrderDateTime";
    public static final String COLUMN_COMMENT = "Comment";

    public static final String COLUMN_CASH_CHANGE = "CashChange";
    public static final String COLUMN_CREDIT_CARD_NO = "CreditCardNo";
    public static final String COLUMN_EXPIRE_MONTH = "ExpireMonth";
    public static final String COLUMN_EXPIRE_YEAR = "ExpireYear";
    public static final String COLUMN_CHEQUE_NUMBER = "ChequeNumber";
    public static final String COLUMN_CHEQUE_DATE = "ChequeDate";
    public static final String COLUMN_PAID_BY_NAME = "PaidByName";
    public static final String COLUMN_PAID = "Paid";
    public static final String COLUMN_PREPAID_DISCOUNT_PERCENT = "PrepaidDiscountPercent";
    public static final String COLUMN_REVENUE_RATIO = "RevenueRatio";
    public static final String COLUMN_IS_FROM_EDC = "IsFromEDC";
    public static final String COLUMN_CURRENCY_CODE = "CurrencyCode";
    public static final String COLUMN_CURRENCY_NAME = "CurrencyName";
    public static final String COLUMN_MAIN_CURRENCY_RATIO = "MainCurrencyRatio";
    public static final String COLUMN_CURRENCY_RATIO = "CurrencyRatio";
    public static final String COLUMN_CURRENCY_AMOUNT = "CurrencyAmount";

    public static final String COLUMN_PRINT_NO = "PrintNo";
    public static final String COLUMN_PRINT_ID = "PrinterID";
    public static final String COLUMN_IS_PRINT_SUMMARY = "IsPrintSummary";
    public static final String COLUMN_INSERT_DATE_TIME = "InsertDateTime";
    public static final String COLUMN_PRINT_DATE_TIME = "PrintDateTime";
    public static final String COLUMN_FINISH_DATE_TIME = "FinishDateTime";
    public static final String COLUMN_PRINT_FROM_COMPUTER_ID = "PrintFromComputerID";

    public static final String COLUMN_TRANSACTION_UUID = "TransactionUUID";
    public static final String COLUMN_RESERVE_TIME = "ReserveTime";
    public static final String COLUMN_RESERVE_STAFF_ID = "ReserveStaffID";
    public static final String COLUMN_OPEN_TIME = "OpenTime";
    public static final String COLUMN_OPEN_STAFF_ID = "OpenStaffID";
    public static final String COLUMN_PAID_TIME = "PaidTime";
    public static final String COLUMN_PAID_STAFF_ID = "PaidStaffID";
    public static final String COLUMN_CLOSE_TIME = "CloseTime";
    public static final String COLUMN_COMM_STAFF_ID = "CommStaffID";
    public static final String COLUMN_DISCOUNT_ITEM = "DiscountItem";
    public static final String COLUMN_DISCOUNT_BILL = "DiscountBill";
    public static final String COLUMN_TRANSACTION_STATUS_ID = "TransactionStatusID";
    public static final String COLUMN_TRANSACTION_NAME = "TransactionName";
    public static final String COLUMN_QUEUE_NAME = "QueueName";
    public static final String COLUMN_NO_CUSTOMER = "NoCustomer";
    public static final String COLUMN_NO_CUSTOMER_WHEN_OPEN = "NoCustomerWhenOpen";
    public static final String COLUMN_RECEIPT_NUMBER = "ReceiptNumber";
    public static final String COLUMN_TRANSACTION_VAT = "TransactionVAT";
    public static final String COLUMN_TRANSACTION_VATABLE = "TransactionVATable";
    public static final String COLUMN_IS_CAL_SC = "IsCalSC";
    public static final String COLUMN_SERVICE_CHARGE_PERCENT = "ServiceChargePercent";
    public static final String COLUMN_SERVICE_CHARGE = "ServiceCharge";
    public static final String COLUMN_SERVICE_CHARGE_VAT = "ServiceChargeVAT";
    public static final String COLUMN_OTHER_INCOME = "OtherIncome";
    public static final String COLUMN_OTHER_INCOME_VAT = "OtherIncomeVAT";
    public static final String COLUMN_OTHER_INCOME_BEFORE_VAT = "OhterIncomeBeforeVAT";
    public static final String COLUMN_RECEIPT_SALE_PRICE = "ReceiptSalePrice";
    public static final String COLUMN_RECEIPT_PAY_PRICE = "ReceiptPayPrice";
    public static final String COLUMN_RECEIPT_DISCOUNT = "ReceiptDiscount";
    public static final String COLUMN_RECEIPT_TOTAL_QTY = "ReceiptTotalQty";
    public static final String COLUMN_DISCOUNT_OTHER = "DiscountOther";
    public static final String COLUMN_TRAN_BEFORE_VAT = "TranBeforeVAT";
    public static final String COLUMN_RECEIPT_RETAIL_PRICE = "ReceiptRetailPrice";
    public static final String COLUMN_RECEIPT_NET_SALE = "ReceiptNetSale";
    public static final String COLUMN_RECEIPT_ROUNDING_BILL = "ReceiptRoundingBill";
    public static final String COLUMN_SESSION_ID = "SessionID";
    public static final String COLUMN_CLOSE_COMPUTER_ID = "CloseComputerID";
    public static final String COLUMN_VOID_REASON = "VoidReason";
    public static final String COLUMN_VOID_TIME = "VoidTime";
    public static final String COLUMN_IS_CLONE_BILL = "IsCloneBill";
    public static final String COLUMN_VOID_TRANS_ID = "VoidTranID";
    public static final String COLUMN_VOID_COM_ID = "VoidComID";
    public static final String COLUMN_DIFF_CLONE_BILL = "DiffCloneBill";
    public static final String COLUMN_HAS_ORDER = "HasOrder";
    public static final String COLUMN_NO_PRiNT_BILL_DETAIL = "NoPrintBillDetail";
    public static final String COLUMN_DIFF_PAY_CHECK_BILL = "DiffPayCheckBill";
    public static final String COLUMN_BILL_DETAIL_REFERENCE_NO = "BillDetailReferenceNo";
    public static final String COLUMN_CALL_FOR_CHECK_BILl = "CallForCheckBill";
    public static final String COLUMN_TRANSACTION_NOTE = "TransactionNote";
    public static final String COLUMN_CURRENT_ACCESS_COMPUTER = "CurrentAccessComputer";
    public static final String COLUMN_BEGIN_TIME = "BeginTime";
    public static final String COLUMN_END_TIME = "EndTime";
    public static final String COLUMN_PRINT_WARNING_TIME = "PrintWarningTime";
    public static final String COLUMN_PRINT_BEGIN_TIME = "PrintBeginTime";
    public static final String COLUMN_ALREADY_CALCULATE_STOCK = "AlreadyCalculateStock";
    public static final String COLUMN_ALREADY_EXPORT_TO_HQ = "AlreadyExportToHQ";
    public static final String COLUMN_TABLE_ID = "TableID";
    public static final String COLUMN_IS_SPLIT_TRANSACTION = "IsSplitTransaction";
    public static final String COLUMN_IS_FROM_OTHER_TRANSACTION = "IsFromOtherTransaction";
    public static final String COLUMN_REFERENCE_NO = "ReferenceNo";
    public static final String COLUMN_FROM_DEPOSIT_TRANSACTION_ID = "FromDepositTransactionID";
    public static final String COLUMN_FROM_DEPOSIT_COMPUTER_ID = "FromDepositComputerID";

    public static final String COLUMN_PRODUCT_TYPE_ID = "ProductTypeID";
    public static final String COLUMN_PRODUCT_TYPE_NAME = "ProductTypeName";
    public static final String COLUMN_COMPONENT_LEVEL = "ComponentLevel";
    public static final String COLUMN_SHOW_IN_FRONT = "ShowInFront";
    public static final String COLUMN_SHOW_IN_RECEIPT = "ShowInReceipt";
    public static final String COLUMN_AUTO_ADD_MATERIAL = "AutoAddMaterial";
    public static final String COLUMN_NOT_IN_REVENUE = "NotInRevenue";
    public static final String COLUMN_WEIGHT_PRICE_FOR_REVENUE = "WeightPriceForRevenue";
    public static final String COLUMN_IS_COMMENT = "IsComment";
    public static final String COLUMN_DISPLAY_ORDERING = "DisplayOrdering";

    public static final String COLUMN_PRODUCT_VAT_ID = "ProductVATID";
    public static final String COLUMN_PRODUCT_VAT_CODE = "ProductVATCode";
    public static final String COLUMN_PRODUCT_VAT_PERCENT = "ProductVATPercent";
    public static final String COLUMN_VAT_DISPLAY = "VATDisplay";
    public static final String COLUMN_VAT_DESP = "VATDesp";

    public static final String COLUMN_PRICE_GROUP_ID = "PriceGroupID";
    public static final String COLUMN_PRICE_GROUP_DATE_ID = "PriceGroupDateID";
    public static final String COLUMN_FROM_DATE = "FromDate";
    public static final String COLUMN_TO_DATE = "ToDate";
    public static final String COLUMN_PRODUCT_PRICE_ID = "ProductPriceID";
    public static final String COLUMN_PRODUCT_PRICE = "ProductPrice";
    public static final String COLUMN_PREPAID_PRICE = "PrepaidPrice";
    public static final String COLUMN_MAIN_PRICE = "MainPrice";
    public static final String COLUMN_PRICE_REMARK = "PriceRemark";
    public static final String COLUMN_PRICE_GROUP_NAME = "PriceGroupName";

    public static final String COLUMN_PGROUP_ID = "PGroupID";
    public static final String COLUMN_START_DATE = "StartDate";
    public static final String COLUMN_END_DATE = "EndDate";
    public static final String COLUMN_SET_GROUP_NO = "SetGroupNo";
    public static final String COLUMN_SET_GROUP_NAME = "SetGroupName";
    public static final String COLUMN_REQUIRE_ADD_AMOUNT_FOR_PRODUCT = "RequireAddAmountForProduct";

    public static final String COLUMN_MATERIAL_ID = "MaterialID";
    public static final String COLUMN_MATERIAL_AMOUNT = "MaterialAmount";
    public static final String COLUMN_UNIT_SMALL_ID = "UnitSmallID";
    public static final String COLUMN_SHOW_ON_ORDER = "ShowOnOrder";
    public static final String COLUMN_DATA_TYPE = "DataType";
    public static final String COLUMN_FLEXIBLE_PRODUCT_PRICE = "FlexibleProductPrice";
    public static final String COLUMN_FLEXIBLE_PRODUCT_INCLUDE_PRICE = "FlexibleProductIncludePrice";

    public static final String COLUMN_PRODUCT_CAT_ID = "ProductCatID";
    public static final String COLUMN_PRODUCT_CAT_TYPE_ID = "ProductCatTypeID";
    public static final String COLUMN_PRODUCT_CAT_CODE = "ProductCatCode";
    public static final String COLUMN_PRODUCT_CAT_NAME = "ProductCatName";
    public static final String COLUMN_PRODUCT_CAT_DISPLAY = "ProductCatDisplay";
    public static final String COLUMN_PRODUCT_CAT_ACTIVATE = "ProductCatActivate";
    public static final String COLUMN_PRODUCT_CAT_ORDERING = "ProductCatOrdering";

    public static final String COLUMN_PRODUCT_ID = "ProductID";
    public static final String COLUMN_INVENTORY_ID = "InventoryID";
    public static final String COLUMN_PRODUCT_GROUP_ID = "ProductGroupID";
    public static final String COLUMN_PRODUCT_DEPT_ID = "ProductDeptID";
    public static final String COLUMN_PRODUCT_CAT_1ID = "ProductCat1ID";
    public static final String COLUMN_PRODUCT_CAT_2ID = "ProductCat2ID";
    public static final String COLUMN_PRODUCT_CAT_3ID = "ProductCat3ID";
    public static final String COLUMN_PRODUCT_CAT_4ID = "ProductCat4ID";
    public static final String COLUMN_PRODUCT_CAT_5ID = "ProductCat5ID";
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
    public static final String COLUMN_SALE_MODE = "SaleMode";
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

    public static final String COLUMN_PROPERTY_ID = "PropertyID";
    public static final String COLUMN_PROPERTY_LEVEL_ID = "PropertyLevelID";
    public static final String COLUMN_PROPERTY_GROUP_ID = "PropertyGroupID";
    public static final String COLUMN_PROPERTY_DEPT_ID = "PropertyDeptID";
    public static final String COLUMN_PROPERTY_FUNCTION_ID = "PropertyFunctionID";
    public static final String COLUMN_PROPERTY_NAME = "PropertyName";
    public static final String COLUMN_PROPERTY_PARAM = "PropertyParam";
    public static final String COLUMN_PROPERTY_DETAIL_URL = "PropertyDetailUrl";
    public static final String COLUMN_PROPERTY_DESP = "PropertyDesp";
    public static final String COLUMN_IS_FIX_PROPERTY = "IsFixProperty";
    public static final String COLUMN_CAN_CHANGE_AT_BRANCH = "CanChangeAtBranch";
    public static final String COLUMN_ORDERING = "Ordering";

    public static final String COLUMN_KEY_ID = "KeyID";
    public static final String COLUMN_PROPERTY_VALUE = "PropertyValue";
    public static final String COLUMN_PROPERTY_TEXT_VALUE = "PropertyTextValue";
    public static final String COLUMN_PROPERTY_DATE_VALUE = "PropertyDateValue";
    public static final String COLUMN_PROPERTY_DECIMAL_VALUE = "PropertyDecimalValue";

    public static final String COLUMN_SALE_MODE_ID = "SaleModeID";
    public static final String COLUMN_SALE_MODE_NAME = "SaleModeName";
    public static final String COLUMN_POSITION_PREFIX = "PositionPrefix";
    public static final String COLUMN_PREFIX_TEXT = "PrefixText";
    public static final String COLUMN_PREFIX_TEXT_PRINTTING = "PrefixTextPrinting";
    public static final String COLUMN_PREFIX_QUEUE = "PrefixQueue";
    public static final String COLUMN_PREFIX_RECEIPT_HEADER_TEXT = "ReceiptHeaderText";

    public static final String COLUMN_SHOP_CAT_ID = "ShopCatID";
    public static final String COLUMN_SHOP_CAT_GROUP_ID = "ShopCatGroupID";
    public static final String COLUMN_SHOP_CAT_NAME = "ShopCatName";

    public static final String COLUMN_SHOP_ID = "ShopID";
    public static final String COLUMN_SHOP_CODE = "ShopCode";
    public static final String COLUMN_SHOP_NAME = "ShopName";
    public static final String COLUMN_IS_SHOP = "IsShop";
    public static final String COLUMN_IS_INV = "IsInv";
    public static final String COLUMN_HAS_SC = "HasSC";
    public static final String COLUMN_IS_SC_BEFORE_DISC = "IsSCBeforeDisc";
    public static final String COLUMN_SC_PERCENT = "SCPercent";
    public static final String COLUMN_VAT_CODE = "VATCode";
    public static final String COLUMN_VAT_TYPE = "VATType";
    public static final String COLUMN_MASTER_SHOP = "MasterShop";
    public static final String COLUMN_MASTER_SHOP_LINK = "MasterShopLink";
    public static final String COLUMN_SHOW_IN_REPORT = "ShowInReport";
    public static final String COLUMN_SHOP_TYPE_ID = "ShopTypeID";
    public static final String COLUMN_SHOP_CAT_ID1 = "ShopCatID1";
    public static final String COLUMN_SHOP_CAT_ID2 = "ShopCatID2";
    public static final String COLUMN_SHOP_CAT_ID3 = "ShopCatID3";
    public static final String COLUMN_SHOP_CAT_ID4 = "ShopCatID4";
    public static final String COLUMN_SHOP_CAT_ID5 = "ShopCatID5";
    public static final String COLUMN_SHOP_CAT_ID6 = "ShopCatID6";
    public static final String COLUMN_SHOP_CAT_ID7 = "ShopCatID7";
    public static final String COLUMN_SHOP_CAT_ID8 = "ShopCatID8";
    public static final String COLUMN_SHOP_CAT_ID9 = "ShopCatID9";
    public static final String COLUMN_SHOP_CAT_ID10 = "ShopCatID10";
    public static final String COLUMN_OPEN_HOUR = "OpenHour";
    public static final String COLUMN_CLOSE_HOUR = "CloseHour";
    public static final String COLUMN_COMPANY_NAME = "CompanyName";
    public static final String COLUMN_COMPANY_ADDRESS1 = "CompanyAddress1";
    public static final String COLUMN_COMPANY_ADDRESS2 = "CompanyAddress2";
    public static final String COLUMN_COMPANY_CITY = "CompanyCity";
    public static final String COLUMN_COMPANY_PROVINCE = "CompanyProvince";
    public static final String COLUMN_DISPLAY_COMPANY_PROVINCE_LANG_ID = "DisplayCompanyProvinceLangID";
    public static final String COLUMN_COMPANY_ZIPCODE = "CompanyZipCode";
    public static final String COLUMN_COMPANY_TELEPHONE = "CompanyTelephone";
    public static final String COLUMN_COMPANY_FAX = "CompanyFax";
    public static final String COLUMN_COMPANY_COUNTRY = "CompanyCountry";
    public static final String COLUMN_COMPANY_TAX_ID = "CompanyTaxID";
    public static final String COLUMN_COMPANY_REGISTER_ID = "CompanyRegisterID";
    public static final String COLUMN_ACCOUNTING_CODE = "AccountingCode";
    public static final String COLUMN_DELIVERY_NAME = "DeliveryName";
    public static final String COLUMN_DELIVERY_ADDRESS1 = "DeliveryAddress1";
    public static final String COLUMN_DELIVERY_ADDRESS2 = "DeliveryAddress2";
    public static final String COLUMN_DELIVERY_CITY = "DeliveryCity";
    public static final String COLUMN_DELIVERY_PROVINCE = "DeliveryProvince";
    public static final String COLUMN_DELIVERY_ZIPCODE = "DeliveryZipCode";
    public static final String COLUMN_DELIVERY_TELLEPHONE = "DeliveryTelephone";
    public static final String COLUMN_DELIVERY_FAX = "DeliveryFax";
    public static final String COLUMN_IP_ADDRESS = "IPAddress";
    public static final String COLUMN_ADDITIONAL = "Addtional";
    public static final String COLUMN_PRODUCTLEVEL_ORDER = "ProductLevelOrder";

    public static void main(String args[]) throws Exception {
        Schema schema = new Schema(SCHEMA_VERSION, SCHEMA);
        createBankNameEntity(schema);
        createComputerNameEntity(schema);
        createCreditCardTypeEntity(schema);
        createDocumentEntity(schema);
        createDocumentTypeEntity(schema);
        createFcCardHistoryEntity(schema);
        createFcCardInfoEntity(schema);
        createFcTransDetailEntity(schema);
        createFcTransPaymentEntity(schema);
        createFcTransactionEntity(schema);
        createLanguageEntity(schema);
        createLogAccessInfoEntity(schema);

        createOrderDetailEntity(schema);
        createOrderPayDetailEntity(schema);
        createOrderPrintJobEntity(schema);
        createOrderTransactionEntity(schema);

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
        createProgramPropertyEntity(schema);
        createProgramPropertyValueEntity(schema);
        createShopCategoryEntity(schema);
        createShopDataEntity(schema);
        createStaffEntity(schema);
        createStaffRoleEntity(schema);
        createSessionEntity(schema);
        createSessionEnddayDetailEntity(schema);
        createSaleModeEntiry(schema);
        new DaoGenerator().generateAll(schema, args[0]);
    }

    public static void createBankNameEntity(Schema schema){
        Entity bankName = schema.addEntity(BANK_NAME_ENTITY);
        bankName.setTableName(BANK_NAME_ENTITY);
        bankName.addIntProperty(COLUMN_BANK_NAME_ID).columnName(COLUMN_BANK_NAME_ID).primaryKey();
        bankName.addStringProperty(COLUMN_BANK_NAME).columnName(COLUMN_BANK_NAME);
        bankName.addIntProperty(COLUMN_DELETED).columnName(COLUMN_DELETED);
        bankName.setSkipTableCreation(true);
    }

    public static void createComputerNameEntity(Schema schema){
        Entity computerName = schema.addEntity(COMPUTER_NAME_ENTITY);
        computerName.setTableName(COMPUTER_NAME_ENTITY);
        computerName.addIntProperty(COLUMN_COMPUTER_ID).columnName(COLUMN_COMPUTER_ID).primaryKey();
        computerName.addStringProperty(COLUMN_COMPUTER_NAME).columnName(COLUMN_COMPUTER_NAME);
        computerName.addIntProperty(COLUMN_SHOP_ID).columnName(COLUMN_SHOP_ID);
        computerName.addIntProperty(COLUMN_COMPUTER_TYPE).columnName(COLUMN_COMPUTER_TYPE);
        computerName.addStringProperty(COLUMN_IP_ADDRESS).columnName(COLUMN_IP_ADDRESS);
        computerName.addStringProperty(COLUMN_REGISTRATION_NUMBER).columnName(COLUMN_REGISTRATION_NUMBER);
        computerName.addStringProperty(COLUMN_DEVICE_CODE).columnName(COLUMN_DEVICE_CODE);
        computerName.addIntProperty(COLUMN_KDS_ID).columnName(COLUMN_KDS_ID);
        computerName.addStringProperty(COLUMN_DESCRIPTION).columnName(COLUMN_DESCRIPTION);
        computerName.addIntProperty(COLUMN_DELETED).columnName(COLUMN_DELETED);
        computerName.setSkipTableCreation(true);
    }

    public static void createCreditCardTypeEntity(Schema schema){
        Entity creditCardType = schema.addEntity(CREDIT_CARD_TYPE_ENTITY);
        creditCardType.setTableName(CREDIT_CARD_TYPE_ENTITY);
        creditCardType.addIntProperty(COLUMN_CREDIT_CARD_TYPE_ID).columnName(COLUMN_CREDIT_CARD_TYPE_ID).primaryKey();
        creditCardType.addIntProperty(COLUMN_CREDIT_CARD_TYPE).columnName(COLUMN_CREDIT_CARD_TYPE);
        creditCardType.addIntProperty(COLUMN_DELETED).columnName(COLUMN_DELETED);
        creditCardType.setSkipTableCreation(true);
    }

    public static void createDocumentEntity(Schema schema){
        Entity document = schema.addEntity(DOCUMENT_ENTITY);
        document.setTableName(DOCUMENT_ENTITY);
        document.addIntProperty(COLUMN_DOCUMENT_ID).columnName(COLUMN_DOCUMENT_ID).primaryKey();
        document.addIntProperty(COLUMN_SHOP_ID).columnName(COLUMN_SHOP_ID);
        document.addIntProperty(COLUMN_VENDOR_ID).columnName(COLUMN_VENDOR_ID);
        document.addIntProperty(COLUMN_VENDOR_GROUP_ID).columnName(COLUMN_VENDOR_GROUP_ID);
        document.addIntProperty(COLUMN_VENDOR_SHOP_ID).columnName(COLUMN_VENDOR_SHOP_ID);
        document.addIntProperty(COLUMN_DOCUMENT_TYPE_ID).columnName(COLUMN_DOCUMENT_TYPE_ID);
        document.addIntProperty(COLUMN_DOCUMENT_YEAR).columnName(COLUMN_DOCUMENT_YEAR);
        document.addIntProperty(COLUMN_DOCUMENT_MONTH).columnName(COLUMN_DOCUMENT_MONTH);
        document.addIntProperty(COLUMN_DOCUMENT_NUMBER).columnName(COLUMN_DOCUMENT_NUMBER);
        document.addStringProperty(COLUMN_DOCUMENT_DATE).columnName(COLUMN_DOCUMENT_DATE);
        document.addIntProperty(COLUMN_INPUT_BY).columnName(COLUMN_INPUT_BY);
        document.addIntProperty(COLUMN_UPDATE_BY).columnName(COLUMN_UPDATE_BY);
        document.addIntProperty(COLUMN_APPROVE_BY).columnName(COLUMN_APPROVE_BY);
        document.addIntProperty(COLUMN_VOID_BY).columnName(COLUMN_VOID_BY);
        document.addIntProperty(COLUMN_RECEIPT_BY).columnName(COLUMN_RECEIPT_BY);
        document.addIntProperty(COLUMN_DOCUMENT_STATUS).columnName(COLUMN_DOCUMENT_STATUS);
        document.addIntProperty(COLUMN_INVOICE_REF).columnName(COLUMN_INVOICE_REF);
        document.addStringProperty(COLUMN_DOCUMENT_UUID).columnName(COLUMN_DOCUMENT_UUID);
        document.addIntProperty(COLUMN_DOCUMENT_ID_REF).columnName(COLUMN_DOCUMENT_ID_REF);
        document.addIntProperty(COLUMN_DOCUMENT_ID_REF_SHOP_ID).columnName(COLUMN_DOCUMENT_ID_REF_SHOP_ID);
        document.addIntProperty(COLUMN_INVENTORY_ID).columnName(COLUMN_INVENTORY_ID);
        document.addIntProperty(COLUMN_TO_INV_ID).columnName(COLUMN_TO_INV_ID);
        document.addIntProperty(COLUMN_FROM_INV_ID).columnName(COLUMN_FROM_INV_ID);
        document.addIntProperty(COLUMN_FROM_TEMPLATE_ID).columnName(COLUMN_FROM_TEMPLATE_ID);
        document.addIntProperty(COLUMN_FROM_TEMPLATE_SHOP_ID).columnName(COLUMN_FROM_TEMPLATE_SHOP_ID);
        document.addIntProperty(COLUMN_IS_SMALL_UNIT).columnName(COLUMN_IS_SMALL_UNIT);
        document.addStringProperty(COLUMN_REMARK).columnName(COLUMN_REMARK);
        document.addIntProperty(COLUMN_TERM_OF_PAYMENT).columnName(COLUMN_TERM_OF_PAYMENT);
        document.addStringProperty(COLUMN_DUE_DATE).columnName(COLUMN_DUE_DATE);
        document.addStringProperty(COLUMN_DOCUMENT_HEADER).columnName(COLUMN_DOCUMENT_HEADER);
        document.addIntProperty(COLUMN_CREDIT_DAY).columnName(COLUMN_CREDIT_DAY);
        document.addStringProperty(COLUMN_INSERT_DATE).columnName(COLUMN_INSERT_DATE);
        document.addStringProperty(COLUMN_UPDATE_DATE).columnName(COLUMN_UPDATE_DATE);
        document.addStringProperty(COLUMN_APPROVE_DATE).columnName(COLUMN_APPROVE_DATE);
        document.addStringProperty(COLUMN_CANCEL_DATE).columnName(COLUMN_CANCEL_DATE);
        document.addIntProperty(COLUMN_NEW_SEND).columnName(COLUMN_NEW_SEND);
        document.addIntProperty(COLUMN_CURRENT_STAFF_ACCESS).columnName(COLUMN_CURRENT_STAFF_ACCESS);
        document.addDoubleProperty(COLUMN_OTHER_PERCENT_DISCOUNT).columnName(COLUMN_OTHER_PERCENT_DISCOUNT);
        document.addDoubleProperty(COLUMN_OTHER_AMOUNT_DISCOUNT).columnName(COLUMN_OTHER_AMOUNT_DISCOUNT);
        document.addIntProperty(COLUMN_DOCUMENT_VAT_TYPE).columnName(COLUMN_DOCUMENT_VAT_TYPE);
        document.addDoubleProperty(COLUMN_VAT_PERCENT).columnName(COLUMN_VAT_PERCENT);
        document.addIntProperty(COLUMN_LOCK_EDIT_DETAIL).columnName(COLUMN_LOCK_EDIT_DETAIL);
        document.addIntProperty(COLUMN_DOCUMENT_BATCH_ID).columnName(COLUMN_DOCUMENT_BATCH_ID);
        document.addIntProperty(COLUMN_DOCUMENT_BATCH_SHOP_ID).columnName(COLUMN_DOCUMENT_BATCH_SHOP_ID);
        document.addIntProperty(COLUMN_ALREADY_SEND_TO_HQ).columnName(COLUMN_ALREADY_SEND_TO_HQ);
        document.addIntProperty(COLUMN_ALREADY_EXPORT_TO_BRANCH).columnName(COLUMN_ALREADY_EXPORT_TO_BRANCH);
        document.addIntProperty(COLUMN_IS_UPDATE_DOC_DETAIL).columnName(COLUMN_IS_UPDATE_DOC_DETAIL);
        document.setSkipTableCreation(true);
    }

    public static void createDocumentTypeEntity(Schema schema){
        Entity documentType = schema.addEntity(DOCUMENT_TYPE_ENTITY);
        documentType.setTableName(DOCUMENT_TYPE_ENTITY);
        documentType.addIntProperty(COLUMN_DOCUMENT_TYPE_ID).columnName(COLUMN_DOCUMENT_TYPE_ID).primaryKey();
        documentType.addIntProperty(COLUMN_SHOP_ID).columnName(COLUMN_SHOP_ID);
        documentType.addIntProperty(COLUMN_COMPUTER_ID).columnName(COLUMN_COMPUTER_ID);
        documentType.addIntProperty(COLUMN_DOCUMENT_STORE_CODE).columnName(COLUMN_DOCUMENT_STORE_CODE);
        documentType.addStringProperty(COLUMN_DOCUMENT_TYPE_HEADER).columnName(COLUMN_DOCUMENT_TYPE_HEADER);
        documentType.addStringProperty(COLUMN_DOCUMENT_TYPE_NAME).columnName(COLUMN_DOCUMENT_TYPE_NAME);
        documentType.addStringProperty(COLUMN_DOCUMENT_TYPE_NAME_LANG1).columnName(COLUMN_DOCUMENT_TYPE_NAME_LANG1);
        documentType.addStringProperty(COLUMN_DOCUMENT_TYPE_NAME_LANG2).columnName(COLUMN_DOCUMENT_TYPE_NAME_LANG2);
        documentType.addStringProperty(COLUMN_DOCUMENT_TYPE_NAME_LANG3).columnName(COLUMN_DOCUMENT_TYPE_NAME_LANG3);
        documentType.addStringProperty(COLUMN_DOCUMENT_TYPE_NAME_LANG4).columnName(COLUMN_DOCUMENT_TYPE_NAME_LANG4);
        documentType.addStringProperty(COLUMN_DOCUMENT_TYPE_NAME_LANG5).columnName(COLUMN_DOCUMENT_TYPE_NAME_LANG5);
        documentType.addIntProperty(COLUMN_SHOW_ON_SEARCH).columnName(COLUMN_SHOW_ON_SEARCH);
        documentType.addIntProperty(COLUMN_MOVEMENT_IN_STOCK).columnName(COLUMN_MOVEMENT_IN_STOCK);
        documentType.addIntProperty(COLUMN_IS_ADD_REDUCE_DOC).columnName(COLUMN_IS_ADD_REDUCE_DOC);
        documentType.addIntProperty(COLUMN_CALCULATE_IN_PROFITLOSS).columnName(COLUMN_CALCULATE_IN_PROFITLOSS);
        documentType.addIntProperty(COLUMN_CALCULATE_NET_USE).columnName(COLUMN_CALCULATE_NET_USE);
        documentType.addIntProperty(COLUMN_CALCULATE_STANDARD_PROFITLOSS).columnName(COLUMN_CALCULATE_STANDARD_PROFITLOSS);
        documentType.addIntProperty(COLUMN_DELETED);
        documentType.setSkipTableCreation(true);
    }

    public static void createFcCardHistoryEntity(Schema schema){
        Entity fcCardHistory = schema.addEntity(FC_CARD_HISTORY_ENTITY);
        fcCardHistory.setTableName("fc_cardhistory");
        fcCardHistory.addIntProperty(COLUMN_HISTORY_ID).columnName(COLUMN_HISTORY_ID).primaryKey();
        fcCardHistory.addIntProperty(COLUMN_TRANS_UUID).columnName(COLUMN_TRANS_UUID);
        fcCardHistory.addIntProperty(COLUMN_CARD_ID).columnName(COLUMN_CARD_ID);
        fcCardHistory.addStringProperty(COLUMN_CARD_NO).columnName(COLUMN_CARD_NO);
        fcCardHistory.addIntProperty(COLUMN_TRANSACTION_ID).columnName(COLUMN_TRANSACTION_ID);
        fcCardHistory.addIntProperty(COLUMN_COMPUTER_ID).columnName(COLUMN_COMPUTER_ID);
        fcCardHistory.addIntProperty(COLUMN_SHOP_ID).columnName(COLUMN_SHOP_ID);
        fcCardHistory.addStringProperty(COLUMN_SALE_DATE).columnName(COLUMN_SALE_DATE);
        fcCardHistory.addStringProperty(COLUMN_RECEIPT_NO).columnName(COLUMN_RECEIPT_NO);
        fcCardHistory.addDoubleProperty(COLUMN_PREVIOUS_BALANCE).columnName(COLUMN_PREVIOUS_BALANCE);
        fcCardHistory.addDoubleProperty(COLUMN_TRANS_AMOUNT).columnName(COLUMN_TRANS_AMOUNT);
        fcCardHistory.addIntProperty(COLUMN_DOC_TYPE).columnName(COLUMN_DOC_TYPE);
        fcCardHistory.addIntProperty(COLUMN_STAFF_ID).columnName(COLUMN_STAFF_ID);
        fcCardHistory.addStringProperty(COLUMN_INSERT_DATE).columnName(COLUMN_INSERT_DATE);
        fcCardHistory.setSkipTableCreation(true);
    }

    public static void createFcCardInfoEntity(Schema schema){
        Entity fcCardInfo = schema.addEntity(FC_CARD_INFO_ENTITY);
        fcCardInfo.setTableName("fc_cardinfo");
        fcCardInfo.addIntProperty(COLUMN_CARD_ID).columnName(COLUMN_CARD_ID).primaryKey();
        fcCardInfo.addStringProperty(COLUMN_CARD_NO).columnName(COLUMN_CARD_NO);
        fcCardInfo.addIntProperty(COLUMN_CARD_STATUS).columnName(COLUMN_CARD_STATUS);
        fcCardInfo.addIntProperty(COLUMN_LOG_ID).columnName(COLUMN_LOG_ID);
        fcCardInfo.addDoubleProperty(COLUMN_CARD_DEPOSIT_AMOUNT).columnName(COLUMN_CARD_DEPOSIT_AMOUNT);
        fcCardInfo.addDoubleProperty(COLUMN_CARD_CURRENT_AMOUNT).columnName(COLUMN_CARD_CURRENT_AMOUNT);
        fcCardInfo.addDoubleProperty(COLUMN_CARD_LIMIT_AMOUNT).columnName(COLUMN_CARD_LIMIT_AMOUNT);
        fcCardInfo.addIntProperty(COLUMN_CREATE_STAFF_ID).columnName(COLUMN_STAFF_ID);
        fcCardInfo.addIntProperty(COLUMN_UPDATE_STAFF_ID).columnName(COLUMN_UPDATE_STAFF_ID);
        fcCardInfo.addIntProperty(COLUMN_MEMBER_ID).columnName(COLUMN_MEMBER_ID);
        fcCardInfo.addStringProperty(COLUMN_CREATE_DATE).columnName(COLUMN_CREATE_DATE);
        fcCardInfo.addStringProperty(COLUMN_UPDATE_DATE).columnName(COLUMN_UPDATE_DATE);
        fcCardInfo.addStringProperty(COLUMN_EXPIRE_DATE).columnName(COLUMN_EXPIRE_DATE);
        fcCardInfo.addIntProperty(COLUMN_DELETED).columnName(COLUMN_DELETED);
        fcCardInfo.setSkipTableCreation(true);
    }

    public static void createFcTransDetailEntity(Schema schema){
        Entity fcTranDetail = schema.addEntity(FC_TRAN_DETAIL_ENTITY);
        fcTranDetail.setTableName("fc_trandetail");
        fcTranDetail.addIntProperty(COLUMN_ORDER_DETAIL_ID).columnName(COLUMN_ORDER_DETAIL_ID).primaryKey();
        fcTranDetail.addIntProperty(COLUMN_TRANSACTION_ID).columnName(COLUMN_TRANSACTION_ID).primaryKey();
        fcTranDetail.addIntProperty(COLUMN_COMPUTER_ID).columnName(COLUMN_COMPUTER_ID).primaryKey();
        fcTranDetail.addIntProperty(COLUMN_CARD_ID).columnName(COLUMN_CARD_ID);
        fcTranDetail.addStringProperty(COLUMN_CARD_NO).columnName(COLUMN_CARD_NO);
        fcTranDetail.addIntProperty(COLUMN_SHOP_ID).columnName(COLUMN_SHOP_ID);
        fcTranDetail.addStringProperty(COLUMN_SALE_DATE).columnName(COLUMN_SALE_DATE);
        fcTranDetail.addDoubleProperty(COLUMN_TRANS_AMOUNT).columnName(COLUMN_TRANS_AMOUNT);
        fcTranDetail.addIntProperty(COLUMN_RECORD_STATUS).columnName(COLUMN_RECORD_STATUS);
        fcTranDetail.addStringProperty(COLUMN_INSERT_DATE).columnName(COLUMN_INSERT_DATE);
        fcTranDetail.setSkipTableCreation(true);
    }

    public static void createFcTransPaymentEntity(Schema schema){
        Entity fcTransPayment = schema.addEntity(FC_TRAN_PAYMENT_ENTITY);
        fcTransPayment.setTableName("fc_tranpayment");
        fcTransPayment.addIntProperty(COLUMN_PAY_DETAIL_ID).columnName(COLUMN_PAY_DETAIL_ID).primaryKey();
        fcTransPayment.addIntProperty(COLUMN_TRANSACTION_ID).columnName(COLUMN_TRANSACTION_ID).primaryKey();
        fcTransPayment.addIntProperty(COLUMN_COMPUTER_ID).columnName(COLUMN_COMPUTER_ID).primaryKey();
        fcTransPayment.addIntProperty(COLUMN_PAY_TYPE_ID).columnName(COLUMN_PAY_TYPE_ID);
        fcTransPayment.addIntProperty(COLUMN_SHOP_ID).columnName(COLUMN_SHOP_ID);
        fcTransPayment.addStringProperty(COLUMN_SALE_DATE).columnName(COLUMN_SALE_DATE);
        fcTransPayment.addDoubleProperty(COLUMN_PAY_AMOUNT).columnName(COLUMN_PAY_AMOUNT);
        fcTransPayment.addStringProperty(COLUMN_CC_NUMBER).columnName(COLUMN_CC_NUMBER);
        fcTransPayment.addIntProperty(COLUMN_CC_EXP_MONTH).columnName(COLUMN_CC_EXP_MONTH);
        fcTransPayment.addIntProperty(COLUMN_CC_EXP_YEAR).columnName(COLUMN_CC_EXP_YEAR);
        fcTransPayment.addIntProperty(COLUMN_CC_TYPE).columnName(COLUMN_CC_TYPE);
        fcTransPayment.addIntProperty(COLUMN_CC_BANK).columnName(COLUMN_CC_BANK);
        fcTransPayment.addStringProperty(COLUMN_CC_NAME).columnName(COLUMN_CC_NAME);
        fcTransPayment.addStringProperty(COLUMN_CC_APPROVE_CODE).columnName(COLUMN_CC_APPROVE_CODE);
        fcTransPayment.addStringProperty(COLUMN_CC_RESPONSE).columnName(COLUMN_CC_RESPONSE);
        fcTransPayment.addStringProperty(COLUMN_REMARK).columnName(COLUMN_REMARK);
        fcTransPayment.addStringProperty(COLUMN_INSERT_DATE).columnName(COLUMN_INSERT_DATE);
        fcTransPayment.setSkipTableCreation(true);
    }

    public static void createFcTransactionEntity(Schema schema){
        Entity fcTrans = schema.addEntity(FC_TRANSACTION_ENTITY);
        fcTrans.setTableName("fc_transaction");
        fcTrans.addIntProperty(COLUMN_TRANSACTION_ID).columnName(COLUMN_TRANSACTION_ID).primaryKey();
        fcTrans.addIntProperty(COLUMN_COMPUTER_ID).columnName(COLUMN_COMPUTER_ID).primaryKey();
        fcTrans.addStringProperty(COLUMN_TRANS_UUID).columnName(COLUMN_TRANS_UUID);
        fcTrans.addIntProperty(COLUMN_RECEIPT_YEAR).columnName(COLUMN_RECEIPT_YEAR);
        fcTrans.addIntProperty(COLUMN_RECEIPT_MONTH).columnName(COLUMN_RECEIPT_MONTH);
        fcTrans.addIntProperty(COLUMN_RECEIPT_ID).columnName(COLUMN_RECEIPT_ID);
        fcTrans.addIntProperty(COLUMN_SHOP_ID).columnName(COLUMN_RECEIPT_ID);
        fcTrans.addStringProperty(COLUMN_SALE_DATE).columnName(COLUMN_SALE_DATE);
        fcTrans.addStringProperty(COLUMN_RECEIPT_NO).columnName(COLUMN_RECEIPT_NO);
        fcTrans.addDoubleProperty(COLUMN_TOTAL_AMOUNT).columnName(COLUMN_TOTAL_AMOUNT);
        fcTrans.addIntProperty(COLUMN_TRANS_STATUS).columnName(COLUMN_TRANS_STATUS);
        fcTrans.addIntProperty(COLUMN_DOC_TYPE).columnName(COLUMN_DOC_TYPE);
        fcTrans.addIntProperty(COLUMN_STAFF_ID).columnName(COLUMN_STAFF_ID);
        fcTrans.addStringProperty(COLUMN_INSERT_DATE).columnName(COLUMN_INSERT_DATE);
        fcTrans.setSkipTableCreation(true);
    }

    public static void createLanguageEntity(Schema schema){
        Entity language = schema.addEntity(LANGUAGE_ENTITY);
        language.setTableName(LANGUAGE_ENTITY);
        language.addIntProperty(COLUMN_LANG_ID).columnName(COLUMN_LANG_ID).primaryKey();
        language.addStringProperty(COLUMN_LANG_NAME).columnName(COLUMN_LANG_NAME);
        language.addStringProperty(COLUMN_LANG_CODE).columnName(COLUMN_LANG_CODE);
        language.addStringProperty(COLUMN_LANG_FILE_LETTER).columnName(COLUMN_LANG_FILE_LETTER);
        language.addStringProperty(COLUMN_LANG_CULTURE_STRING).columnName(COLUMN_LANG_CULTURE_STRING);
        language.addIntProperty(COLUMN_IS_AVAILABLE).columnName(COLUMN_IS_AVAILABLE);
        language.setSkipTableCreation(true);
    }

    public static void createLogAccessInfoEntity(Schema schema){
        Entity logAccessInfo = schema.addEntity(LOG_ACCESS_INFO_ENTITY);
        logAccessInfo.setTableName(LOG_ACCESS_INFO_ENTITY);
        logAccessInfo.addIntProperty(COLUMN_ACCESS_ID).columnName(COLUMN_ACCESS_ID).primaryKey();
        logAccessInfo.addStringProperty(COLUMN_ACCESS_NAME).columnName(COLUMN_ACCESS_NAME);
        logAccessInfo.addIntProperty(COLUMN_DELETED).columnName(COLUMN_DELETED);
        logAccessInfo.setSkipTableCreation(true);
    }

    public static void createStaffRoleEntity(Schema schema){
        Entity staffRole = schema.addEntity(STAFF_ROLE_ENTITY);
        staffRole.setTableName(STAFF_ROLE_ENTITY);
        staffRole.addIntProperty("StaffRoleID").notNull().primaryKey();
        staffRole.addIntProperty("StaffRoleLevel");
        staffRole.addStringProperty("StaffRoleName");
        staffRole.addIntProperty("Deleted");
        staffRole.addIntProperty("AddingFromBranch");
        staffRole.setSkipTableCreation(true);
    }

    public static void createStaffEntity(Schema schema){
        Entity staff = schema.addEntity(STAFF_ENTITY);
        staff.setTableName(STAFF_ENTITY);
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
        staff.addStringProperty("StaffBirthDay");
        staff.addStringProperty("StaffAdditional");
        staff.addStringProperty("StaffIDNumber");
        staff.addStringProperty("StaffIDIssueDate");
        staff.addStringProperty("StaffIDExpiration");
        staff.addStringProperty("StaffBlood");
        staff.addStringProperty("StaffPictureFileServer");
        staff.addStringProperty("StaffPictureFileClient");
        staff.addDoubleProperty("BasedSalary");
        staff.addIntProperty("LangID");
        staff.addStringProperty("InputDate");
        staff.addIntProperty("InputBy");
        staff.addStringProperty("UpdateDate");
        staff.addIntProperty("UpdateBy");
        staff.addStringProperty("LastUseDate");
        staff.addIntProperty("Activated");
        staff.addIntProperty("Deleted");
        staff.addIntProperty("AddingFromBranch");
        staff.setSkipTableCreation(true);
    }

    public static void createOrderDetailEntity(Schema schema){
        Entity orderDetail = schema.addEntity(ORDER_DETAIL_ENTITY);
        orderDetail.setTableName(ORDER_DETAIL_ENTITY);
        orderDetail.addIntProperty(COLUMN_ORDER_DETAIL_ID).columnName(COLUMN_ORDER_DETAIL_ID).primaryKey();
        orderDetail.addIntProperty(COLUMN_TRANSACTION_ID).columnName(COLUMN_TRANSACTION_ID).primaryKey();
        orderDetail.addIntProperty(COLUMN_COMPUTER_ID).columnName(COLUMN_COMPUTER_ID).primaryKey();
        orderDetail.addIntProperty(COLUMN_COMPONENT_LEVEL).columnName(COLUMN_COMPONENT_LEVEL);
        orderDetail.addIntProperty(COLUMN_ORDER_DETAIL_LINK_ID).columnName(COLUMN_ORDER_DETAIL_LINK_ID);
        orderDetail.addIntProperty(COLUMN_INSERT_ORDER_NO).columnName(COLUMN_INSERT_ORDER_NO);
        orderDetail.addIntProperty(COLUMN_INDENT_LEVEL).columnName(COLUMN_INDENT_LEVEL);
        orderDetail.addIntProperty(COLUMN_DISPLAY_ORDERING).columnName(COLUMN_DISPLAY_ORDERING);
        orderDetail.addStringProperty(COLUMN_SALE_DATE).columnName(COLUMN_SALE_DATE);
        orderDetail.addIntProperty(COLUMN_SHOP_ID).columnName(COLUMN_SHOP_ID);
        orderDetail.addIntProperty(COLUMN_PRODUCT_ID).columnName(COLUMN_PRODUCT_ID);
        orderDetail.addIntProperty(COLUMN_PRODUCT_SET_TYPE).columnName(COLUMN_PRODUCT_SET_TYPE);
        orderDetail.addIntProperty(COLUMN_ORDER_STATUS_ID).columnName(COLUMN_ORDER_STATUS_ID);
        orderDetail.addIntProperty(COLUMN_SALE_MODE).columnName(COLUMN_SALE_MODE);
        orderDetail.addDoubleProperty(COLUMN_TOTAL_QTY).columnName(COLUMN_TOTAL_QTY);
        orderDetail.addDoubleProperty(COLUMN_PRICE_PER_UNIT).columnName(COLUMN_PRICE_PER_UNIT);
        orderDetail.addDoubleProperty(COLUMN_TOTAL_RETAIL_PRICE).columnName(COLUMN_TOTAL_RETAIL_PRICE);
        orderDetail.addDoubleProperty(COLUMN_ORG_PRICE_PER_UNIT).columnName(COLUMN_ORG_PRICE_PER_UNIT);
        orderDetail.addDoubleProperty(COLUMN_ORG_TOTAL_RETAIL_PRICE).columnName(COLUMN_ORG_TOTAL_RETAIL_PRICE);
        orderDetail.addDoubleProperty(COLUMN_DISC_PRICE).columnName(COLUMN_DISC_PRICE);
        orderDetail.addDoubleProperty(COLUMN_DISC_PERCENT).columnName(COLUMN_DISC_PERCENT);
        orderDetail.addDoubleProperty(COLUMN_DISC_AMOUNT).columnName(COLUMN_DISC_AMOUNT);
        orderDetail.addDoubleProperty(COLUMN_DISC_OTHER_PERCENT).columnName(COLUMN_DISC_OTHER_PERCENT);
        orderDetail.addDoubleProperty(COLUMN_DISC_OTHER).columnName(COLUMN_DISC_OTHER);
        orderDetail.addDoubleProperty(COLUMN_TOTAL_ITEM_DISC).columnName(COLUMN_TOTAL_ITEM_DISC);
        orderDetail.addDoubleProperty(COLUMN_SALE_PRICE).columnName(COLUMN_SALE_PRICE);
        orderDetail.addDoubleProperty(COLUMN_DISC_BILL).columnName(COLUMN_DISC_BILL);
        orderDetail.addDoubleProperty(COLUMN_TOTAL_DISCOUNT).columnName(COLUMN_TOTAL_DISCOUNT);
        orderDetail.addDoubleProperty(COLUMN_NET_SALE).columnName(COLUMN_NET_SALE);
        orderDetail.addDoubleProperty(COLUMN_VATABLE).columnName(COLUMN_VATABLE);
        orderDetail.addStringProperty(COLUMN_PRODUCT_VAT_CODE).columnName(COLUMN_PRODUCT_VAT_CODE);
        orderDetail.addStringProperty(COLUMN_VAT_DISPLAY).columnName(COLUMN_VAT_DISPLAY);
        orderDetail.addDoubleProperty(COLUMN_PRODUCT_VAT_PERCENT).columnName(COLUMN_PRODUCT_VAT_PERCENT);
        orderDetail.addDoubleProperty(COLUMN_PRODUCT_VAT).columnName(COLUMN_PRODUCT_VAT);
        orderDetail.addDoubleProperty(COLUMN_PRODUCT_BEFORE_VAT).columnName(COLUMN_PRODUCT_BEFORE_VAT);
        orderDetail.addDoubleProperty(COLUMN_TOTAL_RETAIL_VAT).columnName(COLUMN_TOTAL_RETAIL_VAT);
        orderDetail.addDoubleProperty(COLUMN_DISC_VAT).columnName(COLUMN_DISC_VAT);
        orderDetail.addIntProperty(COLUMN_IS_SC_BEFORE_DISC).columnName(COLUMN_IS_SC_BEFORE_DISC);
        orderDetail.addIntProperty(COLUMN_HAS_SERVICE_CHARGE).columnName(COLUMN_HAS_SERVICE_CHARGE);
        orderDetail.addDoubleProperty(COLUMN_SC_PERCENT).columnName(COLUMN_SC_PERCENT);
        orderDetail.addDoubleProperty(COLUMN_SC_AMOUNT).columnName(COLUMN_SC_AMOUNT);
        orderDetail.addDoubleProperty(COLUMN_SC_VAT).columnName(COLUMN_SC_VAT);
        orderDetail.addDoubleProperty(COLUMN_SC_BEFORE_VAT).columnName(COLUMN_SC_BEFORE_VAT);
        orderDetail.addDoubleProperty(COLUMN_W_VATABLE).columnName(COLUMN_W_VATABLE);
        orderDetail.addDoubleProperty(COLUMN_SCW_AMOUNT).columnName(COLUMN_SCW_AMOUNT);
        orderDetail.addDoubleProperty(COLUMN_SCW_VAT).columnName(COLUMN_SCW_VAT);
        orderDetail.addDoubleProperty(COLUMN_SCW_BEFORE_VAT).columnName(COLUMN_SCW_BEFORE_VAT);
        orderDetail.addDoubleProperty(COLUMN_WEIGHT_PRICE).columnName(COLUMN_WEIGHT_PRICE);
        orderDetail.addDoubleProperty(COLUMN_WEIGHT_PRICE_VAT).columnName(COLUMN_WEIGHT_PRICE_VAT);
        orderDetail.addDoubleProperty(COLUMN_WEIGHT_PRICE_BEFORE_VAT).columnName(COLUMN_WEIGHT_PRICE_BEFORE_VAT);
        orderDetail.addStringProperty(COLUMN_OTHER_FOOD_NAME).columnName(COLUMN_OTHER_FOOD_NAME);
        orderDetail.addIntProperty(COLUMN_OTHER_PRODUCT_GROUP_ID).columnName(COLUMN_OTHER_PRODUCT_GROUP_ID);
        orderDetail.addIntProperty(COLUMN_DISCOUNT_ALLOW).columnName(COLUMN_DISCOUNT_ALLOW);
        orderDetail.addIntProperty(COLUMN_ITEM_DISC_ALLOW).columnName(COLUMN_ITEM_DISC_ALLOW);
        orderDetail.addIntProperty(COLUMN_LAST_TRANSACTION_ID).columnName(COLUMN_LAST_TRANSACTION_ID);
        orderDetail.addIntProperty(COLUMN_LAST_COMPUTER_ID).columnName(COLUMN_LAST_COMPUTER_ID);
        orderDetail.addIntProperty(COLUMN_PRINTER_ID).columnName(COLUMN_PRINTER_ID);
        orderDetail.addIntProperty(COLUMN_INVENTORY_ID).columnName(COLUMN_INVENTORY_ID);
        orderDetail.addIntProperty(COLUMN_ORDER_STAFF_ID).columnName(COLUMN_ORDER_STAFF_ID);
        orderDetail.addIntProperty(COLUMN_ORDER_COMPUTER_ID).columnName(COLUMN_ORDER_COMPUTER_ID);
        orderDetail.addIntProperty(COLUMN_ORDER_TABLE_ID).columnName(COLUMN_ORDER_TABLE_ID);
        orderDetail.addIntProperty(COLUMN_VOID_TYPE_ID).columnName(COLUMN_VOID_TYPE_ID);
        orderDetail.addIntProperty(COLUMN_VOID_STAFF_ID).columnName(COLUMN_VOID_STAFF_ID);
        orderDetail.addStringProperty(COLUMN_VOID_DATE_TIME).columnName(COLUMN_VOID_DATE_TIME);
        orderDetail.addIntProperty(COLUMN_VAT_TYPE).columnName(COLUMN_VAT_TYPE);
        orderDetail.addIntProperty(COLUMN_PRINT_GROUP).columnName(COLUMN_PRINT_GROUP);
        orderDetail.addIntProperty(COLUMN_NO_PRINT_BILL).columnName(COLUMN_NO_PRINT_BILL);
        orderDetail.addIntProperty(COLUMN_NO_PRINT_ORDER).columnName(COLUMN_NO_PRINT_ORDER);
        orderDetail.addStringProperty(COLUMN_START_TIME).columnName(COLUMN_START_TIME);
        orderDetail.addStringProperty(COLUMN_FINISH_TIME).columnName(COLUMN_FINISH_TIME);
        orderDetail.addIntProperty(COLUMN_PRINT_STATUS).columnName(COLUMN_PRINT_STATUS);
        orderDetail.addIntProperty(COLUMN_PROCESS_ID).columnName(COLUMN_PROCESS_ID);
        orderDetail.addStringProperty(COLUMN_SUBMIT_ORDER_DATE_TIME).columnName(COLUMN_SUBMIT_ORDER_DATE_TIME);
        orderDetail.addStringProperty(COLUMN_COMMENT).columnName(COLUMN_COMMENT);
        orderDetail.addIntProperty(COLUMN_IS_COMMENT).columnName(COLUMN_IS_COMMENT);
        orderDetail.addIntProperty(COLUMN_DELETED).columnName(COLUMN_DELETED);
        orderDetail.setSkipTableCreation(true);
    }

    public static void createOrderPayDetailEntity(Schema schema){
        Entity orderPayDetail = schema.addEntity(ORDER_PAY_DETAIL_ENTITY);
        orderPayDetail.setTableName(ORDER_PAY_DETAIL_ENTITY);
        orderPayDetail.addIntProperty(COLUMN_PAY_DETAIL_ID).columnName(COLUMN_PAY_DETAIL_ID).primaryKey();
        orderPayDetail.addIntProperty(COLUMN_TRANSACTION_ID).columnName(COLUMN_TRANSACTION_ID).primaryKey();
        orderPayDetail.addIntProperty(COLUMN_COMPUTER_ID).columnName(COLUMN_COMPUTER_ID).primaryKey();
        orderPayDetail.addIntProperty(COLUMN_PAY_TYPE_ID).columnName(COLUMN_PAY_TYPE_ID);
        orderPayDetail.addDoubleProperty(COLUMN_PAY_AMOUNT).columnName(COLUMN_PAY_AMOUNT);
        orderPayDetail.addDoubleProperty(COLUMN_CASH_CHANGE).columnName(COLUMN_CASH_CHANGE);
        orderPayDetail.addStringProperty(COLUMN_CREDIT_CARD_NO).columnName(COLUMN_CREDIT_CARD_NO);
        orderPayDetail.addIntProperty(COLUMN_EXPIRE_MONTH).columnName(COLUMN_EXPIRE_MONTH);
        orderPayDetail.addIntProperty(COLUMN_EXPIRE_YEAR).columnName(COLUMN_EXPIRE_YEAR);
        orderPayDetail.addStringProperty(COLUMN_CHEQUE_NUMBER).columnName(COLUMN_CHEQUE_NUMBER);
        orderPayDetail.addStringProperty(COLUMN_CHEQUE_DATE).columnName(COLUMN_CHEQUE_DATE);
        orderPayDetail.addStringProperty(COLUMN_BANK_NAME).columnName(COLUMN_BANK_NAME);
        orderPayDetail.addIntProperty(COLUMN_CREDIT_CARD_TYPE).columnName(COLUMN_CREDIT_CARD_TYPE);
        orderPayDetail.addStringProperty(COLUMN_PAID_BY_NAME).columnName(COLUMN_PAID_BY_NAME);
        orderPayDetail.addDoubleProperty(COLUMN_PAID).columnName(COLUMN_PAID);
        orderPayDetail.addIntProperty(COLUMN_CARD_ID).columnName(COLUMN_CARD_ID);
        orderPayDetail.addStringProperty(COLUMN_CARD_NO).columnName(COLUMN_CARD_NO);
        orderPayDetail.addDoubleProperty(COLUMN_PREPAID_DISCOUNT_PERCENT).columnName(COLUMN_PREPAID_DISCOUNT_PERCENT);
        orderPayDetail.addDoubleProperty(COLUMN_REVENUE_RATIO).columnName(COLUMN_REVENUE_RATIO);
        orderPayDetail.addIntProperty(COLUMN_IS_FROM_EDC).columnName(COLUMN_IS_FROM_EDC);
        orderPayDetail.addStringProperty(COLUMN_CURRENCY_CODE).columnName(COLUMN_CURRENCY_CODE);
        orderPayDetail.addStringProperty(COLUMN_CURRENCY_NAME).columnName(COLUMN_CURRENCY_NAME);
        orderPayDetail.addDoubleProperty(COLUMN_MAIN_CURRENCY_RATIO).columnName(COLUMN_MAIN_CURRENCY_RATIO);
        orderPayDetail.addDoubleProperty(COLUMN_CURRENCY_RATIO).columnName(COLUMN_CURRENCY_RATIO);
        orderPayDetail.addDoubleProperty(COLUMN_CURRENCY_AMOUNT).columnName(COLUMN_CURRENCY_AMOUNT);
        orderPayDetail.setSkipTableCreation(true);
    }

    public static void createOrderPrintJobEntity(Schema schema){
        Entity orderPrintJob = schema.addEntity(ORDER_PRINT_JOB_ENTITY);
        orderPrintJob.setTableName(ORDER_PRINT_JOB_ENTITY);
        orderPrintJob.addIntProperty(COLUMN_TRANSACTION_ID).columnName(COLUMN_TRANSACTION_ID).primaryKey();
        orderPrintJob.addIntProperty(COLUMN_COMPUTER_ID).columnName(COLUMN_COMPUTER_ID).primaryKey();
        orderPrintJob.addIntProperty(COLUMN_ORDER_DETAIL_ID).columnName(COLUMN_ORDER_DETAIL_ID).primaryKey();
        orderPrintJob.addIntProperty(COLUMN_PRINT_NO).columnName(COLUMN_PRINT_NO).primaryKey();
        orderPrintJob.addIntProperty(COLUMN_PRINTER_ID).columnName(COLUMN_PRINTER_ID);
        orderPrintJob.addIntProperty(COLUMN_IS_PRINT_SUMMARY).columnName(COLUMN_IS_PRINT_SUMMARY);
        orderPrintJob.addStringProperty(COLUMN_INSERT_DATE_TIME).columnName(COLUMN_INSERT_DATE_TIME);
        orderPrintJob.addStringProperty(COLUMN_PRINT_DATE_TIME).columnName(COLUMN_PRINT_DATE_TIME);
        orderPrintJob.addStringProperty(COLUMN_FINISH_DATE_TIME).columnName(COLUMN_PRINT_DATE_TIME);
        orderPrintJob.addStringProperty(COLUMN_SALE_DATE).columnName(COLUMN_SALE_DATE);
        orderPrintJob.addIntProperty(COLUMN_SHOP_ID).columnName(COLUMN_SHOP_ID);
        orderPrintJob.addIntProperty(COLUMN_PRINT_FROM_COMPUTER_ID).columnName(COLUMN_PRINT_FROM_COMPUTER_ID);
        orderPrintJob.addIntProperty(COLUMN_PRINT_STATUS).columnName(COLUMN_PRINT_STATUS);
        orderPrintJob.setSkipTableCreation(true);
    }

    public static void createOrderTransactionEntity(Schema schema){
        Entity orderTransaction = schema.addEntity(ORDER_TRANSACTION_ENTITY);
        orderTransaction.setTableName(ORDER_TRANSACTION_ENTITY);
        orderTransaction.addIntProperty(COLUMN_TRANSACTION_ID).columnName(COLUMN_TRANSACTION_ID).primaryKey();
        orderTransaction.addIntProperty(COLUMN_COMPUTER_ID).columnName(COLUMN_COMPUTER_ID).primaryKey();
        orderTransaction.addStringProperty(COLUMN_TRANSACTION_UUID).columnName(COLUMN_TRANSACTION_UUID);
        orderTransaction.addStringProperty(COLUMN_RESERVE_TIME).columnName(COLUMN_RESERVE_TIME);
        orderTransaction.addIntProperty(COLUMN_RESERVE_STAFF_ID).columnName(COLUMN_RESERVE_STAFF_ID);
        orderTransaction.addStringProperty(COLUMN_OPEN_TIME).columnName(COLUMN_OPEN_TIME);
        orderTransaction.addIntProperty(COLUMN_OPEN_STAFF_ID).columnName(COLUMN_OPEN_STAFF_ID);
        orderTransaction.addStringProperty(COLUMN_PAID_TIME).columnName(COLUMN_PAID_TIME);
        orderTransaction.addIntProperty(COLUMN_PAID_STAFF_ID).columnName(COLUMN_PAID_STAFF_ID);
        orderTransaction.addStringProperty(COLUMN_CLOSE_TIME).columnName(COLUMN_CLOSE_TIME);
        orderTransaction.addIntProperty(COLUMN_COMM_STAFF_ID).columnName(COLUMN_COMM_STAFF_ID);
        orderTransaction.addDoubleProperty(COLUMN_DISCOUNT_ITEM).columnName(COLUMN_DISCOUNT_ITEM);
        orderTransaction.addDoubleProperty(COLUMN_DISCOUNT_BILL).columnName(COLUMN_DISCOUNT_BILL);
        orderTransaction.addDoubleProperty(COLUMN_DISCOUNT_OTHER).columnName(COLUMN_DISCOUNT_OTHER);
        orderTransaction.addDoubleProperty(COLUMN_TOTAL_DISCOUNT).columnName(COLUMN_TOTAL_DISCOUNT);
        orderTransaction.addIntProperty(COLUMN_TRANSACTION_STATUS_ID).columnName(COLUMN_TRANSACTION_STATUS_ID);
        orderTransaction.addIntProperty(COLUMN_SALE_MODE).columnName(COLUMN_SALE_MODE);
        orderTransaction.addStringProperty(COLUMN_TRANSACTION_NAME).columnName(COLUMN_TRANSACTION_NAME);
        orderTransaction.addStringProperty(COLUMN_QUEUE_NAME).columnName(COLUMN_QUEUE_NAME);
        orderTransaction.addIntProperty(COLUMN_NO_CUSTOMER).columnName(COLUMN_NO_CUSTOMER);
        orderTransaction.addIntProperty(COLUMN_NO_CUSTOMER_WHEN_OPEN).columnName(COLUMN_NO_CUSTOMER_WHEN_OPEN);
        orderTransaction.addIntProperty(COLUMN_DOC_TYPE).columnName(COLUMN_DOC_TYPE);
        orderTransaction.addIntProperty(COLUMN_RECEIPT_YEAR).columnName(COLUMN_RECEIPT_YEAR);
        orderTransaction.addIntProperty(COLUMN_RECEIPT_MONTH).columnName(COLUMN_RECEIPT_MONTH);
        orderTransaction.addIntProperty(COLUMN_RECEIPT_ID).columnName(COLUMN_RECEIPT_ID);
        orderTransaction.addStringProperty(COLUMN_RECEIPT_NUMBER).columnName(COLUMN_RECEIPT_NUMBER);
        orderTransaction.addStringProperty(COLUMN_SALE_DATE).columnName(COLUMN_SALE_DATE);
        orderTransaction.addIntProperty(COLUMN_SHOP_ID).columnName(COLUMN_SHOP_ID);
        orderTransaction.addDoubleProperty(COLUMN_TRANSACTION_VAT).columnName(COLUMN_TRANSACTION_VAT);
        orderTransaction.addDoubleProperty(COLUMN_TRANSACTION_VATABLE).columnName(COLUMN_TRANSACTION_VATABLE);
        orderTransaction.addDoubleProperty(COLUMN_TRAN_BEFORE_VAT).columnName(COLUMN_TRAN_BEFORE_VAT);
        orderTransaction.addStringProperty(COLUMN_VAT_CODE).columnName(COLUMN_VAT_CODE);
        orderTransaction.addDoubleProperty(COLUMN_VAT_PERCENT).columnName(COLUMN_VAT_PERCENT);
        orderTransaction.addDoubleProperty(COLUMN_SERVICE_CHARGE_PERCENT).columnName(COLUMN_SERVICE_CHARGE_PERCENT);
        orderTransaction.addDoubleProperty(COLUMN_SERVICE_CHARGE).columnName(COLUMN_SERVICE_CHARGE);
        orderTransaction.addDoubleProperty(COLUMN_SERVICE_CHARGE_VAT).columnName(COLUMN_SERVICE_CHARGE_VAT);
        orderTransaction.addDoubleProperty(COLUMN_SC_BEFORE_VAT).columnName(COLUMN_SC_BEFORE_VAT);
        orderTransaction.addDoubleProperty(COLUMN_OTHER_INCOME).columnName(COLUMN_OTHER_INCOME);
        orderTransaction.addDoubleProperty(COLUMN_OTHER_INCOME_VAT).columnName(COLUMN_OTHER_INCOME_VAT);
        orderTransaction.addDoubleProperty(COLUMN_OTHER_INCOME_BEFORE_VAT).columnName(COLUMN_OTHER_INCOME_BEFORE_VAT);
        orderTransaction.addDoubleProperty(COLUMN_RECEIPT_TOTAL_QTY).columnName(COLUMN_RECEIPT_TOTAL_QTY);
        orderTransaction.addDoubleProperty(COLUMN_RECEIPT_RETAIL_PRICE).columnName(COLUMN_RECEIPT_RETAIL_PRICE);
        orderTransaction.addDoubleProperty(COLUMN_RECEIPT_DISCOUNT).columnName(COLUMN_RECEIPT_DISCOUNT);
        orderTransaction.addDoubleProperty(COLUMN_RECEIPT_SALE_PRICE).columnName(COLUMN_RECEIPT_SALE_PRICE);
        orderTransaction.addDoubleProperty(COLUMN_RECEIPT_NET_SALE).columnName(COLUMN_RECEIPT_NET_SALE);
        orderTransaction.addDoubleProperty(COLUMN_RECEIPT_PAY_PRICE).columnName(COLUMN_RECEIPT_PAY_PRICE);
        orderTransaction.addDoubleProperty(COLUMN_RECEIPT_ROUNDING_BILL).columnName(COLUMN_RECEIPT_ROUNDING_BILL);
        orderTransaction.addIntProperty(COLUMN_SESSION_ID).columnName(COLUMN_SESSION_ID);
        orderTransaction.addIntProperty(COLUMN_CLOSE_COMPUTER_ID).columnName(COLUMN_CLOSE_COMPUTER_ID);
        orderTransaction.addIntProperty(COLUMN_VOID_STAFF_ID).columnName(COLUMN_VOID_STAFF_ID);
        orderTransaction.addStringProperty(COLUMN_VOID_REASON).columnName(COLUMN_VOID_REASON);
        orderTransaction.addStringProperty(COLUMN_VOID_TIME).columnName(COLUMN_VOID_TIME);
        orderTransaction.addIntProperty(COLUMN_IS_CLONE_BILL).columnName(COLUMN_IS_CLONE_BILL);
        orderTransaction.addIntProperty(COLUMN_VOID_TRANS_ID).columnName(COLUMN_VOID_TRANS_ID);
        orderTransaction.addIntProperty(COLUMN_VOID_COM_ID).columnName(COLUMN_VOID_COM_ID);
        orderTransaction.addDoubleProperty(COLUMN_DIFF_CLONE_BILL).columnName(COLUMN_DIFF_CLONE_BILL);
        orderTransaction.addIntProperty(COLUMN_MEMBER_ID).columnName(COLUMN_MEMBER_ID);
        orderTransaction.addIntProperty(COLUMN_HAS_ORDER).columnName(COLUMN_HAS_ORDER);
        orderTransaction.addIntProperty(COLUMN_NO_PRiNT_BILL_DETAIL).columnName(COLUMN_NO_PRiNT_BILL_DETAIL);
        orderTransaction.addDoubleProperty(COLUMN_DIFF_PAY_CHECK_BILL).columnName(COLUMN_DIFF_PAY_CHECK_BILL);
        orderTransaction.addStringProperty(COLUMN_BILL_DETAIL_REFERENCE_NO).columnName(COLUMN_BILL_DETAIL_REFERENCE_NO);
        orderTransaction.addIntProperty(COLUMN_CALL_FOR_CHECK_BILl).columnName(COLUMN_CALL_FOR_CHECK_BILl);
        orderTransaction.addStringProperty(COLUMN_TRANSACTION_NOTE).columnName(COLUMN_TRANSACTION_NOTE);
        orderTransaction.addIntProperty(COLUMN_CURRENT_ACCESS_COMPUTER).columnName(COLUMN_CURRENT_ACCESS_COMPUTER);
        orderTransaction.addStringProperty(COLUMN_UPDATE_DATE).columnName(COLUMN_UPDATE_DATE);
        orderTransaction.addStringProperty(COLUMN_BEGIN_TIME).columnName(COLUMN_BEGIN_TIME);
        orderTransaction.addStringProperty(COLUMN_END_TIME).columnName(COLUMN_END_TIME);
        orderTransaction.addStringProperty(COLUMN_PRINT_WARNING_TIME).columnName(COLUMN_PRINT_WARNING_TIME);
        orderTransaction.addStringProperty(COLUMN_PRINT_BEGIN_TIME).columnName(COLUMN_PRINT_BEGIN_TIME);
        orderTransaction.addIntProperty(COLUMN_ALREADY_CALCULATE_STOCK).columnName(COLUMN_ALREADY_CALCULATE_STOCK);
        orderTransaction.addIntProperty(COLUMN_ALREADY_EXPORT_TO_HQ).columnName(COLUMN_ALREADY_EXPORT_TO_HQ);
        orderTransaction.addIntProperty(COLUMN_TABLE_ID).columnName(COLUMN_TABLE_ID);
        orderTransaction.addIntProperty(COLUMN_IS_SPLIT_TRANSACTION).columnName(COLUMN_IS_SPLIT_TRANSACTION);
        orderTransaction.addIntProperty(COLUMN_IS_FROM_OTHER_TRANSACTION).columnName(COLUMN_IS_FROM_OTHER_TRANSACTION);
        orderTransaction.addStringProperty(COLUMN_REFERENCE_NO).columnName(COLUMN_REFERENCE_NO);
        orderTransaction.addIntProperty(COLUMN_FROM_DEPOSIT_TRANSACTION_ID).columnName(COLUMN_FROM_DEPOSIT_TRANSACTION_ID);
        orderTransaction.addIntProperty(COLUMN_FROM_DEPOSIT_COMPUTER_ID).columnName(COLUMN_FROM_DEPOSIT_COMPUTER_ID);
        orderTransaction.addIntProperty(COLUMN_DELETED).columnName(COLUMN_DELETED);
        orderTransaction.setSkipTableCreation(true);
    }

    public static void createSaleModeEntiry(Schema schema){
        Entity saleMode = schema.addEntity(SALE_MODE_ENTITY);
        saleMode.setTableName(SALE_MODE_ENTITY);
        saleMode.addIntProperty(COLUMN_SALE_MODE_ID).columnName(COLUMN_SALE_MODE_ID).primaryKey();
        saleMode.addStringProperty(COLUMN_SALE_MODE_NAME).columnName(COLUMN_SALE_MODE_NAME);
        saleMode.addIntProperty(COLUMN_DELETED).columnName(COLUMN_DELETED);
        saleMode.addIntProperty(COLUMN_POSITION_PREFIX).columnName(COLUMN_POSITION_PREFIX);
        saleMode.addStringProperty(COLUMN_PREFIX_TEXT).columnName(COLUMN_PREFIX_TEXT);
        saleMode.addStringProperty(COLUMN_PREFIX_TEXT_PRINTTING).columnName(COLUMN_PREFIX_TEXT_PRINTTING);
        saleMode.addStringProperty(COLUMN_PREFIX_QUEUE).columnName(COLUMN_PREFIX_QUEUE);
        saleMode.addStringProperty(COLUMN_PREFIX_RECEIPT_HEADER_TEXT).columnName(COLUMN_PREFIX_RECEIPT_HEADER_TEXT);
        saleMode.addIntProperty(COLUMN_HAS_SERVICE_CHARGE).columnName(COLUMN_HAS_SERVICE_CHARGE);
        saleMode.setSkipTableCreation(true);
    }

    public static void createSessionEnddayDetailEntity(Schema schema){
        Entity sessionEndday = schema.addEntity(SESSION_ENDDAY_DETAIL_ENTITY);
        sessionEndday.setTableName(SESSION_ENDDAY_DETAIL_ENTITY);
        sessionEndday.addStringProperty("SessionDate").notNull().primaryKey();
        sessionEndday.addIntProperty("ShopID").notNull();
        sessionEndday.addIntProperty("IsEndDay");
        sessionEndday.addIntProperty("EndDayStaffID");
        sessionEndday.addStringProperty("EndDayDateTime");
        sessionEndday.addIntProperty("TotalReceipt");
        sessionEndday.addDoubleProperty("TotalPayPrice");
        sessionEndday.addIntProperty("EndDayComputerID");
        sessionEndday.addIntProperty("NoOfSync");
        sessionEndday.addStringProperty("Remark");
        sessionEndday.setSkipTableCreation(true);
    }

    public static void createSessionEntity(Schema schema){
        Entity session = schema.addEntity(SESSION_ENTITY);
        session.setTableName(SESSION_ENTITY);
        session.addIntProperty("SessionID").notNull().primaryKey();
        session.addIntProperty("ComputerID").notNull();
        session.addIntProperty("OpenStaffID").notNull();
        session.addIntProperty("CloseStaffID");
        session.addStringProperty("OpenSessionDateTime");
        session.addStringProperty("CloseSessionDateTime");
        session.addStringProperty("SessionDate");
        session.addDoubleProperty("OpenSessionAmount").notNull();
        session.addDoubleProperty("CashAmount");
        session.addDoubleProperty("CashInAmount");
        session.addDoubleProperty("CashOutAmount");
        session.addDoubleProperty("CloseSessionAmount");
        session.addDoubleProperty("CashShortOver");
        session.addStringProperty("SessionUpdateDate");
        session.addIntProperty("ShopID");
        session.addIntProperty("IsEndDaySession");
        session.setSkipTableCreation(true);
    }

    public static void createShopDataEntity(Schema schema){
        Entity shopData = schema.addEntity(SHOP_DATA_ENTITY);
        shopData.setTableName(SHOP_DATA_ENTITY);
        shopData.addIntProperty(COLUMN_SHOP_ID).columnName(COLUMN_SHOP_ID).primaryKey();
        shopData.addStringProperty(COLUMN_SHOP_CODE).columnName(COLUMN_SHOP_CODE);
        shopData.addStringProperty(COLUMN_SHOP_NAME).columnName(COLUMN_SHOP_NAME);
        shopData.addIntProperty(COLUMN_IS_SHOP).columnName(COLUMN_IS_SHOP);
        shopData.addIntProperty(COLUMN_IS_INV).columnName(COLUMN_IS_INV);
        shopData.addIntProperty(COLUMN_HAS_SC).columnName(COLUMN_HAS_SC);
        shopData.addIntProperty(COLUMN_IS_SC_BEFORE_DISC).columnName(COLUMN_IS_SC_BEFORE_DISC);
        shopData.addDoubleProperty(COLUMN_SC_PERCENT).columnName(COLUMN_SC_PERCENT);
        shopData.addStringProperty(COLUMN_VAT_CODE).columnName(COLUMN_VAT_CODE);
        shopData.addIntProperty(COLUMN_VAT_TYPE).columnName(COLUMN_VAT_TYPE);
        shopData.addIntProperty(COLUMN_MASTER_SHOP).columnName(COLUMN_MASTER_SHOP);
        shopData.addIntProperty(COLUMN_MASTER_SHOP_LINK).columnName(COLUMN_MASTER_SHOP_LINK);
        shopData.addIntProperty(COLUMN_SHOW_IN_REPORT).columnName(COLUMN_SHOW_IN_REPORT);
        shopData.addIntProperty(COLUMN_SHOP_TYPE_ID).columnName(COLUMN_SHOP_TYPE_ID);
        shopData.addIntProperty(COLUMN_SHOP_CAT_ID1).columnName(COLUMN_SHOP_CAT_ID1);
        shopData.addIntProperty(COLUMN_SHOP_CAT_ID2).columnName(COLUMN_SHOP_CAT_ID2);
        shopData.addIntProperty(COLUMN_SHOP_CAT_ID3).columnName(COLUMN_SHOP_CAT_ID3);
        shopData.addIntProperty(COLUMN_SHOP_CAT_ID4).columnName(COLUMN_SHOP_CAT_ID4);
        shopData.addIntProperty(COLUMN_SHOP_CAT_ID5).columnName(COLUMN_SHOP_CAT_ID5);
        shopData.addIntProperty(COLUMN_SHOP_CAT_ID6).columnName(COLUMN_SHOP_CAT_ID6);
        shopData.addIntProperty(COLUMN_SHOP_CAT_ID7).columnName(COLUMN_SHOP_CAT_ID7);
        shopData.addIntProperty(COLUMN_SHOP_CAT_ID8).columnName(COLUMN_SHOP_CAT_ID8);
        shopData.addIntProperty(COLUMN_SHOP_CAT_ID9).columnName(COLUMN_SHOP_CAT_ID9);
        shopData.addIntProperty(COLUMN_SHOP_CAT_ID10).columnName(COLUMN_SHOP_CAT_ID10);
        shopData.addStringProperty(COLUMN_OPEN_HOUR).columnName(COLUMN_OPEN_HOUR);
        shopData.addStringProperty(COLUMN_CLOSE_HOUR).columnName(COLUMN_CLOSE_HOUR);
        shopData.addStringProperty(COLUMN_COMPANY_NAME).columnName(COLUMN_COMPANY_NAME);
        shopData.addStringProperty(COLUMN_COMPANY_ADDRESS1).columnName(COLUMN_COMPANY_ADDRESS1);
        shopData.addStringProperty(COLUMN_COMPANY_ADDRESS2).columnName(COLUMN_COMPANY_ADDRESS2);
        shopData.addStringProperty(COLUMN_COMPANY_CITY).columnName(COLUMN_COMPANY_CITY);
        shopData.addIntProperty(COLUMN_COMPANY_PROVINCE).columnName(COLUMN_COMPANY_PROVINCE);
        shopData.addIntProperty(COLUMN_DISPLAY_COMPANY_PROVINCE_LANG_ID).columnName(COLUMN_DISPLAY_COMPANY_PROVINCE_LANG_ID);
        shopData.addStringProperty(COLUMN_COMPANY_ZIPCODE).columnName(COLUMN_COMPANY_ZIPCODE);
        shopData.addStringProperty(COLUMN_COMPANY_TELEPHONE).columnName(COLUMN_COMPANY_TELEPHONE);
        shopData.addStringProperty(COLUMN_COMPANY_FAX).columnName(COLUMN_COMPANY_FAX);
        shopData.addStringProperty(COLUMN_COMPANY_COUNTRY).columnName(COLUMN_COMPANY_COUNTRY);
        shopData.addStringProperty(COLUMN_COMPANY_TAX_ID).columnName(COLUMN_COMPANY_TAX_ID);
        shopData.addStringProperty(COLUMN_COMPANY_REGISTER_ID).columnName(COLUMN_COMPANY_REGISTER_ID);
        shopData.addStringProperty(COLUMN_ACCOUNTING_CODE).columnName(COLUMN_ACCOUNTING_CODE);
        shopData.addStringProperty(COLUMN_DELIVERY_NAME).columnName(COLUMN_DELIVERY_NAME);
        shopData.addStringProperty(COLUMN_DELIVERY_ADDRESS1).columnName(COLUMN_DELIVERY_ADDRESS1);
        shopData.addStringProperty(COLUMN_DELIVERY_ADDRESS2).columnName(COLUMN_DELIVERY_ADDRESS2);
        shopData.addStringProperty(COLUMN_DELIVERY_CITY).columnName(COLUMN_DELIVERY_CITY);
        shopData.addIntProperty(COLUMN_DELIVERY_PROVINCE).columnName(COLUMN_DELIVERY_PROVINCE);
        shopData.addStringProperty(COLUMN_DELIVERY_ZIPCODE).columnName(COLUMN_DELIVERY_ZIPCODE);
        shopData.addStringProperty(COLUMN_DELIVERY_TELLEPHONE).columnName(COLUMN_DELIVERY_TELLEPHONE);
        shopData.addStringProperty(COLUMN_DELIVERY_FAX).columnName(COLUMN_DELIVERY_FAX);
        shopData.addStringProperty(COLUMN_IP_ADDRESS).columnName(COLUMN_IP_ADDRESS);
        shopData.addStringProperty(COLUMN_ADDITIONAL).columnName(COLUMN_ADDITIONAL);
        shopData.addIntProperty(COLUMN_PRODUCTLEVEL_ORDER).columnName(COLUMN_PRODUCTLEVEL_ORDER);
        shopData.addIntProperty(COLUMN_DELETED).columnName(COLUMN_DELETED);
        shopData.setSkipTableCreation(true);
    }

    public static void createShopCategoryEntity(Schema schema){
        Entity shopCategory = schema.addEntity(SHOP_CATEGORY_ENTITY);
        shopCategory.setTableName(SHOP_CATEGORY_ENTITY);
        shopCategory.addIntProperty(COLUMN_SHOP_CAT_ID).columnName(COLUMN_SHOP_CAT_ID).primaryKey();
        shopCategory.addIntProperty(COLUMN_SHOP_CAT_GROUP_ID).columnName(COLUMN_SHOP_CAT_GROUP_ID);
        shopCategory.addStringProperty(COLUMN_SHOP_CAT_NAME).columnName(COLUMN_SHOP_CAT_NAME);
        shopCategory.addIntProperty(COLUMN_LANG_ID).columnName(COLUMN_LANG_ID);
        shopCategory.addIntProperty(COLUMN_DELETED).columnName(COLUMN_DELETED);
        shopCategory.setSkipTableCreation(true);
    }

    public static void createProductVatEntity(Schema schema){
        Entity productVat = schema.addEntity(PRODUCT_VAT_ENTITY);
        productVat.setTableName(PRODUCT_VAT_ENTITY);
        productVat.addIntProperty(COLUMN_PRODUCT_VAT_ID).columnName(COLUMN_PRODUCT_VAT_ID).primaryKey();
        productVat.addStringProperty(COLUMN_PRODUCT_VAT_CODE).columnName(COLUMN_PRODUCT_VAT_CODE);
        productVat.addDoubleProperty(COLUMN_PRODUCT_VAT_PERCENT).columnName(COLUMN_PRODUCT_VAT_PERCENT);
        productVat.addStringProperty(COLUMN_VAT_DISPLAY).columnName(COLUMN_VAT_DISPLAY);
        productVat.addStringProperty(COLUMN_VAT_DESP).columnName(COLUMN_VAT_DESP);
        productVat.addIntProperty(COLUMN_DELETED).columnName(COLUMN_DELETED);
        productVat.setSkipTableCreation(true);
    }

    public static void createProductTypeEntity(Schema schema){
        Entity productType = schema.addEntity(PRODUCT_TYPE_ENTITY);
        productType.setTableName(PRODUCT_TYPE_ENTITY);
        productType.addIntProperty(COLUMN_PRODUCT_TYPE_ID).columnName(COLUMN_PRODUCT_TYPE_ID).primaryKey();
        productType.addStringProperty(COLUMN_PRODUCT_TYPE_NAME).columnName(COLUMN_PRODUCT_TYPE_NAME);
        productType.addIntProperty(COLUMN_COMPONENT_LEVEL).columnName(COLUMN_COMPONENT_LEVEL);
        productType.addIntProperty(COLUMN_SHOW_IN_FRONT).columnName(COLUMN_SHOW_IN_FRONT);
        productType.addIntProperty(COLUMN_SHOW_IN_RECEIPT).columnName(COLUMN_SHOW_IN_RECEIPT);
        productType.addIntProperty(COLUMN_AUTO_ADD_MATERIAL).columnName(COLUMN_AUTO_ADD_MATERIAL);
        productType.addIntProperty(COLUMN_NOT_IN_REVENUE).columnName(COLUMN_NOT_IN_REVENUE);
        productType.addIntProperty(COLUMN_WEIGHT_PRICE_FOR_REVENUE).columnName(COLUMN_WEIGHT_PRICE_FOR_REVENUE);
        productType.addIntProperty(COLUMN_IS_COMMENT).columnName(COLUMN_IS_COMMENT);
        productType.addIntProperty(COLUMN_DISPLAY_ORDERING).columnName(COLUMN_DISPLAY_ORDERING);
        productType.addIntProperty(COLUMN_DELETED).columnName(COLUMN_DELETED);
        productType.setSkipTableCreation(true);
    }

    public static void createProgramPropertyEntity(Schema schema){
        Entity programProperty = schema.addEntity(PROGRAM_PROPERTY_ENTITY);
        programProperty.setTableName(PROGRAM_PROPERTY_ENTITY);
        programProperty.addIntProperty(COLUMN_PROPERTY_ID).columnName(COLUMN_PROPERTY_ID).primaryKey();
        programProperty.addIntProperty(COLUMN_PROPERTY_LEVEL_ID).columnName(COLUMN_PROPERTY_LEVEL_ID);
        programProperty.addIntProperty(COLUMN_PROPERTY_GROUP_ID).columnName(COLUMN_PROPERTY_GROUP_ID);
        programProperty.addIntProperty(COLUMN_PROPERTY_DEPT_ID).columnName(COLUMN_PROPERTY_DEPT_ID);
        programProperty.addIntProperty(COLUMN_PROPERTY_FUNCTION_ID).columnName(COLUMN_PROPERTY_FUNCTION_ID);
        programProperty.addStringProperty(COLUMN_PROPERTY_NAME).columnName(COLUMN_PROPERTY_NAME);
        programProperty.addStringProperty(COLUMN_PROPERTY_PARAM).columnName(COLUMN_PROPERTY_PARAM);
        programProperty.addStringProperty(COLUMN_PROPERTY_DETAIL_URL).columnName(COLUMN_PROPERTY_DETAIL_URL);
        programProperty.addStringProperty(COLUMN_PROPERTY_DESP).columnName(COLUMN_PROPERTY_DESP);
        programProperty.addIntProperty(COLUMN_IS_FIX_PROPERTY).columnName(COLUMN_IS_FIX_PROPERTY);
        programProperty.addIntProperty(COLUMN_CAN_CHANGE_AT_BRANCH).columnName(COLUMN_CAN_CHANGE_AT_BRANCH);
        programProperty.addIntProperty(COLUMN_ORDERING).columnName(COLUMN_ORDERING);
        programProperty.addIntProperty(COLUMN_DELETED).columnName(COLUMN_DELETED);
        programProperty.setSkipTableCreation(true);
    }

    public static void createProgramPropertyValueEntity(Schema schema){
        Entity programPropertyValue = schema.addEntity(PROGRAM_PROPERTY_VALUE_ENTITY);
        programPropertyValue.setTableName(PROGRAM_PROPERTY_VALUE_ENTITY);
        programPropertyValue.addIntProperty(COLUMN_PROPERTY_ID).columnName(COLUMN_PROPERTY_ID).primaryKey();
        programPropertyValue.addIntProperty(COLUMN_KEY_ID).columnName(COLUMN_KEY_ID).primaryKey();
        programPropertyValue.addIntProperty(COLUMN_PROPERTY_VALUE).columnName(COLUMN_PROPERTY_VALUE);
        programPropertyValue.addStringProperty(COLUMN_PROPERTY_TEXT_VALUE).columnName(COLUMN_PROPERTY_TEXT_VALUE);
        programPropertyValue.addStringProperty(COLUMN_PROPERTY_DATE_VALUE).columnName(COLUMN_PROPERTY_DATE_VALUE);
        programPropertyValue.addDoubleProperty(COLUMN_PROPERTY_DECIMAL_VALUE).columnName(COLUMN_PROPERTY_DECIMAL_VALUE);
        programPropertyValue.addIntProperty(COLUMN_UPDATE_STAFF_ID).columnName(COLUMN_UPDATE_STAFF_ID);
        programPropertyValue.addStringProperty(COLUMN_UPDATE_DATE).columnName(COLUMN_UPDATE_DATE);
        programPropertyValue.setSkipTableCreation(true);
    }

    public static void createProductPriceGroupShopEntity(Schema schema){
        Entity productPriceGroupShop = schema.addEntity(PRODUCT_PRICE_GROUP_SHOP_ENTITY);
        productPriceGroupShop.setTableName(PRODUCT_PRICE_GROUP_SHOP_ENTITY);
        productPriceGroupShop.addIntProperty(COLUMN_PRICE_GROUP_ID).columnName(COLUMN_PRICE_GROUP_ID).primaryKey();
        productPriceGroupShop.addIntProperty(COLUMN_SHOP_ID).columnName(COLUMN_SHOP_ID).primaryKey();
        productPriceGroupShop.setSkipTableCreation(true);
    }

    public static void createProductPriceGroupDateEntity(Schema schema){
        Entity productPriceGroupDate = schema.addEntity(PRODUCT_PRICE_GROUP_DATE_ENTITY);
        productPriceGroupDate.setTableName(PRODUCT_PRICE_GROUP_DATE_ENTITY);
        productPriceGroupDate.addIntProperty(COLUMN_PRICE_GROUP_DATE_ID).columnName(COLUMN_PRICE_GROUP_DATE_ID).primaryKey();
        productPriceGroupDate.addStringProperty(COLUMN_FROM_DATE).columnName(COLUMN_FROM_DATE);
        productPriceGroupDate.addStringProperty(COLUMN_TO_DATE).columnName(COLUMN_TO_DATE);
        productPriceGroupDate.addIntProperty(COLUMN_DELETED).columnName(COLUMN_DELETED);
        productPriceGroupDate.setSkipTableCreation(true);
    }

    public static void createProductPriceGroupDataEntity(Schema schema){
        Entity productPriceGroupData = schema.addEntity(PRODUCT_PRICE_GROUP_DATA_ENTITY);
        productPriceGroupData.setTableName(PRODUCT_PRICE_GROUP_DATA_ENTITY);
        productPriceGroupData.addIntProperty(COLUMN_PRICE_GROUP_DATE_ID).columnName(COLUMN_PRICE_GROUP_DATE_ID).primaryKey();
        productPriceGroupData.addIntProperty(COLUMN_PRICE_GROUP_ID).columnName(COLUMN_PRICE_GROUP_ID).primaryKey();
        productPriceGroupData.addIntProperty(COLUMN_PRODUCT_PRICE_ID).columnName(COLUMN_PRODUCT_PRICE_ID).primaryKey();
        productPriceGroupData.addIntProperty(COLUMN_PRODUCT_ID).columnName(COLUMN_PRODUCT_ID);
        productPriceGroupData.addDoubleProperty(COLUMN_PRODUCT_PRICE).columnName(COLUMN_PRODUCT_PRICE);
        productPriceGroupData.addDoubleProperty(COLUMN_PREPAID_PRICE).columnName(COLUMN_PREPAID_PRICE);
        productPriceGroupData.addDoubleProperty(COLUMN_MAIN_PRICE).columnName(COLUMN_MAIN_PRICE);
        productPriceGroupData.addIntProperty(COLUMN_SALE_MODE).columnName(COLUMN_SALE_MODE);
        productPriceGroupData.addStringProperty(COLUMN_PRICE_REMARK).columnName(COLUMN_PRICE_REMARK);
        productPriceGroupData.addIntProperty(COLUMN_ADDING_FROM_BRANCH).columnName(COLUMN_ADDING_FROM_BRANCH);
        productPriceGroupData.setSkipTableCreation(true);
    }

    public static void createProductPriceGroupEntity(Schema schema){
        Entity productPriceGroup = schema.addEntity(PRODUCT_PRICE_GROUP_ENTITY);
        productPriceGroup.setTableName(PRODUCT_PRICE_GROUP_ENTITY);
        productPriceGroup.addIntProperty(COLUMN_PRICE_GROUP_ID).columnName(COLUMN_PRICE_GROUP_ID).primaryKey();
        productPriceGroup.addStringProperty(COLUMN_PRICE_GROUP_NAME).columnName(COLUMN_PRICE_GROUP_NAME);
        productPriceGroup.addIntProperty(COLUMN_DELETED).columnName(COLUMN_DELETED);
        productPriceGroup.setSkipTableCreation(true);
    }

    public static void createProductPriceEntity(Schema schema){
        Entity productPrice = schema.addEntity(PRODUCT_PRICE_ENTITY);
        productPrice.setTableName(PRODUCT_PRICE_ENTITY);
        productPrice.addIntProperty(COLUMN_PRODUCT_PRICE_ID).columnName(COLUMN_PRODUCT_PRICE_ID).primaryKey();
        productPrice.addIntProperty(COLUMN_PRODUCT_ID).columnName(COLUMN_PRODUCT_ID);
        productPrice.addDoubleProperty(COLUMN_PRODUCT_PRICE).columnName(COLUMN_PRODUCT_PRICE);
        productPrice.addDoubleProperty(COLUMN_PREPAID_PRICE).columnName(COLUMN_PREPAID_PRICE);
        productPrice.addDoubleProperty(COLUMN_MAIN_PRICE).columnName(COLUMN_MAIN_PRICE);
        productPrice.addIntProperty(COLUMN_SALE_MODE).columnName(COLUMN_SALE_MODE);
        productPrice.addStringProperty(COLUMN_PRICE_REMARK).columnName(COLUMN_PRICE_REMARK);
        productPrice.addStringProperty(COLUMN_FROM_DATE).columnName(COLUMN_FROM_DATE);
        productPrice.addStringProperty(COLUMN_TO_DATE).columnName(COLUMN_TO_DATE);
        productPrice.addIntProperty(COLUMN_ADDING_FROM_BRANCH).columnName(COLUMN_ADDING_FROM_BRANCH);
        productPrice.setSkipTableCreation(true);
    }

    public static void createProductComponentGroupEntity(Schema schema){
        Entity productCompGroup = schema.addEntity(PRODUCT_COMPONENT_GROUP_ENTITY);
        productCompGroup.setTableName(PRODUCT_COMPONENT_GROUP_ENTITY);
        productCompGroup.addIntProperty(COLUMN_PGROUP_ID).columnName(COLUMN_PGROUP_ID).primaryKey();
        productCompGroup.addIntProperty(COLUMN_PRODUCT_ID).columnName(COLUMN_PRODUCT_ID);
        productCompGroup.addIntProperty(COLUMN_SALE_MODE).columnName(COLUMN_SALE_MODE);
        productCompGroup.addStringProperty(COLUMN_START_DATE).columnName(COLUMN_START_DATE);
        productCompGroup.addStringProperty(COLUMN_END_DATE).columnName(COLUMN_END_DATE);
        productCompGroup.addIntProperty(COLUMN_SET_GROUP_NO).columnName(COLUMN_SET_GROUP_NO);
        productCompGroup.addStringProperty(COLUMN_SET_GROUP_NAME).columnName(COLUMN_SET_GROUP_NAME);
        productCompGroup.addIntProperty(COLUMN_REQUIRE_ADD_AMOUNT_FOR_PRODUCT).columnName(COLUMN_REQUIRE_ADD_AMOUNT_FOR_PRODUCT);
        productCompGroup.addIntProperty(COLUMN_ADDING_FROM_BRANCH).columnName(COLUMN_ADDING_FROM_BRANCH);
        productCompGroup.setSkipTableCreation(true);
    }

    public static void createProductComponentEntity(Schema schema){
        Entity productComponent = schema.addEntity(PRODUCT_COMPONENT_ENTITY);
        productComponent.setTableName(PRODUCT_COMPONENT_ENTITY);
        productComponent.addIntProperty(COLUMN_PGROUP_ID).columnName(COLUMN_PGROUP_ID).primaryKey();
        productComponent.addIntProperty(COLUMN_PRODUCT_ID).columnName(COLUMN_PRODUCT_ID).primaryKey();
        productComponent.addIntProperty(COLUMN_SALE_MODE).columnName(COLUMN_SALE_MODE).primaryKey();
        productComponent.addIntProperty(COLUMN_MATERIAL_ID).columnName(COLUMN_MATERIAL_ID).primaryKey();
        productComponent.addDoubleProperty(COLUMN_MATERIAL_AMOUNT).columnName(COLUMN_MATERIAL_AMOUNT);
        productComponent.addIntProperty(COLUMN_UNIT_SMALL_ID).columnName(COLUMN_UNIT_SMALL_ID);
        productComponent.addIntProperty(COLUMN_SHOW_ON_ORDER).columnName(COLUMN_SHOW_ON_ORDER);
        productComponent.addIntProperty(COLUMN_DATA_TYPE).columnName(COLUMN_DATA_TYPE);
        productComponent.addDoubleProperty(COLUMN_FLEXIBLE_PRODUCT_PRICE).columnName(COLUMN_FLEXIBLE_PRODUCT_PRICE);
        productComponent.addIntProperty(COLUMN_FLEXIBLE_PRODUCT_INCLUDE_PRICE).columnName(COLUMN_FLEXIBLE_PRODUCT_INCLUDE_PRICE);
        productComponent.addIntProperty(COLUMN_ORDERING).columnName(COLUMN_ORDERING);
        productComponent.addIntProperty(COLUMN_ADDING_FROM_BRANCH).columnName(COLUMN_ADDING_FROM_BRANCH);
        productComponent.setSkipTableCreation(true);
    }

    public static void createProductCategoryEntity(Schema schema){
        Entity productCat = schema.addEntity(PRODUCT_CATEGORY_ENTITY);
        productCat.setTableName(PRODUCT_CATEGORY_ENTITY);
        productCat.addIntProperty(COLUMN_PRODUCT_CAT_ID).columnName(COLUMN_PRODUCT_CAT_ID).primaryKey();
        productCat.addIntProperty(COLUMN_SHOP_ID).columnName(COLUMN_SHOP_ID);
        productCat.addIntProperty(COLUMN_PRODUCT_CAT_TYPE_ID).columnName(COLUMN_PRODUCT_CAT_TYPE_ID);
        productCat.addStringProperty(COLUMN_PRODUCT_CAT_CODE).columnName(COLUMN_PRODUCT_CAT_CODE);
        productCat.addStringProperty(COLUMN_PRODUCT_CAT_NAME).columnName(COLUMN_PRODUCT_CAT_NAME);
        productCat.addIntProperty(COLUMN_PRODUCT_CAT_DISPLAY).columnName(COLUMN_PRODUCT_CAT_DISPLAY);
        productCat.addIntProperty(COLUMN_PRODUCT_CAT_ACTIVATE).columnName(COLUMN_PRODUCT_CAT_ACTIVATE);
        productCat.addIntProperty(COLUMN_PRODUCT_CAT_ORDERING).columnName(COLUMN_PRODUCT_CAT_ORDERING);
        productCat.addIntProperty(COLUMN_DELETED).columnName(COLUMN_DELETED);
        productCat.addIntProperty(COLUMN_IS_COMMENT).columnName(COLUMN_IS_COMMENT);
        productCat.addIntProperty(COLUMN_ADDING_FROM_BRANCH).columnName(COLUMN_ADDING_FROM_BRANCH);
        productCat.setSkipTableCreation(true);
    }

    public static void createProductDeptEntity(Schema schema){
        Entity productDept = schema.addEntity(PRODUCT_DEPT_ENTITY);
        productDept.setTableName(PRODUCT_DEPT_ENTITY);
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
        productGroup.setTableName(PRODUCT_GROUP_ENTITY);
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
        products.setTableName(PRODUCTS_ENTITY);
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
        products.addStringProperty(COLUMN_DURATION_TIME).columnName(COLUMN_DURATION_TIME);
        products.addIntProperty(COLUMN_HAS_SERVICE_CHARGE).columnName(COLUMN_HAS_SERVICE_CHARGE);
        products.addIntProperty(COLUMN_IS_OUTOF_STOCK).columnName(COLUMN_IS_OUTOF_STOCK);
        products.addIntProperty(COLUMN_AUTO_COMMENT).columnName(COLUMN_AUTO_COMMENT);
        products.addIntProperty(COLUMN_IS_DISPLAY_BILl).columnName(COLUMN_IS_DISPLAY_BILl);
        products.addIntProperty(COLUMN_IS_PRINT_CHECK).columnName(COLUMN_IS_PRINT_CHECK);
        products.addIntProperty(COLUMN_IS_PRINT_RECEIPT).columnName(COLUMN_IS_PRINT_RECEIPT);
        products.addIntProperty(COLUMN_CAN_RETURN_PRODUCT).columnName(COLUMN_CAN_RETURN_PRODUCT);
        products.addIntProperty(COLUMN_DISPLAY_AT_CHECKER_SYSTEM).columnName(COLUMN_DISPLAY_AT_CHECKER_SYSTEM);
        products.addStringProperty(COLUMN_PRODUCT_ENABLE_DATE_TIME).columnName(COLUMN_PRODUCT_ENABLE_DATE_TIME);
        products.addStringProperty(COLUMN_PRODUCT_EXPIRE_DATE_TIME).columnName(COLUMN_PRODUCT_EXPIRE_DATE_TIME);
        products.addStringProperty(COLUMN_PRODUCT_ENABLE_DAY_STRING).columnName(COLUMN_PRODUCT_ENABLE_DAY_STRING);
        products.addStringProperty(COLUMN_WARNING_TIME).columnName(COLUMN_WARNING_TIME);
        products.addStringProperty(COLUMN_CRITICAL_TIME).columnName(COLUMN_CRITICAL_TIME);
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
        products.addStringProperty(COLUMN_INSERT_DATE).columnName(COLUMN_INSERT_DATE);
        products.addStringProperty(COLUMN_UPDATE_DATE).columnName(COLUMN_UPDATE_DATE);
        products.setSkipTableCreation(true);
    }
}
