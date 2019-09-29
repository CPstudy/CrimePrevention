package com.kang.crimeprevention;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        WebView webView = findViewById(R.id.webView);

        Intent intent = getIntent();

        String ip = intent.getStringExtra("IP");
        webView.loadUrl("http://" + ip + "/video");
    }
}
