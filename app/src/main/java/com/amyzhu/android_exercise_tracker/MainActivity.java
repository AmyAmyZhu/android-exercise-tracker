package com.amyzhu.android_exercise_tracker;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.amyzhu.android_exercise_tracker.fragments.CalendarFragment;
import com.amyzhu.android_exercise_tracker.fragments.HomeFragment;
import com.amyzhu.android_exercise_tracker.fragments.SettingFragment;
import com.amyzhu.android_exercise_tracker.fragments.SummaryFragment;

import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager manager = getSupportFragmentManager();
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    manager.beginTransaction()
                            .replace(R.id.fragment_container, new HomeFragment())
                            .commit();
                    return true;
                case R.id.navigation_calendar:
                    manager.beginTransaction()
                            .replace(R.id.fragment_container, new CalendarFragment())
                            .commit();
                    return true;
                case R.id.navigation_summary:
                    manager.beginTransaction()
                            .replace(R.id.fragment_container, new SummaryFragment())
                            .commit();
                    return true;
                case R.id.navigation_setting:
                    manager.beginTransaction()
                            .replace(R.id.fragment_container, new SettingFragment())
                            .commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
