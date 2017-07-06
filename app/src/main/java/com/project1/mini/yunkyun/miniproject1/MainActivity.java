package com.project1.mini.yunkyun.miniproject1;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.project1.mini.yunkyun.miniproject1.adapter.TabPagerAdapter;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToolbar();
        setTabLayout();
        setViewPager();
    }

    private void setToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        ImageButton camera = (ImageButton) findViewById(R.id.btn_toolbar_camera);
        ImageButton messenger = (ImageButton) findViewById(R.id.btn_toolbar_messenger);
        camera.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "카메라를 실행합니다.", Toast.LENGTH_SHORT).show();
            }
        });
        messenger.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "메신저를 실행합니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setTabLayout() {
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_tab_globe_focus));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_tab_timeline));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_tab_history));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }

    private void setViewPager() {
        // Initializing ViewPager
        viewPager = (ViewPager) findViewById(R.id.pager);

        // Creating TabPagerAdapter adapter
        TabPagerAdapter pagerAdapter = new TabPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        // Set TabSelectedListener
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int tabPos = tab.getPosition();
                viewPager.setCurrentItem(tabPos);
                switch (tabPos){
                    case 0:
                        tabLayout.getTabAt(0).setIcon(R.drawable.ic_tab_globe_focus);
                        tabLayout.getTabAt(1).setIcon(R.drawable.ic_tab_timeline);
                        tabLayout.getTabAt(2).setIcon(R.drawable.ic_tab_history);
                        break;
                    case 1:
                        tabLayout.getTabAt(0).setIcon(R.drawable.ic_tab_globe);
                        tabLayout.getTabAt(1).setIcon(R.drawable.ic_tab_timeline_focus);
                        tabLayout.getTabAt(2).setIcon(R.drawable.ic_tab_history);
                        break;
                    case 2:
                        tabLayout.getTabAt(0).setIcon(R.drawable.ic_tab_globe);
                        tabLayout.getTabAt(1).setIcon(R.drawable.ic_tab_timeline);
                        tabLayout.getTabAt(2).setIcon(R.drawable.ic_tab_history_focus);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}

            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });
    }
}
