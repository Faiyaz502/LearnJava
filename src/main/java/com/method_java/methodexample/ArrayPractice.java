/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author A-11
 */
public class ArrayPractice {
      
    public static void main(String[] args) {
        
        //Array declaration
        
        //1
//        int[] numbers = new int[5]; // declear and initialize
//        
//        
//        
//        int[] arrayy = new int[5];
//        
//        numbers[0] = 57 ; // Assign

//        //2
//        
//        String[] fruits = {"Apple","Banana","mango"}; // Array direct declearation 
//        
//        
//        //3
//            int[] numbers2 ;
//            numbers2 = new int[] {5,2,7};
//        
        
        //4
//        double[] number;
//        number = {1.9,2.9,3.4}; // it will throw a error
        
        

// Intitalize using input 
    
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("Enter 7 number: ");
        
        //with loop
        
//        for(int i=0; i < numbers.length ; i++ ){
//            System.out.println("Number"+(i+1)+ ":");
//            numbers[i] = input.nextInt();
//        }

        //without loop
        
//        int[] numbers3 = new int[8];
//        
//        
//        numbers3[0] = 5;
//        numbers3[1] = 7;
//        numbers3[2] = 6;
//        numbers3[3] = 4;
//        numbers3[4] = 10;
//        numbers3[5] = 7;
//        numbers3[6] = 50;
//        numbers3[7] = 8;
        
        
        
        //print array
//        System.out.print("Array = [");
//        
//        int inx = 0;
//        for(int number : numbers3){
//            
//            
//            if(numbers3[inx] == 6 || numbers3[inx] == 8 || numbers3[inx] == 7){
//                
//                  if(number < numbers3.length -1){
//                 System.out.print(number*100);
//                 }else{
//            System.out.print(number*100 + ",");
//                  }
//                  
//                  
//            }
//            else{
//                
//                
//                  if(number < numbers3.length -1){
//                 System.out.print(number);
//            }else{
//                      
//            System.out.print(number + ",");}
//                
//                
//                
//                }
//            
//            inx++;
//            
//          
//            
////            
//            
//        }
//        System.out.print("]");
//        System.out.println(" ");
        
        
        ///Array avg
        ///
        ///
        ///For i
//    
//           int total = 0 ;
//            for(int num : numbers3){
//                
//               total = total + num;
//                
//            }
//            System.out.println("Total"+total);
//        System.out.println("Avg = "+ total / (numbers3.length));
//        
//        double total2 = 0;
//        
//        for(int i=0 ; i < numbers3.length ; i++){
//            
//            total2 = total2 + numbers3[i]; 
//        }
//             System.out.println("Total = "+total2);
//        System.out.println("Avg = "+ total2 / (numbers3.length));


//String array
        
//        
//        String[] fruits = {"Apple","Banana","Mango","Orange"};
//        
//        for(String fruit : fruits){
//            
//            System.out.print(fruit+",");
//        }
//        
//        System.out.println("  ");
//        
//        
//        for (int i = 0; i < fruits.length; i++) {
//            
//            System.out.print(fruits[i]+"--");
//            
//        }
//        
//        System.out.println(" ");
//        
        
        /// making a copy of a array
        ///
        ///
        
//        
//        int[] original = {2,5,7,1};
//
//            Arrays.sort(original);
//            
//            
//            int[] copy = Arrays.copyOf(original, 2); // end index just
//             int[] copy2 = Arrays.copyOfRange(original, 0,3); // in range
//            
//            
//          System.out.println(Arrays.toString(copy));
//          System.out.println(Arrays.toString(copy2));
//          
//          
//          /// equals array
//          ///
//          int [] another ={1,2,3,5} ;
//          
//          int[] another2 = {1,2,3,5};
//          
//          System.out.println(Arrays.equals(another, another2)); // boolean value
//          
          
       
        ////sort and print array
        
//        Arrays.sort(numbers);
//        
//        
//          System.out.println("Array "+ Arrays.toString(numbers));
//        
//        System.out.println("Array Length - "+numbers.length);
//          System.out.println("Array 0 index - "+numbers[0]);
        
        

    //Non Primitive array
    
//    Integer[] abc = {2,7,6,4,8,3,1,0};
//    
//    Arrays.sort(abc,Collections.reverseOrder());
//    
//        System.out.println(Arrays.toString(abc));
        
        
        
        //reverse array
        
//        int[] oldArray = {2,7,6,4,8,3,1,0};
//        
//        int[] reverseArray = reversing(oldArray);
//        System.out.println("OLD Array");
//        
//         System.out.println(Arrays.toString(oldArray));
//        
//        System.out.println("New Array");
//        
//        System.out.println(Arrays.toString(reverseArray));
        
        
//        
//        int[] array = {1,2,3,2,4,1,5,3,-5,-70,-1};
//        
//        int[] arr2 = sort(array);
//        
//        System.out.println(Arrays.toString(array));
//        
//        System.out.println(Arrays.toString(arr2));
//        
//        Arrays.sort(arr2);
//        
////        Arrays.sort(arr2.clone());
//        
//        
//        System.out.println("partial "+Arrays.toString(array)); // it depends on loaction if we dont use clone after the array
//        


        commaInputSum();
        
    }
    
    
    
    ///------------------------Methods---------------------------------------
    
    
    public static int[] reversing(int[] array){
        
        int [] result = new int[array.length];
    
          for (int i = 0, j = array.length -1 ; i < array.length; i++ , j--) {
              
              result[i] = array[j];
            
        }
  
    
    
        return result;
    }
    
    public static int[] sort(int[] arr){
        
//        int[] array = Arrays.copyOf(arr, arr.length);
    
        
        for (int i = 0; i < arr.length-1 ; i++) {
            
            
            for (int j = i+1; j < arr.length; j++) {
                
                if(arr[i]< arr[j]){
                
                int temp = arr[i];
                arr[i] = arr[j];
                
                arr[j]= temp;
                
                
                }
                
            }
            
            
            
            
        }
        
        
        
        return arr;
    
    
    
    
    }
    
    public static void commaInputSum(){
    
    Scanner sc = new Scanner(System.in);
    
    String input = sc.nextLine();
    String[] arr = input.split(",");
    
        System.out.println("String arr : "+ Arrays.toString(arr));
    int[] arr2 = new int[arr.length];
    int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            
            
            arr2[i] = Integer.parseInt(arr[i]);
            
            sum += arr2[i];
        }
    
    
        System.out.println("Int Array : "+ Arrays.toString(arr2)+"\n Sum = "+sum);
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
}
