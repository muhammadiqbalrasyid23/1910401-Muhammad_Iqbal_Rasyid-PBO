package com.MuhammadIqbalRasyid.Pertemuan1.Praktikum.Method;

public class TestPass {
    int nomer1;
    int nomer2;

    public TestPass(int nomer1, int nomer2) {
        this.nomer1 = nomer1;
        this.nomer2 = nomer2;
    }

    public void calculate(int m, int n) {
        m = m * 10;
        n = n / 2;
    }

    public void calculate(TestPass pass) {
        pass.nomer1 = pass.nomer1 * 10;
        pass.nomer2 = pass.nomer2 / 2;
    }
}
