package com.informatorio.shop.controller;

import com.informatorio.shop.model.Producto;
import com.informatorio.shop.repository.FakeShopRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Anotación de Spring del tiro REST
@RestController
public class shopcontroller {
	// Inyectar el repository mediante constructor
	private FakeShopRepository fakeShopRepository;

	@Autowired
	public shopcontroller(FakeShopRepository fakeShopRepository) {
		this.fakeShopRepository = fakeShopRepository;
	}

	// Método GET
	@GetMapping
	public String hello() {
		return "HOLA";
	}

	// Método GET
	@GetMapping("/productos")
	// Busqueda de productos en produccion
	// Uso de required para que no sea necesario el parametro al llamar a todos los productos
	public Collection<Producto> buscarTodosLosProductos(@RequestParam(required = false) Boolean promocion) {
		if (promocion != null) {
			return fakeShopRepository.buscarEnPromocion();
		}
		return fakeShopRepository.buscarTodos();
	}

	// Método POST para agregar un producto
	@PostMapping("/productos")
	// Va a llegar un body de un objeto producto
	public void guardarProducto(@RequestBody Producto producto) {
		fakeShopRepository.guardarProducto(producto);
	}

	// Método DELETE para eliminar un producto
	@DeleteMapping("/productos/{id}")
	// Nombre entre llaves igual que el nombre del parámetro
	public void borrarProducto(@PathVariable Long id) {
		fakeShopRepository.borrarProducto(id);
	}
}
