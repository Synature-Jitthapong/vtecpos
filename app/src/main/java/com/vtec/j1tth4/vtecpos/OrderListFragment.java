package com.vtec.j1tth4.vtecpos;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.vtec.j1tth4.vtecpos.provider.Transaction;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import de.greenrobot.event.EventBus;

/**
 * Created by j1tth4 on 3/27/15.
 */
public class OrderListFragment extends Fragment{

    private EventBus mBus = EventBus.getDefault();

    private List<Transaction.OrderDetail> mOrderList;
    private OrderListAdapter mOrderAdapter;
    private RecyclerView mLvOrder;
    private ListView mLvOrderSummary;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.order_list_fragment, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBus.register(this);
        TransactionManager manager = TransactionManager.getInstance(getActivity());
        mOrderList = manager.getOrder();
    }

    @Override
    public void onDestroy() {
        mBus.unregister(this);
        super.onDestroy();
    }

    public void onEvent(MenuClickEvent event){
        TransactionManager manager = TransactionManager.getInstance(getActivity());
        mOrderList = manager.getOrder();
        mOrderAdapter.notifyDataSetChanged();
        mLvOrder.scrollToPosition(mOrderAdapter.getItemCount());
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mLvOrder = (RecyclerView) view.findViewById(R.id.lvOrder);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mLvOrder.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getActivity());
        mLvOrder.setLayoutManager(mLayoutManager);

        mOrderAdapter = new OrderListAdapter();
        mLvOrder.setAdapter(mOrderAdapter);

        mLvOrderSummary = (ListView) view.findViewById(R.id.lvSummary);
        mLvOrderSummary.setAdapter(new OrderSummaryListAdapter());
    }

    private class OrderListAdapter extends RecyclerView.Adapter<OrderListAdapter.ViewHolder>{

        public class ViewHolder extends RecyclerView.ViewHolder {
            TextView tvOrderQty;
            TextView tvOrderTitle;
            TextView tvOrderSub;
            TextView tvOrderPrice;
            ImageButton btnMore;

            public ViewHolder(View itemView) {
                super(itemView);
                tvOrderQty = (TextView) itemView.findViewById(R.id.tvOrderQty);
                tvOrderTitle = (TextView) itemView.findViewById(R.id.tvOrderTitle);
                tvOrderSub = (TextView) itemView.findViewById(R.id.tvOrderSub);
                tvOrderPrice = (TextView) itemView.findViewById(R.id.tvOrderPrice);
                btnMore = (ImageButton) itemView.findViewById(R.id.btnMore);
            }
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view = getActivity().getLayoutInflater().inflate(R.layout.order_item, viewGroup, false);
            ViewHolder holder = new ViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            Transaction.OrderDetail orderDetail = mOrderList.get(i);
            viewHolder.tvOrderQty.setText(NumberFormat.getInstance().format(orderDetail.getTotalQty()));
            viewHolder.tvOrderTitle.setText(orderDetail.getProductName());
            viewHolder.tvOrderPrice.setText(NumberFormat.getCurrencyInstance(new Locale("th", "TH")).format(orderDetail.getTotalRetailPrice()));
        }

        @Override
        public int getItemCount() {
            return mOrderList != null ? mOrderList.size() : 0;
        }
    }

    private class OrderSummaryListAdapter extends BaseAdapter{

        List<SummaryItem> summaryItemList = new ArrayList<SummaryItem>();

        public OrderSummaryListAdapter(){
            summaryItemList.add(
                    new SummaryItem(
                            getActivity().getString(R.string.items) + " 6",
                            "10.00",
                            SummaryItem.SUMM_NORMAL));
            summaryItemList.add(
                    new SummaryItem(
                            getActivity().getString(R.string.discount_short),
                            "0.00",
                            SummaryItem.SUMM_NORMAL));

            summaryItemList.add(
                    new SummaryItem(
                            getActivity().getString(R.string.total),
                            "1,200.00",
                            SummaryItem.SUMM_LARGE));
        }

        @Override
        public int getCount() {
            return summaryItemList.size();
        }

        @Override
        public Object getItem(int i) {
            return summaryItemList.get(i);
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
                view = getActivity().getLayoutInflater().inflate(R.layout.order_summ_item, viewGroup, false);
                holder.tvLabel = (TextView) view.findViewById(R.id.tvLabel);
                holder.tvValue = (TextView) view.findViewById(R.id.tvValue);
                view.setTag(holder);
            }else{
                holder = (ViewHolder) view.getTag();
            }
            SummaryItem item = summaryItemList.get(i);
            holder.tvLabel.setText(item.getLabel());
            holder.tvValue.setText(item.getValue());
            if(item.getItemType() == SummaryItem.SUMM_LARGE){
                holder.tvLabel.setTextSize(30);
                holder.tvValue.setTextSize(22);
            }else{
                holder.tvLabel.setTextSize(22);
                holder.tvValue.setTextSize(22);
            }
            return view;
        }

        class ViewHolder{
            TextView tvLabel;
            TextView tvValue;
        }
    }

    static class SummaryItem{
        static final int SUMM_NORMAL = 1;
        static final int SUMM_LARGE = 2;

        private String mLabel;
        private String mValue;
        private int mItemType;

        public SummaryItem(String label, String value, int itemType){
            mLabel = label;
            mValue = value;
            mItemType = itemType;
        }

        public int getItemType(){
            return mItemType;
        }

        public String getValue(){
            return mValue;
        }

        public String getLabel(){
            return mLabel;
        }
    }
}
