/*
 * Copyright (c) 2020.This code was written by Rohman Beny R (19104060)
 */

package com.RohmanbenyR.Modul1.Object;

public class Mahasiswa {
    String nama;
    int nim;

    //Constructor
    public Mahasiswa(){}

    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    //Geter and Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
}
