package com.app.lenovolaptops;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class FourthLaptop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_laptop);

        //set support bar's title to the name of the clicked laptop
        getSupportActionBar().setTitle("Legion 7 Gen 6 (16, AMD)");
    }

    //handle user click and redirect them to the details on a particular laptop
    public void laptop4(View view){
        Intent intent = new Intent(FourthLaptop.this, FourthWeb.class);
        startActivity(intent);
    }

    //handles user's click event
    public void searchBtn4(View view){
        openUrl("https://lenovo.com");
    }

    //open user's browser to search for more laptops
    public void openUrl(String url){
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }


}