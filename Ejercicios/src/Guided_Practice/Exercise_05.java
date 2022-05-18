package Guided_Practice;
/*
Desarrollar un programa que dado un número entero ingresado, nos retorne los valores
de ese número multiplicado por 1, 2, 3, … y 10.
 */

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresar número entero para multiplicar: ");
        int numero = scan.nextInt();
        scan.close();

        for (int i = 0; i < 10; i++) {
            System.out.println(numero + " * " + (i+1) + " = " + (i+1)*numero);
        }
    }
}
