package com.zyzhang.bibi.ui.fragment.home;

import android.os.Bundle;

import com.zyzhang.bibi.R;
import com.zyzhang.bibi.base.BaseFragment;

/**
 * @Description:
 * @Author: zyzhang
 * @Date: 18/1/17 下午4:45
 */
public class HomeBangumiFragment extends BaseFragment {

    public static HomeBangumiFragment newInstance() {
        return new HomeBangumiFragment();
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home_bangumi;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }
}
