
package com.mycompany.dec_20_linkedlist;


public class MyNodeMain {

    /*
    Use Case 1: Create a linked list of 56,30 and 70
    */
    public static void createLinkedList(Integer key1,Integer key2,Integer key3){
        MyNode<Integer> myFirstNode = new MyNode<>(key1);
        MyNode<Integer> mySecondNode = new MyNode<>(key2);
        MyNode<Integer> myThirdNode = new MyNode<>(key3);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        // check if linked list created
        boolean result = myFirstNode.getNext().equals(mySecondNode) && 
                         mySecondNode.getNext().equals(myThirdNode);
        System.out.println("The linked list with nodes "+ key1+" , "+
                key2+" and "+ key3+ " has been created: "+ result);
    }
    /*
    Use Case 2: Create linked list by adding 30 and 56 to 70
                Node with data 70 created first, then 30 is added to head of 70 
                Then 56 is added to head of 30. 56 -> 30 -> 70
    */
    public static void createLinkedListAddingHead(Integer key1,Integer key2,Integer key3){
        MyNode<Integer> myFirstNode = new MyNode<>(key3);
        MyNode<Integer> mySecondNode = new MyNode<>(key2);
        MyNode<Integer> myThirdNode = new MyNode<>(key1);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNodes();

        // check if linked list created
        boolean result = myLinkedList.head.equals(myThirdNode) && 
                         myLinkedList.head.getNext().equals(mySecondNode) &&
                         myLinkedList.tail.equals(myFirstNode) ;
        System.out.println("The linked list with nodes "+ key1+" , "+
                key2+" and "+ key3+ " has been created: "+ result);
    }
    
    /*
    Use Case 3: Create linked list by appending 30 and 70 to 56
                56 -> 30 -> 70
    */
    public static void createLinkedListAppend(Integer key1,Integer key2,Integer key3){
        MyNode<Integer> myFirstNode = new MyNode<>(key1);
        MyNode<Integer> mySecondNode = new MyNode<>(key2);
        MyNode<Integer> myThirdNode = new MyNode<>(key3);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();

        // check if linked list created
        boolean result = myLinkedList.head.equals(myFirstNode) && 
                         myLinkedList.head.getNext().equals(mySecondNode) &&
                         myLinkedList.tail.equals(myThirdNode) ;
        System.out.println("The linked list with nodes "+ key1+" , "+
                key2+" and "+ key3+ " has been created: "+ result);
    }
    /*
    Use Case 4: Insert 30 between 56 and 70
                56 -> 30 -> 70
    */
    public static void insertLinkedListElement(Integer key1,Integer key2,Integer key3){
        MyNode<Integer> myFirstNode = new MyNode<>(key1);
        MyNode<Integer> mySecondNode = new MyNode<>(key2);
        MyNode<Integer> myThirdNode = new MyNode<>(key3);
        MyLinkedList myLinkedList = new MyLinkedList();
        
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        System.out.print("Nodes before insert: ");
        myLinkedList.printMyNodes();
        
        myLinkedList.insert(myFirstNode,mySecondNode);
        System.out.print("Nodes after insert: ");
        myLinkedList.printMyNodes();
        

        // check if linked list created
        boolean result = myLinkedList.head.equals(myFirstNode) && 
                         myLinkedList.head.getNext().equals(mySecondNode) &&
                         myLinkedList.tail.equals(myThirdNode) ;
        System.out.println(key2+" has been inserted in the linked list with nodes "+ key1+
                " and "+ key3+ " : "+ result);
    }
    /*
    Use Case 5: Delete first element in linked list of sequence 56->30->70
    */
    public static void popElementLinkedList(Integer key1,Integer key2,Integer key3){
        MyNode<Integer> myFirstNode = new MyNode<>(key1);
        MyNode<Integer> mySecondNode = new MyNode<>(key2);
        MyNode<Integer> myThirdNode = new MyNode<>(key3);
        MyLinkedList myLinkedList = new MyLinkedList();
        
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        System.out.print("Initial Linked List: ");
        myLinkedList.printMyNodes();
        
        myLinkedList.pop();
        System.out.print("Linked List after popping first element: ");
        myLinkedList.printMyNodes();
        

        // check if linked list popped
        boolean result = myLinkedList.head.equals(mySecondNode) && 
                         myLinkedList.tail.equals(myThirdNode) ;
        System.out.println(key1+" has been popped out from the linked list with nodes "
                + key1+", "+ key2 + " and "+ key3+ " : "+ result);
    }
    
    /*
    Use Case 6: Delete last element in linked list of sequence 56->30->70
    */
    public static void deleteLastElementLinkedList(Integer key1,Integer key2,Integer key3){
        MyNode<Integer> myFirstNode = new MyNode<>(key1);
        MyNode<Integer> mySecondNode = new MyNode<>(key2);
        MyNode<Integer> myThirdNode = new MyNode<>(key3);
        MyLinkedList myLinkedList = new MyLinkedList();
        
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        System.out.print("Initial Linked List: ");
        myLinkedList.printMyNodes();
        
         System.out.println(myLinkedList.popLast());
        System.out.println("Linked List after popping last element: ");
        myLinkedList.printMyNodes();
        
        // check if last element of linked list popped
        boolean result = myLinkedList.head.equals(myFirstNode) && 
                         myLinkedList.tail.equals(mySecondNode) ;
        System.out.println(key3+" has been popped out from the linked list with nodes "
                + key1+", "+ key2 + " and "+ key3+ " : "+ result);
    }
    /*
    Use Case 7: Search element in linked list of sequence 56->30->70
    */
    public static void searchElementLinkedList(Integer search_key,Integer ...args){
        MyLinkedList myLinkedList = new MyLinkedList();
        for (Integer i:args){
          MyNode<Integer> myNode = new MyNode<>(i); 
          myLinkedList.add(myNode);
        }
        MyNode<Integer> mysearchNode = new MyNode<>(search_key);

        System.out.print("Linked List: ");
        myLinkedList.printMyNodes();
        int node_pos = myLinkedList.search(mysearchNode);
        System.out.println("The given element occurs at the following node: "+ node_pos);        
    }
    
    public static void main(String []args){
        System.out.println("Welcome to BridgeLabz!");
        System.out.println("Today we shall perform basic operations"
                + "related to linked list.");
        // Search an element in the linked list
        searchElementLinkedList(65,30,70,88,99,65,56,88);
    }
}