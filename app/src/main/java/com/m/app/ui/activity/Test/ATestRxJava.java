package com.m.app.ui.activity.Test;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.m.app.R;
import com.m.app.ui.activity.ABase;
import com.m.app.ui.module.test.BCourse;
import com.m.app.ui.module.test.BStudent;
import com.m.app.ui.utils.Utils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Func1;

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
    //**************打印学生Bean的名字*************************************************************

    BStudent[] students = {new BStudent("网=网页"), new BStudent("小米"), new BStudent("立刻")};


    //*******************************************************************************
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
        Utils.SetIv(this, testrxjavaTestIv, R.mipmap.test1);
        //测试循环开始打印**********************************************************************************
//        Observable.from(students).map(new Func1<BStudent, String>() {
//            @Override
//            public String call(BStudent bStudent) {
//                return bStudent.getName();
//            }
//        }).subscribe(new Subscriber<String>() {
//            @Override
//            public void onCompleted() {
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onNext(String r) {
//                Log.i("teststaudentrxjava", r + "/n");
//            }
//        });
        //测试FlatMap开始循环**************************************************
        List<BCourse> c1 = new ArrayList<>();
        c1.add(new BCourse("第一个语文"));
        c1.add(new BCourse("第一个英语"));
        List<BCourse> c2 = new ArrayList<>();
        c2.add(new BCourse("第二个数学"));
        c2.add(new BCourse("第二个物理"));


        BStudent[] studens = {new BStudent("第一个", c1), new BStudent("第二个", c2)};

        Observable.from(studens).flatMap(new Func1<BStudent, Observable<BCourse>>() {
            @Override
            public Observable<BCourse> call(BStudent bStudents) {
                return Observable.from(bStudents.getMyCourse());
            }
        }).subscribe(new Subscriber<BCourse>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(BCourse r) {
                Log.i("flatmap测试", r.getCourseName());
            }
        });
    }

    @OnClick(R.id.testrxjava_test_button)
    public void onClick(View VV) {
        switch (VV.getId()) {
            case R.id.testrxjava_test_button:
                break;
        }
    }
}
