//Realiza un programa que diga si un n´umero introducido por teclado es par y/o divisible entre 5.

import java.util.Scanner;

public class Ej_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        if (num % 2 == 0) System.out.println("El número es par.");
        if (num % 5 == 0) System.out.println("El número es divisible entre 5.");
        if (num % 2 != 0 && num % 5 != 0) System.out.println("El número no es par ni divisible entre 5.");
    }
}
