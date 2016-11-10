package com.m.app.ui.interf.retrofit;



import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by datutu on 2016/11/10.
 */

public interface IRetrofitService {
    @GET("basil2style")
    Call<ResponseBody> GetTestStr();

}
