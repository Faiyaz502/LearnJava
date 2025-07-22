/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author A-11
 */
public class COllections {
    
    public static void main(String[] args) {
        
        /// Compare
        
        
        List<StudentForArr> Students = new ArrayList<>();
        
        Students.add(new StudentForArr("saiful",1,25));
        Students.add(new StudentForArr("Hasan",2,22));
        Students.add(new StudentForArr("Nayeem",3,28));
        
        
        //compering with age /id and sort it asending order
        
        
        Collections.sort(Students,(StudentForArr s1 ,StudentForArr s2) -> {
                    
            return Integer.compare(s1.getAge(), s2.getAge());
        
        
        });
        
        System.out.println("Sort with age : "+Students);
        
        //compering with name and sort it asending order
        
        
         Collections.sort(Students,(StudentForArr s1 ,StudentForArr s2) -> { 
                    
            return s1.getName().compareTo(s2.getName()); // swith the s1 and s2 can make a desending 
        
        
        });
        
        
        System.out.println("Sort with Name : "+Students);
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
}
