// Escribe un programa que calcule el volumen de un cono según la fórmula: V=1/3πr2h

import java.util.Scanner;

public class Ejer_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radio del cono: ");
        float r = sc.nextFloat();
        System.out.print("Altura del cono: ");
        float h = sc.nextFloat();

        float volumen = (float)(Math.PI * r * r * h) / 3;

        System.out.println("El volumen del cono es: " + volumen);
    }
}
