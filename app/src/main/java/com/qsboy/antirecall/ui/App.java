/*
 * Copyright © 2016 - 2018 by GitHub.com/JasonQS
 * anti-recall.qsboy.com
 * All Rights Reserved
 */

package com.qsboy.antirecall.ui;

import android.app.Application;
import android.content.Context;


public class App extends Application {

    public static final int LaunchDelayTime = 1000;

    public static final int THEME_RED = 1;
    public static final int THEME_GREEN = 2;
    public static final int THEME_BLUE = 3;

    public static boolean isTypeText = false;

    public static boolean isShowAllQQMessages = true;
    public static boolean isWeChatAutoLogin = true;
    public static boolean isSwipeRemoveOn = true;
    public static boolean isCheckUpdateOnlyOnWiFi = false;

    public static long timeClickedCheckPermissionButton = 0;

    public static int layoutHeight = -1;
    public static int deviceHeight;
    public static int recyclerViewAllHeight;
    public static int recyclerViewRecalledHeight;
    public static float adjusterY;
    public static float adjusterOriginalY;

    public static int dip2px(Context context, float dipValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale);
    }

}
