package com.MuhammadIqbalRasyid.Pertemuan1.Praktikum.Manusia;

public class Manusia {
    private String nama;
    private int umur;

    //constuctor pertama
    public Manusia() {
    }

    // cons Kedua
    public Manusia(String nama) {
        this.nama = nama;
    }

    // cons Ketiga
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
