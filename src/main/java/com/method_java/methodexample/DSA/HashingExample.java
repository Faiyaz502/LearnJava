/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.swing.text.html.parser.Entity;

/**
 *
 * @author A-11
 */
public class HashingExample {

    public static void main(String[] args) {

        HashMap<String, HashMap<Integer, String>> maps = new HashMap<>();

        maps.put("developer", new HashMap<>());
        maps.put("Sales", new HashMap<>());
        maps.put("Finance", new HashMap<>());

        maps.get("developer").put(1, "Saiful");
        maps.get("Sales").put(2, "Rakib");
        maps.get("Finance").put(3, "Robul");

        

        System.out.println(maps);
    }

}
