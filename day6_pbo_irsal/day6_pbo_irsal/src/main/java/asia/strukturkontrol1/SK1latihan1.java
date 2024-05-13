/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asia.strukturkontrol1;

/**
 *
 * @author Fredi Irawan
 */
import java.util.Scanner;

public class SK1latihan1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        System.out.print("How old are you? ");
        age = keyboard.nextInt();
        System.out.println("You are: ");

        if (age < 13) {
            System.out.println("\ttoo young to create a Facebook account");
        }
        if (age < 16) {
            System.out.println("\ttoo young to get a driver's license");
        }
        if (age <= 18) {
            System.out.println("\ttoo young to marry someone");
        }

        if (age < 35) {
            System.out.println("\ttoo young to run for President RI");
            System.out.println("\t\t(How sad!)");
        }

        if (age >= 50) {
            System.out.println("\tAnda sudah setengah baya, hati-hati dengan kulineran");
        }
    }
}
