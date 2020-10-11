package com.RohmanbenyR.Modul1.constructor;

public class demo_manusia {
    public static void main(String[] args){
        Manusia arrayManusia[] = new Manusia[3];

        Manusia manusia1 = new Manusia();
        manusia1.setNama("Paini");
        manusia1.setUmur(20);

        Manusia manusia2 = new Manusia("Paino");
        Manusia manusia3 = new Manusia("Tejo" , 18);

        arrayManusia[0] = manusia1;
        arrayManusia[1] = manusia2;
        arrayManusia[2] = manusia3;

        for (Manusia x : arrayManusia){
            System.out.println("Character");
            System.out.println("Nama\t: " + x.getNama());
            System.out.println("Umur\t: " + x.getUmur());
        }
    }
}
