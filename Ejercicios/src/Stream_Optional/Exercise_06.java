/*
Sigamos con el mismo ejemplo. Pero ahora en base a la lista de productos, queremos
obtener otra lista que contendrá solo los productos con precio menor a 200000,00.
 */
package Stream_Optional;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise_06 {
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

        List<Producto> productoBaratos = catalogoProductos.stream()
                .filter(producto -> PRECIO_BUSQUEDA.compareTo(producto.getValor()) > 0)
                .collect(Collectors.toList());
        /*
        En este caso todos los productos que cumplan la condición del filter, serán agregados en
        una nueva colección que en este caso es una lista (Collectors es una clase utilitaria, y
        el método toList() es el método que creará una lista nueva y agrega consecutivamente los
        productos que reciba).
        */
        System.out.println(productoBaratos);
    }
}