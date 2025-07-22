package com.method_java.methodexample.Bank;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Faiyaz
 */
public class Bank {
    
   private static double total_fund = 500000;
    
  

    public static void getTotal_fund(){
        
        System.out.println("Total Fund : "+ total_fund);
        
    }
    
    void received(double amount){
    
        total_fund = total_fund + amount ;
    }
    
    void loan_given(double amount){
    
    total_fund = total_fund - amount;
    
    
    }
}
