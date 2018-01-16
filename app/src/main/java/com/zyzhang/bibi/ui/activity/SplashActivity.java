package com.zyzhang.bibi.ui.activity;

import android.content.Intent;
import android.os.Bundle;

import com.zyzhang.bibi.R;
import com.zyzhang.bibi.base.BaseAppCompatActivity;
import com.zyzhang.bibi.utils.SystemUiVisibilityUtil;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;

/**
 * @Description: 启动页界面
 * @Author: zyzhang
 * @Date: 18/1/13 下午2:24
 */
public class SplashActivity extends BaseAppCompatActivity {

    @Override
    public int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        SystemUiVisibilityUtil.hideStatusBar(getWindow(), true);
        setUpSplash();
    }

    @Override
    public void initToolBar() {

    }


    private void setUpSplash() {

        Observable.timer(2000, TimeUnit.MILLISECONDS)
                .compose(bindToLifecycle())
                .observeOn(AndroidSchedulers.mainThread())
                // java8 lambda表达式
                .subscribe(aLong -> finishTask());
//                .subscribe(new Consumer<Long>() {
//                    @Override
//                    public void accept(Long aLong) throws Exception {
//                        finishTask();
//                    }
//                });


    }

    private void finishTask() {
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
        SplashActivity.this.finish();
    }


}
