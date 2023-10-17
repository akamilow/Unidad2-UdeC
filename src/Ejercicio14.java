/*
Implementar un algoritmo que seleccione en forma aleatoria un número entre 1 y 1000 y el jugador debe acertarlo. 
En cada intento, el jugador propondrá un número y el algoritmo le informara si es mayor o menor. 
El juego termina cuando el número sea encontrado. Es necesario llevar un conteo de los intentos. 

Al finalizar el juego, debe aparecer un mensaje relacionado con el número de intentos: 
- De 1 a 3 Suertudo 
- De 4 a 6 Genio 
- De 7 a 8 Se puede mejorar 
- De 9 en adelante No eres muy inteligente
*/

import java.util.Scanner;
import java.util.Random;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;
        int inputNum;
        int numIntentos = 0;

        do {
            System.out.println("Ingrese el numero: ");
            inputNum = input.nextInt();
            if (inputNum < randomNum) {
                System.out.println("El numero secreto es mayor");
            } else if (inputNum > randomNum) {
                System.out.println("El numero secreto es menor");
            } else {
                System.out.println("Fin del juego...");
            }
            numIntentos++;
        } while (inputNum != randomNum);
        input.close();

        System.out.println("=======================================");
        System.out.println("HAS GANADO EL NUMERO SECRETO ERA: " + randomNum);
        System.out.println("=======================================");
        
        if (numIntentos >= 1 && numIntentos <= 3 ) {
            System.out.println("SUERTUDO");
        } else if (numIntentos >= 4 && numIntentos <= 6 ) {
            System.out.println("GENIO");
        } else if (numIntentos >= 7 && numIntentos <= 8 ) {
            System.out.println("SE PUEDE MEJORAR");
        } else {
            System.out.println("NO ERES MUY INTELIGENTE");
        }
    }
}
