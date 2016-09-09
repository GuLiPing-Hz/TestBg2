package com.example.administrator.testbg;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

//启动页
public class MainActivity extends BaseMyActivity {

    static Handler sHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setSwipeBackEnable(false);
    }

    @Override
    protected void onResume() {
        super.onResume();

        sHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
                finish();
            }
        },1000);
    }

    @Override
    protected boolean toggleOverridePendingTransition() {
        return false;
    }

    @Override
    protected TransitionMode getOverridePendingTransitionMode() {
        return TransitionMode.BOTTOM;
    }
}