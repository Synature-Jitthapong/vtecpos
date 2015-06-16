package com.vtec.j1tth4.vtecpos;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.kobjects.util.Util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by j1tth4 on 6/16/15.
 */
public class PromotionFragment extends DialogFragment implements Toolbar.OnMenuItemClickListener {

    private List<Transaction.OrderDetail> mOrderDetails;
    private OrderDetailDiscountAdapter mAdapter;

    private Toolbar mToolbar;
    private RecyclerView mRcOrderDetail;
    private RecyclerView.LayoutManager mLayoutManager;
    private PromotionSlidingTabLayout mSlidingTabs;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setCancelable(false);
        mOrderDetails = TransactionManager.getInstance(getActivity()).listOrder(true);
        mAdapter = new OrderDetailDiscountAdapter();
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final View view = getActivity().getLayoutInflater().inflate(R.layout.promotion_layout, null);
        mToolbar = (Toolbar) view.findViewById(R.id.tool_bar);
        mRcOrderDetail = (RecyclerView) view.findViewById(R.id.rc_view_order_detail);
        mSlidingTabs = (PromotionSlidingTabLayout) view.findViewById(R.id.promo_sliding_tab);

        mToolbar.setTitle(getString(R.string.discount));
        mToolbar.setOnMenuItemClickListener(this);

        mSlidingTabs.setTabTitle();
        mSlidingTabs.setTabClickListener(new BaseSlidingTabLayout.OnTabClickListener() {
            @Override
            public void onTabClick(int position) {

            }
        });

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRcOrderDetail.setHasFixedSize(true);
        mRcOrderDetail.setLayoutManager(mLayoutManager);
        mRcOrderDetail.setAdapter(mAdapter);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.getWindow().setLayout(1024, 600);
        dialog.show();
        return dialog;
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        return false;
    }

    private class OrderDetailDiscountAdapter extends RecyclerView.Adapter<OrderDetailDiscountAdapter.ViewHolder>{

        public class ViewHolder extends RecyclerView.ViewHolder{

            TextView mTvItem;
            TextView mTvQty;
            TextView mTvTotalPrice;
            TextView mTvDiscount;
            TextView mTvTotalSale;

            public ViewHolder(View itemView) {
                super(itemView);
                mTvItem = (TextView) itemView.findViewById(R.id.text_view1);
                mTvQty = (TextView) itemView.findViewById(R.id.text_view2);
                mTvTotalPrice = (TextView) itemView.findViewById(R.id.text_view3);
                mTvDiscount = (TextView) itemView.findViewById(R.id.text_view4);
                mTvTotalSale = (TextView) itemView.findViewById(R.id.text_view5);
            }
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = getActivity().getLayoutInflater().inflate(R.layout.order_detail_discount_list_item, parent, false);
            ViewHolder holder = new ViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            Transaction.OrderDetail orderDetail = mOrderDetails.get(position);
            holder.mTvItem.setText(orderDetail.getProductName());
            holder.mTvQty.setText(Utils.qtyFormat(getActivity(), orderDetail.getTotalQty()));
            holder.mTvTotalPrice.setText(Utils.currencyFormat(getActivity(), orderDetail.getTotalRetailPrice()));
            holder.mTvDiscount.setText(Utils.currencyFormat(getActivity(), orderDetail.getTotalDiscount()));
            holder.mTvTotalSale.setText(Utils.currencyFormat(getActivity(), orderDetail.getSalePrice()));
        }

        @Override
        public int getItemCount() {
            return mOrderDetails != null ? mOrderDetails.size() : 0;
        }
    }
}
