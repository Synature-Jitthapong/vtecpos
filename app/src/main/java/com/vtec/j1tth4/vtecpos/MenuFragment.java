package com.vtec.j1tth4.vtecpos;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.analytics.ecommerce.Product;
import com.vtec.j1tth4.vtecpos.provider.ProductDataSource;
import com.vtec.j1tth4.vtecpos.provider.ProductData;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import de.greenrobot.event.EventBus;

/**
 * Created by j1tth4 on 3/27/15.
 * This fragment used for create menu grid view
 */
public class MenuFragment extends Fragment{

    public static final String SLIDING_TAB_TITLE = "sliding_tab_title";

    EventBus bus = EventBus.getDefault();

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
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int groupId = getArguments().getInt("groupId");
        int deptId = getArguments().getInt("deptId");
        ProductDataSource product = new ProductDataSource(getActivity());
        mProductList = product.getProducts(groupId, deptId, 1, Utils.getISODate());
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
                ProductData.Products product = (ProductData.Products) parent.getItemAtPosition(position);
                TransactionManager.getInstance(getActivity()).insertOrder(product, 1);
                bus.post(new MenuClickEvent());
            }
        });
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
                holder.img = (ImageView) view.findViewById(R.id.imgMenu);
                holder.tvTitle = (TextView) view.findViewById(R.id.tvMenuTitle);
                holder.tvSub = (TextView) view.findViewById(R.id.tvMenuSub);
                view.setTag(holder);
            }else{
                holder = (ViewHolder) view.getTag();
            }
            final ProductData.Products product = mProductList.get(i);
            holder.tvTitle.setText(product.getProductName());
            holder.tvSub.setText(NumberFormat.getCurrencyInstance(new Locale("th", "TH")).format(product.getProductPrice()));
            holder.img.setImageDrawable(null);
            return view;
        }

        private class ViewHolder{
            ImageView img;
            TextView tvTitle;
            TextView tvSub;
        }
    }
}
