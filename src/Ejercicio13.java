/*
Hacer un algoritmo que permita determinar cuánto tiempo tarda en llenarse una Jarra.
Tomando en cuenta que la jarra tiene una capacidad de 1000 cc.
Cada segundo la Jarra recibe 7 cc y cada cinco segundos la Jarra pierde el 5% de su contenido.
*/


public class Ejercicio13 {
    public static void main(String[] args) {
        int capacidad = 100;
        int ccRecibidos = 7;
        double ccPerdidos = 0.05;
        int tiempo = 0;
        int cc = 0;
        while (cc < capacidad) {
            cc += ccRecibidos;
            tiempo++;
            if (tiempo % 5 == 0) {
                cc -= (cc * ccPerdidos);
            }
        }
        System.out.println("La jarra se llenó en " + tiempo + " segundos.");
    }
}