/*
Dada una lista que contiene números enteros, se deberá generar otra lista que
contendrá el resultado de aplicar la operación de potencia a 2.
 */
package Complementary.Level_03;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise_02 {

    public static void main(String[] args) {
        // Input
        List<Integer> numeros = List.of(1,2,3,4,5);

        List<Integer> potenciados = numeros.stream()
            .map(integer -> integer * integer)
            .collect(Collectors.toList());

        // Output
        System.out.println(potenciados);
    }
}
