/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.TryCatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author A-11
 */
public class TryCatch {
    
    public static void main(String[] args) {
        
//        Calculation(5,0);
        int[] arr = {21,1,3,54,5,3};
        TryCatchExample(10,0);
        
        
   

    
        
        
        
        
        
        
        
        
        
    }
    
    static void Calculation(int a , int b){
    
        
         
        
        System.out.println("Line1");
        
        try { //  won't stop the execution if exception occures
            int result = a/b ;
            System.out.println("Result : "+result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }catch(Exception e){
        
        e.printStackTrace();
        }
    
        System.out.println("Line2");
    
    
    
    
    
    
    }
    
    
    static void TryCatchExample(int a , int b){
    
    //Arithmetic Exception
//     try { 
//            int result = a/b ;
//            
//            System.out.println("Result : "+result); // won't run if got the exception
//            
//        } catch (ArithmeticException e) {
//            
//           System.out.println("Arithmetic Exception : "+e.getMessage());
//           
//        }
    
    //Null Point Exception
        
//    
//        try {
//            String s = null ; 
//// Student s = Null (from DB) use case - object value null can occur exception
//            s.length();
//            
//        } catch (NullPointerException e) {
//            
//            System.out.println("NullPointerException: "+e.getMessage());
//            
//        }
//        
        
        //Array Index Out of Bound  
        
//        try {
//            int[] arr = new int[3];
//            
//            System.out.println(arr[5]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            
//            System.out.println("ArrayIndexOutOfBoundsException : "+ e.getMessage());
//        }
    
      //StringIndexOutofBound 
      
//        try {
//            String str = "Java" ;
//            System.out.println(str.charAt(10));
//        } catch (StringIndexOutOfBoundsException e) {
//            
//            System.out.println("StringIndexOutofBound : "+e.getMessage());
//        } catch(Exception e){
//        
//            System.out.println(e.getMessage());
//        }
//       5. NumberFormateException 

//        try {
//            int x = Integer.parseInt("Abc");
//            System.out.println(x);
//        } catch (NumberFormatException e) {
//            System.out.println("NumberFormateException : "+e.getMessage());
//            System.out.println(e.getStackTrace());
//        }finally{
//            System.out.println("It will Print \"Always\"");
//        
//        }
//        
//        System.out.println("It will not print if cant handle the exception");
    
        // classCastException
//        
//        try {
//            Object obj = new Integer(5); 
//    // if we use .toString method then it will not show any error
//            String s = (String) obj ;
//            
//        } catch (ClassCastException e) {
//            
//            System.out.println("classCastException : "+e.getMessage());
//        }
//       
        
        // 11. IOException 
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader("NoneExist.txt"));
        } catch (IOException e) {
            System.out.println("IOException : "+ e.getMessage());
        }
        
       //Throw -- i throw
       
        try {
            throw new IllegalAccessException("Created Exception by me");
        } catch (IllegalAccessException e) {
            
            System.out.println("IllegalAccessException : "+ e.getMessage());
        }
       
    
    
    }
    
}
