package com.MuhammadIqbalRasyid.Pertemuan3.Praktikum.Komposisi;

public class DemoComputer {
    public static void main(String[] args) {
        Computer computer = new Computer("Suka Suka Mei-Mei");

        Keyboard keyboard = new Keyboard("PewPew", "Bagus");
        Mousa mouse = new Mousa("Sarasa", "800");
        Monitor monitor = new Monitor("rolex", "24", "16");
        CPU cpu = new CPU("Intel i9", "Nvidia 3070", "16");

        computer.addComponent(keyboard, mouse, monitor, cpu);

        System.out.println("Type Computer : " + computer.getType());
        System.out.println();

        System.out.println("Keyboard\t: ");
        computer.getKeyboard().PrintSpec();

        System.out.println("Mouse\t: ");
        computer.getMouse().PrintSpec();

        System.out.println("Monitor\t: ");
        computer.getMonitor().PrintSpec();

        System.out.println("Cpu\t: ");
        computer.getCpu().PrintSpec();
    }
}
