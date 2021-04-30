package com.example.dmmaxmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class fb extends AppCompatActivity {

    private WebView fbview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_fb);

        fbview = (WebView)   findViewById(R.id.fb) ;
        WebSettings webSettings = fbview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        fbview.setWebViewClient(new WebViewClient());
        fbview.loadUrl("https://www.facebook.com/diasporamediamax");





    }
}