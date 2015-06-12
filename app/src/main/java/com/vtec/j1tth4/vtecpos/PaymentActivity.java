package com.vtec.j1tth4.vtecpos;

import android.content.DialogInterface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import de.greenrobot.event.EventBus;


public class PaymentActivity extends ActionBarActivity {

    private PaymentTypeSlidingTabLayout mPaymentTypeTabLayout;

    private PaymentEvent mPaymentRef;

    private TextView mTvTotalPrice;
    private TextView mTvTotalPaid;
    private TextView mTvTotalDue;
    private TextView mTvChange;
    private Button mBtnCancel;
    private Button mBtnConfirm;

    private Toolbar mToolbar;

    public static class PaymentDeletedEvent{
    }

    public static class PaymentAddedEvent{
    }

    public static class PaymentEvent{
        public double totalPaid;
        public double totalDue;
        public double change;

        public PaymentEvent(double totalPaid, double totalDue, double change){
            this.totalPaid = totalPaid;
            this.totalDue = totalDue;
            this.change = change;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowManager.LayoutParams params = getWindow().getAttributes();
//        DisplayMetrics displaymetrics = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
//        int heightPx = displaymetrics.heightPixels;
//        int widthPx = displaymetrics.widthPixels;

        params.width = 1024;
        params.height= 600;
        //params.alpha = 1.0f;
        //params.dimAmount = 0.5f;
        getWindow().setAttributes((WindowManager.LayoutParams) params);


        setContentView(R.layout.activity_payment);
        mToolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(mToolbar);

        mPaymentTypeTabLayout = (PaymentTypeSlidingTabLayout) findViewById(R.id.payTypeTab);
        mTvTotalPrice = (TextView) findViewById(R.id.totalPrice);
        mTvTotalPaid = (TextView) findViewById(R.id.totalPaid);
        mTvTotalDue = (TextView) findViewById(R.id.totalDue);
        mTvChange = (TextView) findViewById(R.id.change);
        mBtnCancel = (Button) findViewById(R.id.btnPayCancel);
        mBtnConfirm = (Button) findViewById(R.id.btnPayConfirm);
        mPaymentTypeTabLayout.setTabClickListener(mPayTypeTabClickListener);

        if(savedInstanceState == null){
            android.support.v4.app.FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
            CashPaymentFragment cashFragment = new CashPaymentFragment();
            trans.replace(R.id.paymentContentainer, cashFragment);

            PayDetailFragment payDetailFragment = new PayDetailFragment();
            trans.replace(R.id.payDetailContentainer, payDetailFragment);
            trans.commit();
        }

        display();
    }

    private void display(){
        TransactionManager manager = TransactionManager.getInstance(this);
        Transaction trans = manager.getTransaction(true);
        mTvTotalPrice.setText(Utils.currencyFormat(this, trans.getReceiptNetSale()));
        mTvTotalDue.setText(Utils.currencyFormat(this, trans.getReceiptNetSale()));
        mTvChange.setText(Utils.currencyFormat(this, 0));
    }

    public void onEvent(PaymentDeletedEvent event){
        display();
    }

    public void onEvent(PaymentEvent event){
        mPaymentRef = event;

        mTvTotalPaid.setText(Utils.currencyFormat(this, event.totalPaid));
        mTvTotalDue.setText(Utils.currencyFormat(this, event.totalDue));
        mTvChange.setText(Utils.currencyFormat(this, event.change));

        EventBus.getDefault().post(new PaymentAddedEvent());

        if(mPaymentRef.totalDue > 0){
            mBtnConfirm.setEnabled(false);
        }else{
            mBtnConfirm.setEnabled(true);
        }
    }

    public void onClick(final View v){
        int id = v.getId();
        switch (id){
            case R.id.btnPayCancel:
                finish();
                break;
            case R.id.btnPayConfirm:
                confirm();
                break;
        }
    }

    private void confirm(){
        TransactionManager.getInstance(this).finalizeBill();
        EventBus.getDefault().post(new OrderListFragment.RefreshEvent());
        if(mPaymentRef.change > 0){
            ChangeDialogFragment f = ChangeDialogFragment.getInstance(mPaymentRef.change);
            f.show(getFragmentManager(), ChangeDialogFragment.TAG);
            f.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public void onDismiss(DialogInterface dialogInterface) {
                    finish();
                }
            });
        }else {
            finish();
        }
    }

    @Override
    protected void onDestroy() {
        TransactionManager manager = TransactionManager.getInstance(this);
        manager.deletePaymentDetail();
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_payment, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if(id == android.R.id.home){
            finish();
            return true;
        }else if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private PaymentTypeSlidingTabLayout.OnTabClickListener mPayTypeTabClickListener =
            new PaymentTypeSlidingTabLayout.OnTabClickListener() {
                @Override
                public void onPayTypeTabClick(int tabId) {
                    if(tabId == 1) {
                        android.support.v4.app.FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
                        CreditPaymentFragment creditFragment = new CreditPaymentFragment();
                        trans.replace(R.id.paymentContentainer, creditFragment);
                        trans.commit();
                    }else{
                        android.support.v4.app.FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
                        CashPaymentFragment cashFragment = new CashPaymentFragment();
                        trans.replace(R.id.paymentContentainer, cashFragment);
                        trans.commit();
                    }
                }
            };
}
