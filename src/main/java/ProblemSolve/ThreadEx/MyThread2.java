/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemSolve.ThreadEx;

/**
 *
 * @author A-11
 */
public class MyThread2 implements Runnable{

    @Override
    public void run() {
 System.out.println("Runnable is Running : "+ Thread.currentThread().getName());
    }
    
    
    
}
