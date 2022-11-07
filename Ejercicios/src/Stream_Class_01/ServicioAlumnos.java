package Stream_Class_01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

public class ServicioAlumnos {
    // Se agrega la exception en caso de que no se encuentre o no exista el archivo
    public static void main(String[] args) throws IOException {
        // Se emplea la dirección absoluta del archivo
        File file = new File(
            "D:\\Dihue\\Desktop\\INFO\\JAVA\\Informatorio_Java_2022\\Ejercicios\\src\\Stream_Class_01\\alumnos.txt");

        System.out.println("Archivo: " + file.getName());

        // Creación de un objeto de clase BufferedReader
        BufferedReader br
            = new BufferedReader(new FileReader(file));

        // Declaración de variable String
        String linea;
        // Condition holds true till
        // there is character in a string
        while ((linea = br.readLine()) != null) {
            // Print the string
            System.out.println(linea);
            // Método crear alumno del objeto Alumno
            Alumno alumno = crearAlumno(linea);

            // Uso de Integer para aceptar null y operador elif?
            Integer edad = alumno.getFechaNacimiento() != null ? calcularEdad(alumno.getFechaNacimiento()) : null;

            System.out.printf("Alumno: %s %s tiene %s años%n",
                alumno.getNombre(), alumno.getApellido(), edad != null ? edad : "N/A");
        }
    }

    private static int calcularEdad(LocalDate fechaNacimiento) {
        // Variable con la facha actual
        LocalDate now = LocalDate.now();

        // Variable que devuelve los años que hay entre 2 fechas
        int edad = Period.between(fechaNacimiento, now).getYears();
        return edad;
    }

    private static Alumno crearAlumno(String linea) {
        // Arreglo para el manejo de los datos en forma de string separados
        String[] valores = linea.split(",");

        // Variable para el manejo de la fecha, antes de que entre al constructor
        LocalDate fechaNac;

        // Manejo en el caso de posible error de escritura de la fecha
        try {
            fechaNac = LocalDate.parse(valores[2]);
        } catch (DateTimeParseException exception) {
            fechaNac = null;
        }

        Alumno alumno = new Alumno(valores[1],valores[0], fechaNac,valores[3]);
        return alumno;
    }
}