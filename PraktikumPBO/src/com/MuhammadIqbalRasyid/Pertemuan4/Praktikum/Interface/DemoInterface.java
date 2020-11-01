package com.MuhammadIqbalRasyid.Pertemuan4.Praktikum.Interface;

public class DemoInterface {
    public static void main(String[] args) {
        Paket paketA = new Paket("Bagaimana Jadi Ganteng", "IKI NYONG", 150000, "43", 50000);

        paketA.hitungHargaPaket();
        paketA.cetakPaket();
    }
}
