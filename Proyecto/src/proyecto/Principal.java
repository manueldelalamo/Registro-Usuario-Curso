/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author malamo
 */
public class Principal {
    
    Scanner lector = new Scanner (System.in); //Creación de un objeto Scanner
        //entradaTeclado = entradaEscaner.nextLine ();
    
    private int id;
    private String nombre;
    private String apellido;
    private double altura; 
    
    private boolean confirmar;
    
   
      
          public void arrancar () {
              
              confirmar = false;
              
              do {
            System.out.println("Introduzca su ID de usuario");
            id = lector.nextInt();
            
            lector.nextLine();
            
            System.out.println("Introduzca su nombre");
            nombre = lector.nextLine();
            
            System.out.println("Introduzca su apellido");
            apellido = lector.nextLine();
            
            System.out.println("Introduzca su altura");
            altura = lector.nextDouble();
            
            Usuario usuario = new Usuario(nombre, apellido, id, altura);
            
            System.out.println("Proceso finalizado correctamente");
            System.out.println(usuario.toString());
            confirmar = true;
            
       
    
          } while(confirmar==false);
            
          }
    
}
