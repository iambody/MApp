package com.m.app.ui.interf.retrofit;


import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by datutu on 2016/11/10.
 */

public interface IRetrofitService {
    @GET("/v1/api/api/bank")
    Call<ResponseBody> GetTestStr();


    /**
     * 请求奖励
     *
     * @param user_id
     * @param name
     * @param expand
     * @return
     */

    //    @Path :路径参数
//    @Query?后面的参数，例如：?expand="dddddd"
    @GET("users/{user_id}/activitis/{name}/reward")
    Call<Response> GetReWard(
            @Path("user_id") String user_id,
            @Path("name") String name,
            @Query("expand") String expand
    );
//    @Field:Post传递的参数
//    @FormUrlEncoded：如果POST请求，传递数据，必须要有

    /**
     * 请求post
     */
    @FormUrlEncoded
    @POST("user/{userid}/getls")
    Call<Response> GetLs(
            @Path("userid") String userid,
            @Field("code") String code
    );

}
