package com.m.app.ui.fragment.fmain;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.m.app.R;
import com.m.app.ui.activity.Test.AFragmentNavigator;
import com.m.app.ui.activity.Test.ANavigationView;
import com.m.app.ui.activity.Test.ASwipeToLayout;
import com.m.app.ui.activity.Test.ATestRetorofit;
import com.m.app.ui.activity.Test.ATestRxJava;
import com.m.app.ui.fragment.FLazy;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.Subscriber;

/**
 * Created by datutu on 16/10/20.
 */

public class FFrist extends FLazy {

    @BindView(R.id.fragment_frist_rxjava_bt)
    Button fragmentFristRxjavaBt;
    @BindView(R.id.fragment_frist_bt)
    Button fragmentFristBt;
    @BindView(R.id.fragment_frist_rxjava_net_bt)
    Button fragmentFristRxjavaNetBt;
    @BindView(R.id.fragment_frist_qiehuan_net_bt)
    Button fragmentFristQiehuanNetBt;
    @BindView(R.id.fragment_frist_fragmentnavigator_bt)
    Button fragmentFristFragmentnavigatorBt;


//被观察者********************

    Observable.OnSubscribe mySubscribe = new Observable.OnSubscribe<String>() {

        @Override
        public void call(Subscriber<? super String> subscriber) {
            subscriber.onNext("test");
            subscriber.onCompleted();
        }
    };
    Observable observable = Observable.create(mySubscribe);
    //观察者********************此处用Observer的抽象实现类处理Ò
    Subscriber<String> mysubscriber = new Subscriber<String>() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(String s) {

        }
    };
    @BindView(R.id.fragment_frist_navigationview_bt)
    Button fragmentFristNavigationviewBt;

    @Override
    protected void create(Bundle Mybundle) {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_main_frist;
    }

    @Override
    protected void initViewsAndEvents(View view) {
        fragmentFristBt.setText("lambdallll测试ee");
        fragmentFristBt.setOnClickListener(v -> Toast.makeText(getActivity(), "测试", Toast.LENGTH_LONG).show());
//        fragmentFristBt.setOnClickListener(vvv-> Log.i("s","sss"));

    }

    private void TestLambda() {
        Toast.makeText(getActivity(), "我的第一个lambda", Toast.LENGTH_LONG).show();
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


    @OnClick({R.id.fragment_frist_navigationview_bt,R.id.fragment_frist_rxjava_bt, R.id.fragment_frist_rxjava_net_bt, R.id.fragment_frist_qiehuan_net_bt, R.id.fragment_frist_fragmentnavigator_bt})
    public void onClick(View V) {
        switch (V.getId()) {
            case R.id.fragment_frist_rxjava_bt:
                FBaseActivity.startActivity(new Intent(FBaseActivity, ATestRxJava.class));
                break;
            case R.id.fragment_frist_rxjava_net_bt://获取网络数据
                FBaseActivity.startActivity(new Intent(FBaseActivity, ATestRetorofit.class));
                break;
            case R.id.fragment_frist_qiehuan_net_bt://swipetolayout
                FBaseActivity.startActivity(new Intent(FBaseActivity, ASwipeToLayout.class));
                break;
            case R.id.fragment_frist_fragmentnavigator_bt://FragmentNavigator测试
                FBaseActivity.startActivity(new Intent(FBaseActivity, AFragmentNavigator.class));
                break;
            case R.id.fragment_frist_navigationview_bt://侧滑navigationview
                FBaseActivity.startActivity(new Intent(FBaseActivity, ANavigationView.class));
                break;
        }
    }



}
