package com.MuhammadIqbalRasyid.Pertemuan4.Tugas.Nomer1;


public class ComissionEmployee extends SalariedEmployee {
    private int komisi;
    private double totalpenjualan;

    public int getKomisi() {
        return komisi;
    }

    public void setKomisi(int komisi) {
        this.komisi = komisi;
    }

    public double getTotalpenjualan() {
        return totalpenjualan;
    }

    public void setTotalpenjualan(double totalpenjualan) {
        this.totalpenjualan = totalpenjualan;
    }

    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() + lembur * gajiLembur;
    }

    public double getGaji() {
        return super.getGaji() + komisi * totalpenjualan;
    }

    public void lihatInfo() {
        System.out.println("NIP :" + this.getNip());
        System.out.println("Nama :" + this.getNama());
        System.out.println("Golongan :" + this.getGolongan());
        System.out.println("Komisi :" + this.getKomisi());
        System.out.printf("Total Penjualan :%.0f\n", this.getTotalpenjualan());
        System.out.printf("Gaji :%.0f\n", this.getGaji());
    }
}
