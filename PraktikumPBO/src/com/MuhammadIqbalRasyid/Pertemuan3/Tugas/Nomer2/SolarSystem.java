package com.MuhammadIqbalRasyid.Pertemuan3.Tugas.Nomer2;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    List<Planet> planets = new ArrayList<>();
    // Attributes
    private String id;
    private String nama;


    public SolarSystem(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }


    public int getTotalMember() {
        int counter = 0;
        for (Planet planet : planets)
            counter++;
        return counter;
    }


    public List<Planet> getPlanets() {
        return planets;
    }


    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }


    public String getId() {
        return id;
    }


    public String getNama() {
        return nama;
    }


    public void getData() {
        System.out.println("All planets inside " + getNama() + ":");
        for (Planet planet : planets)
            System.out.println("- " + planet.getNamaPlanet());
    }
}
