package com.vtec.j1tth4.vtecpos;

import android.content.Context;
import android.util.AttributeSet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by j1tth4 on 6/16/15.
 */
public class PromotionSlidingTabLayout extends BaseSlidingTabLayout {

    public PromotionSlidingTabLayout(Context context) {
        super(context);
    }

    public PromotionSlidingTabLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PromotionSlidingTabLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        setTabStripBackgroundColor(getResources().getColor(R.color.indigo));
    }

    public void setTabTitle(){
        String[] tabs = {
                "10%",
                "15%",
                "20%"
        };
        List<String> tabsTitle = new ArrayList<>();
        for(String title : tabs){
            tabsTitle.add(title);
        }
        populateTabStrip(tabsTitle);
    }
}
