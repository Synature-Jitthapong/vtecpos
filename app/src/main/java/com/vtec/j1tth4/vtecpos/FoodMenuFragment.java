package com.vtec.j1tth4.vtecpos;

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

        public String getDeptId(){
            return String.valueOf(mProductDeptId);
        }
    }

    private List<FoodMenuPageItem> mPagerItems;
    private MenuPagerAdapter mPagerAdapter;
    private GroupSlidingTabLayout mGroupTab;
    private SlidingTabLayout mDeptTab;
    private ViewPager mPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.food_menu_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mPager = (ViewPager) view.findViewById(R.id.item_pager);
        mGroupTab = (GroupSlidingTabLayout) view.findViewById(R.id.group_slide_tabs);
        mDeptTab = (SlidingTabLayout) view.findViewById(R.id.dep_slide_tabs);

        mPagerAdapter = new MenuPagerAdapter(getActivity().getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
        mDeptTab.setViewPager(mPager);

        final ProductDataSource product = new ProductDataSource(getActivity());
        mProductGroupList = product.listProductGroup();
        mGroupTab.setProductGroupData(mProductGroupList);
        mGroupTab.setTabClickCallback(new GroupSlidingTabLayout.OnTabClickListener() {
            @Override
            public void onTabClick(int groupId) {
                loadMenuPager(groupId);
            }
        });
        if(mProductGroupList != null)
            loadMenuPager(mProductGroupList.get(0).getProductGroupID());
    }

    private void loadMenuPager(int productGroupId){
        ProductDataSource product = new ProductDataSource(getActivity());
        List<ProductData.ProductDept> deptLst = product.listProductDept(productGroupId);
        mPagerItems = new ArrayList<>();
        for (int i = 0; i < deptLst.size(); i++) {
            ProductData.ProductDept productDept = deptLst.get(i);
            mPagerItems.add(new FoodMenuPageItem(productDept.getProductDeptName(),
                    productDept.getProductGroupID(), productDept.getProductDeptID()));
        }
        mPagerAdapter.notifyDataSetChanged();
        mDeptTab.populateTabStrip();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private class MenuPagerAdapter extends android.support.v4.app.FragmentStatePagerAdapter{

        public MenuPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            return mPagerItems.get(position).createFragment();
        }

        @Override
        public int getCount() {
            return mPagerItems != null ? mPagerItems.size() : 0;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mPagerItems.get(position).getTitle();
        }

        @Override
        public int getItemPosition(Object object) {
            return POSITION_NONE;
        }
    }
}
