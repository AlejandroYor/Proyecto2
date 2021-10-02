package model;

/**
 *
 * @author Alejandro
 */
public class Camion extends Vehiculo {

    public Camion(String marca, String placa, int modelo, String color) {
        super(marca,placa,modelo,color);
    }

    @Override
    public String toString() {
        return "Camion{" + "Marca=" + marca + ", placa=" + placa + ", modelo=" + modelo + ", color=" + color + '}';
    }
       
}
