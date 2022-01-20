/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gakroppongi
 */

import java.util.Arrays;
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = {3,7,1,9,4,7,1,6,2,1};
        stepOne(numbers);
        // print the array of numbers
        stepTwo(numbers);
        // print the array in reverse order
        stepThree(numbers);
        // print the largest element of the array
        stepFour(numbers);
        // print the average of the array
        stepFive(numbers);
        // search for a specific number in the array and print it
        stepSix();
        //Create an outcome mentioned in the Word document
        stepSeven(numbers);
        //
        
                
        
    }
    
    public static void stepOne(int[] numbers)
    {
        System.out.println("Part one exceuted");
        for (int i = 0; i < numbers.length; i++)
            {
                System.out.println(numbers[i]);
            }       
    }
    
    public static void stepTwo(int[] numbers)
    {
        System.out.println("\n");
        System.out.println("Part Two exceuted");
        for (int i = numbers.length -1 ; i > -1; i--)
            {
                System.out.println(numbers [i]);
            }                    
    }
    
    public static void stepThree(int[] numbers)
    {
        System.out.println("\n");
        System.out.println("Part three exceuted");
        int a = 0;
                
        for(int i = 0; i < numbers.length; i++)
            {
                if (numbers[i] > a)
                    {
                        a = numbers[i];
                    }
                
            }
        System.out.println("The largest number in the array is " + a);
    }
    
    public static void stepFour(int[] numbers)
    {
        System.out.println("\n");
        System.out.println("Part four exceuted");
        int total  = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            total = total + numbers[i];
        }
        int average = total / numbers.length;
        System.out.println("The average is "+ average);        
    }
    
    public static void stepFive(int[] numbers)
    {
        System.out.println("\n");
        System.out.println("Part five exceuted");
        for (int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] == 7)
                System.out.println("I found the number 7 here!");
        }
    }
    
    public static void stepSix()
    {
        System.out.println("\n");
        System.out.println("Part six exceuted");
        int number = 7;
        while (number > 0)
        {
            String str = "*";
            String repeated = str.repeat(number);
            number = number - 1;
            System.out.println(repeated);
        }
    }
    
    public static void stepSeven(int[] numbers)
    {
        int number = 1;
        System.out.println("\n");
        System.out.println("Part seven exceuted");
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
        {
            if (i < numbers.length-1 && numbers[i] == numbers[i+1])
            {number = number + 1;}
            
            //else if (i == numbers.length && numbers[numbers.length-1] == numbers[numbers.length])
            //{
            //   /System.out.println("The number "+ numbers[numbers.length]+" is in the array 1 times");
            //}
            
            //else if (i == numbers.length && numbers[numbers.length-1] != numbers[numbers.length])
            //{
            //    System.out.println("The number "+ numbers[numbers.length]+" is in the array 1 times");
            //}
            
            else
            {
                System.out.println("The number "+numbers[i]+" is in the array "+ number+" times.");
                number = number - number + 1;
            }
        }
    }
}