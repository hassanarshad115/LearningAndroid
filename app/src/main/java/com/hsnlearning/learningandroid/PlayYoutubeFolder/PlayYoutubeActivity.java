package com.hsnlearning.learningandroid.PlayYoutubeFolder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.hsnlearning.learningandroid.R;

public class PlayYoutubeActivity extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_youtube);

        //thora sa he kam h
        webView= this.<WebView>findViewById(R.id.plyyoutubeWebview);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
        webView.loadUrl("https://youtu.be/oZ278GgrQUE");
    }
}
