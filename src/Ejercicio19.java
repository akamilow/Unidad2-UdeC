/*
Realizar un programa que imprima la sumatoria de los N términos de la serie (11+22+33+44+55+…)
*/
public class Ejercicio19 {
    public static void main(String[] args) {
        int sumatoria = 0;
        for (int i = 1; i <= 10; i++) {
            sumatoria += i * 11;
        }
        System.out.println("La sumatoria de los 10 primeros términos de la serie (11+22+33+44+55+...) es: " + sumatoria);
    }
}
