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

        init();
    }

    /**
     * 初始化应用程序，设置一些初始化数据,获取数据等操作
     */
    protected abstract void init();
}
