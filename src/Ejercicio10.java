/*
Crear un algoritmo para calcular los salarios semanales de unos empleados a los que se les paga $15.000 por hora si éstas no superan las 35 horas. 
Cada hora por encima de 35 se considerará extra y se paga a $27.000. 
El programa pide las horas del trabajador y devuelve el salario que se le debe pagar. 
Además el programa debe preguntar si deseamos calcular otro salario, si es así el programa se vuelve a repetir.
*/
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int horas;
        double salario;
        char respuesta = 's';
        
        while (respuesta == 's') {
            System.out.print("Introduzca las horas trabajadas: ");
            horas = input.nextInt();
            
            if (horas <= 35) {
                salario = horas * 15000;
            } else {
                salario = 35 * 15000 + (horas - 35) * 27000;
            }
            
            System.out.println("El salario es: " + salario);
            
            System.out.print("¿Desea calcular otro salario? (s/n): ");
            respuesta = input.next().charAt(0);
        }

        input.close();
    }    
}
