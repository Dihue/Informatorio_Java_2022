/*
Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente
mensaje "¡HOLA {USUARIO}!"

Input: Obi Wan Kenobi
Output: HOLA Obi Wan Kenobi!!!
*/
package Complementary.Level_01;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        // Declaración de variables
        String usuario;

        // Creación del objeto Scanner
        Scanner scan = new Scanner(System.in);

        // Salida por pantalla con msj para el usuario
        System.out.println("Ingrese su nombre de usuario: ");
        usuario = scan.nextLine();

        // Salida por pantalla del msj con el resultado del programa
        System.out.println("HOLA " + usuario + "!!!");

        // Finalización Scanner
        scan.close();
    }
}
