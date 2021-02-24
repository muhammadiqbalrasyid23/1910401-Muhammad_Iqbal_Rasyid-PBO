package com.MuhammadIqbalRasyid.Pertemuan5.Praktikum.Exception;

public class Finally {
    public static void main(String[] args) {
        int[] array = new int[5];

        try {
            System.out.println("Akses Elemen ke-5\t" + array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ada Exception Array");
        } finally {
            array[array.length - 1] = 10;
            System.out.println("Nilai elemen terakhir\t: " + array[array.length - 1]);
        }
    }
}
