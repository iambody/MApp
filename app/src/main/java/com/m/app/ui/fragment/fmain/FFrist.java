package com.m.app.ui.fragment.fmain;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.m.app.R;
import com.m.app.ui.fragment.FLazy;

import java.util.Observable;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Subscriber;

/**
 * Created by datutu on 16/10/20.
 */

public class FFrist extends FLazy {


    @BindView(R.id.fragment_frist_bt)
    Button fragmentFristBt;
//被观察者********************

    rx.Observable.OnSubscribe mySubscribe = new rx.Observable.OnSubscribe<String>() {

        @Override
        public void call(Subscriber<? super String> subscriber) {
            subscriber.onNext("test");
            subscriber.onCompleted();
        }
    };
    rx.Observable observable = rx.Observable.create(mySubscribe);
    //观察者********************此处用Observer的抽象实现类处理Ò
    rx.Subscriber<String> mysubscriber = new rx.Subscriber<String>() {
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);

        ButterKnife.bind(this, rootView);
        return rootView;
    }
}
