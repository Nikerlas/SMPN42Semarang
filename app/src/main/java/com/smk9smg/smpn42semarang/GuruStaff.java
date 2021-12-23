package com.smk9smg.smpn42semarang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GuruStaff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guru_staff);

        getSupportActionBar().hide();
    }
}