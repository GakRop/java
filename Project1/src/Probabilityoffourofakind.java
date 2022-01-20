/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gakroppongi
 */
public class Probabilityoffourofakind {
    public int rolls;
    public int number_of_four_of_a_kind;
    
    public Probabilityoffourofakind(int rolls, int number_of_four_of_a_kind)
    {
    this.rolls = rolls;
    this.number_of_four_of_a_kind = number_of_four_of_a_kind;
    }
    
    double four_of_a_kind_percent = 0;
    
    public double p4calc()
    {
    if (this.number_of_four_of_a_kind != 0)
    {four_of_a_kind_percent = (double)this.number_of_four_of_a_kind / this.rolls*100;
    return four_of_a_kind_percent;}
    
    else
    {four_of_a_kind_percent = 0;
    return four_of_a_kind_percent;}
    }
    
}
