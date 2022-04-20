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

public class FirstWeb extends AppCompatActivity {
    private WebView mywebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_web);
        getSupportActionBar().hide();
        mywebView=(WebView) findViewById(R.id.webView);
        mywebView.setWebViewClient(new WebViewClient());
        mywebView.loadUrl("https://kelaptop.com/en/lenovo-yoga-creator-7i-82ds0026sp");
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