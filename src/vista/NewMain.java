/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Carro;
import java.util.UUID;
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
        Cola<Carro> colaCarros=new Cola<>();
        
        boolean t = true;

        //formula para generar valores aleatorios con un maximo y minimo 
        //int b = (int)(Math.random()*(max-min+1)+min);
        do{
            int elModelo = (int)(Math.random()*(2024-2000+1)+2000);
            String elNombre = "";
            int elTiempoLan = (int)(Math.random()*(5-1+1)+1);
            
            colaCarros.encolar(new Carro(elModelo,elNombre, elTiempoLan));
            
            System.out.println(colaCarros.toString());
        }while(t = true);
        
    }
    
}
