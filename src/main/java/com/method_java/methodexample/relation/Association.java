/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.relation;

/**
 *
 * @author A-11
 */
public class Association {
    
    
    public static void main(String[] args) {
        teacher t = new teacher("hamid");
        student s = new student("Fahim");
        t.teach(s);
        
        
        
    }
    
    
    
    
}

class student{

   private String name ;

    public student(String name) {
        this.name = name;
    }
    
    
    public String getname(){
    
        return this.name;
    
    
    }


}


class teacher {

String name ;

    public teacher(String name) {
        this.name = name;
    }
    
    
    void teach(student s){
    
        System.out.println(this.name + " teaches "+ s.getname() );
    
    
    }

}