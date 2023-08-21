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

    public receptor() {
        this.ocupado = false;
        this.carroAtendiendo = null;
    }

    public boolean isOcupado() {
        return ocupado;
    }
    //el receptor se ocupa con un carro y lo atiende calculando el tiemp
    public void atenderCarro(Carro carro) {
        ocupado = true;
        carroAtendiendo = carro;
       

        try {
            Thread.sleep(carro.getTiempoLan() * 1000);//tiempo de demora del carro las mide en milisegundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long finAtencion = System.currentTimeMillis(); // Marca el tiempo de fin de atención
        //no esta terminado 
        long tiempoAtencion = finAtencion - inicioAtencion; // Calcula el tiempo de atención

        ocupado = false;
        carroAtendiendo = null;
    }
}
