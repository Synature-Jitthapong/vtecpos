package com.vtec.j1tth4.vtecpos;

import android.content.Context;

import com.vtec.j1tth4.vtecpos.provider.PayDetail;
import com.vtec.j1tth4.vtecpos.provider.Transaction;

import java.util.HashMap;
import java.util.List;

/**
 * Created by j1tth4 on 5/21/15.
 */
public abstract class CommonPrint {

    public static final int HORIZONTAL_MAX_SPACE = 45;
    public static final int QTY_MAX_SPACE = 12;
    public static final int MAX_TEXT_LENGTH = 32;
    public static final int MAX_TEXT_WITH_QTY_LENGTH = 25;
    public static final String CARRIAGE_RETURN = "\r\n";

    protected Context mContext;
    private StringBuffer mTextToPrint;

    public static class PrintReceiptModel{
        private List<HashMap<String, String>> commonLines;
        private List<Transaction.OrderDetail> orderDetails;
        private List<PayDetail> payDetails;

        public PrintReceiptModel(List<Transaction.OrderDetail> orderDetails,
                                 List<PayDetail> payDetails,
                                 List<HashMap<String, String>> commonLines){
            this.orderDetails = orderDetails;
            this.payDetails = payDetails;
            this.commonLines = commonLines;
        }

        public List<Transaction.OrderDetail> getOrderDetails() {
            return orderDetails;
        }

        public void setOrderDetails(List<Transaction.OrderDetail> mOrderDetailLst) {
            this.orderDetails = mOrderDetailLst;
        }

        public List<PayDetail> getPayDetails() {
            return payDetails;
        }

        public void setPayDetails(List<PayDetail> mPayDetailLst) {
            this.payDetails = mPayDetailLst;
        }

        public List<HashMap<String, String>> getCommonLines() {
            return commonLines;
        }

        public void setCommonLines(List<HashMap<String, String>> commonLines) {
            this.commonLines = commonLines;
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
                    // thai
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
                    && code != 3662
                    // lao
                    && code != 3761
                    && code != 3764
                    && code != 3765
                    && code != 3766
                    && code != 3767
                    && code != 3768
                    && code != 3769
                    && code != 3771
                    && code != 3772
                    && code != 3784
                    && code != 3785
                    && code != 3786
                    && code != 3787
                    && code != 3788
                    && code != 3789){
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

        //detail
        if(model.getOrderDetails() != null){
            for (Transaction.OrderDetail orderDetail : model.getOrderDetails()){
                String name = limitTextLength(orderDetail.getProductName());
                String qty = Utils.qtyFormat(mContext, orderDetail.getTotalQty());
                String retailPrice = Utils.currencyFormat(mContext, orderDetail.getPricePerUnit()) +
                        createQtySpace(calculateLength(qty));
                mTextToPrint.append(name);
                mTextToPrint.append(createHorizontalSpace(
                        calculateLength(name) +
                                calculateLength(retailPrice)));
                mTextToPrint.append(retailPrice);
                mTextToPrint.append(CARRIAGE_RETURN);
            }
            mTextToPrint.append(createLine("-") + CARRIAGE_RETURN);
        }

        if(model.getPayDetails() != null){
            for(PayDetail payDetail : model.getPayDetails()){

            }
        }
        //footer
    }
}