/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemSolve.PaymentGetWay;

import java.awt.BorderLayout;
import java.util.Scanner;





/**
 *
 * @author A-11
 */
public class Main {
    
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      
        System.out.println("Welcome to My Pay $$$$$");
        
        System.out.println("1 - Credit");
        System.out.println("2 - debit");
        System.out.println("3 - UPI");
        System.out.println("4 - Logout");
        
        System.out.print("Enter Payment Method");
        
        int input = sc.nextInt();
        
        System.out.println("Enter Amount");
        
        double pay = sc.nextDouble();
        
        Payment payment = null ;
        
        switch(input) {
    
        case 1 -> payment = new CreditPayment(pay);
        case 2 -> payment = new DebitCardPayment(pay);
        case 3 -> payment = new UPIPayment(pay);
        case 4 -> payment = new CreditPayment(pay);
        default -> {
    
        System.out.println("Invalid Payment Method");
        
    }
    }
        
        payment.precessPayment();
}
        
    
    
    
    
    
    
    
    }
        
        
        
      
        
       
        
        



    

