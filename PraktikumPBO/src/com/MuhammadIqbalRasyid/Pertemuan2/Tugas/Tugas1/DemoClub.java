package com.MuhammadIqbalRasyid.Pertemuan2.Tugas.Tugas1;

public class DemoClub {
    public static void main(String[] args) {
        Club club1 = new Club();
        Club club2 = new Club("FC Barcelona");
        Club club3 = new Club("FC Barcelona", "History FCB");
        Club club4 = new Club("FC Barcelona", 1899, "Camp Nou");
        Club club5 = new Club("FC Barcelona", 1899, "Camp Nou", 05, "History FCB");

        club1.getTeam();
        club2.getTeam();
        club3.getTeam();
        club4.getTeam();
        club5.getTeam();
    }
}
