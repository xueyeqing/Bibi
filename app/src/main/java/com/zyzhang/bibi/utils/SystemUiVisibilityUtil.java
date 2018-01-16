package com.zyzhang.bibi.utils;

import android.view.Window;
import android.view.WindowManager;

/**
 * @Description: StatusBar隐藏显示工具类
 * @Author: zyzhang
 * @Date: 18/1/14 下午2:07
 */
public class SystemUiVisibilityUtil {

    /**
     * * 显示或隐藏StatusBar
     *
     * @param enable false 显示，true 隐藏
     */
    public static void hideStatusBar(Window window, boolean enable) {
        WindowManager.LayoutParams p = window.getAttributes();
        if (enable)
        //|=：或等于，取其一
        {
            p.flags |= WindowManager.LayoutParams.FLAG_FULLSCREEN;
        } else
        //&=：与等于，取其二同时满足，     ~ ： 取反
        {
            p.flags &= (~WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        window.setAttributes(p);
        window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    }
}
