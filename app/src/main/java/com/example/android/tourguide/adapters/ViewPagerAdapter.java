package com.example.android.tourguide.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import com.example.android.tourguide.R;
import com.example.android.tourguide.activitys.MainActivity;
import com.example.android.tourguide.fragments.AlfoldFragment;
import com.example.android.tourguide.fragments.KeszthelyFragment;
import com.example.android.tourguide.fragments.PecsFragment;
import com.example.android.tourguide.fragments.SzegedFragment;
import com.example.android.tourguide.models.Data;


public class ViewPagerAdapter extends FragmentPagerAdapter {

    Context mContext;

    public ViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new KeszthelyFragment();
            case 1:
                return new SzegedFragment();
            case 2:
                return new PecsFragment();
            case 3:
                return new AlfoldFragment();
                default:
                    return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return mContext.getResources().getString(R.string.sight_name_keszthely);
            case 1:
                return mContext.getResources().getString(R.string.sight_name_szeged);
            case 2:
                return mContext.getResources().getString(R.string.sight_name_pecs);
            case 3:
                return mContext.getResources().getString(R.string.sight_name_alfold);
                default:
                    return null;
        }
    }
}
