/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.ObjectClass;

/**
 *
 * @author A-11
 */
public class Car {
    
         String brand;
    String colour;
    int speed ;

    public Car(String colour, String brand, int speed) {
        this.brand = brand;
        this.colour = colour;
        this.speed = speed;
    };
    

    Car(){
    
    
    };
    
    
    
    
    
    public void getName(){
        System.out.println("I am = "+ brand);
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        
        
        Car car1 = new Car("Red","Audi",250);
        Car car2 = new Car("Red","BMW",350);
        Car car3 = new Car("Black","Maclaren",355);
        
        car1.getName(); 
        
        
    }
    
    
    
    
    
    
}
