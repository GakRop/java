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
public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    System.out.println("Give me the string input");
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a string: ");  
    String string= sc.nextLine();
    string = string.toLowerCase();
        
    System.out.println("Give me the first integer input");
    Scanner n1= new Scanner(System.in);
    System.out.print("Enter an integer: ");  
    int number1 = n1.nextInt();
    
    System.out.println("Give me the second integer input");
    Scanner n2= new Scanner(System.in);
    System.out.print("Enter an integer: ");  
    int number2 = n2.nextInt();
    
    List<Character> chars = new ArrayList<>();
  
        // For each character in the String
        // add it to the List
        for (char ch : string.toCharArray()) {
  
            chars.add(ch);
        }
    
    Palindrome pl = new Palindrome(chars);
    pl.wordSlicer(chars);
    
    
    //int max = Math.min(number1, number2);
    //int GCD = 1;
    GCD gcd = new GCD(number1, number2);
    int GCD = gcd.calculator(number1,number2);
    System.out.println("this is the GCD: "+GCD);
    }
    
}
