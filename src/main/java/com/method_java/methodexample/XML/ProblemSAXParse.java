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
public class ProblemSAXParse {
    
    public static void main(String[] args) {
        
         try {
            
            SAXParserFactory factory = SAXParserFactory.newInstance();
            
            SAXParser Saxparser = factory.newSAXParser();
            
            bookHandlerDemo handle = new bookHandlerDemo();
            
            Saxparser.parse("F:\\Java\\XML\\student.xml", handle);
            
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
    }
    
    
    
    
}


class bookHandlerDemo extends DefaultHandler{

boolean name ;
boolean department ;

boolean street ;
boolean city ;
boolean postalCode ;


     @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
       
        
        if(qName.equalsIgnoreCase("student")){
        
            String id = attributes.getValue("id");
            
            System.out.println("ID :"+ id);
        
        
        }else if(qName.equalsIgnoreCase("name")){
            
            name = true;
            
        }else if(qName.equalsIgnoreCase("department")){
            department = true ;
            
        }
        else if(qName.equalsIgnoreCase("street")){
            street = true;
        }else if(qName.equalsIgnoreCase("city")){
            city = true;
        }else if(qName.equalsIgnoreCase("postalCode")){
            postalCode = true;
        }
        
        
        
        
        

    }





    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
       
        
        if(name){
            System.out.println("name : "+ new String(ch,start,length));
            name = false ;
        }else if(department){
            System.out.println("department : "+ new String(ch,start,length));
            department = false ;
        }
        else if(street){
            System.out.println("street : "+ new String(ch,start,length));
            street = false ;
        }
        else if(city){
            System.out.println("city : "+ new String(ch,start,length));
            city = false ;
        }
        else if(postalCode){
            System.out.println("postalCode : "+ new String(ch,start,length));
            postalCode = false ;
        }
        
        
        
        
        
        
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        
        if(qName.equalsIgnoreCase("student")){
        
            System.out.println("--------------------------------");
        
        }
        
    }
}
