/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemSolve;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author A-11
 */
public class Prob {
    
    public static void main(String[] args) {
//        SumUntilNegetive();
        
     // 
     int[][] array = {
         {1,99,91,11,44},
         {0,10,9,9,11},
         {3,23,21,5,20},
         {13,4,45,66,33},
         {11,0,1,20,56} 
     };
     
     
//     bubbleSort(array);
     
//     maxAndMinNum();
     
//     findPrime();
//    maxAndMinEasy();
    
//    swapewWithBit();
//  sumArr2d();
   factorial();
   
   
   
    
        try {
            
            String name = null ;
            
            name.length();
            
            System.out.println("Name Length :"+ name.length());
            
            
            
        } catch (NullPointerException e) {
            
            System.out.println("The name is Null \n"+e.getMessage());
        }finally{
        
            System.out.println("The Code run Successfully");
        
        }
        
        
    }
    
    
    //-----------------------------------------
    
    static void SumUntilNegetive(){
    
        Scanner sc = new Scanner(System.in);
       int input = 0 ;
       int sum = 0 ;
        
        while (input >= 0) {     
            
            System.out.print("Enter A Number for sum = ");
            
             input = sc.nextInt();
             
             if(input >= 0) sum += input ;
            
        }
        
        System.out.println("Sum = "+sum );
    
    
    }
    
    
    static void bubbleSort(int[][] array){
        
        for (int[] arr : array) {
            
            
            for (int i = 0; i < arr.length   ; i++ ) {
                
                
                for (int j = i+1; j < arr.length; j++) {
                    
                      if(arr[i]> arr[j]){
               
               int temp = arr[i];
               arr[i] = arr[j];
               
               arr[j] = temp ;
                    
                }
             
               
               }
                
            }
        }
    
        
        System.out.println("2D Array : "+ Arrays.deepToString(array));
        
    
    
    }
    
    
    static void maxAndMinNum(){
        
        
        
        int [] arr = new int[3];
        
    
    
            for (int i = 0; i < 3; i++) {
                
                Scanner sc = new Scanner(System.in);
                
                System.out.print("Enter A Number : ");
                int input = sc.nextInt();
                
                
                
                arr[i] = input ;
        
        }
            
            System.out.println("Arr: "+ Arrays.toString(arr));
            
                int max = arr[0];
                int min = arr[0];
            
            
            for (int i = 1; i < arr.length; i++) {
                
                max = arr[i]> max? arr[i]:max ;
                min = arr[i]< min? arr[i]:min ;
            
        }
            
            System.out.println("Max : "+max + " Min : "+min);
    
    
    
    }
    
    static void maxAndMinEasy(){
    
    int min = Integer.MAX_VALUE ;
    int max = Integer.MIN_VALUE ;
    
    Scanner sc = new Scanner(System.in);
    
        for (int i = 0; i < 3; i++) {
            
            int temp = sc.nextInt();
            
            max = max < temp? temp : max ;
            min = min > temp? temp : min ;
            
        }
    
        System.out.println("Highest Number : "+ max);
        System.out.println("Lowest Number : "+ min);
    
    
    
    
    
    
    }
    
    static void findPrime(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number : ");
        
        int num = sc.nextInt();
        
        if(num<=1){
            System.out.println("Enter a Valid Number");
            return ;
        
        }
    
            
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            
            if(num % i == 0){
            
            System.out.println(num+" is not a Prime Number");
             return ;
            } 
            
        }
        System.out.println(num+" is a Prime Number");
        
    
            
    
    
    
    }
    
    static void swapewWithBit(){
    
    int a = 5 ;
    int b = 10 ;
    
    a = a^b;
    b = a^b;
    a = a^b;
    
        System.out.println("a : "+ a +" b : "+ b);
    
    }
    static void find2SqWithBit(int num){
    
    
    
            if(num > 0 && (num &(num-1))== 0){
            
                System.out.println("It is Square of 2 ");
            
            
            }else{
            
             System.out.println("It is not Square of 2 ");
            
            }
    
    
    
    
    
    
    }
    
    static void factorial(){
    
    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number : ");
        
        int num = sc.nextInt();
        
        int factorial = 1 ;
        
        
        for (int i = 2 ; i <= num ; i++) {
            
            
            factorial = factorial * i ;
            
            
            
        }
    
        System.out.println("Factorial : "+ factorial);
    
    
    
    
    
    
    }
    
    static void sumArr2d(){
    
        int[][] array = {
            {1,2},{3,4},{5,6} 
        };
        
        int sum = 0 ;
        
        for (int[] arr : array) {
            
            for (int a : arr) {
                
                sum += a ;
                
            }
            
        }
        System.out.println("Sum : "+ sum);
    
    
    
    }
    
    static void sumArr1d(int[] array){
    
    
   
        
        int sum = 0 ;
        
        for (int arr : array) {
            
           
                
                sum += arr ;
                
           
            
        }
        System.out.println("Sum : "+ sum);
    
    
    }
    
    
    
    
    
}
