/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample;

import java.util.Arrays;

/**
 *
 * @author A-11
 */
public class ExamPractice {
    
    public static void main(String[] args) {
        
        int[][] arr = {
            {9,2,8,4},
            {6,7,9,5,1},
            {1,1,9,2,4},
            {1,7,4,6}
        };
        
        sort2D(arr);
        
    }
    
    static void sort2D(int[][] array){
        
        
        
        for (int[] arr : array) {
            
            for (int i = 0; i < arr.length; i++) {
                
                
                for (int j = i+1; j < arr.length; j++) {
                    
                    
                    if(arr[i]>arr[j]){
                    
                        int temp = arr[i];
                        
                        arr[i]= arr[j];
                        
                        arr[j] = temp ;
                    
                    
                    }
                    
                }
                
            }  
        }
        System.out.println(Arrays.deepToString(array)); 
    
    }
    
}
