/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.Recursion;

/**
 *
 * @author A-11
 */
import java.util.HashMap;

public class FibonacciMemoization {

    // HashMap to store previously computed Fibonacci values
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    // Recursive function with memoization
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: F(0) = 0, F(1) = 1
        }

        // Check if result is already computed
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Compute, store in memo, and return
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        System.out.println("n :"+n + " result : "+ result +" ");
        
        
        
        return result;
    }

    public static void main(String[] args) {
        int count = 5; // Number of terms

        System.out.println("Fibonacci Series up to " + count + " terms (with memoization):");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
