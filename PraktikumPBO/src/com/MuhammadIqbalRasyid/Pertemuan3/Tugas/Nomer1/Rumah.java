package com.MuhammadIqbalRasyid.Pertemuan3.Tugas.Nomer1;

public class Rumah {
    private String idRumah;
    private String pemilikRumah;
    private int jumlahOrang;

    // Constructor
    public Rumah(String idRumah, String pemilikRumah, int jumlahOrang) {
        this.idRumah = idRumah;
        this.pemilikRumah = pemilikRumah;
        this.jumlahOrang = jumlahOrang;
    }

    // Returns the ID of the house
    public String getIdRumah() {
        return idRumah;
    }

    // Returns the name of the head of the household
    public String getPemilikRumah() {
        return pemilikRumah;
    }

    // Returns the number of people living in the house
    public int getJumlahOrang() {
        return jumlahOrang;
    }
}
