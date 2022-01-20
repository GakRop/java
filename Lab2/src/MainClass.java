/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gakroppongi
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create an object of Engineering class here
        
        
        Engineering r = new Engineering (6,7);
        
        Engineering c = new Engineering (7);
        
        c.changeLength(4);
        
        double answer = c.getCircleArea();
        
        r.changeLength(-5);
        
        int secondAnswer = r.getRectArea();
        
        int thirdAnswer = c.getRectArea();
        
        
        if (answer != 0.0)
        {System.out.println("The area of this circle is " + String.valueOf(answer));}
        
        if (secondAnswer != 0)
        {System.out.println("The are of this rectangle is " + String.valueOf(secondAnswer));}
        
        if (thirdAnswer != 0)
        {System.out.println("The are of this rectangle is " + String.valueOf(thirdAnswer));}
        
        
    }
    
}
