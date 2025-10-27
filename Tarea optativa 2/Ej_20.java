// Realiza un programa que diga si un n´umero entero positivo introducido por teclado es capic´ua.
// Se permiten n´umeros de hasta 5 cifras

import java.util.Scanner;

public class Ej_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número positivo (hasta 5 cifras): ");
        int num = sc.nextInt();

        String s = String.valueOf(num);
        String invertido = new StringBuilder(s).reverse().toString();

        if (s.equals(invertido))
            System.out.println("El número es capicúa.");
        else
            System.out.println("El número no es capicúa.");
    }
}
