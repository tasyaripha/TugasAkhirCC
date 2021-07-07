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

    //membuat variabel baru sesuai tipe
    TextView tvSkor, tvSoal;
    RadioGroup rgPilihanJawaban;
    RadioButton rbPilihanJawaban1, rbPilihanJawaban2, rbPilihanJawaban3;
    Button btnSubmit;
    int skor = 0;
    int arr; //untuk menampung nilai panjang array
    int x; //menunjukkan konten sekarang
    String jawaban; //menampung jawaban benar

    //membuat objek dari kelas SoalPilihanGanda.java
    SoalPilihanGanda soalPG = new SoalPilihanGanda();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_pilihan_ganda);

        //menyambungkan antara variabel KuisPilihanGanda.java dengan id activity_kuis_pilihan_ganda
        tvSkor = (TextView) findViewById(R.id.tvSkor);
        tvSoal = (TextView) findViewById(R.id.tvSoal);
        rgPilihanJawaban = (RadioGroup) findViewById(R.id.rgPilihanJawaban);
        rbPilihanJawaban1 = (RadioButton) findViewById(R.id.rbPilihanJawaban1);
        rbPilihanJawaban2 = (RadioButton) findViewById(R.id.rbPilihanJawaban2);
        rbPilihanJawaban3 = (RadioButton) findViewById(R.id.rbPilihanJawaban3);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        //set Konten
        tvSkor.setText(""+skor);
        setKonten();

        //menentukan aksi ketika button submit diklik
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //aksinya disini
                //aksinya adalah ketika button tersebut diklik maka
                //akan mengecek jawaban benar atau salah
                //kemudian konten akan berubah (next konten)
                cekJawaban();
            }
        });
    }

    //method untuk mengambil dan update konten dari SoalPilihanGanda.java
    //kemudian disetting/ditempatkan pada tempat yang telah disediakan
    private void setKonten() {
        rgPilihanJawaban.clearCheck();
        arr = soalPG.pertanyaan.length;
        if (x >= arr) { //jika nilai x melebihi nilai arr(panjang array) maka akan pindah activity (kuis selesai)
            String jumlahSkor = String.valueOf(skor);          //menjadikan skor menjadi string
            Intent i = new Intent(KuisPilihanGanda.this, HasilSkoring.class);
            //waktu pindah activity, sekalian membawa nilai jumlahSkor yang ditampung dengan inisial skorAkhir
            //singkatnya skorAkhir = jumlahSkor
            //jika masih belum jelas silahkan bertanya
            i.putExtra("skorAkhir", jumlahSkor);
            i.putExtra("activity", "PilihanGanda");
            startActivity(i);
        }else {

            //setting text dengan mengambil text dari method getter di kelas SoalPilihanGanda
            tvSoal.setText(soalPG.getPertanyaan(x));
            rbPilihanJawaban1.setText(soalPG.getPilihanJawaban1(x));
            rbPilihanJawaban2.setText(soalPG.getPilihanJawaban2(x));
            rbPilihanJawaban3.setText(soalPG.getPilihanJawaban3(x));
            jawaban = soalPG.getJawabanBenar(x);
        }
        x++;
    }


    public void cekJawaban() {
        if (rbPilihanJawaban1.isChecked()) { //jika radio button 1 diklik
            //jika text yang tertulis di radio button tsb = nilai dari var jawaban
            if (rbPilihanJawaban1.getText().toString().equals(jawaban)) {
                skor = skor + 20;
                tvSkor.setText("" + skor);      //mtvSkor diset nilainya = var skor
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show(); //keluar notifikasi "Jawaban Benar"
                setKonten();  //update next konten
            } else {
                tvSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        } else  if (rbPilihanJawaban2.isChecked()) {
            //jika text yang tertulis di radio button tsb = nilai dari var jawaban
            if (rbPilihanJawaban2.getText().toString().equals(jawaban)) {
                skor = skor + 20;
                tvSkor.setText("" + skor); //mtvSkor diset nilainya = var skor
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show(); //keluar notifikasi "Jawaban Benar"
                setKonten(); //update next konten
            } else {
                tvSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        } else if (rbPilihanJawaban3.isChecked()) {
            //jika text yang tertulis di radio button tsb = nilai dari var jawaban
            if(rbPilihanJawaban3.getText().toString().equals(jawaban)) {
                skor = skor + 20;
                tvSkor.setText("" + skor);  //mtvSkor diset nilainya = var skor
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show(); //keluar notifikasi "Jawaban Benar"
                setKonten(); //update next konten
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