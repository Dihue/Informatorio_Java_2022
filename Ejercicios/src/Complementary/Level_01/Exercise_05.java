/*
Se desea una aplicación que solicite 2 números enteros y realice la operación de
multiplicación por sumas sucesivas (sin uso de librerías).
 */
package Complementary.Level_01;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        // Declaracion de variables
        int x, y, acumulador = 0;

        // Creacion del objeto Scanner
        Scanner scan = new Scanner(System.in);

        // Salida por pantalla con msj para el usuario
        System.out.println("Ingrese 2 números enteros para realizar la multiplicacion\n");

        System.out.print("Primer número: ");
        // Asignacion de la variable
        x = scan.nextInt();

        System.out.print("Segundo número: ");
        // Asignacion de la variable
        y = scan.nextInt();

        // Bucle para generar la sumas sucesivas
        for (int i = 1; i <=y ; i++) {
            acumulador = acumulador + x;
        }

        // Salida por pantalla con el resultado
        System.out.println("\n" + x + " x " + y + " = " + acumulador);

        // Finalizacion Scanner
        scan.close();
    }
}