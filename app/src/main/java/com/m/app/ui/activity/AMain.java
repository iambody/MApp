package com.m.app.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.m.app.R;
import com.m.app.ui.fragment.fmain.FFrist;
import com.m.app.ui.fragment.fmain.FSecond;
import com.m.app.ui.fragment.fmain.FThree;
import com.m.app.ui.view.NoScrollViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by datutu on 16/10/18.
 */

public class AMain extends ABase {
    @BindView(R.id.maintab_pager)
    NoScrollViewPager maintabPager;
    @BindView(R.id.maitab_tablayout)
    TabLayout maitabTablayout;


    private String[] mTitles = new String[]{"首页", "专区", "我的"};
    private Fragment Fragment_Frist, Fragment_Second, Fragment_three;
    private List<Fragment> FragmentLs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        IBase();


    }

    private void IBase() {
        Fragment_Frist = new FFrist();
        Fragment_Second = new FSecond();
        Fragment_three = new FThree();

        FragmentLs.add(Fragment_Frist);
        FragmentLs.add(Fragment_Second);
        FragmentLs.add(Fragment_three);


        maintabPager.setAdapter(new MyViewPage(getSupportFragmentManager()));
        maitabTablayout.setupWithViewPager(maintabPager);
        maitabTablayout.getTabAt(0).setCustomView(getTabView(0));
        maitabTablayout.getTabAt(1).setCustomView(getTabView(1));
        maitabTablayout.getTabAt(2).setCustomView(getTabView(2));


    }


    private class MyViewPage extends FragmentPagerAdapter {


        public MyViewPage(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return FragmentLs.get(position);
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitles[position];
        }
    }

    public View getTabView(int position) {
        View v = LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        TextView tv = (TextView) v.findViewById(R.id.comment_tab_txt);
        tv.setText(mTitles[position]);
        ImageView img = (ImageView) v.findViewById(R.id.comment_tab_iv);
        //img.setImageResource(imageResId[position]);
        return v;
    }
}
