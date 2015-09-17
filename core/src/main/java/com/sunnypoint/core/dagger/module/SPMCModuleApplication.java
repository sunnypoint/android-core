package com.sunnypoint.core.dagger.module;
/**
 * Created by NhanCao on 13-Sep-15.
 */

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SPMCModuleApplication {
    private Application application;

    public SPMCModuleApplication(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return application;
    }
}
