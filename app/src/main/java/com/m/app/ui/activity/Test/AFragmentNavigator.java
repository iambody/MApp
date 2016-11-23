package com.m.app.ui.activity.Test;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.m.app.R;
import com.m.app.ui.activity.ABase;

/**
 * Created by datutu on 2016/11/23.
 */

public class AFragmentNavigator extends ABase {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmentnavigator);
    }
}
