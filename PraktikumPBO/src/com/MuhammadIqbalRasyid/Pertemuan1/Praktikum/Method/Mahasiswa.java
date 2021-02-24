package com.MuhammadIqbalRasyid.Pertemuan1.Praktikum.Method;

public class Mahasiswa {
    String nama;
    int nim;

    //Constructor
    public Mahasiswa() {
    }

    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    //Getter & Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
}
