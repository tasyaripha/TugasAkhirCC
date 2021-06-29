package com.example.tugasakhircc;

public class SoalEssay {
    public String pertanyaan[] = {
            "Gambar diatas bernapas menggunakan?",
            "Kucing berkembangbiak dengan cara?",
    };

    public String image[] = {
           "essayimg1",
            "essayimg2"
    };

    public String jawabanBenar[] = {
           "Ingsan",
            "Vivipar"
    };

    String getPertanyaan(int x) {
        String soal = pertanyaan[x];
        return soal;
    }

    public String getStringGambar(int x) {
        String gambar = image[x];
        return gambar;
    }

    public String getJawabanBenar(int x) {
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
