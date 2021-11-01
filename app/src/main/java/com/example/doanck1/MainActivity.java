package com.example.doanck1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home_page);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.itCoolicon);

    }
    HomePage homePage = new HomePage();
    Process process = new Process();
    UserPage userPage = new UserPage();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.itCoolicon:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, homePage).commit();
                return true;

            case R.id.itIcon:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, process).commit();
                return true;

            case R.id.itLogoto:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, userPage).commit();
                return true;
        }
        return false;
    }
}