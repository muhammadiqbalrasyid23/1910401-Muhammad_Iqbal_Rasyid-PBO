package com.MuhammadIqbalRasyid.Pertemuan1.Tugas;

import java.util.Scanner;

public class Suhu {
    static int a, b;
    static double celc, kelv, fahren, ream;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih suhu dari");
        System.out.println("1. Celcius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.println("4. Reamur");
        System.out.print("Masukkan Pilihan : ");
        a = scanner.nextInt();
        System.out.print("Masukkan suhu    : ");
        b = scanner.nextInt();
        switch (a) {
            case 1:
                celcius c = new celcius();
                c.konversi();
                c.cetak();
                break;
            case 2:
                fahrenheit f = new fahrenheit();
                f.konvers();
                f.cetk();
                break;
            case 3:
                kelvin k = new kelvin();
                k.konversi();
                k.cetak();
                break;
            case 4:
                reamur r = new reamur();
                r.konversi();
                r.cetak();
                break;
        }
    }

    static class celcius {
        public void konversi() {
            celc = b;
            fahren = b * 1.8 + 32;
            kelv = b + 273;
            ream = b * 0.8;
        }

        public void cetak() {
            System.out.println("Celcius    : " + celc);
            System.out.println("Fahrenheit : " + fahren);
            System.out.println("Kelvin     : " + kelv);
            System.out.println("Reamur     : " + ream);
        }
    }

    static class fahrenheit {
        public void konvers() {
            celc = 0.56 * (b - 32);
            fahren = b;
            kelv = celc + 273;
            ream = 0.44 * (b - 32);
        }

        public void cetk() {
            System.out.println("Celcius    : " + celc);
            System.out.println("Fahrenheit : " + fahren);
            System.out.println("Kelvin     : " + kelv);
            System.out.println("Reamur     : " + ream);
        }
    }

    static class kelvin {
        public void konversi() {
            celc = b - 273;
            fahren = 1.8 * celc + 32;
            kelv = b;
            ream = 0.8 * celc;
        }

        public void cetak() {
            System.out.println("Celcius    : " + celc);
            System.out.println("Fahrenheit : " + fahren);
            System.out.println("Kelvin     : " + kelv);
            System.out.println("Reamur     : " + ream);
        }
    }

    static class reamur {
        public void konversi() {
            celc = 1.25 * b;
            fahren = 2.25 * b + 32;
            kelv = celc + 273;
            ream = b;
        }

        public void cetak() {
            System.out.println("Celcius    : " + celc);
            System.out.println("Fahrenheit : " + fahren);
            System.out.println("Kelvin     : " + kelv);
            System.out.println("Reamur     : " + ream);
        }
    }
}
