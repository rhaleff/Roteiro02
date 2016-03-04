package com.example.rhaleff.roteiro02;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity implements Runnable{

    private static final int DELEY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(this,DELEY);

        ImageView mImagem = (ImageView) findViewById(R.id.imagem);
        ObjectAnimator anima = ObjectAnimator.ofFloat(mImagem,"rotation",1080f,0f);
        anima.setDuration(3000);
        anima.start();
    }

    @Override
    public void run() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}