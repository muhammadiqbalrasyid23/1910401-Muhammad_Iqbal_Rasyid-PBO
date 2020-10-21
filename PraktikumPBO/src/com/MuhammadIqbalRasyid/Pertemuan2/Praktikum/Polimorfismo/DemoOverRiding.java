package com.MuhammadIqbalRasyid.Pertemuan2.Praktikum.Polimorfismo;

public class DemoOverRiding {
    public static void main(String[] args) {
        X superClass = new X();
        Y subClass = new Y();

        superClass.getValue("Tidur");
        subClass.getValue("Makan");
    }
}
