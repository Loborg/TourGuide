package com.example.android.tourguide.activitys;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.example.android.tourguide.R;
import com.example.android.tourguide.adapters.SightAdapter;
import com.example.android.tourguide.adapters.ViewPagerAdapter;
import com.example.android.tourguide.models.Data;

/**This is the 5th app for Udacity's Android Basic Nanodegree program:<br>
 * The app is about a TourGuid app<br>
 * The app contains 4 major location in Hungary, three of witch are a city and one of them is a region<br>
 * Every location has 4 sights you can visit
 * <p><b>The images for the locations and for the sights are from:</b>
 * <li>https://www.keszthely.hu/</li>
 * <li>http://www.pecs.hu/</li>
 * <li>https://szeged.hu/</li>
 * <li>https://www.tripadvisor.co.hu</li></p>*/

public class MainActivity extends AppCompatActivity {
    public Data data;
    private ImageView mainImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = new Data(this);

        //Setting up the ViewPager whit a costume Adapter
        ViewPager pager = findViewById(R.id.pager);
        final ViewPagerAdapter pagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), this);
        pager.setAdapter(pagerAdapter);

        //Handel the main image appearance on the starting page
        int pagerIndex = pager.getCurrentItem();
        mainImage = findViewById(R.id.main_image);
        mainImage.setImageResource(data.mainImagesResourceIdList.get(pagerIndex));

        //Sets up the TabLayout's texts
        final TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setSelectedTabIndicatorColor(data.sightsColor.get(pagerIndex));
        tabLayout.setupWithViewPager(pager);

        //Handel the change of the ViewPager: When change happens it the it sets the main image according to the currently visible Fragment
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                mainImage.setImageResource(data.mainImagesResourceIdList.get(position));
                tabLayout.setSelectedTabIndicatorColor(data.sightsColor.get(position));
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
