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

public class Exercise_03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresar calificación (entre 0 y 100):");
        int calificacion = scan.nextInt();
        scan.close();

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
