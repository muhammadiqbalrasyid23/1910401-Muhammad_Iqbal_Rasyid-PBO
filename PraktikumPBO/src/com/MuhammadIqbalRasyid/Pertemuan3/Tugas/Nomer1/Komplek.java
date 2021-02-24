package com.MuhammadIqbalRasyid.Pertemuan3.Tugas.Nomer1;

public class Komplek {
    private String idKomplek;
    private String namaKomplek;
    private int jmlRumah = 0;
    private String[] idRumah = new String[30];

    public Komplek(String idKomplek, String namaKomplek) {
        this.idKomplek = idKomplek;
        this.namaKomplek = namaKomplek;
    }

    public void addRumah(String idRumah) {
        this.idRumah[jmlRumah] = idRumah;
        jmlRumah++;
    }

    public void getDataKomplek() {
        System.out.println("Komplek Perumahan " + getNamaKomplek() + " " + getIdKomplek());
        System.out.println("Daftar Rumah:");
        for (int i = 0; i < jmlRumah; i++)
            System.out.println((i + 1) + ") " + idRumah[i]);
    }

    public String getIdKomplek() {
        return idKomplek;
    }

    public void setIdKomplek(String idKomplek) {
        this.idKomplek = idKomplek;
    }

    public String getNamaKomplek() {
        return namaKomplek;
    }

    public void setNamaKomplek(String namaKomplek) {
        this.namaKomplek = namaKomplek;
    }

    public int getJmlRumah() {
        return jmlRumah;
    }

    public void setJmlRumah(int jmlRumah) {
        this.jmlRumah = jmlRumah;
    }

    public String[] getIdRumah() {
        return idRumah;
    }

    public void setIdRumah(String[] idRumah) {
        this.idRumah = idRumah;
    }
}
