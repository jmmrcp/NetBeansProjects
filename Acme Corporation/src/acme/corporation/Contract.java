/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.corporation;

/**
 * For creations of diferents types of contracts.
 * 
 * Enum are STATIC and FINAL.
 * it is More simple ADD new contract types in future versions.
 * More clear in OBJECTs definitions.
 * 
 * @author Jose M.
 * @version 1.0
 * @since 11/06/20015
 */

public enum Contract {

    /**
     * Type Contract 0 Temporary
     */
    TEMPORARY("Temporary"),

    /**
     * Type Contract 1 Training
     */
    TRAINING("Training"),

    /**
     * Type Contract 2 Indefinite
     */
    INDEFINITE("Indefinite");

    private String value;

    private Contract(String value) {
        this.value = value;
    }
/**
 * 
 * @return Contract type in lowercase.
 */
    @Override
    public String toString() {
        return this.value;
    }
}
