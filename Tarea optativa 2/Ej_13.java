//Escribe un programa que ordene tres n´umeros enteros introducidos por teclado

import java.util.Scanner;
import java.util.Arrays;

public class Ej_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros);
        System.out.println("Números ordenados: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
    }
}
