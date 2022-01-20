/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gakroppongi
 */
public class Probabilityoffullhouse {
    public int rolls;
    public int number_of_full_house;
    
    public Probabilityoffullhouse(int rolls, int number_of_full_house)
    {
    this.rolls = rolls;
    this.number_of_full_house = number_of_full_house;
    }
    
    double full_house_percent = 0;
    
    public double pfcalc()
    {
    if (this.number_of_full_house != 0)
    {full_house_percent = (double)this.number_of_full_house / this.rolls*100;
    return full_house_percent;}
    
    else
    {full_house_percent = 0;
    return full_house_percent;}
    }
    
}
