package com.m.app.ui.activity.Test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.m.app.R;
import com.m.app.ui.activity.ABase;
import com.m.app.ui.adapter.ContentAdapter;
import com.m.app.ui.module.test.ContentModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by datutu on 2016/11/24.
 */

public class ADrawerLayout extends ABase {

    private DrawerLayout drawerLayout;
    private RelativeLayout leftLayout;
    private RelativeLayout rightLayout;
    private List<ContentModel> list;
    private ContentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawerlayout);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);
        leftLayout=(RelativeLayout) findViewById(R.id.left);
        rightLayout=(RelativeLayout) findViewById(R.id.right);
        ListView listView=(ListView) leftLayout.findViewById(R.id.left_listview);

        initData();
        adapter=new ContentAdapter(this, list);
        listView.setAdapter(adapter);
    }

    private void initData() {
        list=new ArrayList<ContentModel>();

        list.add(new ContentModel(R.drawable.doctoradvice2, "新闻"));
        list.add(new ContentModel(R.drawable.infusion_selected, "订阅"));
        list.add(new ContentModel(R.drawable.mypatient_selected, "图片"));
        list.add(new ContentModel(R.drawable.mywork_selected, "视频"));
        list.add(new ContentModel(R.drawable.nursingcareplan2, "跟帖"));
        list.add(new ContentModel(R.drawable.personal_selected, "投票"));
    }






}
