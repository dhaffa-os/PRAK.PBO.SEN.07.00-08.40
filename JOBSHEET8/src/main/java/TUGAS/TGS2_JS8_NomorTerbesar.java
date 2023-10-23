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

public class TGS2_JS8_NomorTerbesar {
    public static void main(String[] args) {
        int jumlahNomor = 10;
        double[] nomor = new double[jumlahNomor];

        // Mengambil input dari pengguna dan menyimpannya dalam array
        for (int i = 0; i < jumlahNomor; i++) {
            String input = JOptionPane.showInputDialog("Masukkan nomor ke-" + (i + 1));
            nomor[i] = Double.parseDouble(input);
        }

        // Mencari nomor terbesar dalam array
        double nomorTerbesar = nomor[0];
        for (int i = 1; i < jumlahNomor; i++) {
            if (nomor[i] > nomorTerbesar) {
                nomorTerbesar = nomor[i];
            }
        }

        // Menampilkan nomor terbesar kepada pengguna
        JOptionPane.showMessageDialog(null, "Nomor terbesar adalah: " + nomorTerbesar);
    }
}
