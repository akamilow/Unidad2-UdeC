/*
Realice un programa que ingrese un Número de 3 dígitos. Lo divide en 3 dígitos independiente, e imprimir cual no es ni mayor ni menor de los dígitos.
N=371; el Numero del medio es 3.
*/
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, digito1, digito2, digito3;

        System.out.print("Ingrese un número de 3 dígitos: ");
        numero = sc.nextInt();

        if (numero < 100 || numero > 999) {
            System.out.println("El número ingresado no es de 3 dígitos.");
            System.exit(0);
        }

        sc.close();
        
        digito1 = numero / 100;
        digito2 = (numero % 100) / 10;
        digito3 = numero % 10;

        if (digito1 > digito2 && digito1 < digito3) {
            System.out.println("El digito del medio es: " + digito1);
        } else if (digito2 > digito1 && digito2 < digito3) {
            System.out.println("El digito del medio es: " + digito2);
        } else if (digito3 > digito1 && digito3 < digito2) {
            System.out.println("El digito del medio es: " + digito3);
        } else {
            System.out.println("No hay digito del medio.");
        }
    }
}
