package com.vtec.j1tth4.vtecpos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

/**
 * Created by j1tth4 on 4/1/15.
 */
public class CashPaymentFragment extends Fragment{

    static final String[] PAYMENT_BUTTONS = {
            "1,000",
            "500",
            "100",
            "50",
            "20"
    };

    private GridView mGvPaymentButton;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mGvPaymentButton = (GridView) view.findViewById(R.id.gvPaymentButton);

        mGvPaymentButton.setAdapter(new PaymentButtonAdapter());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.cash_payment_fragment, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
}
