package com.app.lenovolaptops;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class FifthLaptop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_laptop);

        //set support bar's title to the name of the clicked laptop
        getSupportActionBar().setTitle("IdeaPad Gaming 3 (15)");
    }

    //handle user click and redirect them to the details on a particular laptop
    public void laptop5(View view){
        Intent intent = new Intent(FifthLaptop.this, FifthWeb.class);
        startActivity(intent);

    }

    //handles user's click event
    public void searchBtn5(View view){
        openUrl("https://lenovo.com");
    }

    //open user's browser to search for more laptops
    public void openUrl(String url){
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }


}

