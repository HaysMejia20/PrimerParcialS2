/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haysm
 */
public class Alumno {
    int Carnet;
    String nombre;
    String Direccion;
    String Telefono;
    String edad;

    public Alumno(int Carnet, String nombre, String Direccion, String Telefono, String edad) {
        this.Carnet = Carnet;
        this.nombre = nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.edad = edad;
       
    }

    Alumno(String alumno_1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void imprimirDatos() {
        System.out.println("El numero de carnet es: " + Carnet);
        System.out.println("El nombre del Alumno es: " + nombre);
        System.out.println("La direccion es; " + Direccion );
        System.out.println("El telefono es: " + Telefono );
        System.out.println("Su edad es: " + edad );
    }

    void addCurso(Curso curso1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

