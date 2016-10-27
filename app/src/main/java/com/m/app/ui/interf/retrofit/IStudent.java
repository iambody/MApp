package com.m.app.ui.interf.retrofit;

import com.m.app.ui.module.test.BCourse;
import com.squareup.okhttp.Call;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by datutu on 2016/10/27.
 */

public interface IStudent {
    @GET("user2")//不带参数get请求
    retrofit2.Call<List<BCourse>> getUsers();




    @GET("user/{userid}") //带参数的get请求
    retrofit2.Call<BCourse>GetUser(@Path("userid") String userid);




}
