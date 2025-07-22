/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.Collections;

/**
 *
 * @author A-11
 */
public class StudentForArr {

  private String name ;
  private int id ;
  private int age ;

    public StudentForArr(String name, Integer id, Integer age) {
        this.name = name;
        this.id = id;
        this.age = age ;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentForArr{" + "name=" + name + ", id=" + id + ", age=" + age + '}';
    }

  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

   
  
    
    
}
