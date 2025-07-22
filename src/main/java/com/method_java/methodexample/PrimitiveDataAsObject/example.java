/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.PrimitiveDataAsObject;

import java.math.BigDecimal;
import java.math.BigInteger;



/**
 *
 * @author A-11
 */
public class example {
    
    public static void main(String[] args) {
        
        Integer num = 48 ;
        Double num2 = 50.2;
        
        num.parseInt("50",8); // convert 1. value 2. type- binary ,hexadecimal,octal - convert to decimal
        
        System.out.println(num);
        
        
        Long val = num.longValue();
        val = val * 999999999;
        ////
        ///or
        
        Long val2 = (long)num*99999999;
        /// // auto cast long to Long  and covert Integer to long
        ///
        
        
        
        BigInteger a = new BigInteger("13212154665465841654684684684684*9");
        
        BigDecimal b = new BigDecimal(a);
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
}
