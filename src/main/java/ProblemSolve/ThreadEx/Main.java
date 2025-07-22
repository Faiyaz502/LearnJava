/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemSolve.ThreadEx;

/**
 *
 * @author A-11
 */
public class Main {
    
    public static void main(String[] args) {
        
        
       System.out.println("Current : "+ Thread.currentThread().getName());
       
       
       
        for (int i = 0; i < 50; i++) {
            
            System.out.println("Main : "+ i);
            
        }
        
        
        
        Thread t1 = new Thread(()->{
        
        
            System.out.println("One Thread : "+ Thread.currentThread().getName());
        
        
            for (int i = 0; i < 50; i++) {
                
                System.out.println( Thread.currentThread().getName()+" : "+i);
            }
        
        
        
        
        
        
        });
        
        MyThread t2 = new MyThread();
        
        t1.start();
        t2.start();
        
        
        
        
        
        
    }
    
}
