/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gakroppongi
 */
public class Probabilityofloser {
    public int rolls;
    public int number_of_loser;
    
    public Probabilityofloser(int rolls, int number_of_loser)
    {
    this.rolls = rolls;
    this.number_of_loser = number_of_loser;
    }
    
    double loser_percent = 0;
    
    public double plcalc()
    {
    if (this.number_of_loser != 0)
    {loser_percent = (double)this.number_of_loser / this.rolls*100;
    return loser_percent;}
    
    else
    {loser_percent = 0;
    return loser_percent;}
    }    
}
