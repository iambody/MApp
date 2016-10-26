package com.m.app.ui.activity.Test;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.m.app.R;
import com.m.app.ui.activity.ABase;
import com.m.app.ui.utils.Utils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Action1;

/**
 * Created by datutu on 2016/10/26.
 */

public class ATestRxJava extends ABase {
    Activity BaseActivity = this;
    //**************************被观察者*********************************************************
    //1最普通的
    Observable MyObservable = Observable.create(new Observable.OnSubscribe<String>() {
        @Override
        public void call(Subscriber<? super String> subscriber) {
            subscriber.onNext("Action测试开始发送事件");
            subscriber.onCompleted();//结束事件
        }
    });
    //2将传入的参数依次发送出来
    Observable JustObservable = Observable.just("发送依次", "发送一次");

    //3将传入的数组或 Iterable 拆分成具体对象后，依次发送出来
    String[] words = {"Hello", "Hi", "Aloha"};
    Observable LsObservable = Observable.from(words);
    //********************************观察者********************************************************
    //最基本的观察者
    Observer<String> MyObserver = new Observer<String>() {

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
    //基本观察者的内部抽象类
    Subscriber<String> MyAbObserver = new Subscriber<String>() {
        //抽象类中新增加的一个抽象方法
        @Override
        public void onStart() {
            super.onStart();
        }

        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(String s) {
            Toast.makeText(ATestRxJava.this, s, Toast.LENGTH_LONG).show();

        }
    };
    //更加简单的一个回调Action
    Action1<String> myaction1 = new Action1<String>() {
        @Override
        public void call(String s) {
            Toast.makeText(ATestRxJava.this, s, Toast.LENGTH_LONG).show();
        }
    };


    @BindView(R.id.testrxjava_test_button)
    Button testrxjavaTestButton;
    @BindView(R.id.testrxjava_test_iv)
    ImageView testrxjavaTestIv;


    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testrxjava);
        ButterKnife.bind(this);
        BaseActivity = this;
        JustObservable.subscribe(MyAbObserver);
        MyObservable.subscribe(myaction1);
        Utils.SetIv(this,testrxjavaTestIv,R.mipmap.test1);

    }

    @OnClick(R.id.testrxjava_test_button)
    public void onClick(View VV) {
        switch (VV.getId()) {
            case R.id.testrxjava_test_button:
                break;
        }
    }
}
