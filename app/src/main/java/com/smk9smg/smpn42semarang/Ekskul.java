package com.smk9smg.smpn42semarang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Ekskul extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekskul);

        getSupportActionBar().hide();
    }
}