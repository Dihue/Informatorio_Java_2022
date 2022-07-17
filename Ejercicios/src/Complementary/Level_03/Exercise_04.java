/*
Se dispone de una lista de Integer, de la cual queremos obtener otra lista
aplicando la operación de factorial, pero no se desean valores repetidos.
*/
package Complementary.Level_03;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise_04 {

    public static void main(String[] args) {
        // Input
        List<Integer> numeros = List.of(1,2,4,4,4);

        List<Integer> numerosFactoriados = numeros.stream()
            .distinct()
            .map(numero -> factorial(numero))
            .collect(Collectors.toList());

        // Output
        System.out.println(numerosFactoriados);
    }

    private static Integer factorial(Integer entrada) {
        if (entrada <= 1) {
            return 1;
        } else {
            return (entrada * factorial(entrada-1));
        }
    }
}