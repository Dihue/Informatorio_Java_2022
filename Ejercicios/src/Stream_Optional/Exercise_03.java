/*
Cargar un stream que contenga N números. Y que comience con el número 40
 */
package Stream_Optional;

import java.util.stream.Stream;

public class Exercise_03 {
    public static void main(String[] args) {
        Stream<Integer> numeros = Stream.iterate(40, n -> n+2).limit(20);

        numeros.forEach(n -> System.out.println(n));

        System.out.println(numeros);
    }
}
