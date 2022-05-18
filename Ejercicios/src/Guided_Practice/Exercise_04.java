package Guided_Practice;
/*
Realizar un programa que dado un número de entrada entre 1 a 7, nos devuelva el dia
de la semana de la siguiente forma:

Número              Dia
1                   Domingo
2                   Lunes
3                   Martes
4                   Miercoles
5                   Jueves
6                   Viernes
7                   Sabado
 */

import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresar un número entre 1 y 7: ");
        int dia = scan.nextInt();
        scan.close();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miércoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sábado");
            default:
                System.out.println("Valor incorrecto");
        }
    }
}