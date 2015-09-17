package com.sunnypoint.core.ui.view;
/**
 * Created by NhanCao on 19-Sep-15.
 */

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.sunnypoint.core.R;

public class SPMCViewNoNetwork extends RelativeLayout {

    private ImageView ivIcon;

    public SPMCViewNoNetwork(Context context, AttributeSet attrs,
                             int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflate(context, R.layout.view_no_network, this);
    }

    public SPMCViewNoNetwork(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SPMCViewNoNetwork(Context context) {
        this(context, null, 0);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ivIcon = (ImageView) this.findViewById(R.id.ivIcon);
    }

    public ImageView getIconView() {
        return ivIcon;
    }
}
