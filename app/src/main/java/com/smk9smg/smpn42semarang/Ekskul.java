package com.smk9smg.smpn42semarang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Ekskul extends AppCompatActivity {

    CardView cvPaskibra;
    CardView cvPramuka;
    CardView cvOsis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekskul);

        cvPaskibra = (CardView) findViewById(R.id.Paskibra);
        cvPaskibra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ekskul.this, Paskibra.class);
                startActivity(intent);
            }
        });

        cvPramuka = (CardView) findViewById(R.id.Pramuka);
        cvPramuka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ekskul.this, Pramuka.class);
                startActivity(intent);
            }
        });

        cvOsis = (CardView) findViewById(R.id.Osis);
        cvOsis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ekskul.this, Osis.class);
                startActivity(intent);
            }
        });

        getSupportActionBar().hide();
    }
}