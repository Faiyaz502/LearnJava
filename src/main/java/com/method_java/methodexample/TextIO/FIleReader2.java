/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.TextIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author A-11
 */
public class FIleReader2 {
    
    public static void main(String[] args) {
        
//        try {
//            
//    FileWriter write = new FileWriter("C:\\Users\\A-11\\Desktop\\MyData.txt"); 
//    
//    write.write("Hello Saiful!!\n");
//    write.write("Welcome to Java text I/O");
//    write.close();
//            System.out.println("Written to file Successfully");
//            
//    //Reading from file
//    
//    FileReader reader = new FileReader("C:\\Users\\A-11\\Desktop\\MyData.txt");
//    int Character ;
//            System.out.println("\nReading from file");
//            while((Character = reader.read()) != -1){
//            
//                System.out.print((char) Character);
//            }
//            
//            reader.close();
//            
//        } catch (Exception e) {
//            
//            e.printStackTrace();
//        }



        try {
           FileReader read = new FileReader("C:\\Users\\A-11\\Desktop\\MyData.txt");
           FileWriter write = new FileWriter("C:\\Users\\A-11\\Desktop\\MyData2.txt");
           int Character ;
           
                while((Character = read.read()) != -1){ 
                    write.write((char) Character);
                }
                write.close();
           
            
        } catch (IOException e) {
        }
        
        
        
        
    }
    
}
