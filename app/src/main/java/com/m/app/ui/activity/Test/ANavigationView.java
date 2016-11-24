package com.m.app.ui.activity.Test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.m.app.R;
import com.m.app.ui.activity.ABase;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by datutu on 2016/11/23.
 */

public class ANavigationView extends ABase {
    @BindView(R.id.drawerlayout)
    Button drawerlayout;
    @BindView(R.id.toolbar)
    Button toolbar;
    @BindView(R.id.drawerlayout_navigationview)
    Button drawerlayoutNavigationview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_navigationview);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.drawerlayout, R.id.toolbar, R.id.drawerlayout_navigationview})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.drawerlayout:
                startActivity(new Intent(ANavigationView.this, ADrawerLayout.class));
                break;
            case R.id.toolbar:
                startActivity(new Intent(ANavigationView.this, AToolBar.class));
                break;
            case R.id.drawerlayout_navigationview:

                break;

        }

    }


}
