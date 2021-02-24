package com.MuhammadIqbalRasyid.Pertemuan3.Praktikum.Komposisi;

public class Mousa {
    private String merk;
    private String dpi;

    public Mousa(String merk, String dpi) {
        this.merk = merk;
        this.dpi = dpi;
    }

    public void PrintSpec() {
        System.out.println("- Merk\t; " + merk);
        System.out.println("- DPI\t; " + dpi);
        System.out.println();
    }
}
