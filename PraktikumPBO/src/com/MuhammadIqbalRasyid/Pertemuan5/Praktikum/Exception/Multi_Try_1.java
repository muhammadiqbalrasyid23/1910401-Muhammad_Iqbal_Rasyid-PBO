package com.MuhammadIqbalRasyid.Pertemuan5.Praktikum.Exception;

public class Multi_Try_1 {
    public static void main(String[] args) {
        int[] array = new int[5];

        try {
            array[4] = 30 / 0;
            System.out.println(array[4]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Panjang kurang dari 5!!");
            System.out.println("Jangan di BAgi 0");
        }
    }
}
