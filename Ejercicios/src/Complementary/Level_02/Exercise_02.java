/*
Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al
principio de la lista y otro al final. Por último, iterar e imprimir los elementos
de la lista y el tamaño de la misma (antes y después de agregar a en la primera y
última posición).
 */
package Complementary.Level_02;

import java.util.ArrayList;
import java.util.List;

public class Exercise_02 {
    public static void main(String[] args) {
        // Inter face List del tipo Integer e instancia de una lista
        List<Integer> numeros = new ArrayList<>();

        // Método para cargar la lista
        cargarNumeros(numeros);

        System.out.println("Lista original: ");
        // Método para mostrar la lista
        mostrarNumeros(numeros);
        System.out.println("\nTamaño de la lista es " + numeros.size());

        // Agregado de número al principio de la lista
        numeros.add(0,8);

        System.out.println("\nLista con agregado al inicio: ");
        // Método para mostrar la lista
        mostrarNumeros(numeros);
        System.out.println("\nTamaño de la lista es " + numeros.size());

        // Agregado de número al final de la lista
        numeros.add(0);

        System.out.println("\nLista con agregado al final: ");
        // Método para mostrar la lista
        mostrarNumeros(numeros);
        System.out.println("\nTamaño de la lista es " + numeros.size());
    }

    private static void mostrarNumeros(List<Integer> numeros) {
        // Iterar y mostrar los elementos de la lista
        for (Integer numero : numeros) {
            System.out.print(numero + " ");
        }
    }

    private static void cargarNumeros(List<Integer> numeros) {
        numeros.add(21);
        numeros.add(3);
        numeros.add(11);
        numeros.add(91);
        numeros.add(73);
    }
}
