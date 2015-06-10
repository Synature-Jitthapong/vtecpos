package com.vtec.j1tth4.vtecpos;

import android.content.Context;

import java.util.List;

/**
 * Created by j1tth4 on 5/21/15.
 */
public class CommonPrint{
    public static final int HORIZONTAL_MAX_SPACE = 45;
    public static final int QTY_MAX_SPACE = 12;
    public static final int MAX_TEXT_LENGTH = 32;
    public static final int MAX_TEXT_WITH_QTY_LENGTH = 25;
    public static final String CARRIAGE_RETURN = "\r\n";

    protected Context mContext;
    private StringBuffer mTextToPrint;

    public static class PrintReceiptModel{
        private Transaction transaction;
        private String staffName;
        private List<ReceiptHeaderFooter> headerLine;
        private List<ReceiptHeaderFooter> footerLine;
        private List<Transaction.OrderDetail> orderDetails;
        private List<PayDetail> payDetails;

        public PrintReceiptModel(Transaction trans,
                                 String staffName,
                                 List<Transaction.OrderDetail> orderDetails,
                                 List<PayDetail> payDetails,
                                 List<ReceiptHeaderFooter> headerLine,
                                 List<ReceiptHeaderFooter> footerLine){
            this.transaction = trans;
            this.staffName = staffName;
            this.orderDetails = orderDetails;
            this.payDetails = payDetails;
            this.headerLine = headerLine;
            this.footerLine = footerLine;
        }

        public List<Transaction.OrderDetail> getOrderDetails() {
            return orderDetails;
        }

        public List<PayDetail> getPayDetails() {
            return payDetails;
        }

        public List<ReceiptHeaderFooter> getHeaderLine() {
            return headerLine;
        }

        public List<ReceiptHeaderFooter> getFooterLine() {
            return footerLine;
        }

        public Transaction getTransaction() {
            return transaction;
        }

        public String getStaffName() {
            return staffName;
        }
    }

    public CommonPrint(Context c){
        mContext = c;
        mTextToPrint = new StringBuffer();
    }

    protected String createHorizontalSpace(int usedSpace){
        StringBuilder space = new StringBuilder();
        if(usedSpace > HORIZONTAL_MAX_SPACE){
            usedSpace = HORIZONTAL_MAX_SPACE - 2;
        }
        for(int i = usedSpace; i <= HORIZONTAL_MAX_SPACE; i++){
            space.append(" ");
        }
        return space.toString();
    }

    protected String adjustAlignCenter(String text){
        int rimSpace = (HORIZONTAL_MAX_SPACE - calculateLength(text)) / 2;
        StringBuilder empText = new StringBuilder();
        for(int i = 0; i < rimSpace; i++){
            empText.append(" ");
        }
        return empText.toString() + text + empText.toString();
    }

    protected String limitTextWithQtyLength(String text){
        if(text == null)
            return "";
        if(text.length() > MAX_TEXT_WITH_QTY_LENGTH)
            text = text.substring(0, MAX_TEXT_WITH_QTY_LENGTH) + "...";
        return text;
    }

    protected String limitTextLength(String text){
        if(text == null)
            return "";
        if(text.length() > MAX_TEXT_LENGTH)
            text = text.substring(0, MAX_TEXT_LENGTH) + "...";
        return text;
    }

    protected int calculateLength(String text){
        if(text == null)
            return 0;
        int length = 0;
        for(int i = 0; i < text.length(); i++){
            int code = (int) text.charAt(i);
            if(code != 3633
                    && code != 3636
                    && code != 3637
                    && code != 3638
                    && code != 3639
                    && code != 3640
                    && code != 3641
                    && code != 3642
                    && code != 3655
                    && code != 3656
                    && code != 3657
                    && code != 3658
                    && code != 3659
                    && code != 3660
                    && code != 3661
                    && code != 3662){
                length ++;
            }
        }
        return length == 0 ? text.length() : length;
    }

    protected String createQtySpace(int usedSpace){
        StringBuilder space = new StringBuilder();
        if(usedSpace > QTY_MAX_SPACE){
            usedSpace = QTY_MAX_SPACE - 2;
        }
        for(int i = usedSpace; i <= QTY_MAX_SPACE; i++){
            space.append(" ");
        }
        return space.toString();
    }

    protected String createLine(String sign){
        StringBuilder line = new StringBuilder();
        for(int i = 0; i <= HORIZONTAL_MAX_SPACE; i++){
            line.append(sign);
        }
        return line.toString();
    }

    public StringBuffer getTextToPrint() {
        return mTextToPrint;
    }

    protected void createReceiptText(PrintReceiptModel model){
        //header
        for(ReceiptHeaderFooter headerLine : model.getHeaderLine()){
            mTextToPrint.append(adjustAlignCenter(headerLine.getTextInLine()));
            mTextToPrint.append(CARRIAGE_RETURN);
        }
        mTextToPrint.append(mContext.getString(R.string.print_date) + ": " + Utils.shortDateTimeFormat(mContext));
        mTextToPrint.append(CARRIAGE_RETURN);

        Transaction trans = model.getTransaction();
        mTextToPrint.append(mContext.getString(R.string.receipt_no) + ": " + trans.getReceiptNumber());
        mTextToPrint.append(CARRIAGE_RETURN);
        mTextToPrint.append(mContext.getString(R.string.staff) + ": " + model.getStaffName());
        mTextToPrint.append(CARRIAGE_RETURN);

        //detail
        if(model.getOrderDetails() != null){
            String headerItem = mContext.getString(R.string.item);
            String headerRetailPrice = mContext.getString(R.string.price);
            String headerQty = mContext.getString(R.string.qty) +
                    createQtySpace(calculateLength(headerRetailPrice));
            mTextToPrint.append(createLine("-"));
            mTextToPrint.append(CARRIAGE_RETURN);
            mTextToPrint.append(headerItem);
            mTextToPrint.append(createHorizontalSpace(
                    calculateLength(headerItem + headerQty + headerRetailPrice)));
            mTextToPrint.append(headerQty);
            mTextToPrint.append(headerRetailPrice);
            mTextToPrint.append(CARRIAGE_RETURN);
            mTextToPrint.append(createLine("-"));
            mTextToPrint.append(CARRIAGE_RETURN);
            for (Transaction.OrderDetail orderDetail : model.getOrderDetails()){
                String name = limitTextWithQtyLength(orderDetail.getProductName());
                String retailPrice = Utils.currencyFormat(mContext, orderDetail.getPricePerUnit());
                String qty = Utils.qtyFormat(mContext, orderDetail.getTotalQty()) +
                        createQtySpace(calculateLength(retailPrice));
                mTextToPrint.append(name);
                mTextToPrint.append(createHorizontalSpace(
                        calculateLength(name + qty + retailPrice)));
                mTextToPrint.append(qty);
                mTextToPrint.append(retailPrice);
                mTextToPrint.append(CARRIAGE_RETURN);
            }
            mTextToPrint.append(createLine("-") + CARRIAGE_RETURN);
        }

        String subTotal = Utils.currencyFormat(mContext, trans.getReceiptRetailPrice());
        String items = mContext.getString(R.string.items) + " ";
        String itemQty = Utils.qtyFormat(mContext, trans.getReceiptTotalQty()) + createQtySpace(calculateLength(subTotal));

        mTextToPrint.append(items);
        mTextToPrint.append(createHorizontalSpace(
                calculateLength(items + itemQty + subTotal)));
        mTextToPrint.append(itemQty);
        mTextToPrint.append(subTotal);
        mTextToPrint.append(CARRIAGE_RETURN);

        if(trans.getServiceCharge() > 0){
            String label = mContext.getString(R.string.service_charge);
            String value = Utils.currencyFormat(mContext, trans.getServiceCharge());
            mTextToPrint.append(label);
            mTextToPrint.append(createHorizontalSpace(
                    calculateLength(label + value)));
            mTextToPrint.append(value);
            mTextToPrint.append(CARRIAGE_RETURN);

//            label = mContext.getString(R.string.service_charge_vat);
//            value = Utils.currencyFormat(mContext, trans.getServiceChargeVAT());
//            mTextToPrint.append(label);
//            mTextToPrint.append(createHorizontalSpace(
//                    calculateLength(label + value)));
//            mTextToPrint.append(value);
//            mTextToPrint.append(CARRIAGE_RETURN);
        }

        String total = mContext.getString(R.string.total) + ".........";
        String totalSale =  Utils.currencyFormat(mContext, trans.getReceiptNetSale());
        mTextToPrint.append(total);
        mTextToPrint.append(createHorizontalSpace(
                calculateLength(total + totalSale)));
        mTextToPrint.append(totalSale);
        mTextToPrint.append(CARRIAGE_RETURN);

        if(model.getPayDetails() != null){
            for(PayDetail payDetail : model.getPayDetails()){
                String label = payDetail.getPayTypeName();
                String value = Utils.currencyFormat(mContext, payDetail.getPayAmount());

                if(payDetail.getPayTypeID() == PaymentDataSource.PAY_TYPE_CASH){
                    if(payDetail.getPayAmount() > payDetail.getPaid()){
                        label = payDetail.getPayTypeName() + " "
                                + Utils.currencyFormat(mContext, payDetail.getPayAmount());
                        value = mContext.getString(R.string.change) + " "
                                + Utils.currencyFormat(mContext, payDetail.getPayAmount() - payDetail.getPaid());
                    }
                }

                mTextToPrint.append(label);
                mTextToPrint.append(
                        createHorizontalSpace(
                                calculateLength(label + value)));
                mTextToPrint.append(value);
                mTextToPrint.append(CARRIAGE_RETURN);
            }
        }

        mTextToPrint.append(createLine("="));
        mTextToPrint.append(CARRIAGE_RETURN);

        //footer
        for(ReceiptHeaderFooter footerLine : model.getFooterLine()){
            mTextToPrint.append(adjustAlignCenter(footerLine.getTextInLine()));
            mTextToPrint.append(CARRIAGE_RETURN);
        }
    }
}
