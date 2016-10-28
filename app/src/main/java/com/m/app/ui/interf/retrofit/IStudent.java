package com.m.app.ui.interf.retrofit;

import com.m.app.ui.module.test.BCourse;
import com.m.app.ui.module.test.BUser;
import com.squareup.okhttp.Call;

import java.util.List;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by datutu on 2016/10/27.
 */

public interface IStudent {
    @GET("user2")
//不带参数get请求
    retrofit2.Call<List<BCourse>> getUsers();


    @GET("user/{userid}")
        //动态路径 @Path使用 //动态路径get请求
    retrofit2.Call<BCourse> GetUser(@Path("userid") String userid);

    //get请求 拼接参数 @Query使用
    @GET("user/{userid}")
    retrofit2.Call<List<BCourse>> Getourse(@Path("userid") String userid, @Query("age") int age);









}
