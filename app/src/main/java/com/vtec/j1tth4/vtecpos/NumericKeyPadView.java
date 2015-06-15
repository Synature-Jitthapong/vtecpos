package com.vtec.j1tth4.vtecpos;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

/**
 * Created by j1tth4 on 6/15/15.
 */
public class NumericKeyPadView extends LinearLayoutCompat {

    public static final int MIN_BUTTON_WIDTH = 64;
    public static final int MIN_BUTTON_HEIGHT = 48;

    private static final int[] NUMERIC = {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9
    };

    public static interface OnNumericButtonClickListener{
        void onNumericButtonClick(int value);
    }

    private OnNumericButtonClickListener mCallback;

    public NumericKeyPadView(Context context) {
        this(context, null);
    }

    public NumericKeyPadView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NumericKeyPadView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        addButtonToLayout();
    }

    public void setmCallback(OnNumericButtonClickListener callback){
        mCallback = callback;
    }

    private void addButtonToLayout(){
        removeAllViews();
        for(int number : NUMERIC){
            AppCompatButton btn = new AppCompatButton(getContext());
            btn.setText(String.valueOf(number));
            btn.setMinWidth(MIN_BUTTON_HEIGHT);
            btn.setMinHeight(MIN_BUTTON_HEIGHT);
            btn.setOnClickListener(new OnButtonClick(number));
            LayoutParams param = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT, 1f);
            addView(btn, param);
        }
    }

    private class OnButtonClick implements OnClickListener{

        private int value;

        public OnButtonClick(int value){
            this.value = value;
        }

        @Override
        public void onClick(View view) {
            if(mCallback != null){
                mCallback.onNumericButtonClick(value);
            }
        }
    }
}
