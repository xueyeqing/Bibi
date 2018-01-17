package com.zyzhang.bibi.ui.fragment.home;

import android.os.Bundle;

import com.zyzhang.bibi.R;
import com.zyzhang.bibi.base.BaseFragment;

/**
 * @Description:
 * @Author: zyzhang
 * @Date: 18/1/17 下午4:44
 */
public class HomeRecommendedFragment extends BaseFragment {

    public static HomeRecommendedFragment newInstance() {
        return new HomeRecommendedFragment();
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home_recommended;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }
}
