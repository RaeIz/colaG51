/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Base;
import datos.Carro;

/**
 * grupo
 * salomon David 
 * Sebastian
 * Juan Sebastial Bastidas 
*/
public class receptor extends Base {

    private boolean ocupado;
    private int carroAtendiendo;
    private int tiempoLanR;
    private Carro cliente;

    public receptor(boolean ocupado, int carroAtendiendo, int tiempoLanR, Carro cliente) {
        this.ocupado = ocupado;
        this.carroAtendiendo = carroAtendiendo;
        this.tiempoLanR = tiempoLanR;
        this.cliente = cliente;
    }
    
    
   

    @Override
    public String toString() {
        return ocupado + "," + carroAtendiendo + "," + tiempoLanR;
    }

    public int getCarroAtendiendo() {
        return carroAtendiendo;
    }

    public void setCarroAtendiendo(int carroAtendiendo) {
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
    }

    public boolean isOcupado() {
        return ocupado;
    }
   

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    @Override
    public Base copy() {
        
        return new receptor(ocupado, carroAtendiendo, tiempoLanR, cliente);
        
        
    }
}
