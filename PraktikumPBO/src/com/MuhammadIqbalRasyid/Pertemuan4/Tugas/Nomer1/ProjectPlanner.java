package com.MuhammadIqbalRasyid.Pertemuan4.Tugas.Nomer1;

public class ProjectPlanner extends SalariedEmployee {

    private int komisi;
    private int totalhasilproyek;
    private ComissionEmployee st[];

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(int komisi) {
        this.komisi = komisi;
    }

    public int getTotalhasilproyek() {
        return totalhasilproyek;
    }

    public void setTotalhasilproyek(int totalhasilproyek) {
        this.totalhasilproyek = totalhasilproyek;
    }

    public void setStaff(ComissionEmployee st[]) {
        this.st = st;
    }

    public void viewStaff() {
        int i;
        System.out.println("——————–");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfo();
        }
        System.out.println("——————–");
    }

    public void lihatInfo() {
        System.out.println("Manager :" + this.getTotalhasilproyek());
        System.out.println("NIP : " + this.getNip());
        System.out.println("Nama :" + this.getNama());
        System.out.println("Golongan :" + this.getGolongan());
        System.out.printf("Komisi :%.0f\n", this.getKomisi());
        System.out.printf("Gaji :%.0f\n", this.getGaji());
        System.out.println("Bagian :" + this.getTotalhasilproyek());
        this.viewStaff();
    }

    public double getGaji() {
        return super.getGaji() + komisi * totalhasilproyek;
    }
}
