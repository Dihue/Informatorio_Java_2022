package Guided_Practice;
/*
Desarrollar un programa que dado un número entero ingresado, nos retorne los valores
de ese número multiplicado por 1, 2, 3, … y 10.
 */

import java.util.Scanner;

public class Exercise_05b {
    public static void main(String[] args) {
        // Declaracion de variable
        int continuar;

        // Creacion del objeto Scanner que toma los valores de entrada por la consola
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Ingresar número entero para multiplicar: ");
            int numero = scan.nextInt();

            for (int i = 0; i < 10; i++) {
                System.out.println(numero + " * " + (i+1) + " = " + (i+1)*numero);
            }
            System.out.println("\nSi desea continuar, presione 1, sino cualquier tecla");
            continuar = scan.nextInt();

        } while (continuar == 1);

        // Finalizacion del proceso del scanner
        scan.close();
    }
}
