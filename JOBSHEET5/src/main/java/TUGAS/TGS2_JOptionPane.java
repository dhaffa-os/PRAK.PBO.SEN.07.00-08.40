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

public class TGS2_JOptionPane {
    public static void main(String[] args) {
        String kata1 = "", kata2 = "", kata3 = "";
        
        kata1 = JOptionPane.showInputDialog("Masukkan kata1 : ");
        kata2 = JOptionPane.showInputDialog("Masukkan kata2 : ");
        kata3 = JOptionPane.showInputDialog("Masukkan kata3 : ");
        
        String msg = kata1 + " " + kata2 + " " + kata3;
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println(kata1 + " " + kata2 + " " + kata3);
    }
}
