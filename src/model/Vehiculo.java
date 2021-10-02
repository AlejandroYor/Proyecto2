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
public class Vehiculo {

    public String marca;
    public String placa;
    public int modelo;
    public String color;

    public Vehiculo(String Marca, String placa, int modelo, String color) {
        this.marca = Marca;
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public int getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public void setMarca(String Marca) {
        this.marca = Marca;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }


    
    
    
    

}
