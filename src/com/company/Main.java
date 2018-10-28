package com.company;

/**
 * @author
 * NAMA                 : Joseph Armando Carvallo
 * KELAS                : PBO2
 * NIM                  : 10117077
 * Deskripsi Program    : Program penjumlahan dan pengurangan menggunakan inheritance,
 *                        dengan nilai X dan Y ditentukan di konstruktor Bilangan
 **/

public class Main {
    public static void main(String[] args) {
        JumlahBilangan jumlahBil = new JumlahBilangan();
        SelisihBilangan selisihBil = new SelisihBilangan();

        jumlahBil.tampilHasilJumlah();
        selisihBil.tampilHasilSelisih();
    }
}