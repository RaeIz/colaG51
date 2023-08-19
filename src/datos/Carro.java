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
    
    private int modelo;
    private String nombre;
    private int tiempoLan;

    public Carro(int modelo, String nombre, int tiempoLan) {
        this.modelo = modelo;
        this.nombre = nombre;
        this.tiempoLan = tiempoLan;
    }
    
    /**
     * Get the value of tiempoLan
     *
     * @return the value of tiempoLan
     */
    public int getTiempoLan() {
        return tiempoLan;
    }

    /**
     * Set the value of tiempoLan
     *
     * @param tiempoLan new value of tiempoLan
     */
    public void setTiempoLan(int tiempoLan) {
        this.tiempoLan = tiempoLan;
    }


    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Get the value of modelo
     *
     * @return the value of modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * Set the value of modelo
     *
     * @param modelo new value of modelo
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return modelo + "" + nombre + "" + tiempoLan ;
    }

    

    @Override
    public Base copy() {
        
        return new Carro(modelo, nombre, tiempoLan);
        
        
    }

    
    
}
