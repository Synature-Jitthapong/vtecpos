package com.vtec.j1tth4.vtecpos;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.vtec.j1tth4.vtecpos.provider.Orders;
import com.vtec.j1tth4.vtecpos.provider.Products;

import org.w3c.dom.Text;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by j1tth4 on 3/27/15.
 */
public class OrderListFragment extends Fragment {

    public static final String[] PROJECTION = {
            Orders.TRANSACTION_ID,
            Orders.COMPUTER_ID,
            Orders.TOTAL_QTY,
            Orders.TOTAL_RETAIL_PRICE,
            Products.PRODUCT_NAME,
            Products.PRODUCT_NAME_LANG1,
            Products.PRODUCT_NAME_LANG2,
            Products.PRODUCT_NAME_LANG3,
            Products.PRODUCT_NAME_LANG4,
            Products.PRODUCT_NAME_LANG5,
    };

    private Cursor mCursor;

    private RecyclerView mLvOrder;
    private ListView mLvOrderSummary;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.order_list_fragment, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mLvOrder = (RecyclerView) view.findViewById(R.id.lvOrder);
        mLvOrder.setAdapter(new OrderListAdapter());

        mLvOrderSummary = (ListView) view.findViewById(R.id.lvSummary);
        mLvOrderSummary.setAdapter(new OrderSummaryListAdapter());
    }

    private class OrderListAdapter extends RecyclerView.Adapter<OrderListAdapter.ViewHolder>{

        public class ViewHolder extends RecyclerView.ViewHolder {
            TextView tvOrderQty;
            TextView tvOrderTitle;
            TextView tvOrderSub;
            TextView tvOrderPrice;
            Button btnOrderDel;

            public ViewHolder(View itemView) {
                super(itemView);
                tvOrderQty = (TextView) itemView.findViewById(R.id.tvOrderQty);
                tvOrderTitle = (TextView) itemView.findViewById(R.id.tvOrderTitle);
                tvOrderSub = (TextView) itemView.findViewById(R.id.tvOrderSub);
                tvOrderPrice = (TextView) itemView.findViewById(R.id.tvOrderPrice);
                btnOrderDel = (Button) itemView.findViewById(R.id.btnOrderDel);
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

        }

        @Override
        public int getItemCount() {
            return 0;
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
