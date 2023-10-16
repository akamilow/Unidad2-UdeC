/*
Realizar un algoritmo que recibido por teclado tres lados de un triángulo y determine si el triángulo es Isósceles, Equilátero o Escaleno.
*/

import java.util.Scanner;

public class Ejercicio7 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el primer lado del triángulo: ");
            Integer lado1 = scanner.nextInt();
            System.out.println("Ingrese el segundo lado del triángulo: ");
            Integer lado2 = scanner.nextInt();
            System.out.println("Ingrese el tercer lado del triángulo: ");
            Integer lado3 = scanner.nextInt();
    
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es equilátero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("El triángulo es isósceles");
            } else {
                System.out.println("El triángulo es escaleno");
            }
            scanner.close();
        }
}