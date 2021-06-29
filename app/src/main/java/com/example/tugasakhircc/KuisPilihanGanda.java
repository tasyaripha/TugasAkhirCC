package com.example.tugasakhircc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class KuisPilihanGanda extends AppCompatActivity {

    TextView tvSkor, tvSoal;
    RadioGroup rgPilihanJawaban;
    RadioButton rbPilihanJawaban1, rbPilihanJawaban2, rbPilihanJawaban3;
    Button btnSubmit;
    int skor = 0;
    int arr;
    int x;
    String jawaban;

    SoalPilihanGanda soalPG = new SoalPilihanGanda();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_pilihan_ganda);

        tvSkor = (TextView) findViewById(R.id.tvSkor);
        tvSoal = (TextView) findViewById(R.id.tvSoal);
        rgPilihanJawaban = (RadioGroup) findViewById(R.id.rgPilihanJawaban);
        rbPilihanJawaban1 = (RadioButton) findViewById(R.id.rbPilihanJawaban1);
        rbPilihanJawaban2 = (RadioButton) findViewById(R.id.rbPilihanJawaban2);
        rbPilihanJawaban3 = (RadioButton) findViewById(R.id.rbPilihanJawaban3);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        tvSkor.setText(""+skor);
        setKonten();

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cekJawaban();
            }
        });
    }

    private void setKonten() {
        rgPilihanJawaban.clearCheck();
        arr = soalPG.pertanyaan.length;
        if (x >= arr) {
            String jumlahSkor = String.valueOf(skor);
            Intent i = new Intent(KuisPilihanGanda.this, HasilSkoring.class);

            i.putExtra("skorAkhir", jumlahSkor);
            i.putExtra("activity", "PilihanGanda");
            startActivity(i);
        }else {
            tvSoal.setText(soalPG.getPertanyaan(x));
            rbPilihanJawaban1.setText(soalPG.getPilihanJawaban1(x));
            rbPilihanJawaban2.setText(soalPG.getPilihanJawaban2(x));
            rbPilihanJawaban3.setText(soalPG.getPilihanJawaban3(x));
            jawaban = soalPG.getJawabanBenar(x);
        }
        x++;
    }

    public void cekJawaban() {
        if (rbPilihanJawaban1.isChecked()) {
            if (rbPilihanJawaban1.getText().toString().equals(jawaban)) {
                skor = skor + 20;
                tvSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            } else {
                tvSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        } else  if (rbPilihanJawaban2.isChecked()) {
            if (rbPilihanJawaban2.getText().toString().equals(jawaban)) {
                skor = skor + 20;
                tvSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            } else {
                tvSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        } else if (rbPilihanJawaban3.isChecked()) {
            if(rbPilihanJawaban3.getText().toString().equals(jawaban)) {
                skor = skor + 20;
                tvSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            } else{
                tvSkor.setText(""+skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        } else {
            Toast.makeText(this, "Silahkan pilih jawaban dulu!", Toast.LENGTH_SHORT).show();
        }
    }

    public void onBackPressed(){
        Toast.makeText(this, "Selesaikan Kuis", Toast.LENGTH_SHORT).show();
    }
}