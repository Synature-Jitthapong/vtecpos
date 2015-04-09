package com.vtec.j1tth4.vtecpos;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class PaymentActivity extends ActionBarActivity {

    private PaymentTypeSlidingTabLayout mPaymentTypeTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        mPaymentTypeTabLayout = (PaymentTypeSlidingTabLayout) findViewById(R.id.paymenttype_tab);
        mPaymentTypeTabLayout.setTabClickListener(mPayTypeTabClickListener);

        if(savedInstanceState == null){
            android.support.v4.app.FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
            CashPaymentFragment cashFragment = new CashPaymentFragment();
            trans.replace(R.id.payment_content, cashFragment);
            trans.commit();
        }
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
