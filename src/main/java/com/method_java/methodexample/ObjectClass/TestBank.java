/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.ObjectClass;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author A-11
 */
public class TestBank {
    
    public static void main(String[] args) {
        
        
//        
//        BankAccount ac1 = new BankAccount(123548l, 50000.00, "Akib Faiyaz Fahim");
//        BankAccount ac2 = new BankAccount(123549l, 0.00, "Robiul Ahmed");
//        BankAccount ac3 = new BankAccount(123550l, 70000.00, "MD. Saiful");
//        
//        
//        ac1.Withdraw(20000);
//        
//        ac2.deposite(30000);
//        
//        ac1.deposite(2000);
//        
//        ac1.Withdraw(70000);
//        
//        ac1.DisplayBalance();
        
//        
//        Random ran = new Random();
//        
//        for (int i = 0; i < 10; i++) {
//             System.out.println(ran.nextInt(1000));
//        }
//        
//        Date date = new Date();
//        LocalDateTime date2 = LocalDateTime.now();
//        
//        System.out.println(date.getTime());
//        System.out.println(date);
//        System.out.println(date.toString());
//       date.setTime(0);
       
       int[] arr = {2,3,2,4,5,6,3};
        
     
       int [] arr2 = Arrays.stream(arr).distinct().toArray();
        
        System.out.println("Arr " + Arrays.toString(arr2));
        
        
    }
    

    
}
