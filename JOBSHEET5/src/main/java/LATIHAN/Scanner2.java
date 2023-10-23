/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LATIHAN;

/**
 *
 * @author HP
 */

//Created by 22343041_Dhaffa Noflian
import java.util.Scanner;

public class Scanner2 {
    public static void main(String args[]){
        float angka1, angka2, jumlah;
        Scanner dataMasuk = new Scanner(System.in);
        
        System.out.print("Masukkan angka ke-1: ");
        angka1 = dataMasuk.nextFloat();
        
        System.out.print("Masukkan angka ke-2: ");
        angka2 = dataMasuk.nextFloat();
        
        jumlah = angka1 + angka2;
        
        System.out.println("Angka ke-1\t: " + angka1);
        System.out.println("Angka ke-2\t: " + angka2);
        System.out.println("Jumlah \t: " + jumlah);
        
       
    }
}
