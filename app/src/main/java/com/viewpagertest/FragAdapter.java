package com.viewpagertest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by ASUS on 2016/7/20.
 */
public class FragAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragments;

    public FragAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    public Fragment getItem(int arg0) {
        return fragments.get(arg0);
    }

    public int getCount() {
        return fragments.size();
    }

}
