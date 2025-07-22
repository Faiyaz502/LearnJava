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
public class ArrayPractice2 {
    
    
    public static void main(String[] args) {
        
        
//        
//        ///Find min and max
//        
        int[] array1 = {5,7,9,8,0,10,7,15,25,1,3,6,22,19,11};
        
        
           int max = array1[0];
            int min = array1[0];
        
        for (int i = 0; i < array1.length; i++) {
            
         
            
            if(max < array1[i]){
                max = array1[i];
            }
            
            if(min > i){
                min = array1[i];
            }
            
        }
        
        System.out.println("Max = "+max+ " min= "+min);
        
        
        
        //Calculate the sum and avg
        
        double sum = 0;
        
        for(int num : array1){
               
            sum = sum + num ;
                
        }
        
        System.out.println("Sum = "+ sum + " AVG = " + sum/array1.length);
        
        
        
           ////Search specific element
   
         int index =  findElement(array1,22);
         
         System.out.println("Index Number of 22 = "+index);
        
        
        // Bubble Sort 
        
        
        for(int i=0 ; i < array1.length; i++ ){
            
            
            for (int j = i+1; j < array1.length ; j++) {
                      
                
                if( array1[j] < array1[i]){
           
               int temp = array1[i] ;
               array1[i] = array1[j];
               
               array1[j] = temp ;
           }
        
            }
        
        
     
        
        }
        
        System.out.println(Arrays.toString(array1));
        
        
        /// Frequency test in array
       
        
        boolean[] test = new boolean[array1.length];
        
        
        
        
        for (int i = 0; i < array1.length; i++) {
            
            if(test[i]== true){
            
            continue;
            } 
            
            
            int count = 1 ;
            
            
            for (int j = i+1 ; j < array1.length; j++) {
               if(array1[i]== array1[j]){
                   count++;
                   test[j] = true ;
                   
               } 
            }
            
            System.out.println(array1[i]+" is "+ count+ "times");
            
            
            
        }
   
        //Reverse 
        
        
        reversing(array1);
        
        reversing2(array1);
        
        reversing4(array1);
        
        
        
        //remove Duplicate
        
       int[] uniqueArr = removeDuplicte(array1);
       
        System.out.println("Unique Array After removing duplicates = "+Arrays.toString( uniqueArr));
        
        
        
        ///2nd largest value
        
        
        int[] arr2 = {1,8,7,9,5,9};
        
        findSecondLargest(arr2);
        
        findSecondLargest2(arr2);
        
 
        
        
          
          
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    public static int findElement(int[] arr , int element){
    
           
        
        
        for (int i = 0; i < arr.length; i++) {
            
            
            if(arr[i]== element)
                return i ;
            
        }
    
    return -1 ;
    
    };
    
    
    
    
    
    
    
    
    
    
    public static void reversing(int[] arr ){
        
        System.out.println("Before Sorting = "+ Arrays.toString(arr));
    
        for (int i = 0,j=arr.length-1; j>i ; i++, j--) {
            
            int temp = arr[i];
            arr[i] = arr[j] ;
            arr[j] = temp ;
            
        }
        System.out.println(Arrays.toString(arr));
    
    }
    
    
    
        public static int[] reversing2(int[] arr ){
        
        System.out.println("Before reverse = "+ Arrays.toString(arr));
        
        
        int[] reverse = new int[arr.length];
        
            for (int i = 0; i < arr.length ; i++) {
                
                 reverse[i] = arr[arr.length-1-i] ;
                
            }
    
   
            
        
        System.out.println("after reverse = "+Arrays.toString(reverse));
        return reverse;
    
    }
        
        
        
        
             public static int[] reversing3(int[] arr ){
        
        System.out.println("Before reverse = "+ Arrays.toString(arr));
        
        
        int[] reverse = new int[arr.length];
        
        int idx = 0;
        
                 for (int i = arr.length; i >= 0 ; i--) {
                     
                     reverse[idx++] = arr[i];
                     
                 }
   
            
        
        System.out.println("after reverse = "+Arrays.toString(reverse));
        return reverse;
    
    }
             
             
             
             
             
                        public static int[] reversing4(int[] arr ){
        
        System.out.println("Before reverse = "+ Arrays.toString(arr));
        
        
       
        
            int left = 0 ;
            int right = arr.length-1 ;
            
            while(left < right){
            
                 int temp = arr[left];
                 arr[left++] = arr[right];
                 arr[right--] = temp ;
                 
                 
            
            
            }
            
        
        System.out.println("after reverse = "+Arrays.toString(arr));
        return arr;
    
    }
    
    
    
   
    
     public static int[] removeDuplicte(int[] arr ){
     
     
     int[] unique = Arrays.stream(arr)
             .distinct()
             .toArray();
     
     
     return unique;
     
     }
     
     
     public static int findSecondLargest(int[] arr){

    int[] mod = Arrays.stream(arr).sorted().distinct().toArray();    
            
            System.out.println("SecondLargest = "+ mod[mod.length-2]);
      return mod[mod.length-2]; 
}
     
     
     
         public static int findSecondLargest2(int[] arr){
             
             int max = Integer.MIN_VALUE ;
             int second = Integer.MIN_VALUE ;
             
             
             for(int num : arr){
             
             
                 if(num > max){
                 
                 second = max ;
                 max = num ;
                 
                 }else if(num > second && num != max){
                 
                 second = num ;
                 }
             
             
             }
             
             if(second == Integer.MIN_VALUE){
                 System.out.println("NO Second largest Founded");
                return 404 ;
             }else{
                 System.out.println("Second Largest = "+ second);
             
             }
             
             return second;
}
   
   
    
}




