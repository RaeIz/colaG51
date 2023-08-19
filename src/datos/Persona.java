/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Base;

/**
 *
 * @author Alejo-PC
 */
public class Persona extends Base{
    
    private String nombreP;
    private String correoP;
    private String numCelP;

    public Persona() {
    }

    public Persona(String nombreP, String correoP, String numCelP) {
        this.nombreP = nombreP;
        this.correoP = correoP;
        this.numCelP = numCelP;
    }

    /**
     * Get the value of numCelP
     *
     * @return the value of numCelP
     */
    public String getNumCelP() {
        return numCelP;
    }

    /**
     * Set the value of numCelP
     *
     * @param numCelP new value of numCelP
     */
    public void setNumCelP(String numCelP) {
        this.numCelP = numCelP;
    }


    /**
     * Get the value of correoP
     *
     * @return the value of correoP
     */
    public String getCorreoP() {
        return correoP;
    }

    /**
     * Set the value of correoP
     *
     * @param correoP new value of correoP
     */
    public void setCorreoP(String correoP) {
        this.correoP = correoP;
    }


    /**
     * Get the value of nombreP
     *
     * @return the value of nombreP
     */
    public String getNombreP() {
        return nombreP;
    }

    /**
     * Set the value of nombreP
     *
     * @param nombreP new value of nombreP
     */
    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    @Override
    public String toString() {
        return  nombreP + "," + correoP + "," + numCelP ;
    }

    @Override
    public Base copy() {
        
        return new Persona(nombreP, correoP, numCelP);
        
        
    }

    
    
}
