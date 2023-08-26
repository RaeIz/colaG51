/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.Carro;

/**
 *
 * @author sebastian.rivas
 */
public class OperacionesCola <T extends Base> {
    
    public static <T extends Base> Cola <T> duplicarCola(Cola<T> C01){
        Cola<T> colaAux = new Cola<>();
        Cola<T> colaDuplicada = new Cola<>();
        
        while(!C01.estaVacia()){
            T elemento = C01.desencolar();
            colaAux.encolar(elemento);
        }
        
        while(colaAux.estaVacia()){
            T elemento = colaAux.desencolar();
            T elementoCopiado= (T) elemento.copy();
            
            C01.encolar(elemento);
            colaDuplicada.encolar(elementoCopiado);
        }
        
        return colaDuplicada;
    }
    
    public static <T extends Base> Cola<T> colaResultado(Cola<T> C01){
        Cola<T> colaAux = new Cola<>();
        Cola<T> colaD = duplicarCola(C01);
        
        while (!colaD.estaVacia()){
        T elemento= colaD.desencolar();
        Carro objE=(Carro)elemento;
//        if(""){
//            colaAux.encolar(elemento);
//        }
        
        }
        return colaAux;
    }
    
}
