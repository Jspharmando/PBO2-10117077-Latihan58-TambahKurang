package com.company;

/**
 * @author
 * NAMA                 : Joseph Armando Carvallo
 * KELAS                : PBO2
 * NIM                  : 10117077
 * Deskripsi Program    : Program penjumlahan dan pengurangan menggunakan inheritance,
 *                        dengan nilai X dan Y ditentukan di konstruktor Bilangan
 **/

public class Bilangan {
    private int x;
    private int y;

    public Bilangan() {
        this.x = 3;
        this.y = 4;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
