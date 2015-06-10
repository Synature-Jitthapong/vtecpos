package com.vtec.j1tth4.vtecpos;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by j1tth4 on 6/10/15.
 */
public class ChangeDialogFragment extends DialogFragment {

    public  static final String TAG = "ChangeDialogFragment";

    private DialogInterface.OnDismissListener mOnDismissListener;

    private double mChange;

    public static ChangeDialogFragment getInstance(double change){
        ChangeDialogFragment f = new ChangeDialogFragment();
        Bundle b = new Bundle();
        b.putDouble("change", change);
        f.setArguments(b);
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mChange = getArguments().getDouble("change");
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        TextView tvChange = new TextView(getActivity());
        tvChange.setTextSize(64);
        tvChange.setText(Utils.currencyFormat(getActivity(), mChange));
        LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        param.setMarginStart(8);
        param.setMarginEnd(8);
        tvChange.setGravity(Gravity.CENTER);
        tvChange.setLayoutParams(param);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(getString(R.string.change));
        builder.setView(tvChange);
        builder.setNeutralButton(getString(R.string.close), new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(mOnDismissListener != null){
                    mOnDismissListener.onDismiss(dialogInterface);
                }
            }
        });
        final AlertDialog dialog = builder.create();
        dialog.show();
        return dialog;
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener callback){
        mOnDismissListener = callback;
    }
}
