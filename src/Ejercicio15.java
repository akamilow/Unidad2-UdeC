/*
Simular la división usando solamente restas. Dados dos números enteros mayores de uno, 
desarrollar un algoritmo calcule el cociente y el residuo usando sólo restas. 
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
este resultado es el residuo, y el número de restas realizadas es el cociente.
*/

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dividendo, divisor, cociente = 0, residuo = 0;

        System.out.println("Ingrese el dividendo: ");
        dividendo = input.nextInt();
        System.out.println("Ingrese el divisor: ");
        divisor = input.nextInt();
        input.close();

        while (dividendo >= divisor) {
            dividendo -= divisor;
            cociente++;
        }
        residuo = dividendo;

        System.out.println("El cociente es: " + cociente);
        System.out.println("El residuo es: " + residuo);
    }
}