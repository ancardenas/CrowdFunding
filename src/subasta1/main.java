/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subasta1;







import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

 

public class main extends Application{
 public static Calendar calendario=new GregorianCalendar();
 public static Usuario usuario;// ey men cuando el usuario inicie secion igualas, en el constructor Crowdfounding 
 public static ArrayList<Usuario> usuariosReg = new ArrayList<>();                            //el usuario que se registro con el usuario estatico, esto con el fin de aceder a su informacion en cada  
 public static Gestion gestion =new Gestion();
 // momento
 public static Stage primaryStage;
 @Override
    public void start(Stage stage) throws Exception {
        //gestion.cargar();
        
        primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
