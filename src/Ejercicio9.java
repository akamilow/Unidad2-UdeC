/*
Crear un algoritmo que lea cantidades y precios y al final indique el total de la factura. 
Primero se pregunta: Introduzca la cantidad vendida tras lo cual el usuario introducirá un número entero positivo. 
Después se pregunta: Introduzca el precio que será un número decimal positivo. 
La lectura termina cuando en la cantidad se introduzca un cero. Si es así se escribirá el total.
*/
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int cantidad;
        double precio, total = 0;
        
        System.out.print("Introduzca la cantidad vendida: ");
        cantidad = input.nextInt();
        
        while (cantidad != 0) {
            System.out.print("Introduzca el precio: ");
            precio = input.nextDouble();
            total += cantidad * precio;
            
            System.out.print("Introduzca la cantidad vendida: ");
            cantidad = input.nextInt();
        }

        input.close();

        System.out.println("=====================================");
        System.out.println("El total de la factura es: " + total);
        System.out.println("=====================================");
    }    
}
