/*
Se dispone de una lista de Strings, de la cual saber la cantidad de valores que
comiencen con la letra B (tanto mayúscula como minúscula, en ese caso decimos
que será ignoreCase).
*/
package Complementary.Level_03;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise_03 {

    public static void main(String[] args) {
        // Input
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl",
            "Wonder Woman", "brainiac");

        List<String> palabrasConB = palabras.stream()
            .filter(letraB -> letraB.charAt(0) == 'b' || letraB.charAt(0) == 'B')
            .collect(Collectors.toList());

        // Output
        System.out.println(palabrasConB.size());
    }
}
