package com.MuhammadIqbalRasyid.Pertemuan3.Tugas.Nomer1;

public class DemoPerumahan {
    public static void main(String[] args) {

        // Komplek constructor
        Komplek komplek = new Komplek("070707", "Akherat");

        // Rumah constructors
        Rumah rumah1 = new Rumah("XxX - 01", "warmad", 4);
        Rumah rumah2 = new Rumah("XxX - 02", "Romlah", 5);
        Rumah rumah3 = new Rumah("XXX - 01", "Musleh", 3);
        Rumah rumah4 = new Rumah("XXX - 02", "Rosid", 2);

        // Associate all 'rumah' objects with the one and only 'komplek' object
        komplek.addRumah(rumah1.getIdRumah());
        komplek.addRumah(rumah2.getIdRumah());
        komplek.addRumah(rumah3.getIdRumah());
        komplek.addRumah(rumah4.getIdRumah());

        // Prints out the final house data
        komplek.getDataKomplek();
    }
}
