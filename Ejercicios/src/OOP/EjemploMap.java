package OOP;

import java.util.HashMap;
import java.util.Map;

public class EjemploMap {
    public static void main(String[] args) {
        Map<Integer, String> alumnos = new HashMap<>();

        // Cargar el Map y mostrar el tamaño luego
        cargarMap(alumnos);
        System.out.println("\nTamaño del Map, luego de cargarlo: " + alumnos.size());

        // Iterar y mostrar clave valor
        // Objetos Entry de tipo clave valor
        // entrySet metodo para acceder a las claves valor
        for (Map.Entry<Integer,String> registro: alumnos.entrySet()) {
            System.out.println("\nID: " + registro.getKey() + " Nombre: " + registro.getValue());
        }

        // Iterar y solo mostrar las claves
        for (Integer clave: alumnos.keySet()) {
            System.out.println("\nID: " + clave);
        }

        // Iterar y mostrar solo los valores
        for (String valor: alumnos.values()) {
            System.out.println("\nID: " + valor);
        }

        // Pregunto si Map contiene una clave dada
        System.out.println("\nExiste la clave 1234 en el Map: " + alumnos.containsKey(1234));
        System.out.println("\nExiste el valor 1234 en el Map: " + alumnos.containsValue("1234"));

        // Eliminar un elemento
        alumnos.remove(2345);
    }

    private static void cargarMap(Map<Integer, String> alumnos) {
        // Mismo concepto de los diccionarios en python
        alumnos.put(1234, "Dihue");
        alumnos.put(2345, "Juan");
        alumnos.put(3456, "Maria");
        alumnos.put(4567, "Homero");
        alumnos.put(5678, "Lisa");
    }
}
