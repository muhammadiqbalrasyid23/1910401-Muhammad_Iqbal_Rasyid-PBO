package com.MuhammadIqbalRasyid.Pertemuan3.Praktikum.Asosiasi;

public class Dosen {
    private String kodeDosen;
    private int NimMHS[] = new int[10];
    private int jmlMahasiswa;

    public Dosen() {
    }

    public String getKodeDosen() {
        return kodeDosen;
    }

    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    public int getJmlMahasiswa() {
        return jmlMahasiswa;
    }

    public int getNimMHS(int indeks) {
        return (NimMHS[indeks]);
    }

    public void setNimMHS(int nim) {
        NimMHS[jmlMahasiswa] = nim;
        jmlMahasiswa++;
    }

}

