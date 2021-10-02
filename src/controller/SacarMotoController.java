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
import static utils.BaseDatos.ListaMotos;

/**
 * FXML Controller class
 *
 * @author Alejandro
 */
public class SacarMotoController implements Initializable {

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
    private void eliminarMoto(ActionEvent event) {
        MenuController variable = new MenuController();
        //1. obtener datos del GUI
        String id = txtId.getText();
        String tiempo = txtTiempo.getText();
        double calculo = 0;
//        calculo =  Integer.parseInt(tiempo) / 10 * Integer.parseInt(variable.tarifaCarro);
        calculo = (Integer.parseInt(tiempo) / 10 * Integer.parseInt(variable.tarifaMoto)) - ((Integer.parseInt(tiempo) / 10 * Integer.parseInt(variable.tarifaMoto)) * 0.10);
        JOptionPane.showMessageDialog(null,"El valor a pagar es de: Q" + calculo);
        BaseDatos.ListaMotos.remove(Integer.parseInt(id));
        JOptionPane.showMessageDialog(null,"La moto ha sido eliminada del parqueo con exito!");
        System.out.println("Esta es la lista actualizada de datos: " + ListaMotos);//Mostrando
        AgregarMotoController variableContador = new AgregarMotoController();
        variableContador.contadorMoto = variableContador.contadorMoto - 1;
        //4. limpiar los campos
        txtId.setText("");
        txtTiempo.setText("");
        System.out.println(BaseDatos.ListaMotos);
        
        // get a handle to the stage
        Stage stage = (Stage) btnGuardar.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
    
}
