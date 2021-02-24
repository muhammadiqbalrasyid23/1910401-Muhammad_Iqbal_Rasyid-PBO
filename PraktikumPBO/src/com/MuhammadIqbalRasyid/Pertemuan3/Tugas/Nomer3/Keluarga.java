package com.MuhammadIqbalRasyid.Pertemuan3.Tugas.Nomer3;

import java.util.ArrayList;
import java.util.List;

public class Keluarga {
    private List<Anak> anakList = new ArrayList<>();
    private String namaKeluarga;
    private String kotaAsal;
    private Ayah ayah;
    private Ibu ibu;


    public Keluarga(String namaKeluarga, String kotaAsal) {
        this.namaKeluarga = namaKeluarga;
        this.kotaAsal = kotaAsal;
    }


    public String getNamaKeluarga() {
        return namaKeluarga;
    }


    public String getKotaAsal() {
        return kotaAsal;
    }


    public void addAnggotaKeluarga(Ayah ayah, Ibu ibu, List<Anak> anakList) {
        this.ayah = ayah;
        this.ibu = ibu;
        this.anakList = anakList;
    }


    public List<Anak> getAnakList() {
        return anakList;
    }


    public Ayah getAyah() {
        return ayah;
    }


    public Ibu getIbu() {
        return ibu;
    }


    public void getDataKeluarga() {
        System.out.println("Anggota Keluarga " + getNamaKeluarga());
        System.out.println("Asal\t: " + getKotaAsal());
        System.out.println("Ayah\t: " + getAyah().getNamaAyah());
        System.out.println("Ibu\t\t: " + getIbu().getNamaIbu());
        System.out.println("List Anak:");
        for (Anak anak : anakList)
            System.out.println("\t- " + anak.getNamaAnak());
    }
}
