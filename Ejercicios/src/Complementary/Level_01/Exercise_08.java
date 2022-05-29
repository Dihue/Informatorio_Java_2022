/*
Crea una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad

Luego imprimir el mensaje de la siguiente manera:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
 */
package Complementary.Level_01;

import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {
        // Creación del objeto Scanner
        Scanner scan = new Scanner(System.in);

        // Aviso para el usuario
        System.out.println("\nIngrese los siguientes datos");

        // Creación y declaración de variables
        System.out.println("Nombre y Apellido: ");
        String nombre_apellido = scan.nextLine();

        System.out.println("Edad: ");
        String edad = scan.nextLine();

        System.out.println("Dirección: ");
        String direccion = scan.nextLine();

        System.out.println("Ciudad: ");
        String ciudad = scan.nextLine();

        // Salida por pantalla con el resultado del programa
        System.out.println(ciudad +" - " + direccion +" - " +
                edad +" - " + nombre_apellido);

        // Finalizacion Scanner
        scan.close();
    }
}