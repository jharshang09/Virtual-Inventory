package com.example.virtualinventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {

    Handler h = new Handler();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, Homescreen.class);
                startActivity(i);
                finish();

            }
        }, 1000);
    }

}