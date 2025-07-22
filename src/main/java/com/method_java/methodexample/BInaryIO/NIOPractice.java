/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.BInaryIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author A-11
 */
public class NIOPractice {
    
    public static void main(String[] args) {
        
        Path fileOldPath = Paths.get("F:\\Java\\JAVA\\FileoutputStream\\Club.jpg");
        Path fileNewPath = Paths.get("F:\\Java\\JAVA\\FileoutputStream\\test\\test2\\NIO.jpg");
        
        try {
            Files.createDirectories(fileNewPath.getParent());
            Files.copy(fileOldPath, fileNewPath,StandardCopyOption.REPLACE_EXISTING);
            
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        
        
        
    }
    
}
