package Guided_Practice;
/*
Realizar un programa que al ejecutar se pueda ingresar 3 números enteros, para
luego imprimirlos por pantalla de la siguiente manera:

El primer nro ingresado es: 4
El segundo nro ingresado es: 5
El tercer nro ingresado es: 6
 */

import java.util.Scanner;

public class Exercise_02b {
    public static void main(String[] args) {
        // Declaracion de variable
        int continuar;

        // Creacion del objeto Scanner que toma los valores de entrada por la consola
        Scanner scan = new Scanner(System.in);

        do {
            // Mensaje por pantalla para el usuario y asignacion de las variables
            System.out.println("Ingrese primer número entero: ");
            int a = scan.nextInt();
            System.out.println("Ingrese segundo número entero: ");
            int b = scan.nextInt();
            System.out.println("Ingrese tercer número entero: ");
            int c = scan.nextInt();

            // Salida por pantalla con los resultados
            System.out.println("\nEl primer número ingresado es: " + a);
            System.out.println("El segundo número ingresado es: " + b);
            System.out.println("El tercer número ingresado es: " + c);

            System.out.println("\nSi desea continuar, presione 1, sino cualquier tecla");
            continuar = scan.nextInt();

        } while (continuar == 1);

        // Finalizacion del proceso del scanner
        scan.close();
    }
}
