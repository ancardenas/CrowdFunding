/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subasta1;

import java.io.Serializable;

/**
 *
 * @author Horacio
 */
public class Oferta  implements Serializable {
    
    private int interes;
    private String Nombre;
    private Aportantes aportante;
    public Oferta() {
    }

    public Oferta(int interes, String Nombre, Aportantes aportante) {
        this.interes = interes;
        this.Nombre = Nombre;
        this.aportante = aportante;
    }



    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
    
}
