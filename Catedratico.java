/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haysm
 */
public class Catedratico {
    int CodigoCatedratico;
    String nombre;
    String Direccion;
    String Telefono;
    String Profesion;

    public Catedratico(String nombre, String Direccion, String Telefono, String Profesion) {
        this.nombre = nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Profesion = Profesion;
       
    }

    public void imprimirDatos() {
        System.out.println("El nombre del catedratico es: " + nombre);
        System.out.println("La direccion es; " + Direccion );
        System.out.println("El telefono es: " + Telefono );
        System.out.println("Su profesion es: " + Profesion );
    }

}

