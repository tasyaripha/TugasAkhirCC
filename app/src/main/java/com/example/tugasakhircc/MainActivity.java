package com.example.tugasakhircc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.QuickContactBadge;

public class MainActivity extends AppCompatActivity {
//Deklarasikan LineMateri dan LineQuiz untuk memanggil menu Materi dan menu Quiz

    LinearLayout mlineMateri, mLineQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlineMateri = (LinearLayout) findViewById(R.id.lineMateri);
        mLineQuiz = (LinearLayout) findViewById(R.id.lineQuiz);

        //Ketika lineMateri di setOnClick agar bisa diklik
        mlineMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Materi.class);
                startActivity(i);
            }
        });

        //Ketika lineQuiz di setOnClick agar bisa diklik
        mLineQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Quiz.class);
                startActivity(i);
            }
        });
    }
}