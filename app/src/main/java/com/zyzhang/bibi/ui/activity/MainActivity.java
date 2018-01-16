package com.zyzhang.bibi.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.zyzhang.bibi.R;
import com.zyzhang.bibi.base.BaseAppCompatActivity;
import com.zyzhang.bibi.ui.fragment.HomePageFragment;

public class MainActivity extends BaseAppCompatActivity {

    private HomePageFragment mHomePageFragment;
    private Fragment[] fragments;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        //初始化Fragment
        initFragments();
    }

    /**
     * 初始化Fragments
     */
    private void initFragments() {
        mHomePageFragment = HomePageFragment.newInstance();
        // TODO 添加fragment
        // 添加显示第一个fragment
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, mHomePageFragment)
                .show(mHomePageFragment).commit();
    }

    @Override
    public void initToolBar() {

    }
}
