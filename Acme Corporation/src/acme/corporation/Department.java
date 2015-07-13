package acme.corporation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * For creations of diferents types of departments.
 * Enum are STATIC and FINAL.
 * it is More simple ADD new Departments in future versions.
 * More clear in OBJECTs definitions.
 * 
 * @author Jose M.
 * @version 1.0
 * @since 11/06/20015
 * @author JoséM
 */
public enum Department {

    /**
     * Department 0 Management
     */
    MANAGEMENT("Management"),

    /**
     * Department 1 Engineering
     */
    ENGINEERING("Engineering"),

    /**
     * Department 2 Administration
     */
    ADMINISTRATION("Administration");

    private String value;

    private Department(String value) {
        this.value = value;
    }
    /**
     * 
     * @return Department in lowercase.
     */
    @Override
    public String toString() {
        return this.value;
    }
}
