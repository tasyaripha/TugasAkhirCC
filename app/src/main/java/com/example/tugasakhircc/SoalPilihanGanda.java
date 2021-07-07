package com.example.tugasakhircc;

//membuat array untuk pertanyaan
public class SoalPilihanGanda {
    public String pertanyaan[] = {
            "Kucing berkembangbiak dengan cara?",
            "Hewan yang berkembangbiak secara Vivipar?",
            "Ayam berkembangbiak secara?",
            "Insang pada ikan berguna untuk...",
            "Hewan yang hidup di air disebut..."


    };

    //membuat array untuk pilihan jawaban
    private String pilihanJawaban [] [] = {
            {"Ovipar", "Vivipar", "Ovovivipar"},
            {"Ikan", "Kucing", "Burung"},
            {"Vivipar", "Ovipar", "Ovovivipar"},
            {"Bernapas", "Berenang", "Mencari Makan"},
            {"Hewan Darat", "Hewan Air", "Hewan Udara"}

    };

    //membuat array untuk jawaban benar
    public String jawabanBenar [] = {
            "Ovipar",
            "Kucing",
            "Ovipar",
            "Bernapas",
            "Hewan Air"
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x) {
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    public String getPilihanJawaban1(int x) {
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    public String getPilihanJawaban2(int x) {
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    public String getPilihanJawaban3(int x) {
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x) {
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
