/*
Desarrollar el algoritmo para el Juego de Picas y Fijas. 
El juego consiste en tratar de adivinar un número en la menor cantidad de intentos. 
En cada intento, el jugador dice 4 dígitos (no repetidos) y el oponente da pistas de cuántos aciertos tuvo, 
sin indicarle cuales fueron, de la siguiente forma: Si algún dígito que dice el jugador 
se encuentra dentro del número a adivinar, pero no está en la posición correcta, se llama PICA. 
Si el dígito se encuentra en la posición adecuada, se llama FIJA. Así, 
las pistas serán la cantidad de PICAS y la cantidad de FIJAS que se tienen. 
El juego termina cuando algún jugador tiene 4 FIJAS (4 dígitos en el orden adecuado).
*/

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> arrayGuess = new ArrayList<Integer>();
        ArrayList<Integer> arrayNumInput = new ArrayList<Integer>();

        for (int i = 0; i < 4; i++) {
            Integer num = random.nextInt(9) + 1;
            if (arrayGuess.contains(num)) {
                i--;
            } else {
                arrayGuess.add(num);
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite numero "+(i+1)+":");
            arrayNumInput.add(input.nextInt());
        }
        input.close();

        
        System.out.println(arrayGuess);
        System.out.println(arrayNumInput);
        

        System.out.println("=========================");
        for (int i = 0; i < arrayGuess.size(); i++) {
            if (arrayGuess.get(i) == arrayNumInput.get(i)) {
                System.out.print(" Fija ");
            } else if (arrayGuess.contains(arrayNumInput.get(i))) {
                System.out.print(" Pica ");
            } else {
                System.out.print(" "+arrayNumInput.get(i)+" ");
            }
        }
    }
}
