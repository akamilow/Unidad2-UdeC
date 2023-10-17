/*
Desarrollar un algoritmo que permita calcular e imprimir en pantalla los números primos que están comprendidos entre 1 y 100.
 */

/**
 * Ejercicio22
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                System.out.println(i);
            }
        }
    }
}