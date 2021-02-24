package com.MuhammadIqbalRasyid.Pertemuan4.Praktikum.Interface;

public class CD {
    String ukuran;
    long hargaCD;

    public CD(String ukuran, long hargaCD) {
        this.ukuran = ukuran;
        this.hargaCD = hargaCD;
    }

    public void setHargaCD(long hargaCD) {
        this.hargaCD = hargaCD;
    }

    public void cetakCD() {
        System.out.println("Ukuran CD : " + ukuran);
        System.out.println("Harga CD : " + hargaCD);
    }
}
