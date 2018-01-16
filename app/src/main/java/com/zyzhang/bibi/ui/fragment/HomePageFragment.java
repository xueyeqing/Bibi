package com.zyzhang.bibi.ui.fragment;

import android.os.Bundle;

import com.zyzhang.bibi.R;
import com.zyzhang.bibi.base.BaseFragment;

/**
 * @Description: 首页模块主界面
 * @Author: zyzhang
 * @Date: 18/1/16 下午1:46
 */
public class HomePageFragment extends BaseFragment {

    public static HomePageFragment newInstance() {
        return new HomePageFragment();
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home_pager;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }
}
