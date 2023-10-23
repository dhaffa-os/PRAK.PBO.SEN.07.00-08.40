/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LATIHAN;

/**
 *
 * @author HP
 */
public class Latihan3_ArraySample3 {
    public static void main(String[] args) {
        // String Array 4 baris x 2 Kolom
        String[][] dogs = {
            {"Terry", "brown"}, // baris ke 0
            {"Kristin", "white"}, // baris ke 1
            {"Toby", "gray"}, // baris ke 2
            {"Fido", "black"} // baris ke 3
        };
        
        // Mengakses variabel dogs dan mencetak nama dan warna masing-masing anjing
        for (int i = 0; i < dogs.length; i++) {
            System.out.println("Nama anjing: " + dogs[i][0] + ", Warna: " + dogs[i][1]);
        }
    }
}