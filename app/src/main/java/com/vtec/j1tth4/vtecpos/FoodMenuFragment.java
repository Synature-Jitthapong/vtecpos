package com.vtec.j1tth4.vtecpos;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by j1tth4 on 3/28/15.
 * The fragment for hold each food menu page
 */
public class FoodMenuFragment extends Fragment {

    static String[] DEPTS = {
            "Japanese",
            "Thai",
            "Hot",
            "Ice"
    };

    private static class FoodMenuPageItem{
        private final CharSequence mTitle;

        public FoodMenuPageItem(CharSequence title){
            mTitle = title;
        }

        public Fragment createFragment(){
            return MenuFragment.newInstance(mTitle);
        }

        public CharSequence getTitle(){
            return mTitle;
        }
    }

    private List<FoodMenuPageItem> mTabs = new ArrayList<FoodMenuPageItem>();

    private SlidingTabLayout mDeptTab;
    private ViewPager mItemPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.food_menu_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mItemPager = (ViewPager) view.findViewById(R.id.item_pager);
        mItemPager.setAdapter(new DepartmentPagerAdapter(getChildFragmentManager()));

        mDeptTab = (SlidingTabLayout) view.findViewById(R.id.dep_slide_tabs);
        mDeptTab.setViewPager(mItemPager);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        for(int i = 0; i < DEPTS.length; i++){
            mTabs.add(new FoodMenuPageItem(DEPTS[i]));
        }
    }

    private class DepartmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter{

        public DepartmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            return mTabs.get(position).createFragment();
        }

        @Override
        public int getCount() {
            return mTabs.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTabs.get(position).getTitle();
        }
    }
}
