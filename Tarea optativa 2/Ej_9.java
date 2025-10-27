//Realiza un programa que resuelva una ecuaci´on de segundo grado (del tipo ax2+bx+c = 0)

import java.util.Scanner;

public class Ej_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce a: ");
        double a = sc.nextDouble();
        System.out.print("Introduce b: ");
        double b = sc.nextDouble();
        System.out.print("Introduce c: ");
        double c = sc.nextDouble();

        double discriminante = b * b - 4 * a * c;

        if (discriminante < 0) {
            System.out.println("No existen soluciones reales.");
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Solución 1: " + x1);
            System.out.println("Solución 2: " + x2);
        }
    }
}
