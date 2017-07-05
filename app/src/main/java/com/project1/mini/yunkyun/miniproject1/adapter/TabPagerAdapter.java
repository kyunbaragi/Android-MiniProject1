package com.project1.mini.yunkyun.miniproject1.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.project1.mini.yunkyun.miniproject1.fragment.EmptyFragment;
import com.project1.mini.yunkyun.miniproject1.fragment.TimelineFragment;

/**
 * Created by YunKyun on 2017-07-04.
 */

public class TabPagerAdapter extends FragmentStatePagerAdapter {
    private int tabCount;

    public TabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        // Returning the current tabs
        switch (position) {
            case 0:
                fragment = new TimelineFragment();
                break;
            case 1:
                fragment = new EmptyFragment();
                break;
            case 2:
                fragment = new EmptyFragment();
                break;
            default:
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
