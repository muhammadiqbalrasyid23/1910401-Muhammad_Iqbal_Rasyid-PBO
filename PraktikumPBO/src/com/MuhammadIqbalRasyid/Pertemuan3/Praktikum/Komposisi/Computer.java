package com.MuhammadIqbalRasyid.Pertemuan3.Praktikum.Komposisi;

public class Computer {
    private String type;
    private Keyboard keyboard;
    private Mousa mouse;
    private Monitor monitor;
    private CPU cpu;

    public Computer(String type) {
        this.type = type;
    }

    public void addComponent(Keyboard keyboard, Mousa mouse, Monitor monitor, CPU cpu) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
        this.cpu = cpu;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mousa getMouse() {
        return mouse;
    }

    public void setMouse(Mousa mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
}
