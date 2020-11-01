package com.MuhammadIqbalRasyid.Pertemuan3.Praktikum.Agregasi;

import java.util.ArrayList;
import java.util.List;

public class DemoJurursan {
    public static void main(String[] args) {
        // Constructor Jurusan
        Jurusan jurusan = new Jurusan("2110", "Software Engineering");

        // Constructor Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Paimon", 21104001);
        Mahasiswa mahasiswa2 = new Mahasiswa("Tabi Bito", 21104002);
        Mahasiswa mahasiswa3 = new Mahasiswa("Barbara", 21104003);

        // Temporary array list
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(mahasiswa1);
        mahasiswaList.add(mahasiswa2);
        mahasiswaList.add(mahasiswa3);
        mahasiswaList.add(new Mahasiswa("Fischl", 21104004));

        // Adds this mahasiswaList above ^^ to the mahasiswaList inside 'jurusan' object
        jurusan.setMahasiswaList(mahasiswaList);

        // Prints out all data stored inside 'jurusan' object
        jurusan.printData();
    }
}
