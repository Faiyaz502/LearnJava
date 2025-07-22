/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.Abstract.Two;

/**
 *
 * @author A-11
 */
public class Pakna extends Student{

    public static void main(String[] args) {
        
     Student st = new Pakna();
     
     st.good();
     st.bad();
        
        
    }

    @Override
    public void good() {
        System.out.println("Good");
    }

    @Override
    public void bad() {
        System.out.println("Bad");
    }


}
