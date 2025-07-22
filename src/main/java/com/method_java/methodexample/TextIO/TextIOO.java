/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.TextIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author A-11
 */
public class TextIOO {
    
    
    public static void main(String[] args) {
        
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.print("Enter Your Name : ");
//        
//        String name = sc.nextLine();
//        
//        System.out.print("Enter your Age : ");
//        
//        int age = sc.nextInt();
//        
//        /// Output to file
//        
//        try {
//            PrintWriter writer = new PrintWriter("C:\\Users\\A-11\\Desktop\\MyData.txt");
//            
//            
//            writer.println("User Information  ");
//            writer.println("Name : "+name);
//            writer.println("Age : "+age);
//            
//            writer.close();
//            
//            System.out.println("Data has been written to output.txt");
//            
//            
//            
//        } catch (FileNotFoundException e) {
//            System.out.println("Error writing to file : "+ e.getMessage());
//        }
//        
//        
            
//                -----Read-------------

      
        
        try {
              File file = new File("C:\\Users\\A-11\\Desktop\\MyData.tx");
            Scanner fileScanner = new Scanner(file);
            
            System.out.println("\nReading form output.txt: ");
            
            while(fileScanner.hasNextLine()){
            
                System.out.println(fileScanner.nextLine());
            
            }
            
            fileScanner.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TextIOO.class.getName()).log(Level.SEVERE, null, ex);
        }
       



    }
    
    
}
