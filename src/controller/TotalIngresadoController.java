/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Vehiculo;

/**
 * FXML Controller class
 *
 * @author Alejandro
 */
public class TotalIngresadoController implements Initializable {

    @FXML
    private TableView tblVehiculos;
    @FXML
    private TableColumn tclMarca;
    @FXML
    private TableColumn tclPlaca;
    @FXML
    private TableColumn tclModelo;
    @FXML
    private TableColumn tclColor;
    @FXML
    private Button btnInfoCarro;
    @FXML
    private Button btnInfoMoto;
    @FXML
    private Button btnInfoCamion;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         tclMarca.setCellValueFactory(new PropertyValueFactory<Vehiculo, Integer>("marca"));
         tclPlaca.setCellValueFactory(new PropertyValueFactory<Vehiculo, Integer>("placa"));
         tclModelo.setCellValueFactory(new PropertyValueFactory<Vehiculo, Integer>("modelo"));
         tclColor.setCellValueFactory(new PropertyValueFactory<Vehiculo, Integer>("color"));
 
    }    

    @FXML
    private void mostrarInfoCarro(ActionEvent event) {
        ObservableList<Vehiculo> dataCarro = FXCollections.observableArrayList(utils.BaseDatos.ListaCarros);
        tblVehiculos.setItems(dataCarro);
    }

    @FXML
    private void mostrarInfoMoto(ActionEvent event) {
        ObservableList<Vehiculo> dataMoto = FXCollections.observableArrayList(utils.BaseDatos.ListaMotos);
        tblVehiculos.setItems(dataMoto);
    }

    @FXML
    private void mostrarInfoCamion(ActionEvent event) {
        ObservableList<Vehiculo> dataCamion = FXCollections.observableArrayList(utils.BaseDatos.ListaCamiones);
        tblVehiculos.setItems(dataCamion);
    }

    
}
