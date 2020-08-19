package com.alex.bigo;

public class NFactorial {

    public int hi = 0;

    void nFacRuntimeFunc(int n) {
        hi += 1;
        System.out.println("called");
        for (int i = 0; i < n; i++) {
            nFacRuntimeFunc(n - 1);
        }
    }


    public static void main(String[] args) {
        NFactorial nFactorial = new NFactorial();
        nFactorial.nFacRuntimeFunc(4);

    }

}
