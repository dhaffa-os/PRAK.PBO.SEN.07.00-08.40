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

public class TGS1_Scannner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan kata1: ");
        String kata1 = in.nextLine();
        
        System.out.print("Masukkan kata2: ");
        String kata2 = in.nextLine();
        
        System.out.print("Masukkan kata3: ");
        String kata3 = in.nextLine();

        System.out.println("\n "+kata1+" "+kata2+" "+kata3);
    }
}
