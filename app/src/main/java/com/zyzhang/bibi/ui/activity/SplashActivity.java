package com.zyzhang.bibi.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.zyzhang.bibi.R;
import com.zyzhang.bibi.base.BaseAppCompatActivity;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

/**
 * @Description: 启动页界面
 * @Author: zyzhang
 * @Date: 18/1/13 下午2:24
 */
public class SplashActivity extends BaseAppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        setUpSplash();
    }

    @Override
    protected void init() {
        Log.d("thsgzzy", "init()");
    }

    private void setUpSplash() {
        Observable.timer(2000, TimeUnit.MILLISECONDS);

//        Observable.timer(2000, TimeUnit.MILLISECONDS)
//                .compose(bindToLifecycle())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(aLong -> finishTask());
    }


}
