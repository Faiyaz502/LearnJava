/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemSolve.ThreadEx;

/**
 *
 * @author A-11
 */
public class MyThread extends Thread{
    
  @Override
    public void run() {
        
        System.out.println("Thread is Running : "+ Thread.currentThread().getName());

    } 
    
    
    
}
