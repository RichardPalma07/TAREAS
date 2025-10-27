// Realiza un programa que calcule el tiempo que tardar´a en caer un objeto desde una altura
// h.

import java.util.Scanner;

public class Ej_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura (m): ");
        double h = sc.nextDouble();

        double g = 9.81;
        double t = Math.sqrt((2 * h) / g);

        System.out.println("El objeto tarda " + t + " segundos en caer.");
    }
}
