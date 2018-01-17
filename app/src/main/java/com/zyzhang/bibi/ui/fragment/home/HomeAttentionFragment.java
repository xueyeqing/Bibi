package com.zyzhang.bibi.ui.fragment.home;

import android.os.Bundle;

import com.zyzhang.bibi.R;
import com.zyzhang.bibi.base.BaseFragment;

/**
 * @Description:
 * @Author: zyzhang
 * @Date: 18/1/17 下午4:48
 */
public class HomeAttentionFragment extends BaseFragment {

    public static HomeAttentionFragment newInstance() {
        return new HomeAttentionFragment();
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_attention;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }
}
