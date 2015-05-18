package com.vtec.j1tth4.vtecpos;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vtec.j1tth4.vtecpos.provider.ProductDataSource;
import com.vtec.j1tth4.vtecpos.provider.ProductData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by j1tth4 on 3/28/15.
 * The fragment for hold each food menu page
 */
public class FoodMenuFragment extends Fragment {

    private List<ProductData.ProductGroups> mProductGroupList = new ArrayList<>();
    private List<ProductData.ProductDept> mProductDeptList = new ArrayList<>();

    private static class FoodMenuPageItem{
        private final CharSequence mTitle;
        private final int mProductGroupId;
        private final int mProductDeptId;

        public FoodMenuPageItem(CharSequence title, int groupId, int deptId){
            mTitle = title;
            mProductGroupId = groupId;
            mProductDeptId = deptId;
        }

        public Fragment createFragment(){
            return MenuFragment.newInstance(mTitle, mProductGroupId, mProductDeptId);
        }

        public CharSequence getTitle(){
            return mTitle;
        }
    }

    private List<FoodMenuPageItem> mTabs = new ArrayList<FoodMenuPageItem>();

    private SlidingTabLayout mGroupTab;
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

        //mGroupTab = (SlidingTabLayout) view.findViewById(R.id.group_slide_tabs);
        mDeptTab = (SlidingTabLayout) view.findViewById(R.id.dep_slide_tabs);
        mDeptTab.setViewPager(mItemPager);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ProductDataSource product = new ProductDataSource(getActivity());
        mProductDeptList = product.getProductDepts(0);
        for(int i = 0; i < mProductDeptList.size(); i++){
            ProductData.ProductDept productDept = mProductDeptList.get(i);
            mTabs.add(new FoodMenuPageItem(productDept.getProductDeptName(),
                    productDept.getProductGroupId(), productDept.getProductDeptId()));
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

    private class GroupPagerAdapter extends android.support.v4.app.FragmentPagerAdapter{

        public GroupPagerAdapter(FragmentManager fm) {
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
