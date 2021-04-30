package com.example.dmmaxmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class video extends AppCompatActivity {
    private String videoURL = "https://rtmp.prosol.co.ke/live/stream/index.m3u8";
    //private String videoURL = "https://www.dailymotion.com/video/x7ttbvq";
    private ProgressDialog pd;
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_video);


        videoView = findViewById(R.id.videoView);
        pd = new ProgressDialog(this);
        pd.setMessage("Buffering | Please Wait!");
        pd.setCancelable(true);
        playVideo();
    }

    private void playVideo() {
        try {
            getWindow().setFormat(PixelFormat.TRANSLUCENT);
            MediaController mediaController = new MediaController(this);
            mediaController.setAnchorView(videoView);
            Uri videoUri = Uri.parse(videoURL);
            videoView.setMediaController(mediaController);
            videoView.setVideoURI(videoUri);
            videoView.requestFocus();
            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    pd.dismiss();
                    videoView.start();
                }
            });

        } catch (Exception e) {
            pd.dismiss();
            Toast.makeText(this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();

        }

    }
}