/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gakroppongi
 */
// should have a commission rate and gross sales
public class COMISSIONEMPLOYEE extends Employee {
    public String rate;
    public String sales;
    
    public COMISSIONEMPLOYEE (String firstName, String lastName, String ID, String rate, String sales)
    {
    super(firstName, lastName, ID);
    this.rate = rate;
    this.sales = sales;
    }
    
    public void comissionemployee_profile()
    {
    System.out.println("The employee's name is " + this.firstName + this.lastName
            + " and the ID number is " + this.ID + ". This person worked at "
            + this.rate + " rate, and created " + this.sales + " dollars.");
    }
}
