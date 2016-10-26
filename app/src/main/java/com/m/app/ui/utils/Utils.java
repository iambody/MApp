package com.m.app.ui.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.Toast;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by datutu on 2016/10/26.
 */

public class Utils {
    //通过RxJava 在新线程中设置图片
    public static void SetIv(Context PContext, ImageView VV, int Resource) {
        Observable.create(new Observable.OnSubscribe<Drawable>() {
            @Override
            public void call(Subscriber<? super Drawable> subscriber) {
                subscriber.onNext(PContext.getResources().getDrawable(Resource));
                subscriber.onCompleted();

            }
        }).subscribe(new Subscriber<Drawable>() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                UiHelper.ShowToast(PContext, e.toString());
            }

            @Override
            public void onNext(Drawable drawable) {
                VV.setImageDrawable(drawable);
            }
        });

    }
}
