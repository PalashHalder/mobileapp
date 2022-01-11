package com.cit.fodie;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    BottomNavigationView botNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);


        drawerLayout = findViewById(R.id.drawerLay);
        navigationView = findViewById(R.id.navView);
        botNav = findViewById(R.id.botNav);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout, toolbar, R.string.drawerOpen, R.string.drawerClose);
        drawerLayout.addDrawerListener(toggle);

        toggle.syncState();

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_pizza_24);


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {

                    case R.id.burger_nav:
                        Toast.makeText(MainActivity.this, "B Nav ", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.coffee_nav:
                        Toast.makeText(MainActivity.this, "C Nav ", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.pizza_nav:
                        Toast.makeText(MainActivity.this, "P Nav ", Toast.LENGTH_SHORT).show();
                        break;


                }


                return false;
            }
        });


        botNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {

                    case R.id.burger_bot:
                        Toast.makeText(MainActivity.this, "B Bot ", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.coffee_bot:
                        Toast.makeText(MainActivity.this, "C Bot ", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.pizza_bot:
                        Toast.makeText(MainActivity.this, "P Bot ", Toast.LENGTH_SHORT).show();
                        break;


                }


                return false;
            }
        });


    }

    public void ViewAll(View view) {

  /*      Intent intent = new Intent(MainActivity.this, FullActivity.class);

        startActivity(intent);*/

        startActivity(new Intent(getApplicationContext(), FullActivity.class));


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.coffee:

                Toast.makeText(this, "Coffee Anan", Toast.LENGTH_SHORT).show();

                break;
            case R.id.burger:
                Toast.makeText(this, "Burger Khan", Toast.LENGTH_SHORT).show();

                break;
            case R.id.pizza:
                Toast.makeText(this, "Pizza Chaban", Toast.LENGTH_SHORT).show();

                break;


        }


        return true;
    }
}