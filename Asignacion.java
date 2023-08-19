/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author haysm
 */
public class Asignacion {
     private String nombre;
    private final ArrayList<Curso> cursos;

    public Asignacion(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

    public void addCurso(Curso curso) {
        if (curso.verificaEspacio()) {
            cursos.add(curso);
            curso.setCuposDisponibles(curso.getCuposDisponibles() - 1);
            System.out.println("Curso " + curso.getNombre() + " agregado a " + nombre);
        } else {
            System.out.println("No hay cupo disponible en el curso " + curso.getNombre());
        }
    }

    // Métodos Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        Curso curso1 = new Curso("Programación", 30);
        Curso curso2 = new Curso("Matemáticas", 20);

        Alumno alumno1 = new Alumno("Juan Pérez");
        Alumno alumno2 = new Alumno("María González");

        alumno1.addCurso(curso1);
        alumno1.addCurso(curso2);
        
        alumno2.addCurso(curso1);
        alumno2.addCurso(curso2);
    }







}
