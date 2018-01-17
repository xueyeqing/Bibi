package com.zyzhang.bibi.ui.fragment.home;

import android.os.Bundle;

import com.zyzhang.bibi.R;
import com.zyzhang.bibi.base.BaseFragment;

/**
 * @Description:
 * @Author: zyzhang
 * @Date: 18/1/17 下午4:47
 */
public class HomeRegionFragment extends BaseFragment {

    public static HomeRegionFragment newInstance() {
        return new HomeRegionFragment();
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home_region;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }
}
