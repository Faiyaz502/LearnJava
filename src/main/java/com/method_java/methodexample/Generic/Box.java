/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.Generic;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 *
 * @author A-11
 */
 ///---------Generic Class------------------
public class Box<T> {
    
    private T value ;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    
}

class GEnericUtil {
    
    ///---------Generic Method------------------

public static <T> void printArray (T[] array ){


    for (T t : array) {
        
        System.out.println("Item : "+ t);
        
    }
    
    System.out.println();





}
}

// Bounded Generics

class Calculator<T extends Number>{

    public double square(T number){
    
        return number.doubleValue() * number.doubleValue();
    }
}


//Generic Interface

interface Processor<T> {
    void process(T input);
    T processData(T input);

}


class StringProcess implements Processor<String>{

    public void process(String input){
    
        System.out.println("Process String : "+ input.toUpperCase());
    
    }

    @Override
    public String processData(String input) {
        
        return "Hello";
        
    }

}

class WildCardDemo {

    public static void printList(List<?>list){
    
        for (Object item : list) {
            
            System.out.println(item);
            
        }
    }

    public static void sumList(List<? extends Number>list){
    
    double sum = 0 ;
        for (Number n : list) {
            
            sum += n.doubleValue() ;
            
        }
            
        System.out.println("Sum : "+sum);
    }
    }


  
    //-------------My Stack Generic -------------
    
    class myStack<T> {
    
        private List<T> element = new ArrayList<>();

    @Override
    public String toString() {
        return "myStack{" + "element=" + element + '}';
    }
        
        
        
        public void push(T item){
        
            element.add(item);
        }
        
        public T pop(){
        
            if(element.isEmpty()){
                
                throw new EmptyStackException();
            
            }
            return element.remove(element.size() -1);
        }
        
        public T peek(){
        
            if(element.isEmpty()){
            throw new EmptyStackException();
            }
            return element.get(element.size()-1);
        }
    
    }
    
    










