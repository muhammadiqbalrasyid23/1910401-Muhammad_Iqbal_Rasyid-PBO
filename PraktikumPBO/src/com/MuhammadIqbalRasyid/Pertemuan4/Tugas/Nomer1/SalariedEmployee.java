package com.MuhammadIqbalRasyid.Pertemuan4.Tugas.Nomer1;

public abstract class SalariedEmployee {
    private String Nama;
    private String Nip;
    private String Golongan;
    private double Gaji;

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public String getNip() {
        return Nip;
    }

    public void setNip(String nip) {
        this.Nip = nip;
    }

    public String getGolongan() {
        return Golongan;
    }

    public void setGolongan(String golongan) {
        this.Golongan = golongan;
        switch (golongan.charAt(0)) {
            case 1:
                this.Gaji = 10000000;
                break;
            case 2:
                this.Gaji = 8000000;
                break;
            case 3:
                this.Gaji = 5000000;
                break;
            case 4:
                this.Gaji = 3000000;
                break;
            case 5:
                this.Gaji = 1000000;
                break;
        }
    }

    public double getGaji() {
        return Gaji;
    }

    public void setGaji(double gaji) {
        this.Gaji = gaji;
    }
}

