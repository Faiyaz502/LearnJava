/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.relation;

import java.awt.print.Book;

/**
 *
 * @author A-11
 */
public class Aggrigation {
    
    public static void main(String[] args) {
        
        Library l = new Library("ABC");
        
        book b = new book("FDF",l); // book cant be created without the l object ;
        
        
        
        
    }
    
}


class Library{
    
    String library;

    public Library(String library) {
        this.library = library;
    }
//            


}


class book {
    
        String book;
        
       Library library;

    public book(String book, Library library) {
        this.book = book;
        this.library = library;
    }


    





}