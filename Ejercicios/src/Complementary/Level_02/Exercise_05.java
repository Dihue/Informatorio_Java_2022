/*
Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2)
del resumen de carga de horas semanal de un empleado. Se debe generar otra lista
que contenga los totales y luego imprimir el total final a cobrar.

Input
[6, 7, 8, 4, 5]
[350, 345, 550, 600, 320]
## Los arrays son iguales y corresponden a los días trabajados de una
semana Lun-Vie.

Output
[2100, 2415, 4400, 2400, 1600]
Total Final: $ 12915
 */
package Complementary.Level_02;

import java.util.ArrayList;
import java.util.List;

public class Exercise_05 {
    public static void main(String[] args) {
        // Declaración y asignación de variable
        int acumulador = 0;

        // Inter face Lista del tipo Integer e instancia de una lista
        List<Integer> horas_trabajadas = new ArrayList<>();
        List<Integer> valor_por_horas = new ArrayList<>();
        List<Integer> totales = new ArrayList<>();

        // Métodos para cargar las listas
        cargarHorasTrabajadas(horas_trabajadas);
        cargarValorHoras(valor_por_horas);

        // Iteración para cálculos parciales
        for (int i = 0; i < horas_trabajadas.size(); i++) {
            totales.add(i,(horas_trabajadas.get(i)* valor_por_horas.get(i)));
        }

        // Iteración para mostrar los cálculos parciales
        for (Integer total: totales) {
            System.out.print(total + " ");
        }

        // Iteración para el cálculo del total
        for (Integer total : totales) {
            acumulador = acumulador + total;
        }

        // Salida por pantalla del resultado final
        System.out.println("\nTotal final: $ " + acumulador);
    }

    private static void cargarValorHoras(List<Integer> valor_por_horas) {
        valor_por_horas.add(200);
        valor_por_horas.add(225);
        valor_por_horas.add(250);
        valor_por_horas.add(275);
        valor_por_horas.add(300);
    }

    private static void cargarHorasTrabajadas(List<Integer> horas_trabajadas) {
        horas_trabajadas.add(4);
        horas_trabajadas.add(5);
        horas_trabajadas.add(6);
        horas_trabajadas.add(8);
        horas_trabajadas.add(10);
    }
}
