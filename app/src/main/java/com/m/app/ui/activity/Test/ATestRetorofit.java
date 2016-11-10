package com.m.app.ui.activity.Test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.TextView;

import com.m.app.R;
import com.m.app.ui.activity.ABase;
import com.m.app.ui.interf.retrofit.IRetrofitService;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by datutu on 2016/11/10.
 */

public class ATestRetorofit extends ABase {
    @BindView(R.id.bt_test_retrofit)
    Button btTestRetrofit;
    @BindView(R.id.txt_test_retrofit)
    TextView txtTestRetrofit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_retrofit);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.bt_test_retrofit)
    public void onClick() {
        //点击按钮开始请求数据
        BeginRetrofitNet();
    }

    //请求网络1
    private void BeginRetrofitNet() {
        Retrofit mRetrofit = new Retrofit.Builder().baseUrl("https://api.github.com/users/").build();
        IRetrofitService mIRetrofitService = mRetrofit.create(IRetrofitService.class);

        Call<ResponseBody> call = mIRetrofitService.GetTestStr();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    String str = null;
                    try {
                        str = response.body().string();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    txtTestRetrofit.setText(str);
                } else {
                    txtTestRetrofit.setText("获取失败");
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });

    }


}
