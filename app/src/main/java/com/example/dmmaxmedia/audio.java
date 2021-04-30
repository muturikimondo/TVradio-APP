package com.example.dmmaxmedia;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
//import com.google.android.exoplayer2.audio.AudioAttributes;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.IOException;

public class audio extends AppCompatActivity {
    SimpleExoPlayer simpleExoPlayer;
    PlayerView playerView;


    //@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_audio);
        initplayer();



}
public void initplayer()
{
    playerView = findViewById(R.id.video_view);
    playerView.setControllerShowTimeoutMs(0);
    playerView.setCameraDistance(30);
    SimpleExoPlayer simpleExoPlayer = new SimpleExoPlayer.Builder(this).build();
    playerView.setPlayer(simpleExoPlayer);
    DataSource.Factory dataSourcefactory = new DefaultDataSourceFactory(this, Util.getUserAgent(this, "app"));
    MediaSource audiosource = new ProgressiveMediaSource.Factory(dataSourcefactory).createMediaSource(Uri.parse("https://s4.radio.co/sb70496db1/listen"));
    simpleExoPlayer.prepare(audiosource);
    simpleExoPlayer.setPlayWhenReady(true);
}

}