package com.m.app.ui.fragment.fmain;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.m.app.R;
import com.m.app.ui.activity.Test.ABottomNavigationBar;
import com.m.app.ui.activity.Test.AFileManger;
import com.m.app.ui.activity.Test.AFragmentNavigator;
import com.m.app.ui.activity.Test.AGlide;
import com.m.app.ui.activity.Test.ANavigationView;
import com.m.app.ui.activity.Test.ARealm;
import com.m.app.ui.activity.Test.ASwipeToLayout;
import com.m.app.ui.activity.Test.ATestRetorofit;
import com.m.app.ui.activity.Test.ATestRxJava;
import com.m.app.ui.fragment.FLazy;
import com.m.app.ui.utils.DownFileUtils;

import java.io.File;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.Subscriber;

/**
 * Created by datutu on 16/10/20.
 */

public class FFrist extends FLazy {

    @BindView(R.id.fragment_frist_rxjava_bt)
    Button fragmentFristRxjavaBt;
    @BindView(R.id.fragment_frist_bt)
    Button fragmentFristBt;
    @BindView(R.id.fragment_frist_rxjava_net_bt)
    Button fragmentFristRxjavaNetBt;
    @BindView(R.id.fragment_frist_qiehuan_net_bt)
    Button fragmentFristQiehuanNetBt;
    @BindView(R.id.fragment_frist_fragmentnavigator_bt)
    Button fragmentFristFragmentnavigatorBt;

    @BindView(R.id.fragment_frist_navigationview_bt)
    Button fragmentFristNavigationviewBt;
    @BindView(R.id.fragment_frist_glide_bt)
    Button fragmentFristGlideBt;
    @BindView(R.id.fragment_frist_realm_bt)
    Button fragmentFristRealmBt;
    @BindView(R.id.fragment_frist_bottomnavigationbar_bt)
    Button fragmentFristBottomnavigationbarBt;


//被观察者********************

    Observable.OnSubscribe mySubscribe = new Observable.OnSubscribe<String>() {

        @Override
        public void call(Subscriber<? super String> subscriber) {
            subscriber.onNext("test");
            subscriber.onCompleted();
        }
    };
    Observable observable = Observable.create(mySubscribe);
    //观察者********************此处用Observer的抽象实现类处理Ò
    Subscriber<String> mysubscriber = new Subscriber<String>() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(String s) {

        }
    };
    @BindView(R.id.fragment_frist_blockcanary_bt)
    Button fragmentFristBlockcanaryBt;
    @BindView(R.id.fragment_frist_floatingactionbutton_bt)
    Button fragmentFristFloatingactionbuttonBt;
    @BindView(R.id.fragment_frist_muiltshare_bt)
    Button fragmentFristMuiltshareBt;
    @BindView(R.id.fragment_frist_filemanger_bt)
    Button fragmentFristFilemangerBt;
    @BindView(R.id.fragment_frist_download_bt)
    Button fragmentFristDownloadBt;

    @Override
    protected void create(Bundle Mybundle) {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_main_frist;
    }

    @Override
    protected void initViewsAndEvents(View view) {
        fragmentFristBt.setText("lambdallll测试ee");
        fragmentFristBt.setOnClickListener(v -> Toast.makeText(getActivity(), "测试", Toast.LENGTH_LONG).show());
//        fragmentFristBt.setOnClickListener(vvv-> Log.i("s","sss"));

    }

    private void TestLambda() {
        Toast.makeText(getActivity(), "我的第一个lambda", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onFirstUserVisible() {

    }

    @Override
    protected void onUserVisible() {

    }

    @Override
    protected void onUserInvisible() {

    }

    @Override
    protected void DetoryViewAndThing() {

    }


    @OnClick({R.id.fragment_frist_download_bt, R.id.fragment_frist_filemanger_bt, R.id.fragment_frist_muiltshare_bt, R.id.fragment_frist_bottomnavigationbar_bt, R.id.fragment_frist_realm_bt, R.id.fragment_frist_glide_bt, R.id.fragment_frist_navigationview_bt, R.id.fragment_frist_rxjava_bt, R.id.fragment_frist_rxjava_net_bt, R.id.fragment_frist_qiehuan_net_bt, R.id.fragment_frist_fragmentnavigator_bt})
    public void onClick(View V) {
        switch (V.getId()) {
            case R.id.fragment_frist_rxjava_bt:
                FBaseActivity.startActivity(new Intent(FBaseActivity, ATestRxJava.class));
                break;
            case R.id.fragment_frist_rxjava_net_bt://获取网络数据
                FBaseActivity.startActivity(new Intent(FBaseActivity, ATestRetorofit.class));
                break;
            case R.id.fragment_frist_qiehuan_net_bt://swipetolayout
                FBaseActivity.startActivity(new Intent(FBaseActivity, ASwipeToLayout.class));
                break;
            case R.id.fragment_frist_fragmentnavigator_bt://FragmentNavigator测试
                FBaseActivity.startActivity(new Intent(FBaseActivity, AFragmentNavigator.class));
                break;
            case R.id.fragment_frist_navigationview_bt://侧滑navigationview
                FBaseActivity.startActivity(new Intent(FBaseActivity, ANavigationView.class));
                break;
            case R.id.fragment_frist_glide_bt://Glide 图片框架
                FBaseActivity.startActivity(new Intent(FBaseActivity, AGlide.class));
                break;
            case R.id.fragment_frist_realm_bt:
                FBaseActivity.startActivity(new Intent(FBaseActivity, ARealm.class));
                break;
            case R.id.fragment_frist_bottomnavigationbar_bt://MD设计
                FBaseActivity.startActivity(new Intent(FBaseActivity, ABottomNavigationBar.class));
                break;
            case R.id.fragment_frist_muiltshare_bt://多图分享
                File sdCard = Environment.getExternalStorageDirectory();
//                File directory_pictures = new File(sdCard, "aaccccc/s");

                File directory_pictures = new File(sdCard + "/aaaadownload/");
                if (!directory_pictures.exists())
                    directory_pictures.mkdirs();

                Log.i("filetest", "directory_pictures=" + directory_pictures);
                sharemuil(directory_pictures);
                break;
            case R.id.fragment_frist_filemanger_bt://文件夹管理
                FBaseActivity.startActivity(new Intent(FBaseActivity, AFileManger.class));
                break;
            case R.id.fragment_frist_download_bt://下载图片到文件夹
                DownFileUtils dd = new DownFileUtils();
                File sdCards = Environment.getExternalStorageDirectory();
//                File directory_picturess = new File(sdCards, "abb/");
//                final File filepath = new File(savePath + File.separator + "MyDownLoadText" + File.separator + downLoadUrl);//仅创建路径的File对象
//                File aas = new File(sdCards+ "/aaaadownload/");
//                if(aas.exists()){
//                    aas.delete();
//                }
                File test = new File(sdCards+"/aaaadownload"  );
                if(test.exists()){
                    RecursionDeleteFile(test);
                }
                File aaaa = new File(sdCards, "/aaaadownload/" + "photo3.jpg");


//                Log.i("filetest", "下载传入的file路径=" + aaaa.getPath());
//                Log.i("filetest", checkIsImageFile("http://fs.v-town.cc/photo_ZLul9y5C1CbVfxSlQ83TNY2fMu7RjdIN.jpg")?"是图片":"不是图片"  );
                dd.xUtilsHttpUtilDonLoadFile("http://fs.v-town.cc/photo_R7JdzAnzcTEYckK9LlHAIkK477awAHnq",aaaa.getPath(),aaaa,"122");
                break;
        }
    }

    private void sharemuil(File... files) {
        Intent intent = new Intent();
        ComponentName comp = new ComponentName("com.tencent.mm",
                "com.tencent.mm.ui.tools.ShareToTimeLineUI");
        intent.setComponent(comp);
        intent.setAction(Intent.ACTION_SEND_MULTIPLE);
        intent.setType("image/*");

        ArrayList<Uri> imageUris = new ArrayList<Uri>();

        for (File f : files) {
            File[] filels = f.listFiles();
            for (int i = 0; i < filels.length; i++) {
                File file = filels[i];
                if (checkIsImageFile(file.getPath())) {
                    imageUris.add(Uri.fromFile(file));
                }
            }

        }
        intent.putParcelableArrayListExtra(Intent.EXTRA_STREAM, imageUris);
        intent.putExtra("Kdescription", "微糖商城");
        startActivity(intent);
    }

    /**
     * 检查扩展名，得到图片格式的文件
     *
     * @param fName 文件名
     * @return
     */

    private boolean checkIsImageFile(String fName) {
        boolean isImageFile = false;
        // 获取扩展名
        String FileEnd = fName.substring(fName.lastIndexOf(".") + 1,
                fName.length()).toLowerCase();
        if (FileEnd.equals("jpg") || FileEnd.equals("png") || FileEnd.equals("gif")
                || FileEnd.equals("jpeg") || FileEnd.equals("bmp")) {
            isImageFile = true;
        } else {
            isImageFile = false;
        }
        return isImageFile;
    }


    public void RecursionDeleteFile(File file){
        if(file.isFile()){
            file.delete();
            return;
        }
        if(file.isDirectory()){
            File[] childFile = file.listFiles();
            if(childFile == null || childFile.length == 0){
                file.delete();
                return;
            }
            for(File f : childFile){
                RecursionDeleteFile(f);
            }
            file.delete();
        }
    }

}
