package model;

/**
 *
 * @author Alejandro
 */
public class Carro extends Vehiculo {

    public Carro(String marca, String placa, int modelo, String color) {
        super(marca,placa,modelo,color);
    }

    @Override
    public String toString() {
        return "Carro{" + "Marca=" + marca + ", placa=" + placa + ", modelo=" + modelo + ", color=" + color + '}';
    }
       
}
