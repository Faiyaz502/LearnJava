/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author A-11
 */
public class GEnerics {
    
    public static void main(String[] args) {
        
        
        //Initialize generics 
        
        Box<Integer> one = new Box<>(); 

// <anything> and the object will be that type 
        
        Box<String> two = new Box<>();
        
        
        //Inputs
        
        one.setValue(20);
        two.setValue("Yo Cool");
        
        System.out.println("One set :"+ one.getValue());
        System.out.println("Two set :"+ two.getValue());
        
        
        // print array 
        
        Integer[] arr = {1,5,8,6,9,7};
        String[] array = {"Java","Python","C#","Kotlin"};
        
        GEnericUtil.printArray(arr);
        GEnericUtil.printArray(array);
        
        ////Calculator
        
       Calculator<Double> doubleCalc = new Calculator<>();
       
        System.out.println("Square : " +doubleCalc.square(5.5));
        
        
      //Generic interface
      
      StringProcess str = new StringProcess();
      
      str.process("Interface : "+"Here We go !!!!");
        System.out.println("Interface : "+str.processData("")); 
        
        
        
        //Wild Card
        
        
        System.out.println("----------------WildCard---------------");
        
        
        List<String> StrList = Arrays.asList("A","B","C");
        List<Integer> StrList2 = Arrays.asList(1,2,3);
        
        WildCardDemo.printList(StrList2);
        WildCardDemo.printList(StrList);
        WildCardDemo.sumList(StrList2);
        
        List<Number> numList = new ArrayList<>();
        
        
        System.out.println("----------------Create a generic Stack---------------");
        
        
        myStack<String> myStack = new myStack<>();
        myStack<Integer> myStack2 = new myStack<>();
        
        myStack.push("Java");
        myStack.push("C#");
        myStack.push("PHP");
        myStack2.push(2);
        myStack2.push(5);
        myStack2.push(7);
       
        
        myStack.pop();
        myStack2.pop();
        
        
        System.out.println("My Stack : "+myStack);
        System.out.println("My Stack2 : "+myStack2);
       
      
      
        
        
        
        
        
        
        
        
        
    }
            
    
}
