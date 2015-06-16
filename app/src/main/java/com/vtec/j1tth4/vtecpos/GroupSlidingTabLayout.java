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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by j1tth4 on 5/26/15.
 */
public class GroupSlidingTabLayout extends BaseSlidingTabLayout {

    public GroupSlidingTabLayout(Context context) {
        super(context);
    }

    public GroupSlidingTabLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GroupSlidingTabLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setTabTitle(List<ProductData.ProductGroups> productGroups){
        List<String> tabsTitle = new ArrayList<>();
        for(ProductData.ProductGroups group : productGroups){
            tabsTitle.add(group.getProductGroupName());
        }
        populateTabStrip(tabsTitle);
    }
}
