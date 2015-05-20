package com.vtec.j1tth4.vtecpos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;

import com.vtec.j1tth4.vtecpos.provider.PayDetail;
import com.vtec.j1tth4.vtecpos.provider.Transaction;

import java.text.NumberFormat;
import java.text.ParseException;

import de.greenrobot.event.EventBus;

/**
 * Created by j1tth4 on 4/1/15.
 */
public class CashPaymentFragment extends Fragment{

    public static final int PAY_TYPE_CASH = 1;

    static final String[] PAYMENT_BUTTONS = {
            "1,000",
            "500",
            "100",
            "50",
            "20"
    };

    private double mTotalDue;
    private double mTotalCash;
    private StringBuilder mStrCashAmount;

    private EditText mTxtDisplay;
    private GridView mGvPaymentButton;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mGvPaymentButton = (GridView) view.findViewById(R.id.gvPaymentButton);
        mTxtDisplay = (EditText) view.findViewById(R.id.txtCashDisplay);

        mGvPaymentButton.setAdapter(new PaymentButtonAdapter());

        ((Button) view.findViewById(R.id.btnCash9)).setOnClickListener(mOnClickListener);
        ((Button) view.findViewById(R.id.btnCash8)).setOnClickListener(mOnClickListener);
        ((Button) view.findViewById(R.id.btnCash7)).setOnClickListener(mOnClickListener);
        ((Button) view.findViewById(R.id.btnCash6)).setOnClickListener(mOnClickListener);
        ((Button) view.findViewById(R.id.btnCash5)).setOnClickListener(mOnClickListener);
        ((Button) view.findViewById(R.id.btnCash4)).setOnClickListener(mOnClickListener);
        ((Button) view.findViewById(R.id.btnCash3)).setOnClickListener(mOnClickListener);
        ((Button) view.findViewById(R.id.btnCash2)).setOnClickListener(mOnClickListener);
        ((Button) view.findViewById(R.id.btnCash1)).setOnClickListener(mOnClickListener);
        ((Button) view.findViewById(R.id.btnCash0)).setOnClickListener(mOnClickListener);
        ((Button) view.findViewById(R.id.btnCashDel)).setOnClickListener(mOnClickListener);
        ((Button) view.findViewById(R.id.btnCashClear)).setOnClickListener(mOnClickListener);
        ((Button) view.findViewById(R.id.btnCashEnter)).setOnClickListener(mOnClickListener);

        calculate();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.cash_payment_fragment, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mStrCashAmount = new StringBuilder();
    }

    private class PaymentButtonAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return PAYMENT_BUTTONS.length;
        }

        @Override
        public Object getItem(int i) {
            return PAYMENT_BUTTONS[i];
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHolder holder;
            if(view == null){
                holder = new ViewHolder();
                view = getActivity().getLayoutInflater().inflate(R.layout.payment_button_item, viewGroup, false);
                holder.tvLabel = (TextView) view.findViewById(R.id.textView);
                view.setTag(holder);
            }else{
                holder = (ViewHolder) view.getTag();
            }
            holder.tvLabel.setText(PAYMENT_BUTTONS[i]);
            return view;
        }

        class ViewHolder{
            TextView tvLabel;
        }
    }

    private void display(){
        try {
            mTotalCash = Double.parseDouble(mStrCashAmount.toString());
        } catch (NumberFormatException e) {
            mTotalCash = 0;
        }
        mTxtDisplay.setText(NumberFormat.getInstance().format(mTotalCash));
    }

    private void calculate(){
        TransactionManager manager = TransactionManager.getInstance(getActivity());
        Transaction trans = manager.getTransaction();
        PayDetail payDetail = manager.getPayDetail();
        double netSale = trans.getReceiptNetSale();
        double totalPaid = payDetail.getPaid();
        double totalPayAmount = payDetail.getPayAmount();
        double change = 0;
        mTotalDue = netSale - totalPaid;
        if(totalPayAmount > netSale){
            change = totalPayAmount - netSale;
        }
        EventBus.getDefault().post(new PaymentActivity.PaymentEvent(totalPaid, mTotalDue, change));
    }


    private void insertPayDetail(){
        if(mTotalDue > 0 && mTotalCash > 0) {
            double paid = mTotalCash > mTotalDue ? mTotalDue : mTotalCash;
            TransactionManager manager = TransactionManager.getInstance(getActivity());
            PayDetail payDetail = new PayDetail();
            payDetail.setPayTypeID(PAY_TYPE_CASH);
            payDetail.setPaid(paid);
            payDetail.setPayAmount(mTotalCash);
            payDetail.setBankName("");
            manager.insertPayDetail(payDetail);
            calculate();
        }
    }

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int id = v.getId();
            switch (id){
                case R.id.btnCash9:
                    mStrCashAmount.append("9");
                    display();
                    break;
                case R.id.btnCash8:
                    mStrCashAmount.append("8");
                    display();
                    break;
                case R.id.btnCash7:
                    mStrCashAmount.append("7");
                    display();
                    break;
                case R.id.btnCash6:
                    mStrCashAmount.append("6");
                    display();
                    break;
                case R.id.btnCash5:
                    mStrCashAmount.append("5");
                    display();
                    break;
                case R.id.btnCash4:
                    mStrCashAmount.append("4");
                    display();
                    break;
                case R.id.btnCash3:
                    mStrCashAmount.append("3");
                    display();
                    break;
                case R.id.btnCash2:
                    mStrCashAmount.append("2");
                    display();
                    break;
                case R.id.btnCash1:
                    mStrCashAmount.append("1");
                    display();
                    break;
                case R.id.btnCash0:
                    mStrCashAmount.append("0");
                    display();
                    break;
                case R.id.btnCashEnter:
                    insertPayDetail();
                    mStrCashAmount = new StringBuilder();
                    display();
                    break;
                case R.id.btnCashClear:
                    mStrCashAmount = new StringBuilder();
                    display();
                    break;
                case R.id.btnCashDel:
                    try {
                        mStrCashAmount.deleteCharAt(mStrCashAmount.length() - 1);
                    } catch (Exception e) {
                        mStrCashAmount = new StringBuilder();
                    }
                    display();
                    break;
            }
        }
    };
}
