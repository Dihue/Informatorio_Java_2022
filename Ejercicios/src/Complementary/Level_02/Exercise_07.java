/*
Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos
devuelva un array de Strings. Con la secuencia de números enteros de principio a final.
Pero si el número es múltiplo de 2, colocara el valor “Fizz”, si es múltiplo de 3 “Buzz”
y si es a la vez múltiplo de ambos colocara “FizzBuzz”.

Observación: Los 2 argumentos indican con que valor se arranca a calcular y el segundo
con qué valor debe frenar (no se incluye en el cálculo).

Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4
 */
package Complementary.Level_02;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        // Creación del objeto Scanner
        Scanner scan = new Scanner(System.in);

        // Salida por pantalla y escaneo de valores ingresados por consola
        System.out.println("Ingrese primer valor menor: ");
        int num1 = scan.nextInt();
        System.out.println("Ingrese segundo valor mayor: ");
        int num2 = scan.nextInt();

        // Declaración del arreglo del tipo String
        String[] arreglo = new String[num2 - num1];

        // Iteraciones entre los extremos del arreglo
        for (int i = num1; i < num2 ; i++) {
            // Condicionales con sus respectivas salidas por pantalla
            if (multiplo2(i) && multiplo3(i)) {
                System.out.print("FizzBuzz ");
            }
            else if (multiplo3(i)) {
                System.out.print("Buzz ");
            }
            else if (multiplo2(i)) {
                System.out.print("Fizz ");
            }
            else {
                System.out.print(i + " ");
            }
        }
        // Finalización Scanner
        scan.close();
    }
    // Función para verificar número múltiplo de 2
    public static boolean multiplo2(int numero) {
        return (numero % 2 == 0);
    }

    // Función para verificar número múltiplo de 3
    public static boolean multiplo3(int numero) {
        return (numero % 3 == 0);
    }
}