package Guided_Practice;
/*
Debemos realizar un programa que nos realizará una pregunta si queremos realizar una
operación dada o si deseamos salir/terminar el programa.
Utilizaremos en este caso una simple operación que nos pide un número y luego lo im-
prime.
 */

import java.util.Scanner;

public class Exercise_06b {
    public static void main(String[] args) {
        // Creamos un objeto Scanner que toma los valores de entrada por consola
        Scanner scan = new Scanner(System.in);

        // Declaracion de variables
        int continuar;
        int numero;

        do {
            System.out.println("Por favor, ingrese un número: ");
            numero = scan.nextInt();
            System.out.println("El número ingresado es: " + numero);

            System.out.println("Si desea continuar, presione 1, sino cualquier número");
            continuar = scan.nextInt();
        } while (continuar == 1);

        // Finalizacion del proceso del scanner
        scan.close();
    }
}
