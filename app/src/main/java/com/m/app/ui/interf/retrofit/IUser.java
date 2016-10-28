package com.m.app.ui.interf.retrofit;

import com.m.app.ui.module.test.BUser;
import com.squareup.okhttp.ResponseBody;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

/**
 * Created by datutu on 2016/10/28.
 */

public interface IUser {
    @POST("login")
    @FormUrlEncoded
        //读参进行urlencoded
    retrofit2.Call<BUser> login(@Field("userid") String userid, @Field("userage") String userage);


    //post请求 @FormUrlEncoded,@FieldMap使用
    @POST("login1")
    @FormUrlEncoded
    Call<BUser> Login(@FieldMap HashMap<String, String> ParamsMap);


    //post请求 @Multipart,@Part使用
    @Multipart
    @POST("login2")
    Call<BUser> Login2(@Part("userid") String userid, @Part("userage") String userage);


    //*********************************************
    //接口示例     http://www.mydomin.com:8088/android/home/timeline?v=2.5.7&client=1&cityId=2&userId=6092&max=10&minId=0
    @GET("/android/home/timeline?")
    //设置是get请求还是post请求
    Call<ResponseBody> BUsett (@Query("v") String v, @Query("client") String client, @Query("userId") String userId, @Query("minId") String minId, @Query("max") String max);


}
