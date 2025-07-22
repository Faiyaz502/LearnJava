/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample;

/**
 *
 * @author A-11
 */
public class ObjectAndClass {
    
            int id ;
            String name ;/// variables called properties and methods called behaviour
            double salary ;
    
            
    ObjectAndClass(int id , String name){ // Constructor
    
            this.id = id ;
            this.name = name ; 
    
    }
    
    ObjectAndClass(int id , String name,double salary){ // Constructor
    
            this.id = id ;
            this.name = name ; 
            this.salary = salary;
    
    }
    
    
    public static void main(String[] args) {
        
        ObjectAndClass emp = new ObjectAndClass(1,"fahim");
        ObjectAndClass emp1 = new ObjectAndClass(1,"fahim",10000);
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
}
