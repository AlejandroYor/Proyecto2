/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import model.Carro;
import model.Vehiculo;
import utils.BaseDatos;

/**
 * FXML Controller class
 *
 * @author Alejandro
 */

public class AgregarCarroController implements Initializable {

    @FXML
    private TextField txtPlaca;
    @FXML
    private TextField txtMarca;
    @FXML
    private TextField txtModelo;
    @FXML
    private TextField txtColor;
    @FXML
    private Button btnGuardar;
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    public static int contadorCarro  = 0; 
    
    @FXML
    private void guardarCarro(ActionEvent event) {
        //obtener datos del GUI
        String marca = txtMarca.getText();
        String placa = txtPlaca.getText();
        String modelo = txtModelo.getText();
        String color = txtColor.getText();
        //objeto para sacar las variables deseadas de la clase MenuController
        MenuController variable = new MenuController();
        
        //Ciclo para hacer que no se pare de las variables necesarias
        if (contadorCarro < Integer.parseInt(variable.espacioCarro))
        {
        // instancia del modelo de datos
        Vehiculo c = new Carro(marca,placa,Integer.parseInt(modelo), color);
        //3. guardarlo
        BaseDatos.ListaCarros.add(c);
        JOptionPane.showMessageDialog(null,"El carro ha sido agregado con exito!");
        //Sumandole 1 espacio al contador
        contadorCarro = contadorCarro+1;
        //4. limpiar los campos
        txtMarca.setText("");
        txtPlaca.setText("");
        txtModelo.setText("");
        txtColor.setText("");
        
        
        System.out.println("La tarifa es de: " + variable.tarifaCarro);      
        System.out.println("El espacio ocupado es de: " + contadorCarro + " de " + variable.espacioCarro);      
        } else{
        JOptionPane.showMessageDialog(null,"No hay espacio disponible, saque un carro!"); //Mostrar mensaje que no hay mas espacio disponible
        }
        //Vaciar txt        
        txtMarca.setText("");
        txtPlaca.setText("");
        txtModelo.setText("");
        txtColor.setText("");
        System.out.println(BaseDatos.ListaCarros);
        
        // get a handle to the stage
        Stage stage = (Stage) btnGuardar.getScene().getWindow();
        // do what you have to do
        stage.close();
    }

    
    
}
