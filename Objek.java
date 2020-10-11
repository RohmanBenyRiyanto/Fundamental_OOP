/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.RohmanbenyR.Modul1.Object;

public class Objek {
    public static void main(String[] args) {

        //Deklarasi object tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Rohman");
        mahasiswaTanpa.setNim(19104060);

        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t: " + mahasiswaTanpa.getNim());

        //Deklarasi object menggunakan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Paimon", 19104061);

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("Nim\t\t: " + mahasiswa.getNim());


    }

}
