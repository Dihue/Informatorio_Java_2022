/*
Ahora necesitamos solamente el nombre de los productos con precio menor a 200000.00.
Para ellos queremos extraer de un List<Product> a un List<String>.
 */
package Stream_Optional;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise_07 {
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

        List<String> nombreProductoBarato = catalogoProductos.stream()
                .filter(producto -> PRECIO_BUSQUEDA.compareTo(producto.getValor()) > 0)
                .map(producto -> producto.getNombre())
                .collect(Collectors.toList());
        /*
        En este caso usaremos la operación de agregación .map(). Que tiene como objetivo mapear un
        objeto producto a uno String, por medio del método getNombre() de la clase Producto.
         */
        System.out.println(nombreProductoBarato);
    }
}