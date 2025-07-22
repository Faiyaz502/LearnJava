/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.Collections;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author A-11
 */
public class HAshMap {
    
    public static void main(String[] args) {
        
        
        Map<Integer,String> map = new HashMap<>(); // HashMap accept key:value pair ;
        
        
        
        ////Adding entries
        map.put(1,"Mango");
        map.put(2,"Apple");
        map.put(3,"Banan");
        map.put(4,"Grapes");
        map.put(1,"Orange"); // will not add - hashMap dont accept duplicate keys
        
        ///Get values
        System.out.println("Map values "+map.values());
        // get keys
        System.out.println("Map key "+map.keySet());
        //get value by key
        System.out.println("Map Get Specific(key : 2) : "+map.get(2));
        
        
        System.out.println("Iteration HashMap........");
        
        
        //loop
        
        for (Map.Entry m : map.entrySet()) {
            
            System.out.println(m.getKey() + " "+ m.getValue());
            
        }
        
        System.out.println(map.entrySet());
        
        
        //// remove
        System.out.println("---------------=-Remove------------");
        
        map.remove(4);
        System.out.println("Map : "+map);
        
        
        /// if absence add
        ///
        System.out.println("---------------= /// if absence add");

        map.putIfAbsent(4,"Grapes");
        
        
        ///Size
        ///
        System.out.println("---------------Size------------");
        
        map.size();
        
        
        ///Replace
        
        map.replace(5, "Kiwi");
        
        
        //loop Through key
        
        System.out.println("Keys : "+map.keySet());
        
       
        
        //loop thourgh values
        System.out.println("Keys : "+map.values());
         for (String value : map.values()) {
            
            System.out.println("Access values through loops :"+ value);
            
        }
         
      
        
        
        //clear the whole map
        
        map.clear();
        System.out.println("is empty :"+map.isEmpty());
        //
        
        
        
        
        
        
        
        
        
        
    }
    
}
