/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class LinkedList {    
    private Node first;
    private Node end;
    
    LinkedList()
    {first = null; 
        end = null;}

    public void addAtStart(int x){
        int loop_times = 3;
        Node temp  = new Node(x);
        if(first == null)
        {first = temp;
        end = temp;
        loop_times = loop_times + 1;}
        
        else
        {
        temp.setNext(end);
        end.setPrev(temp);
        temp.setPrev(first);
        first.setNext(temp);
        first = temp;
        }         
    }
    
    public void printFromStart()
    {Node temp = end;
        int loop_times = 4;
        while(loop_times > 0)    
        {System.out.println(temp.getData());
            temp = temp.getNext();
            loop_times = loop_times - 1;}
    }
    
     public void searchFromStart(int elementToBeSearched)
    {Node temp = first;
        int loop_times = 3;
        while(loop_times != 0)    
        {if (temp.getData() == elementToBeSearched)
            {System.out.println("Found " + elementToBeSearched);
                return;}
            temp = temp.getNext();
            loop_times = loop_times - 1;
        }
        
        System.out.println("Didn't find " + elementToBeSearched);
            
    }
    
    
    public void removeFirstElement(){
    Node temp = first;
    first = temp.getPrev();
    end.setPrev(first);
    first.setNext(end);
    
    
    temp.setNext(null);
    temp.setPrev(null);
    //first = temp.getPrev();
    //end.setPrev(first);
    //first.setNext(end);
    
    printFromStart();
  }
    /*
     
      public void addAtEnd(int x){
       
        Node temp  = new Node(x);
        if(first == null)
        {
            first = temp;
            end = temp;
        }
        else
        {
            temp.setPrev(first);
            first.setNext(temp);
            first = temp;
        }    
           
       
    }
    
     public void printFromEnd()
    {
        Node temp = end;
        
        while(temp !=  null)    
        {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
            
    }
    
   
    public void searchFromEnd(int elementToBeSearched)
    {
        Node temp = end;
        
        while(temp !=  null)    
        {
            if (temp.getData() == elementToBeSearched)
            {
                System.out.println("Found " + elementToBeSearched);
                return;
             }
            temp = temp.getNext();
        }
        
        System.out.println("Didn't find " + elementToBeSearched);
            
    }*/
    
 }