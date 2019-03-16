/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subasta1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static subasta1.main.usuariosReg;
/**
 *
 * @author Andres
 */
public class Gestion {
 File objetos = new File("objetos.txt");
        FileInputStream entrada =null;
        FileOutputStream salida =null;
        ObjectInputStream reader = null;
        ObjectOutputStream writer =null;

    public Gestion() {
    }

        public void cargar() throws IOException{
    try {
            entrada =new FileInputStream(objetos);
            reader = new ObjectInputStream(entrada);
            usuariosReg = (ArrayList<Usuario>) reader.readObject();
            
            //UN.listSedes();
        } catch (IOException | ClassNotFoundException ex) {
           objetos.createNewFile();
        }
}
}
