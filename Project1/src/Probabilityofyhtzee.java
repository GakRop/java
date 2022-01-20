/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gakroppongi
 */
public class Probabilityofyhtzee {
    public int rolls;
    public int number_of_yahtzee;
    
    public Probabilityofyhtzee(int rolls, int number_of_yahtzee)
    {
    this.rolls = rolls;
    this.number_of_yahtzee = number_of_yahtzee;
    }
    
    double yahtzee_percent = 0;
    
    public double pycalc()
    {    
    if (this.number_of_yahtzee != 0)
    {yahtzee_percent = (double)this.number_of_yahtzee / this.rolls*100;
    return yahtzee_percent;}
    
    else
    {yahtzee_percent = 0;
    return yahtzee_percent;}
    }
}
