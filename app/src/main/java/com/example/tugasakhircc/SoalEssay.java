package com.example.tugasakhircc;

public class SoalEssay {
    public String pertanyaan[] = {
            "Gambar diatas bernapas menggunakan?",
            "Kucing berkembangbiak dengan cara?",
            "Hewan-hewan diatas hidup di?",
            "Sapi, Kambing dan Kuda termasuk hewan yang makan?",
            "Hewan-hewan diatas hidup di?"
    };

    public String image[] = {
           "essayimg1",
            "essayimg2",
            "essayimg3",
            "essayimg4",
            "essayimg5"
    };

    public String jawabanBenar[] = {
           "Ingsan",
            "Melahirkan",
            "Air",
            "Rumput",
            "Darat"
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
