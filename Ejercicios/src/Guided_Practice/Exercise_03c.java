package Guided_Practice;
/*
Tendremos un sistema que debe clasificar el resultado de una evaluación. Como dato de
entrada tendremos un entero y como resultado un String de la clasificación de la si-
guiente forma:
Rango                   Clasificación
93 - 100                Excelente
85 - 92                 Sobresaliente
75 - 84                 Distinguido
60 - 74                 Bueno
00 - 59                 Desaprobado
 */

import java.util.Scanner;

public class Exercise_03c {
    // Creacion del objeto Scanner que toma los valores de entrada por la consola
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            mensajeCalificacion(ingresoCalificacion());

        } while (continuar() == 1);

        // Finalizacion del proceso del scanner
        scan.close();
    }

    public static int continuar() {
        System.out.println("\nSi desea continuar, presione 1, sino cualquier tecla");
        return scan.nextInt();
    }

    public static int ingresoCalificacion() {
        System.out.println("\nIngresar calificación (entre 0 y 100):");
        return scan.nextInt();
    }

    public static void mensajeCalificacion(int calificacion) {
        if (calificacion >= 93) {
            System.out.println("Excelente");
        } else if (calificacion>=85) {
            System.out.println("Sobresaliente");
        } else if (calificacion>=75) {
            System.out.println("Distinguido");
        } else if (calificacion>=60) {
            System.out.println("Bueno");
        } else {
            System.out.println("Desaprobado");
        }
    }
}