package com.m.app.ui.activity.Test;

import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.m.app.R;
import com.m.app.ui.activity.ABase;

import java.io.File;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by datutu on 2016/12/1.
 */

public class AFileManger extends ABase {
    private static final String TAG = "filetest";
    @BindView(R.id.test_file)
    Button testFile;
    @BindView(R.id.test_file_msg)
    TextView testFileMsg;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_manger);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.test_file)
    public void onClick() {
        TestFile(1);
    }

    public void TestFile(int type) {
        switch (type) {
            case 1://测试SD卡最外边的路径
                File sdCard = Environment.getExternalStorageDirectory();
                File directory_pictures = new File(sdCard, "aaccccc/s");

                Log.i(TAG, "directory_pictures=" + directory_pictures);
                testFileMsg.setText("===>"+directory_pictures);
                directory_pictures.mkdir();
                break;
            case 2://测试SD卡最外边的路径
                File sdCarssd = Environment.getExternalStorageDirectory();
                File directory_pictsssures = new File(getFileRoot(AFileManger.this));
                Log.i(TAG, "directory_pictures=" + directory_pictsssures);
                File direc = new File(AFileManger.this.getExternalFilesDir("sssssss").getPath());
//                Log.i(TAG, "directory_pictures=" + direc);
//                if (direc.exists()) {
//                    direc.delete();
//                }
                break;
        }
    }

    // 文件存储根目录
    public static String getFileRoot(Context context) {
        if (Environment.getExternalStorageState().equals(
                Environment.MEDIA_MOUNTED)) {
            File external = context.getExternalFilesDir(null);
            if (external != null) {
                return external.getAbsolutePath();
            }
        }

        return context.getFilesDir().getAbsolutePath() + File.separator
                + "aaaaaaa" + File.separator + "saverq";
    }

}
