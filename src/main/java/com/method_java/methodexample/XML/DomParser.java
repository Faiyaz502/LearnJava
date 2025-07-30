/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.XML;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author A-11
 */
public class DomParser {

    public static void main(String[] args) {

        try {
            File xmlFile = new File("F:\\Java\\XML\\Employee.xml");
            
            
            if(!xmlFile.exists()){
                System.out.println("File not found");
            
            }

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document doc = builder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList employeeList = doc.getElementsByTagName("employee");

            if (employeeList.getLength() == 0) {

                System.out.println("No employee data found");
                return;
            }

            for (int i = 0; i < employeeList.getLength(); i++) {

                Node empNode = employeeList.item(i);

                if (empNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element employee = (Element) empNode;

                    String id = employee.getAttribute("id");
                    

                   String name = getValue("name", employee);
                   String position = getValue("position", employee);
                   String salary = getValue("salary", employee);
                   
                   
                   /// output
                   System.out.println("Employee ID : "+id);
                   System.out.println("Name : "+name);
                   System.out.println("position : "+position);
                   System.out.println("Salary : "+salary);
                   
                   System.out.println("--------------------------");
                   
                   
                   
                   

                }

            }

        } catch (IOException | ParserConfigurationException | SAXException e) {
        }

    }

    private static String getValue(String tag, Element elm) {

        NodeList nodeList = elm.getElementsByTagName(tag);

        if (nodeList != null && nodeList.getLength() > 0) {

            Node node = nodeList.item(0);

            return node.getTextContent().trim();
        }

        return "None";

    }

}
