package com.company;

/**
 * @author
 * NAMA                 : Joseph Armando Carvallo
 * KELAS                : PBO2
 * NIM                  : 10117077
 * Deskripsi Program    : Program penjumlahan dan pengurangan menggunakan inheritance,
 *                        dengan nilai X dan Y ditentukan di konstruktor Bilangan
 **/

public class JumlahBilangan extends Bilangan {
    public void tampilHasilJumlah() {
        int z = getX() + getY();
        System.out.println("Hasil penjumlahan = " + z);
    }
}
