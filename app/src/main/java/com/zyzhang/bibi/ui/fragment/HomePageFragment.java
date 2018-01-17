package com.zyzhang.bibi.ui.fragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.flyco.tablayout.SlidingTabLayout;
import com.zyzhang.bibi.R;
import com.zyzhang.bibi.adapter.pager.HomePagerAdapter;
import com.zyzhang.bibi.base.BaseFragment;

/**
 * @Description: 首页模块主界面
 * @Author: zyzhang
 * @Date: 18/1/16 下午1:46
 */
public class HomePageFragment extends BaseFragment {

    private SlidingTabLayout mSlidingTablayout;
    private ViewPager mViewPager;

    public static HomePageFragment newInstance() {
        return new HomePageFragment();
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home_pager;
    }

    @Override
    public void finishCreateView(Bundle state) {
        mSlidingTablayout = (SlidingTabLayout) $(R.id.sliding_tbas);
        mViewPager = (ViewPager) $(R.id.view_pager);

        initViewPager();
    }

    private void initViewPager() {
        HomePagerAdapter mHomeAdapter = new HomePagerAdapter(getChildFragmentManager(), getApplicationContext());
        // 预加载的页面数量
        mViewPager.setOffscreenPageLimit(5);
        mViewPager.setAdapter(mHomeAdapter);
        mSlidingTablayout.setViewPager(mViewPager);
        mViewPager.setCurrentItem(1);
    }
}
