/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.inheritance;

/**
 *
 * @author A-11
 */
public class Person {
    
    String name  ;
    
    
      public Person() {
        this.name = "sdfsdf";
    }
    

    public Person(String name) {
        this.name = name;
    }

    
    
    void intro(){
    
        System.out.println("My name is "+ name);
    
    }
    
}
