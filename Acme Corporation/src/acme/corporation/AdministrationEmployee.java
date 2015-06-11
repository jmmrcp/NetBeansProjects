/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.corporation;

/**
 * Class for cration of Administration Employee.
 * ALWAYS: Contract type TEMPORARY.
 *         Salary 18000
 * 
 * @author JoséM
 */
public class AdministrationEmployee extends Employee {
// The constructors receive only the necessary parameters and properly calls super in the three classes

// ... constructor Complete 
    AdministrationEmployee(String name, Contract contract, int years, Department department) {

        super(name, contract, years, department);
    }
// ... constructor Minimal
    AdministrationEmployee(String name) {

        super(name, Contract.TEMPORARY, 0, Department.ADMINISTRATION);
    }
// ... constructor Default
    AdministrationEmployee() {

    }
// ... getSalary method always 18000
// The three methods are overwritten and properly return the expected value
    @Override
    public double getSalary() {
        return 18000;
    }
}
