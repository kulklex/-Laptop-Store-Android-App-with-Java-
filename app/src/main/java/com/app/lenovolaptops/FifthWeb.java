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

public class FifthWeb extends AppCompatActivity {
    private WebView mywebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_web);
        getSupportActionBar().hide();

        mywebView = (WebView) findViewById(R.id.webView);
        mywebView.setWebViewClient(new WebViewClient());
        mywebView.loadUrl("https://gadgets360.com/lenovo-ideapad-gaming-3i-price-in-india-103960");
        WebSettings webSettings = mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }


    public class mywebClient extends WebViewClient {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}