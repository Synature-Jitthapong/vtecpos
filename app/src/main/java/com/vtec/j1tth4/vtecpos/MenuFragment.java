package com.vtec.j1tth4.vtecpos;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.vtec.j1tth4.vtecpos.dao.Products;

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

    List<MenuItem> mMenuItem = new ArrayList<MenuItem>();

    private GridView mGvMenu;

    public static MenuFragment newInstance(CharSequence title){
        MenuFragment f = new MenuFragment();
        Bundle b = new Bundle();
        b.putCharSequence(SLIDING_TAB_TITLE, title);
        f.setArguments(b);
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ProductRepository productRepo = new ProductRepository();
        List<Products> productLst = productRepo.getAllProducts(getActivity());

        mMenuItem.add(new MenuItem("Shusi", getResources().getDrawable(R.drawable.sushi)));
        mMenuItem.add(new MenuItem("Ramen", getResources().getDrawable(R.drawable.ramen)));
        mMenuItem.add(new MenuItem("Capuchino", getResources().getDrawable(R.drawable.capuchino)));
        mMenuItem.add(new MenuItem("Espress", getResources().getDrawable(R.drawable.esspresso)));

        for(Products p : productLst){
            mMenuItem.add(new MenuItem(p.getProductName(), getResources().getDrawable(R.drawable.sushi)));
        }
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
            return mMenuItem.size();
        }

        @Override
        public Object getItem(int i) {
            return mMenuItem.get(i);
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
            holder.tvTitle.setText(mMenuItem.get(i).menuName);
            holder.img.setImageDrawable(mMenuItem.get(i).imgDrawable);
            return view;
        }

        class ViewHolder{
            ImageView img;
            TextView tvTitle;
            TextView tvSub;
        }
    }
}
