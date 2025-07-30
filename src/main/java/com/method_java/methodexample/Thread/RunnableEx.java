/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.Thread;

/**
 *
 * @author A-11
 */
public class RunnableEx implements Runnable{
    
    private final String taskName ;

    public RunnableEx(String taskName) {
        this.taskName = taskName;
    }
    
    @Override
    public void run(){
         for (int i = 0; i < 11; i++) {
            
            System.out.println(taskName + "-Count : "+ i + "Thread : "+ Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.err.print(e.getMessage());
            }
            
        }
        System.out.println(taskName + "Completed");
    
    }
    
}
