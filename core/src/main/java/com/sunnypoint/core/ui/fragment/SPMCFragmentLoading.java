package com.sunnypoint.core.ui.fragment;
/**
 * Created by NhanCao on 13-Sep-15.
 */

import android.view.View;

import com.sunnypoint.core.ui.view.SPMCViewSwitcher;

public class SPMCFragmentLoading extends SPMCFragmentBase {

    private SPMCViewSwitcher loadingViewSwitcher;

    protected void setupLoading(View mainView, View loadingView) {
        loadingViewSwitcher = new SPMCViewSwitcher();
        loadingViewSwitcher.setMainView(mainView);
        loadingViewSwitcher.setAlterView(loadingView);
    }

    public void setShowLoading(boolean show) {
        loadingViewSwitcher.showMainView(!show);
    }

}
