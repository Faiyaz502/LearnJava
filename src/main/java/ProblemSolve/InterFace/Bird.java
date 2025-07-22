/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemSolve.InterFace;

/**
 *
 * @author A-11
 */
public class Bird extends Animal implements Flyable{
    

    public Bird(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(getName()+" sounds sweet");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" can fly in the sky");
    }
    
    
    
}
