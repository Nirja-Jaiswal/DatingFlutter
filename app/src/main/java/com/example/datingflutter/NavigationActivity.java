package com.example.datingflutter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NavigationActivity extends AppCompatActivity {

    BottomNavigationView bnv;
    BadgeDrawable badge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.FrameContiner,new HomeFragment()).commit();

        bnv=(BottomNavigationView)findViewById(R.id.bottomNavigation);
        badge=bnv.getOrCreateBadge(R.id.menu_message);
        badge.setNumber(1000);

        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()

        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item){
                badge=bnv.getBadge(item.getItemId());
                if(badge !=null){
                    badge.clearNumber();
                }
                Fragment temp=null;
                switch (item.getItemId())
                {
                    case R.id.menu_home : temp=new HomeFragment();
                        break;
                    case R.id.menu_message : temp=new MessageFragment();
                        break;
                    case R.id.menu_search : temp=new SearchFragment();
                        break;
                    case R.id.menu_person : temp=new PersonFragment();

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.FrameContiner,temp).commit();
                return true;


            }

        });



    }
}

