/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Carro;
import java.util.UUID;
import modelo.Cola;
import datos.receptor;

/**
 *
 * @author Alejo-PC
 */
public class NewMain_1 {

    /**
     * @param args the command line arguments
     */
    //Si creo un static por fuera y lo relleno en el loop deberia funcionar para crear variables infinitas 
    static void print(String value) {
        System.out.println(value);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Cola<Carro> colaCarros=new Cola<>();
         
    }
    
}
