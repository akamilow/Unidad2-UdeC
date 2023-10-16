/*
Una empresa Mypime, paga a sus vendedores mediante, comisiones, 
los vendedores reciben $250.000 pesos por semana, más el 9% de sus ventas durante esa semana, 
calcule cuanto es valor por pagar por mes vendedor, el número de vendedores son 5.
*/

import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer vendedores = 5;
        Integer salario = 250000;
        Integer ventas = 0;
        Double total = 0.0;

        for (int i = 0; i < vendedores; i++) {
            System.out.println("Ingrese las ventas del vendedor " + (i + 1) + ": ");
            ventas = scanner.nextInt();
            int sumaVentas = 0;
            for (int j = 0; j < ventas; j++) {
                System.out.println("Valor de la venta " + (j + 1) + ": ");
                sumaVentas += scanner.nextInt();
            }
            total = salario + (sumaVentas * 0.09);
            System.out.println("El salario del vendedor " + (i + 1) + " es: " + total);
            System.out.println("=============================================");
        }
        scanner.close();
    }
    
}
