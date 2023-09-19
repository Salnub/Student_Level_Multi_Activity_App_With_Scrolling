package com.salatech.scrolling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        WebView webData = findViewById(R.id.webp);
        WebSettings webset = webData.getSettings();
        webData.loadUrl("file:///android_asset/github.html");
        webset.setUseWideViewPort(false);

        Bundle extra = getIntent().getExtras();
        String url = extra.getString("HtmlPage");
        webData.loadUrl(url);
    }
}