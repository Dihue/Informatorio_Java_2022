/*
Se posee una Lista con objetos de clase Alumno con los atributos: apellido,
nombre y fechaDeNacimiento (con tipos: String, String y LocalDate). Se desea
generar un Map<String, Integer> donde la clave de Map será el apellido
concatenado con el nombre (con separador de espacio en blanco) y el value la
edad del alumno.

*   La lista de entrada debe estar cargada con varios alumnos (al menos 5)
    para subir el ejemplo y demostrar su funcionamiento.
*   En ejemplo se muestra solo con 1 Alumno a modo de abreviar
*   En el ejemplo también se usa LocalDate.now().minusYears(30), en el
    ejercicio a presentar se deberá usar otra técnica de construcción para la
    fecha (no usar .now(). Pueden ver métodos .parse(), etc)
*/
package Complementary.Level_03;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise_05 {

    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
            new Alumno("Simpson","Homer",LocalDate.parse("1956-05-12")),
            new Alumno("Simpson","Marge",LocalDate.parse("1954-03-19")),
            new Alumno("Simpson","Bart",LocalDate.parse("1979-12-17")),
            new Alumno("Simpson","Lisa",LocalDate.parse("1982-01-25")),
            new Alumno("Simpson","Maggie",LocalDate.parse("1985-08-19"))
        );

        Map<String, Integer> mapaAlumnos = alumnos.stream()
            .collect(Collectors
                .toMap(clave -> clave.getApellidoNombre(), valor -> valor.calcularEdad(valor.getFechaDeNacimiento())));

        System.out.println(mapaAlumnos);
    }
}

class Alumno {
    private String apellido;
    private String nombre;
    private LocalDate fechaDeNacimiento;

    public Alumno(String apellido, String nombre, LocalDate fechaDeNacimiento) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String getApellidoNombre() {
        return apellido + " " + nombre;
    }

    public int calcularEdad(LocalDate fechaDeNacimiento) {
        LocalDate now = LocalDate.now();
        int edad = Period.between(fechaDeNacimiento, now).getYears();
        return edad;
    }
}