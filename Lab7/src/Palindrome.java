/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gakroppongi
 */
import java.util.*;
public class Palindrome {
    private List chars;
    
    public Palindrome(List chars)
    {
    this.chars = chars;
    }        
    
    public void wordSlicer(List list)
    {
    if(list.get(0) == list.get(list.size()-1))
        {
        list.remove(0);
        list.remove(list.size()-1);
        if (list.size() > 1)
            wordSlicer(list);
        
        else if (list.size() <= 1)
            System.out.println("this is a palindrome");
        }
    
    else if (list.get(0) != list.get(list.size()-1))
        System.out.println("this is not a palindrome");
    }
}
