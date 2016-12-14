package com.m.app.ui.activity.Test;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.Toast;

import com.m.app.R;
import com.m.app.ui.activity.ABase;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.vov.vitamio.MediaPlayer;
import io.vov.vitamio.widget.MediaController;
import io.vov.vitamio.widget.VideoView;

/**
 * Created by datutu on 2016/12/13.
 */

public class AVitamoPlay extends ABase implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnCompletionListener {
    @BindView(R.id.myvido_play)
    Button myvidoPlay;

    io.vov.vitamio.widget.VideoView vvMain;
    MediaController mediaController;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_vitamo_play);
        ButterKnife.bind(this);
        vvMain= (VideoView) findViewById(R.id.vv_main);
        if (!io.vov.vitamio.LibsChecker.checkVitamioLibs(this)){
            Toast.makeText(this,"初始化失败", Toast.LENGTH_LONG).show();
            return;}
        vvMain.setVideoURI(Uri.parse("http://fs.v-town.cc/10014952_14815225533262163198.mov"));//设置播放地址
        mediaController=new MediaController(this);
        vvMain.setMediaController(mediaController);

        //设置监听
        vvMain.setOnPreparedListener(this);
        vvMain.setOnErrorListener(this);
        vvMain.setOnCompletionListener(this);

    }

    @OnClick(R.id.myvido_play)
    public void onClick() {
//        vvMain.start();//开始播放
    }

    @Override
    public void onCompletion(MediaPlayer mp) {
        Toast.makeText(this,"播放完成", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onError(MediaPlayer mp, int what, int extra) {
        Toast.makeText(this,"Error", Toast.LENGTH_LONG).show();
        return false;
    }

    @Override
    public void onPrepared(MediaPlayer mp) {
        Toast.makeText(this,"准备好了", Toast.LENGTH_LONG).show();
        vvMain.start();
    }

//    @Override
//    public void onCompletion(MediaPlayer mp) {
//        Toast.makeText(this,"播放完成", Toast.LENGTH_LONG).show();
//    }
//
//    @Override
//    public boolean onError(MediaPlayer mp, int what, int extra) {
//        Toast.makeText(this,"Error", Toast.LENGTH_LONG).show();
//        return false;
//    }
//
//    @Override
//    public void onPrepared(MediaPlayer mp) {
//        Toast.makeText(this,"准备好了", Toast.LENGTH_LONG).show();
//
//    }
}
