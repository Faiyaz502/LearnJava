/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author A-11
 */
public class ThreadPoolEx {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.submit(() -> {

                for (int j = 1; j <= 10; j++) {

                    System.out.println("Thread No : " + taskId + "COunt : " + j + Thread.currentThread().getName());
                }

                try {

                    if (taskId == 2 || taskId == 3) {

                        Thread.sleep(3000);

                    } else {

                        Thread.sleep(1000);
                    }

                } catch (InterruptedException e) {

                    System.out.println(e.getMessage());
                }

            });

        }

    }

}
