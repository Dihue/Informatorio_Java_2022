package Guided_Practice;
/*
Realizar un programa que al ejecutar se pueda ingresar 3 números enteros, para
luego imprimirlos por pantalla de la siguiente manera:

El primer nro ingresado es: 4
El segundo nro ingresado es: 5
El tercer nro ingresado es: 6
 */

import java.util.Scanner;

public class Exercise_02c {
    // Creacion del objeto Scanner que toma los valores de entrada por la consola
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // Declaracion de variable
        int continuar;

        do {
            mensajeNumero(ingresoNumero());

            System.out.println("\nSi desea continuar, presione 1, sino cualquier tecla");
            continuar = scan.nextInt();

        } while (continuar == 1);

        // Finalizacion del proceso del scanner
        scan.close();
    }
    public static int ingresoNumero() {
        System.out.println("Ingrese número entero: ");
        return scan.nextInt();
    }
    public static void mensajeNumero(int numero) {
        System.out.println("\nEl número ingresado es: " + numero);
    }
}
