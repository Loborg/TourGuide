package com.example.android.tourguide.activitys;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.example.android.tourguide.R;
import com.example.android.tourguide.adapters.ViewPagerAdapter;
import com.example.android.tourguide.models.Data;

public class MainActivity extends AppCompatActivity {

    public static int mMainImageResourceId;
    public static Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = new Data(this);

        ViewPager pager = findViewById(R.id.pager);
        ViewPagerAdapter pagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), this);
        pager.setAdapter(pagerAdapter);

        ImageView mainImage = findViewById(R.id.main_image);
        mainImage.setImageResource(mMainImageResourceId);

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(pager);
        Log.v("Selected tab", String.valueOf(tabLayout.getSelectedTabPosition()));
        ;
    }
}
