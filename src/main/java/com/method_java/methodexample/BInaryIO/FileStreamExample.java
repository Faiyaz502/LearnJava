/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.BInaryIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author A-11
 */
public class FileStreamExample {
    
    public static void main(String[] args) {
        
        
        try {
            
            FileOutputStream fos = new FileOutputStream("F:\\Java\\JAVA\\FileoutputStream\\FileOutput.txt");
            
            byte[] data = {65,66,67,68};
            
            fos.write(data);
            fos.close();
            
            
        } catch (IOException e) {
            
            e.getMessage();
        }finally {
        
        
        }
        
        
        //------------------------------
        
//        
//        try {
//            
//            FileInputStream fis = new FileInputStream("F:\\Java\\JAVA\\FileoutputStream\\Club.jpg");
//            FileOutputStream fid = new FileOutputStream("F:\\Java\\JAVA\\FileoutputStream\\Club2.jpg");
//            
//            
//            int b ;
//            while((b=fis.read()) != -1){
//            
//                System.out.print((char) b);
//                
//                fid.write((char)b);
//               
//            
//            }
//            fis.close();
//             fid.close();
//        } catch (IOException e) {
//            
//            e.getMessage();
//        }
        
        
        //----------------------------------------------------------------
        
          try {
            
            FileInputStream fis = new FileInputStream("F:\\Java\\JAVA\\FileoutputStream\\Club.jpg");
            FileOutputStream fid = new FileOutputStream("F:\\Java\\JAVA\\FileoutputStream\\Club3.jpg");
            
            byte[] buffer = new byte[4096];
            int byteRead; 
            while((byteRead=fis.read(buffer)) != -1){
                
                fid.write(buffer,0 , byteRead);
                
            
            }
            fis.close();
             fid.close();
        } catch (IOException e) {
            
            e.getMessage();
        }
          
          // Input file 
          
          
              try {
                  
                  File input = new File("F:\\Java\\JAVA\\FileoutputStream\\Club.jpg");
                  
                  System.out.println(input.exists());
                  
                  
                  File output = new File("F:\\Java\\JAVA\\FileoutputStream\\test\\test2\\Club5.jpg");
                  
               
                  
                  if(!output.exists()){
                  
                      output.getParentFile().mkdirs();
                      output.createNewFile();
                      
                      
               
                  }
            
            FileInputStream fis = new FileInputStream(input);
            FileOutputStream fid = new FileOutputStream(output);
            
            byte[] buffer = new byte[4096];
            int byteRead; 
            while((byteRead=fis.read(buffer)) != -1){
                
                fid.write(buffer,0 , byteRead);
                
            
            }
            fis.close();
             fid.close();
        } catch (IOException e) {
            
            e.getMessage();
        }
          
          
          
          
          
          
          
          
          
          
          
          
          
          
        
    }
    
}
