/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.corporation;

/**
 * Class for cration of Engineering Employee.
 * @author JoséM
 */
public class EngineeringEmployee extends Employee {
// The constructors receive only the necessary parameters and properly calls super in the three classes
    
// ... constructor Complete with all atributes
    EngineeringEmployee(String name, Contract contract, int years, Department department) {

        super(name, contract, years, department);
    }
// ... Normal constructor    
    EngineeringEmployee(String name,Contract contract,int years) {

        super(name, contract, years, Department.ENGINEERING);
    }
// ... Minimal constructor
    EngineeringEmployee(String name, int years) {

        super(name, Contract.INDEFINITE, years, Department.ENGINEERING);
    }
// ... default constructor
    EngineeringEmployee() {
        
    }
// ... getSalary method
    /**
     * method to calculate Salary
     * @return double with calculated salary for Engineering Employee 
     * base = 25000
     * plus = 2500 for year in company
     */
// The three methods are overwritten and properly return the expected value
    @Override
    public double getSalary() {
        return (25000 + (this.getYears() * 2500));
    }
}
