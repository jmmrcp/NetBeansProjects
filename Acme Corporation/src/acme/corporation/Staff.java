/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.corporation;
// The code is properly indented and commented.

/**
 *
 * @author JoséM
 */
public class Staff {

    /**
     * NO params.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// ... object array creation
// The array of Employee objects is properly created.
        HumanResources HRAcme;
// ... initialize
        HRAcme = new HumanResources();

// ... Creating OBJECTS   
        HRAcme.employees[0] = new ManagementEmployee("Bill", 9);                                // Why more than ONE Class
        HRAcme.employees[1] = new EngineeringEmployee("Anna", 9);                               // There is not NEW attributes.
        HRAcme.employees[2] = new EngineeringEmployee("John", 5);
        HRAcme.employees[3] = new EngineeringEmployee("Elizabeth", Employee.Contract.TRAINING, 3);
        HRAcme.employees[4] = new EngineeringEmployee("Michael", Employee.Contract.TRAINING, 2);
        HRAcme.employees[5] = new AdministrationEmployee("Albert");
        
// ... print info
// The staff info is displayed as described, using a loop to traverse the array
        HRAcme.HRPrint();

// ... salary calculation and printing
// Department and total salaries are correctly calculated and printed
        
        double[] DepartmentTotalSalary;
        DepartmentTotalSalary = HRAcme.DepartmentSalary();
        HRAcme.PrintDepartmentSalary(DepartmentTotalSalary);
    }
}
