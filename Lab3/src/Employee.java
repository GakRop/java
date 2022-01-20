/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gakroppongi
 */
// should have a first, last name and ID number
public class Employee {
    public String firstName;
    public String lastName;
    public String ID;
    
    public Employee(String firstName, String lastName, String ID)
    {
    this.firstName = firstName;
    this.lastName = lastName;
    this.ID = ID;
    }
    
    public void employee_profile()
    {
    System.out.println("The employee's name is " + this.firstName + " " + this.lastName 
            + " and the ID number is " + this.ID);
    }
}
