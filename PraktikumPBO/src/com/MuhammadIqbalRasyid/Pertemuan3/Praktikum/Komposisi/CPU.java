package com.MuhammadIqbalRasyid.Pertemuan3.Praktikum.Komposisi;

public class CPU {
    private String processor;
    private String gpu;
    private String ram;

    public CPU(String processor, String gpu, String ram) {
        this.processor = processor;
        this.gpu = gpu;
        this.ram = ram;
    }

    public void PrintSpec() {
        System.out.println("- Processor\t: " + processor);
        System.out.println("- GPU\t: " + gpu);
        System.out.println("- RAM\t\t: " + ram + " GB ");
        System.out.println();
    }
}
