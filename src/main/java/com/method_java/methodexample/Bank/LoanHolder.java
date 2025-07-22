package com.method_java.methodexample.Bank;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Faiyaz
 */
public class LoanHolder extends Bank{
    
    
   private double loan_amount,total_debt;
    private int loan_id ;
    private String name;
    final double interest_rate = .13 ;
    

    public LoanHolder(double loan_amount, int loan_id, String name) {
        this.loan_amount = loan_amount;
        this.loan_id = loan_id;
        this.name = name;
        this.total_debt = total_debt = loan_amount + loan_amount * interest_rate;
        loan_given(loan_amount);
    }
    
    double interest_amount(){ 
        
        System.out.println("Interest Total Amount : "+loan_amount * interest_rate);
        return loan_amount * interest_rate ;
    }
    
    void pay(double amount){
    
       total_debt = total_debt - amount;
       
        System.out.println(amount+" TK Paid");
        
        received(amount);
    
    }
    
    void payable_amount(){
    
        
        System.out.println("Total Payable Amount is "+ total_debt);
    
    }
    
    
    
  
    
    
    
}
