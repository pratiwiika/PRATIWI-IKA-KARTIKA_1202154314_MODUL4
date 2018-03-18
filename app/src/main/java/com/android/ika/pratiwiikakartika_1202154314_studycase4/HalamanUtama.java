package com.android.ika.pratiwiikakartika_1202154314_studycase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HalamanUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);
    }

    //method saat button ditekan
    public void mhs(View view) {
        //untuk berpindah ke aktivitas mahasiswa//
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
    }

    //method saat button ditekan
    public void pic(View view) {
        //untuk berpindah ke aktivitas gambar//
        Intent intent = new Intent(this, CariGambar.class);
        startActivity(intent);
    }
}
