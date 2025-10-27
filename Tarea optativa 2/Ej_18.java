//Escribe un programa que diga cu´al es la primera cifra de un n´umero entero introducido por
// teclado. Se permiten n´umeros de hasta 5 cifras.

import java.util.Scanner;

public class Ej_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número (hasta 5 cifras): ");
        int num = Math.abs(sc.nextInt());

        while (num >= 10) {
            num /= 10;
        }

        System.out.println("La primera cifra es: " + num);
    }
}
