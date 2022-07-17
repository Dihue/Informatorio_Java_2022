/*
Supongamos que del ejercicio anterior queremos lanzar una excepción si no llegáramos
a encontrar el primer producto que su precio unitario sea menor a 200000,00.
Usaremos una excepción no chequeada (RuntimeException) para simplificar el ejercicio.
Pero en escenarios reales se prefiere excepciones chequeadas.
 */
package Stream_Optional;

import java.math.BigDecimal;
import java.util.List;

public class Exercise_05 {
    /*
    Utilizaremos una constante para esta prueba, pero en un escenario real,
    será una variable que el usuario/sistema lo proveerá
    */
    private static final BigDecimal PRECIO_BUSQUEDA = new BigDecimal("200000.00");

    public static void main(String[] args) {
        // Creamos una lista de Producto
        List<Producto> catalogoProductos = List.of(
                new Producto("iPhone 13 Pro", "Celulares", new BigDecimal("400000.00")),
                new Producto("Samsung S21 Ultra", "Celulares", new BigDecimal("200000.00")),
                new Producto("Xiaomi A3", "Celulares", new BigDecimal("50000.00"))
        );

        Producto productoBarato = catalogoProductos.stream()
                .filter(producto -> PRECIO_BUSQUEDA.compareTo(producto.getValor()) > 0)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No se encontró producto menor a " + PRECIO_BUSQUEDA));
        /*
        En el ejercicio anterior si ningún producto cumplía la condición del filter, la operación devolverá
        Optional.empty(). Para estos escenarios se puede encadenar el método orElseThrow() para lanzar una
        excepción.

        De esa forma podemos decir que si encontramos un objeto producto que cumpla la condición lo asigna-
        remos a la variable productoBarato, caso contrario lanzaremos exception.
        */

        System.out.println("El primer producto que se encontró, menor a " +
                PRECIO_BUSQUEDA + " es " + productoBarato);
    }
}