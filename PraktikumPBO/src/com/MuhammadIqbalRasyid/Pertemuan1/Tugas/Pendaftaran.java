package com.MuhammadIqbalRasyid.Pertemuan1.Tugas;

import java.io.IOException;
import java.util.Scanner;

public class Pendaftaran {
    public static String bacaString() {
        int karakter;
        String string = "";
        boolean done = false;
        while (!done) {
            try {
                karakter = System.in.read();
                if (karakter < 0 || (char) karakter == '\n')
                    done = true;
                else if (karakter != '\r')
                    string = string + (char) karakter; //mengeksekusi hasil char
            } catch (IOException ioe) { //eksekusi jika ada kesalahan
                System.err.println("Ada Kesalahan Input Data!"); //menampilkan output kesalahan
                done = true;
            }
        }
        return string; //keluar dari fungsi string
    }
}

class registrasi { //nama constructor = nama class
    String nama, asal, prodi;
    int umur;

    registrasi(String x, int y, String z, String a) { //constructor dengan parameter
        nama = x;
        umur = y;
        asal = z;
        prodi = a;
    }

    public static void main(String[] args) {

        char lagi = 'y';
        String input, inputasal, inputprodi; //variable nama dengan type data string
        int input2;

        while (lagi == 'y') {
            Scanner a = new Scanner(System.in);
            try {
                System.out.println("\tPENDAFTARAN  MAHASISWA BARU");
                System.out.println();
                System.out.println("Selamat Datang di Institut Teknologi Telkom Purwokerto");
                System.out.println("Silahkan Isi Formulir Pendaftaran di Bawah ini untuk Mendaftar");
                System.out.print("Nama  \t\t\t\t: ");
                input = a.nextLine();
                System.out.print("Asal Sekolah \t\t: ");
                inputasal = a.nextLine();
                System.out.print("Umur  \t\t\t\t: ");
                input2 = a.nextInt();
                System.out.print("Masukkan Pilihan Prodi \t: ");
                inputprodi = a.next();

                registrasi demoConstructor = new registrasi(input, input2, inputasal, inputprodi);
                //isialisasi dan memanggil nama konstruktor dan membaca parameter
                demoConstructor.pritntData();
            } catch (NumberFormatException nfe) {
                System.err.println("\nAda Kesalahan Input Data");
            }
            System.out.println("\n Apakah Anda Ingin Melakukan Pendaftaran Lagi ?(y/t)");
            String str = Pendaftaran.bacaString();
            lagi = str.charAt(0);
            if (lagi == 'Y') lagi = 'Y';
            if (lagi == 'y') continue;
            else {
                System.out.println("Terima Kasih");
                break;
            }
        }
    }

    void pritntData() {
        System.out.println("KONFIRMASI REGISTRASI");
        System.out.println();
        System.out.println("Nama   \t\t\t\t:" + nama);
        System.out.println("Umur   \t\t\t\t: " + umur);
        System.out.println("Asal Sekolah \t\t: " + asal);
        System.out.println("Pilihan Prodi \t\t: " + prodi);
        System.out.println(nama + ", kamu berhasil melakukan registrasi. Tunggu pengumuman selanjutnya !");
    }
}
