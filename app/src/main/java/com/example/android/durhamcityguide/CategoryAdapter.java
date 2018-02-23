package com.example.android.durhamcityguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Caspar on 23-Jan-18.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm)  {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HotelsFragment();
        } else if (position == 1) {
            return new SitesFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else if (position == 3) {
            return new BarsFragment();
        } else {
            return new ClubsFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Hotels";
        } else if (position == 1) {
            return "Sites";
        } else if (position == 2) {
            return "Restaurants";
        } else if (position == 3) {
            return "Bars";
        } else {
            return "Nightclubs";
        }
    }
}
