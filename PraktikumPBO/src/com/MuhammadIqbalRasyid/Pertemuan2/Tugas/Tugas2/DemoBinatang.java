package com.MuhammadIqbalRasyid.Pertemuan2.Tugas.Tugas2;

public class DemoBinatang {
    public static void main(String[] args) {
        Binatang superclass = new Binatang();
        Burung classBurung = new Burung();
        Ikan classIkan = new Ikan();
        Kucing classKucing = new Kucing();

        System.out.println("Sifat unik Binatang :\n");
        superclass.getNama("Koala");
        System.out.println();
        classBurung.getNama("Burung Kacer");
        classBurung.burung();
        System.out.println();
        classIkan.getNama("Ikan Koi");
        classIkan.ikan();
        System.out.println();
        classKucing.getNama("Kucing Persia");
        classKucing.kucing();
    }
}
