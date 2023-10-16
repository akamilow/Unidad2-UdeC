/*
Convertir cuantas horas, minutos y segundos hay en N minutos digitados Ejemplo:140 minutos son 2 Horas,20 minutos, 0 segundos
*/

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese los minutos: ");
        Integer minutos = input.nextInt();
        Integer horas = minutos / 60;
        Integer minutosRestantes = minutos % 60;
        input.close();
        System.out.println(minutos + " minutos son " + horas + " horas, " + minutosRestantes + " minutos, 0 segundos");
    }
}