package com.MuhammadIqbalRasyid.Pertemuan4.Praktikum.Abstrack;

public class Burung extends Binatang {
    private String nama;

    public Burung(String nama) {
        super("Burung");
        this.nama = nama;
    }

    @Override
    protected void suara() {
        System.out.println("Berkicau");
    }

    @Override
    public String toString() {
        return super.toString() + " " + nama;
    }
}
