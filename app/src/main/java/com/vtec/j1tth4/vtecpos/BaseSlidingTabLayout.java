package com.vtec.j1tth4.vtecpos;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by j1tth4 on 5/26/15.
 */
public abstract class BaseSlidingTabLayout extends HorizontalScrollView {

    private static final int TITLE_OFFSET_DIPS = 24;
    public static final int TAB_VIEW_TEXT_SIZE_SP = 12;
    private static final int TAB_VIEW_PADDING_DIPS = 16;

    public static interface OnTabClickListener{
        void onTabClick(int position);
    }

    private OnTabClickListener mTabClickListener;
    private int mTitleOffset;

    private SlidingTabStrip mTabStrip;
    private int mTabViewLayoutId;
    private int mTabViewTextViewId;

    public BaseSlidingTabLayout(Context context) {
        this(context, null);
    }

    public BaseSlidingTabLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BaseSlidingTabLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        // Disable the Scroll Bar
        setHorizontalScrollBarEnabled(false);
        // Make sure that the Tab Strips fills this View
        setFillViewport(true);

        mTitleOffset = (int) (TITLE_OFFSET_DIPS * getResources().getDisplayMetrics().density);

        mTabStrip = new SlidingTabStrip(context);
        //setTabStripBackgroundColor(getResources().getColor(R.color.grey_50));
        addView(mTabStrip, LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
    }

    public void setTabStripDividerColor(){
        mTabStrip.setTabDividerColor((byte)0x20);
    }

    public void setTabStripBackgroundColor(int color){
        mTabStrip.setBackgroundColor(color);
        //mTabStrip.setTabIndicatorColor(getResources().getColor(android.R.color.transparent));
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

    public void setTabClickListener(OnTabClickListener listener){
        mTabClickListener = listener;
    }

    public void populateTabStrip(List<String> tabsTitle) {
        final OnClickListener tabClickListener = new TabClickListener();
        for (int i = 0; i < tabsTitle.size(); i++) {
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
            tabTitleView.setText(tabsTitle.get(i));
            tabView.setOnClickListener(tabClickListener);
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

            //scrollTo(targetScrollX, 0);
        }
    }

    private class TabClickListener implements OnClickListener {
        @Override
        public void onClick(View v) {
            for (int i = 0; i < mTabStrip.getChildCount(); i++) {
                if (v == mTabStrip.getChildAt(i)) {
                    mTabStrip.onViewPagerPageChanged(i, 0f);
                    scrollToTab(i, 0);
                    mTabClickListener.onTabClick(i);
                    return;
                }
            }
        }
    }

}
