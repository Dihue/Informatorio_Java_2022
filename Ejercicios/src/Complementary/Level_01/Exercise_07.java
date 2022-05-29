/*
Realizar un programa que dado un String de entrada en minúsculas lo convierta por
completo a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase().
 */
package Complementary.Level_01;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {

        // Creacion del objeto Scaner
        Scanner scan = new Scanner(System.in);

        // Salida por pantalla con msj para el usuario
        System.out.println("Ingresar texto:");

        // Creacion y declaracion de variables
        String cadena = scan.next();
        int longitud = cadena.length();


        // Bucle para recorrer la cadena ingresada
        for (int i = 0; i < longitud; i++) {
            // Variable para la manipulacion de los caracteres
            char caracter = cadena.charAt(i);

            // Condicional con el rango para los caracteres
            if (caracter >= 'a' && caracter <= 'z') {
                // Paso de caracteres a mayúsculas (ASCII)
                caracter = (char) (caracter - 'a' + 'A');
            }
            // Salida por pantalla con la cadena en mayúsculas
            System.out.print(caracter);
        }
        // Finalizacion Scanner
        scan.close();
    }
}