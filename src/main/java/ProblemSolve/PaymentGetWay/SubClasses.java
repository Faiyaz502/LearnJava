/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemSolve.PaymentGetWay;

/**
 *
 * @author A-11
 */

    
    
    
    
    
  class CreditPayment extends Payment implements PaymentMethod{

        public CreditPayment(double amount) {
            super(amount);
        }

        @Override
        public void precessPayment() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void authenticateUser() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void completeTransaction(double amount) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
      
  
  
  
  
  
  
  
  
  }  
  
class DebitCardPayment extends Payment implements PaymentMethod{

        public DebitCardPayment(double amount) {
            super(amount);
        }

        @Override
        public void precessPayment() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void authenticateUser() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void completeTransaction(double amount) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }









}

 class UPIPayment extends Payment implements PaymentMethod{

        public UPIPayment(double amount) {
            super(amount);
        }

        @Override
        public void precessPayment() {
            System.out.println("Payment Successfull");
        }

        @Override
        public void authenticateUser() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void completeTransaction(double amount) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }









}
    
    
    
    
    
    
    
