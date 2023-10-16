/*
Realice un Programa, Digitado 5 Ventas en el Almacén XYZ Calcular:
• ¿Cuántas ventas Fueron Mayores 1.000.000?
• ¿El Promedio de las Ventas?
• ¿Cuál Fue la Mayor Venta?
• ¿Cuál Fue la Menor Venta?
*/

import java.util.Scanner;
import java.util.ArrayList;

class Ejercicio3 {
    static ArrayList<Integer> ventas = new ArrayList<Integer>();
    static ArrayList<Integer> ventasMayores1M = new ArrayList<Integer>();
    
    public static ArrayList<Integer> setVentas() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el valor de la venta " + (i + 1) + ":");
            ventas.add(input.nextInt());
        }
        input.close();
        return ventas;
    }

    public static ArrayList<Integer> ventasMayores1M() {
        for (int i = 0; i < ventas.size(); i++) {
            if (ventas.get(i) > 1000000) {
                ventasMayores1M.add(ventas.get(i));
            }
        }
        return ventasMayores1M;
    }

    public static Integer promedioVentas() {
        Integer suma = 0;
        for (int i = 0; i < ventas.size(); i++) {
            suma += ventas.get(i);
        }
        return suma / ventas.size();
    }

    public static Integer mayorVenta() {
        Integer mayor = 0;
        for (int i = 0; i < ventas.size(); i++) {
            if (ventas.get(i) > mayor) {
                mayor = ventas.get(i);
            }
        }
        return mayor;
    }

    public static Integer menorVenta() {
        Integer menor = ventas.get(0);
        for (int i = 1; i < ventas.size(); i++) {
            if (ventas.get(i) < menor) {
                menor = ventas.get(i);
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        setVentas();
        System.out.println("=====================================");
        System.out.println("Ventas mayores a 1.000.000: " + ventasMayores1M());
        System.out.println("=====================================");
        System.out.println("Promedio de ventas: " + promedioVentas());
        System.out.println("=====================================");
        System.out.println("Mayor venta: " + mayorVenta());
        System.out.println("=====================================");
        System.out.println("Menor venta: " + menorVenta());
    }
}
