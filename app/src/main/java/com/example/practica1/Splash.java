package com.example.practica1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    MediaPlayer intro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();

        intro=MediaPlayer.create(this,R.raw.bosques);
        intro.start();

        TimerTask inicio=new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this,MainActivity.class);
                startActivity(intent);
                intro.stop();
                finish();
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(inicio,8500);

    }
}