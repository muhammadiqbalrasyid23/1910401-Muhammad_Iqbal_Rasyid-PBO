package com.MuhammadIqbalRasyid.Pertemuan1.Tugas;

public class Karyawan {
    private static String nama = "Paijo";
    private static String alamat = "Distric Gangnam";
    private static String warga = "WNI";
    private static String personal = "Bertanggungjawab, Jujur, Amanah, dan Teliti";

    private static int setUmur() {
        int umur = 21;
        return umur;
    }

    private static int setGaji() {
        int gaji = 2100000;
        return gaji;
    }

    private static double settinggi() {
        double tinggi = 178.5;
        return tinggi;
    }

    public static void main(String[] args) {
        System.out.println("\tData Karyawan");
        System.out.println("Nama  \t: " + nama);
        System.out.println("Umur  \t: " + setUmur());
        System.out.println("Alamat\t: " + alamat);
        System.out.println("Gaji per Bulan  : " + setGaji());
        System.out.println("Tinggi Badan    : " + settinggi());
        System.out.println("Kewarganegaraan : " + warga);
        System.out.println("Personaliti     : " + personal);
    }
}
