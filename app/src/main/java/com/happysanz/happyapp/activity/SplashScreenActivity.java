package com.happysanz.happyapp.activity;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import com.happysanz.happyapp.R;

public class SplashScreenActivity extends AppCompatActivity {

    private ImageView ONE, TWO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen_activity);
//        ONE = (ImageView) findViewById(R.id.one);
//        TWO = (ImageView) findViewById(R.id.two);
//        ValueAnimator animator = ValueAnimator.ofFloat(0f, 1f);
//        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                TWO.setAlpha((Float) animation.getAnimatedValue());
//            }
//        });
//
//        animator.setDuration(1500);
////        animator.setRepeatMode(ValueAnimator.REVERSE);
//        animator.setRepeatCount(0);
//        animator.start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 1500);
    }
}
