/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmvc;

/**
 *
 * @author g.tanaton
 */
public class Testmvc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Tanaton");
        emp.setPosition("Programmer");
        emp.setSalary(5000);
        
        Employee emp1 = new Employee();
        emp1.setName("Josh");
        emp1.setPosition("Host");
        emp1.setSalary(40000);
        
        Controlleremploy cemp = new Controlleremploy(emp);
        System.out.println(cemp.Display());
        System.out.println(cemp.GetTax());
        
        Controlleremploy cemp1 = new Controlleremploy(emp1);
        System.out.println(cemp1.Display());
        System.out.println(cemp1.GetTax());
        
    }
    
}
