package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Alejandro
 */
public class MenuController implements Initializable  {



    @FXML
    private Button btnSalir;
    @FXML
    private TextField txtTarifaCarro;
    @FXML
    private Button btnGuardar;
    @FXML
    private TextField txtTarifaMoto;
    @FXML
    private TextField txtEspacioCarro;
    @FXML
    private TextField txtEspacioMoto;
    @FXML
    private TextField txtTarifaCamion;
    @FXML
    private TextField txtEspacioCamion;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void agregarMenuCarro(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/AgregarCarro.fxml"));
        Pane root = (Pane) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Agregar Carro");
        stage.setScene(new Scene(root, 444, 340));
        stage.show();
    }

    @FXML
    private void agregarMenuMoto(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/AgregarMoto.fxml"));
        Pane root = (Pane) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Agregar moto");
        stage.setScene(new Scene(root, 444, 340));
        stage.show();
        
    }

    @FXML
    private void sacarMenuCarro(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/SacarCarro.fxml"));
        Pane root = (Pane) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Sacar carro");
        stage.setScene(new Scene(root, 444, 300));
        stage.show();
    }

    //Variables estaticas para poder obtener la informacion en otras clases
    public static String tarifaCarro = "0";
    public static String tarifaMoto = "0";
    public static String tarifaCamion = "0";
    public static String espacioCarro = "0";
    public static String espacioMoto = "0";
    public static String espacioCamion = "0";
    
    @FXML
    public void guardarTarifa(ActionEvent event) {
        tarifaCarro = txtTarifaCarro.getText();
        tarifaMoto = txtTarifaMoto.getText();
        tarifaCamion = txtTarifaCamion.getText();
        espacioCarro = txtEspacioCarro.getText();
        espacioMoto = txtEspacioMoto.getText();
        espacioCamion = txtEspacioCamion.getText();
    }

    @FXML
    private void sacarMenuMoto(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/SacarMoto.fxml"));
        Pane root = (Pane) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Sacar moto");
        stage.setScene(new Scene(root, 444, 300));
        stage.show();
    }

    @FXML
    private void agregarMenuCamion(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/AgregarCamion.fxml"));
        Pane root = (Pane) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Agregar Camion");
        stage.setScene(new Scene(root, 444, 340));
        stage.show();
    }

    @FXML
    private void sacarMenuCamion(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/SacarCamion.fxml"));
        Pane root = (Pane) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Sacar camion");
        stage.setScene(new Scene(root, 444, 300));
        stage.show();
    }
    
    @FXML
    private void agregarMenuConsulta1(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/TotalIngresado.fxml"));
        Pane root = (Pane) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Total Ingresado");
        stage.setScene(new Scene(root, 460, 400));
        stage.show();
    }

    @FXML
    private void agregarMenuConsulta2(ActionEvent event) {
        
        AgregarCarroController variableContadorCarro = new AgregarCarroController();
        AgregarMotoController variableContadorMoto = new AgregarMotoController();
        AgregarCamionController variableContadorCamion = new AgregarCamionController();
        JOptionPane.showMessageDialog(null,"Los espacios del parqueo para carro son: \n" + variableContadorCarro.contadorCarro + " de " + espacioCarro);
        JOptionPane.showMessageDialog(null,"Los espacios del parqueo para moto son: \n" + variableContadorMoto.contadorMoto + " de " + espacioMoto);
        JOptionPane.showMessageDialog(null,"Los espacios del parqueo para camion son: \n" + variableContadorCamion.contadorCamion + " de " + espacioCamion);
    }

    @FXML
    private void salirMenu(ActionEvent event) {
         // get a handle to the stage
        Stage stage = (Stage) btnSalir.getScene().getWindow();
        // do what you have to do
        stage.close();
    }

}
