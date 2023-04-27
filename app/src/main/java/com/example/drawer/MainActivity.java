package com.example.drawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
private Toolbar toolbar;
private DrawerLayout drawerLayout;
private NavigationView navigationView;
private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.myDrawer);
        navigationView= findViewById(R.id.myNav);
        toggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        //----------------------------------------------------------
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
             switch (item.getItemId()){
                 case R.id.home:
                     getSupportFragmentManager().beginTransaction().replace(R.id.myframeLayout,new HomeFragment()).commit();
                     drawerLayout.closeDrawer(GravityCompat.START);
                     break;

                 case R.id.profile:
                     getSupportFragmentManager().beginTransaction().replace(R.id.myframeLayout,new ProfilFragment()).commit();
                     drawerLayout.closeDrawer(GravityCompat.START);
                     break;
                 case R.id.galerie:
                     getSupportFragmentManager().beginTransaction().replace(R.id.myframeLayout,new GalerieFragment()).commit();
                     drawerLayout.closeDrawer(GravityCompat.START);
                     break;
                 case R.id.exchange:
                     getSupportFragmentManager().beginTransaction().replace(R.id.myframeLayout,new ExchangeFragment()).commit();
                     drawerLayout.closeDrawer(GravityCompat.START);
                     break;
             }


                return true;
            }
        });
    }
}