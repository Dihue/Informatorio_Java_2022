package Guided_Practice;

public class Exercise_07 {
    // Variable de Clase
    private static String bienvenida = "Bienvenido";

    public static void main(String[] args) {
        System.out.println(bienvenida);

        String hola = "hola!";

        imprimirTextoXVeces(hola,3);
    }

    // Firma del Metodo                     Parametros del Metodo
    public static void imprimirTextoXVeces(String texto, int contador) {
        // Cuerpo del Metodo
        // Bucle for
        for (int i = 0; i < contador; i++) {
            System.out.println(texto);
        }
    }
}
