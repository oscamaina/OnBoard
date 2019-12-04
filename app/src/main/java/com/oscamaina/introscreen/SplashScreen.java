package com.oscamaina.introscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {
    private TextView tv;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {

            }
        };
        Timer splash = new Timer();
        splash.schedule(task, 10000);

//        tv = (TextView) findViewById(R.id.tv);
//        iv = (ImageView) findViewById(R.id.iv);
//        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition);
//        tv.setAnimation(myanim);
//        iv.setAnimation(myanim);

        startActivity(new Intent(this, IntroActivity.class));
    }
}
