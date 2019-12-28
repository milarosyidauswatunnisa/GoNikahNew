package com.informatika.gonikah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchGedung(View view) {
        Intent intent = new Intent(this, gedung.class);
        startActivity(intent);
        Log.d(LOG_TAG, "Button clicked!");

    }
    public void launchCake(View view) {
        Intent intent = new Intent(this, cake.class);
        startActivity(intent);
        Log.d(LOG_TAG, "Button clicked!");

    }
    public void launchCatering(View view) {
        Intent intent = new Intent(this, catering.class);
        startActivity(intent);
        Log.d(LOG_TAG, "Button clicked!");

    }
    public void launchEntertainer(View view) {
        Intent intent = new Intent(this, entertainer.class);
        startActivity(intent);
        Log.d(LOG_TAG, "Button clicked!");

    }
    public void launchJewel(View view) {
        Intent intent = new Intent(this, jewel.class);
        startActivity(intent);
        Log.d(LOG_TAG, "Button clicked!");

    }
    public void launchSouvenir(View view) {
        Intent intent = new Intent(this, souvenir.class);
        startActivity(intent);
        Log.d(LOG_TAG, "Button clicked!");

    }
    public void launchUndangan(View view) {
        Intent intent = new Intent(this, undangan.class);
        startActivity(intent);
        Log.d(LOG_TAG, "Button clicked!");

    }
}
