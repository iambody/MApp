package com.m.app.ui.fragment.fmain;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.m.app.R;
import com.m.app.ui.fragment.FLazy;
import com.m.app.ui.utils.Net.rxtest.NHttpRx;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by datutu on 16/10/20.
 */

public class FSecond extends FLazy {
    @BindView(R.id.fsecond_phone)
    EditText fsecondPhone;
    @BindView(R.id.fsecond_psd)
    EditText fsecondPsd;

    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.fsecond_psd_login)
    Button fsecondPsdLogin;

    @Override
    protected void create(Bundle Mybundle) {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_main_second;
    }

    @Override
    protected void initViewsAndEvents(View view) {
        ButterKnife.bind(this, FBaseView);
        Log.i("netstr","开始请求");
        NHttpRx.OkNet();
    }

    @Override
    protected void onFirstUserVisible() {

    }

    @Override
    protected void onUserVisible() {

    }

    @Override
    protected void onUserInvisible() {

    }

    @Override
    protected void DetoryViewAndThing() {
    }



    @OnClick(R.id.fsecond_psd_login)
    public void onClick(View VV) {
        switch (VV.getId()){
            case R.id.fsecond_psd_login:
                Toast.makeText(FBaseActivity,"点击",Toast.LENGTH_LONG).show();
                break;

        }
    }
}
