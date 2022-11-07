package com.informatorio.shop.model;

import java.math.BigDecimal;

public class Producto {
	private Long id;
	private String nombre;
	private BigDecimal precioUnitario;
	private String categoria;
	private boolean promocion;

	public Producto(Long id, String nombre, BigDecimal precioUnitario, String categoria,
		boolean promocion) {
		this.id = id;
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.categoria = categoria;
		this.promocion = promocion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}

	@Override
	public String toString() {
		return "Producto{" +
			"id=" + id +
			", nombre='" + nombre + '\'' +
			", precioUnitario=" + precioUnitario +
			", categoria='" + categoria + '\'' +
			", promocion=" + promocion +
			'}';
	}
}
