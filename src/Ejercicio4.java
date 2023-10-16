/*Imprimir el numero digitado del Rango 1 a 15 en asteriscos, solo acepta números positivos:
Ejemplo si el numero digitado es 7, imprime ******* (7 asteriscos)
 */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número positivo:");
        Integer numero = input.nextInt();

        input.close();

        if (numero > 0) {
            for (int i = 0; i < numero; i++) {
                System.out.print("*");
            }
        } else {
            System.out.println("El número debe ser positivo.");
        }    
    }
}