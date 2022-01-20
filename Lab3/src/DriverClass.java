/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gakroppongi
 */
public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee em = new Employee("Gak", "Roppongi", "1234532");
        em.employee_profile();
        
        HOURLYEMPLOYEE he = new HOURLYEMPLOYEE ("Gak", "Roppongi", "1234532", "8", "15");
        he.hourlyemployee_profile();
        
        COMISSIONEMPLOYEE ce = new  COMISSIONEMPLOYEE ("Gak", "Roppongi", "1234532", "10", "10000");
        ce.comissionemployee_profile();
        
        COMISSION_BASE cb = new COMISSION_BASE ("Gak", "Roppongi", "1234532", "10", "10000", "30000");
        cb.comissionbase_profile();
    }
    
}
