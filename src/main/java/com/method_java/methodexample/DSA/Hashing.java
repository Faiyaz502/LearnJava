/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.DSA;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author A-11
 */
public class Hashing {
    
    
    

    public static void main(String[] args) {
        String a = "Akib123456";
        String hash = hashing(a, "SHA-256");
        
        
        System.out.println("HashCode : "+hash);
    }
    
    
    
    
    
    public static String hashing(String s,String Algorithm){
         StringBuilder sb = new StringBuilder();
        try {
            MessageDigest ms = MessageDigest.getInstance(Algorithm);
            
            byte[] hash = ms.digest(s.getBytes());
            
           
            
            for (byte b : hash) {
                
                sb.append(String.format("%02x", b));
            }
            
            
            
        } catch (NoSuchAlgorithmException ex) {
           
        }
        
        return sb.toString();
        
    
    }
    
}
