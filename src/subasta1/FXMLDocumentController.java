/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subasta1;

import static subasta1.main.primaryStage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import static subasta1.main.usuario;
import static subasta1.main.usuariosReg;


/**
 *
 * @author Andres
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button registrar;
    @FXML
    private Button ingresar;
    ;
    @FXML
    private PasswordField contraseña;
    @FXML
    private TextField usu;
    
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void accionhey(ActionEvent event) {
        System.out.println("PResionaste Hey");
    }

    private void accionHola(ActionEvent event) {
        System.out.println("Deja de presionarme");
    }

    @FXML
    private void actionRegistrar(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("Registro.fxml"));
        
        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    private void actionIngresar(ActionEvent event) throws IOException {
        
        for (int i = 0; i < usuariosReg.size()  ; i++) {
             try {
                 System.out.println(usuariosReg.get(i).getNombre());
             String usuario = usuariosReg.get(i).getNombre();
             String contrasena = usuariosReg.get(i).getContrasena();
            if ((usuario.equals(usu.getText())&&(contrasena.equals(contraseña.getText())))) {
            Parent root = FXMLLoader.load(getClass().getResource("Inicio.fxml"));
        
        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        }
        } catch (Exception e) {
            this.label.visibleProperty();
            this.label.setText("Registrese Antes de comenzar");
        }
        }
    }
    
}
