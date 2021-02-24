package com.MuhammadIqbalRasyid.Pertemuan3.Praktikum.Asosiasi;

public class DemoKuliah {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Paijo");
        mahasiswa.setNIM(1907726);

        Mahasiswa mahasiswa1 = new Mahasiswa(1907725, "Opah");

        Dosen dosen = new Dosen();
        dosen.setKodeDosen("ACW");
        dosen.setNimMHS(mahasiswa.getNIM());
        dosen.setNimMHS(mahasiswa1.getNIM());

        System.out.println("Kode Dosen\t: " + dosen.getKodeDosen());
        System.out.println("Mengajar Mahasiswa\t: ");

        for (int i = 0; i < dosen.getJmlMahasiswa(); i++) {
            System.out.println("- " + dosen.getNimMHS(i));
        }
    }
}
