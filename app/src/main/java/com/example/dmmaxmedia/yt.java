package com.example.dmmaxmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class yt extends AppCompatActivity {

    private WebView ytView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_yt);

        ytView = (WebView)   findViewById(R.id.yt_wv) ;
        WebSettings webSettings = ytView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        ytView.setWebViewClient(new WebViewClient());
        ytView.loadUrl("https://www.youtube.com/channel/UCD8RKLNBcps8hC7qaU1XSFg");





    }
}