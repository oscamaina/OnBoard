package com.oscamaina.introscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
//    private TextView tv;
//    private ImageView iv;

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

//        TimerTask task = new TimerTask() {
////            @Override
////            public void run() {
////
////            }
////        };
////        Timer splash = new Timer();
////        splash.schedule(task, 10000);

//        tv = (TextView) findViewById(R.id.tv);
//        iv = (ImageView) findViewById(R.id.iv);
//        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition);
//        tv.setAnimation(myanim);
//        iv.setAnimation(myanim);

            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, IntroActivity.class));

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

}