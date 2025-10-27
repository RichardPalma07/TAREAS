// Amplía el programa anterior para que diga la nota del bolet´ın (insuficiente, suficiente, bien,
// notable o sobresaliente)

import java.util.Scanner;

public class Ej_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primera nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.print("Tercera nota: ");
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3) / 3;
        System.out.println("Media: " + media);

        if (media < 5) {
            System.out.println("Insuficiente");
        } else if (media < 6) {
            System.out.println("Suficiente");
        } else if (media < 7) {
            System.out.println("Bien");
        } else if (media < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
    }
}
