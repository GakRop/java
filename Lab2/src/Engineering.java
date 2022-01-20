/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gakroppongi
 */
public class Engineering {
    // Properties
    public int length;
    public int width;
    
    // Constructors
    public Engineering (int length)
    {
    this.length = length;
    this.width = 0;
    }
    
    public Engineering (int length, int width)
    {
    this.length = length;
    this.width = width;
    }
    
    // Functionality
    public double getCircleArea()
    { double circleArea = 0;
        if (width == 0)
        {
        circleArea = 3.14 * this.length * this.length;
        }
        if (length == 0 || width != 0)
        {
        System.out.println("This is an invalid value for a circle area!");
        }
    return circleArea;
    }
    
    public int getRectArea()
    { int rectArea = 0;
    if (length == 0 || width == 0)
    {
    System.out.println("This is an invalid value for a rectangle!");
    }
    rectArea = this.length * this.width;
    return rectArea;
    }
    
    public void changeLength(int value)
    {
    this.length = value + this.length;
    }
    
}
