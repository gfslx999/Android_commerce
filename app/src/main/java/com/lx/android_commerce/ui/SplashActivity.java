package com.lx.android_commerce.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.blankj.utilcode.util.SPUtils;
import com.lx.android_commerce.MyApp;
import com.lx.android_commerce.R;
import com.lx.lib_core.weight.utils.LogUtil;

import java.util.Timer;
import java.util.TimerTask;

@SuppressLint("HandlerLeak")
public class SplashActivity extends AppCompatActivity {

    private Timer timer;
    private int index;
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            if(msg.what == 101) {
                index++;
                if(index == 3) {
                    startActivity(new Intent(SplashActivity.this,MainActivity.class));
                    timer.cancel();
                    finish();
                }
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //定时清空数据库中的数据,让其每隔1小时刷新一次
        long lastTimeToEnter = SPUtils.getInstance("DarkSp").getLong("lastTimeToEnter");
        long nowTime = System.currentTimeMillis();

        if(lastTimeToEnter < 0) {
            SPUtils.getInstance("DarkSp").put("lastTimeToEnter",nowTime);
        } else {
            if((nowTime / 1000) - (lastTimeToEnter / 1000) > 10000) {
                MyApp.getInstance().getDaoSession().getGreenCacheDao().deleteAll();
                LogUtil.getInstance().LogI("清空了数据库");
            }
        }

        if(timer != null) timer.cancel();

        timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(101);
            }
        },0,1000);

    }
}