//Escribe un programa que calcule el área de un triángulo.

import java.util.Scanner;

public class Ejer_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULAR EL ÁREA DE UN TRIÁNGULO");
        System.out.print("Ingresa la base: ");
        int base = sc.nextInt();
        System.out.print("Ingresa la altura: ");
        int altura = sc.nextInt();

        int area = (base*altura)/2;
        System.out.println("El área del triángulo es de: "+area+"cm²");
    }
}
