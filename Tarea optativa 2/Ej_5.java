//Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0).

import java.util.Scanner;

public class Ej_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce a: ");
        double a = sc.nextDouble();
        System.out.print("Introduce b: ");
        double b = sc.nextDouble();

        if (a == 0) {
            System.out.println("La ecuación no tiene solución o tiene infinitas soluciones.");
        } else {
            double x = -b / a;
            System.out.println("La solución es x = " + x);
        }
    }
}
