package com.trps.gobest_technician;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.trps.gobest_technician.Billing_Status.Billing_Status_Fragment;
import com.trps.gobest_technician.Distributer.Distributer_Fragment;
import com.trps.gobest_technician.Enquiry.Enquiry_Fragment;
import com.trps.gobest_technician.Home.Home_Fragment;
import com.trps.gobest_technician.Live.Live_Fragment;
import com.trps.gobest_technician.News.News_Fragment;
import com.trps.gobest_technician.Offers.Offers_Fragment;
import com.trps.gobest_technician.Part_Details.Part_Details_Fragment;
import com.trps.gobest_technician.Profile.Profile_Fragment;
import com.trps.gobest_technician.Sales_Status.Sales_Status_Fragment;
import com.trps.gobest_technician.Staff.Staff_Fragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    DrawerLayout drawer;
    protected OnBackPressedListener onBackPressedListener;
    Fragment Home_Fragment = new Home_Fragment();
    Fragment Profile_Fragment = new Profile_Fragment();
    Fragment Sales_Status_Fragment = new Sales_Status_Fragment();
    Fragment Distributer_Fragment = new Distributer_Fragment();
    Fragment Part_Detail_Fragment = new Part_Details_Fragment();
    Fragment Biling_Status_Fragment = new Billing_Status_Fragment();
    Fragment Live_Fragment = new Live_Fragment();
    Fragment Staff_Fragment = new Staff_Fragment();
    Fragment News_Fragment = new News_Fragment();
    Fragment Enquiry_Fragment = new Enquiry_Fragment();
    Fragment Offers_Fragment = new Offers_Fragment();

    public interface OnBackPressedListener {
        void doBack();
    }

    public void setOnBackPressedListener(OnBackPressedListener onBackPressedListener) {
        this.onBackPressedListener = onBackPressedListener;
    }

    @Override
    protected void onDestroy() {
        onBackPressedListener = null;
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        if (onBackPressedListener != null) {
            onBackPressedListener.doBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame,Home_Fragment).commit();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace_Admin with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);

        navigationView.getMenu().getItem(0).setChecked(false);

        int size = navigationView.getMenu().size();
        for (int i = 0; i < size; i++) {
            navigationView.getMenu().getItem(i).setCheckable(false);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();


        if (id == R.id.Home_nav_view) {

            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, Home_Fragment).addToBackStack(null).commit();

        } else if (id == R.id.Profile_nav_view) {

            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, Profile_Fragment).addToBackStack(null).commit();

        } else if (id == R.id.Sale_nav_view) {

            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, Sales_Status_Fragment).addToBackStack(null).commit();

        } else if (id == R.id.Distributer_nav_view) {

            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, Distributer_Fragment).addToBackStack(null).commit();

        } else if (id == R.id.Part_nav_view) {

            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, Part_Detail_Fragment).addToBackStack(null).commit();

        } else if (id == R.id.Billing_nav_view) {

            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, Biling_Status_Fragment).addToBackStack(null).commit();

        } else if (id == R.id.Live_Status_nav_view) {

            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, Live_Fragment).addToBackStack(null).commit();


        } else if (id == R.id.Staff_nav_view) {
            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, Staff_Fragment).addToBackStack(null).commit();


        } else if (id == R.id.News_nav_view) {

            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, News_Fragment).addToBackStack(null).commit();


        } else if (id == R.id.Enquiry_nav_view) {

            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, Enquiry_Fragment).addToBackStack(null).commit();

        } else if (id == R.id.Other_Franchise_nav_view) {
            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, Distributer_Fragment).addToBackStack(null).commit();

        } else if (id == R.id.Offers_nav_view) {
            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, Offers_Fragment).addToBackStack(null).commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
