/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gakroppongi
 */
//should have an wage and a number of hours worked
public class HOURLYEMPLOYEE extends Employee {
    public String wage;
    public String hours;
    
    public HOURLYEMPLOYEE (String firstName, String lastName, String ID, String wage, String hours)
    {
    super(firstName, lastName, ID);
    this.wage = wage;
    this.hours = hours;
    }
    
    public void hourlyemployee_profile()
    {
    System.out.println("The employee's name is " + this.firstName + this.lastName
            + " and the ID number is " + this.ID + ". This person worked for "
            + this.hours + " hours at " + this.wage + " dollars.");
    }
    
}
