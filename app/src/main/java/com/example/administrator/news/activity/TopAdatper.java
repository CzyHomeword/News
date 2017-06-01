package com.example.administrator.news.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2017/6/1.
 */

public class TopAdatper extends FragmentPagerAdapter {
    private List<Fragment> topFragmentList;

    public TopAdatper(FragmentManager fm, List<Fragment> topFragmentList) {
        super(fm);
        this.topFragmentList = topFragmentList;
    }

    @Override
    public int getCount() {
        return topFragmentList.size();
    }

    @Override
    public Fragment getItem(int position) {
        return topFragmentList.get(position);
    }

}

