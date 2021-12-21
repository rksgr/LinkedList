
package com.mycompany.dec_20_linkedlist;


public class MyLinkedList {
    public INode head;
    public INode tail;
    
    public MyLinkedList(){
        this.head = null;
        this.tail = null;
    }
    
    public void add(INode newNode){
        if (this.tail == null){
            this.tail = newNode;
        }
        if (this.head == null){
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);    // 30 points to 70 (Tail)  
        }
    }
    public void append(INode newNode){
        if (this.head == null){
            this.head = newNode;
        } 
        if (this.tail == null){
            this.tail = newNode;
        }else {
            this.tail.setNext(newNode);
            this.tail = newNode;        // 56 points to 30 (Tail)  
        }
    }
    // New node inserted after previous node
    public void insert(INode prevNode,INode newNode){
       {
        INode tempNode = prevNode.getNext(); // get pointer to next
        prevNode.setNext(newNode);
        newNode.setNext(tempNode); // newnode should point to element which was 
                                    // pointed to by prevnode earlier.
       }
        
    }
    public void printMyNodes(){
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}
