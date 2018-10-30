package com.happysanz.happyapp.activity;

import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.happysanz.happyapp.R;

public class MainActivity extends AppCompatActivity {

    private ImageView ONE, TWO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ONE = (ImageView) findViewById(R.id.one);
        TWO = (ImageView) findViewById(R.id.two);
        ValueAnimator animator = ValueAnimator.ofFloat(0f, 1f);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                TWO.setAlpha((Float) animation.getAnimatedValue());
            }
        });

        animator.setDuration(1500);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.setRepeatCount(-1);
        animator.start();
    }
}
