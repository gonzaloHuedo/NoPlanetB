package com.example.noplanetb;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        TextView titulo = (TextView)findViewById(R.id.titulo);
        TextView eslogan = (TextView)findViewById(R.id.slogan);
        ImageView copete = (ImageView)findViewById(R.id.copete);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animacion);

       titulo.startAnimation(animation);
       copete.startAnimation(animation);
       eslogan.startAnimation(animation);
        openApp(true);
    }

    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash
                        .this, Login.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
