/*
Desarrolle una clase ejecutable que convierta un número entero en otro número entero 
que será el primero pero con las cifras que lo forman escritas al revés. 
Ejemplo: convertirá el número entero 1842 en el 2481.
*/

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int numero = scan.nextInt();
        scan.close();

        String numeroString = Integer.toString(numero);
        String numeroStringInvertido = "";

        for (int i = numeroString.length() - 1; i >= 0; i--) {
            numeroStringInvertido += numeroString.charAt(i);
        }

        int intNumInvertido = Integer.parseInt(numeroStringInvertido);

        System.out.println("El numero invertido es: " + intNumInvertido);
    }
}
