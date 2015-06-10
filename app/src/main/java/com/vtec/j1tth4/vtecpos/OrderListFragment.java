package com.vtec.j1tth4.vtecpos;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import de.greenrobot.event.EventBus;

/**
 * Created by j1tth4 on 3/27/15.
 */
public class OrderListFragment extends Fragment implements View.OnClickListener{

    private List<Transaction.OrderDetail> mOrderList;
    private List<SummaryItem> mSummaryItemList;
    private OrderListAdapter mOrderAdapter;
    private OrderSummaryListAdapter mOrderSummAdapter;
    private RecyclerView mLvOrder;
    private ListView mLvOrderSummary;
    private RecyclerView.LayoutManager mLayoutManager;

    private ImageButton mBtnViewReceipt;
    private ImageButton mBtnHoldOrder;
    private ImageButton mBtnDeleteOrder;
    private ImageButton mBtnClearOrder;

    public static class RefreshEvent{
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.order_list_fragment, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mOrderList = new ArrayList<Transaction.OrderDetail>();
        mSummaryItemList = new ArrayList<SummaryItem>();
        EventBus.getDefault().register(this);
    }

    private void loadOrderData(){
        TransactionManager manager = TransactionManager.getInstance(getActivity());
        mOrderList = manager.listOrder(true);
        mOrderAdapter.notifyDataSetChanged();
        refreshSummary();
    }

    @Override
    public void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    public void onEvent(RefreshEvent event){
        loadOrderData();
    }

    public void onEvent(MenuClickEvent event){
        TransactionManager manager = TransactionManager.getInstance(getActivity());
        Transaction.OrderDetail orderDetail = manager.getOrder(event.orderId, true);
        if(mOrderList == null)
            mOrderList = new ArrayList<>();
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
        mBtnViewReceipt = (ImageButton) view.findViewById(R.id.btnViewReceipt);
        mBtnHoldOrder = (ImageButton) view.findViewById(R.id.btnHoldOrder);
        mBtnClearOrder = (ImageButton) view.findViewById(R.id.btnClearOrder);
        mBtnDeleteOrder = (ImageButton) view.findViewById(R.id.btnDeleteOrder);

        mBtnViewReceipt.setOnClickListener(this);
        mBtnHoldOrder.setOnClickListener(this);
        mBtnDeleteOrder.setOnClickListener(this);
        mBtnClearOrder.setOnClickListener(this);

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

        loadOrderData();
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.btnViewReceipt:
                break;
            case R.id.btnHoldOrder:
                break;
            case R.id.btnDeleteOrder:
                deleteCheckedItems();
                break;
            case R.id.btnClearOrder:
                deleteAllOrder();
                break;
        }
    }

    private class OrderListAdapter extends RecyclerView.Adapter<OrderListAdapter.ViewHolder>{

        public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView orderThumbPic;
            CheckedTextView orderTitle;
            TextView orderSubTitle;
            TextView orderQty;
            TextView orderRetailPrice;
            ImageButton orderMinus;
            ImageButton orderPlus;
            ImageButton orderMoreOpt;

            public ViewHolder(View itemView) {
                super(itemView);
                orderThumbPic = (ImageView) itemView.findViewById(R.id.orderThumbPic);
                orderTitle = (CheckedTextView) itemView.findViewById(R.id.orderTitle);
                orderSubTitle = (TextView) itemView.findViewById(R.id.orderSubTitle);
                orderQty = (TextView) itemView.findViewById(R.id.orderQty);
                orderRetailPrice = (TextView) itemView.findViewById(R.id.orderTotalRetailPrice);
                orderMinus = (ImageButton) itemView.findViewById(R.id.btnOrderMinus);
                orderPlus = (ImageButton) itemView.findViewById(R.id.btnOrderPlus);
                orderMoreOpt = (ImageButton) itemView.findViewById(R.id.btnOrderMoreOpt);
            }
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view = getActivity().getLayoutInflater().inflate(R.layout.order_item, viewGroup, false);
            ViewHolder holder = new ViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(final ViewHolder viewHolder, final int position) {
            final Transaction.OrderDetail orderDetail = mOrderList.get(position);
            viewHolder.orderTitle.setText(orderDetail.getProductName());
            viewHolder.orderSubTitle.setText(Utils.currencyFormat(getActivity(), orderDetail.getPricePerUnit()));
            viewHolder.orderQty.setText(Utils.qtyFormat(getActivity(), orderDetail.getTotalQty()));
            viewHolder.orderRetailPrice.setText(Utils.currencyFormat(getActivity(), orderDetail.getTotalRetailPrice()));

            final boolean isChecked = orderDetail.isChecked();
            viewHolder.orderTitle.setChecked(isChecked);
            viewHolder.orderTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    orderDetail.setChecked(!isChecked);
                    notifyDataSetChanged();
//                    if(checkAnyOneChecked()){
//                        mBtnDeleteOrder.setVisibility(View.VISIBLE);
//                    }else{
//                        mBtnDeleteOrder.setVisibility(View.INVISIBLE);
//                    }
                }
            });

            viewHolder.orderMinus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double qty = Utils.parseDouble(viewHolder.orderQty.getText());
                    if (qty > 1) {
                        updateOrderQty(orderDetail, --qty, position);
                    }else{
                        deleteOrder(orderDetail.getOrderDetailID(), position);
                    }
                }
            });
            viewHolder.orderPlus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double qty = Utils.parseDouble(viewHolder.orderQty.getText());
                    updateOrderQty(orderDetail, ++qty, position);
                }
            });
            viewHolder.orderMoreOpt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, orderDetail.getOrderDetailID(), position);
                }
            });
        }
        @Override
        public int getItemCount() {
            return mOrderList != null ? mOrderList.size() : 0;
        }
    }

    private void deleteAllOrder(){
        Utils.createConfirmDialog(getActivity(), getString(R.string.confirm_clear_order),
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }, new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        TransactionManager manager = TransactionManager.getInstance(getActivity());
                        manager.deleteAllOrders();
                        loadOrderData();
                    }
                });
    }

    private void deleteOrder(final int orderDetailId, final int position){
        Utils.createConfirmDialog(getActivity(), getString(R.string.confirm_delete),
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }, new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        TransactionManager manager = TransactionManager.getInstance(getActivity());
                        manager.deleteOrder(orderDetailId);
                        mOrderList.remove(position);
                        mOrderAdapter.notifyDataSetChanged();
                        refreshSummary();
                    }
                });
    }

    private void deleteCheckedItems(){
        if(checkAnyOneChecked()) {
            Utils.createConfirmDialog(getActivity(), getString(R.string.confirm_delete),
                    new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {}
                    }, new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            String ordersId = "";
                            if(mOrderList != null) {
                                for (int i = 0; i < mOrderList.size(); i++) {
                                    Transaction.OrderDetail orderDetail = mOrderList.get(i);
                                    if(orderDetail.isChecked()) {
                                        ordersId += orderDetail.getOrderDetailID();
                                        if (i < mOrderList.size() - 1)
                                            ordersId += ",";
                                    }
                                }
                            }
                            if(!TextUtils.isEmpty(ordersId)) {
                                if(ordersId.substring(ordersId.length() - 1).equals(","))
                                    ordersId = ordersId.substring(0, ordersId.length() - 1);
                                TransactionManager manager = TransactionManager.getInstance(getActivity());
                                manager.deleteOrders(ordersId);
                                loadOrderData();
                            }
                        }
                    });
        }else{
            new AlertDialog.Builder(getActivity())
                    .setMessage(R.string.select_item_to_delete)
                    .setNeutralButton(R.string.close, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {}
                    }).show();
        }
    }

    private boolean checkAnyOneChecked(){
        if(mOrderList != null) {
            for (Transaction.OrderDetail orderDetail : mOrderList) {
                if (orderDetail.isChecked())
                    return true;
            }
        }
        return false;
    }

    private void updateOrderQty(Transaction.OrderDetail orderDetail, double qty, int position){
        TransactionManager manager = TransactionManager.getInstance(getActivity());
        int orderDetailId = orderDetail.getOrderDetailID();
        manager.updateOrder(orderDetailId, orderDetail.getPricePerUnit(), qty);
        mOrderList.set(position, manager.getOrder(orderDetailId, true));
        mOrderAdapter.notifyDataSetChanged();
        refreshSummary();
    }

    private class MoreOptionClickListener implements android.support.v7.widget.PopupMenu.OnMenuItemClickListener{
        private int orderDetailId;
        private int position;

        public MoreOptionClickListener(int orderDetailId, int position){
            this.orderDetailId = orderDetailId;
            this.position = position;
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.action_modify:
                    return true;
                case R.id.action_delete:
                    deleteOrder(orderDetailId, position);
                    return true;
                default:
                    return false;
            }
        }
    }

    private void showPopup(View view, int orderDetailId, int position){
        android.support.v7.widget.PopupMenu popup = new android.support.v7.widget.PopupMenu(getActivity(), view);
        popup.inflate(R.menu.order_menu_option);
        popup.setOnMenuItemClickListener(new MoreOptionClickListener(orderDetailId, position));
        popup.show();
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
        if(mOrderList != null) {
            for (Transaction.OrderDetail orderDetail : mOrderList) {
                sumTotalItem += orderDetail.getTotalQty();
                sumRetailPrice += orderDetail.getTotalRetailPrice();
                sumDiscount += orderDetail.getTotalItemDisc();//dtTable.Rows(i)("TotalItemDisc")
                sumSalePrice += orderDetail.getSalePrice(); //dtTable.Rows(i)("SalePrice")
                sumBillDisc += orderDetail.getDiscBill();//dtTable.Rows(i)("DiscBill")
                sumNetSale += orderDetail.getNetSale();//dtTable.Rows(i)("NetSale")
                sumPVat += orderDetail.getProductVAT();//dtTable.Rows(i)("ProductVAT")
                sumPBeforeVat += orderDetail.getProductBeforeVAT(); //dtTable.Rows(i)("ProductBeforeVAT")
                sumSc += orderDetail.getSCAmount(); //dtTable.Rows(i)("SCAmount")
                sumScVat += orderDetail.getSCVAT(); //dtTable.Rows(i)("SCVAT")
                sumScBefore += orderDetail.getSCBeforeVAT(); //dtTable.Rows(i)("SCBeforeVAT")
                sumVatable += orderDetail.getVatable(); //dtTable.Rows(i)("Vatable")
                sumWVatable += orderDetail.getWVatable(); //dtTable.Rows(i)("WVatable")
                sumW += orderDetail.getWeightPrice(); //dtTable.Rows(i)("WeightPrice")
                sumWVat += orderDetail.getWeightPriceVAT(); //dtTable.Rows(i)("WeightPriceVAT")
                sumWBefore += orderDetail.getWeightBeforeVAT(); //dtTable.Rows(i)("WeightBeforeVAT")
                sumWSc += orderDetail.getSCWAmount(); //dtTable.Rows(i)("SCWAmount")
                sumWScVat += orderDetail.getSCWVAT(); //dtTable.Rows(i)("SCWVAT")
                sumWScBeforeVat += orderDetail.getSCWBeforeVAT(); //dtTable.Rows(i)("SCWBeforeVAT")
            }
        }
        mSummaryItemList = new ArrayList<>();
        mSummaryItemList.add(
                new SummaryItem(
                        getActivity().getString(R.string.items) + " " +
                                Utils.qtyFormat(getActivity(), sumTotalItem),
                        Utils.currencyFormat(getActivity(), sumRetailPrice),
                        SummaryItem.SUMM_NORMAL));
        mSummaryItemList.add(
                new SummaryItem(
                        getActivity().getString(R.string.discount_short),
                        Utils.currencyFormat(getActivity(), sumDiscount),
                        SummaryItem.SUMM_NORMAL));
//        mSummaryItemList.add(
//                new SummaryItem(
//                        "vat",
//                        Utils.currencyFormat(getActivity(), sumPBeforeVat),
//                        SummaryItem.SUMM_NORMAL));
        mSummaryItemList.add(
                new SummaryItem(
                        "Sub Total",
                        Utils.currencyFormat(getActivity(), sumSalePrice),
                        SummaryItem.SUMM_NORMAL));
        mSummaryItemList.add(
                new SummaryItem(
                        getActivity().getString(R.string.total),
                        Utils.currencyFormat(getActivity(), sumSalePrice),
                        SummaryItem.SUMM_LARGE));

        mOrderSummAdapter.notifyDataSetChanged();
    }

    private class OrderSummaryListAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return mSummaryItemList != null ? mSummaryItemList.size() : 0;
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
                holder.tvLabel.setTextSize(32);
                holder.tvValue.setTextSize(32);
            }else{
                holder.tvLabel.setTextSize(18);
                holder.tvValue.setTextSize(18);
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
