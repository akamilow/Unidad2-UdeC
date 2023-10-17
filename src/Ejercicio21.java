/*
Desarrollar un algoritmo que ingresado el número de horas trabajadas de un empleado y el valor de hora calcule el salario neto a pagar. 
Teniendo en cuenta lo siguiente: que si el número de horas trabajadas es mayor a 40, 
el resto se determinan horas extras y al valor de la hora de las adicionales se le suma $2000 pesos. 
El valor de la rete fuente a aplicar es del 3% sino tiene horas extras y del 4.5% si tiene horas extras.
 */

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        System.out.println("Ingrese el valor de la hora: ");
        int valorHora = scanner.nextInt();
        scanner.close();

        int salario = horasTrabajadas * valorHora;

        if (horasTrabajadas > 40) {
            salario += 2000;
        }

        double reteFuente = 0;
        if (horasTrabajadas > 40) {
            reteFuente = salario * 0.045;
        } else {
            reteFuente = salario * 0.03;
        }

        double salarioNeto = salario - reteFuente;
        System.out.println("El salario neto a pagar es: " + salarioNeto);
    }
}