/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LATIHAN;

/**
 *
 * @author HP
 */
// Created by 22343041_Dhaffa Noflian
public class Latihan4_ElevatorTest {
    public static void main(String[] args) {
        Latihan4_Elevator myElevator = new Latihan4_Elevator(); // Membuat objek Latihan4_Elevator
        
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goUp();
        myElevator.goUp();
        myElevator.goUp();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goDown();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goDown();
        myElevator.setFloor(myElevator.TOP_FLOOR);
        myElevator.openDoor();
        
        // Menampilkan informasi tentang elevator
        System.out.println("Current Floor: " + myElevator.getFloor());
        System.out.println("Is Door Open? " + myElevator.checkDoorStatus());
    }
}
