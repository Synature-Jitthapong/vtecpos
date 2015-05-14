package com.vtec.j1tth4.vtecpos;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.vtec.j1tth4.vtecpos.provider.ProductDataSource;
import com.vtec.j1tth4.vtecpos.provider.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by j1tth4 on 3/27/15.
 * This fragment used for create menu grid view
 */
public class MenuFragment extends Fragment {

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

    private List<Product.Products> mProductList
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
        mProductList = product.getProducts(groupId, deptId);
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
            holder.tvTitle.setText(mProductList.get(i).getProductName());
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
