package com.example.doan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ScrollView;

import com.example.doan.fragment.ChartFragment;
import com.example.doan.fragment.HomeFragment;
import com.example.doan.fragment.LibraryFragment;
import com.example.doan.fragment.SearchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
BottomNavigationView mnBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mnBottom = findViewById(R.id.navMenu);
        mnBottom.setOnItemSelectedListener(getListener());
        mnBottom.setSelectedItemId(R.id.mnHome);
    }

    @NonNull
    private NavigationBarView.OnItemSelectedListener getListener() {
        return new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mnHome:
                        LoadFragment(new HomeFragment());

                        return true;
                    case R.id.mnSearch:
                        LoadFragment(new SearchFragment());
                        return true;
                    case R.id.AbovechartFragment:
                        LoadFragment(new AbovechartFragment());
                        return true;
                    case R.id.mnLibrary:
                        LoadFragment(new LibraryFragment());
                        return true;
                }
                return true;
            }
        };
    }

    void LoadFragment (Fragment fmNew)
    {
        FragmentTransaction fmTran = getSupportFragmentManager().beginTransaction();
        fmTran.replace(R.id.main_fragment, fmNew);
        fmTran.addToBackStack(null);
        fmTran.commit();
    }
}