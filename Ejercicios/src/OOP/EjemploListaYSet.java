package OOP;

import java.util.ArrayList;
import java.util.List;

public class EjemploListaYSet {
    public static void main(String[] args) {
        // Inter face List del tipo String e instancia una lista
        // Implementación de un List, con un ArrayList
        List<String> nombres = new ArrayList<>();

        // Cargar la lista y mostrar el tamaño luego
        cargarLista(nombres);
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
    private static void cargarLista(List<String> nombres) {
        nombres.add("Damian");
        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Homero");
        nombres.add("Lisa");
    }
}
