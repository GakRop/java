/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gakroppongi
 */
public class GCD {
    public int number1;
    public int number2;
    
    public GCD(int number1, int number2)
    {
    this.number1 = number1;
    this.number2 = number2;
    }
    
    public int calculator(int number1,int number2)
    {
    
    int Smaller = Math.min(number1, number2);
    int Greater = Math.max(number1, number2);
    
    int Remainder = Greater % Smaller;
    
    
    if (Remainder == 0)
        {
        return Smaller;
        }
    
    else
        {
        return calculator(Remainder, Smaller);
        }
        
  
    /*int max = Math.min(this.number1, this.number2);
    int remainder1 = this.number1%CD;
    int remainder2 = this.number2%CD;
    
    if (max == CD)
    {System.out.println("The GCD of "+this.number1+" and "+this.number2+" is "+GCD);}
    
    else if (max != 0)        
    {
        if (remainder1 == 0 && remainder2 == 0)
            {
            GCD = CD;
            CD++; 
            System.out.println("this is GCD in recursion: "+GCD);
            calculator(CD, GCD);
            }
    
        else if(remainder1 != 0 || remainder2 != 0)
            {
            CD++;
            System.out.println("this is GCD in recursion: "+GCD);
            calculator(CD, GCD);
            }
    }*/
    }
}
