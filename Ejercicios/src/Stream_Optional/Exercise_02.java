/*
Crear un Stream a partir de una colección.
Crear una lista con todas las vocales y pasarla a stream.
 */
package Stream_Optional;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Exercise_02 {
    public static void main(String[] args) {
        Collection<String> vocales = Arrays.asList("a","e","i","o","u");

        System.out.println(vocales);

        Stream<String> vocalesStream = vocales.stream();

        System.out.println(vocalesStream);

        vocalesStream.forEach(s -> System.out.println(s));
    }
}
