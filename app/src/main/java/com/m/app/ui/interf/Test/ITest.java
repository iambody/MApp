package com.m.app.ui.interf.Test;

import com.m.app.ui.module.test.BUser;
import com.squareup.okhttp.ResponseBody;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by datutu on 2016/10/28.
 */

public interface ITest {
    @GET("get/get/use")
    Observable<ResponseBody>getuses(@Query("userid") String userid);

}
