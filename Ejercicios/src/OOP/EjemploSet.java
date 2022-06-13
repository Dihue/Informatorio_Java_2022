package OOP;

import java.util.HashSet;
import java.util.Set;

public class EjemploSet {
    public static void main(String[] args) {
        // Interface Set del tipo String e instanciado una lista
        // Implementacion de un Set, con un HashSet
        Set<String> nombres = new HashSet<>();

        // Cargar el Set y mostrar el tamaña luego
        cargarSet(nombres);
        System.out.println("\nTamaño de la lista luego de cargarla: " + nombres.size());

        // Iterar y mostrar (for each)
        for (String nombre: nombres) {
            System.out.println(nombre);
        }

        // Pregunto si la lista tiene un elemento dado
        System.out.println("\nExiste \"Maria\" en la lista " + nombres.contains("Maria"));

        // Eliminar un elemento
        nombres.remove("Juan");

        System.out.println("\nTamaño de la lista luego de remover: " + nombres.size());
    }

    // Procedimiento (void) no usa return
    private static void cargarSet(Set<String> nombres) {
        // Se muestran los elementos con distintos orden
        nombres.add("Dihue");
        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Homero");
        nombres.add("Lisa");
    }
}
