/*
Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego imprimir
por pantalla el ranking
 */
package Complementary.Level_02;

import java.util.ArrayList;
import java.util.List;

public class Exercise_01 {
    public static void main(String[] args) {
        // Inter face List del tipo String e instancia de una lista
        List<String> ciudades = new ArrayList<>();

        // Método para cargar la lista
        cargarCiudades(ciudades);

        // Iterar y mostrar la lista
        for (int i = 0; i < ciudades.size() ; i++) {
                System.out.println("#"+ (i+1) + " " + ciudades.get(i));
        }
    }

    // Procedimiento (void) no se usa return
    private static void cargarCiudades(List<String> nombres) {
        nombres.add("Bariloche");
        nombres.add("Córdoba");
        nombres.add("Sáenz Peña");
    }
}
