/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.relation;

/**
 *
 * @author A-11
 */
public class Composition {
    
    public static void main(String[] args) {
        
        
        car c = new car();
        
        c.car_start();
        
    }
    
   
    
}


class car {
    
    engine e = new engine();
    
    
    void car_start(){
        
        e.start_engine();
        System.out.println("The Car is starting");
    
    }

    



}


class engine{

    void start_engine(){ 
        System.out.println("The engine is starting");
    }
}