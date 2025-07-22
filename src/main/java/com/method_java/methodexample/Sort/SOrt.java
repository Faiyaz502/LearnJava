/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author A-11
 */
public class SOrt {   
    
    public static void main(String[] args) {
        
         List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 3, 6, 4));
        
        System.out.println("Original List: " + numbers);
        
        List<Integer> sortedList = mergeSort(numbers);
        
        System.out.println("Sorted List: " + sortedList);
        
    }
    
    
    
    
    
    public static List<Integer> mergeSort(List<Integer> arr){
        
    if(arr.size()<= 1){
        
        return arr;  //base case 
    }
    
    int mid = arr.size()/2;
    
    List<Integer> left = mergeSort(arr.subList(0, mid));
    List<Integer> right = mergeSort(arr.subList(mid, arr.size()));
    
    return merge(left,right) ;
    }
    
    public static List<Integer> merge(List<Integer> right , List<Integer> left){
    
        
      int i= 0 ;
      int j = 0 ;
      
      
      List<Integer> mergeMain = new ArrayList<>();
      
      while(left.size() > i && right.size() > j){
          
          
             if(left.get(i)<= right.get(j)){
                    
         mergeMain.add(left.get(i++));
          
      
      }else{
             mergeMain.add(right.get(j++));
             
             }
      }
      
      while(i< left.size()){
      
          mergeMain.add(left.get(i++));
      
      }
      
        while(j< right.size()){
      
          mergeMain.add(right.get(j++));
      
      }
    
    
        return mergeMain;
    
    
    }
    
        
    }
    

