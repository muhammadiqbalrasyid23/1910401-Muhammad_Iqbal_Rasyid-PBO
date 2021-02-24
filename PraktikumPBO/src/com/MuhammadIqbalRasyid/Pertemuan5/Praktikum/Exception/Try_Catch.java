package com.MuhammadIqbalRasyid.Pertemuan5.Praktikum.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Try_Catch {
    public static void main(String[] args) {
        File file = new File("E:\\Kuliah\\Tingkat 2\\Praktikum_PBO\\PraktikumPBO\\PraktikumPBO\\src\\com\\MuhammadIqbalRasyid\\Pertemuan5\\Praktikum\\Exception\\Paimon.txt");

        try {
            FileReader fileReader = new FileReader(file);
            System.out.println("read file berhasil");
        } catch (FileNotFoundException e) {
            System.out.println("JAncuk");
        }
    }
}

