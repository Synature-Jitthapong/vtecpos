package com.vtec.j1tth4.vtecpos;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity{

    static String[] sDrawerItems = {
        "","","",""
    };

    private android.support.v7.app.ActionBarDrawerToggle mDrawerToggle;

    private TransactionManager mTransManager;

    private DrawerLayout mDrawerLayout;
    private ListView mLvDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTransManager = TransactionManager.getInstance(this);
        mTransManager.insertTransaction();

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mLvDrawer = (ListView) findViewById(R.id.left_drawer);

        final ActionBar actionBar = getSupportActionBar();
        mLvDrawer.setAdapter(new DrawerListAdapter());
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.app_name, R.string.app_name);

        // Set the drawer toggle as the DrawerListener
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);

        if(savedInstanceState == null){
            android.support.v4.app.FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
            FoodMenuFragment foodMenuFragment = new FoodMenuFragment();
            trans.replace(R.id.rightcontent, foodMenuFragment);
            OrderListFragment orderListFragment = new OrderListFragment();
            trans.replace(R.id.leftcontent, orderListFragment);
            trans.commit();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        mTransManager.insertTransaction();
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        // If the nav drawer is open, hide action items related to the content view
        boolean drawerOpen = mDrawerLayout.isDrawerOpen(mLvDrawer);
        //menu.findItem(R.id.action_websearch).setVisible(!drawerOpen);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClick(final View v){
        int id = v.getId();
        if(id == R.id.btnPay){
           gotoPayment();
        }
    }

    private void gotoPayment(){
        if(mTransManager.countOrder(true) > 0) {
            Intent intent = new Intent(this, PaymentActivity.class);
            startActivity(intent);
        }
    }

    private class DrawerListAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return sDrawerItems.length;
        }

        @Override
        public Object getItem(int i) {
            return sDrawerItems[i];
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHolder holder;
            if(view == null){
                holder = new ViewHolder();
                view = getLayoutInflater().inflate(R.layout.drawer_list_item, viewGroup, false);
                holder.img = (ImageView) view.findViewById(R.id.imageView);
                view.setTag(holder);
            }else{
                holder = (ViewHolder) view.getTag();
            }
            return view;
        }

        class ViewHolder{
            ImageView img;
        }
    }
}
