package com.MuhammadIqbalRasyid.Pertemuan2.Praktikum.Inheritance;

public class DemoInheritance {
    public static void main(String[] args) {
        A superClass = new A();
        B subClass = new B();

        System.out.println("Masukin data ke SuperClass");
        superClass.x = 20;
        superClass.y = 70;
        superClass.printXY();


        System.out.println("Masukin data ke SubClass");
        subClass.x = 23;
        subClass.y = 03;
        subClass.z = 20;
        subClass.printXY();
        subClass.sumValue();

    }
}
