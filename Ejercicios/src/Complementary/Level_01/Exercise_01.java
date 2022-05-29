/*
Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente
mensaje "¡HOLA {USUARIO}!"
*/
package Complementary.Level_01;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        // Declaracion de variables
        String usuario;

        // Creacion del objeto Scanner
        Scanner scan = new Scanner(System.in);

        // Salida por pantalla con msj para el usuario
        System.out.println("Ingrese su nombre de usuario: ");
        usuario = scan.next();

        // Salida por pantalla del msj con el resutlado del programa
        System.out.println("¡HOLA " + usuario.toUpperCase() + " !");

        // Finalizacion Scanner
        scan.close();
    }
}
