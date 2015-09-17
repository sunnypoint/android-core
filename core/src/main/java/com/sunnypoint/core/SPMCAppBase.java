package com.sunnypoint.core;

import android.app.Application;

import com.sunnypoint.core.compat.SPMCPlatformImpSpecificFactory;

/**
 * Created by NhanCao on 13-Sep-15.
 */
public abstract class SPMCAppBase extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (isDebug()) {
            // Enable strictMode for development. This will help to keep project in high quality.
            SPMCPlatformImpSpecificFactory.getStrictMode().enableStrictMode();
        } else {
        }
    }

    protected abstract boolean isDebug();
}
