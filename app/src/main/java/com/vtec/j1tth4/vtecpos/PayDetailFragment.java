package com.vtec.j1tth4.vtecpos;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.vtec.j1tth4.vtecpos.provider.PayDetail;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import de.greenrobot.event.EventBus;

/**
 * Created by j1tth4 on 5/21/15.
 */
public class PayDetailFragment extends Fragment {

    private List<PayDetail> mPayList;
    private PayListAdapter mPayListAdapter;

    private RecyclerView mLvPayment;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPayList = new ArrayList<>();
        mPayListAdapter = new PayListAdapter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.payment_list_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mLvPayment = (RecyclerView) view.findViewById(R.id.lvPayList);
        mLvPayment.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mLvPayment.setLayoutManager(mLayoutManager);

        mLvPayment.setLayoutManager(mLayoutManager);
        mLvPayment.setAdapter(mPayListAdapter);
    }

    private void loadPaymentDetail(){
        TransactionManager manager = TransactionManager.getInstance(getActivity());
        mPayList = manager.listPayDetail(true);
        mPayListAdapter.notifyDataSetChanged();
    }

    public void onEvent(PaymentActivity.PaymentAddedEvent event){
        loadPaymentDetail();
    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }

    private class PayListAdapter extends RecyclerView.Adapter<PayListAdapter.ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = getActivity().getLayoutInflater().inflate(R.layout.payment_item,
                    parent, false);
            ViewHolder holder = new ViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            final PayDetail payDetail = mPayList.get(position);
            holder.pay_no.setText(String.valueOf(position + 1));
            holder.pay_type_name.setText(payDetail.getPayTypeName());
            holder.pay_amount.setText(NumberFormat.getInstance().format(payDetail.getPayAmount()));
            holder.pay_del.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    new AlertDialog.Builder(getActivity())
                            .setTitle(R.string.delete)
                            .setMessage(R.string.confirm_delete)
                            .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {

                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                }
                            })
                            .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    TransactionManager manager = TransactionManager.getInstance(getActivity());
                                    manager.deletePaymentDetail(payDetail.getPayTypeID());
                                    loadPaymentDetail();
                                    EventBus.getDefault().post(new PaymentActivity.PaymentDeletedEvent());
                                    EventBus.getDefault().post(new CashPaymentFragment.RecalculateEvent());
                                }
                            }).show();
                }
            });
        }

        @Override
        public int getItemCount() {
            return mPayList != null ? mPayList.size() : 0;
        }

        public class ViewHolder extends RecyclerView.ViewHolder{

            public TextView pay_no;
            public TextView pay_type_name;
            public TextView pay_amount;
            public ImageButton pay_del;

            public ViewHolder(View itemView) {
                super(itemView);
                pay_no = (TextView) itemView.findViewById(R.id.pay_no);
                pay_type_name = (TextView) itemView.findViewById(R.id.pay_type_name);
                pay_amount = (TextView) itemView.findViewById(R.id.pay_amount);
                pay_del = (ImageButton) itemView.findViewById(R.id.pay_del);
            }
        }
    }

}
