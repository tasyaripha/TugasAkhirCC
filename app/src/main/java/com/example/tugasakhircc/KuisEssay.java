package com.example.tugasakhircc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class KuisEssay extends AppCompatActivity {

    TextView tvSkor2,tvSoal2;
    ImageView ivGambar;
    EditText edtJawaban;
    Button btnSubmit2;
    int x=0;
    int arr;
    int skor;
    String jawaban;

    SoalEssay essay = new SoalEssay();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_essay);

        tvSkor2 = (TextView) findViewById(R.id.tvSkor2);
        tvSoal2 = (TextView) findViewById(R.id.tvSoal2);
        ivGambar = (ImageView) findViewById(R.id.ivGambar);
        edtJawaban = (EditText) findViewById(R.id.edJawaban);
        btnSubmit2 = (Button) findViewById(R.id.btnSubmit2);

        setKonten();

        btnSubmit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cekJawaban();
            }
        });
    }

    private void setKonten() {
        edtJawaban.setText(null);
        arr = essay.pertanyaan.length;
        if (x >= arr) { //jika nilai x melebihi nilai arr(panjang array) maka akan pindah activity (kuis selesai)
            String jumlahSkor = String.valueOf(skor);       //menjadikan skor menjadi string
            Intent i = new Intent(KuisEssay.this, HasilSkoring.class);

            //waktu pindah activity, sekalian membawa nilai jumlahSkor yang ditampung dengan inisial skorAkhir2
            //singkatnya skorAkhir2 = jumlahSkor
            //jika masih belum jelas silahkan bertanya
            i.putExtra("skorAkhir2", jumlahSkor);
            i.putExtra("activity","Essay");
            startActivity(i);
        } else {

            //setting text dengan mengambil text dari method getter di kelas SoalEssay
            tvSoal2.setText(essay.getPertanyaan(x));
            ubahGambar();
            jawaban = essay.getJawabanBenar(x);
        }
        x++;
    }

    private void ubahGambar () {
        Resources res = getResources();
        String mPhoto = essay.getStringGambar(x);
        int resID = res.getIdentifier(mPhoto, "drawable", getPackageName());
        Drawable drawable = res.getDrawable(resID);
        ivGambar.setImageDrawable(drawable);
    }

    public void cekJawaban() {
        if(!edtJawaban.getText().toString().isEmpty()) {
            //jika edit text TIDAK kosong
            //jika text yang tertulis di edit text tsb = nilai dari var jawaban
            if (edtJawaban.getText().toString().equalsIgnoreCase(jawaban)) {
                skor = skor + 20;
                tvSkor2.setText("" + skor);        //tvSkor2 diset nilainya = var skor
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show(); //keluar notifikasi "Jawaban Benar"
                setKonten(); //update next konten
            } else {
                tvSkor2.setText("" + skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        } else {
            Toast.makeText(this, "Silahkan pilih jawaban dulu!", Toast.LENGTH_SHORT).show();
        }
    }

    //ini adalah method bawaan dari Android Studio
    //fungsi : memberi aksi ketika tombol back pada hp diklik
    public void onBackPressed() {
        Toast.makeText(this, "Selesaikan Kuis", Toast.LENGTH_SHORT).show();
        //jadi yang awalnya klik tombol back maka akan kembali ke activity sebelumnya
        //kali ini ketika tombol back diklik maka
        //hanya muncul Toast
    }
}