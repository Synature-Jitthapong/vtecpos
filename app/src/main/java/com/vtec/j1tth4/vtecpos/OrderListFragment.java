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
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
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
    private List<SummaryItem> mSummaryItemList;
    private OrderListAdapter mOrderAdapter;
    private OrderSummaryListAdapter mOrderSummAdapter;
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
        mOrderList = new ArrayList<Transaction.OrderDetail>();
        mSummaryItemList = new ArrayList<SummaryItem>();
        TransactionManager manager = TransactionManager.getInstance(getActivity());
        mOrderList = manager.listOrder();
    }

    @Override
    public void onDestroy() {
        mBus.unregister(this);
        super.onDestroy();
    }

    public void onEvent(MenuClickEvent event){
        TransactionManager manager = TransactionManager.getInstance(getActivity());
        Transaction.OrderDetail orderDetail = manager.getOrder(event.getOrderId());
        mOrderList.add(orderDetail);
        mOrderAdapter.notifyDataSetChanged();
        mLvOrder.post(new Runnable() {
            @Override
            public void run() {
                mLvOrder.scrollToPosition(mOrderAdapter.getItemCount() - 1);
            }
        });
        refreshSummary();
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
        mOrderSummAdapter = new OrderSummaryListAdapter();
        mLvOrderSummary.setAdapter(mOrderSummAdapter);
        refreshSummary();
    }

    private class OrderListAdapter extends RecyclerView.Adapter<OrderListAdapter.ViewHolder>{

        public class ViewHolder extends RecyclerView.ViewHolder {
            boolean isCtrlExpand = false;

            TextView tvOrderQty;
            TextView tvOrderQty2;
            TextView tvOrderTitle;
            TextView tvOrderSub;
            TextView tvOrderPrice;
            ImageButton btnMore;
            Button btnDel;
            Button btnMinus;
            Button btnPlus;
            Button btnMod;
            RelativeLayout orderCtrlContainer;

            public ViewHolder(View itemView) {
                super(itemView);
                tvOrderQty = (TextView) itemView.findViewById(R.id.tvOrderQty);
                tvOrderQty2 = (TextView) itemView.findViewById(R.id.tvOrderQty2);
                tvOrderTitle = (TextView) itemView.findViewById(R.id.tvOrderTitle);
                tvOrderSub = (TextView) itemView.findViewById(R.id.tvOrderSub);
                tvOrderPrice = (TextView) itemView.findViewById(R.id.tvOrderPrice);
                btnMore = (ImageButton) itemView.findViewById(R.id.btnMore);
                btnDel = (Button) itemView.findViewById(R.id.btnOrderDel);
                btnMinus = (Button) itemView.findViewById(R.id.btnOrderMinus);
                btnPlus = (Button) itemView.findViewById(R.id.btnOrderPlus);
                btnMod = (Button) itemView.findViewById(R.id.btnOrderModify);
                orderCtrlContainer = (RelativeLayout) itemView.findViewById(R.id.orderCtrlContainer);
            }
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view = getActivity().getLayoutInflater().inflate(R.layout.order_item, viewGroup, false);
            ViewHolder holder = new ViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(final ViewHolder viewHolder, final int i) {
            final Transaction.OrderDetail orderDetail = mOrderList.get(i);
            viewHolder.tvOrderQty.setText(NumberFormat.getInstance().format(orderDetail.getTotalQty()));
            viewHolder.tvOrderQty2.setText(NumberFormat.getInstance().format(orderDetail.getTotalQty()));
            viewHolder.tvOrderTitle.setText(orderDetail.getProductName());
            viewHolder.tvOrderPrice.setText(NumberFormat.getCurrencyInstance(new Locale("th", "TH")).format(orderDetail.getTotalRetailPrice()));

            if(viewHolder.isCtrlExpand){
                viewHolder.orderCtrlContainer.setVisibility(View.GONE);
                viewHolder.btnMore.setImageResource(android.R.drawable.arrow_down_float);
            }

            viewHolder.btnMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!viewHolder.isCtrlExpand){
                        viewHolder.orderCtrlContainer.setVisibility(View.VISIBLE);
                        viewHolder.isCtrlExpand = true;
                        viewHolder.btnMore.setImageResource(android.R.drawable.arrow_up_float);
                    }else{
                        viewHolder.orderCtrlContainer.setVisibility(View.GONE);
                        viewHolder.isCtrlExpand = false;
                        viewHolder.btnMore.setImageResource(android.R.drawable.arrow_down_float);
                    }
                }
            });

            viewHolder.btnDel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    new AlertDialog.Builder(getActivity())
                            .setMessage(R.string.delete)
                            .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {}
                            })
                            .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    TransactionManager manager =
                                            TransactionManager.getInstance(getActivity());
                                    manager.deleteOrder(orderDetail.getOrderDetailId());
                                    mOrderList.remove(i);
                                    mOrderAdapter.notifyDataSetChanged();
                                }
                            }).show();
                }
            });

            viewHolder.btnMinus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    double qty = orderDetail.getTotalQty();
                    if(--qty > 0){
                        TransactionManager manager =
                                TransactionManager.getInstance(getActivity());
                        manager.updateOrder(orderDetail.getOrderDetailId(), orderDetail.getPricePerUnit(), qty);
                        Transaction.OrderDetail order = manager.getOrder(orderDetail.getOrderDetailId());
                        mOrderList.set(i, order);
                        mOrderAdapter.notifyDataSetChanged();
                    }
                }
            });

            viewHolder.btnPlus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    double qty = orderDetail.getTotalQty();
                    TransactionManager manager =
                            TransactionManager.getInstance(getActivity());
                    manager.updateOrder(orderDetail.getOrderDetailId(), orderDetail.getPricePerUnit(), ++qty);
                    Transaction.OrderDetail order = manager.getOrder(orderDetail.getOrderDetailId());
                    mOrderList.set(i, order);
                    mOrderAdapter.notifyDataSetChanged();
                }
            });
        }

        @Override
        public int getItemCount() {
            return mOrderList != null ? mOrderList.size() : 0;
        }
    }

    private void refreshSummary(){
        double sumTotalItem = 0;
        double sumRetailPrice = 0;
        double sumDiscount = 0;
        double sumSalePrice = 0;
        double sumBillDisc = 0;
        double sumNetSale = 0;
        double sumPVat = 0;
        double sumPBeforeVat = 0;
        double sumSc = 0;
        double sumScVat = 0;
        double sumScBefore = 0;
        double sumVatable = 0;
        double sumWVatable = 0;
        double sumW = 0;
        double sumWVat = 0;
        double sumWBefore = 0;
        double sumWSc = 0;
        double sumWScVat = 0;
        double sumWScBeforeVat = 0;
        for(Transaction.OrderDetail orderDetail : mOrderList){
            sumTotalItem += orderDetail.getTotalQty();
            sumRetailPrice +=  orderDetail.getTotalRetailPrice();
            sumDiscount += orderDetail.getTotalItemDisc();//dtTable.Rows(i)("TotalItemDisc")
            sumSalePrice += orderDetail.getSalePrice(); //dtTable.Rows(i)("SalePrice")
            sumBillDisc +=  orderDetail.getDiscBill();//dtTable.Rows(i)("DiscBill")
            sumNetSale +=  orderDetail.getNetSale();//dtTable.Rows(i)("NetSale")
            sumPVat +=  orderDetail.getProductVAT();//dtTable.Rows(i)("ProductVAT")
            sumPBeforeVat +=  orderDetail.getProductBeforeVAT(); //dtTable.Rows(i)("ProductBeforeVAT")
            sumSc +=  orderDetail.getScAmount(); //dtTable.Rows(i)("SCAmount")
            sumScVat += orderDetail.getScVAT(); //dtTable.Rows(i)("SCVAT")
            sumScBefore +=  orderDetail.getScBeforeVAT(); //dtTable.Rows(i)("SCBeforeVAT")
            sumVatable += orderDetail.getVatable(); //dtTable.Rows(i)("Vatable")
            sumWVatable += orderDetail.getwVatable(); //dtTable.Rows(i)("WVatable")
            sumW +=  orderDetail.getWeightPrice(); //dtTable.Rows(i)("WeightPrice")
            sumWVat +=  orderDetail.getWeightPriceVAT(); //dtTable.Rows(i)("WeightPriceVAT")
            sumWBefore +=  orderDetail.getWeightBeforeVAT(); //dtTable.Rows(i)("WeightBeforeVAT")
            sumWSc +=  orderDetail.getScWAmount(); //dtTable.Rows(i)("SCWAmount")
            sumWScVat +=  orderDetail.getScWVAT(); //dtTable.Rows(i)("SCWVAT")
            sumWScBeforeVat +=  orderDetail.getScWBeforeVAT(); //dtTable.Rows(i)("SCWBeforeVAT")
        }

        mSummaryItemList = new ArrayList<>();
        mSummaryItemList.add(
                new SummaryItem(
                        getActivity().getString(R.string.items) + " " +
                                NumberFormat.getInstance().format(sumTotalItem),
                        NumberFormat.getCurrencyInstance().format(sumRetailPrice),
                        SummaryItem.SUMM_NORMAL));
        mSummaryItemList.add(
                new SummaryItem(
                        getActivity().getString(R.string.discount_short),
                        NumberFormat.getCurrencyInstance().format(sumDiscount),
                        SummaryItem.SUMM_NORMAL));

        mSummaryItemList.add(
                new SummaryItem(
                        getActivity().getString(R.string.total),
                        NumberFormat.getCurrencyInstance().format(sumSalePrice),
                        SummaryItem.SUMM_LARGE));

        mOrderSummAdapter.notifyDataSetChanged();
    }

    private class OrderSummaryListAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return mSummaryItemList.size();
        }

        @Override
        public Object getItem(int i) {
            return mSummaryItemList.get(i);
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
            SummaryItem item = mSummaryItemList.get(i);
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
