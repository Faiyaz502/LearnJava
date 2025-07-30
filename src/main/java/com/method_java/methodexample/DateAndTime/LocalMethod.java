/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.DateAndTime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author A-11
 */
public class LocalMethod {
    
    
    public static void main(String[] args) {
        
        LocalDateTime date = LocalDateTime.of(2025, Month.MARCH, 25, 12, 20);
        
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MMM-dd hh:mm:ss a");
        
        
        System.out.println("Date - "+date.format(formatter));
        
        
        
        System.out.println("Day - "+ date.getDayOfWeek()); 
        
        
        
    }
    
    
    
    
    
}
