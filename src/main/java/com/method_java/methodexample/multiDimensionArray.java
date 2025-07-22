/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample;

import java.lang.reflect.Array;
import java.util.*;

/**
 *
 * @author A-11
 */
public class multiDimensionArray {
    
    
    public static void main(String[] args) {
        
        
        int[][] matrix = {
            {3,2,1},
            {4,5,6,8,0},
            {7,8,9,9}
        };
//        System.out.println(Arrays.deepToString(matrix));

//        System.out.println("Matrix sort with for loop");
/////
//        printMatrixFor(matrix);
//        
//        System.out.println("Matrix sort with for Each loop");
//        
//        printMatrixForEach(matrix);


///--------------sort------------------
        
        printMatrixSort(matrix);
        
 ///----------------Copy matrix--------------       
    
 
 
 ///--------------------sum------------------
//        printMatrixSum(matrix);
        
        printMatrixSumFor(matrix);
        
        printMatrixSumSingle(matrix);
        
        printMatrixJuggleSort(matrix.clone());
        
        
    }
    
    
    
    
    ///////////------------------------Methods-----------------------------------
   
    
    
  

    
    public static void printMatrixFor(int[][] matrix){
    
    
          for (int i = 0; i < matrix.length; i++) {
            
            for (int j = 0; j < matrix[i].length; j++) {
                
                System.out.print(matrix[i][j]+" ");
                
            }
            
             System.out.println("");
            
        }
        
    
    
    
    }
    
    
    
    
    
        
    
    public static void printMatrixForEach(int[][] matrix){
        
           for(int[] arr : matrix){
      
          for (int i = 0; i < arr.length; i++) {
              
              
              System.out.print(arr[i]+" ");
              
          }
          
          System.out.println("");
      
      }
    
    
    
    
    
    
    }
    
    
    
    
    
    public static void printMatrixSort(int[][] matrix){
    
        for(int[] arr : matrix){
        
        
            for (int i = 0; i < arr.length -1; i++) {
                
                
                for (int j = i+1; j < arr.length; j++) {
                    
                    
                    if(arr[i]>arr[j]){
                    
                    int temp = arr[i];
                    arr[i] = arr[j];
                    
                    arr[j] = temp ;
                    
                    
                    }
                    
                    
                    
                }
                
            }
            System.out.println(Arrays.toString(arr));
        
        
        }
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    public static int[][] printMatrixJuggleSort(int[][] matrix){
    
        
        /// figureout the whole length
        int total = 0;
        
        for (int[] is : matrix) {
            
            total += is.length;
        }
    
        
        //create new array
        
        
        int[] newArr = new int[total];
        
        
        //add all value from matrix
        
        int k = 0;
        
        
        for (int[] is : matrix) {
            
            for (int i : is) {
                
                newArr[k++]= i;
                
            }
            
        }
        
        System.out.println(Arrays.toString(newArr));
        
        
        
        //Sort the Array
        
        Arrays.sort(newArr);
        
        
        
        /// add to the main matrix sorting values

        int p = 0;
        
        for (int[] is : matrix) {
            
            for (int i = 0; i < is.length; i++) {
                
                is[i]= newArr[p++];
                
            }
        }
        
        System.out.println(Arrays.deepToString(matrix)); // matrix modified with new array we have to use clone in call for avoid 
        // changing the main array
        
        return matrix;
    
    
    
    }
    
    
    
    
    
    
    
    
    
     public static void printMatrixSum(int[][] matrix){
     
     int sum = 0 ;
     
     for(int[] arr : matrix ){
         
         for(int val : arr){
         sum += val ;
         }
     }
     
         System.out.println("Sum = "+ sum);
     
     }
     
     
     
     
     
     
     public static void printMatrixSumFor(int[][] matrix){
     
     int sum = 0 ;
     
              for (int i = 0; i < matrix.length ; i++) {
                  
                  
                  for (int j = 0; j < matrix[i].length; j++) {
                      
                      
                      sum += matrix[i][j];
                      
                  }
                  
                  
              }
     
         System.out.println("Sum = "+ sum);
     
     }
     
     
     
     
     
      
            
      
      
       public static void printMatrixSumSingle(int[][] matrix){
           
           int number = 0;
           
           int sumTotal = 0;
      
           for (int i = 0; i < matrix.length; i++) {
               
               int sum = 0;
          
                    for(int val : matrix[i]){
                    
                    sum += val;
                    
                    sumTotal += val;
      } 
                    
                number++ ;
               System.out.println("Sum of "+number+" array = "+ sum); 
               
           }
           
           System.out.println("Total Sum : "+ sumTotal);
      }
     
     
     
          
          
          
          
          
    
    
    
    
    
    
    
    
    
    
    
    
    
}
