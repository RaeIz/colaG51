/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author reysa
 */
public class receptor {

    private boolean ocupado;
    private Carro carroAtendiendo;
    private int tiempoLan;

    public receptor(boolean ocupado, Carro carroAtendiendo, int tiempoLan) {
        this.ocupado = ocupado;
        this.carroAtendiendo = carroAtendiendo;
        this.tiempoLan = tiempoLan;
    }

    @Override
    public String toString() {
        return ocupado + "," + carroAtendiendo + "," + tiempoLan;
    }

    public Carro getCarroAtendiendo() {
        return carroAtendiendo;
    }

    public void setCarroAtendiendo(Carro carroAtendiendo) {
        this.carroAtendiendo = carroAtendiendo;
    }

    public int getTiempoLan() {
        return tiempoLan;
    }

    public void setTiempoLan(int tiempoLan) {
        this.tiempoLan = tiempoLan;
    }
    
    

    public receptor() {
        this.ocupado = false;
        this.carroAtendiendo = null;
    }

    public boolean isOcupado() {
        return ocupado;
    }
    //el receptor se ocupa con un carro y lo atiende calculando el tiemp
    public boolean atenderCarro(Carro carro) {
          boolean t = ocupado;
//        carroAtendiendo = carro;
//       
//        
        try {
            Thread.sleep(carro.getTiempoLan() * 1000);//tiempo de demora del carro las mide en milisegundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long finAtencion = System.currentTimeMillis(); // Marca el tiempo de fin de atención
        //no esta terminado 
        //long tiempoAtencion = finAtencion - inicioAtencion; // Calcula el tiempo de atención
        if(finAtencion == tiempoLan){
            t = true;
        }else{
            t = false;
        }
        return t;
//
//        ocupado = false;
//        carroAtendiendo = null;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
}
