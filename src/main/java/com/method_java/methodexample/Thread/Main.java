/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.Thread;

/**
 *
 * @author A-11
 */
public class Main {

    public static void main(String[] args) {
        ///-----Wiht Thread Class------------- 
        ThreadExample thread1 = new ThreadExample("Upload");
        ThreadExample thread2 = new ThreadExample("Download");

        thread1.start();
        thread2.start();

        //--------With Runnable Class -------------
        Thread tr = new Thread(new RunnableEx("Download"));
        Thread tr2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "Running " + i);
                }
            }
        });

        tr.start();
        tr2.start();

        //---Without any Class-----------
        Thread t = new Thread(() -> {

            System.out.println("Running in " + Thread.currentThread().getName());

        });

        t.start();

        System.out.println("----Main Ends----");

    }

}
