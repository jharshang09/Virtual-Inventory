package com.example.virtualinventory;

import static com.example.virtualinventory.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.os.Handler;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Handler h = new Handler();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, Homescreen.class);
                startActivity(i);
                finish();

            }
        }, 1000);
    }

    @Override
    public void setContentView(int activity_login) {
        super.setContentView(layout.activity_login);
        CheckBox ch = (CheckBox) findViewById(id.checkbox);
    }

    public void onButtonClick(View view) {
        if(view.getId() == R.id.sign_in)
        {
            EditText a = (EditText)findViewById(id.username);
            String str = a.getText().toString();
            Intent i = new Intent(MainActivity.this,LoginActivity.class);
            startActivity(i);
        }
        if(view.getId() == R.id.sign_up)
        {
            Intent i = new Intent(MainActivity.this,LoginActivity.class);
            startActivity(i);
        }
    }

    public void onCheckBoxClicked(View view) {
        String msg;
        CheckedTextView ch = null;
        if (ch.isChecked())
            msg = "Keep me signed in";
        Toast.makeText(this, "msg", Toast.LENGTH_SHORT).show();
    }
}