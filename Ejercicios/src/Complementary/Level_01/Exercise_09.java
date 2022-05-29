/*
Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que
aparece una letra dada
 */
package Complementary.Level_01;

import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        // Creación del objeto Scannar
        Scanner scan = new Scanner(System.in);

        // Instrucciones para el usuario
        System.out.println("Ingrese una frase o texto: ");
        // Creación y declaración de variable
        String cadena = scan.nextLine();

        // Instrucciones para el usuario
        System.out.println("\nIngrese una letra para contar cuantas veces aparece: ");
        // Creación, declaración de variable y método para uso de char
        char letra = scan.next().charAt(0);

        // Variable longitud de la cadena y variable contador
        int longitud = cadena.length();
        int contador = 0;

        // Bucle para recorrer toda la cadena
        for (int i = 0; i < longitud; i++) {
            // Variable para ir letra a letra del texto
            char caracter = cadena.charAt(i);

            // Condicional para comparar cada letra del texto
            if (caracter == letra) {
                contador++;
            }
        }
        // Salida por pantalla con el resultado
        System.out.println("La letra "+ letra + " aparece " + contador + " veces.");

        // Finalizacion Scanner
        scan.close();
    }
}
