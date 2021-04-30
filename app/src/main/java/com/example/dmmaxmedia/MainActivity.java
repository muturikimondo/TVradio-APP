package com.example.dmmaxmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imgradio;
    private ImageView imgwebsite;
    private ImageView imagefb;
    private ImageView yt_img;
    private ImageView t_img;
    private ImageView audio_img;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        imgradio = (ImageView)findViewById(R.id.imgListen);
        imgradio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this, video.class);
                startActivity(mainIntent);

            }
        });


        imgwebsite = (ImageView)findViewById(R.id.webSite);
        imgwebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this, website.class);
                startActivity(mainIntent);

            }
        });

        imagefb = (ImageView)findViewById(R.id.img_fb);
        imagefb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this, fb.class);
                startActivity(mainIntent);

            }
        });


        yt_img = (ImageView)findViewById(R.id.yt_img);
        yt_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this, yt.class);
                startActivity(mainIntent);

            }
        });

        t_img = (ImageView)findViewById(R.id.t_image);
        t_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this, twitter.class);
                startActivity(mainIntent);

            }
        });


        audio_img = (ImageView)findViewById(R.id.img_listen);
        audio_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this, audio.class);
                startActivity(mainIntent);

            }
        });
    }
}