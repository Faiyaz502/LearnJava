/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import javax.xml.namespace.QName;

/**
 *
 * @author A-11
 */
public class ARrayList {
    
    public static void main(String[] args) {
        
        //Initialization
        
        ArrayList<String> language = new ArrayList<>();
        
        language.add("Java");
        language.add("Python");
        language.add("C++");
        System.out.println("Language : "+language);
        
        
        //Add element at Specific index
        
        language.add(0, "C#");
        
        System.out.println("Language Add : "+language);
        
        
        /// Access element
        
        System.out.println("Access Element Index 2 : "+language.get(2));
        
        
        //modify element 
        
        language.set(2,"Go");
        
        System.out.println("After Modify : "+ language);
        
        //Remove element 
        
        language.remove("Go");
        System.out.println("Remove : "+language.remove("Python"));//return boolean if not exists return false
        language.remove(0);
        
        System.out.println("Removed Array : "+ language);
        
        
        //check size 
        
        System.out.println("Size : "+ language.size());
        
        //check contains 
        
        System.out.println("Contains Java : "+language.contains("Java"));
        System.out.println("Contains Python : "+language.contains("Python"));
        
        
        
        // Iterate - For loop 
        System.out.println("------For Loop ----- ");
        
        for (int i = 0; i < language.size(); i++) {
            
            System.out.println("Language : "+language.get(i)+" ");
            
            
        }
        
        // Iterate - For Each
        
         System.out.println("----For Each ---- ");
         
         for (String string : language) {
             
             System.out.println("Language : "+ string);
            
        }
         
         //Iterate -forEach with Lamda 
         
         System.out.println("----For Each Lamda-----");
         
         language.forEach(item -> {
         
             System.out.println("Lang : "+item );
        
          
         });
         
         
         //Sort Array
         
         System.out.println("-------------SOrt array-----------");
         
         Integer[] arr = {4,5,1,7,8,4,3};
         
         ArrayList<Integer> num = new ArrayList<>(Arrays.asList(arr));
         
         num.add(50);
         num.add(-50);
         Collections.sort(num);
         System.out.println("Sorted nums : "+num);
         
         
         //Reverse 
         
         Collections.reverse(num);
         
         System.out.println("Reverse :" + num);
         
         Collections.sort(num,Collections.reverseOrder()); //Sorted reverse
         
         System.out.println("Sort in Reverser Order : "+num);
         
         
         // search (contains)
         
         System.out.println("contains 3 : "+num.contains(3));
         
         
         //Clone ArrayList 
         ArrayList<String> clone = (ArrayList<String>) language.clone(); // have to cast otherwise it will show compline time error
         System.out.println("Clone array : "+clone);
         // Clear list 
         
         System.out.println("Cleared the list :"+clone);
         
         
         
         //Converted to array 
         String[] langArr = language.toArray(new String[0]);
         
         System.out.println("Converted array : "+Arrays.toString(langArr));
         
         
         //Nested ArrayList 
         
         System.out.println("---------------Nested Array--------------");

         ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
         
         ArrayList<Integer> normalArr = new ArrayList<>(Arrays.asList(1,2,3));
         
         matrix.add(normalArr);
         matrix.add(new ArrayList<>(Arrays.asList(4,5,6)));
         matrix.add(new ArrayList<>(Arrays.asList(7,8,9)));
         
         System.out.println("Matrix : "+matrix);
         
         
         
         // Custom Objects in ArrayList
         
         ArrayList<StudentForArr> students = new ArrayList<>();
         
         students.add(new StudentForArr("saiful",1,22));
         students.add(new StudentForArr("Arafat",2,25));
         students.add(new StudentForArr("Taslima",3,28));
        
        
        for (StudentForArr student : students) {
            
            System.out.println("Students : "+student);
            
        }
               
        // Remove all element 
        
        language.clear();
        
        System.out.println("Language After Clear : "+ language);
        
        
        //isEmpty 
        
        System.out.println("Is Empty : "+ language.isEmpty());
        
        
        /// SubList
        
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple","Banana","Orange","Pineapple","Mango"));
        
        List<String> sub = fruits.subList(1, 4);
        
        System.out.println("SubList (1-3) : "+sub);
        
        
        
        //Equals
        
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("A","B","C"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("A","B","C"));
        ArrayList<Integer> list3 = new ArrayList<>(new ArrayList<Integer>(Arrays.asList(1,2,3)));
        
        System.out.println("Are they similar : " + list1.equals(list2));
        
        
        // Stack (LIFO - last in First out)
        
        Stack<String> stack = new Stack<>();
        
        stack.push("A");
        stack.push("B");
        stack.push("C");
        
        System.out.println("Stack :"+ stack);
        
        System.out.println("Stack Peek :"+stack.peek()); 
        System.out.println("Stack Pop :"+stack.pop());
        System.out.println("Stack Peek :"+stack.peek());
        
        
        /// Queue (FIFO- First in first out)
        
        Queue<String> queue = new LinkedList<>();
        
        queue.offer("X"); // add dont get null value
        queue.offer("Y");
        queue.offer("Z");
        
        System.out.println("Queue : "+ queue);
        System.out.println("Queue peek : "+ queue.peek());
        System.out.println("Queue poll : "+ queue.poll());
        System.out.println("Queue : "+ queue);
        
        System.out.println("------------------------------------");
        
        
        // Priority Queue 
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // will get the smallest one first because it sort the array in accending
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder()); // to get the largest one first 
        
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(50);
        pq.add(5);
        // make the values auto sort
        System.out.println("PriorityQueue : "+pq);
        System.out.println("PriorityQueue peek(min) : "+pq.peek());
        System.out.println("PriorityQueue poll (min): "+pq.poll());
        System.out.println("PriorityQueue : "+pq);
        
        
        System.out.println("------------------------------------");
        
        System.out.println("--------------LengthPQ-----------");
        
        PriorityQueue<String> lengthPQ = new PriorityQueue<>(Comparator.comparing(String::length));
        
        lengthPQ.add("Banana");
        lengthPQ.add("Kiwi");
        lengthPQ.add("Apple");
        
        while(!lengthPQ.isEmpty()){
        
        
            System.out.println(lengthPQ.poll());
        }
        
        System.out.println("--------------LengthPQ Desc-----------");
        
        
        
        PriorityQueue<String> longestFirst = new PriorityQueue<>(
        
        (s1,s2) -> Integer.compare(s2.length(), s1.length())
        );
        
        longestFirst.add("Apple");
        longestFirst.add("Kiwi");
        longestFirst.add("Banana");
        longestFirst.add("Avocado");
        
        while (!longestFirst.isEmpty()){
        
            System.out.println(longestFirst.poll());}
        
        
   
        
        
    }
    
}
