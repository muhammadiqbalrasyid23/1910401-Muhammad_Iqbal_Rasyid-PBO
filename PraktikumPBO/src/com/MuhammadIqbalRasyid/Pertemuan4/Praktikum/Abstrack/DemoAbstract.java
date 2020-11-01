package com.MuhammadIqbalRasyid.Pertemuan4.Praktikum.Abstrack;

import java.util.Random;

public class DemoAbstract {
    public static void main(String[] args) {
        Binatang[] peliharaan = {
                new Burung("Kacer"),
                new Kambing("ETawa"),
                new Kucing("Anggora"),
                new Anjing("Buldong")
        };
        Binatang kesayangan;

        Random pilihan = new Random();

        kesayangan = peliharaan[pilihan.nextInt(peliharaan.length)];

        System.out.println("Binatang kesayangan anda\t :" + kesayangan);
        System.out.print("Suara\t :");
        kesayangan.suara();
    }
}
