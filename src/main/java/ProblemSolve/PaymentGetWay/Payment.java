/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemSolve.PaymentGetWay;

import java.util.UUID;

/**
 *
 * @author A-11
 */
abstract class Payment {
    
   protected String transaction_id ;
   protected double amount ;

    public Payment(double amount) {
        this.transaction_id = generateTransactionId();
        this.amount = amount;
    }
    
    
    
    
     public String generateTransactionId(){
     
         return "TXN :" + UUID.randomUUID().toString().substring(0, 8).toUpperCase() ;
     
     };
     
    public abstract void precessPayment();
    
    
}
