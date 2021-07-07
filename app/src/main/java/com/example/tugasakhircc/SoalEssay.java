package com.example.tugasakhircc;


//membuat array untuk pertanyaan
public class SoalEssay {
    public String pertanyaan[] = {
            "Gambar diatas bernapas menggunakan?",
            "Kucing berkembangbiak dengan cara?",
            "Hewan-hewan diatas hidup di?",
            "Sapi, Kambing dan Kuda termasuk hewan yang makan?",
            "Hewan-hewan diatas hidup di?"
    };

    //membuat array untuk set gambar (dari String diubah jadi ImageView)
    //pastikan yang tertulis disini sama dengan nama di drawable
    //lihat gambar penjelasan1
    public String image[] = {
           "essayimg1",
            "essayimg2",
            "essayimg3",
            "essayimg4",
            "essayimg5"
    };

    //membuat array jawaban benar
    public String jawabanBenar[] = {
           "Ingsan",
            "Melahirkan",
            "Air",
            "Rumput",
            "Darat"
    };

    //membuat getter untuk mengambil pertanyaan
    String getPertanyaan(int x) {
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getStringGambar(int x) {
        String gambar = image[x];
        return gambar;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x) {
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
