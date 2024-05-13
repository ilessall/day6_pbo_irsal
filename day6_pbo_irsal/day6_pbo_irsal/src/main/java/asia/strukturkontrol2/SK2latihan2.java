/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asia.strukturkontrol2;

import java.util.Scanner;

/**
 *
 * @author Fredi Irawan
 */
public class SK2latihan2 {
    public static void main(String[] args) {
        int variabel1 = inputNilaiInteger("variabel1");
        int batasBawah = inputNilaiInteger("batasBawah");
        int batasAtas = inputNilaiInteger("batasAtas");

        if (variabel1 < batasBawah) {
            System.out.println("Variabel1 = " + variabel1 + " kurang dari batasBawah yang bernilai " + batasBawah);
        }

        if ((variabel1 > batasBawah) && (variabel1 < batasAtas)) {
            System.out.println("Variabel1 = " + variabel1 + " berada di antara batasBawah yang bernilai " + batasBawah + " dan batasAtas yang bernilai: " + batasAtas);
        }

        if (variabel1 <= batasBawah || variabel1 >= batasAtas) {
            System.out.println("Variabel 1 nilainya tidak berada di antara batasBawah dan batasAtas");
        }
    }

    static int inputNilaiInteger(String namaVariabel) {
        Scanner inputScanner = new Scanner(System.in);
        int nilaiInput;
        System.out.println("Silakan input nilai untuk variabel " + namaVariabel);
        nilaiInput = inputScanner.nextInt();
        return nilaiInput;
    }
}
