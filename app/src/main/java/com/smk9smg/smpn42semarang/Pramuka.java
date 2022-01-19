package com.smk9smg.smpn42semarang;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Pramuka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pramuka);

        getSupportActionBar().hide();
    }
}