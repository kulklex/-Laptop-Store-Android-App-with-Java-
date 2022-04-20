package com.app.lenovolaptops;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class FirstLaptop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_laptop);

        //set support bar's title to the name of the clicked laptop
        getSupportActionBar().setTitle("Yoga Creator 7i");

    }

    //handle user click and redirect them to the details on a particular laptop
    public void laptop1(View view){
        Intent intent = new Intent(FirstLaptop.this, FirstWeb.class);
        startActivity(intent);
    }

    //handles user's click event
    public void searchBtn1(View view){
        openUrl("https://lenovo.com");
    }


    //open user's browser to search for more laptops
    public void openUrl(String url){
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }


}