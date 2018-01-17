package com.zyzhang.bibi.ui.fragment.home;

import android.os.Bundle;

import com.zyzhang.bibi.R;
import com.zyzhang.bibi.base.BaseFragment;

/**
 * @Description:
 * @Author: zyzhang
 * @Date: 18/1/17 下午4:50
 */
public class HomeDiscoverFragment extends BaseFragment {

    public static HomeDiscoverFragment newInstance() {
        return new HomeDiscoverFragment();
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_discover;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }
}
