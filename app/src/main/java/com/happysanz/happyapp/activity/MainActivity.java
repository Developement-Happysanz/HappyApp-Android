package com.happysanz.happyapp.activity;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.happysanz.happyapp.R;
import com.happysanz.happyapp.fragments.AboutUsFragment;
import com.happysanz.happyapp.fragments.BrandingFragment;
import com.happysanz.happyapp.fragments.DigitalMarketingFragment;
import com.happysanz.happyapp.fragments.LandingFragment;
import com.happysanz.happyapp.fragments.MenuFragment;
import com.happysanz.happyapp.fragments.MobileAppFragment;
import com.happysanz.happyapp.fragments.WebDevelopmentFragment;
import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;
import com.luseen.spacenavigation.SpaceOnLongClickListener;

public class MainActivity extends AppCompatActivity {

    private ImageView ONE, TWO;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeFragment(0);
        SpaceNavigationView spaceNavigationView = (SpaceNavigationView) findViewById(R.id.space);
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);
        spaceNavigationView.addSpaceItem(new SpaceItem("MENU", R.drawable.ic_menu));
        spaceNavigationView.addSpaceItem(new SpaceItem("ABOUT US", R.drawable.ic_about_us));
        spaceNavigationView.setCentreButtonIconColorFilterEnabled(false);
        spaceNavigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
//                Toast.makeText(MainActivity.this,"onCentreButtonClick", Toast.LENGTH_SHORT).show();
                changeFragment(0);
            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
//                Toast.makeText(MainActivity.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
                if (itemIndex == 0){
                    changeFragment(1);
                } else if (itemIndex == 1) {
                    changeFragment(2);
                }
            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {
//                Toast.makeText(MainActivity.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
                if (itemIndex == 0){
                    changeFragment(1);
                } else if (itemIndex == 1) {
                    changeFragment(2);
                }
            }
        });

        spaceNavigationView.setSpaceOnLongClickListener(new SpaceOnLongClickListener() {
            @Override
            public void onCentreButtonLongClick() {
//                Toast.makeText(MainActivity.this,"onCentreButtonLongClick", Toast.LENGTH_SHORT).show();
                changeFragment(0);

            }

            @Override
            public void onItemLongClick(int itemIndex, String itemName) {
//                Toast.makeText(MainActivity.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
                if (itemIndex == 0){
                    changeFragment(1);
                } else if (itemIndex == 1) {
                    changeFragment(2);
                }
            }
        });

    }

    private void changeFragment(int position) {

        Fragment newFragment = null;

        if (position == 0) {
            newFragment = new LandingFragment();
        } else if (position == 1) {
            newFragment = new MenuFragment();
        } else if (position == 2) {
            newFragment = new AboutUsFragment();
        } else if (position == 3) {
            newFragment = new DigitalMarketingFragment();
        } else if (position == 4) {
            newFragment = new MobileAppFragment();
        } else if (position == 5) {
            newFragment = new WebDevelopmentFragment();
        } else if (position == 6) {
            newFragment = new BrandingFragment();
        }

        getFragmentManager().beginTransaction().replace(
                R.id.fragmentContainer, newFragment)
                .commit();
    }

}

