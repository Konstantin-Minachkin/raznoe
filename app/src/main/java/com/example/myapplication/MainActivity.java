package com.example.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        Thread s = new Thread() {
            public void run() {
                try {
                    sleep(2000);
                    Intent intent = new Intent(MainActivity.this, Splashscreen.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e) {

                }
            }
        };
        s.start();
    }
}