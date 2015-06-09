package com.vtec.j1tth4.vtecpos;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.vtec.j1tth4.vtecpos.provider.Transaction;

import de.greenrobot.event.EventBus;


public class PaymentActivity extends ActionBarActivity {

    private PaymentTypeSlidingTabLayout mPaymentTypeTabLayout;

    private TextView mTvTotalPrice;
    private TextView mTvTotalPaid;
    private TextView mTvTotalDue;
    private TextView mTvChange;

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
        params.width = 1024;
        params.height= 600;
        params.alpha = 1.0f;
        params.dimAmount = 0.5f;
        getWindow().setAttributes((WindowManager.LayoutParams) params);

        setContentView(R.layout.activity_payment);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        mPaymentTypeTabLayout = (PaymentTypeSlidingTabLayout) findViewById(R.id.paymenttype_tab);
        mTvTotalPrice = (TextView) findViewById(R.id.total_price);
        mTvTotalPaid = (TextView) findViewById(R.id.total_paid);
        mTvTotalDue = (TextView) findViewById(R.id.total_due);
        mTvChange = (TextView) findViewById(R.id.change);
        mPaymentTypeTabLayout.setTabClickListener(mPayTypeTabClickListener);

        if(savedInstanceState == null){
            android.support.v4.app.FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
            CashPaymentFragment cashFragment = new CashPaymentFragment();
            trans.replace(R.id.payment_content, cashFragment);

            PayDetailFragment payDetailFragment = new PayDetailFragment();
            trans.replace(R.id.paydetail_content, payDetailFragment);
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
        mTvTotalPaid.setText(Utils.currencyFormat(this, event.totalPaid));
        mTvTotalDue.setText(Utils.currencyFormat(this, event.totalDue));
        mTvChange.setText(Utils.currencyFormat(this, event.change));

        EventBus.getDefault().post(new PaymentAddedEvent());
    }

    public void onClick(final View v){
        int id = v.getId();
        switch (id){
            case R.id.pay_cancel:
                break;
            case R.id.pay_confirm:
                TransactionManager.getInstance(this).finalizeBill();
                EventBus.getDefault().post(new OrderListFragment.RefreshEvent());

                finish();
                break;
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
                        trans.replace(R.id.payment_content, creditFragment);
                        trans.commit();
                    }else{
                        android.support.v4.app.FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
                        CashPaymentFragment cashFragment = new CashPaymentFragment();
                        trans.replace(R.id.payment_content, cashFragment);
                        trans.commit();
                    }
                }
            };
}
