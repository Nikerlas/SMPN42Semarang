package com.smk9smg.smpn42semarang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    CardView cvProfil;
    CardView cvGuruStaff;
    CardView cvEkskul;
    CardView cvFasilitas;
    CardView cvPerpus;
    CardView cvGaleri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        cvProfil = findViewById(R.id.cv_Profil);
        cvGuruStaff = findViewById(R.id.cv_GuruStaff);
        cvEkskul = findViewById(R.id.cv_Ekskul);
        cvFasilitas = findViewById(R.id.cv_Fasilitas);
        cvPerpus = findViewById(R.id.cv_Perpus);
        cvGaleri = findViewById(R.id.cv_Galeri);

        getSupportActionBar().hide();

        cvProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,Profil.class);
                startActivity(intent);

            }
        });

        cvGuruStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,GuruStaff.class);
                startActivity(intent);
            }
        });

        cvEkskul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,Ekskul.class);
                startActivity(intent);
            }
        });

        cvFasilitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,Fasilitas.class);
                startActivity(intent);
            }
        });

        cvPerpus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,Perpus.class);
                startActivity(intent);
            }
        });

        cvGaleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,Galeri.class);
                startActivity(intent);
            }
        });

    }
}