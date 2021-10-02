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
import model.Camion;
import model.Vehiculo;
import utils.BaseDatos;

/**
 * FXML Controller class
 *
 * @author Alejandro
 */
public class AgregarCamionController implements Initializable {

    @FXML
    private TextField txtMarca;
    @FXML
    private TextField txtPlaca;
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
        // TODO
    }    
    
    public static int contadorCamion  = 0;
    @FXML
    private void guardarCamion(ActionEvent event) {
        
        //obtener datos del GUI
        String marca = txtMarca.getText();
        String placa = txtPlaca.getText();
        String modelo = txtModelo.getText();
        String color = txtColor.getText();
        //objeto para sacar las variables deseadas de la clase MenuController
        MenuController variable = new MenuController();
        
        //Ciclo para hacer que no se pare de las variables necesarias
        if (contadorCamion < Integer.parseInt(variable.espacioCamion))
        {
        // instancia del modelo de datos
        Vehiculo ca = new Camion(marca,placa,Integer.parseInt(modelo), color);
        //3. guardarlo
        BaseDatos.ListaCamiones.add(ca);
        JOptionPane.showMessageDialog(null,"El camion ha sido agregado con exito!");
        //Sumandole 1 espacio al contador
        contadorCamion = contadorCamion+1;
        //4. limpiar los campos
        txtMarca.setText("");
        txtPlaca.setText("");
        txtModelo.setText("");
        txtColor.setText("");
        
        
        System.out.println("La tarifa es de: " + variable.tarifaCamion);      
        System.out.println("El espacio ocupado es de: " + contadorCamion + " de " + variable.espacioCamion);      
        } else{
        JOptionPane.showMessageDialog(null,"No hay espacio disponible, saque un camion!"); //Mostrar mensaje que no hay mas espacio disponible
        }
        //Vaciar txt        
        txtMarca.setText("");
        txtPlaca.setText("");
        txtModelo.setText("");
        txtColor.setText("");
        System.out.println(BaseDatos.ListaCamiones);
        
        // get a handle to the stage
        Stage stage = (Stage) btnGuardar.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
    
}
