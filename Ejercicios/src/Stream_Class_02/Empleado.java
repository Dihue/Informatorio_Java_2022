package Stream_Class_02;

import java.time.LocalDate;

public class Empleado {
	private String nombre;
	private String apellido;
	private LocalDate fechaIngreso;
	private Integer sueldoBasico;

	public Empleado(String nombre, String apellido, LocalDate fechaIngreso, Integer sueldoBasico) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaIngreso = fechaIngreso;
		this.sueldoBasico = sueldoBasico;
	}

	@Override
	public String toString() {
		return "Empleado { " +
			"Nombre: " + nombre +
			" - Apellido: " + apellido +
			" - FechaNacimiento: " + fechaIngreso +
			" - Sueldo básico: " + sueldoBasico +
			" }";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Integer getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(Integer sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
}