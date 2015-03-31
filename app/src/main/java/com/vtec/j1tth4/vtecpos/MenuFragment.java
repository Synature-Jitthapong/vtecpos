package com.vtec.j1tth4.vtecpos;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by j1tth4 on 3/27/15.
 * This fragment used for create menu grid view
 */
public class MenuFragment extends Fragment {

    public static final String SLIDING_TAB_TITLE = "sliding_tab_title";

    public static final String[] MENUS = {
        "Sushi",
            "Ramen",
            "ต้มยำกุ้ง",
            "ข้าวผัด",
            "Capucino",
            "Espresso",
            "Late"
    };

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
    }

    @Nullable
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
            return MENUS.length;
        }

        @Override
        public Object getItem(int i) {
            return MENUS[i];
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
                view = getActivity().getLayoutInflater().inflate(R.layout.menu_item, viewGroup, false);
                holder.img = (ImageView) view.findViewById(R.id.imgMenu);
                holder.tvTitle = (TextView) view.findViewById(R.id.tvMenuTitle);
                holder.tvSub = (TextView) view.findViewById(R.id.tvMenuSub);
                view.setTag(holder);
            }else{
                holder = (ViewHolder) view.getTag();
            }
            holder.tvTitle.setText(MENUS[i]);
            return view;
        }

        class ViewHolder{
            ImageView img;
            TextView tvTitle;
            TextView tvSub;
        }
    }
}
