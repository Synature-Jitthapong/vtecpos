package com.vtec.j1tth4.vtecpos;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;

/**
 * Created by j1tth4 on 6/10/15.
 */
public class OpenPriceFragment extends DialogFragment {

    public static final String TAG = "OpenPriceFragment";


    public static interface OpenPriceCallback{
        void onEnterPrice(double price);
    }

    private String mTitle;
    private OpenPriceCallback mCallback;

    public static OpenPriceFragment getInstance(String title){
        OpenPriceFragment f = new OpenPriceFragment();
        Bundle b = new Bundle();
        b.putString("title", title);
        f.setArguments(b);
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTitle = getArguments().getString("title");
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final EditText txtOpenPrice = new EditText(getActivity());
        txtOpenPrice.setInputType(InputType.TYPE_CLASS_NUMBER |
            InputType.TYPE_NUMBER_FLAG_DECIMAL);
        txtOpenPrice.setHint(getString(R.string.enter_price));
        txtOpenPrice.setTextSize(32);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(mTitle);
        builder.setView(txtOpenPrice);
        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.setPositiveButton(android.R.string.ok, null);
        final AlertDialog dialog = builder.create();
        dialog.show();
        dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double price = Utils.parseDouble(txtOpenPrice.getText());
                if(price > 0) {
                    if(mCallback != null) {
                        dialog.dismiss();
                        mCallback.onEnterPrice(price);
                    }
                }
            }
        });
        return dialog;
    }

    public void setCallback(OpenPriceCallback callback){
        mCallback = callback;
    }
}
