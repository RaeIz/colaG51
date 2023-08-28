/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Base;

/**
* Descripción de la clase …
* @author 
* @date 18 Agosto2023
* @version 1.0
*/
public class Carro extends Base{
    
    private int modeloC;
    private String nombreC;
    private int tiempoLanC;

    public Carro(int modeloC, String nombreC, int tiempoLanC) {
        this.modeloC = modeloC;
        this.nombreC = nombreC;
        this.tiempoLanC = tiempoLanC;
    }
    
    /**
     * Get the value of tiempoLan
     *
     * @return the value of tiempoLan
     */
    public int getTiempoLanC() {
        return tiempoLanC;
    }

    /**
     * Set the value of tiempoLan
     *
     * @param tiempoLanC new value of tiempoLan
     */
    public void setTiempoLanC(int tiempoLanC) {
        this.tiempoLanC = tiempoLanC;
    }


    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombreC() {
        return nombreC;
    }

    /**
     * Set the value of nombre
     *
     * @param nombreC new value of nombre
     */
    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }


    /**
     * Get the value of modelo
     *
     * @return the value of modelo
     */
    public int getModeloC() {
        return modeloC;
    }

    /**
     * Set the value of modelo
     *
     * @param modeloC new value of modelo
     */
    public void setModeloC(int modeloC) {
        this.modeloC = modeloC;
    }

    @Override
    public String toString() {
        return modeloC + "" + nombreC + "" + tiempoLanC ;
    }

    

    @Override
    public Base copy() {
        
        return new Carro(modeloC, nombreC, tiempoLanC);
        
        
    }

    
    
}
