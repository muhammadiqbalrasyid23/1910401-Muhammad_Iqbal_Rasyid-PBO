package com.MuhammadIqbalRasyid.Pertemuan5.Praktikum.Exception;

import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        System.out.println("Inpuut Array Length\t: ");
        int[] array = new int[intInputMethod()];

        System.out.println("Masukkan Detail\t : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Indeks ke-" + i + "\t:");
        }

        System.out.println("\nOuput\t: ");
        for (int x : array) {
            System.out.println("Data\t: " + x);
        }
    }

    public static int intInputMethod() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }
}
