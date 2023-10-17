/*
Crear un algoritmo que muestre un menú como este:
1) Salir
2) Sumatorio
3) Factorial
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