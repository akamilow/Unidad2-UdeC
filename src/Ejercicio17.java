/*
Desarrolle un algoritmo que calcule el cuadrado de un número haciendo sólo sumas. 
Ayuda: el cuadrado de un número n es la suma de los n primeros números impares. Ejemplo: 32=1+3+5=9.
*/

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int digitoImpar = 0;
        int cuadrado = 0;
    
        System.out.println("Ingrese un numero: ");
        numero = input.nextInt();
        input.close();

        String numeroString = Integer.toString(numero);

        for (int i = 0; i < numeroString.length(); i++) {
            if (numeroString.charAt(i) % 2 != 0) {
                digitoImpar = Character.getNumericValue(numeroString.charAt(i));
                break;
            }
        }

        for (int i = 0; i < digitoImpar; i++) {
            cuadrado += digitoImpar;
        }

        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);

    }
}
