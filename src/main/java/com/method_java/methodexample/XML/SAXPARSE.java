/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.XML;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author A-11
 */

//----------------------Main method Calling-------------------------
public class SAXPARSE {
    
    public static void main(String[] args) {
        
        
        try {
            
            SAXParserFactory factory = SAXParserFactory.newInstance();
            
            SAXParser Saxparser = factory.newSAXParser();
            
            bookHandler handle = new bookHandler();
            
            Saxparser.parse("F:\\Java\\XML\\librarly.xml", handle);
            
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
}


//---------------------Mechanism--------------------

class bookHandler extends DefaultHandler{

boolean bTitle ;
boolean bAuthor ;
boolean bPrice ;

     @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
       
        
        if(qName.equalsIgnoreCase("Book")){
        
            String id = attributes.getValue("id");
            
            System.out.println("ID :"+ id);
        
        
        }else if(qName.equalsIgnoreCase("title")){
            
            bTitle = true;
            
        }else if(qName.equalsIgnoreCase("author")){
            bAuthor = true ;
            
        }else if(qName.equalsIgnoreCase("price")){
            bPrice = true;
        }
        
        
        
        
        

    }





    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
       
        
        if(bTitle){
            System.out.println("Title : "+ new String(ch,start,length));
            bTitle = false ;
        }else if(bAuthor){
            System.out.println("Author : "+ new String(ch,start,length));
            bAuthor = false ;
        }else if(bPrice){
            System.out.println("Price : "+ new String(ch,start,length));
            bPrice = false ;
        }
        
        
        
        
        
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        
        if(qName.equalsIgnoreCase("book")){
        
            System.out.println("--------------------------------");
        
        }
        
    }

   

    













}
