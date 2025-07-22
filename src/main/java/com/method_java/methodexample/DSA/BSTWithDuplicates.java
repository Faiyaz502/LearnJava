/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.method_java.methodexample.DSA;

/**
 *
 * @author A-11
 */


class Node {
    
    int key;
    int count;
    Node left, right;
    
    public Node(int key) {
        
        this.key = key;
        count = 1;
        left = right = null;
    }
    
}

public class BSTWithDuplicates {
    
    Node root ;
     
    
    public static void main(String[] args) {
        
        BSTWithDuplicates bst = new BSTWithDuplicates();
       
  
            
       
        
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);
        bst.insert(9);
        bst.insert(2);
        bst.insert(8);
        
       bst.inOrder(bst.root);
        
        
    }
    
    
  public void insert(int key){
    
    
   root = insertRec(root, key);
            
    
    }
    
    
    
    
    
    static Node insertRec(Node root, int key) {
        
        if (root == null) {
            return new Node(key);
        }
        
        if (key < root.key) {
            root.left = insertRec(root.left, key);
            
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
            
        } else {
            root.count++;
            
        }
        
        return root;
        
    }
    
    boolean search(Node node, int key) {
        
        if (node == null) {
            return false;
        }
        
        if (node.key == key) {
            return true;
        }
        
        return key < node.key ? search(node.left, key) : search(node.right, key);
        
    }
    
    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            
            for (int i = 0; i < node.count; i++) {
                
                System.out.println(node.key + " ");
                
            }
            
            inOrder(node.right);
            
        }
        
    }
    
}
