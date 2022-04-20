package com.app.lenovolaptops;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ThirdLaptop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_laptop);

        //set support bar's title to the name of the clicked laptop
        getSupportActionBar().setTitle("ThinkBook 13x (13, Intel)");
    }

    //handle user click and redirect them to the details on a particular laptop
    public void laptop3(View view){
        Intent intent = new Intent(ThirdLaptop.this, ThirdWeb.class);
        startActivity(intent);

    }

    //handles user's click event
    public void searchBtn3(View view){
        openUrl("https://lenovo.com");
    }

    //open user's browser to search for more laptops
    public void openUrl(String url){
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }



}