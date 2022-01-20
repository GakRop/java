/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gakroppongi
 */
public class Probabilityofthreeofakind {
    public int rolls;
    public int number_of_three_of_a_kind;
    
    public Probabilityofthreeofakind(int rolls, int number_of_three_of_a_kind)
    {
    this.rolls = rolls;
    this.number_of_three_of_a_kind = number_of_three_of_a_kind;
    }
    
    double three_of_a_kind_percent = 0;
    
    public double p3calc()
    {
    if (this.number_of_three_of_a_kind != 0)
    {three_of_a_kind_percent = (double)this.number_of_three_of_a_kind / this.rolls*100;
    return three_of_a_kind_percent;}
    
    else
    {three_of_a_kind_percent = 0;
    return three_of_a_kind_percent;}
    }
    
}
