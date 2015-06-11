/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.corporation;

/**
 * Generic class for OBJECTs Employees
 *
 * @author JoséM
 */
public abstract class Employee implements Employed {

// ... contract types (constants) -> Not used Defining with ENUMs  
    
    
// ... attributes
// All attributes are private and have the correct type.
    
    private String name;
    Contract contract;          // Type ENUM -> Contract.java -> The three constants are correctly defined and used along the code.
    private int years;
    Department department;      // Type ENUM -> Department.java -> The three constants are correctly defined and used along the code.

// ... constructor Complete with all atributes.
// The constructor receives the four values and initializes the attributes calling to the access methods.
    
    Employee(String name, Contract contract, int years, Department department) {
        this.name = name;
        this.contract = contract;
        this.years = years;
        this.department = department;
    }
// ... constructor Minimal 

    Employee(String name, int years) {
        this.name = name;
        this.years = years;
    }
// ... Default constructor.

    Employee() {
    }
// … getters
// All getters are ok
    
    /**
     *
     * @return String with name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return contract type
     */
    public Contract getContract() {
        return contract;
    }

    /**
     *
     * @return int with years in company
     */
    public int getYears() {
        return years;
    }

    /**
     *
     * @return Department
     */
    public Department getDepartment() {
        return department;
    }
// … setters
// All setters receive the correct parameters, check for valid values and throw the exception correctly
// These access methods must check that only valid values are assigned; otherwise, an IllegalArgumentException with a descriptive message must be thrown.

    /**
     *
     * @param name
     * @param string with name of the employee
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param contract for employee
     */
    public void setContract(Contract contract) {
        this.contract = contract;
    }

    /**
     *
     * @param years
     * @param int with years in company
     */
    public void setYears(int years) {
        this.years = years;
    }

    /**
     *
     * @param department of employee
     */
    public void setDepartment(Department department) {
        this.department = department;
    }
// ... getSalary method
// getSalary is declared as abstract and so the Employee class is also abstract.

    /**
     *
     * @return double -> salary for generic employee -> 0
     */
    @Override
    abstract public double getSalary();

// ... toString method
// toString is correct and generates the output exactly as indicated.
    
    /**
     *
     * @return formated output for employee
     */
    
    @Override
    public String toString() {
        return name + ": " + department + " department, " + contract + " contract, " + years + " years in the company, salary of " + this.getSalary() + " bitcoins.";
    }
}
