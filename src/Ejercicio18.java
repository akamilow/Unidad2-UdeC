/*
En una tienda de descuento las personas que van a pagar el valor de sus compra llegan a la caja y sacan una bolita de color, 
que les dirá el descuento que tendrán sobre el total de su compra. 
Determinar la cantidad que pagara cada cliente desde que la tienda abre hasta que cierra. 
Se sabe que si el color de la bolita es rojo, el cliente obtendrá un 40% de descuento; si es amarillo un 25% y si es blanco no obtendrá descuento.
*/

import java.util.Scanner;
import java.util.Random;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int descuento, total, bolita, totalPagar = 0;

        System.out.println("Ingrese el valor de su compra: ");
        total = input.nextInt();
        input.close();

        bolita = random.nextInt(3);

        if (bolita == 0) {
            System.out.println("Su bolita es roja 40% de descuento");
        } else if (bolita == 1) {
            System.out.println("Su bolita es amarilla 25% de descuento");
        } else {
            System.out.println("Su bolita es blanca 0% de descuento");
        }

        switch (bolita) {
            case 0:
                descuento = total * 40 / 100;
                totalPagar = total - descuento;
                break;
            case 1:
                descuento = total * 25 / 100;
                totalPagar = total - descuento;
                break;
            case 2:
                totalPagar = total;
                break;
        }
        System.out.println("El total a pagar es: " + totalPagar);
    }
}