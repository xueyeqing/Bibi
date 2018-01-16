package com.zyzhang.bibi.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.trello.rxlifecycle2.components.support.RxFragment;

/**
 * @Description: Fragment基类
 * @Author: zyzhang
 * @Date: 18/1/16 下午1:20
 */
public abstract class BaseFragment extends RxFragment {

    private View parentView;
    private FragmentActivity activity;

    /**
     * 设置布局layout
     *
     * @return
     */
    public abstract int getLayoutId();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        parentView = inflater.inflate(getLayoutId(), container, false);
        activity = getSupportActivity();
        return parentView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        finishCreateView(savedInstanceState);
    }

    /**
     * 初始化views
     *
     * @param state
     */
    public abstract void finishCreateView(Bundle state);


    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (FragmentActivity) activity;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        this.activity = null;
    }

    public FragmentActivity getSupportActivity() {
        return super.getActivity();
    }

    public android.app.ActionBar getSupportActionBar() {
        return getSupportActivity().getActionBar();
    }


    public Context getApplicationContext() {
        return this.activity == null ? (getActivity() == null ?
                null : getActivity().getApplicationContext()) : this.activity.getApplicationContext();
    }
}
