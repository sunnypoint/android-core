package com.sunnypoint.core.compat;
/**
 * Created by NhanCao on 19-Sep-15.
 */

import android.os.StrictMode;

/**
 * Implementation that supports the Strict Mode functionality
 * available for the first platform release that supported Strict Mode.
 */
public class SPMCStrictModeLegacy implements SPMCIStrictMode {

    public void enableStrictMode() {
        StrictMode.setThreadPolicy(
                new StrictMode.ThreadPolicy.Builder()
                        .detectDiskReads()
                        .detectDiskWrites()
                        .detectNetwork()
                        .penaltyLog()
                        .build()
        );
    }
}
