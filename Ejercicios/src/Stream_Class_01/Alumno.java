package Stream_Class_01;

import java.time.LocalDate;

public class Alumno {

	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String pais;
	// Normalización de las clases
	private Direccion direcciones;

	public Alumno(String nombre, String apellido, LocalDate fechaNacimiento, String pais) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.pais = pais;
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

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Alumno{" +
			"nombre='" + nombre + '\'' +
			", apellido='" + apellido + '\'' +
			", fechaNacimiento=" + fechaNacimiento +
			", pais='" + pais + '\'' +
			'}';
	}
}