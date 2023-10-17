/*
Crear un algoritmo que muestre un menú como este:
1) Salir
2) Sumatorio
3) Factorial

Tras mostrar el menú, el algoritmo debe leer un número del 1 al tres si se elige 1, el programa acaba. 
Si se elige 2 se calcula el sumatorio del número, si se elige 3 se calcula el factorial 
(en ambos casos el algoritmo pedirá escribir el número sobre el que se calcula el sumatorio o el factorial). 
Tras calcular el sumatorio o el factorial e indicar el resultado, el algoritmo volverá a mostrar el menú y 
así sucesivamente.
*/

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("1) Salir");
            System.out.println("2) Sumatorio");
            System.out.println("3) Factorial");
            System.out.print("Opción: ");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Saliendo...");
                    break;
                case 2:
                    System.out.print("Introduce un número: ");
                    int numero = input.nextInt();
                    int sumatorio = 0;
                    for (int i = 1; i <= numero; i++) {
                        sumatorio += i;
                    }
                    System.out.println("El sumatorio de " + numero + " es " + sumatorio);
                    break;
                case 3:
                    System.out.print("Introduce un número: ");
                    numero = input.nextInt();
                    int factorial = 1;
                    for (int i = 1; i <= numero; i++) {
                        factorial *= i;
                    }
                    System.out.println("El factorial de " + numero + " es " + factorial);
                    break;
                default:
                    System.out.println("Opción incorrecta");
                input.close();
            }
        } while (opcion != 1);
    }
}