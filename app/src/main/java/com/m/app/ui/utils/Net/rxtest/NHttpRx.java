package com.m.app.ui.utils.Net.rxtest;

import android.util.Log;

import com.m.app.ui.interf.Test.ITest;
import com.squareup.okhttp.ResponseBody;

import java.io.IOException;

import retrofit2.CallAdapter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by datutu on 2016/10/28.
 */

public class NHttpRx {
    //RX配合Retrofit进行获取数据
    public void Rx_Retro_Http() {
        CallAdapter.Factory myfactory = RxJavaCallAdapterFactory.create();
        Retrofit myretrofit = new Retrofit.Builder().baseUrl("www.baidu.com").addCallAdapterFactory(myfactory).build();
        ITest myservice = myretrofit.create(ITest.class);

        myservice.getuses("11231").doOnNext(new Action1<ResponseBody>() {
                                                @Override
                                                public void call(ResponseBody responseBody) {
                                                    //子线程执行
                                                    Log.i("Alex", "doOnnext线程是" + Thread.currentThread().getName() + "线程优先级=" + Thread.currentThread().getPriority() + "  线程id=" + Thread.currentThread().getId());
                                                    //在这里可以做一些预处理的动作，但是不要调用responseBody的方法，因为多数方法都是一次性的
                                                }
                                            }
        ).subscribeOn(Schedulers.io())////这个必须写，否则会报network main thread异常
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<ResponseBody>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(ResponseBody responseBody) {

                    }
                });

    }

    //直接用RxJava中的map进行反馈消息转换  ResponseBody====》String

    public void Rxjava_map_test() {
        CallAdapter.Factory myFactory = RxJavaCallAdapterFactory.create();
        Retrofit myretrofit = new Retrofit.Builder().baseUrl("www.baicu.com").addCallAdapterFactory(myFactory).build();

        ITest myservice = myretrofit.create(ITest.class);
        myservice.getuses("93010").doOnNext(new Action1<ResponseBody>() {
            @Override
            public void call(ResponseBody responseBody) {

            }
        }).flatMap(new Func1<ResponseBody, Observable<?>>() {
            @Override
            public Observable<?> call(ResponseBody responseBody) {
                String json = "";
                try {
                    json = responseBody.string();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Observable<String> oo = Observable.just(json);
                oo.map(new Func1<String, String>() {
                    @Override
                    public String call(String s) {
                        return s + "我的标记";
                    }
                }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<String>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(String s) {

                    }
                });
                return oo;
            }

        }).subscribe();

    }


}
