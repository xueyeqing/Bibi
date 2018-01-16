package com.zyzhang.bibi.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

/**
 * @Description: 所有的Activity都继承自此AppCompatActivity
 * @Author: zyzhang
 * @Date: 18/1/13 下午2:17
 */
public abstract class BaseAppCompatActivity extends RxAppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //设置布局内容
        setContentView(getLayoutId());
        //初始化控件
        initViews(savedInstanceState);
        //初始化ToolBar
        initToolBar();

    }

    /**
     * 设置布局layout
     *
     * @return
     */
    public abstract int getLayoutId();

    /**
     * 初始化views
     *
     * @param savedInstanceState
     */
    public abstract void initViews(Bundle savedInstanceState);

    /**
     * 初始化toolbar
     */
    public abstract void initToolBar();
}
