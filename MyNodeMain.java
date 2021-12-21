
package com.mycompany.dec_20_linkedlist;


public class MyNodeMain {

    /*
    Use Case 1: Create a linked list of 56,30 and 70
    */
    public static void createLinkedList(Integer key1,Integer key2,Integer key3){
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        // check if linked list created
        boolean result = myFirstNode.getNext().equals(mySecondNode) && 
                         mySecondNode.getNext().equals(myThirdNode);
        System.out.println("The linked list with nodes "+ key1+" , "+
                key2+" and "+ key3+ " has been created: "+ result);
    }
    
    public static void main(String []args){
        System.out.println("Welcome to BridgeLabz!");
        System.out.println("Today we shall perform basic operations"
                + "related to linked list.");
        // create a linked list from 56,30 and 70
        createLinkedList(56,30,70);
    }
}
