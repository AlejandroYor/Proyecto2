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
import static utils.BaseDatos.ListaCarros;


/**
 * FXML Controller class
 *
 * @author Alejandro
 */
public class SacarCarroController implements Initializable {

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
    private void eliminarCarro(ActionEvent event) {
        MenuController variable = new MenuController();
        //1. obtener datos del GUI
        String id = txtId.getText();
        String tiempo = txtTiempo.getText();
        int calculo = 0;
        calculo =  Integer.parseInt(tiempo) / 10 * Integer.parseInt(variable.tarifaCarro);
        JOptionPane.showMessageDialog(null,"El valor a pagar es de: Q" + calculo);
        BaseDatos.ListaCarros.remove(Integer.parseInt(id));
        JOptionPane.showMessageDialog(null,"El carro a sido eliminado del parqueo con exito!");
        System.out.println("Esta es la lista actualizada de datos: " + ListaCarros);//Mostrando
        AgregarCarroController variableContador = new AgregarCarroController();
        variableContador.contadorCarro = variableContador.contadorCarro - 1;
        //4. limpiar los campos
        txtId.setText("");
        txtTiempo.setText("");
        System.out.println(BaseDatos.ListaCarros);
        
        // get a handle to the stage
        Stage stage = (Stage) btnGuardar.getScene().getWindow();
        // do what you have to do
        stage.close();
        
        }
        
        
        
        

        
        
    
    
}
