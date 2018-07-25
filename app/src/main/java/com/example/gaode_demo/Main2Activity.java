package com.example.gaode_demo;

import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    private Button love;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        love = findViewById(R.id.love);

        ValueAnimator valueAnimator = ValueAnimator.ofInt(love.getLayoutParams().width, 500);
        valueAnimator.setDuration(2000);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int value = (int) valueAnimator.getAnimatedValue();
                love.getLayoutParams().width = value;
                love.requestLayout();
            }
        });
        valueAnimator.setRepeatCount(2);
        valueAnimator.start();

    }
}
