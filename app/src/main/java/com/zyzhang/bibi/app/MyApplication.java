package com.zyzhang.bibi.app;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * @Description:
 * @Author: zyzhang
 * @Date: 18/1/13 上午11:08
 */
public class MyApplication extends Application {

    public static MyApplication mInstance;

    private RefWatcher refWatcher;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        refWatcher = setupLeakCanary();
    }

    private RefWatcher setupLeakCanary() {
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return RefWatcher.DISABLED;
        }
        return LeakCanary.install(this);
    }

    /**
     * 静态方法来返回全局RefWatcher
     *
     * @param context
     * @return
     */
    public static RefWatcher getRefWatcher(Context context) {
        MyApplication leakApplication = (MyApplication) context.getApplicationContext();
        return leakApplication.refWatcher;
    }

    public static MyApplication getInstance() {
        return mInstance;
    }

}
