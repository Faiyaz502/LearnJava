/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.ObjectClass;

/**
 *
 * @author A-11
 */
public class BankAccount {
    
   private Long account_number ;
   private double balance ;
   private String account_holder; 

    public BankAccount(Long account_number, double balance, String account_holder) {
        this.account_number = account_number;
        this.balance = balance;
        this.account_holder = account_holder;
    }
   
   
   public void deposite(double amount){
   
   this.balance = this.balance + amount ;
       System.out.println("Amount $"+amount+" deposited");
   
   }
   
   
   
      public void Withdraw(double amount){
          
         if(amount <= this.balance){
         
         this.balance = this.balance - amount ;
       System.out.println("Amount $"+amount+" Withdrawed");
         
         }else{
         
             System.out.println("Insufficient Balance");
         
         }
   }
      
       public void DisplayBalance(){
           
           System.out.println("The Account Holder : "+ this.account_holder);
       
           System.out.println("Your Account Number is "+ this.account_number);
           
           System.out.println("Your Current Bank Balance is $"+ this.balance);
       
       
       
       }
      
   
   
    
    
}
