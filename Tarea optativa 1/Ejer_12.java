// Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la
// asignatura Programación para obtener la media deseada. Hay que tener en cuenta que la
// nota del primer examen cuenta el 40% y la del segundo examen un 60%

import java.util.Scanner;

public class Ejer_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota del primer examen: ");
        float nota1 = sc.nextFloat();
        System.out.print("Media deseada: ");
        float media = sc.nextFloat();

        float nota2 = (float)(media - (nota1 * 0.4)) / 0.6f;

        System.out.println("Para obtener una media de " + media + " necesitas sacar " + nota2 + " en el segundo examen.");
    }
}
