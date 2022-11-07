package com.informatorio.shop.repository;

import com.informatorio.shop.model.Producto;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

// Hace de conexión con la base de datos
@Repository
public class FakeShopRepository {
	// Atributo privado como mapa
	private Map<Long, Producto> productos = initRepo();

	// Método
	public Collection<Producto> buscarTodos() {
		return productos.values();
	}

	public Collection<Producto> buscarEnPromocion() {
		return productos.values().stream()
			.filter(Producto::isPromocion)
			.collect(Collectors.toList());
	}

	public void guardarProducto(Producto producto) {
		productos.put(producto.getId(), producto);
	}

	public void borrarProducto(Long id) {
		productos.remove(id);
	}

	private Map<Long, Producto> initRepo() {
		Map<Long, Producto> map = new HashMap<>();

		map.put(1L, new Producto(
			1L, "Camisa", new BigDecimal("4999.99"), "Ropa", false));
		map.put(2L, new Producto(
			2L, "Zapatilla", new BigDecimal("8999.99"), "Calzado", true));
		map.put(3L, new Producto(
			3L, "Remera", new BigDecimal("2999.99"), "Ropa", true));

		return map;
	}
}
