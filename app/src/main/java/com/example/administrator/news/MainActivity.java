package com.example.administrator.news;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import java.util.ArrayList;

public class MainActivity extends FragmentActivity {
private TabLayout mTablayout;
    private ViewPager mViewPager;
    private  MyPageAdapter myPageAdapter;
    private ArrayList<NewsFragment> mFragmentArrayList = new ArrayList<NewsFragment>();
    private  ArrayList<String> mTitleList = new ArrayList<String >();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFramgmentArrayList();
        initTitleList();

        mTablayout = (TabLayout)findViewById(R.id.sliding_tabs);
        mViewPager = (ViewPager)findViewById(R.id.viewpager);
        myPageAdapter = new MyPageAdapter(getSupportFragmentManager(),mFragmentArrayList,mTitleList);
        mViewPager.setAdapter(myPageAdapter);
        mTablayout.setupWithViewPager(mViewPager);
    }

    private void initTitleList() {
        mTitleList.add("头条");
        mTitleList.add("娱乐");
        mTitleList.add("财经");
        mTitleList.add("科技");

    }

private void initFramgmentArrayList() {
    NewsFragment fa = new NewsFragment();
    fa.setTxtContent("头条页面");

    NewsFragment fb = new NewsFragment();
    fa.setTxtContent("娱乐页面");

    NewsFragment fc = new NewsFragment();
    fa.setTxtContent("财经页面");

    NewsFragment fd = new NewsFragment();
    fa.setTxtContent("科技页面");

    mFragmentArrayList.add(fa);
    mFragmentArrayList.add(fb);
    mFragmentArrayList.add(fc);
    mFragmentArrayList.add(fd);
    }
}