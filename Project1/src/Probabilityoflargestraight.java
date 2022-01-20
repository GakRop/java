/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gakroppongi
 */
public class Probabilityoflargestraight {
    public int rolls;
    public int number_of_large_straight;
    
    public Probabilityoflargestraight(int rolls, int number_of_large_straight)
    {
    this.rolls = rolls;
    this.number_of_large_straight = number_of_large_straight;
    }
    
    double large_straight_percent = 0;
    
    public double pscalc()
    {
    if (this.number_of_large_straight != 0)
    {large_straight_percent = (double)this.number_of_large_straight / this.rolls*100;
    return large_straight_percent;}
    
    else
    {large_straight_percent = 0;
    return large_straight_percent;}
    }
    
}
