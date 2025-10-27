//Escribe un programa que diga cu´al es la ´ultima cifra de un n´umero entero introducido por
// teclado.

import java.util.Scanner;

public class Ej_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();
        int ultima = Math.abs(num % 10);
        System.out.println("La última cifra es: " + ultima);
    }
}
