/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.Encapsulation;

import java.time.LocalDate;

/**
 *
 * @author A-11
 */
public class AccessStudent {
    
    public static void main(String[] args) {
        
        
         Student std1 = new Student();
         
        
         
         
         std1.setAge(26);
         std1.setName("Fahim");
         std1.setId(101);
         std1.setAddress("Malibag");
         std1.setDepartment("Science");
         std1.setDob(LocalDate.now());
         
         
         System.out.println(" Age : "+std1.getAge()+"\n ID : "+std1.getId()+"\n Name: "+std1.getName()+"\n Address: "+std1.getAddress()+"\n Department: "+std1.getDepartment()+"\n Date: "+ std1.getDob());
//         std1.getAge();
//         std1.getId();
//         std1.getName();
//         std1.getDepartment();
//         std1.getDob();
//         std1.getAddress();
//         
        
    }
   
    
    
   
    
}
