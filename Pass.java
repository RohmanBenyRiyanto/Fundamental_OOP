/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.RohmanbenyR.Modul1.Pass;

//Demo
public class Pass {
    public static void main(String[] args) {
        int nomor1, nomor2;

        TestPass passed;
        passed = new TestPass(50, 100);
        nomor1 = 10;
        nomor2 = 20;

        System.out.println("Nilai sebelum passed by value\t: ");
        System.out.println("Nomor1\t: " + nomor1);
        System.out.println("Nomor2\t: " + nomor2);

        passed.calculatate(nomor1, nomor2);
        System.out.println("Nilai setelah passed by value");
        System.out.println("nomor1\t: " + nomor1);
        System.out.println("nomor2\t: " + nomor2);
        System.out.println();

        //Passed by reference
        System.out.println("Nilai sebelum passed by reference\t: ");
        System.out.println("passed.nomor1\t: " + passed.nomer1);
        System.out.println("passed.nomor2\t: " + passed.nomer2);

        passed.calculate(passed);
        System.out.println("Nilai sesudah passed by reference\t: ");
        System.out.println("passed.nomor1\t: " + passed.nomer1);
        System.out.println("passed.nomor2\t: " + passed.nomer2);
    }
}