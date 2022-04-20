package com.app.lenovolaptops;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    int[] pic = {R.drawable.lap1, R.drawable.lap2, R.drawable.lap3, R.drawable.lap4,
            R.drawable.lap5, R.drawable.lap6
    };
    String[] laptopNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        laptopNames = getResources().getStringArray(R.array.laptop);
        gridView = (GridView) findViewById(R.id.gridViewId);


        CustomAdapter adapter = new CustomAdapter(this, laptopNames, pic);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            // controls the click event of various laptop on the home page
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent intent = new Intent(MainActivity.this, FirstLaptop.class);
                    startActivity(intent);
                }
                if (i == 1) {
                    Intent intent = new Intent(MainActivity.this, SecondLaptop.class);
                    startActivity(intent);
                }
                if (i == 2) {
                    Intent intent = new Intent(MainActivity.this, ThirdLaptop.class);
                    startActivity(intent);
                }
                if (i == 3) {
                    Intent intent = new Intent(MainActivity.this, FourthLaptop.class);
                    startActivity(intent);
                }
                if (i == 4) {
                    Intent intent = new Intent(MainActivity.this, FifthLaptop.class);
                    startActivity(intent);
                }
                if (i == 5) {
                    Intent intent = new Intent(MainActivity.this, SixthLaptop.class);
                    startActivity(intent);
                }
            }
        });
    }



}



