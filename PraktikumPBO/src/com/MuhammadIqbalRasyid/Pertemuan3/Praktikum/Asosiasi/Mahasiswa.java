package com.MuhammadIqbalRasyid.Pertemuan3.Praktikum.Asosiasi;

public class Mahasiswa {
    private int NIM;
    private String Nama;

    public Mahasiswa() {

    }

    public Mahasiswa(int NIM, String nama) {
        this.NIM = NIM;
        Nama = nama;
    }

    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }
}
