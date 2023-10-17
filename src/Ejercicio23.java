/*
Desarrollar un algoritmo que permita ingresar un número entero e imprima por pantalla la conversión de ese número en Binario.
 */

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        String binario = "";
        while (numero > 0) {
            binario = numero % 2 + binario;
            numero /= 2;
        }
        System.out.println("El número en binario es: " + binario);
        scanner.close();
    }
}