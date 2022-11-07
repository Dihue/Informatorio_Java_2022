package Stream_Class_02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;

public class ServicioEmpleados {

	public static void main(String[] args) {
		// Objeto archivo
		File file = new File(
"D:\\Dihue\\Desktop\\INFO\\JAVA\\Informatorio_Java_2022\\Ejercicios\\src\\Stream_Class_02\\empleados.csv");

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

		System.out.println("Archivo: " + file.getName());

		String linea;
		while (true) {
			try {
				if ((linea = br.readLine()) == null)
					break;
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			String[] valores = linea.split(",");
			Empleado empleado = crearEmpleado(valores);

			imprimirMernsaje(empleado);

			System.out.printf("%s %s tiene %s años de antigüedad\n",
				empleado.getNombre(), empleado.getApellido(),
				calcularAntiguedad(empleado.getFechaIngreso()));
		}
	}

	private static void imprimirMernsaje(Empleado empleado) {
		String mensajeFormateado = "%s %s tiene %s años de antigüedad\n";
		String mensajeFormateadoSinAntiguedad = "%s %s no tiene antiguedad disponible\n";
		Integer antiguedad = calcularAntiguedad(empleado.getFechaIngreso());

		if (antiguedad != null) {
			System.out.printf(mensajeFormateado, empleado.getNombre(), empleado.getApellido(), antiguedad);
		} else {
			System.out.printf(mensajeFormateadoSinAntiguedad, empleado.getNombre(), empleado.getApellido());
		}
	}

	private static Integer calcularAntiguedad(LocalDate fechaIngreso) {
		if (fechaIngreso != null) {
			LocalDate fechaActual = LocalDate.now();
			return Period.between(fechaIngreso, fechaActual).getYears();
		}
		return null;
	}

	private static Empleado crearEmpleado(String[] valores) {
		LocalDate fechaIngreso;
		try {
			fechaIngreso = LocalDate.parse(valores[2]);
		} catch (DateTimeException e) {
			fechaIngreso = null;
		}

		return new Empleado(valores[0], valores[1], fechaIngreso,
			Integer.valueOf(valores[3]));
	}
}