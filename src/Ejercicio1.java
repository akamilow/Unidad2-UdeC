/*
Realizar un programa que Ingrese los datos del deportista e imprima, si es acto o no para poder ejercer el deporte, con las siguientes condiciones.
a. Que sea mayor de 15 años
b. Que sea colombiano
c. Que tengo un peso entre 60 y 90 kilos
*/
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, nacionalidad;
        int edad;
        double peso;

        System.out.print("Ingrese el nombre del deportista: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese la edad del deportista: ");
        edad = sc.nextInt();
        System.out.print("Ingrese la nacionalidad del deportista: ");
        nacionalidad = sc.next();
        System.out.print("Ingrese el peso del deportista: ");
        peso = sc.nextDouble();

        sc.close();

        if (edad > 15 && nacionalidad.equals("colombiano") && peso >= 60 && peso <= 90) {
            System.out.println("El deportista " + nombre + " es apto para ejercer el deporte.");
        } else {
            System.out.println("El deportista " + nombre + " no es apto para ejercer el deporte.");
        }
    }
}
