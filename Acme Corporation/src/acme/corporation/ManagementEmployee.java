/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.corporation;

/**
 * Class for cration of Management Employee.
 * @author JoséM
 */
public class ManagementEmployee extends Employee {
// The constructors receive only the necessary parameters and properly calls super in the three classes
    
// ... Total constructor 
    ManagementEmployee(String name, Contract contract, int years, Department department) {

        super(name, contract, years, department);
    }
// ... Minimal constructor
    ManagementEmployee(String name, int years) {

        super(name, Contract.INDEFINITE, years, Department.MANAGEMENT);
    }
// ... default constructor
    ManagementEmployee() {
        
    }
// … getSalary method
/**
 * 
 * @return a double with Salary for a Management Emploee
 * base = 40000
 * plus = 6000 * year in company
 */
// The three methods are overwritten and properly return the expected value
    @Override
    public double getSalary() {
        return (40000 + (this.getYears() * 6000));
    }

}
