
package com.mycompany.dec_20_linkedlist;


public interface INode<K extends Comparable> {
    K getKey();
    void setKey(K key);
    
    INode getNext();
    void setNext(INode next);
}
