package com.zyzhang.bibi.ui.fragment.home;

import android.os.Bundle;

import com.zyzhang.bibi.R;
import com.zyzhang.bibi.base.BaseFragment;

/**
 * @Description:
 * @Author: zyzhang
 * @Date: 18/1/17 下午4:40
 */
public class HomeLiveFragment extends BaseFragment {

    public static HomeLiveFragment newIntance() {
        return new HomeLiveFragment();
    }


    @Override
    public int getLayoutId() {
        return R.layout.fragment_home_live;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }
}
