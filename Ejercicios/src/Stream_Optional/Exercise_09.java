/*
Deseamos ahora actualizar el precio unitario de cada producto de la lista en +15%.
*/
package Stream_Optional;

import java.math.BigDecimal;
import java.util.List;

public class Exercise_09 {
    /*
    Utilizaremos una constante para esta prueba, pero en un escenario real,
    será una variable que el usuario/sistema lo proveerá
    */
    private static final BigDecimal PRECIO_BUSQUEDA = new BigDecimal("200000.00");

    public static void main(String[] args) {
        List<Producto> catalogoProductos = List.of(
            new Producto("iPhone 13 Pro", "Celulares", new BigDecimal("400000.00")),
            new Producto("Samsung S21 Ultra", "Celulares", new BigDecimal("200000.00")),
            new Producto("Xiaomi A3", "Celulares", new BigDecimal("50000.00"))
        );

        catalogoProductos.stream()
            .forEach(producto ->
                producto.setValor(producto.getValor().multiply(new BigDecimal("1.15"))));

        catalogoProductos.stream()
            .forEach(producto -> System.out.println(producto));
    }
}
