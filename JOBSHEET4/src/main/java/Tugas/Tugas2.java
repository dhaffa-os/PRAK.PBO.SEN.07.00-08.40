/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author HP
 */
public class Tugas2 {
  public static void main(String[] args){
        int num1 = 10;
        int num2 = 23;
        int num3 = 5;
        
        int nilaiTertinggi = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
        
        System.out.println("number 1 = " + num1);
        System.out.println("number 2 = " + num2);
        System.out.println("number 3 = " + num3);
        System.out.println("Nilai tertingginya adalah angka = " + nilaiTertinggi);
    }
}
