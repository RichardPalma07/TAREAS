//Realiza un programa que calcule la media de tres notas.

import java.util.Scanner;

public class Ej_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primera nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.print("Tercera nota: ");
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3) / 3;
        System.out.println("La media es: " + media);
    }
}
