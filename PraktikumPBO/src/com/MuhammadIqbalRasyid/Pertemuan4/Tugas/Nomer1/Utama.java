package com.MuhammadIqbalRasyid.Pertemuan4.Tugas.Nomer1;

public class Utama {

    public static void main(String[] args) {
        System.out.println("Program Penghitungan Gaji");
        ProjectPlanner man[] = new ProjectPlanner[2];
        ComissionEmployee comissionEmployee1[] = new ComissionEmployee[2];
        ComissionEmployee comissionEmployee2[] = new ComissionEmployee[3];
//pembuatan manager
        man[0] = new ProjectPlanner();
//Bedjo
        man[0].setNama("Tania");
        man[0].setNip("101");
        man[0].setGolongan("1");
        man[0].setKomisi(3000000);
        man[0].setTotalhasilproyek(2);
        man[1] = new ProjectPlanner();
//atika
        man[1].setNama("Noer");
        man[1].setNip("102");
        man[1].setGolongan("1");
        man[1].setKomisi(3000000);
        man[1].setTotalhasilproyek(3);
// staff bedjo
        comissionEmployee1[0] = new ComissionEmployee();
        comissionEmployee1[0].setNama("Wijanarko");
        comissionEmployee1[0].setNip("0003");
        comissionEmployee1[0].setGolongan("2");
        comissionEmployee1[0].setKomisi(20000);
        comissionEmployee1[0].setTotalpenjualan(890);
        //Staff Arko
        comissionEmployee1[1] = new ComissionEmployee();
        comissionEmployee1[1].setNama("Arko");
        comissionEmployee1[1].setNip("0005");
        comissionEmployee1[1].setGolongan("2");
        comissionEmployee1[1].setKomisi(20000);
        comissionEmployee1[1].setTotalpenjualan(700);
        man[0].setStaff(comissionEmployee1);
//staff atika
        comissionEmployee2[0] = new ComissionEmployee();
        comissionEmployee2[0].setNama("Noer");
        comissionEmployee2[0].setNip("0004");
        comissionEmployee2[0].setGolongan("3");
        comissionEmployee2[0].setKomisi(20000);
        comissionEmployee2[0].setTotalpenjualan(500);

        comissionEmployee2[1] = new ComissionEmployee();
        comissionEmployee2[1].setNama("Fachmi");
        comissionEmployee2[1].setNip("0006");
        comissionEmployee2[1].setGolongan("4");
        comissionEmployee2[1].setKomisi(20000);
        comissionEmployee2[1].setTotalpenjualan(1000);

        comissionEmployee2[2] = new ComissionEmployee();
        comissionEmployee2[2].setNama("Rina");
        comissionEmployee2[2].setNip("0007");
        comissionEmployee2[2].setGolongan("3");
        comissionEmployee2[2].setKomisi(20000);
        comissionEmployee2[2].setTotalpenjualan(1000);
        man[1].setStaff(comissionEmployee2);

//cetak informasi dari manager + staffnya
        man[0].lihatInfo();
        man[1].lihatInfo();
    }

}
