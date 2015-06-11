/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.corporation;

/**
 * Class for Creation of Humans Resources and calculations
 * @author johnharvard
 */
public class HumanResources {

    Employee[] employees;

    /**
     * Constructor for Company Humanans Resources 
     * 1. Define array with (n) Employees
     * 2. Initialize the array
     * 
     * @param n -> int number of Employees in Array
     */
    public HumanResources(int n) {
        employees = new Employee[n];
        /*for (int i = 0; i < this.employees.length; i++) {
        this.employees[i] = new Employee() {};
        }*/
    }

    /**
     * Constructor for ACME Humanans Resources 
     * 1. Define array with 6 Employees
     * 2. Initialize the array
     * 
     * NOT NECESARY ONLY FOR THIS WORK.
     */
    public HumanResources() {
        employees = new Employee[6];
        /*for (int i = 0; i < this.employees.length; i++) {
            this.employees[i] = new Employee();
        }*/
    }
    
    /**
     * Method to print the Array of Employees
     */
    public void HRPrint() {
        for (Employed employee : this.employees) {
            System.out.println(employee);
        }
    }
    /**
     * 
     * @return a double with the Total company salaries.
     */
    public double TotalSalary() {
        double total = 0.0;
        for (Employed employee : this.employees) {
            total = total + employee.getSalary();
        }
        return total;
    }

    /**
     * AUX Method for calculations
     * @return a int with numbers of departments in company
     */
    
    public int getDepartments(){
        int num = 0;
        for (Department departments : Department.values()){
            num++;
        }
        return num;
    }

    /**
     *
     * @return an array with Department´s salaries. 
     */
    public double[] DepartmentSalary() {
        double[] DepartmentTotalSalary;
        DepartmentTotalSalary = new double[getDepartments()];
        int num = 0;
        for (Department departments : Department.values()) {
            double total = 0;
            for (Employee employee : this.employees) {
                if (departments == employee.getDepartment()) {
                    total += employee.getSalary();
                }
            }
            DepartmentTotalSalary[num] = total;
            num++;
        }
    return DepartmentTotalSalary;
    }

    /**
     * Method to print Department Salaries and total.
     * 
     * @param DepartmentTotalSalary -> array with Departments Salaries in formated output 
     * 
     * TODO: implements an array with all salaries in Departments and names.
     */
    public void PrintDepartmentSalary(double[] DepartmentTotalSalary){
        int i = 0;
        double total = 0;
        System.out.println();
        for (Department departments : Department.values()) {
            System.out.println(departments.name() +" TOTAL SALARY: " + DepartmentTotalSalary[i] + " Bitcoins");
            total += DepartmentTotalSalary[i];
            i++;
        }
        System.out.println("ACME TOTAL SALARY: " + total + " Bitcoins");
    }
}
