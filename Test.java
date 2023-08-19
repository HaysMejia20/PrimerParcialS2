/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haysm
 */
public class Test {
    public static void main(String[] args) {
        // Instanciar catedráticos
        Catedratico catedratico1 = new Catedratico("Catedrático 1", "Dirección 1", "555-1111", "Profesión 1");
        Catedratico catedratico2 = new Catedratico("Catedrático 2", "Dirección 2", "555-2222", "Profesión 2");
        Catedratico catedratico3 = new Catedratico("Catedrático 3", "Dirección 3", "555-3333", "Profesión 3");

        // Instanciar cursos
        Curso curso1 = new Curso("Curso 1", 5);
        Curso curso2 = new Curso("Curso 2", 5);
        Curso curso3 = new Curso("Curso 3", 2);

        // Instanciar alumnos
        Alumno alumno1 = new Alumno("Alumno 1");
        Alumno alumno2 = new Alumno("Alumno 2");
        Alumno alumno3 = new Alumno("Alumno 3");

        // Asignar cursos a alumnos
        alumno1.addCurso(curso1);
        alumno1.addCurso(curso2);
        alumno1.addCurso(curso3);

        alumno2.addCurso(curso1);
        alumno2.addCurso(curso2);
        alumno2.addCurso(curso3);

        alumno3.addCurso(curso1);
        alumno3.addCurso(curso2);
        alumno3.addCurso(curso3);
    }
}

