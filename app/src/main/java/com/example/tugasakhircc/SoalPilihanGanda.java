package com.example.tugasakhircc;

public class SoalPilihanGanda {
    public String pertanyaan[] = {
            "Kucing berkembangbiak dengan cara?",
            "Hewan yang berkembangbiak secara Vivipar?",
            "Ayam berkembangbiak secara?",
            "Insang pada ikan berguna untuk...",
            "Hewan yang hidup di air disebut..."


    };

    private String pilihanJawaban [] [] = {
            {"Ovipar", "Vivipar", "Ovovivipar"},
            {"Ikan", "Kucing", "Burung"},
            {"Vivipar", "Ovipar", "Ovovivipar"},
            {"Bernafas", "Berenang", "Mencari Makan"},
            {"Hewan Darat", "Hewan Air", "Hewan Udara"}

    };

    public String jawabanBenar [] = {
            "Ovipar",
            "Kucing",
            "Ovipar",
            "Bernapas",
            "Hewan Air"
    };

    public String getPertanyaan(int x) {
        String soal = pertanyaan[x];
        return soal;
    }

    public String getPilihanJawaban1(int x) {
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    public String getPilihanJawaban2(int x) {
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    public String getPilihanJawaban3(int x) {
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    public String getJawabanBenar(int x) {
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
