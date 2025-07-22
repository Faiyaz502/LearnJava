/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemSolve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author A-11
 */
public class COllections {
    public static void main(String[] args) {
        
     
       frequencyCount("banana");
        
        int[] arr = {9,5,8,8,4,5,7,9,11,1};
            removeDuplicate(arr); 
            
            
         List<Integer> arr2 =  Arrays.asList(1,3,4,4,5,6,8,3,5,9,11);
         
         System.out.println("Array : "+removeAnyDuplicateGeneric(arr2));  
            
        
        
    }
    
    static boolean isAnagram(String a , String b){
    
    if(a.length() != b.length()){
        return false ;
    
    }
    
            a = "listen";
            b = "silent";
            
        char[] ar = a.toCharArray();
        char[] ar2 = b.toCharArray();
       
        Arrays.sort(ar);
        Arrays.sort(ar2);
        
         System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar2));
        
        System.out.println();
    
    
    return Arrays.equals(ar, ar2) ;
    }
    
    
    static void frequencyCount(String str ){
    
        
        Map <Character,Integer> map = new HashMap<>();
        
       char[] arr = str.toCharArray();
       
        
        
        for (char o : arr) {
           
//            ----1st method---------
//                if(!map.containsKey(o)){
//                   map.put(o, 1);
//                
//                }else{
//                
//                     map.put(o,map.get(o)+1);
//                
//                }

                //------- 2nd method ------------
                
                
                map.put(o,map.getOrDefault(o,0)+1);
                
                map.forEach((k,v) -> System.out.print(" "+k+":"+v)); 
                
                
            System.out.println("");
        }
        
        
        System.out.println(map);
        
        
    
    
    
    }
    
    
    static Set<Integer> removeDuplicate(int[] arr){
        
        
        Set<Integer> array = new HashSet<>();
        
        
        for (int i : arr) {
            
            
            array.add(i);
            
        }
    
       
               System.out.println("Array :"+array);
    
          return array;
    }
    
    
    static <T> List<T> removeAnyDuplicateGeneric(List<T> arr){
    
        
    
     Set<T> set = new HashSet<>(arr);
     
    
        
      return new ArrayList<>(set);
    }
    
}


