package com.sunnypoint.core.dagger.module;
/**
 * Created by NhanCao on 19-Sep-15.
 */

import android.app.Activity;
import android.view.LayoutInflater;

import com.sunnypoint.core.dagger.SPMCIPerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * A module to wrap the Activity state and expose it to the graph.
 */
@Module
public class SPMCModuleActivity {
    private final Activity activity;

    public SPMCModuleActivity(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @SPMCIPerActivity
    Activity provideActivity() {
        return activity;
    }

    @Provides
    @SPMCIPerActivity
    public LayoutInflater provideLayoutInflater() {
        return activity.getLayoutInflater();
    }
}