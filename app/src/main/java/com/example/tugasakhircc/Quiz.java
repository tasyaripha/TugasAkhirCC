package com.example.tugasakhircc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Quiz extends AppCompatActivity {
    LinearLayout mlinePilgan, mLineEssay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mlinePilgan = (LinearLayout) findViewById(R.id.linePilGan);
        mLineEssay= (LinearLayout) findViewById(R.id.lineEssay);

        mlinePilgan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Quiz.this, KuisPilihanGanda.class);
                startActivity(i);
            }
        });

        mLineEssay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Quiz.this, KuisEssay.class);
                startActivity(i);
            }
        });
    }
}