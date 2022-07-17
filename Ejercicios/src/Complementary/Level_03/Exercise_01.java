/*
Dada una lista que contiene valores de tipo String, se deberá filtrar todos los
valores que NO sean null o vacío ("").
*/
package Complementary.Level_03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise_01 {

    public static void main(String[] args) {
        // Input
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");

        List<String> palabrasValidas = palabras.stream()
            .filter(palabra -> palabra != null)
            .filter(palabra -> !(palabra.isEmpty()))
            .collect(Collectors.toList());

        // Output
        System.out.println(palabrasValidas);
    }
}