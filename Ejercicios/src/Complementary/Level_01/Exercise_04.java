/*
Realizar un programa que calcule el factorial de un numero
n! = 1 x 2 x 3 x ... x (n-1) x n
*/
package Complementary.Level_01;

import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        // Declaracion de variables
        int entrada;

        // Creacion del objeto Scanner
        Scanner scan = new Scanner(System.in);

        // Salida por pantalla con msj para el usuario
        System.out.println("Ingrese un número entero para calcular el factorial:");
        // Asignacion de la variable
        entrada = scan.nextInt();

        // Salida por pantalla con el resutado
        System.out.println("\nEl faltorial de " + entrada + " es " + factorial(entrada));

        // Finalizar Scanner
        scan.close();
    }

    // Funcion para el calculo del factorial de un numero
    private static int factorial(int entrada) {
        if (entrada <= 1) {
            return 1;
        } else {
            return (entrada * factorial(entrada-1));
        }
    }
}
