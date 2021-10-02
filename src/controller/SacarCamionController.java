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
import utils.BaseDatos;
import static utils.BaseDatos.ListaCamiones;

/**
 * FXML Controller class
 *
 * @author Alejandro
 */
public class SacarCamionController implements Initializable {

    @FXML
    private TextField txtId;
    @FXML
    private TextField txtTiempo;
    @FXML
    private Button btnGuardar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void eliminarCamion(ActionEvent event) {
         
        MenuController variable = new MenuController();
        //1. obtener datos del GUI
        String id = txtId.getText();
        String tiempo = txtTiempo.getText();
        int calculo = 0;
        calculo = (2 * Integer.parseInt(variable.tarifaCamion))+ (Integer.parseInt(tiempo) / 5);
        JOptionPane.showMessageDialog(null,"El valor a pagar es de: Q" + calculo);
        BaseDatos.ListaCamiones.remove(Integer.parseInt(id));
        JOptionPane.showMessageDialog(null,"El camion a sido eliminado del parqueo con exito!");
        System.out.println("Esta es la lista actualizada de datos: " + ListaCamiones);//Mostrando
        AgregarCamionController variableContador = new AgregarCamionController();
        variableContador.contadorCamion = variableContador.contadorCamion - 1;
        //4. limpiar los campos
        txtId.setText("");
        txtTiempo.setText("");
        System.out.println(BaseDatos.ListaCamiones);
        
        // get a handle to the stage
        Stage stage = (Stage) btnGuardar.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
    
}
