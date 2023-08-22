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
import java.util.ArrayList;

/**
 *
 * @author Alejo-PC
 */
public class NewMain {

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
        ArrayList<receptor> losReceptores = new ArrayList<>();
        
        //Loop
//        while(true){
            //formula para generar valores aleatorios con un maximo y minimo 
            //int b = (int)(Math.random()*(max-min+1)+min);
            int elModelo = (int)(Math.random()*(2024-2000+1)+2000);
            //por ahora el nombre estara en blanco para confirmar que el loop funciona 
            String elNombre = "David";
            int elTiempoLan = (int)(Math.random()*(5-1+1)+1);
            
            colaCarros.encolar(new Carro(elModelo,elNombre, elTiempoLan));
            
            print(colaCarros.toString());
            //System.out.println(colaCarros.toString());
//        }  
    }
    
}
