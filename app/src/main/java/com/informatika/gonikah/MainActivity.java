package com.informatika.gonikah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.informatika.gonikah.cake.CakeActivity;
import com.informatika.gonikah.catering.CateringActivity;
import com.informatika.gonikah.entertainer.EntertainerActivity;
import com.informatika.gonikah.gedung.GedungActivity;
import com.informatika.gonikah.jewel.JewelActivity;
import com.informatika.gonikah.souvenir.SouvenirActivity;
import com.informatika.gonikah.undangan.UndanganActivity;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchGedung(View view) {
        Intent intent = new Intent(this, GedungActivity.class);
        startActivity(intent);
        Log.d(LOG_TAG, "Button clicked!");

    }
    public void launchCake(View view) {
        Intent intent = new Intent(this, CakeActivity.class);
        startActivity(intent);
        Log.d(LOG_TAG, "Button clicked!");

    }
    public void launchCatering(View view) {
        Intent intent = new Intent(this, CateringActivity.class);
        startActivity(intent);
        Log.d(LOG_TAG, "Button clicked!");

    }
    public void launchEntertainer(View view) {
        Intent intent = new Intent(this, EntertainerActivity.class);
        startActivity(intent);
        Log.d(LOG_TAG, "Button clicked!");

    }
    public void launchJewel(View view) {
        Intent intent = new Intent(this, JewelActivity.class);
        startActivity(intent);
        Log.d(LOG_TAG, "Button clicked!");

    }
    public void launchSouvenir(View view) {
        Intent intent = new Intent(this, SouvenirActivity.class);
        startActivity(intent);
        Log.d(LOG_TAG, "Button clicked!");

    }
    public void launchUndangan(View view) {
        Intent intent = new Intent(this, UndanganActivity.class);
        startActivity(intent);
        Log.d(LOG_TAG, "Button clicked!");

    }
}
