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
import javax.swing.JOptionPane;

public class TGS1_JOptionPane {
    public static void main(String[] args) {
        // Mengambil tiga nilai ujian dari pengguna menggunakan JOptionPane
        String input1 = JOptionPane.showInputDialog("Masukkan nilai ujian pertama:");
        double nilai1 = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Masukkan nilai ujian kedua:");
        double nilai2 = Double.parseDouble(input2);

        String input3 = JOptionPane.showInputDialog("Masukkan nilai ujian ketiga:");
        double nilai3 = Double.parseDouble(input3);

        // Menghitung nilai rata-rata
        double rataRata = (nilai1 + nilai2 + nilai3) / 3;

        // Membuat pesan untuk ditampilkan dalam JOptionPane
        String pesan = "Nilai rata-rata: " + rataRata;

        // Menambahkan emotikon berdasarkan nilai rata-rata
        if (rataRata >= 60) {
            pesan += "\n:-)";
        } else {
            pesan += "\n:-(";
        }

        // Menampilkan pesan dalam JOptionPane
        JOptionPane.showMessageDialog(null, pesan);
    }
}

