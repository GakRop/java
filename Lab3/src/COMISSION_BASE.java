/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gakroppongi
 */
// should have a base salary
public class COMISSION_BASE extends COMISSIONEMPLOYEE {
    public String salary;
    
    public COMISSION_BASE (String firstName, String lastName, String ID, String rate, String sales, String salary)
    {
    super(firstName, lastName, ID, rate, sales);
    this.salary = salary;
    }
    
    public void comissionbase_profile()
    {
    System.out.println("The employee's name is " + this.firstName + this.lastName
            + " and the ID number is " + this.ID + ". This person worked at "
            + this.rate + " rate, and created " + this.sales 
            + " dollars. The base salary of this employee is " + this.salary);
    }
}
