package com.pakistan.kisan;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.pakistan.kisan.fragment.Account;
import com.pakistan.kisan.fragment.CategoryFragment;
import com.pakistan.kisan.fragment.SearchCategory;
import com.pakistan.kisan.fragment.Suggestions;
import com.pakistan.kisan.sale_purchase.BuyItemCategory;
import com.pakistan.kisan.sale_purchase.SellItemsCategory;

import java.util.Locale;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    boolean onHomeFragment = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Call 03036781757 or email at s@gmail.com", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        Configuration config = getResources().getConfiguration();
        if (config.getLayoutDirection() == View.LAYOUT_DIRECTION_RTL) {
            replaceFragment("تمام", new CategoryFragment(), null);
        } else {
            replaceFragment("Home", new CategoryFragment(), null);

        }
        View hView = navigationView.getHeaderView(0);
        Switch aSwitch = (Switch) hView.findViewById(R.id.switchButton);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                AppClass.previous_checked = isChecked;

                if (isChecked) {
                    AppClass.prefferdLanguage = "ldrtl";
                    AppClass.setLocaleEn(MainActivity.this);
                    restartApplication(MainActivity.this);
                } else if (!isChecked) {
                    AppClass.prefferdLanguage = "En";
                    AppClass.setLocaleAr(MainActivity.this);
                    restartApplication(MainActivity.this);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        int id = item.getItemId();
        switch (id) {
            case R.id.action_search:
                onHomeFragment = false;
                replaceFragment("Search Item", new SearchCategory(), null);
                break;
        }
        return true;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.sell) {
            // Handle the camera action
            replaceFragment(getResources().getString(R.string.sel_crops_menu), new SellItemsCategory(), null);
        } else if (id == R.id.buy) {
            replaceFragment(getResources().getString(R.string.buy_crops_menu), new BuyItemCategory(), null);

        } else if (id == R.id.agr_suggestion) {
            replaceFragment(getResources().getString(R.string.crops_title), new CategoryFragment(), null);
        } else if (id == R.id.nav_help) {
            replaceFragment(getResources().getString(R.string.suggestion_menu), new Suggestions(), null);
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_account) {
            replaceFragment(getResources().getString(R.string.account_menue), new Account(), null);

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void replaceFragment(String title, Fragment fragment, Bundle bundle) {
        getSupportActionBar().setTitle(title);
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content_home, fragment);
        if (bundle != null) {
            fragment.setArguments(bundle);
        }
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }


    void restartApplication(Activity activity) {
        Intent i = new Intent(activity, MainActivity.class);

        if(Locale.getDefault().getDisplayLanguage()=="en")
        {
            Configuration configuration = getResources().getConfiguration();
            configuration.setLayoutDirection(new Locale("fa"));
            getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
        }
        else
        {
            Configuration configuration = getResources().getConfiguration();
            configuration.setLayoutDirection(new Locale("en"));
            getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
        }

        i.putExtra("class", "com.pakistan.kisan.MainActivity");
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
        finish();
    }
}
