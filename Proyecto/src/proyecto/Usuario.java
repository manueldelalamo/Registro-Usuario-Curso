/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author malamo
 */
public class Usuario {
    
    private String nombre;
    private String apellido;
    private int id;
    private double altura;

    public Usuario(String nombre, String apellido, int id, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Usuario #" + id + ": " + nombre + ", " + apellido + " y altura de " + altura + "";
    }

}