package com.sunnypoint.core.compat;

/**
 * Created by NhanCao on 13-Sep-15.
 */

public class SPMCPlatformImpSpecificFactory {
    /**
     * Create a new StrictMode instance.
     *
     * @return StrictMode
     */
    public static SPMCIStrictMode getStrictMode() {
        if (SPMCPlatform.SUPPORTS_HONEYCOMB)
            return new SPMCStrictModeHoneycomb();
        else if (SPMCPlatform.SUPPORTS_GINGERBREAD)
            return new SPMCStrictModeLegacy();
        else
            return null;
    }
}
