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
public class Latihan4_Elevator {
    public boolean doorOpen = false;
    public int currentFloor = 5;
    public final int TOP_FLOOR = 5;
    public final int BOTTOM_FLOOR = 1;
    
    public void openDoor(){
        System.out.println("Opening door.");
        doorOpen = true;
        System.out.println("Door is open.\n");
    }
    
    public void closeDoor() {
        System.out.println("Closing door.");
        doorOpen = false;
        System.out.println("Door is close\n");
    }
    
    public void goUp(){
        System.out.println("Going up one floor.");
        currentFloor++;
        System.out.println("Floor : " + currentFloor);
        System.out.print("\n");
    }
    
    public void goDown() {
        System.out.println("Going down one floor.");
        currentFloor--;
        System.out.println("Floor : " + currentFloor);
        System.out.print("\n");
    }
    
    public void setFloor(int desireFloor) {
        while(currentFloor != desireFloor) {
            if(currentFloor < desireFloor) {
                goUp();
            }
            else {
                goDown();
            }
        }
    }
    
    public int getFloor(){
        return currentFloor;
    }
    
    public boolean checkDoorStatus() {
        return doorOpen;
    }
}