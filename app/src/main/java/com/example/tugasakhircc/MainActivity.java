package com.example.tugasakhircc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.QuickContactBadge;

public class MainActivity extends AppCompatActivity {
    //variabel baru bertipe LinearLayout
    LinearLayout mlineMateri, mLineQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menyambungkan variabel pada MainActivity.java dengan id pada activity_main
        //pastikan tipe data variabel dengan view id sama
        mlineMateri = (LinearLayout) findViewById(R.id.lineMateri);
        mLineQuiz = (LinearLayout) findViewById(R.id.lineQuiz);

        //memberi aksi ketika diklik
        mlineMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //hasil aksinya ditulis disini (dalam method onClick)
                //pada kali ini hasil yang diinginkan adalah pindah activity, maka

                //membuat objek baru dari kelas intent,
                //dari MainActivity akan pindah ke KuisPilihaGanda
                Intent i = new Intent(MainActivity.this, Materi.class);
                startActivity(i); //jalankan Intent
            }
        });


        mLineQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            //hasil aksinya ditulis disini (dalam method onClick)
            //pada kali ini hasil yang diinginkan adalah pindah activity, maka

            //membuat objek baru dari kelas intent,
            //dari MainActivity akan pindah ke KuisEssay
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Quiz.class);
                startActivity(i);
            }
        });
    }
}