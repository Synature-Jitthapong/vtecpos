package com.vtec.j1tth4.vtecpos;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v4.view.PagerAdapter;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.vtec.j1tth4.vtecpos.dao.ProductGroup;
import com.vtec.j1tth4.vtecpos.provider.ProductData;

import java.util.List;

/**
 * Created by j1tth4 on 5/26/15.
 */
public class GroupSlidingTabLayout extends HorizontalScrollView {

    private static final int TITLE_OFFSET_DIPS = 24;
    public static final int TAB_VIEW_TEXT_SIZE_SP = 12;
    private static final int TAB_VIEW_PADDING_DIPS = 16;

    public static interface OnTabClickListener{
        void onTabClick(int groupId);
    }

    private OnTabClickListener mTabClickListener;

    private int mTitleOffset;

    private List<ProductData.ProductGroups> mProGroupLst;

    private SlidingTabStrip mTabStrip;
    private int mTabViewLayoutId;
    private int mTabViewTextViewId;

    public GroupSlidingTabLayout(Context context) {
        this(context, null);
    }

    public GroupSlidingTabLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public GroupSlidingTabLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        // Disable the Scroll Bar
        setHorizontalScrollBarEnabled(false);
        // Make sure that the Tab Strips fills this View
        setFillViewport(true);

        mTitleOffset = (int) (TITLE_OFFSET_DIPS * getResources().getDisplayMetrics().density);

        mTabStrip = new SlidingTabStrip(context);
        mTabStrip.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        mTabStrip.setTabIndicatorColor(getResources().getColor(android.R.color.transparent));
        mTabStrip.setTabDividerColor((byte)0x20);
        addView(mTabStrip, LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
    }

    protected TextView createDefaultTabView(Context context) {
        TextView textView = new TextView(context);
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, TAB_VIEW_TEXT_SIZE_SP);
        textView.setMinWidth(100);
        textView.setTypeface(Typeface.DEFAULT_BOLD);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            // If we're running on Honeycomb or newer, then we can use the Theme's
            // selectableItemBackground to ensure that the View has a pressed state
            TypedValue outValue = new TypedValue();
            getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground,
                    outValue, true);
            textView.setBackgroundResource(outValue.resourceId);
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
            // If we're running on ICS or newer, enable all-caps to match the Action Bar tab style
            textView.setAllCaps(true);
        }

        int padding = (int) (TAB_VIEW_PADDING_DIPS * getResources().getDisplayMetrics().density);
        textView.setPadding(padding, padding, padding, padding);

        return textView;
    }

    public void setTabClickCallback(OnTabClickListener callback){
        mTabClickListener = callback;
    }

    public void setProductGroupData(List<ProductData.ProductGroups> proGroupLst){
        mTabStrip.removeAllViews();
        mProGroupLst = proGroupLst;
        populateTabStrip();
    }

    private void populateTabStrip() {
        final View.OnClickListener tabClickListener = new TabClickListener();
        for (int i = 0; i < mProGroupLst.size(); i++) {
            View tabView = null;
            TextView tabTitleView = null;

            if (mTabViewLayoutId != 0) {
                // If there is a custom tab view layout id set, try and inflate it
                tabView = LayoutInflater.from(getContext()).inflate(mTabViewLayoutId, mTabStrip,
                        false);
                tabTitleView = (TextView) tabView.findViewById(mTabViewTextViewId);
            }

            if (tabView == null) {
                tabView = createDefaultTabView(getContext());
            }

            if (tabTitleView == null && TextView.class.isInstance(tabView)) {
                tabTitleView = (TextView) tabView;
            }

            ProductData.ProductGroups group = mProGroupLst.get(i);
            tabTitleView.setText(group.getProductGroupName());
            tabView.setOnClickListener(tabClickListener);
            if(i == 0)
                tabView.callOnClick();
            mTabStrip.addView(tabView);
        }
    }

    private void scrollToTab(int tabIndex, int positionOffset) {
        final int tabStripChildCount = mTabStrip.getChildCount();
        if (tabStripChildCount == 0 || tabIndex < 0 || tabIndex >= tabStripChildCount) {
            return;
        }

        View selectedChild = mTabStrip.getChildAt(tabIndex);
        if (selectedChild != null) {
            int targetScrollX = selectedChild.getLeft() + positionOffset;

            if (tabIndex > 0 || positionOffset > 0) {
                // If we're not at the first child and are mid-scroll, make sure we obey the offset
                targetScrollX -= mTitleOffset;
            }

            scrollTo(targetScrollX, 0);
        }
    }

    private class TabClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            for (int i = 0; i < mTabStrip.getChildCount(); i++) {
                if (v == mTabStrip.getChildAt(i)) {
                    v.setBackgroundColor(getResources().getColor(R.color.grey_50));
                    mTabStrip.onViewPagerPageChanged(i, 0f);
                    scrollToTab(i, 0);
                    mTabClickListener.onTabClick(mProGroupLst.get(i).getProductGroupId());
                    return;
                }
            }
        }
    }

}
