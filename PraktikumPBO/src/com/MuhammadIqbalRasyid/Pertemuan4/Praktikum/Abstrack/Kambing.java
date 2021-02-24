package com.MuhammadIqbalRasyid.Pertemuan4.Praktikum.Abstrack;

public class Kambing extends Binatang {
    private String nama;

    public Kambing(String nama) {
        super("Kambing");
        this.nama = nama;
    }

    @Override
    protected void suara() {
        System.out.println(" Mbep");
    }

    @Override
    public String toString() {
        return super.toString() + " " + nama;
    }
}
