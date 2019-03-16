/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subasta1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import static subasta1.main.primaryStage;
import static subasta1.main.usuario;
import static subasta1.main.usuariosReg;

/**
 * FXML Controller class
 *
 * @author Andres
 */
public class RegistroController implements Initializable {

    @FXML
    private TextField nomUsuario;
    @FXML
    private PasswordField contra;
    @FXML
    private TextField dinero;
    @FXML
    private TextField cedula;
    @FXML
    private TextField telefono;
    @FXML
    private Button registrar;
    @FXML
    private TextField nombre;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        SpinnerValueFactory<Integer> aporte1 = new SpinnerValueFactory.ListSpinnerValueFactory.IntegerSpinnerValueFactory(0, 9999999);
        //this.dinero.setValueFactory(aporte1);
    }    

    @FXML
    private void actionRegistrar(ActionEvent event) throws IOException {
        int a = Integer.parseInt(this.dinero.getText());
        Usuario usuario = new Usuario((int) a, this.contra.getText(), this.nomUsuario.getText(), this.nombre.getText(), this.cedula.getText());
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        System.out.println(usuario.getNombre());
        System.out.println(usuario.getContrasena());
        usuariosReg.add(usuario);
        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
