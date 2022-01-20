/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gakroppongi
 */
//import java.util.Random;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class DriverClass {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        System.out.println("Removed candidates from being elected");
        
        LinkedList ll = new LinkedList();
        //System.out.println("Add elements\n");
        ll.addAtStart(1);
        ll.addAtStart(2);
        ll.addAtStart(3);
        ll.addAtStart(4);
        ll.addAtStart(5);
        ll.addAtStart(6);
        ll.addAtStart(7);
        ll.addAtStart(8);
        ll.addAtStart(9);
        ll.addAtStart(10);

        int numbers = 10;
        int loop = numbers/2;
        
        ArrayList<Integer> worthyList = new ArrayList<Integer>();

        for (int i = 0; i < loop; i++)
        {
        //System.out.println("\nPrint the doubly linked list elements\n");
        //ll.printFromStart(numbers);
        int worthy = ll.remover(4, 3);
        numbers = numbers - 1;
        
        if (worthy == -1)
            {
            
            }
        
        else
            {   
            System.out.println("\nWorthy candidates");
            ll.printFromStart(2);
            //worthyList.add(worthy);
            
            /*
            LinkedList worthyList = new LinkedList();
            worthyList.addAtStart(worthy);
            worthyList.printFromStart(worthy);
            */
            }
        }
        /*
        System.out.println("\nWorthy candidates");
        for(int i = 0; i > worthyList.size()-1; i++)
        {
        System.out.println(worthyList.get(i));
        }*/
    }    
}