package com.smk9smg.smpn42semarang;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        getSupportActionBar().hide();

        PDFView pdfView = findViewById(R.id.pdf_view);
        pdfView.fromAsset("sambutan.pdf")
                .enableSwipe(true)
                .enableDoubletap(true)
                .load();
    }
}