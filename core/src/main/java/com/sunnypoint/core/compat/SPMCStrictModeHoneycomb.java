package com.sunnypoint.core.compat;
/**
 * Created by NhanCao on 19-Sep-15.
 */

import android.os.StrictMode;

/**
 * Implementation that supports the Strict Mode functionality
 * available Honeycomb.
 */
public class SPMCStrictModeHoneycomb implements SPMCIStrictMode {
    protected static String TAG = "HoneycombStrictMode";

    public void enableStrictMode() {
        StrictMode.setThreadPolicy(
                new StrictMode.ThreadPolicy.Builder()
                        .detectDiskReads()
                        .detectDiskWrites()
                        .detectNetwork()
                        .penaltyLog()
                        .penaltyFlashScreen()
                        .build()
        );
    }
}
