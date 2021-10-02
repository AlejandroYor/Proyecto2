/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Alejandro
 */
public class Moto extends Vehiculo {

    public Moto(String marca, String placa, int modelo, String color) {
        super(marca,placa,modelo,color);
    }

    @Override
    public String toString() {
        return "Moto{" + "Marca=" + marca + ", placa=" + placa + ", modelo=" + modelo + ", color=" + color + '}';
    }
       
}
