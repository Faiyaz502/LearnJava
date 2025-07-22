/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.BInaryIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author A-11
 */
public class BufferedINputStream {
    
    public static void main(String[] args) {
        
        
            try {
            
                  BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\Java\\JAVA\\FileoutputStream\\Club.jpg"));
                  BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\Java\\JAVA\\FileoutputStream\\test\\test2\\Buffer.jpg"));
                
                byte[] buffer = new byte[4096];
                int bytesReader; 
                
                while((bytesReader = bis.read(buffer)) != -1){
                
                    bos.write(buffer, 0 , bytesReader);
                
                
                }
                System.out.println("File Copied Succesfully using buffer streams");
                
                
                
        } catch (IOException e) {
            
                System.out.println("Error copying file : "+e.getMessage() );
        }
        
        
        
        
        
        
        
    }
    
}
