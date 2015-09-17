package com.sunnypoint.core.dagger;
/**
 * Created by NhanCao on 13-Sep-15.
 */

import android.app.Activity;

import com.sunnypoint.core.dagger.module.SPMCModuleActivity;

import dagger.Component;

/**
 * A base component upon which fragment's components may depend.  Activity-level components
 * should extend this component.
 */
@SPMCIPerActivity // Subtypes of ActivityComponent should be decorated with @PerActivity.
@Component(modules = SPMCModuleActivity.class)
public interface SPMCIActivityComponent {
    Activity activity(); // Expose the activity to sub-graphs.
}