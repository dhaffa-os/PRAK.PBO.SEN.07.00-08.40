/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS;

/**
 *
 * @author HP
 */
// Created by 22343041_Dhaffa Noflian
import java.util.Scanner;

public class TGS2_IFELSEIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka (1-10): ");
        int angka = scanner.nextInt();
        scanner.close();

        String kata = "";

        if (angka >= 1 && angka <= 10) {
            if (angka == 1) {
                kata = "Satu";
            } else if (angka == 2) {
                kata = "Dua";
            } else if (angka == 3) {
                kata = "Tiga";
            } else if (angka == 4) {
                kata = "Empat";
            } else if (angka == 5) {
                kata = "Lima";
            } else if (angka == 6) {
                kata = "Enam";
            } else if (angka == 7) {
                kata = "Tujuh";
            } else if (angka == 8) {
                kata = "Delapan";
            } else if (angka == 9) {
                kata = "Sembilan";
            } else if (angka == 10) {
                kata = "Sepuluh";
            }
            System.out.println("Output: " + kata);
        } else {
            System.out.println("Output: Invalid number");
        }
    }
}
