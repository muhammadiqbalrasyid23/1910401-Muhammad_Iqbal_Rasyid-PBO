package com.MuhammadIqbalRasyid.Pertemuan4.Praktikum.Abstrack;

public class Anjing extends Binatang {
    private String nama;

    public Anjing(String nama) {
        super("Anjing");
        this.nama = nama;
    }

    @Override
    protected void suara() {
        System.out.println(" mengonggong");
    }

    @Override
    public String toString() {
        return super.toString() + " " + nama;
    }
}
