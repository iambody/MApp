package com.m.app.ui.activity.Test;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.TextView;

import com.m.app.R;
import com.m.app.ui.activity.ABase;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by datutu on 2016/12/9.
 */

public class AValueanimator extends ABase {
    @BindView(R.id.valueanime_bt)
    Button valueanimeBt;
    @BindView(R.id.value_txt)
    TextView valueTxt;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avalueanimator);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.valueanime_bt)
    public void onClick() {
    }

    private void ShowAnimator(int type) {
        switch (type) {
            case 1://一个textview先变透明再还原
                ObjectAnimator animator = ObjectAnimator.ofFloat(valueTxt, "alpha", 1f, 0f, 1f);
                animator.setDuration(5000);
                animator.start();
                break;
            case 2://textview 360度旋转
                ObjectAnimator animator1 = ObjectAnimator.ofFloat(valueTxt, "rotation", 0f, 360f);
                animator1.setDuration(5000);
                animator1.start();
                break;
            case 3://textview先移除屏幕在回来

                float curTranslationX = valueTxt.getTranslationX();
                ObjectAnimator animator2 = ObjectAnimator.ofFloat(valueTxt, "translationX", curTranslationX, -500f, curTranslationX);
                animator2.setDuration(5000);
                animator2.start();
                break;
            case 4://TextView在垂直方向上放大3倍再还原
                ObjectAnimator animator3 = ObjectAnimator.ofFloat(valueTxt, "scaleY", 1f, 3f, 1f);
                animator3.setDuration(5000);
                animator3.start();
                animator3.addListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {

                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                });
                break;
            case 5://我们想要让TextView先从屏幕外移动进屏幕，然后开始旋转360度，旋转的同时进行淡入淡出操作
                ObjectAnimator moveIn = ObjectAnimator.ofFloat(valueTxt, "translationX", -500f, 0f);
                ObjectAnimator rotate = ObjectAnimator.ofFloat(valueTxt, "rotation", 0f, 360f);
                ObjectAnimator fadeInOut = ObjectAnimator.ofFloat(valueTxt, "alpha", 1f, 0f, 1f);
                AnimatorSet animSet = new AnimatorSet();
                animSet.play(rotate).with(fadeInOut).after(moveIn);
                animSet.setDuration(5000);
                animSet.start();
                break;
        }
    }


}
