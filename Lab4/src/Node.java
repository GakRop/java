/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Node {
    private int data;
    private Node next;
    private Node prev;
    
    
    // Constructor to intialize/fill data
    public Node(int data)
    { 
        this.data = data;
    }
    
     // set the address of next node
    public void setNext(Node temp) 
    {
        this.next = temp;
    }
    
    // get the address of next node
    public Node getNext()
    {
        return this.next;
    }
    
    
    public Node getPrev()
    {
        return this.prev;
    }
    public void setPrev(Node temp) 
    {
        this.prev = temp;
    }
    
    // to get data of current node
    public int getData()
    {
        return this.data;
    }
}