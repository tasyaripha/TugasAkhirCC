package com.example.tugasakhircc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HasilSkoring extends AppCompatActivity {

    TextView tvHasilAkhir;
    Button btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_skoring);

        tvHasilAkhir = (TextView) findViewById(R.id.tvSkorAkhir);
        btnMenu = (Button) findViewById(R.id.btnMenu);

        setSkor();

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HasilSkoring.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    private void setSkor() {
        String activity = getIntent().getStringExtra("activity");
        String skorPilgan = getIntent().getStringExtra("skorAkhir");
        String skorEssay = getIntent().getStringExtra("skorAkhir2");

        if (activity.equals("PilihanGanda")) {
            tvHasilAkhir.setText("SKOR : " +skorPilgan);
        } else {
            tvHasilAkhir.setText("SKOR :  " +skorEssay);
        }
    }

    public void onBackPressed() {
        Toast.makeText(this, "Tidak bisa kembali, Silahkan tekan menu", Toast.LENGTH_SHORT).show();
    }
}

