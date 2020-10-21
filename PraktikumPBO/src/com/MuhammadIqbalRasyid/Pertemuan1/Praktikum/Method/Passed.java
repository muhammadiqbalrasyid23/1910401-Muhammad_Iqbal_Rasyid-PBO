package com.MuhammadIqbalRasyid.Pertemuan1.Praktikum.Method;

public class Passed {
    public static void main(String[] args) {
        int nomer1, nomer2;
        TestPass pass;
        pass = new TestPass(50, 100);
        nomer1 = 10;
        nomer2 = 20;

        //passed value
        System.out.println(" nilai sebelum passed by value\t; ");
        System.out.println("Nomer1 = " + nomer1);
        System.out.println("Nomer2 = " + nomer2);


        pass.calculate(nomer1, nomer2);
        System.out.println("nilai sesudah passed by value :");
        System.out.println("Nomer1 = " + nomer1);
        System.out.println("Nomer2 = " + nomer2);

        //passed by reference
        System.out.println("nilai sebelum passed by refenence :");
        System.out.println("Nomer1 = " + pass.nomer1);
        System.out.println("Nomer2 = " + pass.nomer2);

        pass.calculate(pass);
        System.out.println("nilai sesudah passed by reference :");
        System.out.println("Nomer1 = " + pass.nomer1);
        System.out.println("Nomer2 = " + pass.nomer2);

    }
}
