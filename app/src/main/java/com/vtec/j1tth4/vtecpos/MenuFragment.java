package com.vtec.j1tth4.vtecpos;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.vtec.j1tth4.vtecpos.OpenPriceFragment.OpenPriceCallback;

import java.util.ArrayList;
import java.util.List;

import de.greenrobot.event.EventBus;

/**
 * Created by j1tth4 on 3/27/15.
 * This fragment used for create menu grid view
 */
public class MenuFragment extends Fragment{

    public static final String TAG = MenuFragment.class.getSimpleName();

    public static final String SLIDING_TAB_TITLE = "sliding_tab_title";

    public static class MenuItem{
        private String menuName;
        private Drawable imgDrawable;

        public MenuItem(String name, Drawable drawable){
            menuName = name;
            imgDrawable = drawable;
        }

        public String getMenuName() {
            return menuName;
        }

        public Drawable getImgDrawable() {
            return imgDrawable;
        }
    }

    private List<ProductData.Products> mProductList
            = new ArrayList<>();

    private GridView mGvMenu;

    public static MenuFragment newInstance(CharSequence title, int groupId, int deptId){
        MenuFragment f = new MenuFragment();
        Bundle b = new Bundle();
        b.putCharSequence(SLIDING_TAB_TITLE, title);
        b.putInt("groupId", groupId);
        b.putInt("deptId", deptId);
        f.setArguments(b);
        Log.i(TAG, groupId + ", " + deptId);
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int groupId = getArguments().getInt("groupId");
        int deptId = getArguments().getInt("deptId");

        ProductDataSource product = new ProductDataSource(getActivity());
        mProductList = product.listProduct(groupId, deptId, 1, Utils.getISODate());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.menu_gridview, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mGvMenu = (GridView) view.findViewById(R.id.gvMenu);
        mGvMenu.setAdapter(new MenuItemAdapter());
        mGvMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final ProductData.Products product = (ProductData.Products) parent.getItemAtPosition(position);

                if(product.isOpenPrice()){
                    OpenPriceFragment opDialog = OpenPriceFragment.getInstance(product.getProductName());
                    opDialog.show(getFragmentManager(), OpenPriceFragment.TAG);
                    opDialog.setCallback(new OpenPriceCallback() {
                        @Override
                        public void onEnterPrice(double price) {
                            product.setProductPrice(price);
                            filterProductType(product);
                        }
                    });
                }else {
                    filterProductType(product);
                }
            }
        });
    }

    private void addOrder(ProductData.Products product, double qty){
        TransactionManager manager = TransactionManager.getInstance(getActivity());
        int orderId = manager.insertOrder(product, qty);
        EventBus.getDefault().post(new MenuClickEvent(orderId));
    }

    private void filterProductType(ProductData.Products product){
        switch (product.getProductTypeID()) {
            case ProductDataSource.NORMAL:
                addOrder(product, 1);
                break;
            case ProductDataSource.SIZE:
                break;
            case ProductDataSource.SET:
                break;
            case ProductDataSource.SET_CAN_SELECT:
                break;
        }
    }

    private class MenuItemAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return mProductList != null ? mProductList.size() : 0;
        }

        @Override
        public Object getItem(int i) {
            return mProductList.get(i);
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
                view = getActivity().getLayoutInflater().inflate(R.layout.menu_item_card, viewGroup, false);
                holder.menu_pic = (ImageView) view.findViewById(R.id.menu_pic);
                holder.menu_title = (TextView) view.findViewById(R.id.menu_title);
                holder.menu_sub_title = (TextView) view.findViewById(R.id.menu_sub_title);
                view.setTag(holder);
            }else{
                holder = (ViewHolder) view.getTag();
            }
            final ProductData.Products product = mProductList.get(i);
            holder.menu_title.setText(product.getProductName());
            boolean isOpenPrice = product.getProductPrice() == -1 ? true : false;
            product.setIsOpenPrice(isOpenPrice);
            if(!isOpenPrice) {
                holder.menu_sub_title.setText(Utils.currencyFormat(getActivity(), product.getProductPrice()));
            }else{
                holder.menu_sub_title.setText(null);
            }
            //holder.menu_pic.setImageDrawable(null);
            return view;
        }

        private class ViewHolder{
            ImageView menu_pic;
            TextView menu_title;
            TextView menu_sub_title;
        }
    }
}
