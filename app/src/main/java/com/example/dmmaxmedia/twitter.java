package com.example.dmmaxmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class twitter extends AppCompatActivity {

    private WebView twitter_wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_twitter);

        twitter_wv = (WebView)   findViewById(R.id.t_wv) ;
        WebSettings webSettings = twitter_wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        twitter_wv.setWebViewClient(new WebViewClient());
        twitter_wv.loadUrl("https://twitter.com/DiasporaMax");





    }
}