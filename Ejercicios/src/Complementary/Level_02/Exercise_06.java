/*
Se dispone de una colección de Empleados, de cada empleado se conoce:
○ Nombre y Apellido
○ DNI
○ horasTrabajadas
○ valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo
(horasTrabajadas por valorPorHora) de toda esa lista para luego almacenar en un Map
(o Diccionario) donde la clave (key) es el dni y el valor (value) es el sueldo calculado.
 */
package Complementary.Level_02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Exercise_06 {
    public static void main(String[] args) {
        // Interface HashSet que emplea la clase Empleado
        HashSet<Empleado> empleados = new HashSet<Empleado>();
        // Interface Map del tipo String Integer
        Map<String, Integer> map = new HashMap<String, Integer>();

        // Constructor del objeto
        Empleado emp1 = new Empleado();
        emp1.apellido = "Damian";
        emp1.nombre = "Perez";
        emp1.dni = "12345678";
        emp1.horasTrabajadas = 40;
        emp1.valorPorHora = 1500;

        // Constructor del objeto
        Empleado emp2 = new Empleado();
        emp2.nombre = "Maria";
        emp2.apellido = "Gomez";
        emp2.dni = "12341234";
        emp2.horasTrabajadas = 36;
        emp2.valorPorHora = 1200;

        // Instancias de los objetos
        empleados.add(emp1);
        empleados.add(emp2);

        // Bucle para recorrer el hashSet
        for (Empleado calculo : empleados) {
            // Cálculo del sueldo
            int sueldo = calculo.horasTrabajadas * calculo.valorPorHora;
            // Agregado en el map
            map.put(calculo.dni, sueldo);
        }

        // Salida por pantalla
        System.out.println("{Dni=Sueldo} : " + map);
    }
}
// Clase con los atributos
class Empleado {
    public String nombre;
    public String apellido;
    public String dni;
    public int horasTrabajadas;
    public int valorPorHora;
}