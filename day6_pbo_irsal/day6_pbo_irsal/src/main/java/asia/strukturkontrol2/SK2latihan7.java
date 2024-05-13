/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asia.strukturkontrol2;

/**
 *
 * @author Fredi Irawan
 */
import java.util.Random;
import java.util.Scanner;

public class SK2latihan7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Tuliskan pesan di sini, saya akan tampilkan berulang.");
        System.out.print("Pesan: ");
        String message = keyboard.nextLine();

        // dua baris berikut untuk membuat bilangan random bertipe integer
        Random mesinRandom = new Random();
        int jumlahPengulangan = 1 + mesinRandom.nextInt(11);

        if (jumlahPengulangan > 10) {
            System.out.println("Bilangan random yang didapat terlalu besar.");
            jumlahPengulangan = 5;
        }

        System.out.print("Pesan akan diulang: " + jumlahPengulangan + " kali\n");
        for (int n = 0; n < jumlahPengulangan; n++) {
            System.out.println((n + 1) + ". " + message);
        }
    }
}