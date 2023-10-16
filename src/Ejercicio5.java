/*
Digitado dos Dados, dado1 y dado2, utilizando una función (Aleatoria), 
si la cara de los dados cae dado1=6 y dado=4, imprimir eres un afortunado, 
¡sino cumple con la condición inténtalo de nuevo!
*/
import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer dado1 = random.nextInt(6) + 1;
        Integer dado2 = random.nextInt(6) + 1;

        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);

        if (dado1 == 6 && dado2 == 4) {
            System.out.println("Eres un afortunado.");
        } else {
            System.out.println("Inténtalo de nuevo.");
        }
    }
    
}
