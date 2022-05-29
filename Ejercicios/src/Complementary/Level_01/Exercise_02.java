/*
Realiza un programa que solicite por consola 2 números enteros. Para luego imprimir
el resultado de la suma, resta, multiplicacion, division y módulo de ambos números.
*/
package Complementary.Level_01;

import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        // Declaracion de variables
        int a, b;

        // Creacion del objeto Scanner
        Scanner scan = new Scanner(System.in);

        // Salida por pantalla con msj para el usuario
        System.out.println("Ingrese 2 números enteros");

        // Asignacion de variables
        System.out.println("\nPrimer número:");
        a = scan.nextInt();
        System.out.println("\nSegundo número:");
        b = scan.nextInt();

        // Llamado a los metodos
        System.out.println("\nResultados:\n");
        suma(a,b);
        resta(a,b);
        multiplicacion(a,b);
        division(a,b);
        modulo(a,b);

        // Finalizacion Scanner
        scan.close();
    }

    // Creacion de los metodos para los calculos
    private static void modulo(int a, int b) {
        System.out.println(a + " % " + b + " = " + (a%b));
    }

    private static void division(int a, int b) {
        System.out.println(a + " / " + b + " = " + (a/b));
    }

    private static void multiplicacion(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a*b));
    }

    private static void resta(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a-b));
    }

    private static void suma(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a+b));
    }
}