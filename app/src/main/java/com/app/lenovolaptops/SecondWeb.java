package com.app.lenovolaptops;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * Handle the display of the webview of a particular laptop's details and other informations
 * **/

public class SecondWeb extends AppCompatActivity {
    private WebView mywebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_web);
        getSupportActionBar().hide();

        mywebView=(WebView) findViewById(R.id.webView);
        mywebView.setWebViewClient(new WebViewClient());
        mywebView.loadUrl("https://ausdroid.net/2021/10/22/lenovo-yoga-slim-7i-carbon-13-laptop-review/");
        WebSettings webSettings=mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }


    public class mywebClient extends WebViewClient{
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon){
            super.onPageStarted(view,url,favicon);
        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url){
            view.loadUrl(url);
            return true;
        }
    }

}