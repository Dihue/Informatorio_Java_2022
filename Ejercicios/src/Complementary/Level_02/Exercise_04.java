/*
Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3
cursos (3 arrayList) e imprimir dichos cursos.
 */
package Complementary.Level_02;

import java.util.ArrayList;
import java.util.List;

public class Exercise_04 {
    public static void main(String[] args) {
        // Inter face Lista del tipo String e instancia de una lista
        List<String> estudiantes = new ArrayList<>();

        // Separación de la lista en 3 sub-listas
        List<String> cursoA = estudiantes.subList(0,4);
        List<String> cursoB = estudiantes.subList(4,8);
        List<String> cursoC = estudiantes.subList(8,12);

        // Método para cargar la lista
        cargarEstudiantes(estudiantes);

        // Iteración y muestra de los nombres por cada curso
        System.out.println("\nCurso A:");
        for (String nombres: cursoA) {
            System.out.println(nombres);
        }
        System.out.println("\nCurso B:");
        for (String nombres: cursoB) {
            System.out.println(nombres);
        }
        System.out.println("\nCurso C:");
        for (String nombres: cursoC) {
            System.out.println(nombres);
        }
    }

    private static void cargarEstudiantes(List<String> estudiantes) {
        estudiantes.add("Damian");
        estudiantes.add("Virginia");
        estudiantes.add("Pedro");
        estudiantes.add("Maria");
        estudiantes.add("Mateo");
        estudiantes.add("Magdalena");
        estudiantes.add("Nancy");
        estudiantes.add("Enrique");
        estudiantes.add("Angel");
        estudiantes.add("Juan");
        estudiantes.add("Eduardo");
        estudiantes.add("Carla");
    }
}
