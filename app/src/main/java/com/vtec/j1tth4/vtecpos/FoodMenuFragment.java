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

    private List<FoodMenuPageItem> mPagerItem = new ArrayList<>();
    private DepartmentPagerAdapter mPagerAdapter;
    private GroupSlidingTabLayout mGroupTab;
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
        mGroupTab = (GroupSlidingTabLayout) view.findViewById(R.id.group_slide_tabs);
        mDeptTab = (SlidingTabLayout) view.findViewById(R.id.dep_slide_tabs);

        mPagerAdapter = new DepartmentPagerAdapter(getChildFragmentManager());
        mItemPager.setAdapter(mPagerAdapter);
        mDeptTab.setViewPager(mItemPager);

        final ProductDataSource product = new ProductDataSource(getActivity());
        mProductGroupList = product.getProductGroups();
        mGroupTab.setProductGroupData(mProductGroupList);
        mGroupTab.setTabClickCallback(new GroupSlidingTabLayout.OnTabClickListener() {
            @Override
            public void onTabClick(int groupId) {
                List<ProductData.ProductDept> deptLst = product.getProductDepts(groupId);
                mPagerItem = new ArrayList<>();
                for (int i = 0; i < deptLst.size(); i++) {
                    ProductData.ProductDept productDept = deptLst.get(i);
                    mPagerItem.add(new FoodMenuPageItem(productDept.getProductDeptName(),
                            productDept.getProductGroupId(), productDept.getProductDeptId()));
                }
                mPagerAdapter = new DepartmentPagerAdapter(getChildFragmentManager());
                mDeptTab.testSetAdapter(mPagerAdapter);
                mDeptTab.populateTabStrip();
            }
        });
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private class DepartmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter{

        public DepartmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            return mPagerItem.get(position).createFragment();
        }

        @Override
        public int getCount() {
            return mPagerItem.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mPagerItem.get(position).getTitle();
        }
    }
}
