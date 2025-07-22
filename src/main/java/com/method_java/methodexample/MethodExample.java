/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.method_java.methodexample;

/**
 *
 * @author A-11
 */ //cHapter - 5 (Method)
//public class MethodExample {
//    
//    
//    String name ;
//    int age ;
//
//    public static void main(String[] args) {
//      
////        MethodExample obj = new MethodExample(); // store in new memory location
////      
////        obj.printName();
////           obj.printName("ahmed");
////          obj.printName();
////          
////         MethodExample obj2 = new MethodExample(); // store in new memory location
////          
////          obj2.printName();
////           obj2.printName("rased");
////          obj2.printName();
////     
//      
//    }
//    
//    
//    
//    
//    void printName(){
//        
//        System.out.println("Hello!!!"+ name);
//    }
//    
//   
//    
//    void printName(String nameParam){
//        
//        
//        name = nameParam ;
//        
//        System.out.println("Old name :"+ this.name + "new Name :" + name);
//    }
//    
//    
//    
//     void printAge(int ageParam){
//         
//         age = ageParam ;
//        
//        System.out.println("Age is"+age);
//    }
//    
//    
//}


public class MethodExample {
    String name;
    int age;
   static String address = "Khulan"; // static gives the refrence of it dont make any copy .
    
    void printName() {
        System.out.println("Hello " + name + "!!");
    }
    void printName(String nameParam) {
        name = nameParam;
        System.out.println("Hello " + name + "!!");
    }
    void printAge(int ageParam) {
        age = ageParam;
        System.out.println("Age : " + age+ "!!");
    }
    
    static void printData(){
        
        
  
        System.out.println("Hello"+ address);
    
    }
    
    
    
    
    public static void main(String[] args) {
        MethodExample obj = new MethodExample(); // store in new memory location
        obj.printName(); // null for default value
        obj.printName("Ahmad"); 
        obj.printName(); // ahmed for reassinging
        System.out.println(obj.age);

        MethodExample obj2 = new MethodExample();// store in new memory location
        obj2.printName();
        obj2.printName("Rasel");
        obj2.address = "Dhaka"; // changed in central memory because of static .
        obj.printName();
        
        MethodExample obj3 = new MethodExample();
        obj3.printName();
        obj3.printName("Ahmad");
        obj3.printName();
        obj3.address = "Dhaka";
        System.out.println(obj3.age);
        
        
        
        System.out.println(obj.address); // changed the address because its changed centrally and print that
    }
}
        