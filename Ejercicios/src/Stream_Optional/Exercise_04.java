/*
Supongamos que tenemos una lista con objetos de tipo Producto, que poseen atributos
nombre, tipo, precio unitario (String, String, BigDecimal), encontrar y devolver el
primer producto que su precio unitario sea menor a 200000.00. Caso contrario mostrar
mensaje de No encontrado (ver formato del mensaje en la imagen debajo).
 */
package Stream_Optional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class Exercise_04 {
    /*
    Utilizaremos una constante para esta prueba, pero en un escenario real,
    será una variable que el usuario/sistema lo proveerá
    */
    private static final BigDecimal PRECIO_BUSQUEDA = new BigDecimal("200000.00");

    public static void main(String[] args) {
        // Creamos una lista de Producto
        List<Producto> catalogoProductos = List.of(
                new Producto("iPhone 13 Pro","Celulares", new BigDecimal("400000.00")),
                new Producto("Samsung S21 Ultra","Celulares", new BigDecimal("200000.00")),
                new Producto("Xiaomi A3","Celulares", new BigDecimal("50000.00"))
        );

        // Al objeto catalogoProductos lo pasamos a stream con el método stream()
        /*
        Con la operación de agregación filter, evaluaremos si la condición que 200000.00 sea mayor
        que el precioUnitario de cada producto.
         */
        Optional<Producto> productoBarato = catalogoProductos.stream()
                .filter(producto -> PRECIO_BUSQUEDA.compareTo(producto.getValor()) > 0)
                .findFirst();
        /*
        Luego findFirst() captura el primer objeto que cumpla la condición del filter anterior y su
        valor es encerrado en un objeto Optional. Si ningún objeto cumpliera la condición del filter
        se retornará un Optional.empty() (que dentro encierra un valor null).
        */

        /*
        Para imprimir el mensaje encontrado o no, preguntaremos si productoBarato.isPresent() (que
        devolverá true si encierra un valor distinto a null, caso contrario false).
         */
        if (productoBarato.isPresent()) {
            // Para obtener el valor encerrado de un objeto Optional, invocamos el método get().
            System.out.println("El primer producto que se encontró, menor a " +
                    PRECIO_BUSQUEDA + " es " + productoBarato.get());
        } else {
            System.out.println("No se encontró producto menor a " + PRECIO_BUSQUEDA);
        }
    }
}

class Producto {
    private String nombre;
    private String tipo;
    private BigDecimal valor;

    public Producto(String nombre, String tipo, BigDecimal valor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "{" +
            "nombre='" + nombre + '\'' +
            ", tipo='" + tipo + '\'' +
            ", valor=" + valor +
            '}';
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
