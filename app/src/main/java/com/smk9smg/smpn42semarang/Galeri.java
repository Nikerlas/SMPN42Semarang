package com.smk9smg.smpn42semarang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Galeri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);

        getSupportActionBar().hide();
    }
}