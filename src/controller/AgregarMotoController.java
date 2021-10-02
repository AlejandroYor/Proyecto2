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
import model.Moto;
import model.Vehiculo;
import utils.BaseDatos;

/**
 * FXML Controller class
 *
 * @author Alejandro
 */
public class AgregarMotoController implements Initializable {

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
        // TODO
    }    
    
    public static int contadorMoto  = 0;
    @FXML
    private void guardarMoto(ActionEvent event) {
        //obtener datos del GUI
        String marca = txtMarca.getText();
        String placa = txtPlaca.getText();
        String modelo = txtModelo.getText();
        String color = txtColor.getText();
        //objeto para sacar las variables deseadas de la clase MenuController
        MenuController variable = new MenuController();
        
        //Ciclo para hacer que no se pare de las variables necesarias
        if (contadorMoto < Integer.parseInt(variable.espacioMoto))
        {
        // instancia del modelo de datos
        Vehiculo m = new Moto(marca,placa,Integer.parseInt(modelo), color);
        //guardarlo
        BaseDatos.ListaMotos.add(m);
        JOptionPane.showMessageDialog(null,"La moto ha sido agregado con exito!");
        //Sumandole 1 espacio al contador
        contadorMoto = contadorMoto+1;
        //limpiar los campos
        txtMarca.setText("");
        txtPlaca.setText("");
        txtModelo.setText("");
        txtColor.setText("");
        System.out.println("La tarifa es de: " + variable.tarifaMoto);      
        System.out.println("El espacio ocupado es de: " + contadorMoto + " de " + variable.espacioMoto);      
        } else{
        JOptionPane.showMessageDialog(null,"No hay espacio disponible, saque una moto!"); //Mostrar mensaje que no hay mas espacio disponible
        }
        //Vaciar txt        
        txtMarca.setText("");
        txtPlaca.setText("");
        txtModelo.setText("");
        txtColor.setText("");
        System.out.println(BaseDatos.ListaMotos);
        
        // get a handle to the stage
        Stage stage = (Stage) btnGuardar.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
    }
    

