package com.sunnypoint.core.ui.fragment;
/**
 * Created by NhanCao on 13-Sep-15.
 */

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.View;

import com.sunnypoint.core.ui.view.SPMCViewNoNetwork;
import com.sunnypoint.core.ui.view.SPMCViewSwitcher;

public abstract class SPMCFragmentNetwork extends SPMCFragmentLoading {

    private SPMCViewSwitcher noNetworkViewSwitcher;
    private View.OnClickListener retryClickListener;

    protected abstract View getMainView();

    protected abstract SPMCViewNoNetwork getNoNetworkView();

    protected abstract boolean isNetworkRequired();

    @Override
    public void onResume() {
        super.onResume();
        if (isNetworkRequired()) {
            checkNetworkConnection();
        }
    }

    protected void checkNetworkConnection() {
        if (!isNetworkConnected()) {
            if (noNetworkViewSwitcher == null) {
                final View noNetworkView = getNoNetworkView();
                if (noNetworkView == null) {
                    return;
                }
                final View mainView = getMainView();
                noNetworkViewSwitcher = new SPMCViewSwitcher();
                noNetworkViewSwitcher.setAlterView(noNetworkView);
                noNetworkViewSwitcher.setMainView(mainView);
                if (retryClickListener == null) {
                    retryClickListener = new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            checkNetworkConnection();
                        }
                    };
                }
                ((SPMCViewNoNetwork) noNetworkView).getIconView().setOnClickListener
                        (retryClickListener);
            }
            if (noNetworkViewSwitcher != null) {
                noNetworkViewSwitcher.showMainView(false);
            }
        } else {
            if (noNetworkViewSwitcher != null) {
                noNetworkViewSwitcher.showMainView(true);
            }
        }
    }

    protected boolean isNetworkConnected() {
        ConnectivityManager cm =
                (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null &&
                activeNetwork.isConnected();
    }

}
