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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TGS1_BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Mengambil tiga nilai ujian dari pengguna
        System.out.print("Masukkan nilai ujian pertama: ");
        double nilai1 = Double.parseDouble(reader.readLine());

        System.out.print("Masukkan nilai ujian kedua: ");
        double nilai2 = Double.parseDouble(reader.readLine());

        System.out.print("Masukkan nilai ujian ketiga: ");
        double nilai3 = Double.parseDouble(reader.readLine());

        // Menghitung nilai rata-rata
        double rataRata = (nilai1 + nilai2 + nilai3) / 3;

        // Menampilkan hasil
        System.out.println("Nilai rata-rata: " + rataRata);

        // Menampilkan smiley face atau emotikon sedih berdasarkan nilai rata-rata
        if (rataRata >= 60) {
            System.out.println("\n:-)");
        } else {
            System.out.println("\n:-(");
        }
    }
}
