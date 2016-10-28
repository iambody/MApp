package com.m.app.ui.utils.Net.test;

import com.m.app.R;
import com.m.app.ui.interf.retrofit.IUser;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;

import java.io.IOException;

import retrofit2.Retrofit;

/**
 * Created by datutu on 2016/10/28.
 */

public class Nhttptest {

    //Retrofit请求流程
    public void NTestRetrofit() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("www.baidu.com").build();


        IUser iUserService = retrofit.create(IUser.class);
        retrofit2.Call<ResponseBody> call = iUserService.BUsett("2.4", "3", "33", "3", "e");
        call.enqueue(new retrofit2.Callback<ResponseBody>() {
            @Override
            public void onResponse(retrofit2.Call<ResponseBody> call, retrofit2.Response<ResponseBody> response) {
               String Respon= response.body().toString();
            }

            @Override
            public void onFailure(retrofit2.Call<ResponseBody> call, Throwable t) {

            }
        });

    }


    //OKHttp的请求流程
    public void NTestOkHttp() {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request.Builder reBuilder = new Request.Builder().url("www.baidu.com");
        reBuilder.method("GET", null);

        Request request = reBuilder.build();

        Call mcalll = okHttpClient.newCall(request);
        mcalll.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {

            }

            @Override
            public void onResponse(Response response) throws IOException {

            }
        });


    }
}
