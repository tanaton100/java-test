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
public class Controlleremploy {
    private Employee _employe;
   
    Controlleremploy(Employee employee){
    this._employe =employee;
    }
    public String Display(){
    
    return _employe.getName()+"  "+_employe.getPosition();
    }
    public double GetTax(){
    
    return (_employe.getSalary()*10)/100;
    }
}
