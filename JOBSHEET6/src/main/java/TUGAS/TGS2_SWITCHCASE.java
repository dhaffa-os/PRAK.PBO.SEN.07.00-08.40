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

public class TGS2_SWITCHCASE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka (1-10): ");
        int angka = scanner.nextInt();
        scanner.close();

        String kata = "";

        switch (angka) {
            case 1:
                kata = "Satu";
                break;
            case 2:
                kata = "Dua";
                break;
            case 3:
                kata = "Tiga";
                break;
            case 4:
                kata = "Empat";
                break;
            case 5:
                kata = "Lima";
                break;
            case 6:
                kata = "Enam";
                break;
            case 7:
                kata = "Tujuh";
                break;
            case 8:
                kata = "Delapan";
                break;
            case 9:
                kata = "Sembilan";
                break;
            case 10:
                kata = "Sepuluh";
                break;
            default:
                kata = "Invalid number";
        }
        
        System.out.println("Output: " + kata);
    }
}

