/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.polymorphism;

/**
 *
 * @author A-11
 */
public class Polymorphism {
    
    
    
    
    public static void main(String[] args) {
        
       String name = "Welcome to Java";
       
       char[] arr = name.toCharArray();
       
        System.out.println(arr);
        
        System.out.println(arr[0]);

        
        
        
        
     
        
    }
    

    
    
    
}

    class Bike{
        
    void run(){
        
        System.out.println("Running bike");}
    
    
    void brand(){
        System.out.println("Brand is like running rocket");
    
    }

    }
    
    
    class Splender extends Bike{
    
    void run(){
        System.out.println("Running Splender");
    
    
    }

    }


    

