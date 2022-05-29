/*
Confeccionar un programa que dado un numero entero, como dato de entrada, imprima
la secuencia de numeros de la siguiente manera:
1
1 2
1 2 3
1 2 3 4
*/
package Complementary.Level_01;

import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {
        // Declaracion de variables
        int entrada;

        // Creacion del objeto Scanner
        Scanner scan = new Scanner(System.in);

        // Salida por pantalla con msj para el usuario
        System.out.println("Ingrese un número entero:");
        entrada = scan.nextInt();

        // Bucle anidado
        for (int i = 1; i <= entrada; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Finalizar Scanner
        scan.close();
    }
}
