/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Base;

/**
 *
 * @author reysa
 */
public class receptor extends Base {

    private boolean ocupado;
    private Carro carroAtendiendo;
    private int tiempoLanR;

    public receptor(boolean ocupado, Carro carroAtendiendo, int tiempoLan) {
        this.ocupado = ocupado;
        this.carroAtendiendo = carroAtendiendo;
        this.tiempoLanR = tiempoLan;
    }

    @Override
    public String toString() {
        return ocupado + "," + carroAtendiendo + "," + tiempoLanR;
    }

    public Carro getCarroAtendiendo() {
        return carroAtendiendo;
    }

    public void setCarroAtendiendo(Carro carroAtendiendo) {
        this.carroAtendiendo = carroAtendiendo;
    }

    public int getTiempoLanR() {
        return tiempoLanR;
    }

    public void setTiempoLanR(int tiempoLanR) {
        this.tiempoLanR = tiempoLanR;
    }
    
    

    public receptor() {
        this.ocupado = false;
        this.carroAtendiendo = null;
    }

    public boolean isOcupado() {
        return ocupado;
    }
   

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    @Override
    public Base copy() {
        
        return new receptor(ocupado, carroAtendiendo, tiempoLanR);
        
        
    }
}
