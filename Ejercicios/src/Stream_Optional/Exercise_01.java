/*
Crear un Stream vacío
 */
package Stream_Optional;

import java.util.stream.Stream;

public class Exercise_01 {
    public static void main(String[] args) {
        Stream<String> streamVacio = Stream.empty();
        System.out.println(streamVacio);
    }
}
