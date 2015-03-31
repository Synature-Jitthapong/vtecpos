package com.vtec.j1tth4.vtecpos;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by j1tth4 on 3/27/15.
 */
public class OrderListFragment extends Fragment {

    private ListView mLvOrder;
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
        mLvOrder = (ListView) view.findViewById(R.id.lvOrder);
        mLvOrder.setAdapter(new OrderListAdapter());

        mLvOrderSummary = (ListView) view.findViewById(R.id.lvSummary);
        mLvOrderSummary.setAdapter(new OrderSummaryListAdapter());
    }

    private class OrderListAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return MenuFragment.MENUS.length;
        }

        @Override
        public Object getItem(int i) {
            return MenuFragment.MENUS[i];
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
                view = getActivity().getLayoutInflater().inflate(R.layout.order_item, viewGroup, false);
                holder.tvOrderQty = (TextView) view.findViewById(R.id.tvOrderQty);
                holder.tvOrderTitle = (TextView) view.findViewById(R.id.tvOrderTitle);
                holder.tvOrderSub = (TextView) view.findViewById(R.id.tvOrderSub);
                holder.tvOrderPrice = (TextView) view.findViewById(R.id.tvOrderPrice);
                holder.btnOrderDel = (Button) view.findViewById(R.id.btnOrderDel);
                view.setTag(holder);
            }else{
                holder = (ViewHolder) view.getTag();
            }
            holder.tvOrderQty.setText(NumberFormat.getInstance().format(Math.ceil(Math.random() * 2)) + "x");
            holder.tvOrderTitle.setText(MenuFragment.MENUS[i]);
            holder.tvOrderPrice.setText("200");
            return view;
        }

        class ViewHolder{
            TextView tvOrderQty;
            TextView tvOrderTitle;
            TextView tvOrderSub;
            TextView tvOrderPrice;
            Button btnOrderDel;
        }
    }

    private class OrderSummaryListAdapter extends BaseAdapter{

        List<SummaryItem> summaryItemList = new ArrayList<SummaryItem>();

        public OrderSummaryListAdapter(){
            summaryItemList.add(
                    new SummaryItem(
                            getActivity().getString(R.string.items),
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
