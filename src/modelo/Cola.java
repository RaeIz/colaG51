/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Alejo-PC
 */
public class Cola<T extends Base> {

    LinkedList<T> elems;
    

    public Cola() {
        elems = new LinkedList<>();
    }

    public void encolar(T elemento) {
        elems.addLast(elemento);
    }

    public T desencolar() {
        return elems.removeFirst();
    }

    public boolean estaVacia() {
        return elems.isEmpty();
    }

  

    public Iterator<T> iterator() {
        return elems.iterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (T elemento : elems) {
            sb.append("").append(elemento.toString());
        }
        sb.append("}");
        return sb.toString();
    }
}
