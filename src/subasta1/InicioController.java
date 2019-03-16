/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subasta1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import static subasta1.main.usuario;

/**
 * FXML Controller class
 *
 * @author Andres
 */
public class InicioController implements Initializable {

    @FXML
    private Label dinero;
    @FXML
    private TextField aporte;
    @FXML
    private Label nombre;
    @FXML
    private Label cedula;
    @FXML
    private Button anadir;
    @FXML
    private Label error;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    
        /*SpinnerValueFactory<Integer> aporte1 = new SpinnerValueFactory.ListSpinnerValueFactory.IntegerSpinnerValueFactory(0, 9999999);
        this.aporte.setValueFactory(aporte1);*/
        
        this.nombre.setText(usuario.getNombre());
        this.cedula.setText(usuario.getCedula());
        
        String dinero = Integer.toString(usuario.getDinero());
        this.dinero.setText(dinero);
        this.error.setText("");
    }    

    @FXML
    private void actionAnadir(ActionEvent event) {
        try {
            this.error.setText("");
            int a = Integer.parseInt(this.aporte.getText());
        int b = usuario.getDinero() + a;
        usuario.setDinero(b);
        String dinero = Integer.toString(usuario.getDinero());
        this.dinero.setText(dinero);
        this.aporte.setText("");
        } catch (Exception e) {
            this.error.setText("Ingrese un valor para Añadir");
        }
    }
    
}
