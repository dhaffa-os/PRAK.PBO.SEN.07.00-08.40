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
  public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String kata1, kata2, kata3;
     
        try {
            System.out.print("Masukkan kata1 : ");
            kata1 = dataIn.readLine();
           
            System.out.print("Masukkan kata2 : ");
            kata2 = dataIn.readLine();
            
            System.out.print("Masukkan kata3 : ");
            kata3 = dataIn.readLine();
            
            System.out.println("\n"+kata1+" "+kata2+" "+kata3);
        }
        
        catch (IOException e) {
            System.out.println("Gagal membaca keyboard");
        }
    }
}
