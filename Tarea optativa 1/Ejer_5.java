//Escribe un programa que calcule el área de un rectángulo.

import java.util.Scanner;

public class Ejer_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULAR EL ÁREA DE UN RECTÁNGULO");
        System.out.print("Ingresa la base: ");
        int base = sc.nextInt();
        System.out.print("Ingresa la altura: ");
        int altura = sc.nextInt();

        int area = base*altura;
        System.out.println("El área del rectángulo es de: "+area+"cm²");
    }
}
