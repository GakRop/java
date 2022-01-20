/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author faqee
 */
public class LinkedListMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LinkedList ll = new LinkedList();
       System.out.println("Going to add elements At Start");
       ll.addAtStart(5);
       ll.addAtStart(7);       
       ll.addAtStart(9);
       ll.addAtStart(10);
       //->to "addAtStart" function in LinkedList class
       
       System.out.println("Print the doubly linked list elements");     
       ll.printFromStart(/*loop_times*/);
       
       System.out.println("Search the following elements");  
       ll.searchFromStart(7);
       ll.searchFromStart(1289);
       ll.removeFirstElement();
    }
    
}
