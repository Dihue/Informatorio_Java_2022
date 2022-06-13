/*
Crear una lista que contenga como elementos la numeración de cartas de una baraja
francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en orden),
imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList y volver a
imprimir.
 */
package Complementary.Level_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise_03 {
    public static void main(String[] args) {
        // Inter face Lista del tipo Integer e instancia de una lista
        List<Integer> baraja = new ArrayList<>();

        // Método para cargar la lista
        cargarBaraja(baraja);

        System.out.println("Baraja ordenada: ");
        // Método para mostrar la lista
        mostrarBaraja(baraja);

        // Librería para invertir orden de la lista
        Collections.reverse(baraja);
        System.out.println("\n Baraja ordenada inverso: ");
        // Método para mostrar la lista
        mostrarBaraja(baraja);

        // Librería para dar un orden aleatorio a la lista
        Collections.shuffle(baraja);
        System.out.println("\nBaraja con orden aleatorio: ");
        // Método para mostrar la lista
        mostrarBaraja(baraja);
    }

    private static void mostrarBaraja(List<Integer> baraja) {
        for (Integer numero: baraja) {
            System.out.print(numero + " ");
        }
    }

    private static void cargarBaraja(List<Integer> baraja) {
        for (int i = 1; i <= 10 ; i++) {
            baraja.add(i);
        }
    }
}
