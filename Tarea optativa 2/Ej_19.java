// Realiza un programa que nos diga cu´antos d´ıgitos tiene un n´umero entero que puede ser
// positivo o negativo. Se permiten n´umeros de hasta 5 d´ıgitos

import java.util.Scanner;

public class Ej_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número (puede ser negativo, hasta 5 cifras): ");
        int num = Math.abs(sc.nextInt());

        int digitos = String.valueOf(num).length();
        System.out.println("El número tiene " + digitos + " dígitos.");
    }
}
