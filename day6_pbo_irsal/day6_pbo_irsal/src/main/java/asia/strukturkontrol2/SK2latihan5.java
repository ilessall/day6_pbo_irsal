/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asia.strukturkontrol2;

/**
 *
 * @author Fredi Irawan
 */

import java.util.Scanner;

public class SK2latihan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String respon;

        do {
            System.out.print("Masukkan angka 1 - 7: ");
            int day = input.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Inputan user salah.");
                    break;
            }

            System.out.print("Apakah Anda ingin mengulang program? (y/n) ");
            respon = input.next();

        } while (respon.equalsIgnoreCase("y"));

        System.out.println("Anda telah menghentikan progam.");
    }
}