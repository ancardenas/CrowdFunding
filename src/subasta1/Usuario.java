/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subasta1;

/**
 *
 * @author Horacio
 */
public class Usuario {
   
    
    private int dinero;
    private String Contrasena;
    private String username;
    private String nombre;
 private String cedula;
 private int telefono;

    public Usuario(int dinero, String Contrasena, String username, String nombre, String cedula, int telefono) {
        this.dinero = dinero;
        this.Contrasena = Contrasena;
        this.username = username;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public Usuario(int dinero, String Contrasena, String username, String nombre, String cedula) {
        this.dinero = dinero;
        this.Contrasena = Contrasena;
        this.username = username;
        this.nombre = nombre;
        this.cedula = cedula;
    }

   

    

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

   

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
    
    
}
