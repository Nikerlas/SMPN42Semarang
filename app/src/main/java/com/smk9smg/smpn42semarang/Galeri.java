package com.smk9smg.smpn42semarang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Galeri extends AppCompatActivity {

    CardView cvUpacara;
    CardView cvPerjusa;
    CardView cvSenam;
    CardView cvArtshow;
    CardView cvSpiritspada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);
        cvUpacara = findViewById(R.id.Upacara);
        cvPerjusa = findViewById(R.id.Perjusa);
        cvSenam = findViewById(R.id.Senam);
        cvArtshow = findViewById(R.id.Artshow);
        cvSpiritspada = findViewById(R.id.Spiritspada);

        getSupportActionBar().hide();

        cvUpacara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galeri.this, Upacara.class);
                startActivity(intent);
            }
        });

        cvPerjusa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galeri.this, Perjusa.class);
                startActivity(intent);
            }
        });

        cvSenam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galeri.this, Senam.class);
                startActivity(intent);
            }
        });

        cvArtshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galeri.this, Artshow.class);
                startActivity(intent);
            }
        });

        cvSpiritspada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Galeri.this, Spiritspada.class);
                startActivity(intent);
            }
        });
    }
}