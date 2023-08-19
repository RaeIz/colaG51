/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Persona;
import modelo.Cola;

/**
 *
 * @author Alejo-PC
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cola<Persona> colaPersonas=new Cola<>();
        
        colaPersonas.encolar(new Persona("David", "dacastro@uao", "302"));
        colaPersonas.encolar(new Persona("SofiA", "sofia@uao", "303"));
        colaPersonas.encolar(new Persona("Carlos", "carlos@uao", "304"));
        colaPersonas.encolar(new Persona("Maria", "maria@uao", "305"));
        
        System.out.println("El contenido de la cola es "+ colaPersonas.toString());
        
        colaPersonas.desencolar();
        
        System.out.println("El contenido de la cola es "+ colaPersonas.toString());
        
    }
    
}
