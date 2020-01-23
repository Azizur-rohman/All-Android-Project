package com.example.nevigationbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout d1;
    private ActionBarDrawerToggle abdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        d1 = (DrawerLayout)findViewById(R.id.d1);
        abdt = new ActionBarDrawerToggle(this,d1,R.string.nev_open,R.string.nev_close);
        abdt.setDrawerIndicatorEnabled(true);
        d1.addDrawerListener(abdt);
        abdt.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       final NavigationView nav_view = (NavigationView)findViewById(R.id.nav_view);

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                if(id == R.id.homemenuId)
                {
                    Toast.makeText(MainActivity.this,"Home",Toast.LENGTH_SHORT).show();
                }

                if(id == R.id.profilemenuId)
                {
                    Toast.makeText(MainActivity.this,"Profile",Toast.LENGTH_SHORT).show();
                }
                if(id == R.id.chatmenuId)
                {
                    Toast.makeText(MainActivity.this,"Chat",Toast.LENGTH_SHORT).show();
                }
                if(id == R.id.sharemenuId)
                {
                    Toast.makeText(MainActivity.this,"Share",Toast.LENGTH_SHORT).show();
                }
                if(id == R.id.contactmenuId)
                {
                    Toast.makeText(MainActivity.this,"Contact",Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return abdt.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }
}
